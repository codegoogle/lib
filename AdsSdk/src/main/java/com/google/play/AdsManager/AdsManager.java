package com.google.play.AdsManager;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;

import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.play.AdsHelper.Admob_AppOpen;
import com.google.play.AdsHelper.Admob_Interstitial;
import com.google.play.AdsHelper.Admob_Native;
import com.google.play.AdsHelper.Admob_Rewarded;
import com.google.play.AdsHelper.Facebook_Interstitial;
import com.google.play.AdsHelper.Facebook_Native;
import com.google.play.AdsHelper.Facebook_Rewarded;
import com.google.play.AdsHelper.IronSource_Interstitial;
import com.google.play.AdsHelper.IronSource_Native;
import com.google.play.AdsHelper.IronSource_Rewarded;
import com.google.play.AdsHelper.Qureka_AppOpen;
import com.google.play.AdsHelper.Qureka_Interstitial;
import com.google.play.AdsHelper.Qureka_Native;
import com.google.play.AdsHelper.Sdk_AppOpen;
import com.google.play.AdsHelper.Sdk_Interstitial;
import com.google.play.AdsHelper.Sdk_Native;
import com.google.play.AdsHelper.Sdk_Rewarded;
import com.google.play.AdsHelper.Topon_Interstitial;
import com.google.play.AdsHelper.Topon_Native;
import com.google.play.AdsHelper.Topon_Rewarded;
import com.google.play.AppUtil;
import com.google.play.Listner.OnAdsClickListner;
import com.google.play.MyApp;
import com.google.ads.R;
import com.google.play.Utils.Const;
import com.google.play.Utils.CustomWebView;
import com.google.play.Utils.utils;
import com.google.play.Vpage.VpageActivity;
import com.google.play.vServices;

import java.util.List;


public class AdsManager {


    public static final String TAG = "AdsManager";

    public static void ShowInterstitialAd(Activity activity, OnAdsClickListner onAdsClickListner) {
        try {

            if (!MyApp.getString(Const.interstitial_priority).equals("")) {

                String[] priority = MyApp.getString(Const.interstitial_priority).split("\\|");
                if (priority.length == 0) {
                    if (onAdsClickListner != null) {
                        onAdsClickListner.OnAdsClick();
                    }
                } else {

                    List<String> listFillAds = utils.InterstitialTypeFillListCompanyWise(activity);
                    String findAds = null;

                    if (!listFillAds.isEmpty()) {
                        for (int j = 0; j < priority.length; j++) {
                            if (listFillAds.contains(priority[j])) {
                                findAds = priority[j];
                                break;
                            }
                        }
                    }

                    if (findAds == null) {
                        if (onAdsClickListner != null) {
                            onAdsClickListner.OnAdsClick();
                        }
                        Log.d(TAG, "AdsManager ShowInterstitialAd listFillAds  -> null");
                        return;
                    }
                    Log.d(TAG, "AdsManager ShowInterstitialAd showInterstitialAdPriorityWise  -> " + findAds);
                    showInterstitialAdPriorityWise(activity, onAdsClickListner, findAds);
                }

            } else {
                if (onAdsClickListner != null) {
                    onAdsClickListner.OnAdsClick();
                }
            }


        } catch (Exception e) {
            if (onAdsClickListner != null) {
                onAdsClickListner.OnAdsClick();
            }
            Log.d(TAG, "AdsManager ShowInterstitialAd Exception " + e.toString());
            e.printStackTrace();
        }


    }

