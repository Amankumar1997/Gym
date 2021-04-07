package com.example.gymworkout.calf;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.gymworkout.R;

public class StandingBarbellCalfRaiseonFloor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standing_barbell_calf_raiseon_floor);
        VideoView videoView=findViewById(R.id.standing);
        MediaController mediacontrollar=new MediaController(this);

        videoView.setMediaController(mediacontrollar);
        mediacontrollar.setAnchorView(videoView);
        Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/firbaseauthentication-aea98.appspot.com/o/calf%2Fy2mate.com%20-%20Standing%20Barbell%20Calf%20Raise%20on%20Floor%20Exercise_360p.mp4?alt=media&token=593ddd0b-a07a-40c7-b02c-f7bcd4b3465c");
        videoView.setVideoURI(uri);
        videoView.start();
    }
}