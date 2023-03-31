package com.google.play.Utils;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;

import com.google.play.MyApp;
import com.google.ads.R;

public class Res extends Resources {

    private String TAG = "Res";

    public Res(Resources original) {
        super(original.getAssets(), original.getDisplayMetrics(), original.getConfiguration());
    }

    @Override
    public int getColor(int id) throws NotFoundException {
        return getColor(id, null);
    }

    public int getColorDefault(int id, Theme theme) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            return super.getColor(id, theme);
        }
        return super.getColor(id);
    }

    @Override
    public int getColor(int id, Theme theme) throws NotFoundException {
        switch (getResourceEntryName(id)) {
            case "ads_btn_color_start":
                if (MyApp.getString(Const.ads_btn_color_start).equals("")) {
                    return getColorDefault(id, theme);
                } else {
                    return Color.parseColor(MyApp.getString(Const.ads_btn_color_start));
                }
            case "ads_btn_color_end":
                if (MyApp.getString(Const.ads_btn_color_end).equals("")) {
                    return getColorDefault(id, theme);
                } else {
                    return Color.parseColor(MyApp.getString(Const.ads_btn_color_end));
                }
            case "ads_btn_color_border_start":
                if (MyApp.getString(Const.ads_btn_color_border_start).equals("")) {
                    return getColorDefault(id, theme);
                } else {
                    return Color.parseColor(MyApp.getString(Const.ads_btn_color_border_start));
                }
            case "ads_btn_color_border_end":
                if (MyApp.getString(Const.ads_btn_color_border_end).equals("")) {
                    return getColorDefault(id, theme);
                } else {
                    return Color.parseColor(MyApp.getString(Const.ads_btn_color_border_end));
                }
            case "ads_btn_color_text":
                if (MyApp.getString(Const.ads_btn_color_text).equals("")) {
                    return getColorDefault(id, theme);
                } else {
                    return Color.parseColor(MyApp.getString(Const.ads_btn_color_text));
                }
            case "ad_text_primary":
                if (MyApp.getString(Const.ad_text_primary).equals("")) {
                    return getColorDefault(id, theme);
                } else {
                    return Color.parseColor(MyApp.getString(Const.ad_text_primary));
                }

            default:
                return getColorDefault(id, theme);
        }
    }


    @Override
    public float getDimension(int id) throws NotFoundException {
        switch (getResourceEntryName(id)) {
            case "ads_btn_height":
                if (MyApp.getString(Const.ads_btn_height).equals("")) {
                    return super.getDimension(id);
                } else {

                    final float scale = getDisplayMetrics().density;
                    float pixels = Integer.parseInt(MyApp.getString(Const.ads_btn_height)) * scale + 0.5f;
                    return pixels;
                }
            case "ads_btn_border_height":
                if (MyApp.getString(Const.ads_btn_border_height).equals("")) {
                    return super.getDimension(id);
                } else {

                    final float scale = getDisplayMetrics().density;
                    float pixels = Integer.parseInt(MyApp.getString(Const.ads_btn_border_height)) * scale + 0.5f;
                    return pixels;
                }
            case "ads_btn_radius":
                if (MyApp.getString(Const.ads_btn_radius).equals("")) {
                    return super.getDimension(id);
                } else {
                    final float scale = getDisplayMetrics().density;
                    float pixels = Integer.parseInt(MyApp.getString(Const.ads_btn_radius)) * scale + 0.5f;
                    return pixels;
                }
            case "ads_btn_2_height_top":
                if (!MyApp.getString(Const.ads_btn_2_height_top).equals("")) {
                    final float scale = getDisplayMetrics().density;
                    float pixels = Integer.parseInt(MyApp.getString(Const.ads_btn_2_height_top)) * scale + 0.5f;
                    return pixels;
                } else if (MyApp.getString(Const.ads_btn_top).equals("1")) {
                    return super.getDimension(R.dimen.native_small_height);
                } else {
                    return super.getDimension(R.dimen.native_small_top_height);
                }
            case "ads_btn_2_height_bottom":
                if (!MyApp.getString(Const.ads_btn_2_height_bottom).equals("")) {
                    final float scale = getDisplayMetrics().density;
                    float pixels = Integer.parseInt(MyApp.getString(Const.ads_btn_2_height_bottom)) * scale + 0.5f;
                    return pixels;
                } else if (MyApp.getString(Const.ads_btn_bottom).equals("1")) {
                    return super.getDimension(R.dimen.native_small_height);
                } else {
                    return super.getDimension(R.dimen.native_small_top_height);
                }
            default:
                return super.getDimension(id);
        }

    }


    //    @Override
//    public int getInteger(int id) throws NotFoundException {
//
//        switch (getResourceEntryName(id)) {
//            case "ads_btn_height":
//                if (MyApp.getString(Const.ads_btn_height).equals("")) {
//                    return super.getInteger(id);
//                } else {
//                    return Float.parseFloat(MyApp.getString(Const.ads_btn_height));
//                }
//            case "ads_btn_border_height":
//                if (MyApp.getString(Const.ads_btn_border_height).equals("")) {
//                    return super.getInteger(id);
//                } else {
//                    return Float.parseFloat(MyApp.getString(Const.ads_btn_border_height));
//                }
//            case "ads_btn_radius":
//                if (MyApp.getString(Const.ads_btn_radius).equals("")) {
//                    return super.getInteger(id);
//                } else {
//                    return Float.parseFloat(MyApp.getString(Const.ads_btn_radius));
//                }
//            default:
//                return super.getInteger(id);
//        }
//
//    }

}