package com.example.gymworkout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.gymworkout.biceps.AlternatingDumbbbellBicepsCurl;
import com.example.gymworkout.biceps.AlternatingInclineDumbbellBiceps;
import com.example.gymworkout.biceps.BarbellBicepsCurl;
import com.example.gymworkout.biceps.BehindTheBAckOneArm;
import com.example.gymworkout.biceps.CableBicepsCurl;
import com.example.gymworkout.biceps.CableHammerCurl;
import com.example.gymworkout.biceps.CloseBodyDumbbellHammer;
import com.example.gymworkout.biceps.CloseGripEzBarBicepsCurl;
import com.example.gymworkout.biceps.DUmbellHammerCurl;
import com.example.gymworkout.biceps.DeadHangBicepsCurl;
import com.example.gymworkout.biceps.DeclineHammerCUrl;
import com.example.gymworkout.biceps.EzBarPrecherCurl;
import com.example.gymworkout.biceps.ForWardBendBicepsCUrl;
import com.example.gymworkout.biceps.HammerCurlToPress;
import com.example.gymworkout.biceps.InclineOffsetThumbDumbbellCurl;
import com.example.gymworkout.biceps.LyingConsontrationCableCurl;
import com.example.gymworkout.biceps.OneArmConsontrationCurl;
import com.example.gymworkout.biceps.StandinEzBArBicepsCurl;
import com.example.gymworkout.biceps.StaticCurl;
import com.example.gymworkout.biceps.WideGripEzBarBicepsCurl;

public class BicepsActivity extends AppCompatActivity {
ImageView alternatinginclinedumbbelbiceps,alternatingdumbbellbicepscurl,barbellbicepscurl,behindthbackonearm,cablecurlbicps,cablehammercurl,
        closebodydumbbellhammer,closegripezbarbiceps,deadhangbicepscurl,declinhammercurl,ezbarprechercurl,forwardbendbicepscurl,
        hammercurltopress,inclineoffsetthumbdumbbellcurl,lyingconsentrationcablecurl,onearmconsiontration,standingezbarbicepscurl,
        widegripezbicepscurl,dumbbelhamrcurl,StaticCurl1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biceps);
        alternatinginclinedumbbelbiceps=findViewById(R.id.alternatinginclinedumbbelbiceps);
        alternatingdumbbellbicepscurl=findViewById(R.id.alternatingdumbbellbicepscurl);
        barbellbicepscurl=findViewById(R.id.barbellbicepscurl);
        behindthbackonearm=findViewById(R.id.behindthbackonearm);
        cablecurlbicps=findViewById(R.id.cablecurlbicps);
        cablehammercurl=findViewById(R.id.cablehammercurl);
        closebodydumbbellhammer=findViewById(R.id.closebodydumbbellhammer);
        closegripezbarbiceps=findViewById(R.id.closegripezbarbiceps);
        deadhangbicepscurl=findViewById(R.id.deadhangbicepscurl);
        declinhammercurl=findViewById(R.id.declinhammercurl);
        ezbarprechercurl=findViewById(R.id.ezbarprechercurl);
        forwardbendbicepscurl=findViewById(R.id.forwardbendbicepscurl);
        hammercurltopress=findViewById(R.id.hammercurltopress);
        inclineoffsetthumbdumbbellcurl=findViewById(R.id.inclineoffsetthumbdumbbellcurl);
        lyingconsentrationcablecurl=findViewById(R.id.lyingconsentrationcablecurl);
        onearmconsiontration=findViewById(R.id.onearmconsiontration);
        standingezbarbicepscurl=findViewById(R.id.standingezbarbicepscurl);
        widegripezbicepscurl=findViewById(R.id.standingezbarbicepscurl);
        dumbbelhamrcurl=findViewById(R.id.dumbbellhammercurl);

        StaticCurl1=findViewById(R.id.staticcurl);

widegripezbicepscurl.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        startActivity(new Intent(BicepsActivity.this, WideGripEzBarBicepsCurl.class));
    }
});

StaticCurl1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        startActivity(new Intent(BicepsActivity.this, StaticCurl.class));
    }
});
standingezbarbicepscurl.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        startActivity(new Intent(BicepsActivity.this, StandinEzBArBicepsCurl.class));
    }
});
onearmconsiontration.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        startActivity(new Intent(BicepsActivity.this, OneArmConsontrationCurl.class));
    }
});

lyingconsentrationcablecurl.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        startActivity(new Intent(BicepsActivity.this, LyingConsontrationCableCurl.class));
    }
});

inclineoffsetthumbdumbbellcurl.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        startActivity(new Intent(BicepsActivity.this, InclineOffsetThumbDumbbellCurl.class));
    }
});

hammercurltopress.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        startActivity(new Intent(BicepsActivity.this, HammerCurlToPress.class));
    }
});
forwardbendbicepscurl.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        startActivity(new Intent(BicepsActivity.this, ForWardBendBicepsCUrl.class));
    }
});

ezbarprechercurl.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        startActivity(new Intent(BicepsActivity.this, EzBarPrecherCurl.class));
    }
});

dumbbelhamrcurl.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        startActivity(new Intent(BicepsActivity.this, DUmbellHammerCurl.class));
    }
});
declinhammercurl.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        startActivity(new Intent(BicepsActivity.this, DeclineHammerCUrl.class));
    }
});
deadhangbicepscurl.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        startActivity(new Intent(BicepsActivity.this, DeadHangBicepsCurl.class));
    }
});
closegripezbarbiceps.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        startActivity(new Intent(BicepsActivity.this, CloseGripEzBarBicepsCurl.class));
    }
});
closebodydumbbellhammer.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        startActivity(new Intent(BicepsActivity.this, CloseBodyDumbbellHammer.class));
    }
});
cablehammercurl.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        startActivity(new Intent(BicepsActivity.this, CableHammerCurl.class));
    }
});
cablecurlbicps.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        startActivity(new Intent(BicepsActivity.this, CableBicepsCurl.class));
    }
});
behindthbackonearm.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        startActivity(new Intent(BicepsActivity.this, BehindTheBAckOneArm.class));
    }
});
barbellbicepscurl.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        startActivity(new Intent(BicepsActivity.this, BarbellBicepsCurl.class));
    }
});
alternatingdumbbellbicepscurl.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        startActivity(new Intent(BicepsActivity.this, AlternatingDumbbbellBicepsCurl.class));
    }
});
alternatinginclinedumbbelbiceps.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        startActivity(new Intent(BicepsActivity.this, AlternatingInclineDumbbellBiceps.class));
    }
});

    }
}