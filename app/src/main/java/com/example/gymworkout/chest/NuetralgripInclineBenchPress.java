package com.example.gymworkout.chest;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.gymworkout.R;

public class NuetralgripInclineBenchPress extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nuetralgrip_incline_bench_press);
        VideoView videoView=findViewById(R.id.grapes);
        MediaController mediacontrollar=new MediaController(this);

        videoView.setMediaController(mediacontrollar);
        mediacontrollar.setAnchorView(videoView);
        Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/firbaseauthentication-aea98.appspot.com/o/chest%2Fy2mate.com%20-%20Neutral%20Grip%20Dumbbell%20Incline%20Bench%20Press%20Exercise_360p.mp4?alt=media&token=51be475a-9d16-406a-abb2-75958fe202c9");
        videoView.setVideoURI(uri);
        videoView.start();
    }
}