package com.google.play.Utils;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.anythink.nativead.api.ATNativeAdRenderer;
import com.anythink.nativead.api.ATNativeImageView;
import com.anythink.nativead.unitgroup.api.CustomNativeAd;
import com.google.play.MyApp;
import com.google.ads.R;

import java.util.ArrayList;
import java.util.List;


public class ToponNativeSmallBottom implements ATNativeAdRenderer<CustomNativeAd> {
    List<View> mClickView = new ArrayList();
    View mCloseView;
    Context mContext;
    View mDevelopView;
    int mNetworkFirmId;
    private Activity mactivity;
    private static Res res;
    private String direction;


    private Resources getResources() {
        if (res == null) {
            res = new Res(mactivity.getResources());
        }
        return res;
    }

    public ToponNativeSmallBottom(Activity context, String mdirection) {
        this.mContext = context;
        this.mactivity = context;
        this.direction = mdirection;
    }

    @Override
    public View createView(Context context, int i) {
        if (this.mDevelopView == null) {
            this.mDevelopView = LayoutInflater.from(context).inflate(R.layout.ads_native_topon_small_bottom, (ViewGroup) null);
        }
        this.mNetworkFirmId = i;
        if (this.mDevelopView.getParent() != null) {
            ((ViewGroup) this.mDevelopView.getParent()).removeView(this.mDevelopView);
        }
        return this.mDevelopView;
    }

    @Override
    public void renderAdView(View view, CustomNativeAd customNativeAd) {
        this.mClickView.clear();

        TextView textView = (TextView) view.findViewById(R.id.native_ad_title);
        TextView textView2 = (TextView) view.findViewById(R.id.native_ad_desc);
        TextView textView4 = (TextView) view.findViewById(R.id.native_ad_from);
//        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.native_ad_content_image_area);
        FrameLayout frameLayout2 = (FrameLayout) view.findViewById(R.id.native_ad_image);


        //Set Text Theme
        TextView ad_call_to_action = view.findViewById(R.id.ad_call_to_action);
        utils.setAdsBtnText(ad_call_to_action);

        //Set Btn Theme
        RelativeLayout cardviewopanbtn = view.findViewById(R.id.cardviewopanbtn);
        cardviewopanbtn.getLayoutParams().height = (int) getResources().getDimension(R.dimen.ads_btn_height);

        LayerDrawable layerDrawable = (LayerDrawable) cardviewopanbtn.getBackground();

        GradientDrawable borderNew = new GradientDrawable(utils.getBtnAdsAngelGradiant(MyApp.getString(Const.ads_btn_color_gradiant_border_angle)), new int[]{getResources().getColor(R.color.ads_btn_color_border_start), getResources().getColor(R.color.ads_btn_color_border_end)});
        borderNew.setCornerRadius(res.getDimension(R.dimen.ads_btn_radius));

        GradientDrawable btnNew = new GradientDrawable(utils.getBtnAdsAngelGradiant(MyApp.getString(Const.ads_btn_color_gradiant_angle)), new int[]{getResources().getColor(R.color.ads_btn_color_start), getResources().getColor(R.color.ads_btn_color_end)});
        btnNew.setCornerRadius(res.getDimension(R.dimen.ads_btn_radius));

        InsetDrawable btnLayer = new InsetDrawable(btnNew, (int) res.getDimension(R.dimen.ads_btn_border_height), (int) res.getDimension(R.dimen.ads_btn_border_height), (int) res.getDimension(R.dimen.ads_btn_border_height), (int) res.getDimension(R.dimen.ads_btn_border_height));

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            layerDrawable.setDrawable(0, borderNew);
            layerDrawable.setDrawable(1, btnLayer);
        }


        ATNativeImageView aTNativeImageView = (ATNativeImageView) view.findViewById(R.id.native_ad_logo);
        customNativeAd.setExtraInfo(new CustomNativeAd.ExtraInfo.Builder().setCloseView(this.mCloseView).build());

