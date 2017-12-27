package com.issouprojects.ubirb.start;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.issouprojects.ubirb.MainActivity;
import com.issouprojects.ubirb.R;

/**
 * Created by Vincent Redouté on 27/12/2017.
 */

public class SignUp extends AppCompatActivity {

    private Button start;
    private Intent intent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        start = (Button) findViewById(R.id.signup);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(SignUp.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
