package com.example.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int teamAScore = 0;
    int teamBScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addThreePointsA(View view){
        teamAScore = teamAScore + 3;
        displayTeamA(teamAScore);
    }
    public void addTwoPointsA(View view){
        teamAScore = teamAScore + 2;
        displayTeamA(teamAScore);
    }
    public void addOnePointA(View view){
        teamAScore = teamAScore + 1;
        displayTeamA(teamAScore);
    }
    public void addThreePointsB(View view){
        teamBScore = teamBScore + 3;
        displayTeamB(teamBScore);
    }
    public void addTwoPointsB(View view){
        teamBScore = teamBScore + 2;
        displayTeamB(teamBScore);
    }
    public void addOnePointB(View view){
        teamBScore = teamBScore + 1;
        displayTeamB(teamBScore);
    }
    public void reset(View view){
        teamBScore = 0;
        teamAScore = 0;
        displayTeamB(teamBScore);
        displayTeamA(teamAScore);
    }


    private void displayTeamA(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.teama_score);
        quantityTextView.setText("" + number);
    }
    private void displayTeamB(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.teamb_score);
        quantityTextView.setText("" + number);
    }

}
