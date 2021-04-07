package com.example.gymworkout.biceps;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.gymworkout.R;

public class AlternatingInclineDumbbellBiceps extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alternating_incline_dumbbell_biceps);
      VideoView videoView=findViewById(R.id.incline);

        MediaController mediacontrollar=new MediaController(this);


        videoView.setMediaController(mediacontrollar);
        mediacontrollar.setAnchorView(videoView);
        Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/firbaseauthentication-aea98.appspot.com/o/biceps%2Fy2mate.com%20-%20Alternating%20Incline%20Dumbbell%20Biceps%20Curl%20Exercise_360p.mp4?alt=media&token=9a0b2c21-6a32-4890-af3e-d0f417d2bdc1");
        videoView.setVideoURI(uri);
        videoView.start();
    }
}