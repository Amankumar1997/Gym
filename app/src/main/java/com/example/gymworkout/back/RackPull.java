package com.example.gymworkout.back;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.gymworkout.R;

public class RackPull extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rack_pull);
        VideoView rack=findViewById(R.id.rack);
        MediaController mediacontrollar=new MediaController(this);

        rack.setMediaController(mediacontrollar);
        mediacontrollar.setAnchorView(rack);
        Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/firbaseauthentication-aea98.appspot.com/o/back%2Fy2mate.com%20-%20Rack%20Pull%20Exercise_360p.mp4?alt=media&token=1736b45d-0fd9-4e50-8ddf-931a2d8fa641");
        rack.setVideoURI(uri);
       rack.start();
    }
}