package com.example.gofp.fragments;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.example.gofp.R;
import com.example.gofp.binding.BasePattern;
import com.example.gofp.binding.Systems;

import java.lang.reflect.Constructor;
import java.util.Objects;

public class PatternViewModel extends ViewModel {
    private static final String TAG = "PluralViewModel";

    private MutableLiveData<String> title;
    private MutableLiveData<String> label;
    private MutableLiveData<String> body;
    private String patternName;
    private String className;
    private String classNameBefore;


    public PatternViewModel() {
        title = new MutableLiveData<>("");
        label = new MutableLiveData<>("");
        body = new MutableLiveData<>("");
    }

    public LiveData<String> getBody() {
        return body;
    }

    public LiveData<String> getTitle() {
        return title;
    }

    public LiveData<String> getLabel() {
        return label;
    }

    public void setArgs(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        PatternFragmentArgs args = PatternFragmentArgs.fromBundle(bundle);
        this.className = args.getClassName();
        this.classNameBefore = args.getClassNameBefore();
        this.patternName = args.getPatternName();
        clearBody();

    }

    public void clearBody(){
        this.body.setValue("");
    }

    public void setPackage(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        PatternFragmentArgs args = PatternFragmentArgs.fromBundle(bundle);
        this.patternName = args.getPatternName();
    }

    public void setTitle(Context context) {
        if (context == null || TextUtils.isEmpty(patternName)) {
            return;
        }
        title.setValue(context.getString(R.string.format_title, patternName));
    }


    public void setLabel(Context context) {
        if (context == null || TextUtils.isEmpty(patternName)) {
            return;
        }
        label.setValue(context.getString(R.string.format_label, patternName));
    }

    public void setLabelBefore(Context context) {
        if (context == null || TextUtils.isEmpty(patternName)) {
            return;
        }
        label.setValue(context.getString(R.string.format_label_before, patternName));
    }



    public void onBack(View view) {
        NavController navController = Navigation.findNavController(view);
        navController.popBackStack();
    }

    public void onBefore(View view) {
        setLabelBefore(view.getContext());
        clearBody();
        execute(true);
    }

    public void onStart(View view) {
        setLabel(view.getContext());
        clearBody();
        execute(false);
    }

    /**
     * Executes Pattern writes log to Systems.out and show log to TextView body
     * Start is implementation pattern, pkg is "com.example.gofp.plural.<pattern>.sol.<Pattern>
     * Before is implementation w/o pattern in "com.example.gofp.plural.<pattern>.sol.<Pattern>
     */
    private void execute(boolean isBefore) {
        String className = isBefore ? this.classNameBefore : this.className;
        if (className == null) {
            return;
        }

        try {
            Class<?> c = Class.forName(className);
            Constructor<?> ctor = c.getConstructor();
            Object object = ctor.newInstance();

            if (!(object instanceof BasePattern)) {
                return;
            }
            BasePattern pattern = (BasePattern) object;
            Systems.out.init();
            pattern.main();
            body.setValue(Systems.out.read());

            pattern.main(body); // with time delay

        } catch (Exception e) {
            Log.d(TAG, Objects.requireNonNull(e.getMessage()));
        }
    }


}
