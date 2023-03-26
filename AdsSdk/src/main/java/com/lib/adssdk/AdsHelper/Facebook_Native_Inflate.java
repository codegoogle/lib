package com.lib.adssdk.AdsHelper;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.cardview.widget.CardView;

import com.facebook.ads.AdOptionsView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.NativeBannerAd;
import com.lib.adssdk.Animation.Techniques;
import com.lib.adssdk.Animation.YoYo;
import com.lib.adssdk.MyApp;
import com.lib.adssdk.R;
import com.lib.adssdk.Utils.Const;
import com.lib.adssdk.Utils.Res;
import com.lib.adssdk.Utils.utils;

import java.util.ArrayList;
import java.util.List;

public class Facebook_Native_Inflate {


    private static String TAG = "Facebook_Native_Inflate";
    private static Res res;
    private static Activity mactivity;


    private static Resources getResources() {
        if (res == null) {
            res = new Res(mactivity.getResources());
        }
        return res;
    }

    public static void inflate_native_big_card(Activity activity, ViewGroup viewGroup, NativeAd nativeAd, String nativeType, String direction) {
        mactivity = activity;

        viewGroup.setVisibility(View.VISIBLE);
        viewGroup.removeAllViews();
        LayoutInflater inflater = LayoutInflater.from(activity);

//        View view = null;
        Log.d(TAG, "inflate_native_big_card -> " + MyApp.getString(Const.ads_btn));
        if (MyApp.getString(Const.ads_btn).equals("1")) {
            Log.d(TAG, "ads_native_facebook_big_card ->");
            View view = (View) inflater.inflate(R.layout.ads_nativ_facebook_big_card, null);
            viewGroup.addView(view);


            CardView card = view.findViewById(R.id.card);
            TextView ad_headline = view.findViewById(R.id.native_ad_title);
            TextView ad_body = view.findViewById(R.id.native_ad_body);

            if (MyApp.getString(Const.ads_btn_1_background).equals("")) {
                card.setCardBackgroundColor(Color.parseColor("#00000000"));
                card.setCardElevation(0);
                card.setMaxCardElevation(0);
                if (MyApp.getString(Const.ads_btn_1_text).equals("")) {

                } else {
                    ad_headline.setTextColor(Color.parseColor(MyApp.getString(Const.ads_btn_1_text)));
                    ad_body.setTextColor(Color.parseColor(MyApp.getString(Const.ads_btn_1_text)));
                }
            } else {
                card.setCardBackgroundColor(Color.parseColor(MyApp.getString(Const.ads_btn_1_background)));
                ad_headline.setTextColor(Color.parseColor(MyApp.getString(Const.ads_btn_1_text)));
                ad_body.setTextColor(Color.parseColor(MyApp.getString(Const.ads_btn_1_text)));
            }

            //Set Text Theme
            TextView native_ad_call_to_action = view.findViewById(R.id.native_ad_call_to_action);
            if (!MyApp.getString(Const.ads_btn_text).equals("")) {
                native_ad_call_to_action.setText("" + MyApp.getString(Const.ads_btn_text));
            }
            if (!MyApp.getString(Const.ads_btn_color_text).equals("")) {
                native_ad_call_to_action.setTextColor(Color.parseColor(MyApp.getString(Const.ads_btn_color_text)));
            }

            CardView cardviewopanbtn = (CardView) view.findViewById(R.id.cardviewopanbtn);
            cardviewopanbtn.setCardBackgroundColor(getResources().getColor(R.color.ads_btn_color_start));
            cardviewopanbtn.setRadius(res.getDimension(R.dimen.ads_btn_radius));

            NativeAdLayout nativeAdLayout = view.findViewById(R.id.nativview);
            LinearLayout adChoicesContainer = view.findViewById(R.id.ad_choices_container);
            AdOptionsView adOptionsView = new AdOptionsView(activity, nativeAd, nativeAdLayout);
            adChoicesContainer.removeAllViews();
            adChoicesContainer.addView(adOptionsView, 0);

            MediaView nativeAdIcon = view.findViewById(R.id.native_ad_icon);
            TextView nativeAdTitle = view.findViewById(R.id.native_ad_title);
            MediaView nativeAdMedia = view.findViewById(R.id.native_ad_media);
            TextView nativeAdSocialContext = view.findViewById(R.id.native_ad_social_context);
            TextView nativeAdBody = view.findViewById(R.id.native_ad_body);
//            TextView sponsoredLabel = view.findViewById(R.id.native_ad_sponsored_label);
//            TextView nativeAdCallToAction = view.findViewById(R.id.native_ad_call_to_action);


            nativeAdTitle.setText(nativeAd.getAdvertiserName());
            nativeAdBody.setText(nativeAd.getAdBodyText());
            nativeAdSocialContext.setText(nativeAd.getAdSocialContext());

//            nativeAdCallToAction.setVisibility(nativeAd.hasCallToAction() ? View.VISIBLE : View.INVISIBLE);
//            nativeAdCallToAction.setText(nativeAd.getAdCallToAction());

            if (nativeAd.getAdCallToAction() == null) {
                native_ad_call_to_action.setVisibility(View.INVISIBLE);
            } else {
                native_ad_call_to_action.setVisibility(View.VISIBLE);
                if (MyApp.getString(Const.ads_btn_text).equals("")) {
                    native_ad_call_to_action.setText(nativeAd.getAdCallToAction());
                }
            }


//            sponsoredLabel.setText(nativeAd.getSponsoredTranslation());
            List<View> clickableViews = new ArrayList<>();
            clickableViews.add(nativeAdTitle);
            clickableViews.add(nativeAdBody);
            clickableViews.add(native_ad_call_to_action);
            clickableViews.add(nativeAdIcon);
            clickableViews.add(nativeAdSocialContext);

            if (nativeAd.getAdvertiserName() == null) {
                viewGroup.setVisibility(View.GONE);
            }

            nativeAd.registerViewForInteraction(view, nativeAdMedia, nativeAdIcon, clickableViews);


        } else {
            Log.d(TAG, "ads_nativ_facebook_big_card_custome ->");
            View view = (View) inflater.inflate(R.layout.ads_nativ_facebook_big_card_custome, null);
            viewGroup.addView(view);

            //Set Text Theme
            TextView native_ad_call_to_action = view.findViewById(R.id.ad_call_to_action);
            if (!MyApp.getString(Const.ads_btn_text).equals("")) {
                native_ad_call_to_action.setText("" + MyApp.getString(Const.ads_btn_text));
            }
            if (!MyApp.getString(Const.ads_btn_color_text).equals("")) {
                native_ad_call_to_action.setTextColor(Color.parseColor(MyApp.getString(Const.ads_btn_color_text)));
            }


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

            if (direction.equals(Const.BigBounceTop)) {
                if (MyApp.getString(Const.anim).equals("1")) {
                    YoYo.with(Techniques.FadeIn).duration(1000).repeat(6).playOn(cardviewopanbtn);
                } else if (MyApp.getString(Const.anim).equals("2")) {
                    YoYo.with(Techniques.Bounce).duration(1000).repeat(6).playOn(cardviewopanbtn);
                } else if (MyApp.getString(Const.anim).equals("3")) {
                    YoYo.with(Techniques.Shake).duration(1000).repeat(6).playOn(cardviewopanbtn);
                }
            }

            NativeAdLayout nativeAdLayout = view.findViewById(R.id.nativview);
            LinearLayout adChoicesContainer = view.findViewById(R.id.ad_choices_container);
            AdOptionsView adOptionsView = new AdOptionsView(activity, nativeAd, nativeAdLayout);
            adChoicesContainer.removeAllViews();
            adChoicesContainer.addView(adOptionsView, 0);


            MediaView nativeAdIcon = view.findViewById(R.id.native_ad_icon);
            TextView nativeAdTitle = view.findViewById(R.id.native_ad_title);
            MediaView nativeAdMedia = view.findViewById(R.id.native_ad_media);
            TextView nativeAdSocialContext = view.findViewById(R.id.native_ad_social_context);
            TextView nativeAdBody = view.findViewById(R.id.native_ad_body);
//            TextView sponsoredLabel = view.findViewById(R.id.native_ad_sponsored_label);
//            TextView nativeAdCallToAction = view.findViewById(R.id.native_ad_call_to_action);


            nativeAdTitle.setText(nativeAd.getAdvertiserName());
            nativeAdBody.setText(nativeAd.getAdBodyText());
            nativeAdSocialContext.setText(nativeAd.getAdSocialContext());

//            nativeAdCallToAction.setVisibility(nativeAd.hasCallToAction() ? View.VISIBLE : View.INVISIBLE);
//            nativeAdCallToAction.setText(nativeAd.getAdCallToAction());

            if (nativeAd.getAdCallToAction() == null) {
                native_ad_call_to_action.setVisibility(View.INVISIBLE);
            } else {
                native_ad_call_to_action.setVisibility(View.VISIBLE);
                if (MyApp.getString(Const.ads_btn_text).equals("")) {
                    native_ad_call_to_action.setText(nativeAd.getAdCallToAction());
                }
            }


//            sponsoredLabel.setText(nativeAd.getSponsoredTranslation());
            List<View> clickableViews = new ArrayList<>();
            clickableViews.add(nativeAdTitle);
            clickableViews.add(nativeAdBody);
            clickableViews.add(native_ad_call_to_action);
            clickableViews.add(nativeAdIcon);
            clickableViews.add(nativeAdSocialContext);

            if (nativeAd.getAdvertiserName() == null) {
                viewGroup.setVisibility(View.GONE);
            }

            nativeAd.registerViewForInteraction(view, nativeAdMedia, nativeAdIcon, clickableViews);


        }
    }

