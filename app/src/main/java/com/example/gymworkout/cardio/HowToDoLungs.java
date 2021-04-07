package com.example.gymworkout.cardio;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.gymworkout.R;

public class HowToDoLungs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_how_to_do_lungs);
        VideoView videoView=findViewById(R.id.how);

        MediaController mediacontrollar=new MediaController(this);


        videoView.setMediaController(mediacontrollar);
        mediacontrollar.setAnchorView(videoView);
        Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/firbaseauthentication-aea98.appspot.com/o/cardio%2Fy2mate.com%20-%20How%20To%20do%20Lunges_360p.mp4?alt=media&token=14dde236-397c-42a8-ba2e-eb3333568836");
        videoView.setVideoURI(uri);
        videoView.start();

    }
}