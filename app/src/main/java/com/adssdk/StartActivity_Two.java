package com.adssdk;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.lib.adssdk.Activity.ExitActivity;
import com.lib.adssdk.Activity.PrivacyPolicyActivity;
import com.lib.adssdk.AdsManager.AdsManager;
import com.lib.adssdk.AppUtil;
import com.lib.adssdk.Listner.OnAdsClickListner;

public class StartActivity_Two extends BaseActivity implements View.OnClickListener {


    ImageView start;

    @Override
    protected int getLayoutResourceId() {
        return R.layout.activity_start_two;
    }

    @Override
    protected void init() {
        start = findViewById(R.id.start);
    }

    @Override
    protected void initListner() {

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AdsManager.startBtn(StartActivity_Two.this, new OnAdsClickListner() {
                    @Override
                    public void OnAdsClick() {
                        if (AppUtil.GetOpenMainApp()) {
                            startActivity(new Intent(StartActivity_Two.this, OneBtnActivity_BgBorder.class));
                        } else {
                            checkJumpScreen();
                        }
                    }
                });
            }
        });

        findViewById(R.id.share).setOnClickListener(this);
        findViewById(R.id.rate).setOnClickListener(this);
        findViewById(R.id.policy).setOnClickListener(this);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onResume() {
        super.onResume();
        AdsManager.showNativeBigTop(this, findViewById(R.id.nativeTop));
        AdsManager.showNativeSmallBottom(this, findViewById(R.id.nativeBottom));
        AdsManager.showBgAds(this, findViewById(R.id.bg_layer));
    }

    private void checkJumpScreen() {

        if (AppUtil.GetScreenJump() == 0) {
            startActivity(new Intent(StartActivity_Two.this, OneBtnActivity_BgBorder.class));
        } else if (AppUtil.GetScreenJump() == 1) {
            startActivity(new Intent(StartActivity_Two.this, OneBtnActivity_BgBorder.class));
        } else {
            startActivity(new Intent(StartActivity_Two.this, OneBtnActivity_BgBorder.class));

        }

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.share:
                AppUtil.ShareApp(this);
                break;
            case R.id.rate:
                AppUtil.RateApp(this);
                break;
            case R.id.policy:
                startActivity(new Intent(this, PrivacyPolicyActivity.class));
                break;
        }
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(StartActivity_Two.this, ExitActivity.class);
        startActivity(intent);
    }


}