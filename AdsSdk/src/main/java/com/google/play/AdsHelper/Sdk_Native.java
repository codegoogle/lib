package com.google.play.AdsHelper;

import android.app.Activity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.play.MyApp;
import com.google.ads.R;
import com.google.play.Utils.Const;

public class Sdk_Native {

    public static final String TAG = "Sdk_Native";


    //    -----------------------  Top Ads --------------------------------------

    public static void loadBannerTop(Activity mactivity) {
        Log.d(TAG, "Sdk_Native loadBannerTop -> ");
    }

    public static void loadNativeTop(Activity mactivity) {

    }

    public static void showTopNative(Activity activity, ViewGroup viewGroup, String nativeType, String direction) {
        Log.d(TAG, "Sdk_Native showTopNative direction -> " + direction);


        if (nativeType.equals(Const.Big)) {
            showSdkNative_Big(activity, viewGroup, null, nativeType, direction);
            loadNativeTop(activity);
        } else if (direction.equals(Const.SmallTop)) {
            if (MyApp.getString(Const.banner_type_top).equals("1")) {
                showSdkBanner_Top(activity, viewGroup, null, nativeType, direction);
                loadBannerTop(activity);
            } else {
                showSdkNative_SmallTop(activity, viewGroup, null, nativeType, direction);
                loadNativeTop(activity);
            }
        }
    }

    private static void showSdkNative_Big(Activity activity, ViewGroup viewGroup, String nativeAd, String nativeType, String direction) {
        Log.d(TAG, "Sdk_Native showAdmobNative_Big-> ");

        try {
            viewGroup.setVisibility(View.VISIBLE);
            viewGroup.removeAllViews();

            View view = LayoutInflater.from(activity).inflate(R.layout.native_big_placeholder, null);
            viewGroup.addView(view);

            ShimmerFrameLayout mShimmerViewContainer = view.findViewById(R.id.shimmer_view_container);
            mShimmerViewContainer.startShimmer();
            mShimmerViewContainer.setVisibility(View.VISIBLE);

            Sdk_Native_Inflate.inflate_native_Top(activity, viewGroup, null, nativeType, direction);

        } catch (Exception e) {
            Log.d(TAG, "Sdk_Native showAdmobNative_Big Exception -> " + e.toString());
            e.printStackTrace();
        }


    }

    private static void showSdkNative_SmallTop(Activity activity, ViewGroup viewGroup, String nativeAd, String nativeType, String direction) {
        Log.d(TAG, "Sdk_Native showAdmobNative_SmallTop -> ");
        try {
            viewGroup.setVisibility(View.VISIBLE);
            viewGroup.removeAllViews();

            View view = LayoutInflater.from(activity).inflate(R.layout.native_small_placeholder, null);
            viewGroup.addView(view);

            ShimmerFrameLayout mShimmerViewContainer = view.findViewById(R.id.shimmer_view_container);
            mShimmerViewContainer.startShimmer();
            mShimmerViewContainer.setVisibility(View.VISIBLE);

            if (MyApp.getString(Const.ads_btn_top).equals("1")) {
                Sdk_Native_Inflate.inflate_native_Top(activity, viewGroup, null, nativeType, direction);
            } else {
                Sdk_Native_Inflate.inflate_native_Top(activity, viewGroup, null, nativeType, direction);
            }

        } catch (Exception e) {
            Log.d(TAG, "Sdk_Native showAdmobNative_SmallTop Exception -> " + e.toString());
            e.printStackTrace();
        }


    }

    private static void showSdkBanner_Top(Activity activity, ViewGroup viewGroup, String bannerTop, String nativeType, String direction) {
        Log.d(TAG, "Sdk_Native showAdmobBanner_Top -> ");
        try {
            viewGroup.setVisibility(View.VISIBLE);
            viewGroup.removeAllViews();

            View view = LayoutInflater.from(activity).inflate(R.layout.native_small_placeholder, null);
            viewGroup.addView(view);

            ShimmerFrameLayout mShimmerViewContainer = view.findViewById(R.id.shimmer_view_container);
            mShimmerViewContainer.startShimmer();
            mShimmerViewContainer.setVisibility(View.VISIBLE);

            Sdk_Native_Inflate.inflate_native_Top(activity, viewGroup, null, nativeType, direction);

        } catch (Exception e) {
            viewGroup.setVisibility(View.GONE);
            Log.d(TAG, "Sdk_Native showAdmobBanner_Top Exception -> " + e.toString());
            e.printStackTrace();
        }


    }


    //    -----------------------  Top Ads --------------------------------------


    //    -----------------------  Bottom Ads --------------------------------------


    public static void loadBannerBottom(Activity mactivity) {

    }

    public static void loadNativeBottom(Activity mactivity) {

    }