    public static void showInterstitialAdPriorityWise(Activity activity, OnAdsClickListner onAdsClickListner, String brand) {

        try {

            if (brand.equals(Const.admob)) {

                if (Admob_Interstitial.interstitialAd == null && Admob_Interstitial.interstitialAd1 == null) {
                    if (onAdsClickListner != null) {
                        onAdsClickListner.OnAdsClick();
                    }
                }

                Admob_Interstitial.setOnAdsClickListner(new OnAdsClickListner() {
                    @Override
                    public void OnAdsClick() {
                        if (onAdsClickListner != null) {
                            onAdsClickListner.OnAdsClick();
                        }
                    }
                });
                Admob_Interstitial.showInterstitial(activity);

            } else if (brand.equals(Const.facebook)) {

                if (Facebook_Interstitial.interstitialAd == null && Facebook_Interstitial.interstitialAd1 == null) {
                    if (onAdsClickListner != null) {
                        onAdsClickListner.OnAdsClick();
                    }
                }

                Facebook_Interstitial.setOnAdsClickListner(new OnAdsClickListner() {
                    @Override
                    public void OnAdsClick() {
                        if (onAdsClickListner != null) {
                            onAdsClickListner.OnAdsClick();
                        }
                    }
                });
                Facebook_Interstitial.showInterstitial(activity);

            } else if (brand.equals(Const.iron)) {

                if (!IronSource_Interstitial.interstitialAd) {
                    if (onAdsClickListner != null) {
                        onAdsClickListner.OnAdsClick();
                    }
                }

                IronSource_Interstitial.setOnAdsClickListner(new OnAdsClickListner() {
                    @Override
                    public void OnAdsClick() {
                        if (onAdsClickListner != null) {
                            onAdsClickListner.OnAdsClick();
                        }
                    }
                });
                IronSource_Interstitial.showInterstitial(activity);
            } else if (brand.equals(Const.sdk)) {
                if (!Sdk_Interstitial.interstitialAd.isAdLoaded() && !Sdk_Interstitial.interstitialAd1.isAdLoaded()) {
                    if (onAdsClickListner != null) {
                        onAdsClickListner.OnAdsClick();
                    }
                }
                Sdk_Interstitial.setOnAdsClickListner(new OnAdsClickListner() {
                    @Override
                    public void OnAdsClick() {
                        if (onAdsClickListner != null) {
                            onAdsClickListner.OnAdsClick();
                        }
                    }
                });
                Sdk_Interstitial.showInterstitial(activity);
            } else if (brand.equals(Const.topon)) {
                Boolean isNotNull = false;
                if (Topon_Interstitial.interstitialAd != null) {
                    if (Topon_Interstitial.interstitialAd.isAdReady()) {
                        isNotNull = true;
                    }
                }
                if (Topon_Interstitial.interstitialAd1 != null) {
                    if (Topon_Interstitial.interstitialAd1.isAdReady()) {
                        isNotNull = true;
                    }
                }

                if (!isNotNull) {
                    if (onAdsClickListner != null) {
                        onAdsClickListner.OnAdsClick();
                    }
                    Log.d("Topon_Interstitial", "interstitialAd  null -------");
                    return;
                }

                Topon_Interstitial.setOnAdsClickListner(new OnAdsClickListner() {
                    @Override
                    public void OnAdsClick() {
                        if (onAdsClickListner != null) {
                            onAdsClickListner.OnAdsClick();
                        }
                    }
                });
                Topon_Interstitial.showInterstitial(activity);
            } else if (brand.equals(Const.qureka)) {
                Qureka_Interstitial.setOnAdsClickListner(new OnAdsClickListner() {
                    @Override
                    public void OnAdsClick() {
                        if (onAdsClickListner != null) {
                            onAdsClickListner.OnAdsClick();
                        }
                    }
                });
                Qureka_Interstitial.showInterstitial(activity);
            } else {
                if (onAdsClickListner != null) {
                    onAdsClickListner.OnAdsClick();
                }
            }

        } catch (Exception e) {
            if (onAdsClickListner != null) {
                onAdsClickListner.OnAdsClick();
            }
            Log.d(TAG, " Exception " + e.toString());
            e.printStackTrace();
        }

    }


