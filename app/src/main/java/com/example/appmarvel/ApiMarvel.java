package com.example.appmarvel;

import android.net.Uri;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ApiMarvel {
    private final static String MARVEL_BASE_URL = "https://gateway.marvel.com/v1/public/characters";
    private final static String PUBLIC_KEY = "d3c052861bb6f9663802f36575008543";
    private final static String PRIVATE_KEY = "fb45b03c22dfb9bfb656aaa743832aaa27c3bb22";

    private static URL buildUrl(String queryString) {
        Uri.Builder builder = Uri.parse(MARVEL_BASE_URL).buildUpon();
        builder.appendQueryParameter("apikey", PUBLIC_KEY);
        builder.appendQueryParameter("ts", String.valueOf(System.currentTimeMillis()));
        builder.appendQueryParameter("hash", generateHash());

        if (queryString != null && !queryString.isEmpty()) {
            builder.appendQueryParameter("nameStartsWith", queryString);
        }

        URL url = null;
        try {
            url = new URL(builder.build().toString());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return url;
    }

    private static String getResponseFromHttpUrl(URL url) throws IOException {
        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
        try {
            InputStream inputStream = urlConnection.getInputStream();
            Scanner scanner = new Scanner(inputStream);
            scanner.useDelimiter("\\A");
            boolean hasInput = scanner.hasNext();
            if (hasInput) {
                return scanner.next();
            } else {
                return null;
            }
        } finally {
            urlConnection.disconnect();
        }
    }

    private static String generateHash() {
        String timeStamp = String.valueOf(System.currentTimeMillis());
        String input = timeStamp + PRIVATE_KEY + PUBLIC_KEY;
        // Implemente sua lógica para gerar o hash, por exemplo, usando MD5 ou SHA1
        // Retorne o hash gerado
        return "";
    }

    private static List<Character> parseCharacterJson(String json) {
        List<Character> characterList = new ArrayList<>();
        try {
            JSONObject jsonObject = new JSONObject(json);
            JSONObject dataObject = jsonObject.getJSONObject("data");
            JSONArray resultsArray = dataObject.getJSONArray("results");

            for (int i = 0; i < resultsArray.length(); i++) {
                JSONObject characterObject = resultsArray.getJSONObject(i);

                int id = characterObject.getInt("id");
                String name = characterObject.getString("name");
                String description = characterObject.getString("description");
                // Extraia outros campos necessários

                Character character = new Character(id, name, description);
                characterList.add(character);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return characterList;
    }

    public static List<Character> searchCharacters(String query) throws IOException {
        URL url = buildUrl(query);
        String response = getResponseFromHttpUrl(url);
        return parseCharacterJson(response);
    }
}
