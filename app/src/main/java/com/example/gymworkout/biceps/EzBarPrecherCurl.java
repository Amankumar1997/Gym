package com.example.gymworkout.biceps;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.gymworkout.R;

public class EzBarPrecherCurl extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ez_bar_precher_curl);
        VideoView videoView=findViewById(R.id.jana);

        MediaController mediacontrollar=new MediaController(this);


        videoView.setMediaController(mediacontrollar);
        mediacontrollar.setAnchorView(videoView);
        Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/firbaseauthentication-aea98.appspot.com/o/biceps%2Fy2mate.com%20-%20EZ%20Bar%20Preacher%20Curl%20Exercise_360p.mp4?alt=media&token=dda0793e-f881-4a1c-90b0-ef8a477c395d");
        videoView.setVideoURI(uri);
        videoView.start();
    }
}