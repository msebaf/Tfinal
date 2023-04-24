package com.miempresa.tfinal.ui.home;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.miempresa.tfinal.R;
import com.miempresa.tfinal.ui.home.Modelo.Tarea;

import java.util.List;

public class HomeFragmentAdapter extends RecyclerView.Adapter<HomeFragmentAdapter.ViewHolder> {

    private Context context;
    private List<Tarea> tareas;
    private LayoutInflater inf;



    public HomeFragmentAdapter(Context context, List<Tarea> tareas, LayoutInflater inf) {
        this.context = context;
        this.tareas = tareas;
        this.inf = inf;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View root = inf.inflate(R.layout.tarea_card ,parent,false);
        return new ViewHolder(root);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.descripcion.setText(tareas.get(position).getDescripcion());
        holder.titulo.setText(tareas.get(position).getTitulo());



    }

    @Override
    public int getItemCount() {
        return tareas.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView titulo, descripcion;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            titulo= itemView.findViewById(R.id.tvTitulo);
            descripcion= itemView.findViewById(R.id.tvDescripcion);


        }
    }
}
