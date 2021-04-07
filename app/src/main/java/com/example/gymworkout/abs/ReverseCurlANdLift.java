package com.example.gymworkout.abs;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.gymworkout.R;

public class ReverseCurlANdLift extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reverse_curl_a_nd_lift);
        VideoView revese=findViewById(R.id.reversecurlandlift);

        MediaController mediacontrollar=new MediaController(this);

        revese.setMediaController(mediacontrollar);
        mediacontrollar.setAnchorView(revese);
        Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/firbaseauthentication-aea98.appspot.com/o/abs%2Fy2mate.com%20-%20Reverse%20Curl%20and%20Lift%20Exercise_360p.mp4?alt=media&token=9b128270-0183-4dda-b4e0-131cbaf6ceda");
        revese.setVideoURI(uri);
        revese.start();

    }
}