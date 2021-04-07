package com.example.gymworkout.chest;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.gymworkout.R;

public class BarbellInclineBenchPressMediumGrip extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barbell_incline_bench_press_medium_grip);
        VideoView videoView=findViewById(R.id.medium);
        MediaController mediacontrollar=new MediaController(this);

        videoView.setMediaController(mediacontrollar);
        mediacontrollar.setAnchorView(videoView);
        Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/firbaseauthentication-aea98.appspot.com/o/chest%2Fy2mate.com%20-%20Barbell%20Incline%20Bench%20Press%20MediumGrip%20Exercise_360p.mp4?alt=media&token=f5f183a3-14a0-4b46-8c4e-e2ee5e0ba3fc");
        videoView.setVideoURI(uri);
        videoView.start();
    }
}