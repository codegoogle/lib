package com.google.play.AdsHelper;

import android.app.Activity;
import android.os.CountDownTimer;
import android.util.Log;

import androidx.annotation.NonNull;


import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdCallback;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.google.play.Listner.OnAdsClickListner;
import com.google.play.Utils.Const;
import com.google.play.Utils.utils;


public class Admob_Rewarded {

    private static final String TAG = "Admob_Rewarded";
    public static RewardedAd mRewardedAd = null;
    public static Boolean isRewardedTimerRun = false;

    public static OnAdsClickListner onAdsClickListner = null;

    public static void setOnAdsClickListner(OnAdsClickListner monAdsClickListner) {
        onAdsClickListner = monAdsClickListner;
    }

    public static void loadRewarded(Activity activity) {

        AdRequest request = new AdRequest.Builder().build();
        String adId = utils.get_Admob_RewardedAdsId();
        RewardedAd rewardedAd = new RewardedAd(activity, adId);
        rewardedAd.loadAd(request, new RewardedAdLoadCallback() {

            @Override
            public void onRewardedAdLoaded() {
                mRewardedAd = rewardedAd;
                Log.d(TAG, "Admob_Rewarded loadRewarded onAdLoaded");
                super.onRewardedAdLoaded();
            }

            @Override
            public void onRewardedAdFailedToLoad(LoadAdError loadAdError) {
                Log.d(TAG, "Admob_Rewarded loadRewarded onAdFailedToLoad ->" + loadAdError.toString());
                mRewardedAd = null;
                super.onRewardedAdFailedToLoad(loadAdError);
            }
        });
    }


    public static void showRewarded(Activity activity) {

        if (mRewardedAd == null) {
            Log.d(TAG, "Admob_Rewarded showRewarded null");
            if (!isRewardedTimerRun) {
                isRewardedTimerRun = true;
                startTimerRewardedLoad();
                if (mRewardedAd == null) {
                    loadRewarded(activity);
                    Log.d(TAG, "Admob_Rewarded showRewarded mRewardedAd -> null Send loadRewarded");
                }
            }
        } else {
            Log.d(TAG, "Admob_Rewarded showRewarded showRewarded");
            if (mRewardedAd.isLoaded()) {
                mRewardedAd.show(activity, new RewardedAdCallback() {
                    @Override
                    public void onUserEarnedReward(@NonNull RewardItem rewardItem) {
                        Log.d(TAG, "Admob_Rewarded showRewarded onUserEarnedReward");
                    }

                    @Override
                    public void onRewardedAdClosed() {
                        if (onAdsClickListner != null) {
                            onAdsClickListner.OnAdsClick();
                        }
                        Log.d(TAG, "Admob_Rewarded showRewarded onAdDismissedFullScreenContent");
                        mRewardedAd = null;
                        loadRewarded(activity);
                        super.onRewardedAdClosed();
                    }

                    @Override
                    public void onRewardedAdFailedToShow(AdError adError) {
                        Log.d(TAG, "Admob_Rewarded showRewarded onAdFailedToShowFullScreenContent -> " + adError);
                        mRewardedAd = null;
                        super.onRewardedAdFailedToShow(adError);
                    }
                });
            } else {
                if (!isRewardedTimerRun) {
                    isRewardedTimerRun = true;
                    startTimerRewardedLoad();
                    if (mRewardedAd == null) {
                        loadRewarded(activity);
                        Log.d(TAG, "Admob_Rewarded showRewarded mRewardedAd -> null Send loadRewarded");
                    }
                }
            }
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
