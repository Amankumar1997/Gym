package com.example.gymworkout.chest;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.gymworkout.R;

public class InclineSmithMachineBenchPress extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_incline_smith_machine_bench_press);
        VideoView videoView=findViewById(R.id.ignore);
        MediaController mediacontrollar=new MediaController(this);

        videoView.setMediaController(mediacontrollar);
        mediacontrollar.setAnchorView(videoView);
        Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/firbaseauthentication-aea98.appspot.com/o/chest%2Fy2mate.com%20-%20Incline%20Smith%20Machine%20Bench%20Press%20Exercise_360p.mp4?alt=media&token=414bf7f7-696f-492f-b5da-0aaa8fbd6edd");
        videoView.setVideoURI(uri);
        videoView.start();
    }
}