package com.lib.adssdk.AdsHelper;

import android.app.Activity;
import android.os.CountDownTimer;
import android.util.Log;

import androidx.annotation.NonNull;

import com.greedygame.core.models.general.AdErrors;
import com.greedygame.core.rewarded_ad.general.GGRewardedAd;
import com.greedygame.core.rewarded_ad.general.GGRewardedAdsEventListener;
import com.lib.adssdk.Listner.OnAdsClickListner;
import com.lib.adssdk.Utils.Const;
import com.lib.adssdk.Utils.utils;


public class Sdk_Rewarded {

    private static final String TAG = "Sdk_Rewarded";
    public static GGRewardedAd mRewardedAd = null;
    public static Boolean isRewardedTimerRun = false;

    public static OnAdsClickListner onAdsClickListner = null;

    public static void setOnAdsClickListner(OnAdsClickListner monAdsClickListner) {
        onAdsClickListner = monAdsClickListner;
    }

    public static void loadRewarded(Activity activity) {

        String adId = utils.get_Sdk_RewardedAdsId();
        mRewardedAd = new GGRewardedAd(activity, adId);
        mRewardedAd.setListener(new GGRewardedAdsEventListener() {
            @Override
            public void onAdLoaded() {
                Log.d(TAG, "Sdk_Rewarded loadRewarded onAdLoaded");
            }

            @Override
            public void onAdLoadFailed(@NonNull AdErrors adErrors) {
                Log.d(TAG, "Sdk_Rewarded loadRewarded onAdLoadFailed -> " + adErrors);
            }

            @Override
            public void onAdShowFailed() {
                Log.d(TAG, "Sdk_Rewarded loadRewarded onAdShowFailed");
            }

            @Override
            public void onAdOpened() {
                Log.d(TAG, "Sdk_Rewarded loadRewarded onAdOpened");
            }

            @Override
            public void onAdClosed() {
                Log.d(TAG, "Sdk_Rewarded loadRewarded onAdClosed");
                mRewardedAd.destroy();
                mRewardedAd = null;
                loadRewarded(activity);
                if (onAdsClickListner != null) {
                    onAdsClickListner.OnAdsClick();
                }
            }

            @Override
            public void onReward() {
                Log.d(TAG, "Sdk_Rewarded loadRewarded onReward");
            }
        });
        mRewardedAd.loadAd();
    }


    public static void showRewarded(Activity activity) {

        if (mRewardedAd.isAdLoaded()) {
            mRewardedAd.show(activity);
        } else {
            if (!isRewardedTimerRun) {
                isRewardedTimerRun = true;
                startTimerRewardedLoad();
                if (mRewardedAd == null) {
                    loadRewarded(activity);
                    Log.d(TAG, "Sdk_Rewarded showRewarded mRewardedAd -> null Send loadRewarded");
                }
            }

        }

//        if (!isLoaded) {
//            Log.d(TAG, "Sdk_Rewarded showRewarded null");
//            if (onAdsClickListner != null) {
//                onAdsClickListner.OnAdsClick();
//            }
//            loadRewarded(activity);
//            return;
//        } else {
//            Log.d(TAG, "Sdk_Rewarded showRewarded showRewarded");
//            mRewardedAd.show(activity);
//        }

    }


    private static void startTimerRewardedLoad() {
        new CountDownTimer(Const.requestLoadTime, 1000) {

            public void onTick(long millisUntilFinished) {

            }

            public void onFinish() {
                isRewardedTimerRun = false;
            }

        }.start();
    }

}
