package com.kitoko.fragrev;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button fragBtn = findViewById(R.id.fragBtn);
        fragBtn.setOnClickListener(v -> {

            // 1-Recupere le FragmentManager de l'activite
            FragmentManager fragMan = getSupportFragmentManager();

            // 2-Recupre le FragmentTransaction du FragmentManager
            FragmentTransaction fragTrans = fragMan.beginTransaction();

            // 3-Ajoute le fragment a afficher dans le FragmentTransaction
            fragTrans.add(R.id.fragTwoCont, TwoFragment.class, null);

            // 4-Execute : affiche
            fragTrans.commit();

        });

    }
}