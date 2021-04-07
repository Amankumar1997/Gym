package com.example.gymworkout.abs;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.gymworkout.R;

public class PlankPikes extends AppCompatActivity {
VideoView plankpikes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plank_pikes);
        plankpikes=findViewById(R.id.plankpikes);
        MediaController mediacontrollar=new MediaController(this);

       plankpikes.setMediaController(mediacontrollar);
        mediacontrollar.setAnchorView(plankpikes);
        Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/firbaseauthentication-aea98.appspot.com/o/abs%2Fy2mate.com%20-%20Plank%20Pikes%20Exercise_360p.mp4?alt=media&token=bd64919a-6c08-427e-ab36-8f51d9402473");
        plankpikes.setVideoURI(uri);
        plankpikes.start();
    }
}