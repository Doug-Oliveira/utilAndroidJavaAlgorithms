package com.example.seekbarproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private SeekBar seekBarF;
    private TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekBarF.findViewById(R.id.seekBar);
        txtResultado.findViewById(R.id.seekBar);


        seekBarF.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
               //txtResultado.setText("Progresso: " + progress + " / " + seekBar.getMax());
                txtResultado.setText("onProgressChanged chamado");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                txtResultado.setText("onStartTrackingTouch chamado");
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                txtResultado.setText("onStopTrackingTouch chamado");
            }
        });
    }
    public void recuperarProgresso(View view){
        txtResultado.setText("Escolhido" + seekBarF.getProgress());
    }

}