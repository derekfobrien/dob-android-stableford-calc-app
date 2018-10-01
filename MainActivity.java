package com.example.derek.stablefordcalc;

import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

// This is where the app starts, look at the GameFragment class to see where the GameListener came out of

public class MainActivity extends FragmentActivity implements GameFragment.GameListener {

    public Game myGame = new Game();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(String course, String hcap){

        // assigns names for the fragments that the activity will be talking to

        FrontnineFragment frontninefragment = (FrontnineFragment) getSupportFragmentManager().findFragmentById(R.id.frontnine_fragment);
        BacknineFragment backninefragment = (BacknineFragment) getSupportFragmentManager().findFragmentById(R.id.backnine_fragment);
        ResultsFragment resultsfragment = (ResultsFragment) getSupportFragmentManager().findFragmentById(R.id.results_fragment);

        // set the course name and the handicap into the myGame object

        myGame.setCourseName(course);
        myGame.setHandicap(hcap);


        // talk to the Frontnine Fragment and have it put the values of the front 9 holes into the object

        frontninefragment.feedFront9Holes(myGame);

        // talk to the Backnine Fragment and have it put the values of the back 9 holes into the object

        backninefragment.feedBack9Holes(myGame);

        // talk to the Results Fragment and have it fill out the scores

        myGame.calculatePoints();
        myGame.setFront9Total();
        myGame.setBack9Total();

        resultsfragment.changeTextProperties(myGame);

    }

}
