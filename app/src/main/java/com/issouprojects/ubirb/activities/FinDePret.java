package com.issouprojects.ubirb.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.issouprojects.ubirb.MainActivity;
import com.issouprojects.ubirb.R;

public class FinDePret extends AppCompatActivity {

    private ImageButton back;
    private Button valider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fin_de_pret);

        back = (ImageButton) findViewById(R.id.back);
        valider = findViewById(R.id.valider);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        valider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FinDePret.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
