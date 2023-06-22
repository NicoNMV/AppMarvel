package com.example.appmarvel;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


public class MainActivity extends AppCompatActivity {

    ImageButton btn1;
    ImageButton btn2;
    ImageButton btn3;
    ImageButton btn4;
    ImageButton btn5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Elementos pelo ID
        btn1 = findViewById(R.id.btnPers);
        btn2 = findViewById(R.id.btnQuiz);
        btn3 = findViewById(R.id.btnQuad);
        btn4 = findViewById(R.id.btnFav);
        btn5 = findViewById(R.id.BtnMain);
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