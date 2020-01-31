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





    int pVar1 = 0;
    int iVar1 = 0;
    int gVar1 = 0;

    int gVar11 = 0;
    int oVar11 = 0;
    int aVar11 = 0;
    int tVar11 = 0;

    int hVar111 = 0;
    int oVar111 = 0;
    int rVar111 = 0;
    int sVar111 = 0;
    int eVar111 = 0;

    public void P1(View v) {
        if (pVar1 == 0){
            findViewById(R.id.P1).setBackgroundColor(Color.RED);
            pVar1 = 1;
        }
        else if (pVar1 == 1){
            findViewById(R.id.P1).setBackgroundColor(Color.WHITE);
            pVar1 = 0;
        }
    }

    public void I1(View v) {
        if (iVar1 == 0){
            findViewById(R.id.I1).setBackgroundColor(Color.RED);
            iVar1 = 1;
        }
        else if (iVar1 == 1){
            findViewById(R.id.I1).setBackgroundColor(Color.WHITE);
            iVar1 = 0;
        }
    }

    public void G1(View v) {
        if (gVar1 == 0){
            findViewById(R.id.G1).setBackgroundColor(Color.RED);
            gVar1 = 1;
        }
        else if (gVar1 == 1){
            findViewById(R.id.G1).setBackgroundColor(Color.WHITE);
            gVar1 = 0;
        }
    }

    public void G11(View v) {
        if (gVar11 == 0){
            findViewById(R.id.G11).setBackgroundColor(Color.RED);
            gVar11 = 1;
        }
        else if (gVar11 == 1){
            findViewById(R.id.G11).setBackgroundColor(Color.WHITE);
            gVar11 = 0;
        }
    }

    public void O11(View v) {
        if (oVar11 == 0){
            findViewById(R.id.O11).setBackgroundColor(Color.RED);
            oVar11 = 1;
        }
        else if (oVar11 == 1){
            findViewById(R.id.O11).setBackgroundColor(Color.WHITE);
            oVar11 = 0;
        }
    }

    public void A11(View v) {
        if (aVar11 == 0){
            findViewById(R.id.A11).setBackgroundColor(Color.RED);
            aVar11 = 1;
        }
        else if (aVar11 == 1){
            findViewById(R.id.A11).setBackgroundColor(Color.WHITE);
            aVar11 = 0;
        }
    }

    public void T11(View v) {
        if (tVar11 == 0){
            findViewById(R.id.T11).setBackgroundColor(Color.RED);
            tVar11 = 1;
        }
        else if (tVar11 == 1){
            findViewById(R.id.T11).setBackgroundColor(Color.WHITE);
            tVar11 = 0;
        }
    }

    public void H111(View v) {
        if (hVar111 == 0){
            findViewById(R.id.H111).setBackgroundColor(Color.RED);
            hVar111 = 1;
        }
        else if (hVar111 == 1){
            findViewById(R.id.H111).setBackgroundColor(Color.WHITE);
            hVar111 = 0;
        }
    }

    public void O111(View v) {
        if (oVar111 == 0){
            findViewById(R.id.O111).setBackgroundColor(Color.RED);
            oVar111 = 1;
        }
        else if (oVar111 == 1){
            findViewById(R.id.O111).setBackgroundColor(Color.WHITE);
            oVar111 = 0;
        }
    }

    public void R111(View v) {
        if (rVar111 == 0){
            findViewById(R.id.R111).setBackgroundColor(Color.RED);
            rVar111 = 1;
        }
        else if (rVar111 == 1){
            findViewById(R.id.R111).setBackgroundColor(Color.WHITE);
            rVar111 = 0;
        }
    }

    public void S111(View v) {
        if (sVar111 == 0){
            findViewById(R.id.S111).setBackgroundColor(Color.RED);
            sVar111 = 1;
        }
        else if (sVar111 == 1){
            findViewById(R.id.S111).setBackgroundColor(Color.WHITE);
            sVar111 = 0;
        }
    }

    public void E111(View v) {
        if (eVar111 == 0){
            findViewById(R.id.E111).setBackgroundColor(Color.RED);
            eVar111 = 1;
        }
        else if (eVar111 == 1){
            findViewById(R.id.E111).setBackgroundColor(Color.WHITE);
            eVar111 = 0;
        }
    }



    public void reset(View v){
        scoreTeamB = 0;
        scoreTeamA = 0;
        displayForTeamB(scoreTeamB);
        displayForTeamA(scoreTeamA);
    }
}
