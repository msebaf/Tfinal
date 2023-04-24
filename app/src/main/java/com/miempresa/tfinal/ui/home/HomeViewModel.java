package com.miempresa.tfinal.ui.home;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.miempresa.tfinal.ui.home.Modelo.Tarea;

import java.util.ArrayList;

public class HomeViewModel extends AndroidViewModel {





    public static MutableLiveData<String> nuevaTarea;


    public HomeViewModel(@NonNull Application application) {
        super(application);


    }

    public static void setTarea(String tarea){
        nuevaTarea.setValue(tarea);
    }
    public LiveData<String> getTarea() {
        if (nuevaTarea == null) {

            this.nuevaTarea = new MutableLiveData<>();

        }
        return nuevaTarea;
    }

}