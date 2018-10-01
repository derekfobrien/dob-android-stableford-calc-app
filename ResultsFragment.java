package com.example.derek.stablefordcalc;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/*

This is the ResultsFragment class which works with the results_fragment XML file to
display the final scores for each of the holes, the front 9 total, the back 9 total,
and finally the overall total.

 */

public class ResultsFragment extends Fragment {

    /*
    A text box for each of the hole scores,
    and the front 9, the back 9 and overall total
     */
    private TextView textRes01;
    private TextView textRes02;
    private TextView textRes03;
    private TextView textRes04;
    private TextView textRes05;
    private TextView textRes06;
    private TextView textRes07;
    private TextView textRes08;
    private TextView textRes09;
    private TextView textRes10;
    private TextView textRes11;
    private TextView textRes12;
    private TextView textRes13;
    private TextView textRes14;
    private TextView textRes15;
    private TextView textRes16;
    private TextView textRes17;
    private TextView textRes18;

    private TextView textFront9;
    private TextView textBack9;
    private TextView textResTotal;

    // this method kicks in when the fragment is created, all the TextView boxes are given names
    // which the java file can use.

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.results_fragment, container, false);

        textRes01 = (TextView) view.findViewById(R.id.textViewResPts01);
        textRes02 = (TextView) view.findViewById(R.id.textViewResPts02);
        textRes03 = (TextView) view.findViewById(R.id.textViewResPts03);
        textRes04 = (TextView) view.findViewById(R.id.textViewResPts04);
        textRes05 = (TextView) view.findViewById(R.id.textViewResPts05);
        textRes06 = (TextView) view.findViewById(R.id.textViewResPts06);
        textRes07 = (TextView) view.findViewById(R.id.textViewResPts07);
        textRes08 = (TextView) view.findViewById(R.id.textViewResPts08);
        textRes09 = (TextView) view.findViewById(R.id.textViewResPts09);
        textRes10 = (TextView) view.findViewById(R.id.textViewResPts10);
        textRes11 = (TextView) view.findViewById(R.id.textViewResPts11);
        textRes12 = (TextView) view.findViewById(R.id.textViewResPts12);
        textRes13 = (TextView) view.findViewById(R.id.textViewResPts13);
        textRes14 = (TextView) view.findViewById(R.id.textViewResPts14);
        textRes15 = (TextView) view.findViewById(R.id.textViewResPts15);
        textRes16 = (TextView) view.findViewById(R.id.textViewResPts16);
        textRes17 = (TextView) view.findViewById(R.id.textViewResPts17);
        textRes18 = (TextView) view.findViewById(R.id.textViewResPts18);

        textFront9 = (TextView) view.findViewById(R.id.textViewResPtsF9);
        textBack9 = (TextView) view.findViewById(R.id.textViewResPtsB9);
        textResTotal = (TextView) view.findViewById(R.id.textViewResTotal);

        return view;
    }

    // This method puts the scores into the TextViews, using the Game object as
    // the argument, the totals have already been calculated, it's only a matter
    // of putting the values into the TextViews.

    public void changeTextProperties(Game G){
        textRes01.setText(G.holes[0].getPointsToString());
        textRes02.setText(G.holes[1].getPointsToString());
        textRes03.setText(G.holes[2].getPointsToString());
        textRes04.setText(G.holes[3].getPointsToString());
        textRes05.setText(G.holes[4].getPointsToString());
        textRes06.setText(G.holes[5].getPointsToString());
        textRes07.setText(G.holes[6].getPointsToString());
        textRes08.setText(G.holes[7].getPointsToString());
        textRes09.setText(G.holes[8].getPointsToString());

        textRes10.setText(G.holes[9].getPointsToString());
        textRes11.setText(G.holes[10].getPointsToString());
        textRes12.setText(G.holes[11].getPointsToString());
        textRes13.setText(G.holes[12].getPointsToString());
        textRes14.setText(G.holes[13].getPointsToString());
        textRes15.setText(G.holes[14].getPointsToString());
        textRes16.setText(G.holes[15].getPointsToString());
        textRes17.setText(G.holes[16].getPointsToString());
        textRes18.setText(G.holes[17].getPointsToString());

        textFront9.setText(G.getFront9Total());
        textBack9.setText(G.getBack9Total());
        textResTotal.setText("TOTAL: " + G.getTotal());
    }
}
