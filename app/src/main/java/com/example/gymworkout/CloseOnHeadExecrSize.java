package com.example.gymworkout;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class CloseOnHeadExecrSize extends AppCompatActivity {
VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_close_on_head_execr_size);
        videoView=findViewById(R.id.closeronhead);

        MediaController mediaController=new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);
        Uri uri=Uri.parse("https://firebasestorage.googleapis.com/v0/b/firbaseauthentication-aea98.appspot.com/o/Closures%20on%20head.mp4?alt=media&token=2b5ee7d8-08bb-46dd-a8d6-c0de918d6fd4");
        videoView.setVideoURI(uri);
        videoView.start();
    }
}