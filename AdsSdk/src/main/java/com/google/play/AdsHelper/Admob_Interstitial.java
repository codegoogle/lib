package com.google.play.AdsHelper;

import android.app.Activity;
import android.os.CountDownTimer;
import android.util.Log;

import androidx.annotation.NonNull;



import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.LoadAdError;
import com.google.play.Listner.OnAdsClickListner;
import com.google.play.Utils.Const;
import com.google.play.Utils.utils;

public class Admob_Interstitial {

    public static final String TAG = "Admob_Interstitial";
    public static InterstitialAd interstitialAd = null, interstitialAd1 = null;
    public static OnAdsClickListner onAdsClickListner = null;
    public static Boolean isInterstitialTimerRun = false;

    public static void setOnAdsClickListner(OnAdsClickListner monAdsClickListner) {
        onAdsClickListner = monAdsClickListner;
    }

    public static void loadInterstitial(Activity activity) {
        String adId = utils.get_Admob_InterstitialAdsId();
        InterstitialAd interstitialAdd = new InterstitialAd(activity);
        interstitialAdd.setAdUnitId(adId);
        interstitialAdd.loadAd(new AdRequest.Builder().build());
        interstitialAdd.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
                interstitialAd = interstitialAdd;
                Log.d(TAG, "Admob_Interstitial loadInterstitial onAdLoaded adId " + adId);
                super.onAdLoaded();
            }

            @Override
            public void onAdFailedToLoad(LoadAdError loadAdError) {
                interstitialAd = null;
                Log.d("Kishan", "Admob_Interstitial loadInterstitial onAdFailedToLoad -> " + adId + " message : " + loadAdError.toString());
                super.onAdFailedToLoad(loadAdError);
            }
        });
    }

    public static void loadInterstitial1(Activity activity) {
        InterstitialAd interstitialAdd = new InterstitialAd(activity);
        String adId = utils.get_Admob_InterstitialAdsId();
        interstitialAdd.setAdUnitId(adId);
        interstitialAdd.loadAd(new AdRequest.Builder().build());
        interstitialAdd.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
                interstitialAd1 = interstitialAdd;
                Log.d(TAG, "Admob_Interstitial interstitialAd1 onAdLoaded adId " + adId);
                super.onAdLoaded();
            }

            @Override
            public void onAdFailedToLoad(LoadAdError loadAdError) {
                interstitialAd1 = null;
                Log.d(TAG, "Admob_Interstitial interstitialAd1 onAdFailedToLoad -> " + adId + " message : " + loadAdError.toString());
                super.onAdFailedToLoad(loadAdError);
            }
        });

    }

    public static void showInterstitial(Activity activity) {


        if (interstitialAd != null) {

            if (interstitialAd.isLoaded()) {
                interstitialAd.setAdListener(new AdListener() {
                    @Override
                    public void onAdClosed() {
                        Log.d(TAG, "Admob_Interstitial showInterstitial onAdClosed");
                        if (onAdsClickListner != null) {
                            onAdsClickListner.OnAdsClick();
                            onAdsClickListner = null;
                        }
                        interstitialAd = null;
                        super.onAdClosed();
                    }
                });
                interstitialAd.show();
            } else {
                if (onAdsClickListner != null) {
                    onAdsClickListner.OnAdsClick();
                    onAdsClickListner = null;
                }
                interstitialAd = null;
            }
            loadInterstitial1(activity);
        } else {

            if (interstitialAd1 != null) {

                if (interstitialAd1.isLoaded()) {
                    interstitialAd1.setAdListener(new AdListener() {
                        @Override
                        public void onAdClosed() {
                            Log.d(TAG, "Admob_Interstitial showInterstitial onAdClosed");
                            if (onAdsClickListner != null) {
                                onAdsClickListner.OnAdsClick();
                                onAdsClickListner = null;
                            }
                            interstitialAd1 = null;
                            super.onAdClosed();
                        }
                    });
                    interstitialAd1.show();
                } else {
                    if (onAdsClickListner != null) {
                        onAdsClickListner.OnAdsClick();
                        onAdsClickListner = null;
                    }
                    interstitialAd1 = null;
                }
                loadInterstitial(activity);
            } else {
                startTimerInterstitialLoad(activity);
                Log.d(TAG, "Admob_Interstitial showInterstitial interstitialAd & interstitialAd1 -> null");
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
