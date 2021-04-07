package com.example.gymworkout.abs;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.gymworkout.R;

public class kneelingAbWhwwlExcersize extends AppCompatActivity {

    VideoView kneelabwhealexcrsize;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kneeling_ab_whwwl_excersize);
        kneelabwhealexcrsize=findViewById(R.id.kneelabwhealexcrsize);
        MediaController mediacontrollar=new MediaController(this);

        kneelabwhealexcrsize.setMediaController(mediacontrollar);
        mediacontrollar.setAnchorView(kneelabwhealexcrsize);
        Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/firbaseauthentication-aea98.appspot.com/o/abs%2Fy2mate.com%20-%20Kneeling%20Ab%20Wheel%20Exercise_360p.mp4?alt=media&token=385ead7a-aafc-4811-b460-c6e676673a1d");
        kneelabwhealexcrsize.setVideoURI(uri);
        kneelabwhealexcrsize.start();
    }
}