    public static void inflate_native_SmallTop(Activity activity, ViewGroup viewGroup, NativeAd nativeAd, String nativeType, String direction) {
        mactivity = activity;

        nativeAd.unregisterView();

        viewGroup.setVisibility(View.VISIBLE);
        viewGroup.removeAllViews();
        LayoutInflater inflater = LayoutInflater.from(activity);

        View view = (View) inflater.inflate(R.layout.ads_native_facebook_small_top, null);
        viewGroup.addView(view);

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

        NativeAdLayout nativeAdLayout = view.findViewById(R.id.nativview);
        LinearLayout adChoicesContainer = view.findViewById(R.id.ad_choices_container);

        AdOptionsView adOptionsView = new AdOptionsView(activity, nativeAd, nativeAdLayout);
        adChoicesContainer.removeAllViews();
        adChoicesContainer.addView(adOptionsView, 0);

        TextView nativeAdTitle = view.findViewById(R.id.native_ad_title);

        TextView nativeAdSocialContext = view.findViewById(R.id.native_ad_social_context);
        com.facebook.ads.MediaView nativeAdIconView = view.findViewById(R.id.native_icon_view);

//        nativeAdCallToAction.setVisibility(nativeBannerAd.hasCallToAction() ? View.VISIBLE : View.INVISIBLE);

        if (nativeAd.getAdCallToAction() == null) {
            ad_call_to_action.setVisibility(View.INVISIBLE);
        } else {
            ad_call_to_action.setVisibility(View.VISIBLE);
            if (MyApp.getString(Const.ads_btn_text).equals("")) {
                ad_call_to_action.setText(nativeAd.getAdCallToAction());
            }
        }


        nativeAdTitle.setText(nativeAd.getAdvertiserName());
        nativeAdSocialContext.setText(nativeAd.getAdBodyText());


        List<View> clickableViews = new ArrayList<>();
        clickableViews.add(nativeAdTitle);
        clickableViews.add(ad_call_to_action);
        clickableViews.add(nativeAdIconView);
        clickableViews.add(nativeAdSocialContext);

        if (nativeAd.getAdvertiserName() == null) {
            viewGroup.setVisibility(View.GONE);
        }

        nativeAd.registerViewForInteraction(view, nativeAdIconView, clickableViews);
    }

