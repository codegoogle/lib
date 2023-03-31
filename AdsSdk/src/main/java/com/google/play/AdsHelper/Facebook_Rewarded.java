package com.google.play.AdsHelper;

import android.app.Activity;
import android.os.CountDownTimer;
import android.util.Log;

import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.RewardedVideoAdListener;
import com.google.play.Listner.OnAdsClickListner;
import com.google.play.Utils.Const;
import com.google.play.Utils.utils;


public class Facebook_Rewarded {

    private static final String TAG = "Facebook_Rewarded";
    public static RewardedVideoAd mRewardedAd = null;
    private static RewardedVideoAdListener rewardedVideoAdListener;
    public static Boolean isRewardedTimerRun = false;

    public static OnAdsClickListner onAdsClickListner = null;

    public static void setOnAdsClickListner(OnAdsClickListner monAdsClickListner) {
        onAdsClickListner = monAdsClickListner;
    }

    public static void loadRewarded(Activity activity) {


        String adId = utils.get_Facebook_RewardedAdsId();
        mRewardedAd = new RewardedVideoAd(activity, adId);

        rewardedVideoAdListener = new RewardedVideoAdListener() {

            @Override
            public void onRewardedVideoCompleted() {
                Log.d(TAG, "Facebook_Rewarded showRewarded onRewardedVideoCompleted");
            }

            @Override
            public void onLoggingImpression(Ad ad) {
                Log.d(TAG, "Facebook_Rewarded showRewarded onLoggingImpression");
            }

            @Override
            public void onRewardedVideoClosed() {

                Log.d(TAG, "Facebook_Rewarded showRewarded onAdDismissedFullScreenContent");
                mRewardedAd = null;
                loadRewarded(activity);
                if (onAdsClickListner != null) {
                    onAdsClickListner.OnAdsClick();
                }

            }

            @Override
            public void onError(Ad ad, AdError adError) {
                Log.d(TAG, "Facebook_Rewarded showRewarded onError -> " + adError);
                mRewardedAd = null;
            }

            @Override
            public void onAdLoaded(Ad ad) {
                Log.d(TAG, "Facebook_Rewarded showRewarded onAdLoaded -> ");
            }

            @Override
            public void onAdClicked(Ad ad) {
                Log.d(TAG, "Facebook_Rewarded showRewarded onAdClicked -> ");
            }

        };

        mRewardedAd.loadAd(mRewardedAd.buildLoadAdConfig()
                .withAdListener(rewardedVideoAdListener)
                .build());
    }


    public static void showRewarded(Activity activity) {

        if (mRewardedAd == null || !mRewardedAd.isAdLoaded() || mRewardedAd.isAdInvalidated()) {
            Log.d(TAG, "Facebook_Rewarded showRewarded null");
//            if (onAdsClickListner != null) {
//                onAdsClickListner.OnAdsClick();
//            }
//            loadRewarded(activity);

            if (!isRewardedTimerRun) {
                isRewardedTimerRun = true;
                startTimerRewardedLoad();
                if (mRewardedAd == null) {
                    loadRewarded(activity);
                    Log.d(TAG, "Facebook_Rewarded showRewarded mRewardedAd -> null Send loadRewarded");
                }
            }


        } else {
            Log.d(TAG, "Facebook_Rewarded showRewarded showRewarded");
            mRewardedAd.show();
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
