package com.example.gofp.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.gofp.databinding.FragmentPluralBinding;

public class PluralFragment extends Fragment {

    private FragmentPluralBinding binding;
    private PluralViewModel viewModel;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentPluralBinding.inflate(inflater, container, false);
        viewModel = new ViewModelProvider(requireActivity()).get(PluralViewModel.class);
        viewModel.setArgs(getArguments());
        binding.setViewModel(viewModel);
        return binding.getRoot();
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


    }
}
