package com.example.gymworkout.abs;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.gymworkout.R;

public class ReverseCrunchOnBench extends AppCompatActivity {
VideoView revrsecrunchonbench;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reverse_crunch_on_bench);
        revrsecrunchonbench=findViewById(R.id.revrsecrunchonbench);
        MediaController mediacontrollar=new MediaController(this);

        revrsecrunchonbench.setMediaController(mediacontrollar);
        mediacontrollar.setAnchorView(revrsecrunchonbench);
        Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/firbaseauthentication-aea98.appspot.com/o/abs%2Fy2mate.com%20-%20Reverse%20Crunch%20on%20a%20Bench%20Exercise_360p.mp4?alt=media&token=12867021-18fe-451c-919d-a75252458571");
        revrsecrunchonbench.setVideoURI(uri);
        revrsecrunchonbench.start();
    }
}