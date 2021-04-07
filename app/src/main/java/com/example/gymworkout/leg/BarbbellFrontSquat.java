package com.example.gymworkout.leg;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.gymworkout.R;

public class BarbbellFrontSquat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barbbell_front_squat);
        VideoView videoView=findViewById(R.id.front);
        MediaController mediacontrollar=new MediaController(this);

        videoView.setMediaController(mediacontrollar);
        mediacontrollar.setAnchorView(videoView);
        Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/firbaseauthentication-aea98.appspot.com/o/leg%2Fy2mate.com%20-%20Barbell%20Front%20Squat%20Exercise_360p.mp4?alt=media&token=992a49ef-a60c-420b-8210-2d5fa71c3581");
        videoView.setVideoURI(uri);
        videoView.start();
    }
}