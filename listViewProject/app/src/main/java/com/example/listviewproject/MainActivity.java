package com.example.listviewproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listLocal;
    private String[] itens = {
            "Rio de Janeiro", "São Paulo",
            "Bolivia", "Argentina",
            "Costa Rica", "Espanha",
            "Barbados", "Havai", "Republica Dominicana",
            "California", "Portugal"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listLocal = findViewById(R.id.listLocais);

        //adtapador para a list
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                itens
        );
        //add adaptador na list
        listLocal.setAdapter(adaptador);

        //add clique na list
        listLocal.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String valorSelecionado = listLocal.getItemAtPosition(position).toString();
                Toast.makeText(getApplicationContext(), valorSelecionado, Toast.LENGTH_LONG).show();
            }
        });
    }
}