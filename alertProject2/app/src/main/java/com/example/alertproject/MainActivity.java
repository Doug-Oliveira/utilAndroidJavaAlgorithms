package com.example.alertproject;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirDialog(View view) {

        //Instaciar alert
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);

        //Não fecha o alert ao clicar fora da caixa
        dialog.setCancelable(false);

        //Configurar um icone
        dialog.setIcon(android.R.drawable.ic_menu_today);

        //Configurar o titulo e a msg
        dialog.setTitle("Título da Dialog");
        dialog.setMessage("Mensagem da Dialog");

        //Config ações sim e não
        dialog.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(), "Executar o texto ao Clicar no botão 'Sim'", Toast.LENGTH_SHORT).show();
            }
        });

        dialog.setNegativeButton("Não", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(), "Executar o texto ao clicar no botão 'Não'", Toast.LENGTH_SHORT).show();
            }
        });

        //criar e exibir a dialog
        dialog.create();
        dialog.show();
    }


}