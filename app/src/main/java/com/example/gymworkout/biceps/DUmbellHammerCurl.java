package com.example.gymworkout.biceps;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.gymworkout.R;

public class DUmbellHammerCurl extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d_umbell_hammer_curl);
        VideoView videoView=findViewById(R.id.hammercurl);

        MediaController mediacontrollar=new MediaController(this);


        videoView.setMediaController(mediacontrollar);
        mediacontrollar.setAnchorView(videoView);
        Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/firbaseauthentication-aea98.appspot.com/o/biceps%2Fy2mate.com%20-%20Dumbbell%20Hammer%20Curl%20Exercise_360p.mp4?alt=media&token=73f4b225-4306-4994-910a-c2e093dadb6c");
        videoView.setVideoURI(uri);
        videoView.start();

    }
}