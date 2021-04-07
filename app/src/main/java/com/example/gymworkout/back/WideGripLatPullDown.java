package com.example.gymworkout.back;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.gymworkout.R;

public class WideGripLatPullDown extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wide_grip_lat_pull_down);
        VideoView widegrip=findViewById(R.id.widegrip);
        MediaController mediacontrollar=new MediaController(this);

        widegrip.setMediaController(mediacontrollar);
        mediacontrollar.setAnchorView(widegrip);
        Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/firbaseauthentication-aea98.appspot.com/o/back%2Fy2mate.com%20-%20Wide%20Grip%20Lat%20Pulldown%20Exercise_360p.mp4?alt=media&token=f1738a92-5bb4-4daf-aba7-e734020deb9b");
        widegrip.setVideoURI(uri);
        widegrip.start();
    }
}