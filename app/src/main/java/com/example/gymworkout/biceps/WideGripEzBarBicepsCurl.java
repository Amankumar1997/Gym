package com.example.gymworkout.biceps;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.gymworkout.R;

public class WideGripEzBarBicepsCurl extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wide_grip_ez_bar_biceps_curl);
        VideoView videoView=findViewById(R.id.net);

        MediaController mediacontrollar=new MediaController(this);


        videoView.setMediaController(mediacontrollar);
        mediacontrollar.setAnchorView(videoView);
        Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/firbaseauthentication-aea98.appspot.com/o/biceps%2Fy2mate.com%20-%20Wide%20Grip%20EZ%20Bar%20Biceps%20Curl%20Exercise_360p.mp4?alt=media&token=2f9cf27c-8ce5-4b1e-a01f-2e5b49e3942f");
        videoView.setVideoURI(uri);
        videoView.start();
    }
}