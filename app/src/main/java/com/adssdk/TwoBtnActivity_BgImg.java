package com.adssdk;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.play.AdsManager.AdsManager;
import com.google.play.AppUtil;
import com.google.play.Listner.OnAdsClickListner;

public class TwoBtnActivity_BgImg extends BaseActivity implements View.OnClickListener {


    private ImageView btnOne;
    private ImageView btnTwo;

    @Override
    protected int getLayoutResourceId() {
        return R.layout.activity_two_btn_bg_img;
    }

    @Override
    protected void init() {
        btnOne = findViewById(R.id.btnOne);
        btnTwo = findViewById(R.id.btnTwo);
    }

    @Override
    protected void initListner() {
        btnOne.setOnClickListener(this);
        btnTwo.setOnClickListener(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    protected void onResume() {
        AdsManager.showNativeBigBounceTop(this, findViewById(R.id.nativeTop));
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
        AppUtil.animationPopUp(TwoBtnActivity_BgImg.this, view);
        AdsManager.showAdsOnBtnClick(TwoBtnActivity_BgImg.this, new OnAdsClickListner() {
            @Override
            public void OnAdsClick() {
                startActivity(new Intent(TwoBtnActivity_BgImg.this, TwoBtnActivity_Video.class));
            }
        });
    }
}