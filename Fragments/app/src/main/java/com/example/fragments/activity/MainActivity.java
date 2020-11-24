package com.example.fragments.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.fragments.R;
import com.example.fragments.fragment.ContatosFragment;
import com.example.fragments.fragment.ConversasFragment;

public class MainActivity extends AppCompatActivity {

    private Button btnConversas, btnContatos;
    private ConversasFragment conversasFragment;
    private ContatosFragment contatosFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnContatos = findViewById(R.id.btnContatos);
        btnConversas = findViewById(R.id.btnConversas);


        //remover sombra do Action bar
        getSupportActionBar().setElevation(0);

        conversasFragment = new ConversasFragment();

        //Configurar objeto para o frangment
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

        //utilizar no add o Int "ContainerViewId, Fragment."
        //replace ira trocar o fragment
        transaction.replace(R.id.frameConteudo, conversasFragment);
        transaction.commit();

        btnContatos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                contatosFragment = new ContatosFragment();

                FragmentTransaction transaction1 = getSupportFragmentManager().beginTransaction();
                transaction1.replace(R.id.frameConteudo, contatosFragment);
                transaction1.commit();
            }
        });

        btnConversas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                conversasFragment = new ConversasFragment();

                FragmentTransaction transaction1 = getSupportFragmentManager().beginTransaction();
                transaction1.replace(R.id.frameConteudo,conversasFragment);
                transaction1.commit();
            }
        });
    }
}