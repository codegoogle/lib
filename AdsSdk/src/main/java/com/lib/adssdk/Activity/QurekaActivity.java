package com.lib.adssdk.Activity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.webkit.CookieManager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.lib.adssdk.Listner.OnAdsClickListner;
import com.lib.adssdk.Model.QurekaIntModel;
import com.lib.adssdk.MyApp;
import com.lib.adssdk.R;
import com.lib.adssdk.Utils.Const;
import com.lib.adssdk.Utils.utils;

import java.util.List;

public class QurekaActivity extends AppCompatActivity {

    final int flags = View.SYSTEM_UI_FLAG_LAYOUT_STABLE
            | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
            | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
            | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
            | View.SYSTEM_UI_FLAG_FULLSCREEN
            | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY;


    public static OnAdsClickListner onAdsClickListner = null;

    public static void setOnAdsClickListner(OnAdsClickListner monAdsClickListner) {
        onAdsClickListner = monAdsClickListner;
    }


    public static String fragAppOpen = "FragmentQurekaAppOpen";
    public static String fragInterstitial = "FragmentQurekaInterstitial";
    public static String key = "type";

    public static Boolean comeFromActivity = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        getWindow().getDecorView().setSystemUiVisibility(flags);
        if (getSupportActionBar() != null) getSupportActionBar().hide();
        setContentView(R.layout.activity_qureka);


        String type = getIntent().getStringExtra(key);
        if (type.equals(fragAppOpen)) {
            LoadFragment(new FragmentQurekaAppOpen());
            FragmentQurekaAppOpen.setOnAdsClickListner(onAdsClickListner);
        } else if (type.equals(fragInterstitial)) {

            if (MyApp.getString(Const.qureka_interstitial).equals("")) {
                onAdsClickListner.OnAdsClick();
            } else {

                List<QurekaIntModel> qurekaIntModelList = MyApp.getQurekaIntList();
                if (qurekaIntModelList == null || qurekaIntModelList.isEmpty()) {
                    onAdsClickListner.OnAdsClick();
                } else {
                    String intType = utils.get_Qureka_InterstitialAdsId();
                    if (intType.equals("1")) {
                        LoadFragment(new FragmentQurekaInterstitial_1());
                        FragmentQurekaInterstitial_1.setOnAdsClickListner(onAdsClickListner);
                    } else if (intType.equals("2")) {
                        LoadFragment(new FragmentQurekaInterstitial_2());
                        FragmentQurekaInterstitial_2.setOnAdsClickListner(onAdsClickListner);
                    } else if (intType.equals("3")) {
                        LoadFragment(new FragmentQurekaInterstitial_3());
                        FragmentQurekaInterstitial_3.setOnAdsClickListner(onAdsClickListner);
                    } else if (intType.equals("4")) {
                        LoadFragment(new FragmentQurekaInterstitial_4());
                        FragmentQurekaInterstitial_4.setOnAdsClickListner(onAdsClickListner);
                    }else if (intType.equals("5")) {
                        LoadFragment(new FragmentQurekaInterstitial_5());
                        FragmentQurekaInterstitial_5.setOnAdsClickListner(onAdsClickListner);
                    }else {
                        onAdsClickListner.OnAdsClick();
                    }
                }
            }
        }
    }

    private void LoadFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction().add(R.id.container, fragment).commit();
    }

    public static boolean isBackPress = false;

    @Override
    public void onBackPressed() {
        if (isBackPress) {
            super.onBackPressed();
        }
    }
}