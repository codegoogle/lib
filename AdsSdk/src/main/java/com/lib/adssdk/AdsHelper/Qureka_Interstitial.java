package com.lib.adssdk.AdsHelper;


import android.app.Activity;
import android.content.Intent;

import com.lib.adssdk.Activity.QurekaActivity;
import com.lib.adssdk.Listner.OnAdsClickListner;


public class Qureka_Interstitial {

    private static final String TAG = "Qureka_Interstitial";

    public static OnAdsClickListner onAdsClickListner = null;

    public static void setOnAdsClickListner(OnAdsClickListner monAdsClickListner) {
        onAdsClickListner = monAdsClickListner;
    }

    public static void showInterstitial(Activity activity) {
        Intent intent = new Intent(activity, QurekaActivity.class);
        intent.putExtra(QurekaActivity.key, QurekaActivity.fragInterstitial);
        activity.startActivity(intent);
        QurekaActivity.setOnAdsClickListner(onAdsClickListner);
        QurekaActivity.isBackPress = false;
    }

}