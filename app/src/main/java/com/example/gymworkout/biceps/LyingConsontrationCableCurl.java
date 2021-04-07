package com.example.gymworkout.biceps;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.gymworkout.R;

public class LyingConsontrationCableCurl extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lying_consontration_cable_curl);
        VideoView videoView=findViewById(R.id.mhina);

        MediaController mediacontrollar=new MediaController(this);


        videoView.setMediaController(mediacontrollar);
        mediacontrollar.setAnchorView(videoView);
        Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/firbaseauthentication-aea98.appspot.com/o/biceps%2Fy2mate.com%20-%20Lying%20Concentration%20Cable%20Curl%20Exercise_360p.mp4?alt=media&token=2e74852a-2168-4e81-ab18-33bde4bc51a7");
        videoView.setVideoURI(uri);
        videoView.start();
    }
}