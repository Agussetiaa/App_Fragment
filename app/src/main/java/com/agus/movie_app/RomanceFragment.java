package com.agus.movie_app;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

public class RomanceFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_romance, container, false);

        ImageView imageRomance = view.findViewById(R.id.imageRomance);
        TextView textRomance = view.findViewById(R.id.textRomance);

        // Set gambar dan teks sesuai dengan Romance Film
        imageRomance.setImageResource(R.drawable.romns);
        textRomance.setText("CEK OMBAK (melulu)");

        return view;
    }
}
