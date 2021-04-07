package com.example.gymworkout.abs;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.gymworkout.R;

public class MedicineBallvUp extends AppCompatActivity {
VideoView medicineballvup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicine_ballv_up);
        medicineballvup=findViewById(R.id.medicineballvup);
        MediaController mediacontrollar=new MediaController(this);

        medicineballvup.setMediaController(mediacontrollar);
        mediacontrollar.setAnchorView(medicineballvup);
        Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/firbaseauthentication-aea98.appspot.com/o/abs%2Fy2mate.com%20-%20Medicine%20Ball%20V%20Up%20Exercise_360p.mp4?alt=media&token=1f54af1b-7894-4eff-a9b3-c30ac8f0558c");
        medicineballvup.setVideoURI(uri);
        medicineballvup.start();
    }
}