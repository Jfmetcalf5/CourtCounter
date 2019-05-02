package com.example.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void add3A(View v) {
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }

    public void add2A(View v) {
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }

    public void add1A(View v) {
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void add3B(View v) {
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }

    public void add2B(View v) {
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }

    public void add1B(View v) {
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }

    public void resetScores(View v) {
        scoreTeamA = 0;
        displayForTeamA(scoreTeamA);
        scoreTeamB = 0;
        displayForTeamB(scoreTeamB);

    }
}
