package com.example.gymworkout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.gymworkout.abs.CrosPunchRollUps;
import com.example.gymworkout.abs.FoamRollarReverseCrunchOnBench;
import com.example.gymworkout.abs.HipCrossOverExcerSize;
import com.example.gymworkout.abs.InclineReverseCrunch;
import com.example.gymworkout.abs.KneelingobliqueCablecrunch;
import com.example.gymworkout.abs.MedicineBallvUp;
import com.example.gymworkout.abs.NegativeSitUps;
import com.example.gymworkout.abs.PlankPikes;
import com.example.gymworkout.abs.ReverseCrunchOnBench;
import com.example.gymworkout.abs.ReverseCurlANdLift;
import com.example.gymworkout.abs.ReversePlankHover;
import com.example.gymworkout.abs.WeightedSitups;
import com.example.gymworkout.abs.kneelingAbWhwwlExcersize;

import java.util.ArrayList;

public class AbsActivity extends AppCompatActivity {
ImageView weightedsitups,reverseplankhoverimg,reversecurlandbench,reversecrunchonbenchimg,plankpikesimg
        ,negativesitupsimg,medicineballvupomg,kneelingobliqecrunch,
        kneelingabwheal,inclinrevesercrunchimg,hipcrosshoverimg,foamrollarreversecrunchonbench,crosspuchrollups;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abs);
        weightedsitups=findViewById(R.id.weightedsitupsimg);
        reverseplankhoverimg=findViewById(R.id.reverseplankhoverimg);
        reversecurlandbench=findViewById(R.id.reversecurlandbenchimg);
        reversecrunchonbenchimg=findViewById(R.id.reversecrunchonbenchimg);
        plankpikesimg=findViewById(R.id.plankpikesimg);
        negativesitupsimg=findViewById(R.id.negativesitupsimg);
        medicineballvupomg=findViewById(R.id.medicineballvupomg);
        kneelingabwheal=findViewById(R.id.kneelingabwhealimg);
        inclinrevesercrunchimg=findViewById(R.id.inclinrevesercrunchimg);
        hipcrosshoverimg=findViewById(R.id.hipcrosshoverimg);
        foamrollarreversecrunchonbench=findViewById(R.id.foamrollarreversecrunchonbenchimg);
        crosspuchrollups=findViewById(R.id.crosspuchrollupsimg);






        foamrollarreversecrunchonbench.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AbsActivity.this, FoamRollarReverseCrunchOnBench.class));
            }
        });

        crosspuchrollups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AbsActivity.this, CrosPunchRollUps.class));
            }
        });



        hipcrosshoverimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AbsActivity.this, HipCrossOverExcerSize.class));
            }
        });
        inclinrevesercrunchimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AbsActivity.this, InclineReverseCrunch.class));
            }
        });
        kneelingabwheal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AbsActivity.this, kneelingAbWhwwlExcersize.class));
            }
        });


        medicineballvupomg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AbsActivity.this, MedicineBallvUp.class));
            }
        });
 negativesitupsimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AbsActivity.this, NegativeSitUps.class));
            }
        });

        plankpikesimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AbsActivity.this, PlankPikes.class));
            }
        });

        reversecrunchonbenchimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AbsActivity.this, ReverseCrunchOnBench.class));
            }
        });
        reversecurlandbench.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AbsActivity.this, ReverseCurlANdLift.class));
            }
        });
        weightedsitups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AbsActivity.this, WeightedSitups.class));
            }
        });

        reverseplankhoverimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AbsActivity.this, ReversePlankHover.class));
            }
        });
    }
}