package com.example.gymworkout.abs;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.gymworkout.R;

public class InclineReverseCrunch extends AppCompatActivity {
VideoView inclinrevesercrunch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_incline_reverse_crunch);
        inclinrevesercrunch=findViewById(R.id.inclinrevesercrunch);
        MediaController mediacontrollar=new MediaController(this);


      inclinrevesercrunch.setMediaController(mediacontrollar);
        mediacontrollar.setAnchorView(inclinrevesercrunch);
        Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/firbaseauthentication-aea98.appspot.com/o/abs%2Fy2mate.com%20-%20Incline%20Reverse%20Crunch%20Exercise_360p.mp4?alt=media&token=49ed5d12-180b-4816-bf6c-af4f2825b063");
       inclinrevesercrunch.setVideoURI(uri);
        inclinrevesercrunch.start();

    }
}