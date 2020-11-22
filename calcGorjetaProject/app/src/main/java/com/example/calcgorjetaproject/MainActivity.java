package com.example.calcgorjetaproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText editValor;
    private TextView txtPorcent;
    private TextView txtGorjeta;
    private TextView txtTotal;
    private SeekBar seekBar;

    private double porcentagem = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editValor = findViewById(R.id.editValor);
        txtPorcent = findViewById(R.id.txtPorcent);
        txtGorjeta = findViewById(R.id.txtGorjeta);
        txtTotal = findViewById(R.id.txtTotal);
        seekBar = findViewById(R.id.seekBar);

        //add listener seekBar
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                porcentagem = progress;
                txtPorcent.setText(Math.round(porcentagem )+ "%");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

    public void calcular(View view) {

        String valorRecuperado = editValor.getText().toString();

        if (valorRecuperado == null || valorRecuperado.equals("")) {
            Toast.makeText(getApplicationContext(), "Digite o valor primeiro!", Toast.LENGTH_SHORT).show();
        } else {
            double valorDigitado = Double.parseDouble(valorRecuperado);

            double gorjeta  = valorDigitado * (porcentagem/100);
            double total = gorjeta + valorDigitado;

            txtGorjeta.setText("R$" + Math.round(gorjeta));
            txtTotal.setText("R$" + total);
        }
    }
}