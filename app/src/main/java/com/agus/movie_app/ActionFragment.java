package com.agus.movie_app;

import android.os.Bundle;
import android.view.LayoutInflater;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

public class ActionFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_action, container, false);

        ImageView imageAction = view.findViewById(R.id.imageAction);
        TextView textAction = view.findViewById(R.id.textAction);

        // Set gambar dan teks sesuai dengan Action Film
        imageAction.setImageResource(R.drawable.the);
        textAction.setText("The Roundup: No Way Out");

        return view;
    }
}
