package com.lib.adssdk.AdsHelper;

import android.app.Activity;
import android.os.CountDownTimer;
import android.util.Log;

import com.greedygame.core.interstitial.general.GGInterstitialAd;
import com.greedygame.core.interstitial.general.GGInterstitialEventsListener;
import com.greedygame.core.models.general.AdErrors;
import com.lib.adssdk.Listner.OnAdsClickListner;
import com.lib.adssdk.Utils.Const;
import com.lib.adssdk.Utils.utils;

public class Sdk_Interstitial {

    public static final String TAG = "Sdk_Interstitial";
    public static GGInterstitialAd interstitialAd = null, interstitialAd1 = null;
    public static OnAdsClickListner onAdsClickListner = null;
    public static Boolean isInterstitialTimerRun = false;

    public static void setOnAdsClickListner(OnAdsClickListner monAdsClickListner) {
        onAdsClickListner = monAdsClickListner;
    }

    public static void loadInterstitial(Activity activity) {

        String adId = utils.get_Sdk_InterstitialAdsId();
        interstitialAd = new GGInterstitialAd(activity, adId);
        interstitialAd.setListener(new GGInterstitialEventsListener() {
            @Override
            public void onAdLoaded() {
                Log.d(TAG, "Sdk_Interstitial loadInterstitial onAdLoaded ");
            }

            @Override
            public void onAdClosed() {
                if (onAdsClickListner != null) {
                    onAdsClickListner.OnAdsClick();
                }
                Log.d(TAG, "Sdk_Interstitial loadInterstitial onAdClosed ");
                interstitialAd.destroy();
                interstitialAd = null;
                loadInterstitial(activity);
//                interstitialAd.loadAd();
            }

            @Override
            public void onAdOpened() {
                Log.d(TAG, "Sdk_Interstitial loadInterstitial onAdOpened ");
            }

            @Override
            public void onAdShowFailed() {
                interstitialAd = null;
                Log.d(TAG, "Sdk_Interstitial loadInterstitial onAdShowFailed ");
            }

            @Override
            public void onAdLoadFailed(AdErrors cause) {
                interstitialAd = null;
                Log.d(TAG, "Sdk_Interstitial loadInterstitial onAdLoadFailed -> " + cause);
            }
        });
        interstitialAd.loadAd();
    }

    public static void loadInterstitial1(Activity activity) {

        String adId = utils.get_Sdk_InterstitialAdsId();
        interstitialAd1 = new GGInterstitialAd(activity, adId);
        interstitialAd1.setListener(new GGInterstitialEventsListener() {
            @Override
            public void onAdLoaded() {
                Log.d(TAG, "Sdk_Interstitial loadInterstitial1 onAdLoaded ");
            }

            @Override
            public void onAdClosed() {
                if (onAdsClickListner != null) {
                    onAdsClickListner.OnAdsClick();
                }
                Log.d(TAG, "Sdk_Interstitial loadInterstitial1 onAdClosed ");
                interstitialAd1.destroy();
                interstitialAd1 = null;
                loadInterstitial1(activity);
            }

            @Override
            public void onAdOpened() {
                Log.d(TAG, "Sdk_Interstitial loadInterstitial1 onAdOpened ");
            }

            @Override
            public void onAdShowFailed() {
                interstitialAd1 = null;
                Log.d(TAG, "Sdk_Interstitial loadInterstitial1 onAdShowFailed ");
            }

            @Override
            public void onAdLoadFailed(AdErrors cause) {
                interstitialAd1 = null;
                Log.d(TAG, "Sdk_Interstitial loadInterstitial1 onAdLoadFailed -> " + cause);
            }
        });
        interstitialAd1.loadAd();
    }

    public static void showInterstitial(Activity activity) {


        if (interstitialAd.isAdLoaded()) {
            interstitialAd.show();
            Log.d(TAG, "Sdk_Interstitial showInterstitial interstitialAd --> 1");
            if (interstitialAd1 == null) {
                loadInterstitial1(activity);
            }
        } else {
            if (interstitialAd1.isAdLoaded()) {
                interstitialAd1.show();
                Log.d(TAG, "Sdk_Interstitial showInterstitial interstitialAd --> 2");
                if (interstitialAd1 == null) {
                    loadInterstitial(activity);
                }
            } else {
                if (!isInterstitialTimerRun) {
                    isInterstitialTimerRun = true;
                    startTimerInterstitialLoad();
                    if (!interstitialAd.isAdLoaded()) {
                        loadInterstitial(activity);
                        Log.d(TAG, "Sdk_Interstitial showInterstitial interstitialAd & interstitialAd1 -> null Send loadInterstitial");
                    }
                }
                Log.d(TAG, "Sdk_Interstitial showInterstitial interstitialAd & interstitialAd1 -> null");
            }
        }

//        if (!isLoaded) {
//            Log.d(TAG, "Sdk_Interstitial showInterstitial interstitialAd null");
//            if (onAdsClickListner != null) {
//                onAdsClickListner.OnAdsClick();
//            }
//            loadInterstitial(activity);
//            return;
//        } else {
//            Log.d(TAG, "Sdk_Interstitial showInterstitial");
//            interstitialAd.show(activity);
//        }
    }


    private static void startTimerInterstitialLoad() {
        new CountDownTimer(Const.requestLoadTime, 1000) {

            public void onTick(long millisUntilFinished) {

            }

            public void onFinish() {
                isInterstitialTimerRun = false;
            }

        }.start();
    }


}
