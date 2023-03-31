package com.google.play.AdsHelper;

import android.app.Activity;
import android.os.CountDownTimer;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeBannerAd;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.play.MyApp;
import com.google.ads.R;
import com.google.play.Utils.Const;
import com.google.play.Utils.utils;

public class Facebook_Native {

    public static final String TAG = "Facebook_Native";


    //    -----------------------  Top Ads --------------------------------------

    public static NativeAd nativeAdTop = null, nativeAdTop1 = null;
    public static Boolean isNativeTopTimerRun = false;

    public static Boolean isLoadedBannerAdTop = false;
    public static NativeBannerAd bannerTop = null;

    public static void loadBannerTop(Activity mactivity) {
        if (MyApp.getString(Const.banner_type_top).equals("1")) {
            String adId = utils.get_Facebook_BannerAdsId();
            Log.d(TAG, "Facebook_Native loadBannerTop -> " + adId);
            bannerTop = new NativeBannerAd(mactivity, adId);
            bannerTop.loadAd(bannerTop.buildLoadAdConfig().withAdListener(new NativeAdListener() {
                @Override
                public void onMediaDownloaded(Ad ad) {
                    Log.d(TAG, "Facebook_Native loadBannerTop onMediaDownloaded-> ");
                }

                @Override
                public void onError(Ad ad, AdError adError) {
                    isLoadedBannerAdTop = false;
                    Log.d(TAG, "Facebook_Native loadBannerTop onError-> " + adError.getErrorMessage() + " code:" + adError.getErrorCode());
                }

                @Override
                public void onAdLoaded(Ad ad) {
                    Log.d(TAG, "Facebook_Native loadBannerTop onAdLoaded-> ");
                    if (bannerTop == null || bannerTop != ad) {
                        isLoadedBannerAdTop = false;
                        return;
                    }
                    isLoadedBannerAdTop = true;
                    bannerTop.downloadMedia();
                }

                @Override
                public void onAdClicked(Ad ad) {
//                    Log.d(TAG, "Facebook_Native loadBannerTop onAdClicked-> ");
                }

                @Override
                public void onLoggingImpression(Ad ad) {
//                    Log.d(TAG, "Facebook_Native loadBannerTop onLoggingImpression-> ");
                }
            }).build());
        }
    }

    public static void loadNativeTop(Activity mactivity) {
        String adId = utils.get_Facebook_NativeAdsId_1();
        NativeAd nativeAd = new NativeAd(mactivity, adId);
        nativeAd.loadAd(nativeAd.buildLoadAdConfig().withAdListener(new NativeAdListener() {
            @Override
            public void onMediaDownloaded(Ad ad) {
//                Log.d(TAG, "Facebook_Native loadNativeTop onMediaDownloaded-> ");
            }

            @Override
            public void onError(Ad ad, AdError adError) {
                nativeAdTop = null;
//                isLoadedNativeAdTop = false;
                Log.d(TAG, "Facebook_Native loadNativeTop onError -> Code : " + adError.getErrorCode() + " ErrorMessage : " + adError.getErrorMessage());
            }

            @Override
            public void onAdLoaded(Ad ad) {

//                if (nativeAdTop == null || nativeAdTop != ad) {
//                    return;
//                }

                Log.d(TAG, "Facebook_Native loadNativeTop onAdLoaded adId -> " + adId);
                if (nativeAd == null || nativeAd != ad) {
                    return;
                }
                nativeAdTop = nativeAd;
//                isLoadedNativeAdTop = true;
                nativeAdTop.downloadMedia();
            }

            @Override
            public void onAdClicked(Ad ad) {
//                Log.d(TAG, "Facebook_Native loadNativeTop onAdClicked-> ");
            }

            @Override
            public void onLoggingImpression(Ad ad) {
//                Log.d(TAG, "Facebook_Native loadNativeTop onLoggingImpression-> ");
            }
        }).build());

    }

