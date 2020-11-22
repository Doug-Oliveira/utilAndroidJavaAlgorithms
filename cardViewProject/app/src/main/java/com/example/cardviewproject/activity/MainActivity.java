package com.example.cardviewproject.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.cardviewproject.R;
import com.example.cardviewproject.adapter.PostagemAdapter;
import com.example.cardviewproject.model.Postagem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerViewPostagem;
    private List<Postagem> postagens = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewPostagem = findViewById(R.id.recyclerViewPostagem);

        //Define layout
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        //layoutManager.setOrientation(LinearLayout.HORIZONTAL); coloca a list de postagens pro lado
        recyclerViewPostagem.setLayoutManager(layoutManager);

        prepararPostagem();

        //Define adapter
        PostagemAdapter adapter = new PostagemAdapter(postagens);
        recyclerViewPostagem.setAdapter(adapter);

        //recyclerViewPostagem.setAdapter();

    }

    public void prepararPostagem() {

        Postagem p = new Postagem("Douglas Oliveira", "Foda demais!", R.drawable.ic_launcher_background);
        this.postagens.add(p);
        Postagem p = new Postagem("Douglas Oliveira", "Foda demais!", R.drawable.ic_launcher_background);
        this.postagens.add(p);
        Postagem p = new Postagem("Douglas Oliveira", "Foda demais!", R.drawable.ic_launcher_background);
        this.postagens.add(p);
        Postagem p = new Postagem("Douglas Oliveira", "Foda demais!", R.drawable.ic_launcher_background);
        this.postagens.add(p);


    }
}