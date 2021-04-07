package com.example.gymworkout.back;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.gymworkout.R;

public class InvertedRow extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inverted_row);
        VideoView row=findViewById(R.id.row);
        MediaController mediacontrollar=new MediaController(this);

        row.setMediaController(mediacontrollar);
        mediacontrollar.setAnchorView(row);
        Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/firbaseauthentication-aea98.appspot.com/o/back%2Fy2mate.com%20-%20Inverted%20Row%20Exercise_360p.mp4?alt=media&token=f3412982-f14f-41f2-aa8c-222ca98e59ad");
        row.setVideoURI(uri);
        row.start();
    }
}