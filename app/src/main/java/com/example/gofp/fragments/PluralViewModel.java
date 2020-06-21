package com.example.gofp.fragments;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.lifecycle.ViewModel;
import androidx.navigation.Navigation;

import com.example.gofp.binding.BindingAdapters;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PluralViewModel extends ViewModel {
    private static final String TAG = "PluralViewModel";
    private static final String SUFFIX_SOL = "sol";
    private static final String SUFFIX_PRE = "pre";

    private String patternPackage;
    private String patternGroup;
    private String patternName;

    public void setArgs(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        PluralFragmentArgs args = PluralFragmentArgs.fromBundle(bundle);
        this.patternPackage = args.getPatternPackage().replaceAll(".fragments", "");
        this.patternGroup = args.getPatternGroup().replaceAll("\\s", "_");
    }

    public void onClick(View view) {
        try {
            patternName = patternName(view);
            if (patternName == null || patternPackage == null || patternGroup == null) {
                return;
            }
            String className = getClassName(SUFFIX_SOL);
            String classNameBefore = getClassName(SUFFIX_PRE);
            String patternName = getPattern(this.patternName, false, true);
            String toolbar = "Pattern " + patternName;
            if (className == null || classNameBefore == null || patternName == null) {
                return;
            }
            PluralFragmentDirections.ActionPattern action =
                    PluralFragmentDirections.actionPattern(className, classNameBefore, patternName, toolbar);
            Navigation.findNavController(view)
                    .navigate(action);
        } catch (Exception e) {
            Log.d(TAG, Objects.requireNonNull(e.getMessage()));
        }
    }

    private String patternName(View view) {
        if (view == null || ((Button) view).getText() == null) {
            return null;
        }
        return ((Button) view).getText().toString();
    }

// pattern

    private String getClassName(String suffix) {
        String parent = BindingAdapters.getParent(patternName);
        if (parent == null || patternPackage == null || patternGroup == null) {
            return null;
        }
        String packageName = getPattern(patternName, true, false);
        String className = getPattern(patternName, false, false);

        return patternPackage + "." + patternGroup + "." + suffix + "." + parent.toLowerCase() + "."
                + packageName + "." + className;

    }

    public static String getPattern(String patternName, boolean isPackage, boolean isLabel) {
        int length = patternName.replaceAll("\\S", "").length();
        if (length == 0) {
            return getPatternShort(patternName, isPackage);
        } else {
            for (int i = 0; i < length - 1; i++) {   // repeated processing one by one
                patternName = getPatternShort(patternName, isPackage, isLabel);
            }
            return getPatternShort(patternName, isPackage, isLabel);
        }
    }

    private static String getPatternShort(String patternName, boolean isPackage) {
        if (isPackage) {
            return patternName.toLowerCase();
        } else {
            return patternName.substring(0, 1).toUpperCase()
                    + patternName.substring(1).toLowerCase();
        }
    }

    private static String getPatternShort(String patternName, boolean isPackage, boolean isLabel) {
        String regex = "(.*)(\\s\\w)(.*)";
        Matcher m = Pattern.compile(regex).matcher(patternName);
        StringBuffer sb = new StringBuffer();
        while (m.find()) {
            if (m.groupCount() < 3) {
                return null;
            }
            String m1 = m.group(1);
            String m2 = m.group(2);
            String m3 = m.group(3);
            if (m1 == null || m2 == null || m3 == null) {
                return null;
            }

            if (isPackage) {
                m.appendReplacement(sb, m1.toLowerCase()
                        + m2.toLowerCase().replaceAll("\\s", "_") + m3.toLowerCase());
            } else {
                if (!isLabel) {
                    m.appendReplacement(sb, m1.substring(0, 1).toUpperCase()
                            + m1.substring(1).toLowerCase()
                            + m2.replaceAll("\\s", "").toUpperCase() + m3);
                } else {
                    m.appendReplacement(sb, m1.substring(0, 1).toUpperCase()
                            + m1.substring(1).toLowerCase()
                            + m2.toUpperCase() + m3);
                }
            }
        }
        return sb.toString();

    }


}
