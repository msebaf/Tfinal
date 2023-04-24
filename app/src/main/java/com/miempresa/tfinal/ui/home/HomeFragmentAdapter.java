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
    private List<Tarea> tareasA;

    private LayoutInflater inf;



    public HomeFragmentAdapter(Context context, List<String> tareas, LayoutInflater inf) {
        if(tareas == null){
            this.tareasA.add(new Tarea("Tu Lista de Tareas"));
        }
        else{

            for(int i=0 ; i<tareas.size();i++){
                this.tareasA.add(new Tarea(tareas.get(i)));
            }
        }
        this.context = context;

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
        holder.descripcion.setText(tareasA.get(position).getDescripcion());




    }

    @Override
    public int getItemCount() {
        if(tareasA!=null){
        return tareasA.size();
    }
        return 0;
    }


    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView titulo, descripcion;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);


            descripcion= itemView.findViewById(R.id.tvDescripcion);


        }
    }
}