    public static void loadNativeTop1(Activity mactivity) {
        String adId = utils.get_Facebook_NativeAdsId_2();
        NativeAd nativeAd = new NativeAd(mactivity, adId);
        nativeAd.loadAd(nativeAd.buildLoadAdConfig().withAdListener(new NativeAdListener() {
            @Override
            public void onMediaDownloaded(Ad ad) {
//                Log.d(TAG, "Facebook_Native loadNativeTop onMediaDownloaded-> ");
            }

            @Override
            public void onError(Ad ad, AdError adError) {
                nativeAdTop1 = null;
//                isLoadedNativeAdTop = false;
                Log.d(TAG, "Facebook_Native loadNativeTop1 onError -> Code : " + adError.getErrorCode() + " ErrorMessage : " + adError.getErrorMessage());
            }

            @Override
            public void onAdLoaded(Ad ad) {

//                if (nativeAdTop == null || nativeAdTop != ad) {
//                    return;
//                }

                Log.d(TAG, "Facebook_Native loadNativeTop1 onAdLoaded adId -> " + adId);
                if (nativeAd == null || nativeAd != ad) {
                    return;
                }
                nativeAdTop1 = nativeAd;
//                isLoadedNativeAdTop = true;
                nativeAdTop1.downloadMedia();
            }

            @Override
            public void onAdClicked(Ad ad) {
//                Log.d(TAG, "Facebook_Native loadNativeTop onAdClicked-> ");
            }

            @Override
            public void onLoggingImpression(Ad ad) {
//                Log.d(TAG, "Facebook_Native loadNativeTop onLoggingImpression-> ");
            }
        }).build());

    }

