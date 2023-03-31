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

public class Qureka_Native {

    public static final String TAG = "Qureka_Native";


    //    -----------------------  Top Ads --------------------------------------


    public static void showTopNative(Activity activity, ViewGroup viewGroup, String nativeType, String direction) {
        Log.d(TAG, "Qureka_Native showTopNative direction -> " + direction);


        if (nativeType.equals(Const.Big)) {
            showQurekaNative_Big(activity, viewGroup, nativeType, direction);
        } else if (direction.equals(Const.SmallTop)) {
            if (MyApp.getString(Const.banner_type_top).equals("1")) {
                showQurekaBanner_Top(activity, viewGroup, nativeType, direction);
            } else {
                showQurekaNative_SmallTop(activity, viewGroup, nativeType, direction);
            }
        }
    }

    private static void showQurekaNative_Big(Activity activity, ViewGroup viewGroup, String nativeType, String direction) {
        Log.d(TAG, "Qureka_Native showAdmobNative_Big-> ");
        try {
            viewGroup.setVisibility(View.VISIBLE);
            viewGroup.removeAllViews();

            View view = LayoutInflater.from(activity).inflate(R.layout.native_big_placeholder, null);
            viewGroup.addView(view);

            ShimmerFrameLayout mShimmerViewContainer = view.findViewById(R.id.shimmer_view_container);
            mShimmerViewContainer.startShimmer();
            mShimmerViewContainer.setVisibility(View.VISIBLE);

            Qureka_Native_Inflate.inflate_native_big_card(activity, viewGroup, nativeType, direction);

        } catch (Exception e) {
            Log.d(TAG, "Qureka_Native showAdmobNative_Big Exception -> " + e.toString());
            e.printStackTrace();
        }


    }

    private static void showQurekaNative_SmallTop(Activity activity, ViewGroup viewGroup, String nativeType, String direction) {
        Log.d(TAG, "Qureka_Native showAdmobNative_SmallTop -> ");

        try {
            viewGroup.setVisibility(View.VISIBLE);
            viewGroup.removeAllViews();

            View view = LayoutInflater.from(activity).inflate(R.layout.native_small_placeholder, null);
            viewGroup.addView(view);

            ShimmerFrameLayout mShimmerViewContainer = view.findViewById(R.id.shimmer_view_container);
            mShimmerViewContainer.startShimmer();
            mShimmerViewContainer.setVisibility(View.VISIBLE);

            if (MyApp.getString(Const.ads_btn_top).equals("1")) {
                Qureka_Native_Inflate.inflate_native_Small_Banner(activity, viewGroup, nativeType, direction);
            } else if (MyApp.getString(Const.ads_btn_top).equals("2")) {
                Qureka_Native_Inflate.inflate_native_SmallTop_Webview(activity, viewGroup, nativeType, direction);
            } else {
                Qureka_Native_Inflate.inflate_native_SmallTop(activity, viewGroup, nativeType, direction);
            }

        } catch (Exception e) {
            Log.d(TAG, "Qureka_Native showAdmobNative_SmallTop Exception -> " + e.toString());
            e.printStackTrace();
        }


    }

    private static void showQurekaBanner_Top(Activity activity, ViewGroup viewGroup, String nativeType, String direction) {
        Log.d(TAG, "Qureka_Native showAdmobBanner_Top -> ");
        try {
            viewGroup.setVisibility(View.VISIBLE);
            viewGroup.removeAllViews();

            View view = LayoutInflater.from(activity).inflate(R.layout.native_small_placeholder, null);
            viewGroup.addView(view);

            ShimmerFrameLayout mShimmerViewContainer = view.findViewById(R.id.shimmer_view_container);
            mShimmerViewContainer.startShimmer();
            mShimmerViewContainer.setVisibility(View.VISIBLE);

            Qureka_Native_Inflate.inflate_native_banner(activity, viewGroup);

        } catch (Exception e) {
            viewGroup.setVisibility(View.GONE);
            Log.d(TAG, "Qureka_Native showAdmobBanner_Top Exception -> " + e.toString());
            e.printStackTrace();
        }


    }


    //    -----------------------  Top Ads --------------------------------------


    //    -----------------------  Bottom Ads --------------------------------------

    public static void showBottomNative(Activity activity, ViewGroup viewGroup, String nativeType, String direction) {
        Log.d(TAG, "Qureka_Native showBottomNative direction -> " + direction);
        if (MyApp.getString(Const.banner_type_bottom).equals("1")) {
            showQurekaBanner_Bottom(activity, viewGroup, nativeType, direction);
        } else {
            if (direction.equals(Const.SmallBottom)) {
                showQurekaNative_SmallBottom(activity, viewGroup, nativeType, direction);
            }
        }
    }

