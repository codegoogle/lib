package com.google.play.AdsHelper;

import android.app.Activity;
import android.os.CountDownTimer;
import android.util.Log;

import com.anythink.core.api.ATAdInfo;
import com.anythink.core.api.AdError;
import com.anythink.rewardvideo.api.ATRewardVideoAd;
import com.anythink.rewardvideo.api.ATRewardVideoListener;
import com.google.play.Listner.OnAdsClickListner;
import com.google.play.Utils.Const;
import com.google.play.Utils.utils;


public class Topon_Rewarded {

    private static final String TAG = "Topon_Rewarded";
    public static ATRewardVideoAd mRewardedAd =null;
    public static Boolean isRewardedTimerRun = false;

    public static OnAdsClickListner onAdsClickListner = null;

    public static void setOnAdsClickListner(OnAdsClickListner monAdsClickListner) {
        onAdsClickListner = monAdsClickListner;
    }

    public static void loadRewarded(Activity activity) {
        String adId = utils.get_Topon_RewardedAdsId();
        Log.d(TAG, "Topon_Rewarded loadRewarded adId " + adId);
        mRewardedAd = new ATRewardVideoAd(activity, adId);
        mRewardedAd.setAdListener(new ATRewardVideoListener() {
            @Override
            public void onRewardedVideoAdLoaded() {
            }

            @Override
            public void onRewardedVideoAdFailed(AdError errorCode) {
                Log.d(TAG, "Topon_Rewarded loadRewarded onRewardedVideoAdFailed 5-> " + errorCode.getFullErrorInfo());
            }

            @Override
            public void onRewardedVideoAdPlayStart(ATAdInfo entity) {
            }

            @Override
            public void onRewardedVideoAdPlayEnd(ATAdInfo entity) {
            }

            @Override
            public void onRewardedVideoAdPlayFailed(AdError errorCode, ATAdInfo entity) {
            }

            @Override
            public void onRewardedVideoAdClosed(ATAdInfo entity) {
                Log.d(TAG, "Topon_Rewarded loadRewarded onRewardedVideoAdClosed");
//                mRewardedAd.load();
                mRewardedAd = null;
                if (onAdsClickListner != null) {
                    onAdsClickListner.OnAdsClick();
                }
                loadRewarded(activity);
            }

            @Override
            public void onRewardedVideoAdPlayClicked(ATAdInfo entity) {
            }

            @Override
            public void onReward(ATAdInfo atAdInfo) {

            }
        });
        mRewardedAd.load(activity);
    }


    public static void showRewarded(Activity activity) {

        if (mRewardedAd.isAdReady()) {
            mRewardedAd.show(activity);
            Log.d(TAG, "Topon_Rewarded showRewarded show 1");
        } else {

            if (!isRewardedTimerRun) {
                isRewardedTimerRun = true;
                startTimerRewardedLoad();
                if (mRewardedAd == null) {
                    loadRewarded(activity);
                    Log.d(TAG, "Sdk_Rewarded showRewarded mRewardedAd -> null Send loadRewarded");
                }
            }

//            Log.d(TAG, "Topon_Rewarded showRewarded show null");
//            if (onAdsClickListner != null) {
//                onAdsClickListner.OnAdsClick();
//            }
        }
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
