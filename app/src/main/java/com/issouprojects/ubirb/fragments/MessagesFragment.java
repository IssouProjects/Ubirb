package com.issouprojects.ubirb.fragments;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.issouprojects.ubirb.R;


public class MessagesFragment extends Fragment {

    private Button tous;
    private Button offre;
    private Button recois;

    private TextView nomKevin;
    private TextView txtKevin;
    private ImageView imgKevin;

    private TextView nomPierre;
    private TextView txtPierre;
    private ImageView imgPierre;


    public MessagesFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment_messages, container, false);

        tous = (Button) rootView.findViewById(R.id.tous);
        offre = (Button) rootView.findViewById(R.id.offre);
        recois = (Button) rootView.findViewById(R.id.recois);

        nomKevin = rootView.findViewById(R.id.nomKevin);
        txtKevin = rootView.findViewById(R.id.txtKevin);
        imgKevin = rootView.findViewById(R.id.imgKevin);

        nomPierre = rootView.findViewById(R.id.nomPierre);
        txtPierre = rootView.findViewById(R.id.txtPierre);
        imgPierre = rootView.findViewById(R.id.imgPierre);

        tous.setTextColor(Color.WHITE);
        offre.setTextColor(Color.LTGRAY);
        recois.setTextColor(Color.LTGRAY);

        offre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hideKevin(View.INVISIBLE);
                hidePierre(View.INVISIBLE);
                offre.setTextColor(Color.WHITE);
                tous.setTextColor(Color.LTGRAY);
            }
        });

        tous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hideKevin(View.VISIBLE);
                hidePierre(View.VISIBLE);
                tous.setTextColor(Color.WHITE);
                offre.setTextColor(Color.LTGRAY);
            }
        });

        // Inflate the layout for this fragment
        return rootView;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    private void hideKevin(int visibility){
        nomKevin.setVisibility(visibility);
        txtKevin.setVisibility(visibility);
        imgKevin.setVisibility(visibility);
    }

    private void hidePierre(int visibility){
        nomPierre.setVisibility(visibility);
        txtPierre.setVisibility(visibility);
        imgPierre.setVisibility(visibility);
    }
}