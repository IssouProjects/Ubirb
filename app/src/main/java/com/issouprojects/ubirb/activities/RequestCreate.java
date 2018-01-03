package com.issouprojects.ubirb.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.issouprojects.ubirb.R;

/**
 * Created by Vincent Redouté on 31/12/2017.
 */

public class RequestCreate extends AppCompatActivity{

    private ImageButton back;
    private Button annuler;
    private Button valider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_requestcreate);

        back = (ImageButton) findViewById(R.id.back);
        valider = (Button) findViewById(R.id.valider);
        annuler = (Button) findViewById(R.id.annuler);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        annuler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        valider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
