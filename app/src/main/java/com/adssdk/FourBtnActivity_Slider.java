package com.adssdk;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.adssdk.Adapter.SliderAdapter;
import com.google.play.AdsManager.AdsManager;
import com.google.play.AppUtil;
import com.google.play.Listner.OnAdsClickListner;
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;

public class FourBtnActivity_Slider extends BaseActivity implements View.OnClickListener {

    private ImageView btn1;
    private ImageView btn2;
    private ImageView btn3;
    private ImageView btn4;


    private SliderView sliderView;
    private ArrayList<Integer> sliderList = new ArrayList<>();

    @Override
    protected int getLayoutResourceId() {
        return R.layout.activity_four_btn_slider;
    }

    @Override
    protected void init() {
        sliderView = findViewById(R.id.slider);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
    }

    @Override
    protected void initListner() {

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);

        //Slider
        sliderList.add(R.drawable.four_btn_slider_1);
        sliderList.add(R.drawable.four_btn_slider_1);
        sliderList.add(R.drawable.four_btn_slider_1);

        SliderAdapter adapter = new SliderAdapter(this, sliderList, new SliderAdapter.Slider_Adapter_Click() {
            @Override
            public void clickOnSliderAdapter(View v) {
                click(v);
            }
        });
        sliderView.setSliderAdapter(adapter);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM); //set indicator animation by using IndicatorAnimationType. :WORM or THIN_WORM or COLOR or DROP or FILL or NONE or SCALE or SCALE_DOWN or SLIDE and SWAP!!
        sliderView.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION);
        sliderView.setAutoCycleDirection(SliderView.AUTO_CYCLE_DIRECTION_BACK_AND_FORTH);
        sliderView.setIndicatorSelectedColor(Color.WHITE);
        sliderView.setIndicatorUnselectedColor(Color.GRAY);
        sliderView.setScrollTimeInSec(1);
        sliderView.startAutoCycle();


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

    private void click(View view) {
        AppUtil.animationPopUp(FourBtnActivity_Slider.this, view);
        AdsManager.showAdsOnBtnClick(FourBtnActivity_Slider.this, new OnAdsClickListner() {
            @Override
            public void OnAdsClick() {
//                startActivity(new Intent(FourBtnActivity.this, ColumnBtnActivity.class));
            }
        });
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            default:
                click(view);
                break;
        }
    }
}