    public static void ShowAppOpenAd(Activity activity, OnAdsClickListner onAdsClickListner) {

        try {

            if (!MyApp.getString(Const.appOpen_priority).equals("")) {

                String[] priority = MyApp.getString(Const.appOpen_priority).split("\\|");
                if (priority.length == 0) {
                    if (onAdsClickListner != null) {
                        onAdsClickListner.OnAdsClick();
                    }
                } else {

                    List<String> listFillAds = utils.AppOpenTypeFillListCompanyWise();
                    String findAds = null;

                    if (!listFillAds.isEmpty()) {
                        for (int j = 0; j < priority.length; j++) {
                            if (listFillAds.contains(priority[j])) {
                                findAds = priority[j];
                                break;
                            }
                        }
                    }

                    if (findAds == null) {
                        if (onAdsClickListner != null) {
                            onAdsClickListner.OnAdsClick();
                        }
                        Log.d(TAG, "AdsManager ShowAppOpenAd listFillAds  -> null");
                        return;
                    }
                    Log.d(TAG, "AdsManager ShowAppOpenAd showAppOpenAdPriorityWise  -> " + findAds);
                    showAppOpenAdPriorityWise(activity, onAdsClickListner, findAds);
                }

            } else {
                if (onAdsClickListner != null) {
                    onAdsClickListner.OnAdsClick();
                }
            }

        } catch (Exception e) {
            if (onAdsClickListner != null) {
                onAdsClickListner.OnAdsClick();
            }
            Log.d(TAG, "AdsManager Exception " + e.toString());
            e.printStackTrace();
        }

    }

    public static void showAppOpenAdPriorityWise(Activity activity, OnAdsClickListner onAdsClickListner, String brand) {

        try {


            if (brand.equals(Const.admob)) {

                if (Admob_AppOpen.appOpenAd == null && Admob_AppOpen.appOpenAd1 == null) {
                    if (onAdsClickListner != null) {
                        onAdsClickListner.OnAdsClick();
                    }
                }

                Admob_AppOpen.setOnAdsClickListner(new OnAdsClickListner() {
                    @Override
                    public void OnAdsClick() {
                        if (onAdsClickListner != null) {
                            onAdsClickListner.OnAdsClick();
                        }
                    }
                });
                Admob_AppOpen.showAppOpen(activity);
            } else if (brand.equals(Const.sdk)) {
                if (!Sdk_AppOpen.isLoadedappOpenAd) {
                    if (onAdsClickListner != null) {
                        onAdsClickListner.OnAdsClick();
                    }
                }
                Sdk_AppOpen.setOnAdsClickListner(new OnAdsClickListner() {
                    @Override
                    public void OnAdsClick() {
                        if (onAdsClickListner != null) {
                            onAdsClickListner.OnAdsClick();
                        }
                    }
                });
                Sdk_AppOpen.showAppOpen(activity);
            } else if (brand.equals(Const.qureka)) {
                Qureka_AppOpen.setOnAdsClickListner(new OnAdsClickListner() {
                    @Override
                    public void OnAdsClick() {
                        if (onAdsClickListner != null) {
                            onAdsClickListner.OnAdsClick();
                        }
                    }
                });
                Qureka_AppOpen.showAppOpen(activity);
            } else {
                if (onAdsClickListner != null) {
                    onAdsClickListner.OnAdsClick();
                }
            }

        } catch (Exception e) {
            if (onAdsClickListner != null) {
                onAdsClickListner.OnAdsClick();
            }
            Log.d(TAG, " showAppOpenAdPriorityWise Exception " + e.toString());
            e.printStackTrace();
        }

    }


    public static void ShowRewarded(Activity activity, OnAdsClickListner onAdsClickListner) {
        try {


            if (!MyApp.getString(Const.rewarded_priority).equals("")) {

                String[] priority = MyApp.getString(Const.rewarded_priority).split("\\|");
                if (priority.length == 0) {
                    if (onAdsClickListner != null) {
                        onAdsClickListner.OnAdsClick();
                    }
                } else {

                    List<String> listFillAds = utils.RewardedTypeFillListCompanyWise();
                    String findAds = null;

                    if (!listFillAds.isEmpty()) {
                        for (int j = 0; j < priority.length; j++) {
                            if (listFillAds.contains(priority[j])) {
                                findAds = priority[j];
                                break;
                            }
                        }
                    }

                    if (findAds == null) {
                        if (onAdsClickListner != null) {
                            onAdsClickListner.OnAdsClick();
                        }
                        Log.d(TAG, "AdsManager ShowRewarded listFillAds  -> null");
                        return;
                    }
                    Log.d(TAG, "AdsManager ShowRewarded showAppOpenAdPriorityWise  -> " + findAds);
                    showRewardedAdPriorityWise(activity, onAdsClickListner, findAds);
                }

            } else {
                if (onAdsClickListner != null) {
                    onAdsClickListner.OnAdsClick();
                }
            }


        } catch (Exception e) {
            if (onAdsClickListner != null) {
                onAdsClickListner.OnAdsClick();
            }
            Log.d(TAG, "ShowRewarded Exception " + e.toString());
            e.printStackTrace();
        }

    }


