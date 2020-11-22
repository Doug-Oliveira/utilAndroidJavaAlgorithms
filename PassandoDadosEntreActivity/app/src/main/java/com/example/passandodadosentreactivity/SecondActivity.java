package com.example.passandodadosentreactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView txtNome;
    private TextView txtNumero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        txtNome = findViewById(R.id.txtNome);
        txtNumero = findViewById(R.id.txtNumero);

        txtNome.setOnClickListener(new View.);
        //Recuperar dados
        Bundle data = getIntent().getExtras();
        String nome = data.getString("Nome");
        int idade = data.getInt("idade");

        Usuario usuario = (Usuario) data.getSerializable("objeto");

        //Configurar valores recuperados
        txtNome.setText(usuario.getEmail());

        txtNome.setText(nome);
        txtNumero.setText(String.valueOf(idade));
    }
}