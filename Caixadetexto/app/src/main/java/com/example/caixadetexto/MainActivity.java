package com.example.caixadetexto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private EditText campoNome;
    private TextInputEditText campoEmail;
    private TextView resultCampoNome;
    private CheckBox checkAzul, checkVermelho, checkAmarelo;
    private RadioButton sexoMasculino, sexoFeminino;
    private RadioGroup opcaoSexo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campoNome       = findViewById(R.id.editTextTextPersonName);
        campoEmail      = findViewById(R.id.campoSenha);
        resultCampoNome = findViewById(R.id.textResult);
        checkAzul       = findViewById(R.id.checkAzul);
        checkVermelho   = findViewById(R.id.checkVermelho);
        checkAmarelo    = findViewById(R.id.checkAmarelo);
        sexoMasculino   = findViewById(R.id.rbMasculino);
        sexoFeminino    = findViewById(R.id.rbFeminino);
        opcaoSexo       = findViewById(R.id.rGroup);
        radioButton();

    }
    // boolean que retorna se o campo esta marcado ou não

    public void radioButton() {

        opcaoSexo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.rbMasculino) {
                    resultCampoNome.setText("Masculino");
                } else if (checkedId == R.id.rbFeminino) {
                    resultCampoNome.setText("Feminino");
                }
            }
        });
    }


    public void send(View view) {
        //  checkBox();
        //radioButton();

        //String nome = campoNome.getText().toString();
        //String email = campoEmail.getText().toString();


    }

    public void checkBox() {
        String texto = "";

        if (checkAzul.isChecked()) {
            String corSelecionada = checkAzul.getText().toString();
            texto = corSelecionada;

        } else if (checkVermelho.isChecked()) {
            String corSelecionada = checkVermelho.getText().toString();
            texto = corSelecionada;

        } else {
            String corSelecionada = checkAmarelo.getText().toString();
            texto = corSelecionada;

        }

        resultCampoNome.setText(texto);
    }

    public void cleanCampo(View view) {
        campoEmail.setText("");
        campoNome.setText("");
    }


}