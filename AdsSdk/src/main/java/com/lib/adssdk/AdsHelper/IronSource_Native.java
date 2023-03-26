package com.lib.adssdk.AdsHelper;

import android.app.Activity;
import android.os.CountDownTimer;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.facebook.shimmer.ShimmerFrameLayout;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceBannerLayout;
import com.lib.adssdk.MyApp;
import com.lib.adssdk.R;
import com.lib.adssdk.Utils.Const;


public class IronSource_Native {

    public static final String TAG = "IronSource_Native";


    //    -----------------------  Top Ads --------------------------------------
    public static IronSourceBannerLayout nativeAdTop = null, nativeAdTop1 = null;
    public static Boolean isNativeTopTimerRun = false;
    public static IronSourceBannerLayout bannerTop;


    public static void loadBannerTop(Activity mactivity) {
        Log.d(TAG, "IronSource_Native loadBannerTop -> ");
        if (MyApp.getString(Const.banner_type_top).equals("1")) {
            bannerTop = IronSource.createBanner(mactivity, ISBannerSize.SMART);
//            IronSource.loadBanner(bannerTop);
        }
    }

    public static void loadNativeTop(Activity mactivity) {
//        if (nativeAdTop != null) {
//            IronSource.destroyBanner(nativeAdTop);
//        }
        nativeAdTop = IronSource.createBanner(mactivity, ISBannerSize.SMART);
//        IronSource.loadBanner(nativeAdTop);
    }

    public static void loadNativeTop1(Activity mactivity) {
//        if (nativeAdTop1 != null) {
//            IronSource.destroyBanner(nativeAdTop1);
//        }
        nativeAdTop1 = IronSource.createBanner(mactivity, ISBannerSize.SMART);
//        IronSource.loadBanner(nativeAdTop1);
    }

