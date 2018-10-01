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
// scores for the back nine holes (10 through 18).

public class BacknineFragment extends Fragment{

    private EditText textPar10;
    private EditText textPar11;
    private EditText textPar12;
    private EditText textPar13;
    private EditText textPar14;
    private EditText textPar15;
    private EditText textPar16;
    private EditText textPar17;
    private EditText textPar18;

    private EditText textSI10;
    private EditText textSI11;
    private EditText textSI12;
    private EditText textSI13;
    private EditText textSI14;
    private EditText textSI15;
    private EditText textSI16;
    private EditText textSI17;
    private EditText textSI18;

    private EditText textScore10;
    private EditText textScore11;
    private EditText textScore12;
    private EditText textScore13;
    private EditText textScore14;
    private EditText textScore15;
    private EditText textScore16;
    private EditText textScore17;
    private EditText textScore18;

    private Hole[] theHole = new Hole[9];


    // assigns names to the EditTexts for each property in each of the nine holes
    // from 10 to 18, when the Fragment is created when the app starts.

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.backnine_fragment, container, false);

        for (int i = 0; i < theHole.length; i++){
            theHole[i] = new Hole();
        }

        textPar10 = (EditText) view.findViewById(R.id.editText_Par10);
        textPar11 = (EditText) view.findViewById(R.id.editText_Par11);
        textPar12 = (EditText) view.findViewById(R.id.editText_Par12);
        textPar13 = (EditText) view.findViewById(R.id.editText_Par13);
        textPar14 = (EditText) view.findViewById(R.id.editText_Par14);
        textPar15 = (EditText) view.findViewById(R.id.editText_Par15);
        textPar16 = (EditText) view.findViewById(R.id.editText_Par16);
        textPar17 = (EditText) view.findViewById(R.id.editText_Par17);
        textPar18 = (EditText) view.findViewById(R.id.editText_Par18);

        textSI10 = (EditText) view.findViewById(R.id.editText_SI10);
        textSI11 = (EditText) view.findViewById(R.id.editText_SI11);
        textSI12 = (EditText) view.findViewById(R.id.editText_SI12);
        textSI13 = (EditText) view.findViewById(R.id.editText_SI13);
        textSI14 = (EditText) view.findViewById(R.id.editText_SI14);
        textSI15 = (EditText) view.findViewById(R.id.editText_SI15);
        textSI16 = (EditText) view.findViewById(R.id.editText_SI16);
        textSI17 = (EditText) view.findViewById(R.id.editText_SI17);
        textSI18 = (EditText) view.findViewById(R.id.editText_SI18);

        textScore10 = (EditText) view.findViewById(R.id.editText_Score10);
        textScore11 = (EditText) view.findViewById(R.id.editText_Score11);
        textScore12 = (EditText) view.findViewById(R.id.editText_Score12);
        textScore13 = (EditText) view.findViewById(R.id.editText_Score13);
        textScore14 = (EditText) view.findViewById(R.id.editText_Score14);
        textScore15 = (EditText) view.findViewById(R.id.editText_Score15);
        textScore16 = (EditText) view.findViewById(R.id.editText_Score16);
        textScore17 = (EditText) view.findViewById(R.id.editText_Score17);
        textScore18 = (EditText) view.findViewById(R.id.editText_Score18);

        return view;
    }

    // this method is called from the activity, to feed the properties of each hole into the Game object.

    public void feedBack9Holes(Game G){

        // These lines put the properties of the holes into a local array, which will then be used to feed into the Game object

        theHole[0].setParSIScore(textPar10.getText().toString(), textSI10.getText().toString(), textScore10.getText().toString());
        theHole[1].setParSIScore(textPar11.getText().toString(), textSI11.getText().toString(), textScore11.getText().toString());
        theHole[2].setParSIScore(textPar12.getText().toString(), textSI12.getText().toString(), textScore12.getText().toString());
        theHole[3].setParSIScore(textPar13.getText().toString(), textSI13.getText().toString(), textScore13.getText().toString());
        theHole[4].setParSIScore(textPar14.getText().toString(), textSI14.getText().toString(), textScore14.getText().toString());
        theHole[5].setParSIScore(textPar15.getText().toString(), textSI15.getText().toString(), textScore15.getText().toString());
        theHole[6].setParSIScore(textPar16.getText().toString(), textSI16.getText().toString(), textScore16.getText().toString());
        theHole[7].setParSIScore(textPar17.getText().toString(), textSI17.getText().toString(), textScore17.getText().toString());
        theHole[8].setParSIScore(textPar18.getText().toString(), textSI18.getText().toString(), textScore18.getText().toString());

        // This method actually puts the properties into the Game object
        G.setBack9Holes(theHole);

    }
}
