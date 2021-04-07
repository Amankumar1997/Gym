package com.example.gymworkout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.gymworkout.back.BarbellDeadlift;
import com.example.gymworkout.back.ChinUp;
import com.example.gymworkout.back.CrossOvrChinUp;
import com.example.gymworkout.back.DumbbelFacePullWithExternalRotation;
import com.example.gymworkout.back.DumbbellDeadlift;
import com.example.gymworkout.back.ElevatedFeetInvertedRow;
import com.example.gymworkout.back.InvertedRow;
import com.example.gymworkout.back.LatPullDown;
import com.example.gymworkout.back.NuetralGripPullUp;
import com.example.gymworkout.back.RackPull;
import com.example.gymworkout.back.ScapularRetraction;
import com.example.gymworkout.back.SingleArmCableRow;
import com.example.gymworkout.back.ThirtyDeegreeLatPullDown;
import com.example.gymworkout.back.WideGripLatPullDown;

public class BackActivity extends AppCompatActivity {
ImageView barbelldeadlift,chinup,crosschinup,dumbbelfacepulwithexternalroll,dumbbeldeadlift,elevatedfeetinvertedrow,invertedrow,latpulldown,
        nuetralgrippullup,rackpull,scapularretraction,singlearmcablerow,thirtydegreelatpulldown,widegriplatpulldown;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_back);
        barbelldeadlift=findViewById(R.id.barbelldeadlift);
        chinup=findViewById(R.id.chinup);
        crosschinup=findViewById(R.id.crosschinup);
        dumbbelfacepulwithexternalroll=findViewById(R.id.dumbbelfacepulwithexternalroll);
        dumbbeldeadlift=findViewById(R.id.dumbbeldeadlift);
        elevatedfeetinvertedrow=findViewById(R.id.elevatedfeetinvertedrow);
        invertedrow=findViewById(R.id.invertedrow);
        latpulldown=findViewById(R.id.latpulldown);
        nuetralgrippullup=findViewById(R.id.nuetralgrippullup);
        rackpull=findViewById(R.id.rackpull);
        scapularretraction=findViewById(R.id.scapularretraction);
        singlearmcablerow=findViewById(R.id.singlearmcablerow);
        thirtydegreelatpulldown=findViewById(R.id.thirtydegreelatpulldown);
        widegriplatpulldown=findViewById(R.id.widegriplatpulldown);

        barbelldeadlift.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BackActivity.this, BarbellDeadlift.class));
            }
        });
        chinup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BackActivity.this, ChinUp.class));
            }
        });
        crosschinup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BackActivity.this, CrossOvrChinUp.class));
            }
        });
          dumbbelfacepulwithexternalroll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BackActivity.this, DumbbelFacePullWithExternalRotation.class));
            }
        });
         dumbbeldeadlift.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BackActivity.this, DumbbellDeadlift.class));
            }
        });
         elevatedfeetinvertedrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BackActivity.this, ElevatedFeetInvertedRow.class));
            }
        });
         invertedrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BackActivity.this, InvertedRow.class));
            }
        });
         latpulldown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BackActivity.this, LatPullDown.class));
            }
        });
         rackpull.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BackActivity.this, RackPull.class));
            }
        });
         scapularretraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BackActivity.this, ScapularRetraction.class));
            }
        });
         singlearmcablerow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BackActivity.this, SingleArmCableRow.class));
            }
        });
         thirtydegreelatpulldown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BackActivity.this, ThirtyDeegreeLatPullDown.class));
            }
        });
         widegriplatpulldown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BackActivity.this, WideGripLatPullDown.class));
            }
        });
         nuetralgrippullup.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 startActivity(new Intent(BackActivity.this, NuetralGripPullUp.class));
             }
         });





    }
}