package com.example.derek.stablefordcalc;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.app.Activity;
import android.widget.EditText;

// this class handles input of the par ratings, stroke indices (SIs), and
// scores for the front nine holes (1 through 9).

public class FrontnineFragment extends Fragment{

    private EditText textPar01;
    private EditText textPar02;
    private EditText textPar03;
    private EditText textPar04;
    private EditText textPar05;
    private EditText textPar06;
    private EditText textPar07;
    private EditText textPar08;
    private EditText textPar09;

    private EditText textSI01;
    private EditText textSI02;
    private EditText textSI03;
    private EditText textSI04;
    private EditText textSI05;
    private EditText textSI06;
    private EditText textSI07;
    private EditText textSI08;
    private EditText textSI09;

    private EditText textScore01;
    private EditText textScore02;
    private EditText textScore03;
    private EditText textScore04;
    private EditText textScore05;
    private EditText textScore06;
    private EditText textScore07;
    private EditText textScore08;
    private EditText textScore09;

    private Hole[] theHole = new Hole[9];

    // assigns names to the EditTexts for each property in each of the nine holes
    // from 1 to 9, when the Fragment is created when the app starts.

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        for (int i = 0; i < theHole.length; i++){
            theHole[i] = new Hole();
        }

        View view = inflater.inflate(R.layout.frontnine_fragment, container, false);

        textPar01 = (EditText) view.findViewById(R.id.editText_Par01);
        textPar02 = (EditText) view.findViewById(R.id.editText_Par02);
        textPar03 = (EditText) view.findViewById(R.id.editText_Par03);
        textPar04 = (EditText) view.findViewById(R.id.editText_Par04);
        textPar05 = (EditText) view.findViewById(R.id.editText_Par05);
        textPar06 = (EditText) view.findViewById(R.id.editText_Par06);
        textPar07 = (EditText) view.findViewById(R.id.editText_Par07);
        textPar08 = (EditText) view.findViewById(R.id.editText_Par08);
        textPar09 = (EditText) view.findViewById(R.id.editText_Par09);

        textSI01 = (EditText) view.findViewById(R.id.editText_SI01);
        textSI02 = (EditText) view.findViewById(R.id.editText_SI02);
        textSI03 = (EditText) view.findViewById(R.id.editText_SI03);
        textSI04 = (EditText) view.findViewById(R.id.editText_SI04);
        textSI05 = (EditText) view.findViewById(R.id.editText_SI05);
        textSI06 = (EditText) view.findViewById(R.id.editText_SI06);
        textSI07 = (EditText) view.findViewById(R.id.editText_SI07);
        textSI08 = (EditText) view.findViewById(R.id.editText_SI08);
        textSI09 = (EditText) view.findViewById(R.id.editText_SI09);

        textScore01 = (EditText) view.findViewById(R.id.editText_Score01);
        textScore02 = (EditText) view.findViewById(R.id.editText_Score02);
        textScore03 = (EditText) view.findViewById(R.id.editText_Score03);
        textScore04 = (EditText) view.findViewById(R.id.editText_Score04);
        textScore05 = (EditText) view.findViewById(R.id.editText_Score05);
        textScore06 = (EditText) view.findViewById(R.id.editText_Score06);
        textScore07 = (EditText) view.findViewById(R.id.editText_Score07);
        textScore08 = (EditText) view.findViewById(R.id.editText_Score08);
        textScore09 = (EditText) view.findViewById(R.id.editText_Score09);

        return view;
    }

    // this method is called from the activity, to feed the properties of each hole into the Game object.

    public void feedFront9Holes(Game G){

        // These lines put the properties of the holes into a local array, which will then be used to feed into the Game object

        theHole[0].setParSIScore(textPar01.getText().toString(), textSI01.getText().toString(), textScore01.getText().toString());
        theHole[1].setParSIScore(textPar02.getText().toString(), textSI02.getText().toString(), textScore02.getText().toString());
        theHole[2].setParSIScore(textPar03.getText().toString(), textSI03.getText().toString(), textScore03.getText().toString());
        theHole[3].setParSIScore(textPar04.getText().toString(), textSI04.getText().toString(), textScore04.getText().toString());
        theHole[4].setParSIScore(textPar05.getText().toString(), textSI05.getText().toString(), textScore05.getText().toString());
        theHole[5].setParSIScore(textPar06.getText().toString(), textSI06.getText().toString(), textScore06.getText().toString());
        theHole[6].setParSIScore(textPar07.getText().toString(), textSI07.getText().toString(), textScore07.getText().toString());
        theHole[7].setParSIScore(textPar08.getText().toString(), textSI08.getText().toString(), textScore08.getText().toString());
        theHole[8].setParSIScore(textPar09.getText().toString(), textSI09.getText().toString(), textScore09.getText().toString());

        // This method actually puts the properties into the Game object
        G.setFront9Holes(theHole);
    }

}
