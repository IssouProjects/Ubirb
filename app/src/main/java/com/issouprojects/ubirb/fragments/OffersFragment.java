package com.issouprojects.ubirb.fragments;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import com.issouprojects.ubirb.R;
import com.issouprojects.ubirb.activities.OfferCreate;
import com.issouprojects.ubirb.activities.OfferDetails;


public class OffersFragment extends Fragment {

    private Button details;
    private ImageButton add;
    private ImageButton add2;
    private CardView cardF;
    private CardView cardF2;
    private CardView card1;
    private CardView card12;
    private CardView card2;
    private CardView card22;

    private ImageButton up;
    private ImageButton down;

    public OffersFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_offers, container, false);

        details = rootView.findViewById(R.id.details);
        add = rootView.findViewById(R.id.add);
        add2 = rootView.findViewById(R.id.add2);

        up = rootView.findViewById(R.id.imageButton22);
        down = rootView.findViewById(R.id.imageButton2);

        cardF = rootView.findViewById(R.id.CardViewF);
        cardF2 = rootView.findViewById(R.id.CardViewF2);
        card1 = rootView.findViewById(R.id.CardView1);
        card12 = rootView.findViewById(R.id.CardView12);
        card2 = rootView.findViewById(R.id.CardView2);
        card22 = rootView.findViewById(R.id.CardView22);

        cardF2.setVisibility(View.INVISIBLE);
        card12.setVisibility(View.INVISIBLE);
        card22.setVisibility(View.INVISIBLE);
        add2.setVisibility(View.INVISIBLE);

        details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), OfferDetails.class);
                startActivity(intent);
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), OfferCreate.class);
                startActivity(intent);
            }
        });

        add2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), OfferCreate.class);
                startActivity(intent);
            }
        });

        down.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardF2.setVisibility(View.VISIBLE);
                card12.setVisibility(View.VISIBLE);
                card22.setVisibility(View.VISIBLE);
                add2.setVisibility(View.VISIBLE);
                cardF.setVisibility(View.INVISIBLE);
                card1.setVisibility(View.INVISIBLE);
                card2.setVisibility(View.INVISIBLE);
                add.setVisibility(View.INVISIBLE);
            }
        });

        up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardF.setVisibility(View.VISIBLE);
                card1.setVisibility(View.VISIBLE);
                card2.setVisibility(View.VISIBLE);
                add.setVisibility(View.VISIBLE);
                cardF2.setVisibility(View.INVISIBLE);
                card12.setVisibility(View.INVISIBLE);
                card22.setVisibility(View.INVISIBLE);
                add2.setVisibility(View.INVISIBLE);
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
}