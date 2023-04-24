package com.miempresa.tfinal.ui.gallery;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.miempresa.tfinal.ui.home.HomeFragment;
import com.miempresa.tfinal.ui.home.HomeViewModel;

public class GalleryViewModel extends ViewModel {

    private final MutableLiveData<String> mText;


    public GalleryViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is gallery fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }

    public void agregarTarea(String tarea){
        HomeViewModel.setTarea(tarea);
    }
}