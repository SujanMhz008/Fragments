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
public class FirstFragment extends Fragment implements View.OnClickListener {
    EditText edtFirst, edtSecond;
    Button btnCalculate;

    public FirstFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_first, container, false);
        edtFirst = view.findViewById(R.id.edtFirstNumber);
        edtSecond = view.findViewById(R.id.edtSecondNumber);
        btnCalculate = view.findViewById(R.id.btnCalculate);

        btnCalculate.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        int firstNumber, secondNumber;
        firstNumber = Integer.parseInt(edtFirst.getText().toString());
        secondNumber = Integer.parseInt(edtSecond.getText().toString());

        Toast.makeText(
                getActivity(),
                "The sum of " + firstNumber +" and " + secondNumber + " is " + firstNumber+secondNumber,
                Toast.LENGTH_LONG).show();
    }
}
