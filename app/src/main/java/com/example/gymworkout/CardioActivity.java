package com.example.gymworkout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.gymworkout.cardio.HighKneesRunningInPlace;
import com.example.gymworkout.cardio.HowToDoLungs;
import com.example.gymworkout.cardio.MountainClimber;
import com.example.gymworkout.cardio.PerFactLegWallSit;

public class CardioActivity extends AppCompatActivity {
   ImageView howtodolungs,highkneesrunninginplace,mountainclimber,perfactlegwallsit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardio);
        howtodolungs=findViewById(R.id.howtodolungs);
        highkneesrunninginplace=findViewById(R.id.highkneesrunninginplace);
        mountainclimber=findViewById(R.id.mountainclimber);
        perfactlegwallsit=findViewById(R.id.perfactlegwallsit);


        perfactlegwallsit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CardioActivity.this, PerFactLegWallSit.class));
            }
        });
        mountainclimber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CardioActivity.this, MountainClimber.class));
            }
        });
        highkneesrunninginplace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CardioActivity.this, HighKneesRunningInPlace.class));
            }
        });
        howtodolungs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CardioActivity.this, HowToDoLungs.class));
            }
        });
    }
}