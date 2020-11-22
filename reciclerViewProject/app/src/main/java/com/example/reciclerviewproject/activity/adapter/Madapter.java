package com.example.reciclerviewproject.activity.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.reciclerviewproject.R;
import com.example.reciclerviewproject.activity.model.Filme;

import java.util.List;

public class Madapter extends RecyclerView.Adapter<Madapter.myViewHolder> {

    private List<Filme> listaFilmes;

    public Madapter(List<Filme> lista) {
        this.listaFilmes = lista;
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        //onCreateViewHolder criar a visualizacao
        //convertendo o adapter para um tipo view
        View itemList = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_lista, parent, false);

        return new myViewHolder(itemList);
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {

        Filme filme = listaFilmes.get(position);

        //exibi os itens
        holder.txtTitulo.setText(filme.getTituloFilme());
        holder.txtGenero.setText(filme.getGenero());
        holder.txtAno.setText(filme.getAno());
    }

    @Override
    public int getItemCount() {
        //retorna a quantidade de itens que vão ser exibidos

        return listaFilmes.size();
    }

    public class myViewHolder extends RecyclerView.ViewHolder {

        TextView txtTitulo;
        TextView txtAno;
        TextView txtGenero;

        public myViewHolder(@NonNull View itemView) {

            super(itemView);

            txtTitulo = itemView.findViewById(R.id.txtTitulo);
            txtAno = itemView.findViewById(R.id.txtAno);
            txtGenero =  itemView.findViewById(R.id.txtGenero);

        }
    }

}
