package com.sujanmaharjan008.fragments.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.sujanmaharjan008.fragments.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SecondFragment extends Fragment implements View.OnClickListener {
    EditText edtRadius;
    Button btnCalcAOC;

    public SecondFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_second, container, false);
        edtRadius = view.findViewById(R.id.edtRadius);
        btnCalcAOC = view.findViewById(R.id.btnCalcAOC);

        btnCalcAOC.setOnClickListener(this);

        return  view;
    }

    @Override
    public void onClick(View v) {
        int radius;
        radius = Integer.parseInt(edtRadius.getText().toString());

        Toast.makeText(
                getActivity(),
                "The area of circle is " + (22/7)*radius*radius,
                Toast.LENGTH_SHORT).show();
    }
}
