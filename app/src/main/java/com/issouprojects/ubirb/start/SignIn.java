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

public class SignIn extends AppCompatActivity{

    private Button signup;
    private Button signin;
    private Intent intent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        signup = (Button) findViewById(R.id.signup);
        signin = (Button) findViewById(R.id.signin);

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(SignIn.this, MainActivity.class);
                startActivity(intent);
            }
        });

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(SignIn.this, SignUp.class);
                startActivity(intent);
            }
        });

    }
}
