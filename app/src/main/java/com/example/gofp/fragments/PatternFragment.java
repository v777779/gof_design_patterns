package com.example.gofp.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.gofp.databinding.FragmentPatternBinding;

public class PatternFragment extends Fragment {


    private FragmentPatternBinding binding;
    private PatternViewModel viewModel;
    private String name;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentPatternBinding.inflate(inflater,container,false);
        viewModel = new ViewModelProvider(requireActivity()).get(PatternViewModel.class);
        viewModel.setArgs(getArguments());
        binding.setViewModel(viewModel);
        binding.setLifecycleOwner(getViewLifecycleOwner()); // for fragment exclusively
        return binding.getRoot();
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        viewModel.setTitle(requireContext());
        viewModel.setLabel(requireContext());
    }
}
