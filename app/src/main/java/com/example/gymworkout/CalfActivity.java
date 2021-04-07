package com.example.gymworkout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.gymworkout.calf.AnkleCircle;
import com.example.gymworkout.calf.DonkeyCalfRaise;
import com.example.gymworkout.calf.LateralLeapandHop;
import com.example.gymworkout.calf.SeatedCalfRaise;
import com.example.gymworkout.calf.SeatedDumbeltoeRaise;
import com.example.gymworkout.calf.StandingBarbellCalfRaiseonFloor;
import com.example.gymworkout.calf.StraightlegCalfStretch;
import com.example.gymworkout.calf.WideGripJumpSrug;

public class CalfActivity extends AppCompatActivity {
  ImageView widegripjumpsrug, straightlegcalf,standingcalfraiseonfloor,
          seateddumbbelltoeraise,seatedcalfraise,lateraleapandhop,donkeycalfraise,anklecircle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calf);
        widegripjumpsrug=findViewById(R.id.widegripjumpsrug);
        straightlegcalf=findViewById(R.id.straightlegcalf);
        standingcalfraiseonfloor=findViewById(R.id.standingcalfraiseonfloor);
        seateddumbbelltoeraise=findViewById(R.id.seateddumbbelltoeraise);
        seatedcalfraise=findViewById(R.id.seatedcalfraise);
        lateraleapandhop=findViewById(R.id.lateraleapandhop);
        donkeycalfraise=findViewById(R.id.donkeycalfraise);
        anklecircle=findViewById(R.id.anklecircle);

      anklecircle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CalfActivity.this, AnkleCircle.class));
            }
        });
      donkeycalfraise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CalfActivity.this, DonkeyCalfRaise.class));
            }
        });
      lateraleapandhop.setOnClickListener(new View.OnClickListener() {
                @Override
            public void onClick(View v) {
                startActivity(new Intent(CalfActivity.this, LateralLeapandHop.class));
            }
        });
       seatedcalfraise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CalfActivity.this, SeatedCalfRaise.class));
            }
        });
        seateddumbbelltoeraise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CalfActivity.this, SeatedDumbeltoeRaise.class));
            }
        });
        standingcalfraiseonfloor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CalfActivity.this, StandingBarbellCalfRaiseonFloor.class));
            }
        });
        widegripjumpsrug.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CalfActivity.this, WideGripJumpSrug.class));
            }
        });
        straightlegcalf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CalfActivity.this, StraightlegCalfStretch.class));
            }
        });

    }
}