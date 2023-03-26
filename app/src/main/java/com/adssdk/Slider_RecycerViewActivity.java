package com.adssdk;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import com.adssdk.Adapter.RecycerViewAdapter;
import com.adssdk.Adapter.SliderAdapter;
import com.lib.adssdk.AdsManager.AdsManager;
import com.lib.adssdk.AppUtil;
import com.lib.adssdk.Listner.OnAdsClickListner;
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;

public class Slider_RecycerViewActivity extends BaseActivity{

    private ArrayList<Integer> sliderList = new ArrayList<>();
    private ArrayList<Integer> recyclerViewList1 = new ArrayList<>();
    private ArrayList<Integer> recyclerViewList2 = new ArrayList<>();
    private ArrayList<Integer> recyclerViewList3 = new ArrayList<>();
    private SliderView sliderView;
    private RecyclerView recyclerView1;
    private RecyclerView recyclerView2;
    private RecyclerView recyclerView3;

    @Override
    protected int getLayoutResourceId() {
        return R.layout.activity_slider_recycer_view;
    }

    @Override
    protected void init() {
        sliderView = findViewById(R.id.slider);
        recyclerView1 = findViewById(R.id.recyclerView1);
        recyclerView2 = findViewById(R.id.recyclerView2);
        recyclerView3 = findViewById(R.id.recyclerView3);
    }

    @Override
    protected void initListner() {

        //Slider
        sliderList.add(R.drawable.slider_1);
        sliderList.add(R.drawable.slider_2);
        sliderList.add(R.drawable.slider_3);

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


//        R.layout.adapter_slider_recycler_view
        //recyclerView1
        recyclerViewList1.add(R.drawable.sr_1_1);
        recyclerViewList1.add(R.drawable.sr_1_2);
        recyclerViewList1.add(R.drawable.sr_1_3);
        recyclerView1.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));
        recyclerView1.setAdapter(new RecycerViewAdapter(this, recyclerViewList1, R.layout.adapter_slider_recycler_view, AnimationObject.AnimationType.none,new RecycerViewAdapter.RecycerViewAdapter_Click() {
            @Override
            public void clickOnRecycerViewAdapter(View v) {
                click(v);
            }
        }));

        //recyclerView2
        recyclerViewList2.add(R.drawable.sr_2_1);
        recyclerViewList2.add(R.drawable.sr_2_2);
        recyclerViewList2.add(R.drawable.sr_2_3);
        recyclerView2.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));
        recyclerView2.setAdapter(new RecycerViewAdapter(this, recyclerViewList2, R.layout.adapter_slider_recycler_view, AnimationObject.AnimationType.none,new RecycerViewAdapter.RecycerViewAdapter_Click() {
            @Override
            public void clickOnRecycerViewAdapter(View v) {
                click(v);
            }
        }));

        //recyclerView3
        recyclerViewList3.add(R.drawable.sr_3_1);
        recyclerViewList3.add(R.drawable.sr_3_2);
        recyclerViewList3.add(R.drawable.sr_3_3);
        recyclerView3.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));
        recyclerView3.setAdapter(new RecycerViewAdapter(this, recyclerViewList3, R.layout.adapter_slider_recycler_view,AnimationObject.AnimationType.none, new RecycerViewAdapter.RecycerViewAdapter_Click() {
            @Override
            public void clickOnRecycerViewAdapter(View v) {
                click(v);
            }
        }));

    }



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    private void click(View view) {
        AppUtil.animationPopUp(Slider_RecycerViewActivity.this, view);
        AdsManager.showAdsOnBtnClick(Slider_RecycerViewActivity.this, new OnAdsClickListner() {
            @Override
            public void OnAdsClick() {
                startActivity(new Intent(Slider_RecycerViewActivity.this, ChooseRowBtnActivity.class));
            }
        });
    }


    @Override
    protected void onResume() {
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