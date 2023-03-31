package com.google.play.AdsHelper;

import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

import com.google.play.Utils.utils;
import com.greedygame.core.adview.general.AdLoadCallback;
import com.greedygame.core.adview.general.GGAdview;
import com.greedygame.core.models.general.AdErrors;


public class Sdk_Native_Inflate {

    private static String TAG = "Sdk_Native_Inflate";

    public static void inflate_native_Top(Activity activity, ViewGroup viewGroup, GGAdview nativeAd1, String nativeType, String direction) {

        viewGroup.setVisibility(View.VISIBLE);
        viewGroup.removeAllViews();

        GGAdview nativeAd;
        String adId = utils.get_Sdk_NativeAdsId();
        nativeAd = new GGAdview(activity);
        nativeAd.setUnitId(adId);  //Replace with your Ad Unit ID here
        nativeAd.setAdsMaxHeight(250);

        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 200);
        viewGroup.addView(nativeAd, layoutParams);
        nativeAd.loadAd(new AdLoadCallback() {
                            @Override
                            public void onReadyForRefresh() {
                                Log.d(TAG, "Sdk_Native_Inflate onReadyForRefresh");
                            }

                            @Override
                            public void onUiiClosed() {
                                Log.d(TAG, "Sdk_Native_Inflate onUiiClosed");
                            }

                            @Override
                            public void onUiiOpened() {
                                Log.d(TAG, "Sdk_Native_Inflate onUiiOpened");
                            }

                            @Override
                            public void onAdLoadFailed(AdErrors cause) {
                                viewGroup.setVisibility(View.GONE);
                                Log.d(TAG, "Sdk_Native_Inflate onAdLoadFailed -> " + cause);
                            }

                            @Override
                            public void onAdLoaded() {
                                Log.d(TAG, "Sdk_Native_Inflate onAdLoaded");
                            }
                        }
        );
    }

    public static void inflate_native_Bottom(Activity activity, ViewGroup viewGroup, GGAdview nativeAd1, String nativeType, String direction) {

        viewGroup.setVisibility(View.VISIBLE);
        viewGroup.removeAllViews();

        GGAdview nativeAd;
        String adId = utils.get_Sdk_NativeAdsId();
        nativeAd = new GGAdview(activity);
        nativeAd.setUnitId(adId);  //Replace with your Ad Unit ID here
        nativeAd.setAdsMaxHeight(250);

        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 200);
        viewGroup.addView(nativeAd, layoutParams);
        nativeAd.loadAd(new AdLoadCallback() {
                            @Override
                            public void onReadyForRefresh() {
                                Log.d(TAG, "Sdk_Native_Inflate onReadyForRefresh");
                            }

                            @Override
                            public void onUiiClosed() {
                                Log.d(TAG, "Sdk_Native_Inflate onUiiClosed");
                            }

                            @Override
                            public void onUiiOpened() {
                                Log.d(TAG, "Sdk_Native_Inflate onUiiOpened");
                            }

                            @Override
                            public void onAdLoadFailed(AdErrors cause) {
                                viewGroup.setVisibility(View.GONE);
                                Log.d(TAG, "Sdk_Native_Inflate onAdLoadFailed -> " + cause);
                            }

                            @Override
                            public void onAdLoaded() {
                                Log.d(TAG, "Sdk_Native_Inflate onAdLoaded");
                            }
                        }
        );
    }

    public static void inflate_native_Extra_Top(Activity activity, ViewGroup viewGroup, GGAdview nativeAd1, String nativeType, String direction) {

        viewGroup.setVisibility(View.VISIBLE);
        viewGroup.removeAllViews();

        GGAdview nativeAd;
        String adId = utils.get_Sdk_NativeAdsId();
        nativeAd = new GGAdview(activity);
        nativeAd.setUnitId(adId);  //Replace with your Ad Unit ID here
        nativeAd.setAdsMaxHeight(250);

        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 200);
        viewGroup.addView(nativeAd, layoutParams);
        nativeAd.loadAd(new AdLoadCallback() {
                            @Override
                            public void onReadyForRefresh() {
                                Log.d(TAG, "Sdk_Native_Inflate onReadyForRefresh");
                            }

                            @Override
                            public void onUiiClosed() {
                                Log.d(TAG, "Sdk_Native_Inflate onUiiClosed");
                            }

                            @Override
                            public void onUiiOpened() {
                                Log.d(TAG, "Sdk_Native_Inflate onUiiOpened");
                            }

                            @Override
                            public void onAdLoadFailed(AdErrors cause) {
                                viewGroup.setVisibility(View.GONE);
                                Log.d(TAG, "Sdk_Native_Inflate onAdLoadFailed -> " + cause);
                            }

                            @Override
                            public void onAdLoaded() {
                                Log.d(TAG, "Sdk_Native_Inflate onAdLoaded");
                            }
                        }
        );
    }

    public static void inflate_native_Extra_Bottom(Activity activity, ViewGroup viewGroup, GGAdview nativeAd1, String nativeType, String direction) {

        viewGroup.setVisibility(View.VISIBLE);
        viewGroup.removeAllViews();

        GGAdview nativeAd;
        String adId = utils.get_Sdk_NativeAdsId();
        nativeAd = new GGAdview(activity);
        nativeAd.setUnitId(adId);  //Replace with your Ad Unit ID here
        nativeAd.setAdsMaxHeight(250);

        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 200);
        viewGroup.addView(nativeAd, layoutParams);
        nativeAd.loadAd(new AdLoadCallback() {
                            @Override
                            public void onReadyForRefresh() {
                                Log.d(TAG, "Sdk_Native_Inflate onReadyForRefresh");
                            }

                            @Override
                            public void onUiiClosed() {
                                Log.d(TAG, "Sdk_Native_Inflate onUiiClosed");
                            }

                            @Override
                            public void onUiiOpened() {
                                Log.d(TAG, "Sdk_Native_Inflate onUiiOpened");
                            }

                            @Override
                            public void onAdLoadFailed(AdErrors cause) {
                                viewGroup.setVisibility(View.GONE);
                                Log.d(TAG, "Sdk_Native_Inflate onAdLoadFailed -> " + cause);
                            }

                            @Override
                            public void onAdLoaded() {
                                Log.d(TAG, "Sdk_Native_Inflate onAdLoaded");
                            }
                        }
        );
    }
}
