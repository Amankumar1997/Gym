package com.example.gymworkout.abs;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.gymworkout.R;

public class NegativeSitUps extends AppCompatActivity {
VideoView negativesitupsvideo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_negative_sit_ups);
        negativesitupsvideo=findViewById(R.id.negativesitupsvideo);
        MediaController mediacontrollar=new MediaController(this);

        negativesitupsvideo.setMediaController(mediacontrollar);
        mediacontrollar.setAnchorView(negativesitupsvideo);
        Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/firbaseauthentication-aea98.appspot.com/o/abs%2Fy2mate.com%20-%20Negative%20Situp%20Exercise_360p.mp4?alt=media&token=125adfec-e75b-42f8-99b1-ce3578ed039e");
        negativesitupsvideo.setVideoURI(uri);
        negativesitupsvideo.start();
    }
}