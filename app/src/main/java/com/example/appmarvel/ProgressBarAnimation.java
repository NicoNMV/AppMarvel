package com.example.appmarvel;

import android.content.Context;
import android.content.Intent;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.ProgressBar;

public class ProgressBarAnimation extends Animation {

    // Declara elementos
    private Context context;
    private ProgressBar progressBar;
    private float from;
    private float to;

    public ProgressBarAnimation(Context context, ProgressBar progressBar, float from, float to){
        this.context = context;
        this.progressBar = progressBar;
        this.from = from;
        this.to = to;
    }

    // Transformação da ProgressBar
    @Override
    protected void applyTransformation(float interpolatedTime, Transformation t){
        super.applyTransformation(interpolatedTime, t);
        float value = from + (to - from) * interpolatedTime;
        progressBar.setProgress((int)value);

        if (value == to){
            context.startActivity(new Intent(context, MainActivity.class));
        }
    }
}

