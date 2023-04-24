package com.miempresa.tfinal.ui.gallery;

import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.miempresa.tfinal.databinding.FragmentGalleryBinding;
import com.miempresa.tfinal.ui.home.HomeViewModel;

public class GalleryFragment extends Fragment {

    private FragmentGalleryBinding binding;
    private GalleryViewModel gvm;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        GalleryViewModel galleryViewModel =
                new ViewModelProvider(this).get(GalleryViewModel.class);

        binding = FragmentGalleryBinding.inflate(inflater, container, false);
        gvm = new ViewModelProvider.AndroidViewModelFactory(requireActivity().getApplication())
                .create(GalleryViewModel.class);
        View root = binding.getRoot();
       binding.btAgregar.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               gvm.agregarTarea(binding.etTarea.getText().toString());
           }
       });

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}