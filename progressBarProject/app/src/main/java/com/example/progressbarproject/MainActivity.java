package com.example.progressbarproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {


    private ProgressBar progressBar;
    private ProgressBar progressCircleBar;
    private int progress = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBar = findViewById(R.id.progressBar);
        progressCircleBar = findViewById(R.id.progressCircleBar);

        progressCircleBar.setVisibility(View.GONE);
    }

    public void loadProgressBar(View view) {

            this.progress = this.progress + 1;
            progressBar.setProgress(this.progress);

        progressCircleBar.setVisibility(View.VISIBLE);

        if(this.progress == 10){
            progressCircleBar.setVisibility(View.GONE);
        }
    }
}