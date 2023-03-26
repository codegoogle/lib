package com.adssdk;


import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.VideoView;

import com.hanks.htextview.scale.ScaleTextView;
import com.lib.adssdk.AdsManager.AdsManager;
import com.lib.adssdk.AppUtil;
import com.lib.adssdk.Listner.OnAdsClickListner;

public class OneBtnActivity_BgVideo extends BaseActivity {

    private ScaleTextView scaleTextView;
    private VideoView videoView;
    private ImageView next;

    @Override
    protected int getLayoutResourceId() {
        return R.layout.activity_one_btn_bg_video;
    }

    @Override
    protected void init() {
        scaleTextView = findViewById(R.id.scaleTextView);
        videoView = findViewById(R.id.videoView);
        next = findViewById(R.id.next);
    }

    @Override
    protected void initListner() {

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AppUtil.animationPopUp(OneBtnActivity_BgVideo.this, view);
                AdsManager.showAdsOnBtnClick(OneBtnActivity_BgVideo.this, new OnAdsClickListner() {
                    @Override
                    public void OnAdsClick() {
                        startActivity(new Intent(OneBtnActivity_BgVideo.this, OneBtnActivity_Video.class));
                    }
                });
            }
        });


        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.bg_one_btn_video);
        videoView.setVideoURI(uri);
        videoView.start();
        videoView.requestFocus();
        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                float videoWidth = ((float) mediaPlayer.getVideoWidth()) / ((float) mediaPlayer.getVideoHeight());

                float width = (float) videoView.getWidth();
                float height = videoWidth / (width / ((float) videoView.getHeight()));
                if (height >= 1.0f) {
                    videoView.setScaleX(height);
                } else {
                    videoView.setScaleY(1.0f / height);
                }
                mediaPlayer.setLooping(true);
            }
        });

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                scaleTextView.setTextColor(getResources().getColor(R.color.white));
                scaleTextView.animateText("Welcome to");
            }
        }, 500);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                scaleTextView.setTextColor(getResources().getColor(R.color.white));
                scaleTextView.animateText("Caller Screen Theme");
            }
        }, 2500);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                scaleTextView.setTextColor(getResources().getColor(R.color.colorAccent));
                scaleTextView.animateText("Set a live wallpaper,");
            }
        }, 4000);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                scaleTextView.setTextColor(getResources().getColor(R.color.white));
                scaleTextView.animateText("Customize Call Button");
            }
        }, 6500);
    }

    @Override
    protected void onPause() {
        videoView.stopPlayback();
        videoView.start();
        super.onPause();
    }

    @Override
    protected void onResume() {
        if (videoView != null) {
            initListner();
        }
        AdsManager.showNativeSmallBottom(this, findViewById(R.id.nativeBottom));
        AdsManager.showBgAds(this, findViewById(R.id.bg_layer));
        super.onResume();
    }

    @Override
    public void onBackPressed() {
        AdsManager.showBackButtonAd(this, new OnAdsClickListner() {
            @Override
            public void OnAdsClick() {

            }
        });
        super.onBackPressed();
    }
}