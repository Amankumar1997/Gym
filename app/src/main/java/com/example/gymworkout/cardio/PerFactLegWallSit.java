package com.example.gymworkout.cardio;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.gymworkout.R;

public class PerFactLegWallSit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_per_fact_leg_wall_sit);

        VideoView videoView=findViewById(R.id.wallsit);

        MediaController mediacontrollar=new MediaController(this);


        videoView.setMediaController(mediacontrollar);
        mediacontrollar.setAnchorView(videoView);
        Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/firbaseauthentication-aea98.appspot.com/o/cardio%2Fy2mate.com%20-%20How%20To%20Have%20Perfect%20Legs%20Wall%20Sit_360p.mp4?alt=media&token=e1581308-4668-4681-90ff-f906e2ee8660");
        videoView.setVideoURI(uri);
        videoView.start();
    }
}