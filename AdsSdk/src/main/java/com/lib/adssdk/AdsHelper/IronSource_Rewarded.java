package com.lib.adssdk.AdsHelper;

import android.app.Activity;
import android.os.CountDownTimer;
import android.util.Log;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.sdk.RewardedVideoListener;
import com.lib.adssdk.Listner.OnAdsClickListner;
import com.lib.adssdk.MyApp;
import com.lib.adssdk.Utils.Const;


public class IronSource_Rewarded {

    private static final String TAG = "IronSource_Rewarded";
    public static Boolean rewarded = false;
    public static Boolean isRewardedTimerRun = false;

    public static OnAdsClickListner onAdsClickListner = null;

    public static void setOnAdsClickListner(OnAdsClickListner monAdsClickListner) {
        onAdsClickListner = monAdsClickListner;
    }

    public static void loadRewarded(Activity activity) {

        Log.d(TAG, "IronSource_Rewarded loadRewarded");

        IronSource.init(activity, MyApp.getString(Const.iron_key), IronSource.AD_UNIT.REWARDED_VIDEO);
        IronSource.loadRewardedVideo();
        IronSource.setRewardedVideoListener(new RewardedVideoListener() {
            /**
             * Invoked when the RewardedVideo ad view has opened.
             * Your Activity will lose focus. Please avoid performing heavy
             * tasks till the video ad will be closed.
             */
            @Override
            public void onRewardedVideoAdOpened() {
                Log.d(TAG, "IronSource_Rewarded loadRewarded onRewardedVideoAdOpened");
            }

            /*Invoked when the RewardedVideo ad view is about to be closed.
            Your activity will now regain its focus.*/
            @Override
            public void onRewardedVideoAdClosed() {
                Log.d(TAG, "IronSource_Rewarded loadRewarded onRewardedVideoAdClosed");
//                rewarded = false;
//                loadRewarded(activity);
                if (onAdsClickListner != null) {
                    onAdsClickListner.OnAdsClick();
                }
                loadRewarded(activity);
            }

            /**
             * Invoked when there is a change in the ad availability status.
             *
             * @param - available - value will change to true when rewarded videos are *available.
             *          You can then show the video by calling showRewardedVideo().
             *          Value will change to false when no videos are available.
             */
            @Override
            public void onRewardedVideoAvailabilityChanged(boolean available) {
//                if (available) {
                rewarded = available;
//                } else {
//                    rewarded = false;
//                }
                Log.d(TAG, "IronSource_Rewarded loadRewarded onRewardedVideoAvailabilityChanged available ->" + available);
                //Change the in-app 'Traffic Driver' state according to availability.
            }

            /**
             /**
             * Invoked when the user completed the video and should be rewarded.
             * If using server-to-server callbacks you may ignore this events and wait *for the callback from the ironSource server.
             *
             * @param - placement - the Placement the user completed a video from.
             */
            @Override
            public void onRewardedVideoAdRewarded(Placement placement) {
                Log.d(TAG, "IronSource_Rewarded loadRewarded onRewardedVideoAdRewarded");
                /** here you can reward the user according to the given amount.
                 String rewardName = placement.getRewardName();
                 int rewardAmount = placement.getRewardAmount();
                 */
            }

            /* Invoked when RewardedVideo call to show a rewarded video has failed
             * IronSourceError contains the reason for the failure.
             */
            @Override
            public void onRewardedVideoAdShowFailed(IronSourceError error) {
                rewarded = false;
                Log.d(TAG, "IronSource_Rewarded loadRewarded onRewardedVideoAdShowFailed -> " + error.getErrorMessage());
            }

            /*Invoked when the end user clicked on the RewardedVideo ad
             */
            @Override
            public void onRewardedVideoAdClicked(Placement placement) {
                Log.d(TAG, "IronSource_Rewarded loadRewarded onRewardedVideoAdClicked");
            }

            /* Note: the events AdStarted and AdEnded below are not available for all supported rewarded video
                    ad networks. Check which events are available per ad network you choose
                    to include in your build.
                    We recommend only using events which register to ALL ad networks you
                    include in your build.
                            * Invoked when the video ad starts playing.
            */
            @Override
            public void onRewardedVideoAdStarted() {
                Log.d(TAG, "IronSource_Rewarded loadRewarded onRewardedVideoAdStarted");
            }

            /* Invoked when the video ad finishes plating. */
            @Override
            public void onRewardedVideoAdEnded() {
                Log.d(TAG, "IronSource_Rewarded loadRewarded onRewardedVideoAdEnded");
            }
        });


    }


    public static void showRewarded(Activity activity) {

        if (!rewarded || !IronSource.isRewardedVideoAvailable()) {
            Log.d(TAG, "IronSource_Rewarded showRewarded null");
//            loadRewarded(activity);
//            if (onAdsClickListner != null) {
//                onAdsClickListner.OnAdsClick();
//            }
            if (!isRewardedTimerRun) {
                isRewardedTimerRun = true;
                startTimerRewardedLoad();
                if (!rewarded) {
                    loadRewarded(activity);
                    Log.d(TAG, "IronSource_Rewarded showRewarded mRewardedAd -> null Send loadRewarded");
                }
            }

        } else {
            Log.d(TAG, "IronSource_Rewarded showRewarded showRewarded");
            IronSource.showRewardedVideo();
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
