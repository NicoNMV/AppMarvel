package com.example.appmarvel;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class TelaHist extends Activity{
    private ListView listViewHist;
    private ArrayAdapter<String> histAdapter;
    private List<String> histList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.historico);

        // Inicializar a ListView e o Adapter
        listViewHist = findViewById(R.id.listViewHist);
        histList = new ArrayList<>();
        histAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, histList);
        listViewHist.setAdapter(histAdapter);

        // Carregar o histórico do banco de dados ou de outra fonte de dados
        carregarHistorico();

        // Adicionar um listener de clique para lidar com os itens do histórico selecionados
        listViewHist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String itemSelecionado = histList.get(position);
                Toast.makeText(TelaHist.this, "Item selecionado: " + itemSelecionado, Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void carregarHistorico() {

        histList.add("Item 1");
        histList.add("Item 2");
        histList.add("Item 3");
        histList.add("Item 4");

        // Notificar o Adapter que os dados foram atualizados
        histAdapter.notifyDataSetChanged();
    }

    //Navegação entre as telas
    public void Telahero(View view){
        Intent nav1 = new Intent(TelaHist.this, TelaHero.class);
        startActivity(nav1);
    }
    public void TelaQuiz(View view){
        Intent nav2 = new Intent(TelaHist.this, TelaQuiz.class);
        startActivity(nav2);
    }

    public void TelaMain(View view){
        Intent nav3 = new Intent(TelaHist.this, MainActivity.class);
        startActivity(nav3);
    }

    public void TelaQuad(View view){
        Intent nav4 = new Intent(TelaHist.this, TelaQuad.class);
        startActivity(nav4);
    }

    public void TelaHist(View view){
        Intent nav5 = new Intent(TelaHist.this, TelaHist.class);
        startActivity(nav5);
    }


}
