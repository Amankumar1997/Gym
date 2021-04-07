package com.example.gymworkout.abs;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.gymworkout.R;

public class FoamRollarReverseCrunchwithmedicineball extends AppCompatActivity {
VideoView foamrollarreversecrunchwithmdicineball;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foam_rollar_reverse_crunchwithmedicineball);
        foamrollarreversecrunchwithmdicineball=findViewById(R.id.foamrollarreversecrunchwithmdicineball);
        MediaController mediacontrollar=new MediaController(this);


        foamrollarreversecrunchwithmdicineball.setMediaController(mediacontrollar);
        mediacontrollar.setAnchorView(foamrollarreversecrunchwithmdicineball);
        Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/firbaseauthentication-aea98.appspot.com/o/abs%2Fy2mate.com%20-%20Foam%20Roller%20Reverse%20Crunch%20with%20Medicine%20Ball%20Exercise_360p.mp4?alt=media&token=066d27cb-6158-4a87-bf15-907cd716048a");
        foamrollarreversecrunchwithmdicineball.setVideoURI(uri);
        foamrollarreversecrunchwithmdicineball.start();
    }
}