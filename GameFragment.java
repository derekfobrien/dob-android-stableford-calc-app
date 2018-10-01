package com.example.derek.stablefordcalc;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Button;

/*
This class asks the user to enter the name of the course, and the handicap,
and when the scores in the holes are entered, he clicks on the button.
Because this fragment has the button, it needs to talk to the activity,

 */

public class GameFragment extends Fragment{

    private EditText textcoursename;
    private EditText texthandicap;


    // the GameListener interface is how this Fragment talks to the
    // activity, and sends the course name and handicap details into the Game object.
    GameListener activityCallback;

    public interface GameListener{
        public void onButtonClick(String coursename, String handicap);
    }

    @Override
    public void onAttach(Activity activity){
        super.onAttach(activity);
        try{
            activityCallback = (GameListener) activity;
        } catch(ClassCastException e) {
            throw new ClassCastException(activity.toString() + " must implement ToolbarListener");
        }
    }

    // Declare names for the EditTexts and the button when the fragment is created on startup

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.game_fragment, container, false);

        textcoursename = (EditText)view.findViewById(R.id.editTextCourse);
        texthandicap = (EditText)view.findViewById(R.id.editTextHandicap);

       final Button button = (Button)view.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                buttonClicked(v);
            }
        });

        return view;
    }


    // this method is triggered when the button is clicked. It is called by the button's setOnClickListener() method

    public void buttonClicked(View view){
        activityCallback.onButtonClick(textcoursename.getText().toString(), texthandicap.getText().toString());

    }
}
