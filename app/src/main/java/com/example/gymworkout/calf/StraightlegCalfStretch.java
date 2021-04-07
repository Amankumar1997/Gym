package com.example.gymworkout.calf;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.gymworkout.R;

public class StraightlegCalfStretch extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_straightleg_calf_stretch);
        VideoView videoView=findViewById(R.id.straight);
        MediaController mediacontrollar=new MediaController(this);

        videoView.setMediaController(mediacontrollar);
        mediacontrollar.setAnchorView(videoView);
        Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/firbaseauthentication-aea98.appspot.com/o/calf%2Fy2mate.com%20-%20Straight%20Leg%20Calf%20Stretch%20Exercise_360p.mp4?alt=media&token=f8dc25df-0b32-4fd0-b8d6-d3571ae97806");
        videoView.setVideoURI(uri);
        videoView.start();
    }
}