package com.example.amarchai.moncarnetdesuivi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MenuPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);
    }

    public void lancerSaisie(View vue) {
        Intent intent = new Intent(this, SaisieGlycemie.class);
        startActivity(intent);
    }

    public void lancerRecapitulatif(View vue) {
        Intent intent = new Intent(this, Recapitulatif.class);
        startActivity(intent);
    }

    public void lancerConfiguration(View vue) {
        Intent intent = new Intent(this, Configuration.class);
        startActivity(intent);
    }
}
