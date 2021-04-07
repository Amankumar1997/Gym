package com.example.gymworkout.abs;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.gymworkout.R;

public class FoamRollarReverseCrunchOnBench extends AppCompatActivity {
VideoView foamrollarreverseonbench;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foam_rollar_reverse_crunch_on_bench);
        foamrollarreverseonbench=findViewById(R.id.foamrollarreverseonbench);
        MediaController mediacontrollar=new MediaController(this);


        foamrollarreverseonbench.setMediaController(mediacontrollar);
        mediacontrollar.setAnchorView(foamrollarreverseonbench);
        Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/firbaseauthentication-aea98.appspot.com/o/abs%2Fy2mate.com%20-%20Foam%20Roller%20Reverse%20Crunch%20on%20Bench%20Exercise_360p.mp4?alt=media&token=83dd01c6-f000-4e2d-9fc4-0ba758ce7e47");
        foamrollarreverseonbench.setVideoURI(uri);
       foamrollarreverseonbench.start();


    }
}