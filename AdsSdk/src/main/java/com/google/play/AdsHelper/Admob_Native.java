package com.google.play.AdsHelper;

import android.app.Activity;
import android.os.CountDownTimer;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;

import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.play.MyApp;
import com.google.ads.R;
import com.google.play.Utils.Const;
import com.google.play.Utils.utils;

public class Admob_Native {

    public static final String TAG = "Admob_Native";


    //    -----------------------  Top Ads --------------------------------------
    public static NativeAd nativeAdTop = null, nativeAdTop1 = null;
    public static AdView bannerTop;
    public static AdManagerAdRequest adRequestBannerTop;
    public static Boolean isNativeTopTimerRun = false;

    public static void loadBannerTop(Activity mactivity) {
        Log.d(TAG, "Admob_Native loadBannerTop -> ");
        if (MyApp.getString(Const.banner_type_top).equals("1")) {
            String adId = utils.get_Admob_BannerAdsId();
            bannerTop = new AdView(mactivity);
            bannerTop.setAdSize(AdSize.BANNER);
            bannerTop.setAdUnitId(adId);
            adRequestBannerTop = new AdManagerAdRequest.Builder().build();
        }
    }

    public static void loadNativeTop(Activity mactivity) {

        String adId = utils.get_Admob_NativeAdsId_1();
        final AdLoader adLoader = new AdLoader.Builder(mactivity, adId)
                .forNativeAd(new NativeAd.OnNativeAdLoadedListener() {
                    @Override
                    public void onNativeAdLoaded(NativeAd mnativeAd) {
                        Log.d(TAG, "Admob_Native loadNativeTop onNativeAdLoaded adId -> " + adId);
                        nativeAdTop = mnativeAd;
                    }
                })
                .withAdListener(new AdListener() {
                    @Override
                    public void onAdFailedToLoad(LoadAdError adError) {
                        Log.d(TAG, "Admob_Native loadNativeTop onAdFailedToLoad adId -> " + adId);
                    }
                })
                .withNativeAdOptions(new NativeAdOptions.Builder().build()).build();
        adLoader.loadAd(new AdManagerAdRequest.Builder().build());
    }

    public static void loadNativeTop1(Activity mactivity) {

        String adId = utils.get_Admob_NativeAdsId_2();
        final AdLoader adLoader = new AdLoader.Builder(mactivity, adId)
                .forNativeAd(new NativeAd.OnNativeAdLoadedListener() {
                    @Override
                    public void onNativeAdLoaded(NativeAd mnativeAd) {
                        Log.d(TAG, "Admob_Native loadNativeTop1 onNativeAdLoaded adId -> " + adId);
                        nativeAdTop1 = mnativeAd;
                    }
                })
                .withAdListener(new AdListener() {
                    @Override
                    public void onAdFailedToLoad(LoadAdError adError) {
                        Log.d(TAG, "Admob_Native loadNativeTop1 onAdFailedToLoad adId -> " + adId);
                    }
                })
                .withNativeAdOptions(new NativeAdOptions.Builder().build()).build();
        adLoader.loadAd(new AdManagerAdRequest.Builder().build());
    }

