package com.example.amarchai.moncarnetdesuivi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;

public class SaisieGlycemie extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saisie_glycemie);

        Intent intent = getIntent();

        ViewGroup layout = (ViewGroup) findViewById(R.id.activity_saisie_glycemie);
    }
}
