package com.example.appmarvel;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class TelaQuiz3 extends AppCompatActivity {
    private int userScore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz3); // Vincular o xml para o arquivo Java

        // Resposta do usuário
        Button Resposta1 = findViewById(R.id.BtnDark); // Errado
        Button Resposta2 = findViewById(R.id.BtnHark); // Correto

        // Recuperar a pontuação do Bundle
        Intent intent = getIntent();
        int answerValue = intent.getIntExtra("Ponto", 0);
        userScore += answerValue;


        Resposta1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int answerValue = 0; // Errado
                ProximaTela(answerValue);
            }
        });
        Resposta2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int answerValue = 1; // Correto
                ProximaTela(answerValue);
            }
        });
    }

    private void ProximaTela(int answerValue) {
        // Lógica para avançar para a próxima tela (2ª tela do quiz)
        userScore += answerValue;

        Intent nav = new Intent(TelaQuiz3.this, TelaQuiz4.class);
        startActivity(nav);
    }

    public void Back(View view){
        Intent nav1 = new Intent(TelaQuiz3.this, MainActivity.class);
        startActivity(nav1);
    }

    //Navegação entre as telas
    public void Telahero(View view){
        Intent nav1 = new Intent(TelaQuiz3.this, TelaHero.class);
        startActivity(nav1);
    }
    public void TelaQuiz(View view){
        Intent nav2 = new Intent(TelaQuiz3.this, TelaQuiz.class);
        startActivity(nav2);
    }

    public void TelaMain(View view){
        Intent nav3 = new Intent(TelaQuiz3.this, MainActivity.class);
        startActivity(nav3);
    }

    public void TelaQuad(View view){
        Intent nav4 = new Intent(TelaQuiz3.this, TelaQuad.class);
        startActivity(nav4);
    }

    public void TelaHist(View view){
        Intent nav5 = new Intent(TelaQuiz3.this, TelaHist.class);
        startActivity(nav5);
    }
}

