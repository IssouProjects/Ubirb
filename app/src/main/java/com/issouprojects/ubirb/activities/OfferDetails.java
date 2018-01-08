package com.issouprojects.ubirb.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.issouprojects.ubirb.R;

/**
 * Created by Vincent Redouté on 01/01/2018.
 */

public class OfferDetails extends AppCompatActivity {

    private ImageButton back;

    private ImageView jeanClaudius;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_offerdetails);

        back = (ImageButton) findViewById(R.id.back);
        jeanClaudius = (ImageView) findViewById(R.id.imgJean);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        jeanClaudius.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OfferDetails.this, PublicProfile.class);
                startActivity(intent);
            }
        });
    }
}
