package com.example.appmarvel;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.loader.app.LoaderManager;
import androidx.loader.content.AsyncTaskLoader;
import androidx.loader.content.Loader;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.io.IOException;
import java.util.List;

public class TelaHero extends AppCompatActivity implements LoaderManager.LoaderCallbacks<List<Character>> {

    private ListView characterListView;
    private EditText requestTag;
    private TextView errorMessage;
    private ProgressBar loadingBar;
    private CharacterAdapter adapter;

    private static final int CHARACTER_SEARCH_LOADER = 1;
    private static final String CHARACTER_QUERY_TAG = "query";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.heroes);

        loadingBar = findViewById(R.id.loadingBar);
        errorMessage = findViewById(R.id.errorMessage);
        requestTag = findViewById(R.id.requestTag);

        characterListView = findViewById(R.id.characterListView);
        characterListView.setEmptyView(errorMessage);

        adapter = new CharacterAdapter(getApplicationContext());
        characterListView.setAdapter(adapter);

        if (savedInstanceState != null) {
            String query = savedInstanceState.getString(CHARACTER_QUERY_TAG);
            requestTag.setText(query);
        }

        getSupportLoaderManager().initLoader(CHARACTER_SEARCH_LOADER, null, this);
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState, @NonNull PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        outState.putString(CHARACTER_QUERY_TAG, requestTag.getText().toString().trim());
    }

    @NonNull
    @SuppressLint("StaticFieldLeak")
    public Loader<List<Character>> onCreateLoader(int id, final Bundle args) {
        return new AsyncTaskLoader<List<Character>>(this) {
            List<Character> characterList;

            @Override
            protected void onStartLoading() {
                if (args == null) {
                    return;
                }

                loadingBar.setVisibility(View.VISIBLE);

                if (characterList != null) {
                    deliverResult(characterList);
                } else {
                    forceLoad();
                }
            }

            @Nullable
            @Override
            public List<Character> loadInBackground() {
                String searchQuery = args.getString(CHARACTER_QUERY_TAG);

                try {
                    return ApiMarvel.searchCharacters(searchQuery);
                } catch (IOException e) {
                    e.printStackTrace();
                    return null;
                }
            }

            @Override
            public void deliverResult(@Nullable List<Character> data) {
                characterList = data;
                super.deliverResult(data);
            }
        };
    }

    @Override
    public void onLoadFinished(@NonNull Loader<List<Character>> loader, List<Character> data) {
        loadingBar.setVisibility(View.INVISIBLE);

        if (data == null) {
            showErrorMessage();
        } else {
            adapter.clear();
            adapter.addAll(data);
            showCharacterDataView();
        }
    }

    @Override
    public void onLoaderReset(@NonNull Loader<List<Character>> loader) {
        // Não é necessário implementar nada aqui
    }

    private void showCharacterDataView() {
        errorMessage.setVisibility(View.INVISIBLE);
        characterListView.setVisibility(View.VISIBLE);
    }

    private void showErrorMessage() {
        characterListView.setVisibility(View.INVISIBLE);
        errorMessage.setVisibility(View.VISIBLE);
    }

    public void searchButton(View view) {
        makeCharacterSearchQuery();
    }

    private void makeCharacterSearchQuery() {
        String searchQuery = requestTag.getText().toString().trim();
        Bundle queryBundle = new Bundle();
        queryBundle.putString(CHARACTER_QUERY_TAG, searchQuery);
        LoaderManager loaderManager = LoaderManager.getInstance(this);
        Loader<String> characterSearchLoader = loaderManager.getLoader(CHARACTER_SEARCH_LOADER);

        if (characterSearchLoader == null) {
            loaderManager.initLoader(CHARACTER_SEARCH_LOADER, queryBundle, this);
        } else {
            loaderManager.restartLoader(CHARACTER_SEARCH_LOADER, queryBundle, this);
        }
    }
}