    public static void inflate_native_Small_Banner(Activity activity, ViewGroup viewGroup, NativeAd nativeAd, String nativeType, String direction) {

        mactivity = activity;


        viewGroup.setVisibility(View.VISIBLE);
        viewGroup.removeAllViews();
        LayoutInflater inflater = LayoutInflater.from(activity);

        View view = (View) inflater.inflate(R.layout.ads_native_facebook_banner, null);
        viewGroup.addView(view);

        CardView card = view.findViewById(R.id.card);
        TextView ad_headline = view.findViewById(R.id.native_ad_title);
        TextView ad_body = view.findViewById(R.id.native_ad_social_context);

        if (MyApp.getString(Const.ads_btn_1_background).equals("")) {
            card.setCardBackgroundColor(Color.parseColor("#00000000"));
            card.setCardElevation(0);
            card.setMaxCardElevation(0);
            if (MyApp.getString(Const.ads_btn_1_text).equals("")) {

            } else {
                ad_headline.setTextColor(Color.parseColor(MyApp.getString(Const.ads_btn_1_text)));
                ad_body.setTextColor(Color.parseColor(MyApp.getString(Const.ads_btn_1_text)));
            }
        } else {
            card.setCardBackgroundColor(Color.parseColor(MyApp.getString(Const.ads_btn_1_background)));
            ad_headline.setTextColor(Color.parseColor(MyApp.getString(Const.ads_btn_1_text)));
            ad_body.setTextColor(Color.parseColor(MyApp.getString(Const.ads_btn_1_text)));
        }


        //Set Text Theme
        TextView ad_call_to_action = view.findViewById(R.id.ad_call_to_action);
        utils.setAdsBtnText(ad_call_to_action);

        CardView cardviewopanbtn = (CardView) view.findViewById(R.id.cardviewopanbtn);
        cardviewopanbtn.setCardBackgroundColor(getResources().getColor(R.color.ads_btn_color_start));
        cardviewopanbtn.setRadius(res.getDimension(R.dimen.ads_btn_radius));


        NativeAdLayout nativeAdLayout = view.findViewById(R.id.nativview);
        LinearLayout adChoicesContainer = view.findViewById(R.id.ad_choices_container);

        AdOptionsView adOptionsView = new AdOptionsView(activity, nativeAd, nativeAdLayout);
        adChoicesContainer.removeAllViews();
        adChoicesContainer.addView(adOptionsView, 0);

        TextView nativeAdTitle = view.findViewById(R.id.native_ad_title);

        TextView nativeAdSocialContext = view.findViewById(R.id.native_ad_social_context);
        com.facebook.ads.MediaView nativeAdIconView = view.findViewById(R.id.native_icon_view);


//        nativeAdCallToAction.setVisibility(nativeBannerAd.hasCallToAction() ? View.VISIBLE : View.INVISIBLE);

        if (nativeAd.getAdCallToAction() == null) {
            ad_call_to_action.setVisibility(View.INVISIBLE);
        } else {
            ad_call_to_action.setVisibility(View.VISIBLE);
            if (MyApp.getString(Const.ads_btn_text).equals("")) {
                ad_call_to_action.setText(nativeAd.getAdCallToAction());
            }
        }


        nativeAdTitle.setText(nativeAd.getAdvertiserName());
        nativeAdSocialContext.setText(nativeAd.getAdBodyText());

        List<View> clickableViews = new ArrayList<>();
        clickableViews.add(nativeAdTitle);
        clickableViews.add(ad_call_to_action);
        clickableViews.add(nativeAdIconView);
        clickableViews.add(nativeAdSocialContext);

        if (nativeAd.getAdvertiserName() == null) {
            viewGroup.setVisibility(View.GONE);
        }

        nativeAd.registerViewForInteraction(view, nativeAdIconView, clickableViews);

    }


