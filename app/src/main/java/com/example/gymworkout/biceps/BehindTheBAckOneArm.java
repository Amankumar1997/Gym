package com.example.gymworkout.biceps;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.gymworkout.R;

public class BehindTheBAckOneArm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_behind_the_b_ack_one_arm);
        VideoView videoView=findViewById(R.id.incline);

        MediaController mediacontrollar=new MediaController(this);


        videoView.setMediaController(mediacontrollar);
        mediacontrollar.setAnchorView(videoView);
        Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/firbaseauthentication-aea98.appspot.com/o/biceps%2Fy2mate.com%20-%20Behind%20the%20Back%20One%20Arm%20Cable%20Curl%20Exercise_360p.mp4?alt=media&token=ef237a06-5263-434c-8c6c-61499f809f84");
        videoView.setVideoURI(uri);
        videoView.start();
    }
}