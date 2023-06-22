package com.example.appmarvel;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class TelaFav extends Activity{

    private ListView favListView;
    private ArrayList<Character> favList;
    private ArrayAdapter<Character> favAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.favoritos);


        favListView = findViewById(R.id.favListView);
        favList = new ArrayList<>();
        favAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, favList);
        favListView.setAdapter(favAdapter);

        // Lógica para carregar os favoritos do banco de dados SQLite
        // Preencher a lista de favoritos (favoritesList) com os resultados
        // Atualizar o adaptador (favoritesAdapter)

        favListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Character selectedCharacter = favList.get(position);
                // Lógica para abrir a tela de detalhes do personagem selecionado
            }
        });
    }

    //Navegação entre as telas
    public void Telahero(View view){
        Intent nav1 = new Intent(TelaFav.this, TelaHero.class);
        startActivity(nav1);
    }
    public void TelaQuiz(View view){
        Intent nav2 = new Intent(TelaFav.this, TelaQuiz.class);
        startActivity(nav2);
    }

    public void TelaMain(View view){
        Intent nav3 = new Intent(TelaFav.this, MainActivity.class);
        startActivity(nav3);
    }

    public void TelaQuad(View view){
        Intent nav4 = new Intent(TelaFav.this, TelaQuad.class);
        startActivity(nav4);
    }

    public void TelaHist(View view){
        Intent nav5 = new Intent(TelaFav.this, TelaHist.class);
        startActivity(nav5);
    }
}