    public static void showTopNative(Activity activity, ViewGroup viewGroup, String nativeType, String direction) {
        Log.d(TAG, "IronSource_Native showTopNative direction -> " + direction);

        if (nativeType.equals(Const.Big)) {
            if (nativeAdTop != null) {
                Log.d(TAG, "IronSource_Native showTopNative showIronSourceNative_Big nativeAdTop -> 1");
                showIronSourceNative_Big(activity, viewGroup, nativeAdTop, nativeType, direction);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        nativeAdTop = null;
                    }
                }, Const.nullParameterTime);
                loadNativeTop1(activity);
            } else {

                if (nativeAdTop1 != null) {
                    Log.d(TAG, "IronSource_Native showTopNative showIronSourceNative_Big nativeAdTop -> 2");
                    showIronSourceNative_Big(activity, viewGroup, nativeAdTop1, nativeType, direction);
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            nativeAdTop1 = null;
                        }
                    }, Const.nullParameterTime);
                    loadNativeTop(activity);
                } else {
                    startTimerTopNative(activity);
                    Log.d(TAG, "IronSource_Native showTopNative showIronSourceNative_Big nativeAdTop & nativeAdTop1 -> null");
                }
            }
        } else if (direction.equals(Const.SmallTop)) {
            if (MyApp.getString(Const.banner_type_top).equals("1")) {
                showIronSourceBanner_Top(activity, viewGroup, bannerTop, nativeType, direction);
                loadBannerTop(activity);
            } else {

                if (nativeAdTop != null) {
                    Log.d(TAG, "IronSource_Native showTopNative nativeAdTop -> 1");
                    showIronSourceNative_SmallTop(activity, viewGroup, nativeAdTop, nativeType, direction);
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            nativeAdTop = null;
                        }
                    }, Const.nullParameterTime);
                    loadNativeTop1(activity);
                } else {

                    if (nativeAdTop1 != null) {
                        Log.d(TAG, "IronSource_Native showTopNative nativeAdTop -> 2");
                        showIronSourceNative_SmallTop(activity, viewGroup, nativeAdTop1, nativeType, direction);
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                nativeAdTop1 = null;
                            }
                        }, Const.nullParameterTime);
                        loadNativeTop(activity);
                    } else {
                        startTimerTopNative(activity);
                        Log.d(TAG, "IronSource_Native showTopNative nativeAdTop & nativeAdTop1 -> null");
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

    private static void showIronSourceNative_Big(Activity activity, ViewGroup viewGroup, IronSourceBannerLayout nativeAd, String nativeType, String direction) {
        Log.d(TAG, "IronSource_Native showIronSourceNative_Big-> ");
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

            IronSource_Native_Inflate.inflate_native_big_card(activity, viewGroup, nativeAd, nativeType, direction);

        } catch (Exception e) {
            Log.d(TAG, "IronSource_Native showIronSourceNative_Big Exception -> " + e.toString());
            e.printStackTrace();
        }


    }

    private static void showIronSourceNative_SmallTop(Activity activity, ViewGroup viewGroup, IronSourceBannerLayout nativeAd, String nativeType, String direction) {
        Log.d(TAG, "IronSource_Native showIronSourceNative_SmallTop -> ");

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
                IronSource_Native_Inflate.inflate_native_Small_Banner(activity, viewGroup, nativeAd, nativeType, direction);
            } else {
                IronSource_Native_Inflate.inflate_native_SmallTop(activity, viewGroup, nativeAd, nativeType, direction);
            }

        } catch (Exception e) {
            Log.d(TAG, "IronSource_Native showAdmobNative_SmallTop Exception -> " + e.toString());
            e.printStackTrace();
        }


    }

    private static void showIronSourceBanner_Top(Activity activity, ViewGroup viewGroup, IronSourceBannerLayout bannerTop, String nativeType, String direction) {
        Log.d(TAG, "IronSource_Native showIronSourceBanner_Top -> ");

        try {
            viewGroup.setVisibility(View.VISIBLE);
            viewGroup.removeAllViews();

            View view = LayoutInflater.from(activity).inflate(R.layout.native_small_placeholder, null);
            viewGroup.addView(view);

            ShimmerFrameLayout mShimmerViewContainer = view.findViewById(R.id.shimmer_view_container);
            mShimmerViewContainer.startShimmer();
            mShimmerViewContainer.setVisibility(View.VISIBLE);

            IronSource_Native_Inflate.inflate_native_Small_Banner_Top(activity, viewGroup, bannerTop, nativeType, direction);

        } catch (Exception e) {
            viewGroup.setVisibility(View.GONE);
            Log.d(TAG, "IronSource_Native showAdmobBanner_Top Exception -> " + e.toString());
            e.printStackTrace();
        }


    }


    //    -----------------------  Top Ads --------------------------------------


    //    -----------------------  Bottom Ads --------------------------------------
    public static IronSourceBannerLayout nativeAdBottom = null, nativeAdBottom1 = null;
    public static Boolean isNativeBottomTimerRun = false;
    public static IronSourceBannerLayout bannerBottom;


    public static void loadBannerBottom(Activity mactivity) {
        Log.d(TAG, "IronSource_Native loadBannerBottom -> ");
        if (MyApp.getString(Const.banner_type_bottom).equals("1")) {
            bannerBottom = IronSource.createBanner(mactivity, ISBannerSize.SMART);
            IronSource.loadBanner(bannerBottom);
        }
    }

    public static void loadNativeBottom(Activity mactivity) {
        if (nativeAdBottom != null) {
            IronSource.destroyBanner(nativeAdBottom);
        }
        nativeAdBottom = IronSource.createBanner(mactivity, ISBannerSize.SMART);
        IronSource.loadBanner(nativeAdBottom);
    }

    public static void loadNativeBottom1(Activity mactivity) {
        if (nativeAdBottom1 != null) {
            IronSource.destroyBanner(nativeAdBottom1);
        }
        nativeAdBottom1 = IronSource.createBanner(mactivity, ISBannerSize.SMART);
        IronSource.loadBanner(nativeAdBottom1);
    }

    public static void showBottomNative(Activity activity, ViewGroup viewGroup, String nativeType, String direction) {
        Log.d(TAG, "IronSource_Native showBottomNative direction -> " + direction);
        if (MyApp.getString(Const.banner_type_bottom).equals("1")) {
            showIronSourceBanner_Bottom(activity, viewGroup, bannerBottom, nativeType, direction);
            loadBannerBottom(activity);
        } else {
            if (direction.equals(Const.SmallBottom)) {
                if (nativeAdBottom != null) {
                    Log.d(TAG, "IronSource_Native showBottomNative nativeAdBottom -> 1");
                    showIronSourceNative_SmallBottom(activity, viewGroup, nativeAdBottom, nativeType, direction);
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            nativeAdBottom = null;
                        }
                    }, Const.nullParameterTime);
                    loadNativeBottom1(activity);
                } else {

                    if (nativeAdBottom1 != null) {
                        Log.d(TAG, "IronSource_Native showBottomNative nativeAdBottom -> 2");
                        showIronSourceNative_SmallBottom(activity, viewGroup, nativeAdBottom1, nativeType, direction);
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                nativeAdBottom1 = null;
                            }
                        }, Const.nullParameterTime);
                        loadNativeBottom(activity);
                    } else {
                        startTimerBottomNative(activity);
                        Log.d(TAG, "IronSource_Native showBottomNative nativeAdBottom & nativeAdBottom1 -> null");
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

    private static void showIronSourceNative_SmallBottom(Activity activity, ViewGroup viewGroup, IronSourceBannerLayout nativeAd, String nativeType, String direction) {
        Log.d(TAG, "IronSource_Native showAdmobNative_SmallBottom -> ");
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
                IronSource_Native_Inflate.inflate_native_Small_Banner(activity, viewGroup, nativeAd, nativeType, direction);
            } else {
                IronSource_Native_Inflate.inflate_native_SmallBottom(activity, viewGroup, nativeAd, nativeType, direction);
            }

        } catch (Exception e) {
            Log.d(TAG, "IronSource_Native showAdmobNative_SmallBottom Exception -> " + e.toString());
            e.printStackTrace();
        }


    }

    private static void showIronSourceBanner_Bottom(Activity activity, ViewGroup viewGroup, IronSourceBannerLayout bannerBottom, String nativeType, String direction) {
        Log.d(TAG, "Admob_Native showAdmobBanner_Bottom -> ");

        try {
            viewGroup.setVisibility(View.VISIBLE);
            viewGroup.removeAllViews();

            View view = LayoutInflater.from(activity).inflate(R.layout.native_small_placeholder, null);
            viewGroup.addView(view);

            ShimmerFrameLayout mShimmerViewContainer = view.findViewById(R.id.shimmer_view_container);
            mShimmerViewContainer.startShimmer();
            mShimmerViewContainer.setVisibility(View.VISIBLE);

            IronSource_Native_Inflate.inflate_native_Small_Banner_Bottom(activity, viewGroup, bannerBottom, nativeType, direction);

        } catch (Exception e) {
            viewGroup.setVisibility(View.GONE);
            Log.d(TAG, "Admob_Native showAdmobBanner_Bottom Exception -> " + e.toString());
            e.printStackTrace();
        }


    }

    //    -----------------------  Bottom Ads --------------------------------------


    //    -----------------------  Extra Ads --------------------------------------

    public static IronSourceBannerLayout nativeAdExtra = null, nativeAdExtra1 = null;
    public static Boolean isNativeExtraTimerRun = false;

    public static void loadNativeExtra(Activity mactivity) {
        if (nativeAdExtra != null) {
            IronSource.destroyBanner(nativeAdExtra);
        }
        nativeAdExtra = IronSource.createBanner(mactivity, ISBannerSize.SMART);
        IronSource.loadBanner(nativeAdExtra);
    }

    public static void loadNativeExtra1(Activity mactivity) {
        if (nativeAdExtra1 != null) {
            IronSource.destroyBanner(nativeAdExtra1);
        }
        nativeAdExtra1 = IronSource.createBanner(mactivity, ISBannerSize.SMART);
        IronSource.loadBanner(nativeAdExtra1);
    }

    public static void showNativeExtra(Activity activity, ViewGroup viewGroup, String nativeType, String direction) {
        if (nativeAdExtra != null) {
            Log.d(TAG, "IronSource_Native showNativeExtra nativeAdExtra -> 1");
            showIronSourceNative_Extra(activity, viewGroup, nativeAdExtra, nativeType, direction);
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    nativeAdExtra = null;
                }
            }, Const.nullParameterTime);
            loadNativeExtra1(activity);
        } else {

            if (nativeAdExtra1 != null) {
                Log.d(TAG, "IronSource_Native showNativeExtra nativeAdExtra1 -> 2");
                showIronSourceNative_Extra(activity, viewGroup, nativeAdExtra1, nativeType, direction);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        nativeAdExtra1 = null;
                    }
                }, Const.nullParameterTime);
                loadNativeExtra(activity);
            } else {
                startTimerExtraNative(activity);
                Log.d(TAG, "IronSource_Native showNativeExtra nativeAdExtra & nativeAdExtra1 -> null");
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


    private static void showIronSourceNative_Extra(Activity activity, ViewGroup viewGroup, IronSourceBannerLayout nativeAd, String nativeType, String direction) {
        Log.d(TAG, "IronSource_Native showIronSourceNative_Extra -> ");

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

            if (MyApp.getString(Const.ads_btn).equals("1")) {
                IronSource_Native_Inflate.inflate_native_Small_Banner(activity, viewGroup, nativeAd, nativeType, direction);
            } else {
                if (direction.equals(Const.SmallTop)) {
                    Log.d(TAG, "IronSource_Native showIronSourceNative_Extra SmallTop");
                    IronSource_Native_Inflate.inflate_native_SmallBottom(activity, viewGroup, nativeAd, nativeType, direction);
                } else if (direction.equals(Const.SmallBottom)) {
                    Log.d(TAG, "IronSource_Native showIronSourceNative_Extra SmallBottom");
                    IronSource_Native_Inflate.inflate_native_SmallTop(activity, viewGroup, nativeAd, nativeType, direction);
                }
            }

        } catch (Exception e) {
            Log.d(TAG, "Admob_Native showIronSourceNative_Extra Exception -> " + e.toString());
            e.printStackTrace();
        }

    }


    //    -----------------------  Extra Ads --------------------------------------

}
