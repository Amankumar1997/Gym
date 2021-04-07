package com.example.gymworkout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.gymworkout.triceps.AlternatingDumbbellLying;
import com.example.gymworkout.triceps.DUmbbellKickBack;
import com.example.gymworkout.triceps.DumbellLyingtriceps;
import com.example.gymworkout.triceps.ReverseGripPressDown;
import com.example.gymworkout.triceps.SeatedDumbbellOverHead;
import com.example.gymworkout.triceps.SingleArmDumbbellOverHead;
import com.example.gymworkout.triceps.SingleArmRope;
import com.example.gymworkout.triceps.SwissBallDumbbelllying;
import com.example.gymworkout.triceps.TableTopDip;
import com.example.gymworkout.triceps.TricepsExtentionOnFloor;

public class TricepsActivity extends AppCompatActivity {
ImageView alternatingsumbbellying,dumbbellkickback,dumbbellyingtriceps,reversegrippressdown,seateddumbbelloverhead,
        singlearmdumbbelloverhead,singlearmrope,swissballdumbbellying,tabletopdip,tricepsextentionOnfloor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triceps);
        alternatingsumbbellying=findViewById(R.id.alternatingsumbbellying);
        dumbbellkickback=findViewById(R.id.dumbbellkickback);
        dumbbellyingtriceps=findViewById(R.id.dumbbellyingtriceps);
        reversegrippressdown=findViewById(R.id.reversegrippressdown);
        seateddumbbelloverhead=findViewById(R.id.seateddumbbelloverhead);
        singlearmdumbbelloverhead=findViewById(R.id.singlearmdumbbelloverhead);
        singlearmrope=findViewById(R.id.singlearmrope);
        swissballdumbbellying=findViewById(R.id.swissballdumbbellying);
        tabletopdip=findViewById(R.id.tabletopdip);
        tricepsextentionOnfloor=findViewById(R.id.tricepsextentionOnfloor);

        tricepsextentionOnfloor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TricepsActivity.this, TricepsExtentionOnFloor.class));
            }
        });


        tabletopdip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TricepsActivity.this, TableTopDip.class));
            }
        });

        swissballdumbbellying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TricepsActivity.this, SwissBallDumbbelllying.class));
            }
        });



        singlearmrope.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TricepsActivity.this, SingleArmRope.class));
            }
        });

        singlearmdumbbelloverhead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TricepsActivity.this, SingleArmDumbbellOverHead.class));
            }
        });

        seateddumbbelloverhead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TricepsActivity.this, SeatedDumbbellOverHead.class));
            }
        });

        reversegrippressdown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TricepsActivity.this, ReverseGripPressDown.class));
            }
        });

          dumbbellyingtriceps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TricepsActivity.this, DumbellLyingtriceps.class));
            }
        });


        dumbbellkickback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TricepsActivity.this, DUmbbellKickBack.class));
            }
        });

        alternatingsumbbellying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TricepsActivity.this, AlternatingDumbbellLying.class));
            }
        });
    }
}