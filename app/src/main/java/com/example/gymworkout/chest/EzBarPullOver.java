package com.example.gymworkout.chest;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.gymworkout.R;

public class EzBarPullOver extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ez_bar_pull_over);
        VideoView videoView=findViewById(R.id.kho);
        MediaController mediacontrollar=new MediaController(this);

        videoView.setMediaController(mediacontrollar);
        mediacontrollar.setAnchorView(videoView);
        Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/firbaseauthentication-aea98.appspot.com/o/chest%2Fy2mate.com%20-%20EZ%20Bar%20Pullover%20Exercise_360p.mp4?alt=media&token=67f26d87-f20d-49c5-bcf4-22ad15d0b0b8");
        videoView.setVideoURI(uri);
        videoView.start();
    }
}