package com.example.appmarvel;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.content.ContentValues;
import android.database.Cursor;
import java.util.List;
import java.util.ArrayList;

    public class Banco extends SQLiteOpenHelper {
        private static final String DATABASE_NAME = "mydatabase.db";
        private static final int DATABASE_VERSION = 1;
        private Context context;

        private static final String TABLE_FAVORITES = "favorites";
        private static final String COLUMN_ID = "id";
        private static final String COLUMN_NAME = "name";


    public Banco(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // Criação da tabela "Favoritos"
        db.execSQL("CREATE TABLE Favoritos (CodFav INT PRIMARY KEY, NomeFav VARCHAR(100));");

        // Criação da tabela "Historico" com chave estrangeira referenciando a tabela "Favoritos"
        db.execSQL("CREATE TABLE Historico (CodBusca INT PRIMARY KEY, CodFav INT, NomeBusca VARCHAR(100), " +
                "FOREIGN KEY (CodFav) REFERENCES Favoritos(CodFav));");
    }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            // Lógica para atualizar o esquema do banco de dados, se necessário
        }

    // Método para adicionar um favorito
    public void addFavorite(String name) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(COLUMN_NAME, name);
        db.insert(TABLE_FAVORITES, null, values);
        db.close();
    }

    // Método para remover um favorito
    public void removeFavorite(int id) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TABLE_FAVORITES, COLUMN_ID + " = ?", new String[]{String.valueOf(id)});
        db.close();
    }

     // Método para obter todos os favoritos
     public List<String> getAllFavorites() {
        List<String> favorites = new ArrayList<>();
        SQLiteDatabase db = this.getReadableDatabase();
         // Verifica se a consulta retornou algum resultado
        Cursor cursor = db.query(TABLE_FAVORITES, null, null, null, null, null, null);

         if (cursor != null && cursor.moveToFirst()) {
             int columnIndex = cursor.getColumnIndex("COLUMN_NAME");

             // Verifica se a coluna foi encontrada
             if (columnIndex >= 0) {
                 String name = cursor.getString(columnIndex);
                 favorites.add(name);

             } else {
                 // A coluna não foi encontrada
             }

             // Fecha o cursor após a conclusão do uso
             cursor.close();
         }
         return favorites;
     }
}

