package com.example.gymworkout.chest;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.gymworkout.R;

public class WidgripDeclineBarbbellBecnchPress extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_widgrip_decline_barbbell_becnch_press);
        VideoView videoView=findViewById(R.id.kya);
        MediaController mediacontrollar=new MediaController(this);

        videoView.setMediaController(mediacontrollar);
        mediacontrollar.setAnchorView(videoView);
        Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/firbaseauthentication-aea98.appspot.com/o/chest%2Fy2mate.com%20-%20Wide%20Grip%20Decline%20Barbell%20Bench%20Press%20Exercise_360p.mp4?alt=media&token=bebd332d-310a-4a88-8c66-bbc247541ede");
        videoView.setVideoURI(uri);
        videoView.start();
    }
}