package com.example.gymworkout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.gymworkout.leg.BacSquatExcerSize;
import com.example.gymworkout.leg.BarbbellFrontSquat;
import com.example.gymworkout.leg.BarbbellStraightLegDeadLift;
import com.example.gymworkout.leg.BiggerHipsButtoucks;
import com.example.gymworkout.leg.BurpeesillerChestCoreGymnasting;
import com.example.gymworkout.leg.Calfcalves;
import com.example.gymworkout.leg.ElevatedFrontFootBarbbellSplitSquat;
import com.example.gymworkout.leg.HowToDoLungs;
import com.example.gymworkout.leg.HowToHavePerfactLeg;
import com.example.gymworkout.leg.LegButtocsConditioning;
import com.example.gymworkout.leg.TrapBarDeadLift;

public class LegsActivity extends AppCompatActivity {
ImageView backsquat,barbellfrontsquat,barbbellstraightdeadlift,biggerhipsbuttoucs,burpisskillrchest,calfcalves,elevatedfrontbarbbellsplitsquat,
        howtodolungss,howtohaveperfactleg,legbuttocsconditioning,lungsandsquat,trapbardeadlift;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_legs);
        backsquat=findViewById(R.id.backsquat);
        barbellfrontsquat=findViewById(R.id.barbellfrontsquat);
        barbbellstraightdeadlift=findViewById(R.id.barbbellstraightdeadlift);
        biggerhipsbuttoucs=findViewById(R.id.biggerhipsbuttoucs);
        burpisskillrchest=findViewById(R.id.burpisskillrchest);
        calfcalves=findViewById(R.id.calfcalves);
        elevatedfrontbarbbellsplitsquat=findViewById(R.id.elevatedfrontbarbbellsplitsquat);
        howtodolungss=findViewById(R.id.howtodolungss);
        howtohaveperfactleg=findViewById(R.id.howtohaveperfactleg);
        legbuttocsconditioning=findViewById(R.id.legbuttocsconditioning);
        lungsandsquat=findViewById(R.id.lungsandsquat);
        trapbardeadlift=findViewById(R.id.trapbardeadlift);



     trapbardeadlift.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LegsActivity.this, TrapBarDeadLift.class));
            }
        });

     legbuttocsconditioning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LegsActivity.this, LegButtocsConditioning.class));
            }
        });

     howtohaveperfactleg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LegsActivity.this, HowToHavePerfactLeg.class));
            }
        });

       howtodolungss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LegsActivity.this, HowToDoLungs.class));
            }
        });

       elevatedfrontbarbbellsplitsquat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LegsActivity.this, ElevatedFrontFootBarbbellSplitSquat.class));
            }
        });

       calfcalves.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LegsActivity.this, Calfcalves.class));
            }
        });

       burpisskillrchest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LegsActivity.this, BurpeesillerChestCoreGymnasting.class));
            }
        });
            biggerhipsbuttoucs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LegsActivity.this, BiggerHipsButtoucks.class));
            }
        });

       barbbellstraightdeadlift.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LegsActivity.this, BarbbellStraightLegDeadLift.class));
            }
        });

        barbellfrontsquat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LegsActivity.this, BarbbellFrontSquat.class));
            }
        });

        backsquat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LegsActivity.this, BacSquatExcerSize.class));
            }
        });




    }
}