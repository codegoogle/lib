package com.google.play.AdsHelper;

import android.app.Activity;
import android.os.CountDownTimer;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.anythink.banner.api.ATBannerView;
import com.anythink.core.api.AdError;
import com.anythink.nativead.api.ATNative;
import com.anythink.nativead.api.ATNativeNetworkListener;
import com.anythink.nativead.api.NativeAd;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.play.MyApp;
import com.google.ads.R;
import com.google.play.Utils.Const;
import com.google.play.Utils.utils;

public class Topon_Native {

    public static final String TAG = "Topon_Native";


    //    -----------------------  Top Ads --------------------------------------
    public static NativeAd nativeAdTop = null, nativeAdTop1 = null;
    public static Boolean isNativeTopTimerRun = false;
    private static ATNative atnativeAdTop, atnativeAdTop1;
    public static ATBannerView bannerTop;

    public static void loadBannerTop(Activity mactivity) {
        Log.d(TAG, "Topon_Native loadBannerTop -> ");
        if (MyApp.getString(Const.banner_type_top).equals("1")) {
            String adId = utils.get_Topon_BannerAdsId();
            ATBannerView aTBannerView = new ATBannerView(mactivity);
            aTBannerView.setPlacementId(adId);
            bannerTop = aTBannerView;
        }
    }

    public static void loadNativeTop(Activity mactivity) {
        Log.d(TAG, "Topon_Native loadNativeTop ->");

        String adId = utils.get_Topon_NativeAdsId_1();
        ATNative aTNative = new ATNative(mactivity, adId, new ATNativeNetworkListener() {
            @Override
            public void onNativeAdLoadFail(AdError adError) {
                Log.d(TAG, "Topon_Native loadNativeTop onNativeAdLoadFail : " + adError.getFullErrorInfo());
            }

            @Override
            public void onNativeAdLoaded() {
                Log.d(TAG, "Topon_Native loadNativeTop onNativeAdLoaded :");
                nativeAdTop = atnativeAdTop.getNativeAd();
            }
        });
        aTNative.makeAdRequest();
        atnativeAdTop = aTNative;
    }

    public static void loadNativeTop1(Activity mactivity) {
        String adId = utils.get_Topon_NativeAdsId_2();
        ATNative aTNative1 = new ATNative(mactivity, adId, new ATNativeNetworkListener() {
            @Override
            public void onNativeAdLoadFail(AdError adError) {
                Log.d(TAG, "Topon_Native loadNativeTop1 onNativeAdLoadFail : " + adError.getFullErrorInfo());
            }

            @Override
            public void onNativeAdLoaded() {
                Log.d(TAG, "Topon_Native loadNativeTop1 onNativeAdLoaded adId -> " + adId);
                nativeAdTop1 = atnativeAdTop1.getNativeAd();
            }
        });
        aTNative1.makeAdRequest();
        atnativeAdTop1 = aTNative1;
    }

