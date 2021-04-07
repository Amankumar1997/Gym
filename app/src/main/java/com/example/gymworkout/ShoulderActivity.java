package com.example.gymworkout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ShoulderActivity extends AppCompatActivity {
    ImageView reverseflyimg,dumbbellraisesbent,closeonhead,dumbellshouldpress,dumbbelfrontraise,chestshouldertricpses,twistingdumbbell,hindupushups;
    TextView textViewreversefly;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoulder);
        reverseflyimg=findViewById(R.id.reveseflyimg);
        dumbbellraisesbent=findViewById(R.id.dumbbellraisesbent);
        closeonhead=findViewById(R.id.closeronhead);
        dumbellshouldpress=findViewById(R.id.dumbbelshoulderpresses);
        dumbbelfrontraise=findViewById(R.id.dumbbelfrontraise);
        chestshouldertricpses=findViewById(R.id.chestshouldertricpses);
        twistingdumbbell=findViewById(R.id.twistingdumbell);
        hindupushups=findViewById(R.id.hindupushups);




      hindupushups.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        startActivity(new Intent(ShoulderActivity.this,HinduPushups.class));
    }
});
        twistingdumbbell.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        startActivity(new Intent(ShoulderActivity.this,TwistingDumbbell.class));
    }
});   chestshouldertricpses.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        startActivity(new Intent(ShoulderActivity.this,ChestSholderTriceps.class));
    }
});
dumbbelfrontraise.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        startActivity(new Intent(ShoulderActivity.this,DumbbellFrontRaise.class));
    }
});

        dumbellshouldpress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ShoulderActivity.this,DumbbellShoulderPress.class));
            }
        });closeonhead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ShoulderActivity.this,CloseOnHeadExecrSize.class));
            }
        });
        dumbbellraisesbent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ShoulderActivity.this,Bent_Over_Lateral_raises_incline_bench.class));
            }
        });

        reverseflyimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ShoulderActivity.this,ReverseFlyExcersize.class));
            }
        });
    }
}