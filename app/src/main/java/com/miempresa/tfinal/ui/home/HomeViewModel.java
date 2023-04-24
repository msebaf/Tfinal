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

    private ArrayList<Tarea> tareas = new ArrayList<>();


    public HomeViewModel(@NonNull Application application) {
        super(application);

     tareas.add(new Tarea("tarea 1", "lalalalal"));
     tareas.add(new Tarea("Tarea 2", "lolololo"));
    }
    public ArrayList<Tarea> getPeliculas(){
        return tareas;
    }

}