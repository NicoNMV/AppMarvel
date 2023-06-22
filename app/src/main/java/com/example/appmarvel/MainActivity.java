package com.example.appmarvel;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    //Navegação entre as telas
    public void Telahero(View view){
        Intent nav1 = new Intent(MainActivity.this, TelaHero.class);
        startActivity(nav1);
    }
    public void TelaQuiz(View view){
        Intent nav2 = new Intent(MainActivity.this, TelaQuiz.class);
        startActivity(nav2);
    }

    public void TelaMain(View view){
        Intent nav3 = new Intent(MainActivity.this, MainActivity.class);
        startActivity(nav3);
    }

    public void TelaQuad(View view){
        Intent nav4 = new Intent(MainActivity.this, TelaQuad.class);
        startActivity(nav4);
    }

    public void TelaHist(View view){
        Intent nav5 = new Intent(MainActivity.this, TelaHist.class);
        startActivity(nav5);
    }
}