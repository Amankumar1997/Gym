package com.example.gymworkout.abs;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.gymworkout.R;

public class CrosPunchRollUps extends AppCompatActivity {
VideoView crosspuchrollupsvideo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cros_punch_roll_ups);
        crosspuchrollupsvideo=findViewById(R.id.crosspuchrollupsvideo);
        MediaController mediacontrollar=new MediaController(this);


       crosspuchrollupsvideo.setMediaController(mediacontrollar);
        mediacontrollar.setAnchorView(crosspuchrollupsvideo);
        Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/firbaseauthentication-aea98.appspot.com/o/abs%2Fy2mate.com%20-%20Cross%20Punch%20Rollup%20Exercise_360p.mp4?alt=media&token=0c635f7e-7ef1-49e8-a26f-136fbf6d4f3c");
       crosspuchrollupsvideo.setVideoURI(uri);
        crosspuchrollupsvideo.start();
    }
}