package com.example.appmarvel;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


public class CharacterAdapter extends ArrayAdapter<Character> {

    public CharacterAdapter( Context context) {
        super(context, 0);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.heroesitem, parent, false);
        }

        TextView characterName = view.findViewById(R.id.characterName);
        TextView characterDescription = view.findViewById(R.id.characterDescription);

        Character currentCharacter = getItem(position);

        characterName.setText(currentCharacter.getName());
        characterDescription.setText(currentCharacter.getDescription());

        return view;
    }
}