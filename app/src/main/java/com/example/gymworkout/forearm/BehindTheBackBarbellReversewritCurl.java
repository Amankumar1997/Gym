package com.example.gymworkout.forearm;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.gymworkout.R;

public class BehindTheBackBarbellReversewritCurl extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_behind_the_back_barbell_reversewrit_curl);
        VideoView videoView=findViewById(R.id.behind);
        MediaController mediacontrollar=new MediaController(this);
        videoView.setMediaController(mediacontrollar);
        mediacontrollar.setAnchorView(videoView);
        Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/firbaseauthentication-aea98.appspot.com/o/forearm%2Fy2mate.com%20-%20Behind%20the%20Back%20Barbell%20Reverse%20Wrist%20Curl%20Exercise_360p.mp4?alt=media&token=595a3a50-6c49-4b68-85f4-760d7148bfde");
        videoView.setVideoURI(uri);
        videoView.start();
    }
}