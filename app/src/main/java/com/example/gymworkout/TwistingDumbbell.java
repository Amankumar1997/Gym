package com.example.gymworkout;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class TwistingDumbbell extends AppCompatActivity {
VideoView TwistingDumbbellvideo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twisting_dumbbell);
        TwistingDumbbellvideo=findViewById(R.id.twistingdumbellvideo);
        MediaController mediacontrollar=new MediaController(this);


        TwistingDumbbellvideo.setMediaController(mediacontrollar);
        mediacontrollar.setAnchorView(TwistingDumbbellvideo);
        Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/firbaseauthentication-aea98.appspot.com/o/Twisting%20Dumbbell%20Shoulder.mp4?alt=media&token=c29e5898-7790-4e39-956f-52ca4f74319b");
        TwistingDumbbellvideo.setVideoURI(uri);
        TwistingDumbbellvideo.start();
    }
}