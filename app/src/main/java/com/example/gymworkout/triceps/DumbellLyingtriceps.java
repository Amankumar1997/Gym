package com.example.gymworkout.triceps;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.gymworkout.R;

public class DumbellLyingtriceps extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dumbell_lyingtriceps);
        VideoView videoView=findViewById(R.id.dumb);
        MediaController mediacontrollar=new MediaController(this);

        videoView.setMediaController(mediacontrollar);
        mediacontrollar.setAnchorView(videoView);
        Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/firbaseauthentication-aea98.appspot.com/o/triceps%2Fy2mate.com%20-%20Dumbbell%20Lying%20Triceps%20Extension%20Exercise_360p.mp4?alt=media&token=89cf274f-edcc-40fe-8307-4d2f991ce0ca");
        videoView.setVideoURI(uri);
        videoView.start();
    }
}