    public static void showRewardedAdPriorityWise(Activity activity, OnAdsClickListner onAdsClickListner, String brand) {

        try {

            if (brand.equals(Const.admob)) {

                if (Admob_Rewarded.mRewardedAd == null) {
                    if (onAdsClickListner != null) {
                        onAdsClickListner.OnAdsClick();
                    }
                }

                Admob_Rewarded.setOnAdsClickListner(new OnAdsClickListner() {
                    @Override
                    public void OnAdsClick() {
                        if (onAdsClickListner != null) {
                            onAdsClickListner.OnAdsClick();
                        }
                    }
                });
                Admob_Rewarded.showRewarded(activity);
            } else if (brand.equals(Const.facebook)) {

                if (Facebook_Rewarded.mRewardedAd == null) {
                    if (!Facebook_Rewarded.mRewardedAd.isAdLoaded()) {
                        if (onAdsClickListner != null) {
                            onAdsClickListner.OnAdsClick();
                        }
                    }
                }

                Facebook_Rewarded.setOnAdsClickListner(new OnAdsClickListner() {
                    @Override
                    public void OnAdsClick() {
                        if (onAdsClickListner != null) {
                            onAdsClickListner.OnAdsClick();
                        }
                    }
                });
                Facebook_Rewarded.showRewarded(activity);
            } else if (brand.equals(Const.iron)) {

                if (!IronSource_Rewarded.rewarded) {
                    if (onAdsClickListner != null) {
                        onAdsClickListner.OnAdsClick();
                    }
                }

                IronSource_Rewarded.setOnAdsClickListner(new OnAdsClickListner() {
                    @Override
                    public void OnAdsClick() {
                        if (onAdsClickListner != null) {
                            onAdsClickListner.OnAdsClick();
                        }
                    }
                });
                IronSource_Rewarded.showRewarded(activity);
            } else if (brand.equals(Const.sdk)) {
                if (Sdk_Rewarded.mRewardedAd == null) {
                    if (!Sdk_Rewarded.mRewardedAd.isAdLoaded()) {
                        if (onAdsClickListner != null) {
                            onAdsClickListner.OnAdsClick();
                        }
                    }
                }
                Sdk_Rewarded.setOnAdsClickListner(new OnAdsClickListner() {
                    @Override
                    public void OnAdsClick() {
                        if (onAdsClickListner != null) {
                            onAdsClickListner.OnAdsClick();
                        }
                    }
                });
                Sdk_Rewarded.showRewarded(activity);
            } else if (brand.equals(Const.topon)) {

                if (Topon_Rewarded.mRewardedAd == null) {
                    if (!Topon_Rewarded.mRewardedAd.isAdReady()) {
                        if (onAdsClickListner != null) {
                            onAdsClickListner.OnAdsClick();
                        }
                    }
                }

                Topon_Rewarded.setOnAdsClickListner(new OnAdsClickListner() {
                    @Override
                    public void OnAdsClick() {
                        if (onAdsClickListner != null) {
                            onAdsClickListner.OnAdsClick();
                        }
                    }
                });
                Topon_Rewarded.showRewarded(activity);
            } else if (brand.equals(Const.qureka)) {
                Qureka_Interstitial.setOnAdsClickListner(new OnAdsClickListner() {
                    @Override
                    public void OnAdsClick() {
                        if (onAdsClickListner != null) {
                            onAdsClickListner.OnAdsClick();
                        }
                    }
                });
                Qureka_Interstitial.showInterstitial(activity);
            } else {
                if (onAdsClickListner != null) {
                    onAdsClickListner.OnAdsClick();
                }
            }


        } catch (Exception e) {
            if (onAdsClickListner != null) {
                onAdsClickListner.OnAdsClick();
            }
            Log.d(TAG, " showRewardedAdPriorityWise Exception " + e.toString());
            e.printStackTrace();
        }

    }