    public static void showTopNative(Activity activity, ViewGroup viewGroup, String nativeType, String direction) {
        Log.d(TAG, "Admob_Native showTopNative direction -> " + direction);

        if (nativeType.equals(Const.Big)) {
            if (nativeAdTop != null) {
                Log.d(TAG, "Admob_Native showTopNative nativeAdTop Big -> 1");
                showAdmobNative_Big(activity, viewGroup, nativeAdTop, nativeType, direction);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        nativeAdTop = null;
                    }
                }, Const.nullParameterTime);
                loadNativeTop1(activity);
            } else {
                if (nativeAdTop1 != null) {
                    Log.d(TAG, "Admob_Native showTopNative nativeAdTop1 Big -> 2");
                    showAdmobNative_Big(activity, viewGroup, nativeAdTop1, nativeType, direction);
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            nativeAdTop1 = null;
                        }
                    }, Const.nullParameterTime);
                    loadNativeTop(activity);
                } else {
                    startTimerTopNative(activity);
                    Log.d(TAG, "Admob_Native showTopNative nativeAdTop & nativeAdTop1 Big -> null");
                }
            }

        } else if (direction.equals(Const.SmallTop)) {
            if (MyApp.getString(Const.banner_type_top).equals("1")) {
                showAdmobBanner_Top(activity, viewGroup, bannerTop, nativeType, direction);
                loadBannerTop(activity);
            } else {

                if (nativeAdTop != null) {
                    Log.d(TAG, "Admob_Native showTopNative nativeAdTop -> 1");
                    showAdmobNative_SmallTop(activity, viewGroup, nativeAdTop, nativeType, direction);
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            nativeAdTop = null;
                        }
                    }, Const.nullParameterTime);
                    loadNativeTop1(activity);
                } else {
                    if (nativeAdTop1 != null) {
                        Log.d(TAG, "Admob_Native showTopNative nativeAdTop1 -> 2");
                        showAdmobNative_SmallTop(activity, viewGroup, nativeAdTop1, nativeType, direction);
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                nativeAdTop1 = null;
                            }
                        }, Const.nullParameterTime);
                        loadNativeTop(activity);
                    } else {
                        startTimerTopNative(activity);
                        Log.d(TAG, "Admob_Native showTopNative nativeAdTop & nativeAdTop1 -> null");
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

    private static void showAdmobNative_Big(Activity activity, ViewGroup viewGroup, NativeAd nativeAd, String nativeType, String direction) {
        Log.d(TAG, "Admob_Native showAdmobNative_Big-> ");
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

            Admob_Native_Inflate.inflate_native_big_card(activity, viewGroup, nativeAd, nativeType, direction);

        } catch (Exception e) {
            Log.d(TAG, "Admob_Native showAdmobNative_Big Exception -> " + e.toString());
            e.printStackTrace();
        }


    }

    private static void showAdmobNative_SmallTop(Activity activity, ViewGroup viewGroup, NativeAd nativeAd, String nativeType, String direction) {
        Log.d(TAG, "Admob_Native showAdmobNative_SmallTop -> ");

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
                Admob_Native_Inflate.inflate_native_Small_Banner(activity, viewGroup, nativeAd, nativeType, direction);
            } else {
                Admob_Native_Inflate.inflate_native_SmallTop(activity, viewGroup, nativeAd, nativeType, direction);
            }

        } catch (Exception e) {
            Log.d(TAG, "Admob_Native showAdmobNative_SmallTop Exception -> " + e.toString());
            e.printStackTrace();
        }


    }

    private static void showAdmobBanner_Top(Activity activity, ViewGroup viewGroup, AdView bannerTop, String nativeType, String direction) {
        Log.d(TAG, "Admob_Native showAdmobBanner_Top -> ");

        try {
            viewGroup.setVisibility(View.VISIBLE);
            viewGroup.removeAllViews();

            View view = LayoutInflater.from(activity).inflate(R.layout.native_small_placeholder, null);
            viewGroup.addView(view);

            ShimmerFrameLayout mShimmerViewContainer = view.findViewById(R.id.shimmer_view_container);
            mShimmerViewContainer.startShimmer();
            mShimmerViewContainer.setVisibility(View.VISIBLE);

            bannerTop.loadAd(adRequestBannerTop);
            bannerTop.setAdListener(new AdListener() {
                @Override
                public void onAdClosed() {
                    Log.d(TAG, "Admob_Native showAdmobBanner_Top onAdClosed-> ");
                    super.onAdClosed();
                }

                @Override
                public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                    Log.d(TAG, "Admob_Native showAdmobBanner_Top onAdFailedToLoad-> ");
                    viewGroup.removeAllViews();
                    super.onAdFailedToLoad(loadAdError);
                }

                @Override
                public void onAdOpened() {
                    Log.d(TAG, "Admob_Native showAdmobBanner_Top onAdOpened-> ");
                    super.onAdOpened();
                }

                @Override
                public void onAdLoaded() {
                    Log.d(TAG, "Admob_Native showAdmobBanner_Top onAdLoaded-> ");
                    viewGroup.removeAllViews();
                    viewGroup.addView(bannerTop);
                    super.onAdLoaded();
                }

                @Override
                public void onAdClicked() {
//                    Log.d(TAG, "Admob_Native showAdmobBanner_Top onAdClicked-> ");
                    super.onAdClicked();
                }

                @Override
                public void onAdImpression() {
//                    Log.d(TAG, "Admob_Native showAdmobBanner_Top onAdImpression-> ");
                    super.onAdImpression();
                }
            });

        } catch (Exception e) {
            viewGroup.setVisibility(View.GONE);
            Log.d(TAG, "Admob_Native showAdmobBanner_Top Exception -> " + e.toString());
            e.printStackTrace();
        }


    }


    //    -----------------------  Top Ads --------------------------------------


    //    -----------------------  Bottom Ads --------------------------------------
    public static NativeAd nativeAdBottom = null, nativeAdBottom1 = null;
    public static AdView bannerBottom;
    public static AdManagerAdRequest adRequestBannerBottom;
    public static Boolean isNativeBottomTimerRun = false;


    public static void loadBannerBottom(Activity mactivity) {
        Log.d(TAG, "Admob_Native loadBannerBottom -> ");
        if (MyApp.getString(Const.banner_type_bottom).equals("1")) {

            String adId = utils.get_Admob_BannerAdsId();

            bannerBottom = new AdView(mactivity);
            bannerBottom.setAdSize(AdSize.BANNER);
            bannerBottom.setAdUnitId(adId);
            adRequestBannerBottom = new AdManagerAdRequest.Builder().build();
        }
    }

    public static void loadNativeBottom(Activity mactivity) {
        String adId = utils.get_Admob_NativeAdsId_2();
        final AdLoader adLoader = new AdLoader.Builder(mactivity, adId)
                .forNativeAd(new NativeAd.OnNativeAdLoadedListener() {
                    @Override
                    public void onNativeAdLoaded(NativeAd mnativeAd) {
                        Log.d(TAG, "Admob_Native loadNativeBottom onNativeAdLoaded adId -> " + adId);
                        nativeAdBottom = mnativeAd;
                    }
                })
                .withAdListener(new AdListener() {
                    @Override
                    public void onAdFailedToLoad(LoadAdError adError) {
                        Log.d(TAG, "Admob_Native loadNativeBottom onAdFailedToLoad adId -> " + adId);
                    }
                })
                .withNativeAdOptions(new NativeAdOptions.Builder().build()).build();
        adLoader.loadAd(new AdManagerAdRequest.Builder().build());
    }

    public static void loadNativeBottom1(Activity mactivity) {
        String adId = utils.get_Admob_NativeAdsId_1();
        final AdLoader adLoader = new AdLoader.Builder(mactivity, adId)
                .forNativeAd(new NativeAd.OnNativeAdLoadedListener() {
                    @Override
                    public void onNativeAdLoaded(NativeAd mnativeAd) {
                        Log.d(TAG, "Admob_Native loadNativeBottom1 onNativeAdLoaded adId -> " + adId);
                        nativeAdBottom1 = mnativeAd;
                    }
                })
                .withAdListener(new AdListener() {
                    @Override
                    public void onAdFailedToLoad(LoadAdError adError) {
                        Log.d(TAG, "Admob_Native loadNativeBottom1 onAdFailedToLoad adId -> " + adId);
                    }
                })
                .withNativeAdOptions(new NativeAdOptions.Builder().build()).build();
        adLoader.loadAd(new AdManagerAdRequest.Builder().build());
    }


    public static void showBottomNative(Activity activity, ViewGroup viewGroup, String nativeType, String direction) {
        Log.d(TAG, "Admob_Native showBottomNative direction -> " + direction);
        if (MyApp.getString(Const.banner_type_bottom).equals("1")) {
            showAdmobBanner_Bottom(activity, viewGroup, bannerBottom, nativeType, direction);
            loadBannerBottom(activity);
        } else {
            if (direction.equals(Const.SmallBottom)) {

                if (nativeAdBottom != null) {
                    Log.d(TAG, "Admob_Native showBottomNative nativeAdBottom -> 1");
                    showAdmobNative_SmallBottom(activity, viewGroup, nativeAdBottom, nativeType, direction);
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            nativeAdBottom = null;
                        }
                    }, Const.nullParameterTime);
                    loadNativeBottom1(activity);

                } else {
                    if (nativeAdBottom1 != null) {
                        Log.d(TAG, "Admob_Native showBottomNative nativeAdBottom1 -> 2");
                        showAdmobNative_SmallBottom(activity, viewGroup, nativeAdBottom1, nativeType, direction);
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                nativeAdBottom1 = null;
                            }
                        }, Const.nullParameterTime);
                        loadNativeBottom(activity);

                    } else {
                        startTimerBottomNative(activity);
                        Log.d(TAG, "Admob_Native showBottomNative nativeAdBottom & nativeAdBottom1 -> null");
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


    private static void showAdmobNative_SmallBottom(Activity activity,ViewGroup viewGroup, NativeAd nativeAd, String nativeType, String direction) {
        Log.d(TAG, "Admob_Native showAdmobNative_SmallBottom -> ");

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
                Admob_Native_Inflate.inflate_native_Small_Banner(activity, viewGroup, nativeAd, nativeType, direction);
            } else {
                Admob_Native_Inflate.inflate_native_SmallBottom(activity, viewGroup, nativeAd, nativeType, direction);
            }

        } catch (Exception e) {
            Log.d(TAG, "Admob_Native showAdmobNative_SmallBottom Exception -> " + e.toString());
            e.printStackTrace();
        }


    }

    private static void showAdmobBanner_Bottom(Activity activity,ViewGroup viewGroup, AdView bannerBottom, String nativeType, String direction) {
        Log.d(TAG, "Admob_Native showAdmobBanner_Bottom -> ");


        try {
            viewGroup.setVisibility(View.VISIBLE);
            viewGroup.removeAllViews();

            View view = LayoutInflater.from(activity).inflate(R.layout.native_small_placeholder, null);
            viewGroup.addView(view);

            ShimmerFrameLayout mShimmerViewContainer = view.findViewById(R.id.shimmer_view_container);
            mShimmerViewContainer.startShimmer();
            mShimmerViewContainer.setVisibility(View.VISIBLE);

            bannerBottom.loadAd(adRequestBannerBottom);
            bannerBottom.setAdListener(new AdListener() {
                @Override
                public void onAdClosed() {
                    super.onAdClosed();
                }

                @Override
                public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                    super.onAdFailedToLoad(loadAdError);
                    viewGroup.removeAllViews();
                }

                @Override
                public void onAdOpened() {
                    super.onAdOpened();
                }

                @Override
                public void onAdLoaded() {
                    super.onAdLoaded();
                    viewGroup.removeAllViews();
                    viewGroup.addView(bannerBottom);
                }

                @Override
                public void onAdClicked() {
                    super.onAdClicked();
                }

                @Override
                public void onAdImpression() {
                    super.onAdImpression();
                }
            });

        } catch (Exception e) {
            viewGroup.setVisibility(View.GONE);
            Log.d(TAG, "Admob_Native showAdmobBanner_Bottom Exception -> " + e.toString());
            e.printStackTrace();
        }


    }

    //    -----------------------  Bottom Ads --------------------------------------


    //    -----------------------  Extra Ads --------------------------------------

    public static NativeAd nativeAdExtra = null, nativeAdExtra1 = null;
    public static Boolean isNativeExtraTimerRun = false;

    public static void loadNativeExtra(Activity mactivity) {
        String adId = utils.get_Admob_NativeAdsId_1();
        final AdLoader adLoader = new AdLoader.Builder(mactivity, adId)
                .forNativeAd(new NativeAd.OnNativeAdLoadedListener() {
                    @Override
                    public void onNativeAdLoaded(NativeAd mnativeAd) {
                        Log.d(TAG, "Admob_Native loadNativeExtra onNativeAdLoaded");
                        nativeAdExtra = mnativeAd;
                    }
                })
                .withAdListener(new AdListener() {
                    @Override
                    public void onAdFailedToLoad(LoadAdError adError) {
                        Log.d(TAG, "Admob_Native loadNativeExtra onAdFailedToLoad ");
                    }
                })
                .withNativeAdOptions(new NativeAdOptions.Builder().build()).build();
        adLoader.loadAd(new AdManagerAdRequest.Builder().build());
    }

    public static void loadNativeExtra1(Activity mactivity) {
        String adId = utils.get_Admob_NativeAdsId_2();
        final AdLoader adLoader = new AdLoader.Builder(mactivity, adId)
                .forNativeAd(new NativeAd.OnNativeAdLoadedListener() {
                    @Override
                    public void onNativeAdLoaded(NativeAd mnativeAd) {
                        Log.d(TAG, "Admob_Native loadNativeExtra onNativeAdLoaded");
                        nativeAdExtra1 = mnativeAd;
                    }
                })
                .withAdListener(new AdListener() {
                    @Override
                    public void onAdFailedToLoad(LoadAdError adError) {
                        Log.d(TAG, "Admob_Native loadNativeExtra onAdFailedToLoad ");
                    }
                })
                .withNativeAdOptions(new NativeAdOptions.Builder().build()).build();
        adLoader.loadAd(new AdManagerAdRequest.Builder().build());
    }

    public static void showNativeExtra(Activity activity, ViewGroup id, String nativeType, String direction) {
//        Log.d(TAG, "Admob_Native showNativeExtra -> ");
        if (nativeAdExtra != null) {
            Log.d(TAG, "Admob_Native showNativeExtra nativeAdExtra -> 1");
            showAdmobNative_Extra(activity, id, nativeAdExtra, nativeType, direction);
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    nativeAdExtra = null;
                }
            }, Const.nullParameterTime);
            loadNativeExtra1(activity);
        } else {
            if (nativeAdExtra1 != null) {
                Log.d(TAG, "Admob_Native showNativeExtra nativeAdExtra -> 2");
                showAdmobNative_Extra(activity, id, nativeAdExtra1, nativeType, direction);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        nativeAdExtra1 = null;
                    }
                }, Const.nullParameterTime);
                loadNativeExtra(activity);
            } else {
                startTimerExtraNative(activity);
                Log.d(TAG, "Admob_Native showNativeExtra nativeAdExtra & nativeAdExtra1 -> null");
            }
        }

    }

    private static void showAdmobNative_Extra(Activity activity, ViewGroup viewGroup, NativeAd nativeAd, String nativeType, String direction) {
        Log.d(TAG, "Admob_Native showAdmobNative_Extra -> ");
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
                Admob_Native_Inflate.inflate_native_Small_Banner(activity, viewGroup, nativeAd, nativeType, direction);
            } else {
                if (direction.equals(Const.SmallTop)) {
                    Log.d(TAG, "Admob_Native showAdmobNative_Extra SmallTop");
                    Admob_Native_Inflate.inflate_native_SmallBottom(activity, viewGroup, nativeAd, nativeType, direction);
                } else if (direction.equals(Const.SmallBottom)) {
                    Log.d(TAG, "Admob_Native showAdmobNative_Extra SmallBottom");
                    Admob_Native_Inflate.inflate_native_SmallTop(activity, viewGroup, nativeAd, nativeType, direction);
                }
            }

        } catch (Exception e) {
            Log.d(TAG, "Admob_Native showAdmobNative_Extra Exception -> " + e.toString());
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