    public static void inflate_native_SmallBottom(Activity activity, ViewGroup viewGroup, NativeAd nativeAd, String nativeType, String direction) {
        mactivity = activity;

        nativeAd.unregisterView();


        viewGroup.setVisibility(View.VISIBLE);
        viewGroup.removeAllViews();
        LayoutInflater inflater = LayoutInflater.from(activity);

        View view = (View) inflater.inflate(R.layout.ads_native_facebook_small_bottom, null);
        viewGroup.addView(view);

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

        NativeAdLayout nativeAdLayout = view.findViewById(R.id.nativview);
        LinearLayout adChoicesContainer = view.findViewById(R.id.ad_choices_container);

        AdOptionsView adOptionsView = new AdOptionsView(activity, nativeAd, nativeAdLayout);
        adChoicesContainer.removeAllViews();
        adChoicesContainer.addView(adOptionsView, 0);

        TextView nativeAdTitle = view.findViewById(R.id.native_ad_title);

        TextView nativeAdSocialContext = view.findViewById(R.id.native_ad_social_context);
        com.facebook.ads.MediaView nativeAdIconView = view.findViewById(R.id.native_icon_view);

//        nativeAdCallToAction.setVisibility(nativeBannerAd.hasCallToAction() ? View.VISIBLE : View.INVISIBLE);

        if (nativeAd.getAdCallToAction() == null) {
            ad_call_to_action.setVisibility(View.INVISIBLE);
        } else {
            ad_call_to_action.setVisibility(View.VISIBLE);
            if (MyApp.getString(Const.ads_btn_text).equals("")) {
                ad_call_to_action.setText(nativeAd.getAdCallToAction());
            }
        }


        nativeAdTitle.setText(nativeAd.getAdvertiserName());
        nativeAdSocialContext.setText(nativeAd.getAdBodyText());


        List<View> clickableViews = new ArrayList<>();
        clickableViews.add(nativeAdTitle);
        clickableViews.add(ad_call_to_action);
        clickableViews.add(nativeAdIconView);
        clickableViews.add(nativeAdSocialContext);
        if (nativeAd.getAdvertiserName() == null) {
            viewGroup.setVisibility(View.GONE);
        }


        nativeAd.registerViewForInteraction(view, nativeAdIconView, clickableViews);
    }

