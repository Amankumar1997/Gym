package com.example.gymworkout.back;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.gymworkout.R;

public class DumbbelFacePullWithExternalRotation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dumbbel_face_pull_with_external_rotation);
        VideoView videoView=findViewById(R.id.face);
        MediaController mediacontrollar=new MediaController(this);

        videoView.setMediaController(mediacontrollar);
        mediacontrollar.setAnchorView(videoView);
        Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/firbaseauthentication-aea98.appspot.com/o/back%2Fy2mate.com%20-%20Dumbbell%20Face%20Pull%20with%20External%20Rotation%20Exercise_360p.mp4?alt=media&token=685b8298-19a8-418a-ad6c-96f099f98a00");
        videoView.setVideoURI(uri);
        videoView.start();
    }
}