package com.example.gymworkout.triceps;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.gymworkout.R;

public class AlternatingDumbbellLying extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alternating_dumbbell_lying);
        VideoView videoView=findViewById(R.id.lying);
        MediaController mediacontrollar=new MediaController(this);

        videoView.setMediaController(mediacontrollar);
        mediacontrollar.setAnchorView(videoView);
        Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/firbaseauthentication-aea98.appspot.com/o/triceps%2Fy2mate.com%20-%20Alternating%20Dumbbell%20Lying%20Triceps%20Extension%20Exercise_360p.mp4?alt=media&token=de68ea76-4027-41a1-8186-bcad2d86e4ef");
        videoView.setVideoURI(uri);
        videoView.start();
    }
}