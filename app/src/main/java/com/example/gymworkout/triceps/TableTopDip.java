package com.example.gymworkout.triceps;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.gymworkout.R;

public class TableTopDip extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_top_dip);
        VideoView videoView=findViewById(R.id.top);
        MediaController mediacontrollar=new MediaController(this);

        videoView.setMediaController(mediacontrollar);
        mediacontrollar.setAnchorView(videoView);
        Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/firbaseauthentication-aea98.appspot.com/o/triceps%2Fy2mate.com%20-%20Tabletop%20Dip%20Exercise_360p.mp4?alt=media&token=14c00d73-a7ca-4054-aaae-1f166ded80f0");
        videoView.setVideoURI(uri);
        videoView.start();
    }
}