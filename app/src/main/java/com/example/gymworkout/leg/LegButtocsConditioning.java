package com.example.gymworkout.leg;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.gymworkout.R;

public class LegButtocsConditioning extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leg_buttocs_conditioning);
        VideoView videoView=findViewById(R.id.butt);
        MediaController mediacontrollar=new MediaController(this);

        videoView.setMediaController(mediacontrollar);
        mediacontrollar.setAnchorView(videoView);
        Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/firbaseauthentication-aea98.appspot.com/o/leg%2Fy2mate.com%20-%20Exercise%20for%20Legs%20%20Buttocks%20Conditioning%20Training_360p.mp4?alt=media&token=6599500c-f263-4508-88ff-84348a8a5a43");
        videoView.setVideoURI(uri);
        videoView.start();
    }
}