package com.example.rockpaperscissorsshotgame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selecionadoPedra(View view) {
        this.opcaoSelecionada("pedra");
    }

    public void selecionadoPapel(View view) {
        this.opcaoSelecionada("papel");
    }

    public void selecionadoTesoura(View view) {
        this.opcaoSelecionada("tesoura");
    }

    public void opcaoSelecionada(String opcaoSelecionada) {

        ImageView imageResult = findViewById(R.id.imageResult);
        TextView textResult = findViewById(R.id.result);

        int numero = new Random().nextInt(3);
        String[] opcoes = {"pedra", "papel", "tesoura"};
        String escolhaApp = opcoes[numero];

        switch (escolhaApp) {
            case "pedra":
                imageResult.setImageResource(R.drawable.pedra);
                break;

            case "papel":
                imageResult.setImageResource(R.drawable.papel);
                break;

            case "tesoura":
                imageResult.setImageResource(R.drawable.tesoura);
                break;
        }
        //app win
        if ((escolhaApp == "tesoura" && opcaoSelecionada == "papel") ||
                (escolhaApp == "pedra" && opcaoSelecionada == "tesoura") ||
                (escolhaApp == "papel" && opcaoSelecionada == "pedra")) {

            textResult.setText("Você perdeu :( ");

        }//user win
        else if ((opcaoSelecionada == "tesoura" && escolhaApp == "papel") ||
                (opcaoSelecionada == "pedra" && escolhaApp == "tesoura") ||
                (opcaoSelecionada == "papel" && escolhaApp == "pedra")) {

            textResult.setText("Você ganhou :) ");

        } else {
            textResult.setText("Empate ;) ");
        }
    }


}