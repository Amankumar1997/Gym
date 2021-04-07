package com.example.gymworkout.leg;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.gymworkout.R;

public class Calfcalves extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calfcalves);
        VideoView videoView=findViewById(R.id.calves);
        MediaController mediacontrollar=new MediaController(this);

        videoView.setMediaController(mediacontrollar);
        mediacontrollar.setAnchorView(videoView);
        Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/firbaseauthentication-aea98.appspot.com/o/leg%2Fy2mate.com%20-%20Exercise%20for%20calf%20%20calves%20how%20to%20get%20calf%20muscles%20bigger%20strong%20slim_360p.mp4?alt=media&token=cdb0946f-5f73-46fc-908d-3aa4c6514cc4");
        videoView.setVideoURI(uri);
        videoView.start();
    }
}