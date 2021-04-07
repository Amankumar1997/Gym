package com.example.gymworkout.biceps;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.gymworkout.R;

public class DeadHangBicepsCurl extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dead_hang_biceps_curl);
        VideoView videoView=findViewById(R.id.deadhang);

        MediaController mediacontrollar=new MediaController(this);


        videoView.setMediaController(mediacontrollar);
        mediacontrollar.setAnchorView(videoView);
        Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/firbaseauthentication-aea98.appspot.com/o/biceps%2Fy2mate.com%20-%20Dead%20Hang%20Biceps%20Curl%20Exercise_360p.mp4?alt=media&token=9d2344af-6856-4621-90bb-fa4210b25475");
        videoView.setVideoURI(uri);
        videoView.start();
    }
}