    public static void showNativeBigTop(Activity activity, ViewGroup viewGroup) {
        showNativeTopType(activity, viewGroup, Const.Big, Const.BigTop);
    }

    public static void showNativeBigBounceTop(Activity activity, ViewGroup viewGroup) {
        showNativeTopType(activity, viewGroup, Const.Big, Const.BigBounceTop);
    }

    public static void showNativeSmallTop(Activity activity, ViewGroup id) {
        showNativeTopType(activity, id, Const.Small, Const.SmallTop);
    }

    private static void showNativeTopType(Activity activity, ViewGroup viewGroup, String nativeType, String direction) {
        try {
            if (MyApp.getString(Const.native_top_show).equals("1")) {
                Log.d(TAG, "showNativeType native_top_show -> ");

                if (!MyApp.getString(Const.native_top_priority).equals("")) {
                    String[] priority = MyApp.getString(Const.native_top_priority).split("\\|");
                    if (priority.length == 0) {
                        showNativeTopTypePriorityWise(activity, viewGroup, nativeType, direction, priority[0]);
                    } else {

                        List<String> listFillAds = utils.NativeTopTypeFillListCompanyWise(activity);
                        String findAds = null;

                        for (int j = 0; j < priority.length; j++) {
                            if (listFillAds.contains(priority[j])) {
                                findAds = priority[j];
                                break;
                            }
                        }

                        if (findAds == null) {
                            return;
                        }
                        showNativeTopTypePriorityWise(activity, viewGroup, nativeType, direction, findAds);
                    }
                }

            }
        } catch (Exception e) {
            Log.d(TAG, "showNativeType Exception -> " + e);
            e.printStackTrace();
        }

    }


    private static void showNativeTopTypePriorityWise(Activity activity, ViewGroup viewGroup, String nativeType, String direction, String brand) {
        if (brand.equals(Const.admob)) {
            Admob_Native.showTopNative(activity, viewGroup, nativeType, direction);
        } else if (brand.equals(Const.facebook)) {
            Facebook_Native.showTopNative(activity, viewGroup, nativeType, direction);
        } else if (brand.equals(Const.iron)) {
            IronSource_Native.showTopNative(activity, viewGroup, nativeType, direction);
        } else if (brand.equals(Const.sdk)) {
            Sdk_Native.showTopNative(activity, viewGroup, nativeType, direction);
        } else if (brand.equals(Const.topon)) {
            Topon_Native.showTopNative(activity, viewGroup, nativeType, direction);
        } else if (brand.equals(Const.qureka)) {
            Qureka_Native.showTopNative(activity, viewGroup, nativeType, direction);
        }
    }

    public static void showNativeSmallBottom(Activity activity, ViewGroup viewGroup) {
        showNativeBottomType(activity, viewGroup, Const.Small, Const.SmallBottom);
    }

    private static void showNativeBottomType(Activity activity, ViewGroup viewGroup, String nativeType, String direction) {
        try {

            if (MyApp.getString(Const.native_bottom_show).equals("1")) {
                Log.d(TAG, "showNativeType native_bottom_show -> ");

                if (!MyApp.getString(Const.native_bottom_priority).equals("")) {
                    String[] priority = MyApp.getString(Const.native_bottom_priority).split("\\|");
                    if (priority.length == 0) {
                        showNativeBottomTypePriorityWise(activity, viewGroup, nativeType, direction, priority[0]);
                    } else {

                        List<String> listFillAds = utils.NativeBottomTypeFillListCompanyWise(activity);
                        String findAds = null;

                        for (int j = 0; j < priority.length; j++) {
                            if (listFillAds.contains(priority[j])) {
                                findAds = priority[j];
                                break;
                            }
                        }
                        if (findAds == null) {
                            return;
                        }
                        showNativeBottomTypePriorityWise(activity, viewGroup, nativeType, direction, findAds);
                    }
                }

            }

        } catch (Exception e) {
            Log.d(TAG, "showNativeBottomType Exception -> " + e);
            e.printStackTrace();
        }

    }


