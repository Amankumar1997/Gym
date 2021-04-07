package com.example.gymworkout.leg;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.gymworkout.R;

public class BiggerHipsButtoucks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bigger_hips_buttoucks);
        VideoView videoView=findViewById(R.id.buttocks);
        MediaController mediacontrollar=new MediaController(this);

        videoView.setMediaController(mediacontrollar);
        mediacontrollar.setAnchorView(videoView);
        Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/firbaseauthentication-aea98.appspot.com/o/leg%2Fy2mate.com%20-%20Female%20Male%20Workout%20exercise%20%20how%20to%20get%20bigger%20hips%20buttocks%20legs_360p.mp4?alt=media&token=a82da0e2-33d6-4428-8693-a851267acb0d");
        videoView.setVideoURI(uri);
        videoView.start();
    }
}