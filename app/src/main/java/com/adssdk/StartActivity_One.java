package com.adssdk;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.lib.adssdk.Activity.ExitActivity;
import com.lib.adssdk.Activity.PrivacyPolicyActivity;
import com.lib.adssdk.AdsManager.AdsManager;
import com.lib.adssdk.AppUtil;
import com.lib.adssdk.Listner.OnAdsClickListner;

public class StartActivity_One extends BaseActivity implements View.OnClickListener {

    @Override
    protected int getLayoutResourceId() {
        return R.layout.activity_start_one;
    }

    @Override
    protected void init() {
    }

    @Override
    protected void initListner() {

        findViewById(R.id.start).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AdsManager.startBtn(StartActivity_One.this, new OnAdsClickListner() {
                    @Override
                    public void OnAdsClick() {
                        if (AppUtil.GetOpenMainApp()) {
                            Toast.makeText(StartActivity_One.this, "Main App", Toast.LENGTH_SHORT).show();
//                            startActivity(new Intent(StartActivity_One.this, StartActivity_Two.class));
//                            startActivity(new Intent(StartActivity_One.this, OneBtnActivity_BgBorder.class));
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
        Log.d("Kishan","Test");    }

    @Override
    protected void onResume() {
        super.onResume();
        AdsManager.showNativeBigTop(this, findViewById(R.id.nativeTop));
        AdsManager.showNativeSmallBottom(this, findViewById(R.id.nativeBottom));
        AdsManager.showBgAds(this, findViewById(R.id.bg_layer));
    }

    private void checkJumpScreen() {

        if (AppUtil.GetScreenJump() == 0) {
            startActivity(new Intent(StartActivity_One.this, StartActivity_Two.class));
        } else if (AppUtil.GetScreenJump() == 1) {
            startActivity(new Intent(StartActivity_One.this, StartActivity_Two.class));
        } else {
            startActivity(new Intent(StartActivity_One.this, StartActivity_Two.class));
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
        Intent intent = new Intent(StartActivity_One.this, ExitActivity.class);
        startActivity(intent);
    }
}