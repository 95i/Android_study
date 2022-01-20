package com.smtxi.myprogressbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        progressBar = findViewById(R.id.pb);
        progressBar2 = findViewById(R.id.pb2);

    }

    private ProgressBar progressBar;
    private ProgressBar progressBar2;

    public void leoClock(View view) {

        if (progressBar.getVisibility() == View.GONE) {
            progressBar.setVisibility(view.VISIBLE);
        } else {
            progressBar.setVisibility(View.GONE);
        }

    }

    public void load(View view) {
        int progress = progressBar2.getProgress();
        progress += 1;
        progressBar2.setProgress(progress);
    }
}