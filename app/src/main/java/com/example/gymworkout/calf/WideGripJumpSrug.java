package com.example.gymworkout.calf;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.gymworkout.R;

public class WideGripJumpSrug extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wide_grip_jump_srug);
        VideoView videoView=findViewById(R.id.srug);
        MediaController mediacontrollar=new MediaController(this);

        videoView.setMediaController(mediacontrollar);
        mediacontrollar.setAnchorView(videoView);
        Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/firbaseauthentication-aea98.appspot.com/o/calf%2Fy2mate.com%20-%20Wide%20Grip%20Jump%20Shrug%20Exercise_360p.mp4?alt=media&token=6388b420-3ce1-4caf-bcc1-3ac11f0b1ff6");
        videoView.setVideoURI(uri);
        videoView.start();
    }
}