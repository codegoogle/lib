package com.google.play.AdsHelper;

import android.app.Activity;
import android.os.CountDownTimer;
import android.util.Log;

import androidx.annotation.NonNull;


import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAd;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAdLoadCallback;
import com.google.play.Listner.OnAdsClickListner;
import com.google.play.Utils.Const;
import com.google.play.Utils.utils;

public class Admob_Interstitial {

    public static final String TAG = "Admob_Interstitial";
    public static AdManagerInterstitialAd interstitialAd = null, interstitialAd1 = null;
    public static OnAdsClickListner onAdsClickListner = null;
    public static Boolean isInterstitialTimerRun = false;

    public static void setOnAdsClickListner(OnAdsClickListner monAdsClickListner) {
        onAdsClickListner = monAdsClickListner;
    }

    public static void loadInterstitial(Activity activity) {
        AdManagerAdRequest adRequest = new AdManagerAdRequest.Builder().build();

        String adId = utils.get_Admob_InterstitialAdsId();
        AdManagerInterstitialAd.load(activity, adId, adRequest, new AdManagerInterstitialAdLoadCallback() {
            @Override
            public void onAdLoaded(@NonNull AdManagerInterstitialAd  minterstitialAd) {
                interstitialAd = minterstitialAd;
                Log.d(TAG, "Admob_Interstitial loadInterstitial onAdLoaded adId -> " + adId);
            }

            @Override
            public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                interstitialAd = null;
                Log.d(TAG, "Admob_Interstitial loadInterstitial onAdFailedToLoad");
            }
        });
    }

    public static void loadInterstitial1(Activity activity) {
        AdManagerAdRequest adRequest = new AdManagerAdRequest.Builder().build();

        String adId = utils.get_Admob_InterstitialAdsId();
        AdManagerInterstitialAd.load(activity, adId, adRequest, new AdManagerInterstitialAdLoadCallback() {
            @Override
            public void onAdLoaded(@NonNull AdManagerInterstitialAd minterstitialAd) {
                interstitialAd1 = minterstitialAd;
                Log.d(TAG, "Admob_Interstitial interstitialAd1 onAdLoaded adId -> " + adId);
            }

            @Override
            public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                interstitialAd1 = null;
                Log.d(TAG, "Admob_Interstitial interstitialAd1 onAdFailedToLoad");
            }
        });
    }


    public static void showInterstitial(Activity activity) {


        if (interstitialAd != null) {
            interstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                @Override
                public void onAdDismissedFullScreenContent() {
                    Log.d(TAG, "Admob_Interstitial showInterstitial onAdDismissedFullScreenContent");
                    if (onAdsClickListner != null) {
                        onAdsClickListner.OnAdsClick();
                        onAdsClickListner = null;
                    }
                    interstitialAd = null;
                }

                @Override
                public void onAdFailedToShowFullScreenContent(com.google.android.gms.ads.AdError adError) {
                    Log.d(TAG, "Admob_Interstitial showInterstitial onAdFailedToShowFullScreenContent -> " + adError);
                    interstitialAd = null;
                }

                @Override
                public void onAdShowedFullScreenContent() {
//                    Log.d(TAG, "Admob_Interstitial showInterstitial onAdShowedFullScreenContent");
                }
            });
            interstitialAd.show(activity);
            loadInterstitial1(activity);
        } else {

            if (interstitialAd1 != null) {

                interstitialAd1.setFullScreenContentCallback(new FullScreenContentCallback() {
                    @Override
                    public void onAdDismissedFullScreenContent() {
                        Log.d(TAG, "Admob_Interstitial showInterstitial onAdDismissedFullScreenContent");
                        if (onAdsClickListner != null) {
                            onAdsClickListner.OnAdsClick();
                            onAdsClickListner = null;
                        }
                        interstitialAd1 = null;
                    }

                    @Override
                    public void onAdFailedToShowFullScreenContent(com.google.android.gms.ads.AdError adError) {
                        Log.d(TAG, "Admob_Interstitial showInterstitial onAdFailedToShowFullScreenContent -> " + adError);
                        interstitialAd1 = null;
                    }

                    @Override
                    public void onAdShowedFullScreenContent() {
//                    Log.d(TAG, "Admob_Interstitial showInterstitial onAdShowedFullScreenContent");
                    }
                });
                interstitialAd1.show(activity);
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