    private static void showNativeBottomTypePriorityWise(Activity activity, ViewGroup viewGroup, String nativeType, String direction, String brand) {
        if (brand.equals(Const.admob)) {
            Admob_Native.showBottomNative(activity, viewGroup, nativeType, direction);
        } else if (brand.equals(Const.facebook)) {
            Facebook_Native.showBottomNative(activity, viewGroup, nativeType, direction);
        } else if (brand.equals(Const.iron)) {
            IronSource_Native.showBottomNative(activity, viewGroup, nativeType, direction);
        } else if (brand.equals(Const.sdk)) {
            Sdk_Native.showBottomNative(activity, viewGroup, nativeType, direction);
        } else if (brand.equals(Const.topon)) {
            Topon_Native.showBottomNative(activity, viewGroup, nativeType, direction);
        } else if (brand.equals(Const.qureka)) {
            Qureka_Native.showBottomNative(activity, viewGroup, nativeType, direction);
        }
    }


    public static void showNativeExtraTop(Activity activity, ViewGroup viewGroup) {
        showNativeExtraType(activity, viewGroup, Const.Small, Const.SmallTop);
    }

    public static void showNativeExtraBottom(Activity activity, ViewGroup viewGroup) {
        showNativeExtraType(activity, viewGroup, Const.Small, Const.SmallBottom);
    }

    private static void showNativeExtraType(Activity activity, ViewGroup viewGroup, String nativeType, String direction) {
        try {
            if (!MyApp.getString(Const.native_Extra).equals("")) {

                String[] priority = MyApp.getString(Const.native_Extra).split("\\|");
                if (priority.length == 0) {
                    showNativeExtraTypePriorityWise(activity, viewGroup, nativeType, direction, priority[0]);
                } else {

                    List<String> listFillAds = utils.NativeExtraTypeFillListCompanyWise(activity);
                    String findAds = null;

                    for (int j = 0; j < priority.length; j++) {
                        if (listFillAds.contains(priority[j])) {
                            findAds = priority[j];
                            break;
                        }
                    }
                    if (findAds == null) {
                        return;
                    }
                    showNativeExtraTypePriorityWise(activity, viewGroup, nativeType, direction, findAds);
                }


            }
        } catch (Exception e) {
            Log.d(TAG, "showNativeExtraType Exception -> " + e);
            e.printStackTrace();
        }

    }

    private static void showNativeExtraTypePriorityWise(Activity activity, ViewGroup viewGroup, String nativeType, String direction, String brand) {

        if (brand.equals(Const.admob)) {
            Admob_Native.showNativeExtra(activity, viewGroup, nativeType, direction);
        } else if (brand.equals(Const.facebook)) {
            Facebook_Native.showNativeExtra(activity, viewGroup, nativeType, direction);
        } else if (brand.equals(Const.iron)) {
            IronSource_Native.showNativeExtra(activity, viewGroup, nativeType, direction);
        } else if (brand.equals(Const.sdk)) {
            Sdk_Native.showNativeExtra(activity, viewGroup, nativeType, direction);
        } else if (brand.equals(Const.topon)) {
            Topon_Native.showNativeExtra(activity, viewGroup, nativeType, direction);
        } else if (brand.equals(Const.qureka)) {
            Qureka_Native.showNativeExtra(activity, viewGroup, nativeType, direction);
        }

    }


    public static void showAdsOnBtnClick(Activity activity, OnAdsClickListner onAdsClickListner) {
        int adsType = utils.get_AdsOnBtnClickId();
        Log.d(TAG, "AdsManager showAdsOnBtnClick adsType " + adsType);
        if (adsType == 0) {
            onAdsClickListner.OnAdsClick();
        } else if (adsType == 2) {
            ShowInterstitialAd(activity, onAdsClickListner);
        } else if (adsType == 3) {
            ShowAppOpenAd(activity, onAdsClickListner);
        } else if (adsType == 4) {
            ShowRewarded(activity, onAdsClickListner);
        } else {
            onAdsClickListner.OnAdsClick();
        }
    }

