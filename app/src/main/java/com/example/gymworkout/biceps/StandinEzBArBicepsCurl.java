package com.example.gymworkout.biceps;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.gymworkout.R;

public class StandinEzBArBicepsCurl extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standin_ez_b_ar_biceps_curl);
        VideoView videoView=findViewById(R.id.kudi);

        MediaController mediacontrollar=new MediaController(this);


        videoView.setMediaController(mediacontrollar);
        mediacontrollar.setAnchorView(videoView);
        Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/firbaseauthentication-aea98.appspot.com/o/biceps%2Fy2mate.com%20-%20Standing%20EZ%20Bar%20Biceps%20Curl%20Exercise_360p.mp4?alt=media&token=243e7c1e-b7b3-4a58-b551-bace3bb9e522");
        videoView.setVideoURI(uri);
        videoView.start();
    }
}