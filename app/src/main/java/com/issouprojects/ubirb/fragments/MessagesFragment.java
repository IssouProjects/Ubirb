package com.issouprojects.ubirb.fragments;

import android.app.Activity;
import android.content.Intent;
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
import com.issouprojects.ubirb.RequestMessages;


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

    private TextView nomPaul;
    private TextView txtPaul;
    private ImageView imgPaul;

    private TextView nomPaul2;
    private TextView txtPaul2;
    private ImageView imgPaul2;

    private TextView nomJean;
    private TextView txtJean;
    private ImageView imgJean;

    private TextView nomBosh;
    private ImageView imgBosh;

    private TextView nomXbox;
    private ImageView imgXbox;

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

        nomPaul = rootView.findViewById(R.id.nomPaul);
        txtPaul = rootView.findViewById(R.id.txtPaul);
        imgPaul = rootView.findViewById(R.id.imgPaul);

        nomPaul2 = rootView.findViewById(R.id.nomPaul2);
        txtPaul2 = rootView.findViewById(R.id.txtPaul2);
        imgPaul2 = rootView.findViewById(R.id.imgPaul2);

        nomJean = rootView.findViewById(R.id.nomJean);
        txtJean = rootView.findViewById(R.id.txtJean);
        imgJean = rootView.findViewById(R.id.imgJean);

        nomBosh = rootView.findViewById(R.id.nomBosh);
        imgBosh = rootView.findViewById(R.id.imgBosh);

        nomXbox = rootView.findViewById(R.id.nomXbox);
        imgXbox = rootView.findViewById(R.id.imgXbox);

        tous.setTextColor(Color.WHITE);
        offre.setTextColor(Color.LTGRAY);
        recois.setTextColor(Color.LTGRAY);

        hideOffre(View.INVISIBLE);

        offre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hideTous(View.INVISIBLE);
                hideOffre(View.VISIBLE);
                offre.setTextColor(Color.WHITE);
                tous.setTextColor(Color.LTGRAY);
            }
        });

        tous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hideTous(View.VISIBLE);
                hideOffre(View.INVISIBLE);
                tous.setTextColor(Color.WHITE);
                offre.setTextColor(Color.LTGRAY);
            }
        });

        imgPaul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), RequestMessages.class);
                startActivity(intent);
            }
        });

        nomPaul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), RequestMessages.class);
                startActivity(intent);
            }
        });

        txtPaul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), RequestMessages.class);
                startActivity(intent);
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

    private void hideTous(int visibility){
        nomKevin.setVisibility(visibility);
        txtKevin.setVisibility(visibility);
        imgKevin.setVisibility(visibility);

        nomPierre.setVisibility(visibility);
        txtPierre.setVisibility(visibility);
        imgPierre.setVisibility(visibility);

        nomPaul.setVisibility(visibility);
        txtPaul.setVisibility(visibility);
        imgPaul.setVisibility(visibility);
    }

    private void hideOffre(int visibility){
        nomPaul2.setVisibility(visibility);
        txtPaul2.setVisibility(visibility);
        imgPaul2.setVisibility(visibility);

        nomJean.setVisibility(visibility);
        txtJean.setVisibility(visibility);
        imgJean.setVisibility(visibility);

        nomBosh.setVisibility(visibility);
        imgBosh.setVisibility(visibility);

        nomXbox.setVisibility(visibility);
        imgXbox.setVisibility(visibility);
    }
}