package com.example.gymworkout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.gymworkout.forearm.BarbellReverseWristCurl;
import com.example.gymworkout.forearm.BarbellWristCurl;
import com.example.gymworkout.forearm.BehindTheBackBarbellReversewritCurl;
import com.example.gymworkout.forearm.ReverseEzBarCurl;
import com.example.gymworkout.forearm.ReverseGripwristCurl;

public class ForeArmsActivity extends AppCompatActivity {
   ImageView reversegripwristcurl,reversezcurl,behindthebackbarbellreversewrist,barbellwristcurl,barbellreversewristcurl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fore_arms);
        reversegripwristcurl=findViewById(R.id.reversegripwristcurl);
        reversezcurl=findViewById(R.id.reversezcurl);
        behindthebackbarbellreversewrist=findViewById(R.id.behindthebackbarbellreversewrist);
        barbellwristcurl=findViewById(R.id.barbellwristcurl);
        barbellreversewristcurl=findViewById(R.id.barbellreversewristcurl);



        barbellreversewristcurl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ForeArmsActivity.this, BarbellReverseWristCurl.class));
            }
        });    barbellwristcurl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ForeArmsActivity.this, BarbellWristCurl.class));
            }
        });
              reversegripwristcurl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ForeArmsActivity.this, ReverseGripwristCurl.class));
            }
        });

        reversezcurl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ForeArmsActivity.this, ReverseEzBarCurl.class));
            }
        });

         behindthebackbarbellreversewrist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ForeArmsActivity.this, BehindTheBackBarbellReversewritCurl.class));
            }
        });

    }
}