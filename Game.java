package com.example.derek.stablefordcalc;

import android.widget.Toast;

/**
 * Created by Derek on 22/09/2018.
 */

public class Game {
    private String courseName;
    private int Handicap;
    private int front9Total;
    private int back9Total;
    private int Total;
    public Hole[] holes = new Hole[18];

    public Game(){
        // Create Holes
        for (int i = 0; i < 18; i++){
            holes[i] = new Hole();
        }


    }


    public void setHandicap(String num){
        Handicap = Integer.parseInt(num);
    }

    public void setCourseName(String str){
        courseName = str;
    }

    // this method tots up the calculated Stableford points for the Front 9

    public void setFront9Total(){
        int n = 0;

        for (int i = 0; i < 9; i++){
            n += holes[i].getPoints();
        }

        front9Total = n;
    }

    // this method tots up the calculated Stableford points for the Back 9

    public void setBack9Total(){
        int n = 0;

        for (int i = 9; i < 18; i++){
            n += holes[i].getPoints();
        }

        back9Total = n;
    }

    // this method is called from the FrontnineFragment, once for each hole

    public void setFront9Holes(Hole[] h){
        for (int i = 0; i < 9; i++){
            holes[i].setParSIScore(h[i].getPar(), h[i].getSI(), h[i].getScore());
        }

    }

    // this method is called from the BackFragment, once for each hole

    public void setBack9Holes(Hole[] h){
        for (int i = 0; i < 9; i++){
            holes[i + 9].setParSIScore(h[i].getPar(), h[i].getSI(), h[i].getScore());
        }
    }

    // this method calls the Hole.setPoints() method once for each hole,
    // to calculate the Stableford points

    public void calculatePoints(){
        for (int i = 0; i < 18; i++){
            holes[i].setPoints(Handicap);
        }
    }

    public String getFront9Total(){
        front9Total = 0;
        for (int i = 0; i < 9; i++){
            front9Total += holes[i].getPoints();
        }
        return Integer.toString(front9Total);
    }

    public String getBack9Total(){
        back9Total = 0;
        for (int i = 9; i < 18; i++){
            back9Total += holes[i].getPoints();
        }
        return Integer.toString(back9Total);
    }

    public String getTotal(){
        Total = front9Total + back9Total;
        return Integer.toString(Total);
    }
}
