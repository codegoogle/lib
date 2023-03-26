package com.lib.adssdk.AdsHelper;


import android.app.Activity;
import android.os.CountDownTimer;
import android.util.Log;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.lib.adssdk.Listner.OnAdsClickListner;
import com.lib.adssdk.Utils.Const;
import com.lib.adssdk.Utils.utils;



public class Admob_AppOpen {

    private static final String TAG = "AppOpenManager";
    public static AppOpenAd appOpenAd = null, appOpenAd1 = null;
    private static AppOpenAd.AppOpenAdLoadCallback loadCallback, loadCallback1;
    public static Boolean isAppOpenTimerRun = false;


    public static OnAdsClickListner onAdsClickListner = null;

    public static void setOnAdsClickListner(OnAdsClickListner monAdsClickListner) {
        onAdsClickListner = monAdsClickListner;
    }

    public static void loadAppOpen(Activity activity) {

        loadCallback = new AppOpenAd.AppOpenAdLoadCallback() {
            @Override
            public void onAdLoaded(AppOpenAd ad) {
                Log.d(TAG, "Admob_AppOpen loadAppOpen onAdLoaded");
                appOpenAd = ad;
            }

            @Override
            public void onAdFailedToLoad(LoadAdError loadAdError) {
                appOpenAd = null;
                Log.d(TAG, "Admob_AppOpen loadAppOpen onAdFailedToLoad");
            }

        };
        AdManagerAdRequest request = new AdManagerAdRequest.Builder().build();
        String adId = utils.get_Admob_OpenAdsId();
        AppOpenAd.load(activity, adId, request, AppOpenAd.APP_OPEN_AD_ORIENTATION_PORTRAIT, loadCallback);
    }

    public static void loadAppOpen1(Activity activity) {

        loadCallback1 = new AppOpenAd.AppOpenAdLoadCallback() {
            @Override
            public void onAdLoaded(AppOpenAd ad) {
                Log.d(TAG, "Admob_AppOpen loadAppOpen1 onAdLoaded");
                appOpenAd1 = ad;
            }

            @Override
            public void onAdFailedToLoad(LoadAdError loadAdError) {
                appOpenAd1 = null;
                Log.d(TAG, "Admob_AppOpen loadAppOpen1 onAdFailedToLoad");
            }

        };
        AdManagerAdRequest request = new AdManagerAdRequest.Builder().build();
        String adId = utils.get_Admob_OpenAdsId();
        AppOpenAd.load(activity, adId, request, AppOpenAd.APP_OPEN_AD_ORIENTATION_PORTRAIT, loadCallback1);
    }


    public static void showAppOpen(Activity activity) {

        if (appOpenAd != null) {

            FullScreenContentCallback fullScreenContentCallback =
                    new FullScreenContentCallback() {
                        @Override
                        public void onAdDismissedFullScreenContent() {
                            if (onAdsClickListner != null) {
                                onAdsClickListner.OnAdsClick();
                            }
                            Log.d(TAG, "Admob_AppOpen showAppOpen onAdDismissedFullScreenContent appOpenAd");
                            appOpenAd = null;
                        }

                        @Override
                        public void onAdFailedToShowFullScreenContent(AdError adError) {
                            Log.d(TAG, "Admob_AppOpen showAppOpen onAdFailedToShowFullScreenContent appOpenAd -> " + adError);
                            appOpenAd = null;
                        }

                        @Override
                        public void onAdShowedFullScreenContent() {
                            Log.d(TAG, "Admob_AppOpen showAppOpen onAdShowedFullScreenContent appOpenAd");
                        }
                    };
            appOpenAd.setFullScreenContentCallback(fullScreenContentCallback);
            appOpenAd.show(activity);
            Log.d(TAG, "Admob_AppOpen showAppOpen appOpenAd");

            loadAppOpen1(activity);
        } else {

            if (appOpenAd1 != null) {

                FullScreenContentCallback fullScreenContentCallback =
                        new FullScreenContentCallback() {
                            @Override
                            public void onAdDismissedFullScreenContent() {
                                if (onAdsClickListner != null) {
                                    onAdsClickListner.OnAdsClick();
                                }
                                Log.d(TAG, "Admob_AppOpen showAppOpen onAdDismissedFullScreenContent appOpenAd1");
                                appOpenAd1 = null;
                            }

                            @Override
                            public void onAdFailedToShowFullScreenContent(AdError adError) {
                                Log.d(TAG, "Admob_AppOpen showAppOpen onAdFailedToShowFullScreenContent appOpenAd1 -> " + adError);
                                appOpenAd1 = null;
                            }

                            @Override
                            public void onAdShowedFullScreenContent() {
                                Log.d(TAG, "Admob_AppOpen showAppOpen onAdShowedFullScreenContent appOpenAd1");
                            }
                        };
                appOpenAd1.setFullScreenContentCallback(fullScreenContentCallback);
                appOpenAd1.show(activity);
                Log.d(TAG, "Admob_AppOpen showAppOpen appOpenAd1");

                loadAppOpen(activity);
            } else {

                if (!isAppOpenTimerRun) {
                    isAppOpenTimerRun = true;
                    startTimerAppOpenLoad();
                    if (appOpenAd1 == null) {
                        loadAppOpen(activity);
                        Log.d(TAG, "Admob_AppOpen showAppOpen appOpenAd & appOpenAd1 -> null Send loadAppOpen");
                    }
                }

            }


        }


    }

    private static void startTimerAppOpenLoad() {
        new CountDownTimer(Const.requestLoadTime, 1000) {

            public void onTick(long millisUntilFinished) {

            }

            public void onFinish() {
                isAppOpenTimerRun = false;
            }

        }.start();
    }


}