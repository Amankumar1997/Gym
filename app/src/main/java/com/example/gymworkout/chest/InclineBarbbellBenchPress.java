package com.example.gymworkout.chest;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.gymworkout.R;

public class InclineBarbbellBenchPress extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_incline_barbbell_bench_press);
        VideoView videoView=findViewById(R.id.hmm);
        MediaController mediacontrollar=new MediaController(this);

        videoView.setMediaController(mediacontrollar);
        mediacontrollar.setAnchorView(videoView);
        Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/firbaseauthentication-aea98.appspot.com/o/chest%2Fy2mate.com%20-%20Incline%20Barbell%20Bench%20Press%20Exercise_360p.mp4?alt=media&token=fd153727-c440-4244-aac5-b20b20dccc13");
        videoView.setVideoURI(uri);
        videoView.start();
    }
}