    public static void showTopNative(Activity activity, ViewGroup viewGroup, String nativeType, String direction) {
        Log.d(TAG, "Topon_Native showTopNative direction -> " + direction);

        if (nativeType.equals(Const.Big)) {
            if (nativeAdTop != null) {
                Log.d(TAG, "Topon_Native showToponNative_Big nativeAdTop -> 1");
                showToponNative_Big(activity, viewGroup, nativeAdTop, nativeType, direction);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        nativeAdTop = null;
                    }
                }, Const.nullParameterTime);
                loadNativeTop1(activity);
            } else {

                if (nativeAdTop1 != null) {
                    Log.d(TAG, "Topon_Native showToponNative_Big nativeAdTop -> 2");
                    showToponNative_Big(activity, viewGroup, nativeAdTop1, nativeType, direction);
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            nativeAdTop1 = null;
                        }
                    }, Const.nullParameterTime);
                    loadNativeTop(activity);
                } else {
                    startTimerTopNative(activity);
                    Log.d(TAG, "Topon_Native showToponNative_Big nativeAdTop & nativeAdTop1 -> null");
                }
            }

        } else if (direction.equals(Const.SmallTop)) {
            if (MyApp.getString(Const.banner_type_top).equals("1")) {
                showToponBanner_Top(activity, viewGroup, bannerTop, nativeType, direction);
                loadBannerTop(activity);
            } else {

                if (nativeAdTop != null) {
                    Log.d(TAG, "Topon_Native showTopNative nativeAdTop -> 1");
                    showToponNative_SmallTop(activity, viewGroup, nativeAdTop, nativeType, direction);
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            nativeAdTop = null;
                        }
                    }, Const.nullParameterTime);
                    loadNativeTop1(activity);
                } else {

                    if (nativeAdTop1 != null) {
                        Log.d(TAG, "Topon_Native showTopNative nativeAdTop -> 2");
                        showToponNative_SmallTop(activity, viewGroup, nativeAdTop1, nativeType, direction);
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                nativeAdTop1 = null;
                            }
                        }, Const.nullParameterTime);
                        loadNativeTop(activity);
                    } else {
                        startTimerTopNative(activity);
                        Log.d(TAG, "Topon_Native showTopNative nativeAdTop & nativeAdTop1 -> null");
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

    private static void showToponNative_Big(Activity activity, ViewGroup viewGroup, NativeAd nativeAd, String nativeType, String direction) {
        Log.d(TAG, "Topon_Native showToponNative_Big-> ");
        try {
            viewGroup.setVisibility(View.VISIBLE);
            viewGroup.removeAllViews();

            View view = LayoutInflater.from(activity).inflate(R.layout.native_big_placeholder, null);
            viewGroup.addView(view);

            ShimmerFrameLayout mShimmerViewContainer = view.findViewById(R.id.shimmer_view_container);
            mShimmerViewContainer.startShimmer();
            mShimmerViewContainer.setVisibility(View.VISIBLE);

            if (nativeAd == null) {
                viewGroup.setVisibility(View.GONE);
                viewGroup.removeAllViews();
                return;
            }

            Topon_Native_Inflate.inflate_native_big_card(activity, viewGroup, nativeAd, nativeType, direction);

        } catch (Exception e) {
            Log.d(TAG, "Topon_Native showToponNative_Big Exception -> " + e.toString());
            e.printStackTrace();
        }


    }

    private static void showToponNative_SmallTop(Activity activity, ViewGroup viewGroup, NativeAd nativeAd, String nativeType, String direction) {
        Log.d(TAG, "Topon_Native showToponNative_SmallTop -> ");
        try {
            viewGroup.setVisibility(View.VISIBLE);
            viewGroup.removeAllViews();

            View view = LayoutInflater.from(activity).inflate(R.layout.native_small_placeholder, null);
            viewGroup.addView(view);

            ShimmerFrameLayout mShimmerViewContainer = view.findViewById(R.id.shimmer_view_container);
            mShimmerViewContainer.startShimmer();
            mShimmerViewContainer.setVisibility(View.VISIBLE);


            if (nativeAd == null) {
                viewGroup.setVisibility(View.GONE);
                viewGroup.removeAllViews();
                return;
            }

            if (MyApp.getString(Const.ads_btn_top).equals("1")) {
                Topon_Native_Inflate.inflate_native_Small_Banner(activity, viewGroup, nativeAd, nativeType, direction);
            } else {
                Topon_Native_Inflate.inflate_native_SmallTop(activity, viewGroup, nativeAd, nativeType, direction);
            }

        } catch (Exception e) {
            Log.d(TAG, "Topon_Native showToponNative_SmallTop Exception -> " + e.toString());
            e.printStackTrace();
        }


    }

    private static void showToponBanner_Top(Activity activity, ViewGroup viewGroup, ATBannerView bannerTop, String nativeType, String direction) {
        Log.d(TAG, "Topon_Native showToponBanner_Top -> ");
        try {
            viewGroup.setVisibility(View.VISIBLE);
            viewGroup.addView(bannerTop);
            bannerTop.loadAd();
        } catch (Exception e) {
            viewGroup.setVisibility(View.GONE);
            Log.d(TAG, "Topon_Native showToponBanner_Top Exception -> " + e.toString());
            e.printStackTrace();
        }


    }


    //    -----------------------  Top Ads --------------------------------------


    //    -----------------------  Bottom Ads --------------------------------------

    public static NativeAd nativeAdBottom = null, nativeAdBottom1 = null;
    private static ATNative atnativeAdBottom, atnativeAdBottom1;
    public static Boolean isNativeBottomTimerRun = false;
    public static ATBannerView bannerBottom;

    public static void loadBannerBottom(Activity mactivity) {
        Log.d(TAG, "Topon_Native loadBannerBottom -> ");
        if (MyApp.getString(Const.banner_type_bottom).equals("1")) {
            String adId = utils.get_Topon_BannerAdsId();
            ATBannerView aTBannerView = new ATBannerView(mactivity);
            aTBannerView.setPlacementId(adId);
            bannerBottom = aTBannerView;
        }
    }

    public static void loadNativeBottom(Activity mactivity) {
        Log.d(TAG, "Topon_Native loadNativeBottom ->");
        String adId = utils.get_Topon_NativeAdsId_2();
        ATNative aTNative = new ATNative(mactivity, adId, new ATNativeNetworkListener() {
            @Override
            public void onNativeAdLoadFail(AdError adError) {
                Log.d(TAG, "Topon_Native loadNativeBottom onNativeAdLoadFail : " + adError.getFullErrorInfo());
            }

            @Override
            public void onNativeAdLoaded() {
                Log.d(TAG, "Topon_Native loadNativeBottom onNativeAdLoaded :");
                nativeAdBottom = atnativeAdBottom.getNativeAd();
            }
        });
        aTNative.makeAdRequest();
        atnativeAdBottom = aTNative;
    }

    public static void loadNativeBottom1(Activity mactivity) {
        Log.d(TAG, "Topon_Native loadNativeBottom1 ->");
        String adId = utils.get_Topon_NativeAdsId_1();
        ATNative aTNative1 = new ATNative(mactivity, adId, new ATNativeNetworkListener() {
            @Override
            public void onNativeAdLoadFail(AdError adError) {
                Log.d(TAG, "Topon_Native loadNativeBottom1 onNativeAdLoadFail : " + adError.getFullErrorInfo());
            }

            @Override
            public void onNativeAdLoaded() {
                Log.d(TAG, "Topon_Native loadNativeBottom1 onNativeAdLoaded :");
                nativeAdBottom1 = atnativeAdBottom1.getNativeAd();
            }
        });
        aTNative1.makeAdRequest();
        atnativeAdBottom1 = aTNative1;
    }

    public static void showBottomNative(Activity activity, ViewGroup viewGroup, String nativeType, String direction) {
        Log.d(TAG, "Topon_Native showBottomNative direction -> " + direction);
        if (MyApp.getString(Const.banner_type_bottom).equals("1")) {
            showToponBanner_Bottom(activity, viewGroup, bannerBottom, nativeType, direction);
            loadBannerBottom(activity);
        } else {
            if (direction.equals(Const.SmallBottom)) {
                if (nativeAdBottom != null) {
                    Log.d(TAG, "Topon_Native showBottomNative nativeAdBottom -> 1");
                    showToponNative_SmallBottom(activity, viewGroup, nativeAdBottom, nativeType, direction);
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            nativeAdBottom = null;
                        }
                    }, Const.nullParameterTime);
                    loadNativeBottom1(activity);

                } else {
                    if (nativeAdBottom1 != null) {
                        Log.d(TAG, "Topon_Native showBottomNative nativeAdBottom1 -> 2");
                        showToponNative_SmallBottom(activity, viewGroup, nativeAdBottom1, nativeType, direction);
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                nativeAdBottom1 = null;
                            }
                        }, Const.nullParameterTime);
                        loadNativeBottom(activity);
                    } else {
                        startTimerBottomNative(activity);
                        Log.d(TAG, "Topon_Native showBottomNative nativeAdBottom & nativeAdBottom1 -> null");
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

    private static void showToponNative_SmallBottom(Activity activity, ViewGroup viewGroup, NativeAd nativeAd, String nativeType, String direction) {
        Log.d(TAG, "Topon_Native showToponNative_SmallBottom -> ");
        try {
            viewGroup.setVisibility(View.VISIBLE);
            viewGroup.removeAllViews();

            View view = LayoutInflater.from(activity).inflate(R.layout.native_small_placeholder, null);
            viewGroup.addView(view);

            ShimmerFrameLayout mShimmerViewContainer = view.findViewById(R.id.shimmer_view_container);
            mShimmerViewContainer.startShimmer();
            mShimmerViewContainer.setVisibility(View.VISIBLE);

            if (nativeAd == null) {
                viewGroup.setVisibility(View.GONE);
                viewGroup.removeAllViews();
                return;
            }

            if (MyApp.getString(Const.ads_btn_bottom).equals("1")) {
                Topon_Native_Inflate.inflate_native_Small_Banner(activity, viewGroup, nativeAd, nativeType, direction);
            } else {
                Topon_Native_Inflate.inflate_native_SmallBottom(activity, viewGroup, nativeAd, nativeType, direction);
            }

        } catch (Exception e) {
            Log.d(TAG, "Topon_Native showToponNative_SmallBottom Exception -> " + e.toString());
            e.printStackTrace();
        }

    }

    private static void showToponBanner_Bottom(Activity activity, ViewGroup viewGroup, ATBannerView bannerBottom, String nativeType, String direction) {
        Log.d(TAG, "Topon_Native showToponBanner_Bottom -> ");
        try {
            viewGroup.setVisibility(View.VISIBLE);
            viewGroup.removeAllViews();
            viewGroup.addView(bannerBottom);
            bannerBottom.loadAd();
        } catch (Exception e) {
            viewGroup.setVisibility(View.GONE);
            Log.d(TAG, "Topon_Native showToponBanner_Bottom Exception -> " + e.toString());
            e.printStackTrace();
        }

    }

    //    -----------------------  Bottom Ads --------------------------------------


    //    -----------------------  Extra Ads --------------------------------------

    public static NativeAd nativeAdExtra = null, nativeAdExtra1 = null;
    public static Boolean isNativeExtraTimerRun = false;
    private static ATNative atnativeAdExtra, atnativeAdExtra1;

    public static void loadNativeExtra(Activity mactivity) {
        String adId = utils.get_Topon_NativeAdsId_1();
        ATNative aTNative = new ATNative(mactivity, adId, new ATNativeNetworkListener() {
            @Override
            public void onNativeAdLoadFail(AdError adError) {
                Log.d(TAG, "Topon_Native loadNativeBottom onNativeAdLoadFail : " + adError.getFullErrorInfo());
            }

            @Override
            public void onNativeAdLoaded() {
                Log.d(TAG, "Topon_Native loadNativeBottom onNativeAdLoaded :");
                nativeAdExtra = atnativeAdExtra.getNativeAd();
            }
        });
        aTNative.makeAdRequest();
        atnativeAdExtra = aTNative;

    }

    public static void loadNativeExtra1(Activity mactivity) {
        String adId = utils.get_Topon_NativeAdsId_2();
        ATNative aTNative1 = new ATNative(mactivity, adId, new ATNativeNetworkListener() {
            @Override
            public void onNativeAdLoadFail(AdError adError) {
                Log.d(TAG, "Topon_Native loadNativeExtra1 onNativeAdLoadFail : " + adError.getFullErrorInfo());
            }

            @Override
            public void onNativeAdLoaded() {
                Log.d(TAG, "Topon_Native loadNativeExtra1 onNativeAdLoaded :");
                nativeAdExtra1 = atnativeAdExtra1.getNativeAd();
            }
        });
        aTNative1.makeAdRequest();
        atnativeAdExtra1 = aTNative1;

    }

    public static void showNativeExtra(Activity activity, ViewGroup viewGroup, String nativeType, String direction) {
        if (nativeAdExtra != null) {
            Log.d(TAG, "Topon_Native showNativeExtra nativeAdExtra -> 1");
            showToponNative_Extra(activity, viewGroup, nativeAdExtra, nativeType, direction);
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    nativeAdExtra = null;
                }
            }, Const.nullParameterTime);
            loadNativeExtra1(activity);
        } else {
            if (nativeAdExtra1 != null) {
                Log.d(TAG, "Topon_Native showNativeExtra nativeAdExtra -> 2");
                showToponNative_Extra(activity, viewGroup, nativeAdExtra1, nativeType, direction);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        nativeAdExtra1 = null;
                    }
                }, Const.nullParameterTime);
                loadNativeExtra(activity);
            } else {
                startTimerExtraNative(activity);
                Log.d(TAG, "Topon_Native showNativeExtra nativeAdExtra & nativeAdExtra1 -> null");
            }
        }
    }

    private static void showToponNative_Extra(Activity activity, ViewGroup viewGroup, NativeAd nativeAd, String nativeType, String direction) {
        Log.d(TAG, "Topon_Native showToponNative_Extra -> ");
        try {
            viewGroup.setVisibility(View.VISIBLE);
            viewGroup.removeAllViews();

            View view = LayoutInflater.from(activity).inflate(R.layout.native_small_placeholder, null);
            viewGroup.addView(view);

            ShimmerFrameLayout mShimmerViewContainer = view.findViewById(R.id.shimmer_view_container);
            mShimmerViewContainer.startShimmer();
            mShimmerViewContainer.setVisibility(View.VISIBLE);


            if (nativeType == null) {
                viewGroup.setVisibility(View.GONE);
                viewGroup.removeAllViews();
                return;
            }

            if (MyApp.getString(Const.ads_btn).equals("1")) {
                Topon_Native_Inflate.inflate_native_Small_Banner(activity, viewGroup, nativeAd, nativeType, direction);
            } else {
                if (direction.equals(Const.SmallTop)) {
                    Log.d(TAG, "Topon_Native showToponNative_Extra SmallTop");
                    Topon_Native_Inflate.inflate_native_SmallBottom(activity, viewGroup, nativeAd, nativeType, direction);
                } else if (direction.equals(Const.SmallBottom)) {
                    Log.d(TAG, "Topon_Native showToponNative_Extra SmallBottom");
                    Topon_Native_Inflate.inflate_native_SmallTop(activity, viewGroup, nativeAd, nativeType, direction);
                }
            }

        } catch (Exception e) {
            Log.d(TAG, "Topon_Native showToponNative_Extra Exception -> " + e.toString());
            e.printStackTrace();
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


    //    -----------------------  Extra Ads --------------------------------------

}
