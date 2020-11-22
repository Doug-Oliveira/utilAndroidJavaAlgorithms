package com.example.alinhamentos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarNovaFrase(View view){
        String[] frases = {"Douglas","Yasmim","Carla","Fabricio"};

        int numero = new Random().nextInt(bond);

        TextView text = findViewById(R.id.textPage);
        text.setText(frases[numero]);

    }


}