package com.issouprojects.ubirb.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import com.issouprojects.ubirb.R;

/**
 * Created by Vincent on 08/01/2018.
 */

public class RequestNewMessages extends AppCompatActivity {

    private ImageButton back;
    private Button send;
    private Button decline;
    private ConstraintLayout leLayout;
    private EditText text;
    private TextView leMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request_newmessages);

        back = findViewById(R.id.back);
        decline = findViewById(R.id.decline);
        leLayout = findViewById(R.id.leLayout);
        send = findViewById(R.id.send);
        text = findViewById(R.id.text);
        leMessage = findViewById(R.id.textView47);

        final View view = this.getCurrentFocus();

        leLayout.setVisibility(View.INVISIBLE);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                leLayout.setVisibility(View.VISIBLE);
                leMessage.setText(text.getText());
                // Check if no view has focus:
                if (v != null) {
                    InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(v.getWindowToken(), 0);
                }
                text.setText("");
            }
        });

        decline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    @Override
    public boolean onKeyUp(int keyCode, KeyEvent event) {
        switch (keyCode) {
            case KeyEvent.KEYCODE_ENTER:
                leLayout.setVisibility(View.VISIBLE);
                leMessage.setText(text.getText());
                // Check if no view has focus:
                View view = this.getCurrentFocus();
                if (view != null) {
                    InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
                }
                text.setText("");
                return true;
            default:
                return super.onKeyUp(keyCode, event);
        }
    }
}
