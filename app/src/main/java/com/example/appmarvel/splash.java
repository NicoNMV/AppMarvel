package com.example.appmarvel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ProgressBar;

public class splash extends AppCompatActivity {

    // Declara elemento
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        // Tela cheia
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        // Elemento pelo ID
        progressBar = findViewById(R.id.progress_bar);

        progressBar.setMax(100);
        progressBar.setScaleY(3f);

        progressAnimation();
    }

    // Animação e definição de tempo
    public void progressAnimation(){
        ProgressBarAnimation anim = new ProgressBarAnimation(this, progressBar, 0f, 100f);
        anim.setDuration(7000);
        progressBar.setAnimation(anim);
    }
}
