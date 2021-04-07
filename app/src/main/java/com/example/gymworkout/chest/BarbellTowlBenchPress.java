package com.example.gymworkout.chest;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.gymworkout.R;

public class BarbellTowlBenchPress extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barbell_towl_bench_press);
        VideoView videoView=findViewById(R.id.towl);
        MediaController mediacontrollar=new MediaController(this);

        videoView.setMediaController(mediacontrollar);
        mediacontrollar.setAnchorView(videoView);
        Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/firbaseauthentication-aea98.appspot.com/o/chest%2Fy2mate.com%20-%20Barbell%20Towel%20Bench%20Press%20Exercise_360p.mp4?alt=media&token=4090dce9-e57c-4227-913c-6239f60bc82f");
        videoView.setVideoURI(uri);
        videoView.start();
    }
}