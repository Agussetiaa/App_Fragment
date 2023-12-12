package com.agus.movie_app;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

public class KomediFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_komedi, container, false);

        ImageView imageKomedi = view.findViewById(R.id.imageKomedi);
        TextView textKomedi = view.findViewById(R.id.textKomedi);

        // Set gambar dan teks sesuai dengan Komedi Film
        imageKomedi.setImageResource(R.drawable.komedy);
        textKomedi.setText("Srimulat HIDUP MEMANG KOMEDI");

        return view;
    }
}
