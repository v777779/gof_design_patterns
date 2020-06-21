package com.example.gofp.fragments;

import android.view.View;
import android.widget.Button;

import androidx.lifecycle.ViewModel;
import androidx.navigation.Navigation;

public class GofViewModel extends ViewModel {

    public void onClicked(View view) {
        if (view == null) {
            return;
        }
        String patternPackage = packageName();
        String patternGroup = groupName(view);
        if (patternPackage == null || patternGroup == null) {
            return;
        }

        String toolbar = PluralViewModel.getPattern(patternGroup,false,true);
        GofFragmentDirections.ActionPlural action =
                GofFragmentDirections.actionPlural(patternPackage, patternGroup, toolbar);
        Navigation.findNavController(view).navigate(action);

    }


    private String packageName() {
        Package pkg = getClass().getPackage();
        if (pkg == null) {
            return null;
        }
        return pkg.getName();
    }

    private String groupName(View view) {
        if (view == null || ((Button) view).getText() == null) {
            return null;
        }
        return ((Button) view).getText().toString().toLowerCase();
    }
}
