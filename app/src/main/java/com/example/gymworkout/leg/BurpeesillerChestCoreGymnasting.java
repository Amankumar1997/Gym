package com.example.gymworkout.leg;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.gymworkout.R;

public class BurpeesillerChestCoreGymnasting extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_burpeesiller_chest_core_gymnasting);
        VideoView videoView=findViewById(R.id.burpiss);
        MediaController mediacontrollar=new MediaController(this);

        videoView.setMediaController(mediacontrollar);
        mediacontrollar.setAnchorView(videoView);
        Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/firbaseauthentication-aea98.appspot.com/o/leg%2Fy2mate.com%20-%20Burpees%20Killer%20Chest%20%20Core%20gymnastics%20%20workout%20conditioning_360p.mp4?alt=media&token=f6df5c75-747b-4068-b8bf-7ae1f65800f8");
        videoView.setVideoURI(uri);
        videoView.start();

    }
}