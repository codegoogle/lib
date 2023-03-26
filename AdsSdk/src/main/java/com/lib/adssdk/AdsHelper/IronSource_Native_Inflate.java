package com.lib.adssdk.AdsHelper;

import android.app.Activity;
import android.content.res.Resources;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceBannerLayout;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.BannerListener;
import com.lib.adssdk.MyApp;
import com.lib.adssdk.R;
import com.lib.adssdk.Utils.Const;
import com.lib.adssdk.Utils.Res;


public class IronSource_Native_Inflate {


    private static String TAG = "IronSource_Native_Inflate";
    private static Res res;
    private static Activity mactivity;


    private static Resources getResources() {
        if (res == null) {
            res = new Res(mactivity.getResources());
        }
        return res;
    }

    public static void inflate_native_big_card(Activity activity, ViewGroup viewGroup, IronSourceBannerLayout nativeAd, String nativeType, String direction) {
        Log.d(TAG, "IronSource_Native_Inflate inflate_native_big_card");
        mactivity = activity;

        viewGroup.setVisibility(View.VISIBLE);
        viewGroup.removeAllViews();

        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT,
                FrameLayout.LayoutParams.WRAP_CONTENT);
        viewGroup.addView(nativeAd, 0, layoutParams);

        nativeAd.setBannerListener(new BannerListener() {
            @Override
            public void onBannerAdLoaded() {
                Log.d(TAG, "IronSource_Native_Inflate inflate_native_big_card onBannerAdLoaded");
            }

            @Override
            public void onBannerAdLoadFailed(IronSourceError error) {
                Log.d(TAG, "IronSource_Native_Inflate inflate_native_big_card onBannerAdLoadFailed error -> " + error.getErrorMessage() +" code - > "+error.getErrorCode());
                activity.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        viewGroup.removeAllViews();
                    }
                });
            }

            @Override
            public void onBannerAdClicked() {
                Log.d(TAG, "IronSource_Native_Inflate inflate_native_big_card onBannerAdClicked");
            }

            @Override
            public void onBannerAdScreenPresented() {
                Log.d(TAG, "IronSource_Native_Inflate inflate_native_big_card onBannerAdScreenPresented");
            }

            @Override
            public void onBannerAdScreenDismissed() {
                Log.d(TAG, "IronSource_Native_Inflate inflate_native_big_card onBannerAdScreenDismissed");
            }

            @Override
            public void onBannerAdLeftApplication() {
                Log.d(TAG, "IronSource_Native_Inflate inflate_native_big_card onBannerAdLeftApplication");
            }
        });
        IronSource.loadBanner(nativeAd);

    }

    public static void inflate_native_SmallTop(Activity activity, ViewGroup viewGroup, IronSourceBannerLayout nativeAd, String nativeType, String direction) {
        mactivity = activity;

        viewGroup.setVisibility(View.VISIBLE);
        viewGroup.removeAllViews();

        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT,
                FrameLayout.LayoutParams.WRAP_CONTENT);
        viewGroup.addView(nativeAd, 0, layoutParams);

        nativeAd.setBannerListener(new BannerListener() {
            @Override
            public void onBannerAdLoaded() {
                Log.d(TAG, "IronSource_Native_Inflate inflate_native_SmallTop onBannerAdLoaded");
            }

            @Override
            public void onBannerAdLoadFailed(IronSourceError error) {
                activity.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        viewGroup.removeAllViews();
                    }
                });
            }

            @Override
            public void onBannerAdClicked() {
                Log.d(TAG, "IronSource_Native_Inflate inflate_native_SmallTop onBannerAdClicked");
            }

            @Override
            public void onBannerAdScreenPresented() {
                Log.d(TAG, "IronSource_Native_Inflate inflate_native_SmallTop onBannerAdScreenPresented");
            }

            @Override
            public void onBannerAdScreenDismissed() {
                Log.d(TAG, "IronSource_Native_Inflate inflate_native_SmallTop onBannerAdScreenDismissed");
            }

            @Override
            public void onBannerAdLeftApplication() {
                Log.d(TAG, "IronSource_Native_Inflate inflate_native_SmallTop onBannerAdLeftApplication");
            }
        });

        IronSource.loadBanner(nativeAd);
    }

    public static void inflate_native_Small_Banner(Activity activity, ViewGroup viewGroup, IronSourceBannerLayout nativeAd, String nativeType, String direction) {
        Log.d(TAG, "IronSource_Native_Inflate inflate_native_Small_Banner");
        mactivity = activity;


        viewGroup.setVisibility(View.VISIBLE);
        viewGroup.removeAllViews();

        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT,
                FrameLayout.LayoutParams.WRAP_CONTENT);
        viewGroup.addView(nativeAd, 0, layoutParams);

        nativeAd.setBannerListener(new BannerListener() {
            @Override
            public void onBannerAdLoaded() {
                Log.d(TAG, "IronSource_Native_Inflate inflate_native_Small_Banner onBannerAdLoaded");
            }

            @Override
            public void onBannerAdLoadFailed(IronSourceError error) {
                activity.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        viewGroup.removeAllViews();
                    }
                });
            }

            @Override
            public void onBannerAdClicked() {
                Log.d(TAG, "IronSource_Native_Inflate inflate_native_Small_Banner onBannerAdClicked");
            }

            @Override
            public void onBannerAdScreenPresented() {
                Log.d(TAG, "IronSource_Native_Inflate inflate_native_Small_Banner onBannerAdScreenPresented");
            }

            @Override
            public void onBannerAdScreenDismissed() {
                Log.d(TAG, "IronSource_Native_Inflate inflate_native_Small_Banner onBannerAdScreenDismissed");
            }

            @Override
            public void onBannerAdLeftApplication() {
                Log.d(TAG, "IronSource_Native_Inflate inflate_native_Small_Banner onBannerAdLeftApplication");
            }
        });

        IronSource.loadBanner(nativeAd);
    }

    public static void inflate_native_Small_Banner_Top(Activity activity, ViewGroup viewGroup, IronSourceBannerLayout nativeAd, String nativeType, String direction) {
        mactivity = activity;


        viewGroup.setVisibility(View.VISIBLE);
        viewGroup.removeAllViews();

        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT,
                FrameLayout.LayoutParams.WRAP_CONTENT);
        viewGroup.addView(nativeAd, 0, layoutParams);

        nativeAd.setBannerListener(new BannerListener() {
            @Override
            public void onBannerAdLoaded() {
                Log.d(TAG, "IronSource_Native_Inflate inflate_native_Small_Banner onBannerAdLoaded");
            }

            @Override
            public void onBannerAdLoadFailed(IronSourceError error) {
                activity.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        viewGroup.removeAllViews();
                    }
                });
            }

            @Override
            public void onBannerAdClicked() {
                Log.d(TAG, "IronSource_Native_Inflate inflate_native_Small_Banner onBannerAdClicked");
            }

            @Override
            public void onBannerAdScreenPresented() {
                Log.d(TAG, "IronSource_Native_Inflate inflate_native_Small_Banner onBannerAdScreenPresented");
            }

            @Override
            public void onBannerAdScreenDismissed() {
                Log.d(TAG, "IronSource_Native_Inflate inflate_native_Small_Banner onBannerAdScreenDismissed");
            }

            @Override
            public void onBannerAdLeftApplication() {
                Log.d(TAG, "IronSource_Native_Inflate inflate_native_Small_Banner onBannerAdLeftApplication");
            }
        });

        IronSource.loadBanner(nativeAd);
    }

    public static void inflate_native_Small_Banner_Bottom(Activity activity, ViewGroup viewGroup, IronSourceBannerLayout nativeAd, String nativeType, String direction) {
        mactivity = activity;


        viewGroup.setVisibility(View.VISIBLE);
        viewGroup.removeAllViews();

        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT,
                FrameLayout.LayoutParams.WRAP_CONTENT);
        viewGroup.addView(nativeAd, 0, layoutParams);

        nativeAd.setBannerListener(new BannerListener() {
            @Override
            public void onBannerAdLoaded() {
                Log.d(TAG, "IronSource_Native_Inflate inflate_native_Small_Banner onBannerAdLoaded");
            }

            @Override
            public void onBannerAdLoadFailed(IronSourceError error) {
                activity.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        viewGroup.removeAllViews();
                    }
                });
            }

            @Override
            public void onBannerAdClicked() {
                Log.d(TAG, "IronSource_Native_Inflate inflate_native_Small_Banner onBannerAdClicked");
            }

            @Override
            public void onBannerAdScreenPresented() {
                Log.d(TAG, "IronSource_Native_Inflate inflate_native_Small_Banner onBannerAdScreenPresented");
            }

            @Override
            public void onBannerAdScreenDismissed() {
                Log.d(TAG, "IronSource_Native_Inflate inflate_native_Small_Banner onBannerAdScreenDismissed");
            }

            @Override
            public void onBannerAdLeftApplication() {
                Log.d(TAG, "IronSource_Native_Inflate inflate_native_Small_Banner onBannerAdLeftApplication");
            }
        });

        IronSource.loadBanner(nativeAd);
    }


    public static void inflate_native_SmallBottom(Activity activity, ViewGroup viewGroup, IronSourceBannerLayout nativeAd, String nativeType, String direction) {
        mactivity = activity;

        viewGroup.setVisibility(View.VISIBLE);
        viewGroup.removeAllViews();

        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT,
                FrameLayout.LayoutParams.WRAP_CONTENT);
        viewGroup.addView(nativeAd, 0, layoutParams);

        nativeAd.setBannerListener(new BannerListener() {
            @Override
            public void onBannerAdLoaded() {
                Log.d(TAG, "IronSource_Native_Inflate inflate_native_SmallBottom onBannerAdLoaded");
            }

            @Override
            public void onBannerAdLoadFailed(IronSourceError error) {
                activity.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        viewGroup.removeAllViews();
                    }
                });
            }

            @Override
            public void onBannerAdClicked() {
                Log.d(TAG, "IronSource_Native_Inflate inflate_native_SmallBottom onBannerAdClicked");
            }

            @Override
            public void onBannerAdScreenPresented() {
                Log.d(TAG, "IronSource_Native_Inflate inflate_native_SmallBottom onBannerAdScreenPresented");
            }

            @Override
            public void onBannerAdScreenDismissed() {
                Log.d(TAG, "IronSource_Native_Inflate inflate_native_SmallBottom onBannerAdScreenDismissed");
            }

            @Override
            public void onBannerAdLeftApplication() {
                Log.d(TAG, "IronSource_Native_Inflate inflate_native_SmallBottom onBannerAdLeftApplication");
            }
        });

        IronSource.loadBanner(nativeAd);
    }


}