    public static void inflate_native_banner(Activity activity, ViewGroup viewGroup, NativeBannerAd nativeBannerAd) {
        mactivity = activity;

        nativeBannerAd.unregisterView();

        viewGroup.setVisibility(View.VISIBLE);
        viewGroup.removeAllViews();
        LayoutInflater inflater = LayoutInflater.from(activity);

        View view = (View) inflater.inflate(R.layout.ads_native_facebook_banner, null);
        viewGroup.addView(view);

        //Set Text Theme
        TextView ad_call_to_action = view.findViewById(R.id.ad_call_to_action);
        utils.setAdsBtnText(ad_call_to_action);

        CardView cardviewopanbtn = (CardView) view.findViewById(R.id.cardviewopanbtn);
        cardviewopanbtn.setCardBackgroundColor(getResources().getColor(R.color.ads_btn_color_start));
        cardviewopanbtn.setRadius(res.getDimension(R.dimen.ads_btn_radius));


        NativeAdLayout nativeAdLayout = view.findViewById(R.id.nativview);
        LinearLayout adChoicesContainer = view.findViewById(R.id.ad_choices_container);

        AdOptionsView adOptionsView = new AdOptionsView(activity, nativeBannerAd, nativeAdLayout);
        adChoicesContainer.removeAllViews();
        adChoicesContainer.addView(adOptionsView, 0);

        TextView nativeAdTitle = view.findViewById(R.id.native_ad_title);

        TextView nativeAdSocialContext = view.findViewById(R.id.native_ad_social_context);
        com.facebook.ads.MediaView nativeAdIconView = view.findViewById(R.id.native_icon_view);


//        nativeAdCallToAction.setVisibility(nativeBannerAd.hasCallToAction() ? View.VISIBLE : View.INVISIBLE);

        if (nativeBannerAd.getAdCallToAction() == null) {
            ad_call_to_action.setVisibility(View.INVISIBLE);
        } else {
            ad_call_to_action.setVisibility(View.VISIBLE);
            if (MyApp.getString(Const.ads_btn_text).equals("")) {
                ad_call_to_action.setText(nativeBannerAd.getAdCallToAction());
            }
        }


        nativeAdTitle.setText(nativeBannerAd.getAdvertiserName());
        nativeAdSocialContext.setText(nativeBannerAd.getAdBodyText());

        List<View> clickableViews = new ArrayList<>();
        clickableViews.add(nativeAdTitle);
        clickableViews.add(ad_call_to_action);
        clickableViews.add(nativeAdIconView);
        clickableViews.add(nativeAdSocialContext);
        if (nativeBannerAd.getAdvertiserName() == null) {
            viewGroup.setVisibility(View.GONE);
        }
        nativeBannerAd.registerViewForInteraction(view, nativeAdIconView, clickableViews);
    }

}
