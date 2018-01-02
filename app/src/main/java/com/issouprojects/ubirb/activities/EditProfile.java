package com.issouprojects.ubirb.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.issouprojects.ubirb.R;

import java.util.ArrayList;
import java.util.HashMap;

public class EditProfile extends AppCompatActivity {

    ArrayList<HashMap<String,String>> list = new ArrayList<HashMap<String,String>>();
    private SimpleAdapter sa;
    private ImageButton back;

    private String[][] settings = {
        {"Prénom", "Paul"},
        {"Nom", "Dupont"},
        {"Adresse", "Résidence C"},
        {"Adresse email", "pauldupont@outlook.fr"},
        {"Téléphone", "06 00 00 00 00"},
        {"Mot de passe", "******"}
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);

        HashMap<String,String> item;
        for(int i = 0; i< settings.length; i++){
            item = new HashMap<String,String>();
            item.put( "line1", settings[i][0]);
            item.put( "line2", settings[i][1]);
            list.add( item );
        }

        sa = new SimpleAdapter(this, list,
                R.layout.twolines,
                new String[] { "line1","line2" },
                new int[] {R.id.line_a, R.id.line_b});
        ((ListView)findViewById(R.id.list)).setAdapter(sa);

        back = (ImageButton) findViewById(R.id.back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
