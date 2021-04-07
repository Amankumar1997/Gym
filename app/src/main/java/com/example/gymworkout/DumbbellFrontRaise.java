package com.example.gymworkout;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class DumbbellFrontRaise extends AppCompatActivity {
VideoView dumbbelfrontraisevideo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dumbbell_front_raise);
        dumbbelfrontraisevideo=findViewById(R.id.dumbbelfrontraisevideo);
        MediaController mediacontrollar=new MediaController(this);


        dumbbelfrontraisevideo.setMediaController(mediacontrollar);
        mediacontrollar.setAnchorView(dumbbelfrontraisevideo);
        Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/firbaseauthentication-aea98.appspot.com/o/dumbbellfrontraise.mp4?alt=media&token=818f5064-6133-490c-9f6c-11d73477d212");
        dumbbelfrontraisevideo.setVideoURI(uri);
        dumbbelfrontraisevideo.start();
    }
}