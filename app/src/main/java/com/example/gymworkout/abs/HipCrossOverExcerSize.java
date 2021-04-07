package com.example.gymworkout.abs;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.gymworkout.R;

public class HipCrossOverExcerSize extends AppCompatActivity {
VideoView hipcrossover;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hip_cross_over_excer_size);
        hipcrossover=findViewById(R.id.hipcrossover);
        MediaController mediacontrollar=new MediaController(this);


        hipcrossover.setMediaController(mediacontrollar);
        mediacontrollar.setAnchorView(hipcrossover);
        Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/firbaseauthentication-aea98.appspot.com/o/abs%2Fy2mate.com%20-%20Hip%20Crossover%20Exercise_360p.mp4?alt=media&token=2943ee7f-1820-4e26-98fe-71727bd988e1");
      hipcrossover.setVideoURI(uri);
        hipcrossover.start();
    }
}