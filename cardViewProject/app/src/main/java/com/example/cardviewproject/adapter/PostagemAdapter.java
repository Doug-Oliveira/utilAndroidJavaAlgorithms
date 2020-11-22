package com.example.cardviewproject.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cardviewproject.R;
import com.example.cardviewproject.model.Postagem;

import java.util.List;

public class PostagemAdapter extends RecyclerView.Adapter<PostagemAdapter.myViewHolder> {

    private List<Postagem> postagens;

    public PostagemAdapter(List<Postagem> listaPostagens) {
        this.postagens = listaPostagens;
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemLista = LayoutInflater.from(parent.getContext()).inflate(R.layout.postagem_detalhe, parent, false);

        return new myViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {

        Postagem postagem = postagens.get(position);

        holder.txtNome.setText(postagem.getNome());
        holder.txtPostagem.setText(postagem.getPostagem());
        holder.imgImagem.setImageResource(postagem.getImagem());
    }

    @Override
    public int getItemCount() {
        return postagens.size();
    }

    public class myViewHolder extends RecyclerView.ViewHolder {

        private TextView txtNome;
        private TextView txtPostagem;
        private ImageView imgImagem;

        public myViewHolder(@NonNull View itemView) {
            super(itemView);
            txtNome = itemView.findViewById(R.id.txtNome);
            txtPostagem = itemView.findViewById(R.id.txtPostagem);
            imgImagem = itemView.findViewById(R.id.imgPostagem);

        }
    }
}