        String str = "";
        textView.setText(str);
        textView2.setText(str);
        ad_call_to_action.setText(str);
        textView4.setText(str);
        textView.setText(str);

//        frameLayout.removeAllViews();
        frameLayout2.removeAllViews();
        aTNativeImageView.setImageDrawable(null);
//        View adMediaView = customNativeAd.getAdMediaView(frameLayout, Integer.valueOf(frameLayout.getWidth()));
        String adType = customNativeAd.getAdType();
        adType.hashCode();

        String str2 = !adType.equals("1") ? !adType.equals("2") ? "0" : "Image" : "Video";
        Log.i("NativeDemoRender", "Ad type:" + str2);

        if (customNativeAd.isNativeExpress()) {
            textView.setVisibility(View.GONE);
            textView2.setVisibility(View.GONE);
            ad_call_to_action.setVisibility(View.GONE);
            aTNativeImageView.setVisibility(View.GONE);
            frameLayout2.setVisibility(View.GONE);
            View view2 = this.mCloseView;
            if (view2 != null) {
                view2.setVisibility(View.GONE);
            }
//            if (adMediaView.getParent() != null) {
//                ((ViewGroup) adMediaView.getParent()).removeView(adMediaView);
//            }
//            frameLayout.addView(adMediaView, new FrameLayout.LayoutParams(-1, -2));
            return;
        }

        textView.setVisibility(View.VISIBLE);
        textView2.setVisibility(View.VISIBLE);
        ad_call_to_action.setVisibility(View.VISIBLE);
        aTNativeImageView.setVisibility(View.VISIBLE);
        frameLayout2.setVisibility(View.VISIBLE);
        View view3 = this.mCloseView;
        if (view3 != null) {
            view3.setVisibility(View.VISIBLE);
        }
        View adIconView = customNativeAd.getAdIconView();
        ATNativeImageView aTNativeImageView2 = new ATNativeImageView(this.mContext);
        if (adIconView == null) {
            frameLayout2.addView(aTNativeImageView2);
            aTNativeImageView2.setImage(customNativeAd.getIconImageUrl());
            this.mClickView.add(aTNativeImageView2);
        } else {
            frameLayout2.addView(adIconView);
        }
        if (!TextUtils.isEmpty(customNativeAd.getAdChoiceIconUrl())) {
            aTNativeImageView.setImage(customNativeAd.getAdChoiceIconUrl());
        }
//        if (adMediaView != null) {
//            if (adMediaView.getParent() != null) {
//                ((ViewGroup) adMediaView.getParent()).removeView(adMediaView);
//            }
//            frameLayout.addView(adMediaView, new FrameLayout.LayoutParams(-1, -1));
//        } else {
//            ATNativeImageView aTNativeImageView3 = new ATNativeImageView(this.mContext);
//            aTNativeImageView3.setImage(customNativeAd.getMainImageUrl());
//            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
//            aTNativeImageView3.setLayoutParams(layoutParams);
//            frameLayout.addView(aTNativeImageView3, layoutParams);
//            this.mClickView.add(aTNativeImageView3);
//        }

        textView.setText(customNativeAd.getTitle());
        textView2.setText(customNativeAd.getDescriptionText());

        if (MyApp.getString(Const.ads_btn_text).equals("")) {
            ad_call_to_action.setText(customNativeAd.getCallToActionText());
        }

        if (!TextUtils.isEmpty(customNativeAd.getAdFrom())) {
            if (customNativeAd.getAdFrom() != null) {
                str = customNativeAd.getAdFrom();
            }
            textView4.setText(str);
            textView4.setVisibility(View.VISIBLE);
        } else {
            textView4.setVisibility(View.GONE);
        }

        this.mClickView.add(textView);
        this.mClickView.add(textView2);
        this.mClickView.add(ad_call_to_action);
    }

    public List<View> getClickView() {
        return this.mClickView;
    }

    public void setCloseView(ImageView imageView) {
        this.mCloseView = imageView;
    }
}
