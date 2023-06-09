package com.google.play.AdsHelper;


import android.app.Activity;
import android.content.Intent;

import com.google.play.Activity.QurekaActivity;
import com.google.play.Listner.OnAdsClickListner;


public class Qureka_AppOpen {

    private static final String TAG = "AppOpenManager";

    public static OnAdsClickListner onAdsClickListner = null;

    public static void setOnAdsClickListner(OnAdsClickListner monAdsClickListner) {
        onAdsClickListner = monAdsClickListner;
    }

    public static void showAppOpen(Activity activity) {
        Intent intent = new Intent(activity, QurekaActivity.class);
        intent.putExtra(QurekaActivity.key, QurekaActivity.fragAppOpen);
        activity.startActivity(intent);
        QurekaActivity.setOnAdsClickListner(onAdsClickListner);

    }

}