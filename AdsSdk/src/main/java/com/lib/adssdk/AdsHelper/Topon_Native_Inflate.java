package com.lib.adssdk.AdsHelper;

import android.app.Activity;
import android.content.res.Resources;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

import com.anythink.nativead.api.ATNativeAdView;
import com.anythink.nativead.api.NativeAd;
import com.lib.adssdk.Utils.Res;
import com.lib.adssdk.Utils.ToponNativeBig;
import com.lib.adssdk.Utils.ToponNativeSmallBanner;
import com.lib.adssdk.Utils.ToponNativeSmallBottom;
import com.lib.adssdk.Utils.ToponNativeSmallTop;


public class Topon_Native_Inflate {


    private static String TAG = "Topon_Native_Inflate";
    private static Res res;
    private static Activity mactivity;


    private static Resources getResources() {
        if (res == null) {
            res = new Res(mactivity.getResources());
        }
        return res;
    }

    public static void inflate_native_big_card(Activity activity, ViewGroup viewGroup, NativeAd nativeAd, String nativeType, String direction) {
        mactivity = activity;

        viewGroup.setVisibility(View.VISIBLE);
        viewGroup.removeAllViews();

        ATNativeAdView anyThinkNativeAdView = new ATNativeAdView(activity);
        ToponNativeBig toponNativeBig = new ToponNativeBig(activity, direction);
        ToponNativeBig finalToponNativeBig = toponNativeBig;
        activity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                try {
                    if (nativeAd != null) {
                        viewGroup.addView(anyThinkNativeAdView);
                        nativeAd.renderAdView(anyThinkNativeAdView, finalToponNativeBig);
                        nativeAd.prepare(anyThinkNativeAdView, finalToponNativeBig.getClickView(), null);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    Log.d(TAG, "inflate_native_big_card failed -> " + e);
                }


            }
        });

    }

    public static void inflate_native_SmallTop(Activity activity, ViewGroup viewGroup, NativeAd nativeAd, String nativeType, String direction) {
        mactivity = activity;

        viewGroup.setVisibility(View.VISIBLE);
        viewGroup.removeAllViews();

        ATNativeAdView anyThinkNativeAdView = new ATNativeAdView(activity);
        ToponNativeSmallTop toponNativeBig = new ToponNativeSmallTop(activity, direction);
        ToponNativeSmallTop finalToponNativeBig = toponNativeBig;
        activity.runOnUiThread(new Runnable() {
            @Override
            public void run() {

                try {
                    if (nativeAd != null) {
                        viewGroup.addView(anyThinkNativeAdView);
                        nativeAd.renderAdView(anyThinkNativeAdView, finalToponNativeBig);
                        nativeAd.prepare(anyThinkNativeAdView, finalToponNativeBig.getClickView(), null);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    Log.d(TAG, "inflate_native_SmallBottom failed -> " + e);
                }


            }
        });

    }

    public static void inflate_native_Small_Banner(Activity activity, ViewGroup viewGroup, NativeAd nativeAd, String nativeType, String direction) {
        mactivity = activity;

        viewGroup.setVisibility(View.VISIBLE);
        viewGroup.removeAllViews();

        ATNativeAdView anyThinkNativeAdView = new ATNativeAdView(activity);
        ToponNativeSmallBanner mtoponNativeSamllBanner = new ToponNativeSmallBanner(activity);
        ToponNativeSmallBanner toponNativeSamllBanner = mtoponNativeSamllBanner;
        activity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                viewGroup.addView(anyThinkNativeAdView);
                nativeAd.renderAdView(anyThinkNativeAdView, toponNativeSamllBanner);
                nativeAd.prepare(anyThinkNativeAdView, toponNativeSamllBanner.getClickView(), null);
            }
        });

    }

    public static void inflate_native_SmallBottom(Activity activity, ViewGroup viewGroup, NativeAd nativeAd, String nativeType, String direction) {
        mactivity = activity;

        viewGroup.setVisibility(View.VISIBLE);
        viewGroup.removeAllViews();

        activity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                try {
                    if (nativeAd != null) {
                        ATNativeAdView anyThinkNativeAdView = new ATNativeAdView(activity);
                        ToponNativeSmallBottom toponNativeSmallBottom = new ToponNativeSmallBottom(activity, direction);
                        viewGroup.addView(anyThinkNativeAdView);
                        nativeAd.renderAdView(anyThinkNativeAdView, toponNativeSmallBottom);
                        nativeAd.prepare(anyThinkNativeAdView, toponNativeSmallBottom.getClickView(), null);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    Log.d(TAG, "inflate_native_SmallBottom failed -> " + e);
                }

            }
        });

    }
}
