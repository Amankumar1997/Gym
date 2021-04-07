package com.example.gymworkout.cardio;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.gymworkout.R;

public class HighKneesRunningInPlace extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_high_knees_running_in_place);
       VideoView videoView=findViewById(R.id.high);

        MediaController mediacontrollar=new MediaController(this);


        videoView.setMediaController(mediacontrollar);
        mediacontrollar.setAnchorView(videoView);
        Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/firbaseauthentication-aea98.appspot.com/o/cardio%2Fy2mate.com%20-%20Best%20Cardio%20Exercises%20High%20Knees%20Running%20In%20Place_360p.mp4?alt=media&token=83d49ad6-361b-4e0a-b181-f3aae4c933c8");
        videoView.setVideoURI(uri);
        videoView.start();
    }
}