    public static void showBottomNative(Activity activity,ViewGroup viewGroup, String nativeType, String direction) {
        Log.d(TAG, "Sdk_Native showBottomNative direction -> " + direction);
        if (MyApp.getString(Const.banner_type_bottom).equals("1")) {
            showSdkBanner_Bottom(activity, viewGroup, null, nativeType, direction);
//            loadBannerBottom(activity);
        } else {
            if (direction.equals(Const.SmallBottom)) {
                showSdkNative_SmallBottom(activity, viewGroup, null, nativeType, direction);
//                loadNativeBottom(activity);
            }
        }
    }

    private static void showSdkNative_SmallBottom(Activity activity,ViewGroup viewGroup, String nativeAd, String nativeType, String direction) {
        Log.d(TAG, "Sdk_Native showAdmobNative_SmallBottom -> ");
        try {
            viewGroup.setVisibility(View.VISIBLE);
            viewGroup.removeAllViews();

            View view = LayoutInflater.from(activity).inflate(R.layout.native_small_placeholder, null);
            viewGroup.addView(view);

            ShimmerFrameLayout mShimmerViewContainer = view.findViewById(R.id.shimmer_view_container);
            mShimmerViewContainer.startShimmer();
            mShimmerViewContainer.setVisibility(View.VISIBLE);

            if (MyApp.getString(Const.ads_btn_bottom).equals("1")) {
                Sdk_Native_Inflate.inflate_native_Bottom(activity, viewGroup, null, nativeType, direction);
            } else {
                Sdk_Native_Inflate.inflate_native_Bottom(activity, viewGroup, null, nativeType, direction);
            }

        } catch (Exception e) {
            Log.d(TAG, "Sdk_Native showAdmobNative_SmallBottom Exception -> " + e.toString());
            e.printStackTrace();
        }


    }

    private static void showSdkBanner_Bottom(Activity activity, ViewGroup viewGroup, String bannerBottom, String nativeType, String direction) {
        Log.d(TAG, "Sdk_Native showAdmobBanner_Bottom -> ");
        try {
            viewGroup.setVisibility(View.VISIBLE);
            viewGroup.removeAllViews();

            View view = LayoutInflater.from(activity).inflate(R.layout.native_small_placeholder, null);
            viewGroup.addView(view);

            ShimmerFrameLayout mShimmerViewContainer = view.findViewById(R.id.shimmer_view_container);
            mShimmerViewContainer.startShimmer();
            mShimmerViewContainer.setVisibility(View.VISIBLE);

            Sdk_Native_Inflate.inflate_native_Bottom(activity, viewGroup, null, nativeType, direction);

        } catch (Exception e) {
            viewGroup.setVisibility(View.GONE);
            Log.d(TAG, "Sdk_Native showAdmobBanner_Bottom Exception -> " + e.toString());
            e.printStackTrace();
        }


    }

    //    -----------------------  Bottom Ads --------------------------------------


    //    -----------------------  Extra Ads --------------------------------------


    public static void loadNativeExtra(Activity mactivity) {

    }

    public static void showNativeExtra(Activity activity, ViewGroup viewGroup, String nativeType, String direction) {
        Log.d(TAG, "Sdk_Native showNativeExtra -> ");
        showSdkNative_Extra(activity, viewGroup, null, nativeType, direction);
//        loadNativeExtra(activity);
    }

    private static void showSdkNative_Extra(Activity activity, ViewGroup viewGroup, String nativeAd, String nativeType, String direction) {
        Log.d(TAG, "Sdk_Native showSdkNative_Extra -> ");
        try {
            viewGroup.setVisibility(View.VISIBLE);
            viewGroup.removeAllViews();

            View view = LayoutInflater.from(activity).inflate(R.layout.native_small_placeholder, null);
            viewGroup.addView(view);

            ShimmerFrameLayout mShimmerViewContainer = view.findViewById(R.id.shimmer_view_container);
            mShimmerViewContainer.startShimmer();
            mShimmerViewContainer.setVisibility(View.VISIBLE);

            if (MyApp.getString(Const.ads_btn).equals("1")) {
                Sdk_Native_Inflate.inflate_native_Extra_Top(activity, viewGroup, null, nativeType, direction);
            } else {
                if (direction.equals(Const.SmallTop)) {
                    Log.d(TAG, "Sdk_Native showSdkNative_Extra SmallTop");
                    Sdk_Native_Inflate.inflate_native_Extra_Top(activity, viewGroup, null, nativeType, direction);
                } else if (direction.equals(Const.SmallBottom)) {
                    Log.d(TAG, "Sdk_Native showSdkNative_Extra SmallBottom");
                    Sdk_Native_Inflate.inflate_native_Extra_Bottom(activity, viewGroup, null, nativeType, direction);
                }
            }

        } catch (Exception e) {
            Log.d(TAG, "Sdk_Native showSdkNative_Extra Exception -> " + e.toString());
            e.printStackTrace();
        }

    }


    //    -----------------------  Extra Ads --------------------------------------

}
