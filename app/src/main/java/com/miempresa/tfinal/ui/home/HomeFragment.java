package com.miempresa.tfinal.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.miempresa.tfinal.databinding.FragmentHomeBinding;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;
    private HomeViewModel hvm;

    public static ArrayList<String> tareas = new ArrayList<>();



     public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                Bundle savedInstanceState) {


         binding = FragmentHomeBinding.inflate(inflater, container, false);
         hvm = new ViewModelProvider.AndroidViewModelFactory(requireActivity().getApplication())
                 .create(HomeViewModel.class);


        RecyclerView rv = binding.rvTareas;

        hvm.getTarea().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                tareas.add(s);
            }
        });


        GridLayoutManager grilla = new GridLayoutManager(requireContext(), 1, GridLayoutManager.VERTICAL, false);
         rv.setLayoutManager(grilla);

        HomeFragmentAdapter adapter = new HomeFragmentAdapter(requireContext(), tareas, getLayoutInflater());
        rv.setAdapter(adapter);

         return binding.getRoot();
    }
}