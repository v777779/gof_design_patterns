package com.example.gofp.binding;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.databinding.BindingAdapter;

import com.example.gofp.R;

import java.util.HashMap;
import java.util.Map;

public class BindingAdapters {

    private static Map<String, Map<String, String>> patterns;

    @BindingAdapter("text")  // attribute app
    public static void fromStringArray(View view, String s) {
        String pattern = pattern(view.getContext(), s);
        if (pattern == null) {
            return;
        }
        if (view instanceof TextView) {
            ((TextView) view).setText(pattern);
        }
        if (view instanceof Button) {
            ((Button) view).setText(pattern);
        }
    }

    private static String pattern(Context context, String s) {
        if (s == null) {
            return null;
        }
        patterns = patterns(context);
        String[] ss = s.split("/");
        if (ss.length < 2) {
            return null;
        }
        Map<String, String> map = patterns.get(ss[0]);
        if (map == null) {
            return null;
        }
        return map.get(ss[1]);
    }

    private static Map<String, String> patterns(Context context, int keysId, int valuesId) {
        Map<String, String> temp = new HashMap<>();
        String[] keys = context.getResources().getStringArray(keysId);
        String[] values = context.getResources().getStringArray(valuesId);
        for (int i = 0; i < keys.length; i++) {
            temp.put(keys[i], values[i]);
        }
        return temp;
    }

    private static Map<String, Map<String, String>> patterns(Context context) {
        if (patterns != null) {
            return patterns;
        }
        patterns = new HashMap<>();
        String[] ss = context.getResources().getStringArray(R.array.map_keys);
        patterns.put(ss[0], patterns(context, R.array.patterns_keys, R.array.patterns));
        patterns.put(ss[1], patterns(context, R.array.creational_keys, R.array.creational));
        patterns.put(ss[2], patterns(context, R.array.structural_keys, R.array.structural));
        patterns.put(ss[3], patterns(context, R.array.behavioral_keys, R.array.behavioral));
        return patterns;
    }

    public static String getParent(String pattern) {
        if (patterns == null) {
            return null;
        }
        String parent = null;
        for (String key : patterns.keySet()) {
            Map<String, String> map = patterns.get(key);
            if (map == null) {
                continue;
            }
            parent = key;
            for (String value : map.values()) {
                if (pattern.equals(value)) {
                    return parent;
                }
            }
        }
        return null;
    }
}
