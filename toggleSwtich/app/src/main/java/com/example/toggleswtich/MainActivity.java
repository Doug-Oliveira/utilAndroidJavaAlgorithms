package com.example.toggleswtich;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private ToggleButton toggleButton;
    private Switch switchSenha;
    private TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toggleButton = findViewById(R.id.toggleButton);
        switchSenha  = findViewById(R.id.switchSenha);
        txtResultado = findViewById(R.id.txtResultado);


    }

    public void addListener(){
        switchSenha.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (switchSenha.isChecked()) {
                    txtResultado.setText("Ativado.");
                } else {
                    txtResultado.setText("Desligado.");
                }
            }
        });
    }

    public void enviar(View view) {
        if (switchSenha.isChecked()) {
            txtResultado.setText("Botão Switch Ativado.");
        } else {
            txtResultado.setText("Botão Switch Desligado.");
        }
    }
}