    public static void showBackButtonAd(Activity mactivity, OnAdsClickListner adsInitListner) {
        if (MyApp.getString(Const.back_btn).equals("true")) {

            String ids = utils.get_BackButton_AdsType();

            if (ids.equals("2")) {
                Log.d(TAG, "showBackButtonAd ShowInterstitialAd");
                AdsManager.ShowInterstitialAd(mactivity, new OnAdsClickListner() {
                    @Override
                    public void OnAdsClick() {
                        adsInitListner.OnAdsClick();
                    }
                });

            } else if (ids.equals("3")) {
                Log.d(TAG, "showBackButtonAd ShowAppOpenAd");
                AdsManager.ShowAppOpenAd(mactivity, new OnAdsClickListner() {
                    @Override
                    public void OnAdsClick() {
                        adsInitListner.OnAdsClick();
                    }
                });
            } else if (ids.equals("4")) {
                Log.d(TAG, "showBackButtonAd ShowRewarded");
                AdsManager.ShowRewarded(mactivity, new OnAdsClickListner() {
                    @Override
                    public void OnAdsClick() {
                        adsInitListner.OnAdsClick();
                    }
                });
            } else {
                adsInitListner.OnAdsClick();
            }

        } else {
            adsInitListner.OnAdsClick();
        }
    }

    public static void startBtn(Activity activity, OnAdsClickListner onAdsClickListner) {

        if (MyApp.getString(Const.label).equals("1")) {
            showAdsOnBtnClick(activity, onAdsClickListner);
            return;
        }

        if (MyApp.getString(Const.play_status).equals("1")) {
            if (MyApp.getString(Const.is_organic_user).equals("true")) {
                MyApp.setString(Const.label, "1");
                showAdsOnBtnClick(activity, onAdsClickListner);
                return;
            }
        }

        if (MyApp.getString(Const.v_type).equals("")) {
            showAdsOnBtnClick(activity, onAdsClickListner);
        } else {

            if (MyApp.getString(Const.v_type).equals("1")) {
                if (vServices.isconnectedVpage) {
                    showAdsOnBtnClick(activity, onAdsClickListner);
                } else {
                    AppUtil.showLoader(activity);
                    Intent intent = new Intent(activity, vServices.class);
                    intent.setAction(vServices.SERVICES_START);
                    activity.startService(intent);

                    vServices.vServicesAct(activity, new vServices.ConnectVpage() {
                        @Override
                        public void vpageConnected(boolean isconnect) {
                            AppUtil.cancelLoader();
                            showAdsOnBtnClick(activity, onAdsClickListner);
                        }
                    });

                }
            } else {

                if (MyApp.getString(Const.v_type).equals("2")) {

                    if (MyApp.getString(Const.v_page).equals("false")) {
                        if (vServices.isconnectedVpage) {
                            showAdsOnBtnClick(activity, onAdsClickListner);
                        } else {
                            AppUtil.showLoader(activity);
                            Intent intent = new Intent(activity, vServices.class);
                            intent.setAction(vServices.SERVICES_START);
                            activity.startService(intent);
                            vServices.vServicesAct(activity, new vServices.ConnectVpage() {
                                @Override
                                public void vpageConnected(boolean isconnect) {
                                    if (!isconnect) {
                                        Intent intent = new Intent(activity, vServices.class);
                                        intent.setAction(vServices.SERVICES_START);
                                        activity.startService(intent);
                                        vServices.vServicesAct(activity, new vServices.ConnectVpage() {
                                            @Override
                                            public void vpageConnected(boolean isconnect) {
                                                AppUtil.cancelLoader();
                                                showAdsOnBtnClick(activity, onAdsClickListner);
                                            }
                                        });
                                    } else {
                                        AppUtil.cancelLoader();
                                        showAdsOnBtnClick(activity, onAdsClickListner);
                                    }
                                }
                            });
                        }
                    } else if (MyApp.getString(Const.v_page).equals("true")) {

                        if (vServices.isconnectedVpage) {
                            showAdsOnBtnClick(activity, onAdsClickListner);
                            return;
                        }

                        VpageActivity dialog = new VpageActivity(activity);
                        dialog.setCancelable(false);
                        dialog.show();
                        dialog.setClickOnButton(new VpageActivity.ClickOnButton() {
                            @Override
                            public void buttonClick() {
                                if (!vServices.isconnectedVpage) {
                                    Intent intent = new Intent(activity, vServices.class);
                                    intent.setAction(vServices.SERVICES_START);
                                    activity.startService(intent);
                                    vServices.vServicesAct(activity, new vServices.ConnectVpage() {
                                        @Override
                                        public void vpageConnected(boolean isconnect) {
                                            if (isconnect) {
                                                dialog.dismiss();
                                                dialog.cancel();
                                                showAdsOnBtnClick(activity, onAdsClickListner);
                                            } else {
                                                Intent intent = new Intent(activity, vServices.class);
                                                intent.setAction(vServices.SERVICES_START);
                                                activity.startService(intent);
                                                vServices.vServicesAct(activity, new vServices.ConnectVpage() {
                                                    @Override
                                                    public void vpageConnected(boolean isconnect) {
                                                        dialog.dismiss();
                                                        dialog.cancel();
                                                        showAdsOnBtnClick(activity, onAdsClickListner);
                                                    }
                                                });
                                            }
                                        }
                                    });
                                } else {
                                    showAdsOnBtnClick(activity, onAdsClickListner);
                                }
                            }
                        });

                    } else {
                        showAdsOnBtnClick(activity, onAdsClickListner);
                    }
                } else {
                    showAdsOnBtnClick(activity, onAdsClickListner);
                }
            }
        }
    }

