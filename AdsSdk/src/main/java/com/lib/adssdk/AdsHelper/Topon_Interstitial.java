package com.lib.adssdk.AdsHelper;

import android.app.Activity;
import android.os.CountDownTimer;
import android.util.Log;

import com.anythink.core.api.ATAdInfo;
import com.anythink.core.api.AdError;
import com.anythink.interstitial.api.ATInterstitial;
import com.anythink.interstitial.api.ATInterstitialListener;
import com.lib.adssdk.Listner.OnAdsClickListner;
import com.lib.adssdk.Utils.Const;
import com.lib.adssdk.Utils.utils;

public class Topon_Interstitial {

    public static final String TAG = "Topon_Interstitial";
    public static ATInterstitial interstitialAd = null;
    public static ATInterstitial interstitialAd1 = null;
    public static Boolean isInterstitialTimerRun = false;

    public static OnAdsClickListner onAdsClickListner = null;

    public static void setOnAdsClickListner(OnAdsClickListner monAdsClickListner) {
        onAdsClickListner = monAdsClickListner;
    }

    public static void loadInterstitial(Activity activity) {

        String adId = utils.get_Topon_InterstitialAdsId();
        interstitialAd = new ATInterstitial(activity, adId);
        interstitialAd.setAdListener(new ATInterstitialListener() {
            @Override
            public void onInterstitialAdLoaded() {
                Log.d(TAG, "Topon_Interstitial loadInterstitial onInterstitialAdLoaded adId -> " + adId);
            }

            @Override
            public void onInterstitialAdLoadFail(AdError adError) {
                interstitialAd = null;
                Log.d(TAG, "Topon_Interstitial loadInterstitial onInterstitialAdLoadFail -> " + adError.getFullErrorInfo());
            }

            @Override
            public void onInterstitialAdClicked(ATAdInfo atAdInfo) {
//                Log.d(TAG, "Topon_Interstitial loadInterstitial onInterstitialAdClicked");
            }

            @Override
            public void onInterstitialAdShow(ATAdInfo atAdInfo) {
//                Log.d(TAG, "Topon_Interstitial loadInterstitial onInterstitialAdShow");
            }

            @Override
            public void onInterstitialAdClose(ATAdInfo atAdInfo) {
//                Log.d(TAG, "Topon_Interstitial loadInterstitial onInterstitialAdClose");
                if (onAdsClickListner != null) {
                    onAdsClickListner.OnAdsClick();
                }
                interstitialAd = null;
            }

            @Override
            public void onInterstitialAdVideoStart(ATAdInfo atAdInfo) {
//                Log.d(TAG, "Topon_Interstitial loadInterstitial onInterstitialAdVideoStart");
            }

            @Override
            public void onInterstitialAdVideoEnd(ATAdInfo atAdInfo) {
//                Log.d(TAG, "Topon_Interstitial loadInterstitial onInterstitialAdVideoEnd");
            }

            @Override
            public void onInterstitialAdVideoError(AdError adError) {
//                Log.d(TAG, "Topon_Interstitial loadInterstitial onInterstitialAdVideoError -> " + adError.getFullErrorInfo());
            }
        });
        interstitialAd.load();
    }


    public static void showInterstitial(Activity activity) {

        boolean isLoaded = false;
        String loadedVari = null;

        if (interstitialAd != null) {
            if (interstitialAd.isAdReady()) {
                isLoaded = true;
                loadedVari = "interstitialAd";
            } else {
                if (interstitialAd1 != null) {
                    if (interstitialAd1.isAdReady()) {
                        loadedVari = "interstitialAd1";
                        isLoaded = true;
                    }
                }
            }
        } else if (interstitialAd1 != null) {
            if (interstitialAd1.isAdReady()) {
                loadedVari = "interstitialAd1";
                isLoaded = true;
            }
        }


        if (isLoaded) {
            if (loadedVari != null) {
                if (loadedVari.equals("interstitialAd")) {
                    Log.d(TAG, "Topon_Interstitial showInterstitial interstitialAd show ------");
                    interstitialAd.show(activity);
                    loadInterstitial1(activity);
                } else if (loadedVari.equals("interstitialAd1")) {
                    Log.d(TAG, "Topon_Interstitial showInterstitial interstitialAd1 show ------");
                    interstitialAd1.show(activity);
                    loadInterstitial(activity);
                }
            } else {
                startTimerInterstitialLoad(activity);
                Log.d(TAG, "Topon_Interstitial showInterstitial interstitialAd & interstitialAd1 1-> null");
            }

        } else {
            startTimerInterstitialLoad(activity);
            Log.d(TAG, "Topon_Interstitial showInterstitial interstitialAd & interstitialAd1 2-> null");
        }
    }

    public static void loadInterstitial1(Activity activity) {
        String adId = utils.get_Topon_InterstitialAdsId();
        interstitialAd1 = new ATInterstitial(activity, adId);
        interstitialAd1.setAdListener(new ATInterstitialListener() {
            @Override
            public void onInterstitialAdLoaded() {
                Log.d(TAG, "Topon_Interstitial LoadInterstitial2 onInterstitialAdLoaded adId -> " + adId);
            }

            @Override
            public void onInterstitialAdLoadFail(AdError adError) {
                interstitialAd1 = null;
                Log.d(TAG, "Topon_Interstitial LoadInterstitial2 onInterstitialAdLoadFail -> " + adError.getFullErrorInfo());
            }

            @Override
            public void onInterstitialAdClicked(ATAdInfo atAdInfo) {
//                Log.d(TAG, "Topon_Interstitial LoadInterstitial2 onInterstitialAdClicked");
            }

            @Override
            public void onInterstitialAdShow(ATAdInfo atAdInfo) {
//                Log.d(TAG, "Topon_Interstitial LoadInterstitial2 onInterstitialAdShow");
            }

            @Override
            public void onInterstitialAdClose(ATAdInfo atAdInfo) {
//                Log.d(TAG, "Topon_Interstitial LoadInterstitial2 onInterstitialAdClose");
                if (onAdsClickListner != null) {
                    onAdsClickListner.OnAdsClick();
                }
                interstitialAd1 = null;
            }

            @Override
            public void onInterstitialAdVideoStart(ATAdInfo atAdInfo) {
//                Log.d(TAG, "Topon_Interstitial LoadInterstitial2 onInterstitialAdVideoStart");
            }

            @Override
            public void onInterstitialAdVideoEnd(ATAdInfo atAdInfo) {
//                Log.d(TAG, "Topon_Interstitial LoadInterstitial2 onInterstitialAdVideoEnd");
            }

            @Override
            public void onInterstitialAdVideoError(AdError adError) {
//                Log.d(TAG, "Topon_Interstitial LoadInterstitial2 onInterstitialAdVideoError -> " + adError.getFullErrorInfo());
            }
        });
        interstitialAd1.load();
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
