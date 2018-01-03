package com.issouprojects.ubirb;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class RequestMessages extends AppCompatActivity {

    private ImageButton back;
    private Button accept;
    private ConstraintLayout demandeDePret;
    private ConstraintLayout finDePret;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request_messages);

        back = (ImageButton) findViewById(R.id.back);
        accept = findViewById(R.id.acceptButton);
        demandeDePret = findViewById(R.id.demandedepret);
        finDePret = findViewById(R.id.findepret);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        accept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                demandeDePret.setVisibility(View.INVISIBLE);
                finDePret.setVisibility(View.VISIBLE);
            }
        });
    }
}
