package com.example.gymworkout.abs;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.gymworkout.R;

public class ReversePlankHover extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reverse_plank_hover);
        VideoView reverseplankhover=findViewById(R.id.reverseplankhover);
        MediaController mediacontrollar=new MediaController(this);

        reverseplankhover.setMediaController(mediacontrollar);
        mediacontrollar.setAnchorView(reverseplankhover);
        Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/firbaseauthentication-aea98.appspot.com/o/abs%2Fy2mate.com%20-%20Reverse%20Plank%20Hover%20Exercise_360p.mp4?alt=media&token=ed617e46-3bd2-4656-8dc6-90a744c69cee");
        reverseplankhover.setVideoURI(uri);
        reverseplankhover.start();

    }
}