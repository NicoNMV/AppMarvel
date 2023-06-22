package com.example.appmarvel;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class TelaQuiz extends AppCompatActivity {
    private int userScore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz); // Vincular o xml para o arquivo Java

        // Resposta do usuário
        Button Resposta1 = findViewById(R.id.BtnResult); // Errado
        Button Resposta2 = findViewById(R.id.BtnIron); // Correto


        /* Lógica com André Mauricio -- Basicamente adicionei para que independente da escolha irá
        para a próxima tela*/
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
                int answerValue = 1; //Correto
                ProximaTela(answerValue);
            }
        });
    }

    private void ProximaTela(int answerValue) {
        // Lógica para avançar para a próxima tela (2ª tela do quiz)
        Intent nav = new Intent(TelaQuiz.this, TelaQuiz1.class);
        nav.putExtra("Ponto", answerValue);
        startActivity(nav);
    }

    // Botão para voltar
    public void Back(View view){
        Intent nav1 = new Intent(TelaQuiz.this, MainActivity.class);
        startActivity(nav1);
    }

    //Navegação entre as telas
    public void Telahero(View view){
        Intent nav1 = new Intent(TelaQuiz.this, TelaHero.class);
        startActivity(nav1);
    }
    public void TelaQuiz(View view){
        Intent nav2 = new Intent(TelaQuiz.this, TelaQuiz.class);
        startActivity(nav2);
    }

    public void TelaMain(View view){
        Intent nav3 = new Intent(TelaQuiz.this, MainActivity.class);
        startActivity(nav3);
    }

    public void TelaQuad(View view){
        Intent nav4 = new Intent(TelaQuiz.this, TelaQuad.class);
        startActivity(nav4);
    }

    public void TelaHist(View view){
        Intent nav5 = new Intent(TelaQuiz.this, TelaHist.class);
        startActivity(nav5);
    }
}

