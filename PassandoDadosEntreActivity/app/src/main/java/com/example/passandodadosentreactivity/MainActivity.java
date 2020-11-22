package com.example.passandodadosentreactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    private Button btnEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnEnviar = findViewById(R.id.btnEnviar);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);

                Usuario usuario = new Usuario("Douglas", "douglas.oliveira@gmail.com");
                //Passar dados
                intent.putExtra("Nome","Douglas Oliveira");
                intent.putExtra("idade", "20");

                intent.putExtra("objeto", usuario);

                startActivity(intent);
            }
        });
    }
}