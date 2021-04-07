package com.example.gymworkout.biceps;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.gymworkout.R;

public class CloseBodyDumbbellHammer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_close_body_dumbbell_hammer);
        VideoView videoView=findViewById(R.id.closebody);

        MediaController mediacontrollar=new MediaController(this);


        videoView.setMediaController(mediacontrollar);
        mediacontrollar.setAnchorView(videoView);
        Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/firbaseauthentication-aea98.appspot.com/o/biceps%2Fy2mate.com%20-%20Cross%20Body%20Dumbbell%20Hammer%20Curl%20Exercise_360p.mp4?alt=media&token=0f3de0e3-f5d1-4dec-af40-4f30fa034ba2");
        videoView.setVideoURI(uri);
        videoView.start();
    }
}