    private static void showQurekaNative_SmallBottom(Activity activity, ViewGroup viewGroup, String nativeType, String direction) {
        Log.d(TAG, "Qureka_Native showAdmobNative_SmallBottom -> ");
        try {
            viewGroup.setVisibility(View.VISIBLE);
            viewGroup.removeAllViews();

            View view = LayoutInflater.from(activity).inflate(R.layout.native_small_placeholder, null);
            viewGroup.addView(view);

            ShimmerFrameLayout mShimmerViewContainer = view.findViewById(R.id.shimmer_view_container);
            mShimmerViewContainer.startShimmer();
            mShimmerViewContainer.setVisibility(View.VISIBLE);

            if (MyApp.getString(Const.ads_btn_bottom).equals("1")) {
                Qureka_Native_Inflate.inflate_native_Small_Banner_Bottom(activity, viewGroup, nativeType, direction);
            } else if (MyApp.getString(Const.ads_btn_bottom).equals("2")) {
                Qureka_Native_Inflate.inflate_native_SmallBottom_Webview(activity, viewGroup, nativeType, direction);
            } else {
                Qureka_Native_Inflate.inflate_native_SmallBottom(activity, viewGroup, nativeType, direction);
            }

        } catch (Exception e) {
            Log.d(TAG, "Qureka_Native showAdmobNative_SmallBottom Exception -> " + e.toString());
            e.printStackTrace();
        }


    }

    private static void showQurekaBanner_Bottom(Activity activity, ViewGroup viewGroup, String nativeType, String direction) {
        Log.d(TAG, "Qureka_Native showAdmobBanner_Bottom -> ");
        try {
            viewGroup.setVisibility(View.VISIBLE);
            viewGroup.removeAllViews();

            View view = LayoutInflater.from(activity).inflate(R.layout.native_small_placeholder, null);
            viewGroup.addView(view);

            ShimmerFrameLayout mShimmerViewContainer = view.findViewById(R.id.shimmer_view_container);
            mShimmerViewContainer.startShimmer();
            mShimmerViewContainer.setVisibility(View.VISIBLE);

            Qureka_Native_Inflate.inflate_native_banner(activity, viewGroup);

        } catch (Exception e) {
            viewGroup.setVisibility(View.GONE);
            Log.d(TAG, "Qureka_Native showAdmobBanner_Bottom Exception -> " + e.toString());
            e.printStackTrace();
        }


    }

    //    -----------------------  Bottom Ads --------------------------------------


    //    -----------------------  Extra Ads --------------------------------------


    public static void showNativeExtra(Activity activity, ViewGroup viewGroup, String nativeType, String direction) {
        Log.d(TAG, "Qureka_Native showNativeExtra -> ");
        showQurekaNative_Extra(activity, viewGroup, nativeType, direction);
    }

    private static void showQurekaNative_Extra(Activity activity, ViewGroup viewGroup, String nativeType, String direction) {
        Log.d(TAG, "Qureka_Native showAdmobNative_Extra -> ");
        try {
            viewGroup.setVisibility(View.VISIBLE);
            viewGroup.removeAllViews();

            View view = LayoutInflater.from(activity).inflate(R.layout.native_small_placeholder, null);
            viewGroup.addView(view);

            ShimmerFrameLayout mShimmerViewContainer = view.findViewById(R.id.shimmer_view_container);
            mShimmerViewContainer.startShimmer();
            mShimmerViewContainer.setVisibility(View.VISIBLE);

            if (MyApp.getString(Const.ads_btn).equals("1")) {
                Qureka_Native_Inflate.inflate_native_Small_Banner(activity, viewGroup, nativeType, direction);
            } else {
                if (direction.equals(Const.SmallTop)) {
                    Log.d(TAG, "Qureka_Native showAdmobNative_Extra SmallTop");
                    Qureka_Native_Inflate.inflate_native_SmallBottom(activity, viewGroup, nativeType, direction);
                } else if (direction.equals(Const.SmallBottom)) {
                    Log.d(TAG, "Qureka_Native showAdmobNative_Extra SmallBottom");
                    Qureka_Native_Inflate.inflate_native_SmallTop(activity, viewGroup, nativeType, direction);
                }
            }

        } catch (Exception e) {
            Log.d(TAG, "Qureka_Native showAdmobNative_Extra Exception -> " + e.toString());
            e.printStackTrace();
        }

    }


    //    -----------------------  Extra Ads --------------------------------------

}
