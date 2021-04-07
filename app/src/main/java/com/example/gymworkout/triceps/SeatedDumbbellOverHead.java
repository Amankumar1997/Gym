package com.example.gymworkout.triceps;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.gymworkout.R;

public class SeatedDumbbellOverHead extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seated_dumbbell_over_head);
        VideoView videoView=findViewById(R.id.over);
        MediaController mediacontrollar=new MediaController(this);

        videoView.setMediaController(mediacontrollar);
        mediacontrollar.setAnchorView(videoView);
        Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/firbaseauthentication-aea98.appspot.com/o/triceps%2Fy2mate.com%20-%20Seated%20Dumbbell%20Overhead%20Triceps%20Extension%20Exercise_360p.mp4?alt=media&token=0c7a973f-fed7-4c07-ba44-2d75dcd21680");
        videoView.setVideoURI(uri);
        videoView.start();
    }
}