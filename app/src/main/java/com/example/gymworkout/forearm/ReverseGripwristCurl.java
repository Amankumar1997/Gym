package com.example.gymworkout.forearm;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.gymworkout.R;

public class ReverseGripwristCurl extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reverse_gripwrist_curl);
        VideoView videoView=findViewById(R.id.par);
        MediaController mediacontrollar=new MediaController(this);
        videoView.setMediaController(mediacontrollar);
        mediacontrollar.setAnchorView(videoView);
        Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/firbaseauthentication-aea98.appspot.com/o/forearm%2Fy2mate.com%20-%20Reverse%20Grip%20Wrist%20Curl%20Exercise_360p.mp4?alt=media&token=589adb89-f078-4124-903b-757da268bf66");
        videoView.setVideoURI(uri);
        videoView.start();
    }
}