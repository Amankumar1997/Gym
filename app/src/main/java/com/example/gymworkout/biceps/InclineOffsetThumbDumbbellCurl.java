package com.example.gymworkout.biceps;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.gymworkout.R;

public class InclineOffsetThumbDumbbellCurl extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_incline_offset_thumb_dumbbell_curl);
        VideoView videoView=findViewById(R.id.sardari);

        MediaController mediacontrollar=new MediaController(this);


        videoView.setMediaController(mediacontrollar);
        mediacontrollar.setAnchorView(videoView);
        Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/firbaseauthentication-aea98.appspot.com/o/biceps%2Fy2mate.com%20-%20Incline%20Offset%20Thumb%20Dumbbell%20Curl%20Exercise_360p.mp4?alt=media&token=694af960-e031-49d5-bc71-720688e5a921");
        videoView.setVideoURI(uri);
        videoView.start();
    }
}