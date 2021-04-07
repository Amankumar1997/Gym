package com.example.gymworkout.biceps;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.gymworkout.R;

public class ForWardBendBicepsCUrl extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_for_ward_bend_biceps_c_url);
        VideoView videoView=findViewById(R.id.chardi);

        MediaController mediacontrollar=new MediaController(this);


        videoView.setMediaController(mediacontrollar);
        mediacontrollar.setAnchorView(videoView);
        Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/firbaseauthentication-aea98.appspot.com/o/biceps%2Fy2mate.com%20-%20Forward%20Bend%20Biceps%20Curl%20Exercise_360p.mp4?alt=media&token=88560d5f-d3bd-4561-aa24-2c7d2f5c6d32");
        videoView.setVideoURI(uri);
        videoView.start();
    }
}