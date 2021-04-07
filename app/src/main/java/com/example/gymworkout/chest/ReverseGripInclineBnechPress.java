package com.example.gymworkout.chest;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.gymworkout.R;

public class ReverseGripInclineBnechPress extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reverse_grip_incline_bnech_press);
        VideoView videoView=findViewById(R.id.saadi);
        MediaController mediacontrollar=new MediaController(this);

        videoView.setMediaController(mediacontrollar);
        mediacontrollar.setAnchorView(videoView);
        Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/firbaseauthentication-aea98.appspot.com/o/chest%2Fy2mate.com%20-%20Reverse%20Grip%20Incline%20Bench%20Press%20Exercise_360p.mp4?alt=media&token=11848a8b-0d20-490f-bce6-8b42baa9343a");
        videoView.setVideoURI(uri);
        videoView.start();
    }
}