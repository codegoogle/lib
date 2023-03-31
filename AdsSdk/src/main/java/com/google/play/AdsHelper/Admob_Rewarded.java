package com.google.play.AdsHelper;

import android.app.Activity;
import android.os.CountDownTimer;
import android.util.Log;

import androidx.annotation.NonNull;

import com.google.android.gms.ads.AdError;
//import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
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

        AdManagerAdRequest request = new AdManagerAdRequest.Builder().build();
        String adId = utils.get_Admob_RewardedAdsId();
        RewardedAd.load(activity, adId, request, new RewardedAdLoadCallback() {
            @Override
            public void onAdLoaded(@NonNull RewardedAd rewardedAd) {
                mRewardedAd = rewardedAd;
                Log.d(TAG, "Admob_Rewarded loadRewarded onAdLoaded");
            }

            @Override
            public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                Log.d(TAG, "Admob_Rewarded loadRewarded onAdFailedToLoad");
                mRewardedAd = null;
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
            mRewardedAd.show(activity, new OnUserEarnedRewardListener() {
                @Override
                public void onUserEarnedReward(@NonNull RewardItem rewardItem) {
                    Log.d(TAG, "Admob_Rewarded showRewarded onUserEarnedReward");
                }
            });
        }

        mRewardedAd.setFullScreenContentCallback(new FullScreenContentCallback() {
            @Override
            public void onAdDismissedFullScreenContent() {
                if (onAdsClickListner != null) {
                    onAdsClickListner.OnAdsClick();
                }
                Log.d(TAG, "Admob_Rewarded showRewarded onAdDismissedFullScreenContent");
                mRewardedAd = null;
                loadRewarded(activity);
            }

            @Override
            public void onAdFailedToShowFullScreenContent(AdError adError) {
                Log.d(TAG, "Admob_Rewarded showRewarded onAdFailedToShowFullScreenContent -> " + adError);
                mRewardedAd = null;
            }

            @Override
            public void onAdShowedFullScreenContent() {
                Log.d(TAG, "Admob_Rewarded showRewarded onAdShowedFullScreenContent");
            }

        });

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
