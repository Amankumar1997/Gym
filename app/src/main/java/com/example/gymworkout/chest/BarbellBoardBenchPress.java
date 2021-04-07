package com.example.gymworkout.chest;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.gymworkout.R;

public class BarbellBoardBenchPress extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barbell_board_bench_press);
        VideoView videoView=findViewById(R.id.boardb);
        MediaController mediacontrollar=new MediaController(this);

        videoView.setMediaController(mediacontrollar);
        mediacontrollar.setAnchorView(videoView);
        Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/firbaseauthentication-aea98.appspot.com/o/chest%2Fy2mate.com%20-%20Barbell%20Board%20Bench%20Press%20Exercise_360p.mp4?alt=media&token=5771353a-7bf9-40e6-8a63-25ec1fdadedf");
        videoView.setVideoURI(uri);
        videoView.start();
    }
}