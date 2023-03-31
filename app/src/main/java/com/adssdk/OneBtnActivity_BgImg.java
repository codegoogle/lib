package com.adssdk;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;

import com.hanks.htextview.scale.ScaleTextView;
import com.google.play.AdsManager.AdsManager;
import com.google.play.AppUtil;
import com.google.play.Listner.OnAdsClickListner;

public class OneBtnActivity_BgImg extends BaseActivity {


    private ScaleTextView scaleTextView;
    private ImageView next;

    @Override
    protected int getLayoutResourceId() {
        return R.layout.activity_one_btn_bg_img;
    }

    @Override
    protected void init() {
        scaleTextView = findViewById(R.id.scaleTextView);
        next = findViewById(R.id.next);
    }

    @Override
    protected void initListner() {

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AppUtil.animationPopUp(OneBtnActivity_BgImg.this, view);
                AdsManager.showAdsOnBtnClick(OneBtnActivity_BgImg.this, new OnAdsClickListner() {
                    @Override
                    public void OnAdsClick() {
                        startActivity(new Intent(OneBtnActivity_BgImg.this, OneBtnActivity_BgVideo.class));
                    }
                });
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                scaleTextView.animateText("Welcome to");
            }
        }, 500);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                scaleTextView.setTextColor(getResources().getColor(R.color.colorAccent));
                scaleTextView.animateText("Powerful Video Player ");
            }
        }, 2500);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                scaleTextView.setTextColor(getResources().getColor(R.color.colorAccent));
                scaleTextView.animateText("to play videos in all formats");
            }
        }, 4000);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                scaleTextView.setTextColor(getResources().getColor(R.color.black));
                scaleTextView.animateText("Free Movies in all languages");
            }
        }, 6500);
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