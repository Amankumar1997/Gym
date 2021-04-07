package com.example.gymworkout;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class HinduPushups extends AppCompatActivity {
VideoView hindupushupsvideo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hindu_pushups);
        hindupushupsvideo=findViewById(R.id.hindupushupsvideo);
        MediaController mediacontrollar=new MediaController(this);


        hindupushupsvideo.setMediaController(mediacontrollar);
        mediacontrollar.setAnchorView(hindupushupsvideo);
        Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/firbaseauthentication-aea98.appspot.com/o/y2mate.com%20-%20Hindu%20push%20up%20for%20training%20shoulders%20triceps%20and%20chest_360p.mp4?alt=media&token=82aa77ac-56e9-4da4-bb37-8ad306fb1732");
        hindupushupsvideo.setVideoURI(uri);
        hindupushupsvideo.start();
    }
}