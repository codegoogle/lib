package com.adssdk;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.VideoView;

import com.lib.adssdk.AdsManager.AdsManager;
import com.lib.adssdk.AppUtil;
import com.lib.adssdk.Listner.OnAdsClickListner;

public class TwoBtnActivity_Video extends BaseActivity implements View.OnClickListener {


    private VideoView videoView;
    private ImageView btnOne;
    private ImageView btnTwo;

    @Override
    protected int getLayoutResourceId() {
        return R.layout.activity_two_btn_video;
    }

    @Override
    protected void init() {
        videoView = findViewById(R.id.videoView);
        btnOne = findViewById(R.id.btnOne);
        btnTwo = findViewById(R.id.btnTwo);
    }

    @Override
    protected void initListner() {
        btnOne.setOnClickListener(this);
        btnTwo.setOnClickListener(this);


        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.two_btn_video);
        videoView.setVideoURI(uri);
        videoView.start();
        videoView.requestFocus();
        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                mediaPlayer.setLooping(true);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
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
        AdsManager.showBgAds(this,findViewById(R.id.bg_layer));
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

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnOne:
                click(view);
                break;
            case R.id.btnTwo:
                click(view);
                break;
        }
    }


    private void click(View view) {
        AppUtil.animationPopUp(TwoBtnActivity_Video.this, view);
        AdsManager.showAdsOnBtnClick(TwoBtnActivity_Video.this, new OnAdsClickListner() {
            @Override
            public void OnAdsClick() {
                startActivity(new Intent(TwoBtnActivity_Video.this, RowBtnActivity.class));
            }
        });
    }
}