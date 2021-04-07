package com.example.gymworkout.leg;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.gymworkout.R;

public class ElevatedFrontFootBarbbellSplitSquat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elevated_front_foot_barbbell_split_squat);
        VideoView videoView=findViewById(R.id.mout);
        MediaController mediacontrollar=new MediaController(this);

        videoView.setMediaController(mediacontrollar);
        mediacontrollar.setAnchorView(videoView);
        Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/firbaseauthentication-aea98.appspot.com/o/leg%2Fy2mate.com%20-%20Elevated%20Front%20Foot%20Barbell%20Split%20Squat%20Exercise_360p.mp4?alt=media&token=742eb224-e1dc-4e26-990f-3eec66b7c913");
        videoView.setVideoURI(uri);
        videoView.start();
    }
}