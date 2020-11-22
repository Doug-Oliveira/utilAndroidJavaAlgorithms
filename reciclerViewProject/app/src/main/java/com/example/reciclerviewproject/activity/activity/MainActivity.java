package com.example.reciclerviewproject.activity.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.LinearLayout;

import com.example.reciclerviewproject.R;
import com.example.reciclerviewproject.activity.adapter.Madapter;
import com.example.reciclerviewproject.activity.model.Filme;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<Filme> listFilmes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        //listando os filmes
        this.criarFilmes();

        //configurando adapter
        Madapter madapter = new Madapter(listFilmes);

        //configurar RecyclerView
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        recyclerView.setAdapter(madapter);

        //evento de click


    }

    public void criarFilmes() {

        Filme filme = new Filme("Homem-Aranha", "Aventura", "2020");
        this.listFilmes.add(filme);
        filme = new Filme("Jogos Mortais", "Suspense/Terror", "2015");
        this.listFilmes.add(filme);
        filme = new Filme("Harry Potter e a Camara Secreta", "Fantasia", "2007");
        this.listFilmes.add(filme);
        filme = new Filme("Carros 3", "Animação", "2018");
        this.listFilmes.add(filme);
        filme = new Filme("Toy Story", "Animção", "2011");
        this.listFilmes.add(filme);
        filme = new Filme("Duro de Matar", "Ação", "2009");
        this.listFilmes.add(filme);
        filme = new Filme("Gente Grande", "Comédia", "2012");
        this.listFilmes.add(filme);

    }


}