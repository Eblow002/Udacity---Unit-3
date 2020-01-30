package com.example.udacity_unit3;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
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

    public void addThreeForTeamA(View v){
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }

    public void addTwoForTeamA(View v){
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }

    public void addOneForTeamA(View v){
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    public void minThreeForTeamA(View v){
        scoreTeamA = scoreTeamA - 3;
        displayForTeamA(scoreTeamA);
        if (scoreTeamA < 2){
            scoreTeamA = 0;
            displayForTeamA(scoreTeamA);
        }
    }

    public void minTwoForTeamA(View v){
        scoreTeamA = scoreTeamA - 2;
        displayForTeamA(scoreTeamA);
        if (scoreTeamA < 1){
            scoreTeamA = 0;
            displayForTeamA(scoreTeamA);
        }
    }

    public void minOneForTeamA(View v){
        scoreTeamA = scoreTeamA - 1;
        displayForTeamA(scoreTeamA);
        if (scoreTeamA < 0){
            scoreTeamA = 0;
            displayForTeamA(scoreTeamA);
        }
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }





    public void addThreeForTeamB(View v){
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB (scoreTeamB);
    }

    public void addTwoForTeamB(View v){
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }

    public void addOneForTeamB(View v){
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    public void minThreeForTeamB(View v){
        scoreTeamB = scoreTeamB - 3;
        displayForTeamB (scoreTeamB);
        if (scoreTeamB < 2){
            scoreTeamB = 0;
            displayForTeamB(scoreTeamB);
        }

    }

    public void minTwoForTeamB(View v){
        scoreTeamB = scoreTeamB - 2;
        displayForTeamB(scoreTeamB);
        if (scoreTeamB < 1){
            scoreTeamB = 0;
            displayForTeamB(scoreTeamB);
        }
    }

    public void minOneForTeamB(View v){
        scoreTeamB = scoreTeamB - 1;
        displayForTeamB(scoreTeamB);
        if (scoreTeamB < 0){
            scoreTeamB = 0;
            displayForTeamB(scoreTeamB);
        }
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }


    public void P(View v) {
        findViewById(R.id.P).setBackgroundColor(Color.RED);
    }









    public void reset(View v){
        scoreTeamB = 0;
        scoreTeamA = 0;
        displayForTeamB(scoreTeamB);
        displayForTeamA(scoreTeamA);
    }
}