    public static void showBgAds(Activity activity, ViewGroup viewgroup) {
        if (MyApp.getString(Const.b_show).equals("1")) {
            viewgroup.setVisibility(View.VISIBLE);
        } else {
            viewgroup.setVisibility(View.GONE);
        }

        String url = utils.get_BgAds_AdsId();

        if (!url.equals("")) {


            LayoutInflater inflater = LayoutInflater.from(activity);
            View view = (View) inflater.inflate(R.layout.ads_native_webview, null);

            ShimmerFrameLayout mShimmerViewContainer = view.findViewById(R.id.shimmer_view_container);
            mShimmerViewContainer.startShimmer();
            mShimmerViewContainer.setVisibility(View.VISIBLE);

            RelativeLayout webViewHeight = view.findViewById(R.id.webViewHeight);
            CustomWebView webView = view.findViewById(R.id.web_view);
            webViewHeight.getLayoutParams().height = ViewGroup.LayoutParams.MATCH_PARENT;


            utils.WebViewSetting(activity, webView);
            utils.downloadManager(activity, webView);
            webView.setWebChromeClient(new utils.MyWebChromeClient(activity));
            webView.setWebViewClient(new WebViewClient() { // from class: com.fastbrowser.webbrowser.appinternet.mainactivity.WebFragment.83
                @Override // android.webkit.WebViewClient
                public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                    webView.loadUrl(str);
                    return true;
                }

                @Override // android.webkit.WebViewClient
                public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                    mShimmerViewContainer.startShimmer();
                    mShimmerViewContainer.setVisibility(View.VISIBLE);
                    super.onPageStarted(webView, str, bitmap);
                }

                @Override
                public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
                    final AlertDialog.Builder builder = new AlertDialog.Builder(activity);
                    builder.setMessage(R.string.alert_http);
                    builder.setPositiveButton(R.string.btn_continu, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            handler.proceed();
                        }
                    });
                    builder.setNegativeButton(R.string.btn_cancel, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            handler.cancel();
                        }
                    });
                    final AlertDialog dialog = builder.create();
                    dialog.show();
                }

                @Override
                public void onPageFinished(WebView view, String url) {
                    mShimmerViewContainer.stopShimmer();
                    mShimmerViewContainer.setVisibility(View.GONE);
//                super.onPageFinished(view, url);
                }
            });
            webView.loadUrl(url);
            viewgroup.removeAllViews();
            viewgroup.addView(view);

        } else {
            viewgroup.setVisibility(View.GONE);
        }
    }
}
