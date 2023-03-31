package com.adssdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.adssdk.Adapter.ChooseRowBtnAdapter;
import com.adssdk.Model.ChooseRowModel;
import com.google.play.AdsManager.AdsManager;
import com.google.play.AppUtil;
import com.google.play.Listner.OnAdsClickListner;

import java.util.ArrayList;

public class ChooseRowBtnActivity extends BaseActivity {


    private RecyclerView recyclerView;
    private ArrayList<ChooseRowModel> unselectedList = new ArrayList<>();
    private ArrayList<ChooseRowModel> selectedList = new ArrayList<>();

    @Override
    protected int getLayoutResourceId() {
        return R.layout.activity_choose_row_btn;
    }

    @Override
    protected void init() {
        recyclerView = findViewById(R.id.recyclerView);
    }

    @Override
    protected void initListner() {
        unselectedList.add(new ChooseRowModel(R.drawable.choose_row_1_unselect, false));
        unselectedList.add(new ChooseRowModel(R.drawable.choose_row_2_unselect, false));
        unselectedList.add(new ChooseRowModel(R.drawable.choose_row_3_unselect, false));
        unselectedList.add(new ChooseRowModel(R.drawable.choose_row_4_unselect, false));
        unselectedList.add(new ChooseRowModel(R.drawable.choose_row_5_unselect, false));
        unselectedList.add(new ChooseRowModel(R.drawable.choose_row_6_unselect, false));
        unselectedList.add(new ChooseRowModel(R.drawable.choose_row_7_unselect, false));


        selectedList.add(new ChooseRowModel(R.drawable.choose_row_1_select, false));
        selectedList.add(new ChooseRowModel(R.drawable.choose_row_2_select, false));
        selectedList.add(new ChooseRowModel(R.drawable.choose_row_3_select, false));
        selectedList.add(new ChooseRowModel(R.drawable.choose_row_4_select, false));
        selectedList.add(new ChooseRowModel(R.drawable.choose_row_5_select, false));
        selectedList.add(new ChooseRowModel(R.drawable.choose_row_6_select, false));
        selectedList.add(new ChooseRowModel(R.drawable.choose_row_7_select, false));

        recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
        recyclerView.setAdapter(new ChooseRowBtnAdapter(this, unselectedList, selectedList,R.layout.adapter_choose_row_btn, new ChooseRowBtnAdapter.ChooseRowBtnAdapter_Click() {
            @Override
            public void clickOnRecycerViewAdapter(View v, Integer pos) {
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
        AppUtil.animationPopUp(ChooseRowBtnActivity.this, view);
        AdsManager.showAdsOnBtnClick(ChooseRowBtnActivity.this, new OnAdsClickListner() {
            @Override
            public void OnAdsClick() {
                startActivity(new Intent(ChooseRowBtnActivity.this, FourBtnActivity.class));
            }
        });
    }
}