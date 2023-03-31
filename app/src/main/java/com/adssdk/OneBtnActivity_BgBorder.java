package com.adssdk;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.play.AdsManager.AdsManager;
import com.google.play.AppUtil;
import com.google.play.Listner.OnAdsClickListner;

public class OneBtnActivity_BgBorder extends BaseActivity {


    private ImageView next;

    @Override
    protected int getLayoutResourceId() {
        return R.layout.activity_one_btn_bg_border;
    }

    @Override
    protected void init() {
        next = findViewById(R.id.next);
    }

    @Override
    protected void initListner() {

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AppUtil.animationPopUp(OneBtnActivity_BgBorder.this, view);
                AdsManager.showAdsOnBtnClick(OneBtnActivity_BgBorder.this, new OnAdsClickListner() {
                    @Override
                    public void OnAdsClick() {
                        startActivity(new Intent(OneBtnActivity_BgBorder.this, OneBtnActivity_BgImg.class));
                    }
                });
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onResume() {
        AdsManager.showNativeSmallTop(this, findViewById(R.id.nativeTop));
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