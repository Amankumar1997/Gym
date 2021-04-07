package com.example.gymworkout.triceps;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.gymworkout.R;

public class ReverseGripPressDown extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reverse_grip_press_down);
        VideoView videoView=findViewById(R.id.press);
        MediaController mediacontrollar=new MediaController(this);

        videoView.setMediaController(mediacontrollar);
        mediacontrollar.setAnchorView(videoView);
        Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/firbaseauthentication-aea98.appspot.com/o/triceps%2Fy2mate.com%20-%20Reverse%20Grip%20Pressdown%20Exercise_360p%20(1).mp4?alt=media&token=076d8e72-75d1-43ba-921a-123d685f2e73");
        videoView.setVideoURI(uri);
        videoView.start();
    }
}