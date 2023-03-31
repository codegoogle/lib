package com.google.play.AdsHelper;

import static com.ironsource.mediationsdk.IronSource.isInterstitialReady;

import android.app.Activity;
import android.os.CountDownTimer;
import android.util.Log;

import com.google.play.MyApp;
import com.google.play.Utils.Const;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.InterstitialListener;
import com.google.play.Listner.OnAdsClickListner;

public class IronSource_Interstitial {

    public static final String TAG = "IronSource_Interstitial";
    public static Boolean interstitialAd = false;
    public static Boolean isInterstitialTimerRun = false;

    public static OnAdsClickListner onAdsClickListner = null;

    public static void setOnAdsClickListner(OnAdsClickListner monAdsClickListner) {
        onAdsClickListner = monAdsClickListner;
    }

    public static void loadInterstitial(Activity activity) {

        IronSource.init(activity, MyApp.getString(Const.iron_key), IronSource.AD_UNIT.INTERSTITIAL);
//        IntegrationHelper.validateIntegration(activity);
        IronSource.loadInterstitial();
        IronSource.setInterstitialListener(new InterstitialListener() {
            /**
             * Invoked when Interstitial Ad is ready to be shown after load function was called.
             */
            @Override
            public void onInterstitialAdReady() {
                interstitialAd = true;
                Log.d(TAG, "IronSource_Interstitial loadInterstitial onInterstitialAdReady");
            }

            /**
             * invoked when there is no Interstitial Ad available after calling load function.
             */
            @Override
            public void onInterstitialAdLoadFailed(IronSourceError error) {
                interstitialAd = false;
                Log.d(TAG, "IronSource_Interstitial loadInterstitial onInterstitialAdLoadFailed -> " + error.getErrorMessage() + " code: " + error.getErrorCode());
            }

            /**
             * Invoked when the Interstitial Ad Unit is opened
             */
            @Override
            public void onInterstitialAdOpened() {
                Log.d(TAG, "IronSource_Interstitial loadInterstitial onInterstitialAdOpened");
            }

            /*
             * Invoked when the ad is closed and the user is about to return to the application.
             */
            @Override
            public void onInterstitialAdClosed() {
                Log.d(TAG, "IronSource_Interstitial loadInterstitial onInterstitialAdClosed");
                if (onAdsClickListner != null) {
                    onAdsClickListner.OnAdsClick();
                }
                interstitialAd = false;
                loadInterstitial(activity);
            }

            /**
             * Invoked when Interstitial ad failed to show.
             * @param error - An object which represents the reason of showInterstitial failure.
             */
            @Override
            public void onInterstitialAdShowFailed(IronSourceError error) {
                Log.d(TAG, "IronSource_Interstitial loadInterstitial onInterstitialAdShowFailed");
            }

            /*
             * Invoked when the end user clicked on the interstitial ad, for supported networks only.
             */
            @Override
            public void onInterstitialAdClicked() {
                Log.d(TAG, "IronSource_Interstitial loadInterstitial onInterstitialAdClicked");
            }

            /** Invoked right before the Interstitial screen is about to open.
             *  NOTE - This event is available only for some of the networks.
             *  You should NOT treat this event as an interstitial impression, but rather use InterstitialAdOpenedEvent
             */
            @Override
            public void onInterstitialAdShowSucceeded() {
                Log.d(TAG, "IronSource_Interstitial loadInterstitial onInterstitialAdShowSucceeded");
            }
        });

    }


    public static void showInterstitial(Activity activity) {
        if(interstitialAd && isInterstitialReady()){
            Log.d(TAG, "IronSource_Interstitial showInterstitial");
            IronSource.showInterstitial();
        }else{
            if (!isInterstitialTimerRun) {
                isInterstitialTimerRun = true;
                startTimerInterstitialLoad();
                if (!interstitialAd) {
                    loadInterstitial(activity);
                    Log.d(TAG, "IronSource_Interstitial showInterstitial interstitialAd  ->  false null Send loadInterstitial");
                }
            }
            Log.d(TAG, "IronSource_Interstitial showInterstitial interstitialAd "+interstitialAd);
        }

//        if (!interstitialAd || !isInterstitialReady()) {
//            Log.d(TAG, "IronSource_Interstitial showInterstitial interstitialAd null");
//            if (onAdsClickListner != null) {
//                onAdsClickListner.OnAdsClick();
//            }
//            interstitialAd = false;
//            loadInterstitial(activity);
//            return;
//        } else {
//            Log.d(TAG, "IronSource_Interstitial showInterstitial");
//            IronSource.showInterstitial();
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
