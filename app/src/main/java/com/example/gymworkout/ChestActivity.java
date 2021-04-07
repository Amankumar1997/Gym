package com.example.gymworkout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.gymworkout.chest.BarbellBoardBenchPress;
import com.example.gymworkout.chest.BarbellInclineBenchPressMediumGrip;
import com.example.gymworkout.chest.BarbellTowlBenchPress;
import com.example.gymworkout.chest.CableCrossOver;
import com.example.gymworkout.chest.DeclineBarbellBenchPress;
import com.example.gymworkout.chest.DumbbellFly;
import com.example.gymworkout.chest.DumbellBenchPress;
import com.example.gymworkout.chest.EzBarPullOver;
import com.example.gymworkout.chest.InclineBarbbellBenchPress;
import com.example.gymworkout.chest.InclineDumbbellBenchPress;
import com.example.gymworkout.chest.InclineSmithMachineBenchPress;
import com.example.gymworkout.chest.NuetralgripInclineBenchPress;
import com.example.gymworkout.chest.NutralGripDumbbelBenchPress;
import com.example.gymworkout.chest.ReverseGripInclineBnechPress;
import com.example.gymworkout.chest.SmithMachineBenchPress;
import com.example.gymworkout.chest.SuspendedPushUps;
import com.example.gymworkout.chest.WidgripDeclineBarbbellBecnchPress;

public class ChestActivity extends AppCompatActivity {
ImageView barbbellboardbenchpress,barbbellinclinebenchpressmediumgrip,barbelltowlbenchpress,cablecrossover,declinebarbellbenchpress,
        dumbbellfly,dumbbellbenchpress,ezbarpullover,inclinedumbbellbenchpress,inclinebarbbellbenchpress,
        inclinesmithmachinebenchpress,nuetralgripinclinebenchpress,nuetralgripdumbbellbenchpress,reversegripinclinebenchpress,
        smithmachinebenchpress,suspendedpushup,widegripdeclinebarbbellbenchpress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chest);
        barbbellboardbenchpress=findViewById(R.id.barbbellboardbenchpress);
        barbbellinclinebenchpressmediumgrip=findViewById(R.id.barbbellinclinebenchpressmediumgrip);
        barbelltowlbenchpress=findViewById(R.id.barbelltowlbenchpress);
        cablecrossover=findViewById(R.id.cablecrossover);
        declinebarbellbenchpress=findViewById(R.id.declinebarbellbenchpress);
        dumbbellfly=findViewById(R.id.dumbbellfly);
        dumbbellbenchpress=findViewById(R.id.dumbbellbenchpress);
        ezbarpullover=findViewById(R.id.ezbarpullover);
        inclinedumbbellbenchpress=findViewById(R.id.inclinedumbbellbenchpress);
        inclinebarbbellbenchpress=findViewById(R.id.inclinebarbbellbenchpress);
        inclinesmithmachinebenchpress=findViewById(R.id.inclinesmithmachinebenchpress);
        nuetralgripinclinebenchpress=findViewById(R.id.nuetralgripinclinebenchpress);
        nuetralgripdumbbellbenchpress=findViewById(R.id.nuetralgripdumbbellbenchpress);
        reversegripinclinebenchpress=findViewById(R.id.reversegripinclinebenchpress);
        smithmachinebenchpress=findViewById(R.id.smithmachinebenchpress);
        widegripdeclinebarbbellbenchpress=findViewById(R.id.widegripdeclinebarbbellbenchpress);
        suspendedpushup=findViewById(R.id.suspendedpushup);


     widegripdeclinebarbbellbenchpress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ChestActivity.this, WidgripDeclineBarbbellBecnchPress.class));
            }
        });
      suspendedpushup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ChestActivity.this, SuspendedPushUps.class));
            }
        });
      smithmachinebenchpress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ChestActivity.this, SmithMachineBenchPress.class));
            }
        });
      reversegripinclinebenchpress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ChestActivity.this, ReverseGripInclineBnechPress.class));
            }
        });
      nuetralgripdumbbellbenchpress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ChestActivity.this, NutralGripDumbbelBenchPress.class));
            }
        });
      nuetralgripinclinebenchpress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ChestActivity.this, NuetralgripInclineBenchPress.class));
            }
        });
      inclinesmithmachinebenchpress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ChestActivity.this, InclineSmithMachineBenchPress.class));
            }
        });
      inclinedumbbellbenchpress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ChestActivity.this, InclineDumbbellBenchPress.class));
            }
        });
      inclinebarbbellbenchpress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ChestActivity.this, InclineBarbbellBenchPress.class));
            }
        });
       ezbarpullover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ChestActivity.this, EzBarPullOver.class));
            }
        });
       dumbbellbenchpress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ChestActivity.this, DumbellBenchPress.class));
            }
        });
       dumbbellfly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ChestActivity.this, DumbbellFly.class));
            }
        });
       declinebarbellbenchpress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ChestActivity.this, DeclineBarbellBenchPress.class));
            }
        });
        cablecrossover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ChestActivity.this, CableCrossOver.class));
            }
        });
        barbelltowlbenchpress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ChestActivity.this, BarbellTowlBenchPress.class));
            }
        });
        barbbellboardbenchpress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ChestActivity.this, BarbellBoardBenchPress.class));
            }
        });
        barbbellinclinebenchpressmediumgrip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ChestActivity.this, BarbellInclineBenchPressMediumGrip.class));
            }
        });
    }
}