package com.example.belajarandroid;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link TabFragment2#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TabFragment2 extends Fragment {



    CardView videoRomantis1;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tab2, container, false);
        videoRomantis1 = (CardView) view.findViewById(R.id.enam);

        videoRomantis1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentDetail = new Intent(getActivity(),RomantisFilm.class);
                startActivity(intentDetail);
            }
        });

        return view;
    }
}