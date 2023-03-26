package com.adssdk;

import android.app.StatusBarManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Toast;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import com.lib.adssdk.Ads;
import com.lib.adssdk.AdsManager.AdsManager;
import com.lib.adssdk.Listner.OnAdsClickListner;

import java.io.File;

public class SplashActivity extends AppCompatActivity {


    private int flags = View.SYSTEM_UI_FLAG_LAYOUT_STABLE
            | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
            | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
            | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
            | View.SYSTEM_UI_FLAG_FULLSCREEN
            | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY;

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().getDecorView().setSystemUiVisibility(flags);
        if (getSupportActionBar() != null) getSupportActionBar().hide();

        setContentView(R.layout.activity_splash);


//        VideoView videoView = findViewById(R.id.videoView);
//
//        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.splash_video);
//        videoView.setVideoURI(uri);
//        videoView.start();
//        videoView.requestFocus();
//        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
//            @Override
//            public void onPrepared(MediaPlayer mediaPlayer) {
//                mediaPlayer.setLooping(false);
//            }
//        });
//
//        ImageView gif = findViewById(R.id.gif);
//        Glide.with(this).asGif().load(R.drawable.splash_gif).into(gif);


        Ads.init(this, new Ads.AdsInitListner() {
            @Override
            public void onAdsClick() {
                startActivity(new Intent(SplashActivity.this, StartActivity_One.class));
            }

            @Override
            public void successOnAdsInit() {
                Log.d("SpleshActivity", "Api Response received sucessfully");
            }

            @Override
            public void failedOnAdsInit(String error) {
                Log.d("SpleshActivity", "failedOnAdsInit -> " + error);
                startActivity(new Intent(SplashActivity.this, StartActivity_One.class));
            }
        });


    }
}