package com.example.derek.stablefordcalc;

import android.content.pm.PackageManager;
import android.os.Bundle;

public class Hole {
    private int SI;
    private int Par;
    private int Score;
    private int Points;

    public Hole(){
        SI = 0;
        Par = 0;
        Score = 0;
        Points = 0;
    }

    public String getSI(){ return Integer.toString(SI); }

    public String getPar(){ return Integer.toString(Par); }

    public String getScore(){ return Integer.toString(Score); }

    public void setParSIScore(String p, String si, String sc){
        Par = Integer.parseInt(p);
        SI = Integer.parseInt(si);
        Score = Integer.parseInt(sc);
    }

    // this method is called 18 times, one for each hole, by the Game class

    public void setPoints(int Handicap) {

        //set the Adjusted Score, by which the par rating is adjusted
        int adjustedScore = 0;
        Points = 0;

        //if no score is returned, set the points to zero
        if (Score == 0) {
            Points = 0;
        }
        else {

            /* where someone is playing off a handicap of between 1 and 18,
            the par rating is adjusted by 1, where the hole's SI is between 1 and
            the handicap number.

            Let's say you're playing off 12, you have one shot extra for
            the holes with SI of 1 to 12; the other holes are not adjusted.

            If you're playing off a handicap of 19 or more, some holes have an adjusted
            score of 2, others are adjusted by 1.

            Here is the step-by-step process for calculating the adjusted score.

            1 - Add 90 to the handicap, and then subtract the hole's SI.
            2 - Divide the result by 18, round it down to the whole number
            3 - Subtract 4. What you get is the adjusted score.

            To calculate the Stableford points:
            1 - Add the adjusted score to the par rating, then add 2.
            2 - Subtract the score.
            3 - If you get a negative value, i.e. < 0, change it to zero.
            4 - That's your Stableford points for the hole!

             */
            adjustedScore = (int)(Math.floor((90 + Handicap - SI) / 18)) - 4;
            Points = 2 + Par + adjustedScore - Score;
            if (Points < 0) {
                Points = 0;
            }

        }
    }

    public int getPoints()
    {
        return Points;
    }

    public String getPointsToString()
    {
        return Integer.toString(Points);
    }

}
