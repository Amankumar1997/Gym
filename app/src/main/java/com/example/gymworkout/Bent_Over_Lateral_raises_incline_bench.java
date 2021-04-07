package com.example.gymworkout;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class Bent_Over_Lateral_raises_incline_bench extends AppCompatActivity {
VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bent__over__lateral_raises_incline_bench);
        videoView=findViewById(R.id.bentoverlateralraisesinclinebench);

        MediaController mediacontrollar=new MediaController(this);


        videoView.setMediaController(mediacontrollar);
        mediacontrollar.setAnchorView(videoView);
        Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/firbaseauthentication-aea98.appspot.com/o/Bent%20over%20lateral%20raises%20on%20incline%20bench.mp4?alt=media&token=7b106029-b799-4054-88bc-ab94921e4920");
        videoView.setVideoURI(uri);
       videoView.start();
    }
}