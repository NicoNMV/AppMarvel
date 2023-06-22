package com.example.appmarvel;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class TelaResultado extends AppCompatActivity {
    private Button scoreButton;
    private int userScore;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resultado); // Vincular o xml para o arquivo Java

        scoreButton = findViewById(R.id.BtnResult);

        Intent intent = getIntent();
        int answerValue = intent.getIntExtra("ponto", 0);
        userScore += answerValue;

        // Exibir a pontuação final no botão
        scoreButton.setText(userScore + "/5");
    }

    public void Back(View view){
        Intent nav1 = new Intent(TelaResultado.this, MainActivity.class);
        startActivity(nav1);
    }

    //Navegação entre as telas
    public void Telahero(View view){
        Intent nav1 = new Intent(TelaResultado.this, TelaHero.class);
        startActivity(nav1);
    }
    public void TelaQuiz(View view){
        Intent nav2 = new Intent(TelaResultado.this, TelaQuiz.class);
        startActivity(nav2);
    }

    public void TelaMain(View view){
        Intent nav3 = new Intent(TelaResultado.this, MainActivity.class);
        startActivity(nav3);
    }

    public void TelaQuad(View view){
        Intent nav4 = new Intent(TelaResultado.this, TelaQuad.class);
        startActivity(nav4);
    }

    public void TelaHist(View view){
        Intent nav5 = new Intent(TelaResultado.this, TelaHist.class);
        startActivity(nav5);
    }
}
