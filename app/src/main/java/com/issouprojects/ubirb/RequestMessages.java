package com.issouprojects.ubirb;

import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.issouprojects.ubirb.activities.FinDePret;

public class RequestMessages extends AppCompatActivity {

    private ImageButton back;
    private Button accept;
    private Button decline;
    private ConstraintLayout demandeDePret;
    private ConstraintLayout finDePret;
    private Button endTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request_messages);

        back = (ImageButton) findViewById(R.id.back);
        accept = findViewById(R.id.acceptButton);
        decline = findViewById(R.id.decline);
        demandeDePret = findViewById(R.id.demandedepret);
        finDePret = findViewById(R.id.findepret);
        endTransaction = findViewById(R.id.endTransaction);

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

        decline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        endTransaction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RequestMessages.this, FinDePret.class);
                startActivity(intent);
            }
        });
    }
}
