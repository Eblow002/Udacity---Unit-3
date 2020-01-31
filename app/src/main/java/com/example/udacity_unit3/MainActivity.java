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

    public void addThreeForTeamA(View v) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }

    public void addTwoForTeamA(View v) {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }

    public void addOneForTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    public void minThreeForTeamA(View v) {
        scoreTeamA = scoreTeamA - 3;
        displayForTeamA(scoreTeamA);
        if (scoreTeamA < 2) {
            scoreTeamA = 0;
            displayForTeamA(scoreTeamA);
        }
    }

    public void minTwoForTeamA(View v) {
        scoreTeamA = scoreTeamA - 2;
        displayForTeamA(scoreTeamA);
        if (scoreTeamA < 1) {
            scoreTeamA = 0;
            displayForTeamA(scoreTeamA);
        }
    }

    public void minOneForTeamA(View v) {
        scoreTeamA = scoreTeamA - 1;
        displayForTeamA(scoreTeamA);
        if (scoreTeamA < 0) {
            scoreTeamA = 0;
            displayForTeamA(scoreTeamA);
        }
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }


    public void addThreeForTeamB(View v) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }

    public void addTwoForTeamB(View v) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }

    public void addOneForTeamB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    public void minThreeForTeamB(View v) {
        scoreTeamB = scoreTeamB - 3;
        displayForTeamB(scoreTeamB);
        if (scoreTeamB < 2) {
            scoreTeamB = 0;
            displayForTeamB(scoreTeamB);
        }

    }

    public void minTwoForTeamB(View v) {
        scoreTeamB = scoreTeamB - 2;
        displayForTeamB(scoreTeamB);
        if (scoreTeamB < 1) {
            scoreTeamB = 0;
            displayForTeamB(scoreTeamB);
        }
    }

    public void minOneForTeamB(View v) {
        scoreTeamB = scoreTeamB - 1;
        displayForTeamB(scoreTeamB);
        if (scoreTeamB < 0) {
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
        if (pVar1 == 0) {
            findViewById(R.id.P1).setBackgroundColor(Color.RED);
            pVar1 = 1;
        } else if (pVar1 == 1) {
            findViewById(R.id.P1).setBackgroundColor(Color.WHITE);
            pVar1 = 0;
        }
    }

    public void I1(View v) {
        if (iVar1 == 0) {
            findViewById(R.id.I1).setBackgroundColor(Color.RED);
            iVar1 = 1;
        } else if (iVar1 == 1) {
            findViewById(R.id.I1).setBackgroundColor(Color.WHITE);
            iVar1 = 0;
        }
    }

    public void G1(View v) {
        if (gVar1 == 0) {
            findViewById(R.id.G1).setBackgroundColor(Color.RED);
            gVar1 = 1;
        } else if (gVar1 == 1) {
            findViewById(R.id.G1).setBackgroundColor(Color.WHITE);
            gVar1 = 0;
        }
    }

    public void G11(View v) {
        if (gVar11 == 0) {
            findViewById(R.id.G11).setBackgroundColor(Color.RED);
            gVar11 = 1;
        } else if (gVar11 == 1) {
            findViewById(R.id.G11).setBackgroundColor(Color.WHITE);
            gVar11 = 0;
        }
    }

    public void O11(View v) {
        if (oVar11 == 0) {
            findViewById(R.id.O11).setBackgroundColor(Color.RED);
            oVar11 = 1;
        } else if (oVar11 == 1) {
            findViewById(R.id.O11).setBackgroundColor(Color.WHITE);
            oVar11 = 0;
        }
    }

    public void A11(View v) {
        if (aVar11 == 0) {
            findViewById(R.id.A11).setBackgroundColor(Color.RED);
            aVar11 = 1;
        } else if (aVar11 == 1) {
            findViewById(R.id.A11).setBackgroundColor(Color.WHITE);
            aVar11 = 0;
        }
    }

    public void T11(View v) {
        if (tVar11 == 0) {
            findViewById(R.id.T11).setBackgroundColor(Color.RED);
            tVar11 = 1;
        } else if (tVar11 == 1) {
            findViewById(R.id.T11).setBackgroundColor(Color.WHITE);
            tVar11 = 0;
        }
    }

    public void H111(View v) {
        if (hVar111 == 0) {
            findViewById(R.id.H111).setBackgroundColor(Color.RED);
            hVar111 = 1;
        } else if (hVar111 == 1) {
            findViewById(R.id.H111).setBackgroundColor(Color.WHITE);
            hVar111 = 0;
        }
    }

    public void O111(View v) {
        if (oVar111 == 0) {
            findViewById(R.id.O111).setBackgroundColor(Color.RED);
            oVar111 = 1;
        } else if (oVar111 == 1) {
            findViewById(R.id.O111).setBackgroundColor(Color.WHITE);
            oVar111 = 0;
        }
    }

    public void R111(View v) {
        if (rVar111 == 0) {
            findViewById(R.id.R111).setBackgroundColor(Color.RED);
            rVar111 = 1;
        } else if (rVar111 == 1) {
            findViewById(R.id.R111).setBackgroundColor(Color.WHITE);
            rVar111 = 0;
        }
    }

    public void S111(View v) {
        if (sVar111 == 0) {
            findViewById(R.id.S111).setBackgroundColor(Color.RED);
            sVar111 = 1;
        } else if (sVar111 == 1) {
            findViewById(R.id.S111).setBackgroundColor(Color.WHITE);
            sVar111 = 0;
        }
    }

    public void E111(View v) {
        if (eVar111 == 0) {
            findViewById(R.id.E111).setBackgroundColor(Color.RED);
            eVar111 = 1;
        } else if (eVar111 == 1) {
            findViewById(R.id.E111).setBackgroundColor(Color.WHITE);
            eVar111 = 0;
        }
    }


    int pVar2 = 0;
    int iVar2 = 0;
    int gVar2 = 0;

    int gVar22 = 0;
    int oVar22 = 0;
    int aVar22 = 0;
    int tVar22 = 0;

    int hVar222 = 0;
    int oVar222 = 0;
    int rVar222 = 0;
    int sVar222 = 0;
    int eVar222 = 0;

    public void P2(View v) {
        if (pVar2 == 0) {
            findViewById(R.id.P2).setBackgroundColor(Color.RED);
            pVar2 = 1;
        } else if (pVar2 == 1) {
            findViewById(R.id.P2).setBackgroundColor(Color.WHITE);
            pVar2 = 0;
        }
    }

    public void I2(View v) {
        if (iVar2 == 0) {
            findViewById(R.id.I2).setBackgroundColor(Color.RED);
            iVar2 = 1;
        } else if (iVar2 == 1) {
            findViewById(R.id.I2).setBackgroundColor(Color.WHITE);
            iVar2 = 0;
        }
    }

    public void G2(View v) {
        if (gVar2 == 0) {
            findViewById(R.id.G2).setBackgroundColor(Color.RED);
            gVar2 = 1;
        } else if (gVar2 == 1) {
            findViewById(R.id.G2).setBackgroundColor(Color.WHITE);
            gVar2 = 0;
        }
    }

    public void G22(View v) {
        if (gVar22 == 0) {
            findViewById(R.id.G22).setBackgroundColor(Color.RED);
            gVar22 = 1;
        } else if (gVar22 == 1) {
            findViewById(R.id.G22).setBackgroundColor(Color.WHITE);
            gVar22 = 0;
        }
    }

    public void O22(View v) {
        if (oVar22 == 0) {
            findViewById(R.id.O22).setBackgroundColor(Color.RED);
            oVar22 = 1;
        } else if (oVar22 == 1) {
            findViewById(R.id.O22).setBackgroundColor(Color.WHITE);
            oVar22 = 0;
        }
    }

    public void A22(View v) {
        if (aVar22 == 0) {
            findViewById(R.id.A22).setBackgroundColor(Color.RED);
            aVar22 = 1;
        } else if (aVar22 == 1) {
            findViewById(R.id.A22).setBackgroundColor(Color.WHITE);
            aVar22 = 0;
        }
    }

    public void T22(View v) {
        if (tVar22 == 0) {
            findViewById(R.id.T22).setBackgroundColor(Color.RED);
            tVar22 = 1;
        } else if (tVar22 == 1) {
            findViewById(R.id.T22).setBackgroundColor(Color.WHITE);
            tVar22 = 0;
        }
    }

    public void H222(View v) {
        if (hVar222 == 0) {
            findViewById(R.id.H222).setBackgroundColor(Color.RED);
            hVar222 = 1;
        } else if (hVar222 == 1) {
            findViewById(R.id.H222).setBackgroundColor(Color.WHITE);
            hVar222 = 0;
        }
    }

    public void O222(View v) {
        if (oVar222 == 0) {
            findViewById(R.id.O222).setBackgroundColor(Color.RED);
            oVar222 = 1;
        } else if (oVar222 == 1) {
            findViewById(R.id.O222).setBackgroundColor(Color.WHITE);
            oVar222 = 0;
        }
    }

    public void R222(View v) {
        if (rVar222 == 0) {
            findViewById(R.id.R222).setBackgroundColor(Color.RED);
            rVar222 = 1;
        } else if (rVar222 == 1) {
            findViewById(R.id.R222).setBackgroundColor(Color.WHITE);
            rVar222 = 0;
        }
    }

    public void S222(View v) {
        if (sVar222 == 0) {
            findViewById(R.id.S222).setBackgroundColor(Color.RED);
            sVar222 = 1;
        } else if (sVar222 == 1) {
            findViewById(R.id.S222).setBackgroundColor(Color.WHITE);
            sVar222 = 0;
        }
    }

    public void E222(View v) {
        if (eVar222 == 0) {
            findViewById(R.id.E222).setBackgroundColor(Color.RED);
            eVar222 = 1;
        } else if (eVar222 == 1) {
            findViewById(R.id.E222).setBackgroundColor(Color.WHITE);
            eVar222 = 0;
        }
    }


    public void reset(View v) {

        findViewById(R.id.P1).setBackgroundColor(Color.WHITE);
        findViewById(R.id.I1).setBackgroundColor(Color.WHITE);
        findViewById(R.id.G1).setBackgroundColor(Color.WHITE);

        findViewById(R.id.G11).setBackgroundColor(Color.WHITE);
        findViewById(R.id.O11).setBackgroundColor(Color.WHITE);
        findViewById(R.id.A11).setBackgroundColor(Color.WHITE);
        findViewById(R.id.T11).setBackgroundColor(Color.WHITE);

        findViewById(R.id.H111).setBackgroundColor(Color.WHITE);
        findViewById(R.id.O111).setBackgroundColor(Color.WHITE);
        findViewById(R.id.R111).setBackgroundColor(Color.WHITE);
        findViewById(R.id.S111).setBackgroundColor(Color.WHITE);
        findViewById(R.id.E111).setBackgroundColor(Color.WHITE);

        findViewById(R.id.P2).setBackgroundColor(Color.WHITE);
        findViewById(R.id.I2).setBackgroundColor(Color.WHITE);
        findViewById(R.id.G2).setBackgroundColor(Color.WHITE);

        findViewById(R.id.G22).setBackgroundColor(Color.WHITE);
        findViewById(R.id.O22).setBackgroundColor(Color.WHITE);
        findViewById(R.id.A22).setBackgroundColor(Color.WHITE);
        findViewById(R.id.T22).setBackgroundColor(Color.WHITE);

        findViewById(R.id.H222).setBackgroundColor(Color.WHITE);
        findViewById(R.id.O222).setBackgroundColor(Color.WHITE);
        findViewById(R.id.R222).setBackgroundColor(Color.WHITE);
        findViewById(R.id.S222).setBackgroundColor(Color.WHITE);
        findViewById(R.id.E222).setBackgroundColor(Color.WHITE);

        pVar1 = 0;
        iVar1 = 0;
        gVar1 = 0;

        gVar11 = 0;
        oVar11 = 0;
        aVar11 = 0;
        tVar11 = 0;

        hVar111 = 0;
        oVar111 = 0;
        rVar111 = 0;
        sVar111 = 0;
        eVar111 = 0;

        pVar2 = 0;
        iVar2 = 0;
        gVar2 = 0;

        gVar22 = 0;
        oVar22 = 0;
        aVar22 = 0;
        tVar22 = 0;

        hVar222 = 0;
        oVar222 = 0;
        rVar222 = 0;
        sVar222 = 0;
        eVar222 = 0;

        scoreTeamB = 0;
        scoreTeamA = 0;
        displayForTeamB(scoreTeamB);
        displayForTeamA(scoreTeamA);
    }
}
