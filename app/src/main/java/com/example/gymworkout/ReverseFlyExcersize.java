package com.example.gymworkout;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class ReverseFlyExcersize extends AppCompatActivity {
VideoView reversefly;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reverse_fly_excersize);
        reversefly=findViewById(R.id.reversefly);
        MediaController mediacontrollar=new MediaController(this);


        reversefly.setMediaController(mediacontrollar);
        mediacontrollar.setAnchorView(reversefly);
        Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/firbaseauthentication-aea98.appspot.com/o/Reverse%20Fly.mp4?alt=media&token=a3532298-b644-4e20-9633-0eca20ed300e");
        reversefly.setVideoURI(uri);
        reversefly.start();
    }
}