package com.example.gymworkout.back;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.gymworkout.R;

public class SingleArmCableRow extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_arm_cable_row);
        VideoView singlerow=findViewById(R.id.singlerow);
        MediaController mediacontrollar=new MediaController(this);

       singlerow.setMediaController(mediacontrollar);
        mediacontrollar.setAnchorView(singlerow);
        Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/firbaseauthentication-aea98.appspot.com/o/back%2Fy2mate.com%20-%20Single%20Arm%20Cable%20Row%20Exercise_360p.mp4?alt=media&token=28dc3ef6-55fe-4837-b3dc-2436cc1a04e2");
        singlerow.setVideoURI(uri);
        singlerow.start();
    }
}