    public static void showTopNative(Activity activity, ViewGroup viewGroup, String nativeType, String direction) {
        Log.d(TAG, "Facebook_Native showTopNative direction -> " + direction);
        if (nativeType.equals(Const.Big)) {

            if (nativeAdTop != null) {
                Log.d(TAG, "Facebook_Native showTopNative showFacebookNative_Big nativeAdTop -> 1");
                showFacebookNative_Big(activity, viewGroup, nativeAdTop, nativeType, direction);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        nativeAdTop = null;
                    }
                }, Const.nullParameterTime);
                loadNativeTop1(activity);
            } else {

                if (nativeAdTop1 != null) {
                    Log.d(TAG, "Facebook_Native showTopNative showFacebookNative_Big nativeAdTop -> 2");
                    showFacebookNative_Big(activity, viewGroup, nativeAdTop1, nativeType, direction);
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            nativeAdTop1 = null;
                        }
                    }, Const.nullParameterTime);
                    loadNativeTop(activity);
                } else {
                    startTimerTopNative(activity);
                    Log.d(TAG, "Facebook_Native showTopNative showFacebookNative_Big nativeAdTop & nativeAdTop1 -> null");
                }
            }
        } else if (direction.equals(Const.SmallTop)) {
            if (MyApp.getString(Const.banner_type_top).equals("1")) {
                showFacebookBanner_Top(activity, viewGroup, bannerTop, nativeType, direction);
                loadBannerTop(activity);
            } else {

                if (nativeAdTop != null) {
                    Log.d(TAG, "Facebook_Native showTopNative nativeAdTop -> 1");
                    showFacebookNative_SmallTop(activity, viewGroup, nativeAdTop, nativeType, direction);
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            nativeAdTop = null;
                        }
                    }, Const.nullParameterTime);
                    loadNativeTop1(activity);
                } else {

                    if (nativeAdTop1 != null) {
                        Log.d(TAG, "Facebook_Native showTopNative nativeAdTop -> 2");
                        showFacebookNative_SmallTop(activity, viewGroup, nativeAdTop1, nativeType, direction);
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                nativeAdTop1 = null;
                            }
                        }, Const.nullParameterTime);
                        loadNativeTop(activity);
                    } else {
                        startTimerTopNative(activity);
                        Log.d(TAG, "Facebook_Native showTopNative nativeAdTop & nativeAdTop1 -> null");
                    }
                }
            }
        }
    }

    public static void startTimerTopNative(Activity activity) {

        if (isNativeTopTimerRun) {
            return;
        }

        isNativeTopTimerRun = true;

        new CountDownTimer(Const.requestLoadTime, 1000) {

            public void onTick(long millisUntilFinished) {

            }

            public void onFinish() {
                loadNativeTop(activity);
                isNativeTopTimerRun = false;
            }

        }.start();
    }

    private static void showFacebookNative_Big(Activity activity, ViewGroup viewGroup, NativeAd nativeAd, String nativeType, String direction) {
        Log.d(TAG, "Facebook_Native showAdmobNative_Big -> ");
        try {
            viewGroup.setVisibility(View.VISIBLE);
            viewGroup.removeAllViews();

            View view = LayoutInflater.from(activity).inflate(R.layout.native_big_placeholder, null);
            viewGroup.addView(view);

            ShimmerFrameLayout mShimmerViewContainer = view.findViewById(R.id.shimmer_view_container);
            mShimmerViewContainer.startShimmer();
            mShimmerViewContainer.setVisibility(View.VISIBLE);

            if (nativeAd == null) {
                viewGroup.removeAllViews();
                viewGroup.setVisibility(View.GONE);
                return;
            }

            Facebook_Native_Inflate.inflate_native_big_card(activity, viewGroup, nativeAd, nativeType, direction);

        } catch (Exception e) {
            Log.d(TAG, "Facebook_Native showAdmobNative_Big Exception -> " + e.toString());
            e.printStackTrace();
        }


    }

    private static void showFacebookNative_SmallTop(Activity activity, ViewGroup viewGroup, NativeAd nativeAd, String nativeType, String direction) {
        Log.d(TAG, "Facebook_Native showFacebookNative_SmallTop -> ");
        try {
            viewGroup.setVisibility(View.VISIBLE);
            viewGroup.removeAllViews();

            View view = LayoutInflater.from(activity).inflate(R.layout.native_small_placeholder, null);
            viewGroup.addView(view);

            ShimmerFrameLayout mShimmerViewContainer = view.findViewById(R.id.shimmer_view_container);
            mShimmerViewContainer.startShimmer();
            mShimmerViewContainer.setVisibility(View.VISIBLE);

            if (nativeAd == null) {
                viewGroup.removeAllViews();
                viewGroup.setVisibility(View.GONE);
                return;
            }

            if (MyApp.getString(Const.ads_btn_top).equals("1")) {
                Facebook_Native_Inflate.inflate_native_Small_Banner(activity, viewGroup, nativeAd, nativeType, direction);
            } else {
                Facebook_Native_Inflate.inflate_native_SmallTop(activity, viewGroup, nativeAd, nativeType, direction);
            }

        } catch (Exception e) {
            viewGroup.setVisibility(View.GONE);
            Log.d(TAG, "Facebook_Native showFacebookNative_SmallTop Exception -> " + e.toString());
            e.printStackTrace();
        }


    }

    private static void showFacebookBanner_Top(Activity activity, ViewGroup viewGroup, NativeBannerAd bannerTop1, String nativeType, String direction) {
        Log.d(TAG, "Facebook_Native showFacebookBanner_Top -> ");

        try {
            viewGroup.setVisibility(View.VISIBLE);
            viewGroup.removeAllViews();

            View view = LayoutInflater.from(activity).inflate(R.layout.native_small_placeholder, null);
            viewGroup.addView(view);

            ShimmerFrameLayout mShimmerViewContainer = view.findViewById(R.id.shimmer_view_container);
            mShimmerViewContainer.startShimmer();
            mShimmerViewContainer.setVisibility(View.VISIBLE);


            if (bannerTop == null || !isLoadedBannerAdTop) {
                viewGroup.setVisibility(View.GONE);
                return;
            }

            viewGroup.removeAllViews();
            viewGroup.setVisibility(View.VISIBLE);
            Facebook_Native_Inflate.inflate_native_banner(activity, viewGroup, bannerTop);

        } catch (Exception e) {
            viewGroup.setVisibility(View.GONE);
            Log.d(TAG, "Facebook_Native showAdmobBanner_Top Exception -> " + e.toString());
            e.printStackTrace();
        }


    }

    //    -----------------------  Top Ads --------------------------------------


    //    -----------------------  Bottom Ads --------------------------------------


    public static NativeAd nativeAdBottom = null, nativeAdBottom1 = null;
    public static Boolean isNativeBottomTimerRun = false;

    public static NativeBannerAd bannerBottom = null;
    public static Boolean isLoadedBannerAdBottom = false;

    public static void loadBannerBottom(Activity mactivity) {
        Log.d(TAG, "Facebook_Native loadBannerBottom -> ");
        if (MyApp.getString(Const.banner_type_bottom).equals("1")) {

            String adId = utils.get_Facebook_BannerAdsId();
            Log.d(TAG, "Facebook_Native loadBannerBottom -> " + adId);
            bannerBottom = new NativeBannerAd(mactivity, adId);
            bannerBottom.loadAd(bannerBottom.buildLoadAdConfig().withAdListener(new NativeAdListener() {
                @Override
                public void onMediaDownloaded(Ad ad) {
                    Log.d(TAG, "Facebook_Native loadBannerBottom onMediaDownloaded-> ");
                }

                @Override
                public void onError(Ad ad, AdError adError) {
                    isLoadedBannerAdTop = false;
                    Log.d(TAG, "Facebook_Native loadBannerBottom onError-> " + adError.getErrorMessage() + " code:" + adError.getErrorCode());
                }

                @Override
                public void onAdLoaded(Ad ad) {
                    Log.d(TAG, "Facebook_Native loadBannerBottom onAdLoaded-> ");
                    if (bannerBottom == null || bannerBottom != ad) {
                        isLoadedBannerAdTop = false;
                        return;
                    }
                    isLoadedBannerAdBottom = true;
                    bannerBottom.downloadMedia();
                }

                @Override
                public void onAdClicked(Ad ad) {
                    Log.d(TAG, "Facebook_Native loadBannerBottom onAdClicked-> ");
                }

                @Override
                public void onLoggingImpression(Ad ad) {
                    Log.d(TAG, "Facebook_Native loadBannerBottom onLoggingImpression-> ");
                }
            }).build());
        }
    }

    public static void loadNativeBottom(Activity mactivity) {
        String adId = utils.get_Facebook_NativeAdsId_2();
        NativeAd nativeAd = new NativeAd(mactivity, adId);
        nativeAd.loadAd(nativeAd.buildLoadAdConfig().withAdListener(new NativeAdListener() {
            @Override
            public void onMediaDownloaded(Ad ad) {
                Log.d(TAG, "Facebook_Native loadNativeBottom onMediaDownloaded-> ");
            }

            @Override
            public void onError(Ad ad, AdError adError) {
                Log.d(TAG, "Facebook_Native loadNativeBottom onError -> Code : " + adError.getErrorCode() + " ErrorMessage : " + adError.getErrorMessage());
            }

            @Override
            public void onAdLoaded(Ad ad) {
                Log.d(TAG, "Facebook_Native loadNativeBottom onAdLoaded-> ");
                if (nativeAd == null || nativeAd != ad) {
                    return;
                }
                nativeAdBottom = nativeAd;
                nativeAdBottom.downloadMedia();
            }

            @Override
            public void onAdClicked(Ad ad) {
//                Log.d(TAG, "Facebook_Native loadNativeBottom onAdClicked-> ");
            }

            @Override
            public void onLoggingImpression(Ad ad) {
//                Log.d(TAG, "Facebook_Native loadNativeBottom onLoggingImpression-> ");
            }
        }).build());
    }

    public static void loadNativeBottom1(Activity mactivity) {
        String adId = utils.get_Facebook_NativeAdsId_1();
        NativeAd nativeAd = new NativeAd(mactivity, adId);
        nativeAd.loadAd(nativeAd.buildLoadAdConfig().withAdListener(new NativeAdListener() {
            @Override
            public void onMediaDownloaded(Ad ad) {
                Log.d(TAG, "Facebook_Native loadNativeBottom1 onMediaDownloaded-> ");
            }

            @Override
            public void onError(Ad ad, AdError adError) {
                Log.d(TAG, "Facebook_Native loadNativeBottom1 onError -> Code : " + adError.getErrorCode() + " ErrorMessage : " + adError.getErrorMessage());
            }

            @Override
            public void onAdLoaded(Ad ad) {
                Log.d(TAG, "Facebook_Native loadNativeBottom1 onAdLoaded-> ");
                if (nativeAd == null || nativeAd != ad) {
                    return;
                }
                nativeAdBottom1 = nativeAd;
                nativeAdBottom1.downloadMedia();
            }

            @Override
            public void onAdClicked(Ad ad) {
//                Log.d(TAG, "Facebook_Native loadNativeBottom onAdClicked-> ");
            }

            @Override
            public void onLoggingImpression(Ad ad) {
//                Log.d(TAG, "Facebook_Native loadNativeBottom onLoggingImpression-> ");
            }
        }).build());
    }

    public static void showBottomNative(Activity activity, ViewGroup viewGroup, String nativeType, String direction) {
        Log.d(TAG, "Facebook_Native showBottomNative direction -> " + direction);
        if (MyApp.getString(Const.banner_type_bottom).equals("1")) {
            showFacebookBanner_Bottom(activity, viewGroup, bannerBottom, nativeType, direction);
            loadBannerBottom(activity);
        } else {
            if (direction.equals(Const.SmallBottom)) {
//                showFacebookNative_SmallBottom(activity, id, nativeAdBottom, nativeType, direction);
//                loadNativeBottom(activity);

                if (nativeAdBottom != null) {
                    Log.d(TAG, "Facebook_Native showBottomNative nativeAdBottom -> 1");
                    showFacebookNative_SmallBottom(activity, viewGroup, nativeAdBottom, nativeType, direction);
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            nativeAdBottom = null;
                        }
                    }, Const.nullParameterTime);
                    loadNativeBottom1(activity);
                } else {

                    if (nativeAdBottom1 != null) {
                        Log.d(TAG, "Facebook_Native showBottomNative nativeAdBottom -> 2");
                        showFacebookNative_SmallBottom(activity, viewGroup, nativeAdBottom1, nativeType, direction);
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                nativeAdBottom1 = null;
                            }
                        }, Const.nullParameterTime);
                        loadNativeBottom(activity);
                    } else {
                        startTimerBottomNative(activity);
                        Log.d(TAG, "Facebook_Native showBottomNative nativeAdBottom & nativeAdBottom1 -> null");
                    }
                }
            }


        }
    }

    public static void startTimerBottomNative(Activity activity) {
        if (isNativeBottomTimerRun) {
            return;
        }
        isNativeBottomTimerRun = true;
        new CountDownTimer(Const.requestLoadTime, 1000) {

            public void onTick(long millisUntilFinished) {

            }

            public void onFinish() {
                loadNativeBottom(activity);
                isNativeBottomTimerRun = false;
            }

        }.start();
    }


    private static void showFacebookNative_SmallBottom(Activity activity, ViewGroup viewGroup, NativeAd nativeAd, String nativeType, String direction) {
        Log.d(TAG, "Facebook_Native showAdmobNative_SmallBottom -> ");

        try {
            viewGroup.setVisibility(View.VISIBLE);
            viewGroup.removeAllViews();

            View view = LayoutInflater.from(activity).inflate(R.layout.native_small_placeholder, null);
            viewGroup.addView(view);

            ShimmerFrameLayout mShimmerViewContainer = view.findViewById(R.id.shimmer_view_container);
            mShimmerViewContainer.startShimmer();
            mShimmerViewContainer.setVisibility(View.VISIBLE);

            if (nativeAd == null) {
                viewGroup.removeAllViews();
                viewGroup.setVisibility(View.GONE);
                return;
            }

            if (MyApp.getString(Const.ads_btn_bottom).equals("1")) {
                Facebook_Native_Inflate.inflate_native_Small_Banner(activity, viewGroup, nativeAd, nativeType, direction);
            } else {
                Facebook_Native_Inflate.inflate_native_SmallBottom(activity, viewGroup, nativeAd, nativeType, direction);
            }

        } catch (Exception e) {
            viewGroup.setVisibility(View.GONE);
            Log.d(TAG, "Facebook_Native showAdmobNative_SmallBottom Exception -> " + e.toString());
            e.printStackTrace();
        }
    }

    private static void showFacebookBanner_Bottom(Activity activity, ViewGroup viewGroup, NativeBannerAd bannerBottom, String nativeType, String direction) {
        Log.d(TAG, "Facebook_Native showAdmobBanner_Bottom -> ");
        try {
            viewGroup.setVisibility(View.VISIBLE);
            viewGroup.removeAllViews();

            View view = LayoutInflater.from(activity).inflate(R.layout.native_small_placeholder, null);
            viewGroup.addView(view);

            ShimmerFrameLayout mShimmerViewContainer = view.findViewById(R.id.shimmer_view_container);
            mShimmerViewContainer.startShimmer();
            mShimmerViewContainer.setVisibility(View.VISIBLE);

            if (bannerBottom == null || isLoadedBannerAdBottom) {
                viewGroup.setVisibility(View.GONE);
                return;
            }

            viewGroup.removeAllViews();
            viewGroup.setVisibility(View.VISIBLE);
            Facebook_Native_Inflate.inflate_native_banner(activity, viewGroup, bannerBottom);

        } catch (Exception e) {
            viewGroup.setVisibility(View.GONE);
            Log.d(TAG, "Facebook_Native showAdmobBanner_Bottom Exception -> " + e.toString());
            e.printStackTrace();
        }


    }


    //    -----------------------  Bottom Ads --------------------------------------


    //    -----------------------  Extra Ads --------------------------------------


    public static NativeAd nativeAdExtra = null, nativeAdExtra1 = null;
    public static Boolean isNativeExtraTimerRun = false;

    public static void loadNativeExtra(Activity mactivity) {
        String adId = utils.get_Facebook_NativeAdsId_1();
        NativeAd nativeAd = new NativeAd(mactivity, adId);
        nativeAd.loadAd(nativeAd.buildLoadAdConfig().withAdListener(new NativeAdListener() {
            @Override
            public void onMediaDownloaded(Ad ad) {
                Log.d(TAG, "Facebook_Native loadNativeExtra onMediaDownloaded-> ");
            }

            @Override
            public void onError(Ad ad, AdError adError) {
                Log.d(TAG, "Facebook_Native loadNativeExtra onError -> Code : " + adError.getErrorCode() + " ErrorMessage : " + adError.getErrorMessage());
            }

            @Override
            public void onAdLoaded(Ad ad) {
                Log.d(TAG, "Facebook_Native loadNativeExtra onAdLoaded-> ");
                if (nativeAd == null || nativeAd != ad) {
                    return;
                }
                nativeAdExtra = nativeAd;
                nativeAdExtra.downloadMedia();
            }

            @Override
            public void onAdClicked(Ad ad) {
//                Log.d(TAG, "Facebook_Native loadNativeExtra onAdClicked-> ");
            }

            @Override
            public void onLoggingImpression(Ad ad) {
//                Log.d(TAG, "Facebook_Native loadNativeExtra onLoggingImpression-> ");
            }
        }).build());
    }

    public static void loadNativeExtra1(Activity mactivity) {
        String adId = utils.get_Facebook_NativeAdsId_2();
        NativeAd nativeAd = new NativeAd(mactivity, adId);
        nativeAd.loadAd(nativeAd.buildLoadAdConfig().withAdListener(new NativeAdListener() {
            @Override
            public void onMediaDownloaded(Ad ad) {
                Log.d(TAG, "Facebook_Native loadNativeExtra onMediaDownloaded-> ");
            }

            @Override
            public void onError(Ad ad, AdError adError) {
                Log.d(TAG, "Facebook_Native loadNativeExtra onError -> Code : " + adError.getErrorCode() + " ErrorMessage : " + adError.getErrorMessage());
            }

            @Override
            public void onAdLoaded(Ad ad) {
                Log.d(TAG, "Facebook_Native loadNativeExtra onAdLoaded-> ");
                if (nativeAd == null || nativeAd != ad) {
                    return;
                }
                nativeAdExtra1 = nativeAd;
                nativeAdExtra1.downloadMedia();
            }

            @Override
            public void onAdClicked(Ad ad) {
//                Log.d(TAG, "Facebook_Native loadNativeExtra onAdClicked-> ");
            }

            @Override
            public void onLoggingImpression(Ad ad) {
//                Log.d(TAG, "Facebook_Native loadNativeExtra onLoggingImpression-> ");
            }
        }).build());
    }

    public static void showNativeExtra(Activity activity, ViewGroup viewGroup, String nativeType, String direction) {
        Log.d(TAG, "Facebook_Native showNativeExtra -> ");

        if (nativeAdExtra != null) {
            Log.d(TAG, "Facebook_Native showNativeExtra nativeAdExtra -> 1");
            showFacebookNative_Extra(activity, viewGroup, nativeAdExtra, nativeType, direction);
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    nativeAdExtra = null;
                }
            }, Const.nullParameterTime);
            loadNativeExtra1(activity);
        } else {

            if (nativeAdExtra1 != null) {
                Log.d(TAG, "Facebook_Native showNativeExtra nativeAdExtra1 -> 2");
                showFacebookNative_Extra(activity, viewGroup, nativeAdExtra1, nativeType, direction);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        nativeAdExtra1 = null;
                    }
                }, Const.nullParameterTime);
                loadNativeExtra(activity);
            } else {
                startTimerExtraNative(activity);
                Log.d(TAG, "Facebook_Native showNativeExtra nativeAdExtra & nativeAdExtra1 -> null");
            }
        }

    }

    public static void startTimerExtraNative(Activity activity) {

        if (isNativeExtraTimerRun) {
            return;
        }

        isNativeExtraTimerRun = true;

        new CountDownTimer(Const.requestLoadTime, 1000) {

            public void onTick(long millisUntilFinished) {

            }

            public void onFinish() {
                loadNativeExtra(activity);
                isNativeExtraTimerRun = false;
            }

        }.start();
    }

    private static void showFacebookNative_Extra(Activity activity, ViewGroup viewGroup, NativeAd nativeAd, String nativeType, String direction) {
        Log.d(TAG, "Facebook_Native showFacebookNative_Extra -> ");

        try {
            viewGroup.setVisibility(View.VISIBLE);
            viewGroup.removeAllViews();

            View view = LayoutInflater.from(activity).inflate(R.layout.native_small_placeholder, null);
            viewGroup.addView(view);

            ShimmerFrameLayout mShimmerViewContainer = view.findViewById(R.id.shimmer_view_container);
            mShimmerViewContainer.startShimmer();
            mShimmerViewContainer.setVisibility(View.VISIBLE);

            if (nativeAd == null) {
                viewGroup.removeAllViews();
                viewGroup.setVisibility(View.GONE);
                return;
            }

            if (MyApp.getString(Const.ads_btn).equals("1")) {
                Facebook_Native_Inflate.inflate_native_Small_Banner(activity, viewGroup, nativeAd, nativeType, direction);
            } else {
                if (direction.equals(Const.SmallTop)) {
                    Log.d(TAG, "Facebook_Native showFacebookNative_Extra SmallTop");
                    Facebook_Native_Inflate.inflate_native_SmallBottom(activity, viewGroup, nativeAd, nativeType, direction);
                } else if (direction.equals(Const.SmallBottom)) {
                    Log.d(TAG, "Facebook_Native showFacebookNative_Extra SmallBottom");
                    Facebook_Native_Inflate.inflate_native_SmallTop(activity, viewGroup, nativeAd, nativeType, direction);
                }
            }

        } catch (Exception e) {
            viewGroup.setVisibility(View.GONE);
            Log.d(TAG, "Facebook_Native showFacebookNative_Extra Exception -> " + e.toString());
            e.printStackTrace();
        }

    }


    //    -----------------------  Extra Ads --------------------------------------

}
