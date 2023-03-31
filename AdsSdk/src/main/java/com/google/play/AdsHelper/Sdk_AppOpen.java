package com.google.play.AdsHelper;

import android.app.Activity;
import android.util.Log;

import com.google.play.Utils.utils;
import com.greedygame.core.app_open_ads.general.AdOrientation;
import com.greedygame.core.app_open_ads.general.AppOpenAdsEventsListener;
import com.greedygame.core.app_open_ads.general.GGAppOpenAds;
import com.greedygame.core.models.general.AdErrors;
import com.google.play.Listner.OnAdsClickListner;

public class Sdk_AppOpen {

    private static final String TAG = "Sdk_AppOpen";
    public static Boolean isLoadedappOpenAd = false;
    public static OnAdsClickListner onAdsClickListner = null;

    public static void setOnAdsClickListner(OnAdsClickListner monAdsClickListner) {
        onAdsClickListner = monAdsClickListner;
    }

    public static void loadAppOpen(Activity activity) {

        String adId = utils.get_Sdk_OpenAdsId();
        GGAppOpenAds.setOrientation(AdOrientation.PORTRAIT);
        GGAppOpenAds.setListener(new AppOpenAdsEventsListener() {

            @Override
            public void onAdLoaded() {
                isLoadedappOpenAd = true;
                Log.d(TAG, "Sdk_AppOpen onAdLoaded");
            }

            @Override
            public void onAdLoadFailed(AdErrors cause) {
                Log.d(TAG, "Sdk_AppOpen onAdLoadFailed -> " + cause);
                isLoadedappOpenAd = false;
            }

            @Override
            public void onAdShowFailed() {
                isLoadedappOpenAd = false;
                Log.d(TAG, "Sdk_AppOpen onAdShowFailed -> ");
            }

            @Override
            public void onAdOpened() {
                Log.d(TAG, "Sdk_AppOpen onAdOpened -> ");
            }

            @Override
            public void onAdClosed() {
                Log.d(TAG, "Sdk_AppOpen onAdClosed -> ");
                isLoadedappOpenAd = false;
                GGAppOpenAds.setListener(null);
                loadAppOpen(activity);
                if (onAdsClickListner != null) {
                    onAdsClickListner.OnAdsClick();
                }

            }

        });
        GGAppOpenAds.loadAd(adId);
    }


    public static void showAppOpen(Activity activity) {

        if (!isLoadedappOpenAd) {
            Log.d(TAG, "Sdk_AppOpen showAppOpen null");
//            if (onAdsClickListner != null) {
//                onAdsClickListner.OnAdsClick();
//            }
            loadAppOpen(activity);
            return;
        } else {
            Log.d(TAG, "Sdk_AppOpen showAppOpen");
            GGAppOpenAds.show(activity);
        }

    }

}