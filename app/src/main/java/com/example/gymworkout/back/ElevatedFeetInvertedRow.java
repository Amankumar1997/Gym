package com.example.gymworkout.back;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.gymworkout.R;

public class ElevatedFeetInvertedRow extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elevated_feet_inverted_row);
        VideoView videoView=findViewById(R.id.elvated);
        MediaController mediacontrollar=new MediaController(this);

        videoView.setMediaController(mediacontrollar);
        mediacontrollar.setAnchorView(videoView);
        Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/firbaseauthentication-aea98.appspot.com/o/back%2Fy2mate.com%20-%20Elevated%20Feet%20Inverted%20Row%20Exercise_360p.mp4?alt=media&token=d21e3de9-8712-49d9-8993-c4c203d98d6f");
        videoView.setVideoURI(uri);
        videoView.start();
    }
}