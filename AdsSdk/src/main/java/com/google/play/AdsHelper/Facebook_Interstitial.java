package com.google.play.AdsHelper;

import android.app.Activity;
import android.os.CountDownTimer;
import android.util.Log;

import com.facebook.ads.AbstractAdListener;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.InterstitialAd;
import com.google.play.Listner.OnAdsClickListner;
import com.google.play.Utils.Const;
import com.google.play.Utils.utils;

public class Facebook_Interstitial {

    public static final String TAG = "Facebook_Interstitial";
    public static InterstitialAd interstitialAd = null, interstitialAd1 = null;
    public static Boolean isInterstitialTimerRun = false;

    public static OnAdsClickListner onAdsClickListner = null;

    public static void setOnAdsClickListner(OnAdsClickListner monAdsClickListner) {
        onAdsClickListner = monAdsClickListner;
    }

    public static void loadInterstitial(Activity activity) {
        String adId = utils.get_Facebook_InterstitialAdsId();
        interstitialAd = new com.facebook.ads.InterstitialAd(activity, adId);
        interstitialAd.loadAd(interstitialAd.buildLoadAdConfig().withAdListener(new AbstractAdListener() {
            @Override
            public void onError(Ad ad, AdError error) {
                interstitialAd = null;
                super.onError(ad, error);
                Log.d(TAG, "Facebook_Interstitial loadInterstitial onError");
            }

            @Override
            public void onAdLoaded(Ad ad) {
                super.onAdLoaded(ad);
                Log.d(TAG, "Facebook_Interstitial loadInterstitial onAdLoaded");
            }

            @Override
            public void onInterstitialDismissed(Ad ad) {
                super.onInterstitialDismissed(ad);
                if (onAdsClickListner != null) {
                    onAdsClickListner.OnAdsClick();
                }
                Log.d(TAG, "Facebook_Interstitial loadInterstitial onInterstitialDismissed");
                interstitialAd = null;
            }
        }).build());
    }

    public static void loadInterstitial1(Activity activity) {
        String adId = utils.get_Facebook_InterstitialAdsId();
        interstitialAd1 = new com.facebook.ads.InterstitialAd(activity, adId);
        interstitialAd1.loadAd(interstitialAd1.buildLoadAdConfig().withAdListener(new AbstractAdListener() {
            @Override
            public void onError(Ad ad, AdError error) {
                interstitialAd1 = null;
                super.onError(ad, error);
                Log.d(TAG, "Facebook_Interstitial loadInterstitial1 onError");
            }

            @Override
            public void onAdLoaded(Ad ad) {
                super.onAdLoaded(ad);
                Log.d(TAG, "Facebook_Interstitial loadInterstitial1 onAdLoaded");
            }

            @Override
            public void onInterstitialDismissed(Ad ad) {
                super.onInterstitialDismissed(ad);
                if (onAdsClickListner != null) {
                    onAdsClickListner.OnAdsClick();
                }
                Log.d(TAG, "Facebook_Interstitial loadInterstitial1 onInterstitialDismissed");
                interstitialAd1 = null;
            }
        }).build());
    }


    public static void showInterstitial(Activity activity) {


        if (interstitialAd != null && interstitialAd.isAdLoaded()) {
            interstitialAd.show();
            loadInterstitial1(activity);
        } else {
            if (interstitialAd1 != null && interstitialAd1.isAdLoaded()) {
                interstitialAd1.show();
                loadInterstitial(activity);
            } else {
                startTimerInterstitialLoad(activity);
                Log.d(TAG, "Facebook_Interstitial showInterstitial interstitialAd & interstitialAd1 -> null");
            }

        }
    }


    public static void startTimerInterstitialLoad(Activity activity) {

        if (isInterstitialTimerRun) {
            return;
        }
        isInterstitialTimerRun = true;

        new CountDownTimer(Const.requestLoadTime, 1000) {

            public void onTick(long millisUntilFinished) {

            }

            public void onFinish() {
                loadInterstitial(activity);
                isInterstitialTimerRun = false;
            }

        }.start();
    }

}
