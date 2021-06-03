package com.example.simslegacychallenge.ui.skillsaspirs;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.simslegacychallenge.R;

public class SkillsAspirFragment extends Fragment {

    private SkillsAspirViewModel mViewModel;

    public static SkillsAspirFragment newInstance() {
        return new SkillsAspirFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.skills_aspir_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(SkillsAspirViewModel.class);
        // TODO: Use the ViewModel
    }

}