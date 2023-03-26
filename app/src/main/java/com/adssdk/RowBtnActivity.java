package com.adssdk;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.adssdk.Adapter.RecycerViewAdapter;
import com.lib.adssdk.AdsManager.AdsManager;
import com.lib.adssdk.AppUtil;
import com.lib.adssdk.Listner.OnAdsClickListner;

import java.util.ArrayList;

public class RowBtnActivity extends BaseActivity {


    private RecyclerView recyclerView;
    private ArrayList<Integer> list = new ArrayList<>();

    @Override
    protected int getLayoutResourceId() {
        return R.layout.activity_row_btn;
    }

    @Override
    protected void init() {
        recyclerView = findViewById(R.id.recyclerView);
    }

    @Override
    protected void initListner() {
        list.add(R.drawable.row_1);
        list.add(R.drawable.row_2);
//        list.add(-1);
        list.add(R.drawable.row_3);
        list.add(R.drawable.row_4);
//        list.add(-1);
        list.add(R.drawable.row_5);
        list.add(R.drawable.row_6);

        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.hasFixedSize();
        recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
        recyclerView.setAdapter(new RecycerViewAdapter(this, list, R.layout.adapter_row_btn, AnimationObject.AnimationType.none,new RecycerViewAdapter.RecycerViewAdapter_Click() {
            @Override
            public void clickOnRecycerViewAdapter(View v) {
                click(v);
            }
        }));

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    protected void onResume() {
        AdsManager.showNativeSmallTop(this, findViewById(R.id.nativeTop));
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

    private void click(View view) {
        AppUtil.animationPopUp(RowBtnActivity.this, view);
        AdsManager.showAdsOnBtnClick(RowBtnActivity.this, new OnAdsClickListner() {
            @Override
            public void OnAdsClick() {
                startActivity(new Intent(RowBtnActivity.this, ColumnBtnActivity.class));
            }
        });
    }
}