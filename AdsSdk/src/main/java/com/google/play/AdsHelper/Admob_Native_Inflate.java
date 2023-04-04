package com.google.play.AdsHelper;

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
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.cardview.widget.CardView;

import com.google.android.gms.ads.formats.MediaView;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.ads.formats.UnifiedNativeAdView;
import com.google.play.Animation.Techniques;
import com.google.play.Animation.YoYo;
import com.google.play.MyApp;
import com.google.ads.R;
import com.google.play.Utils.Const;
import com.google.play.Utils.Res;
import com.google.play.Utils.utils;

public class Admob_Native_Inflate {


    private static String TAG = "Admob_Native_Inflate";
    private static Res res;
    private static Activity mactivity;


    private static Resources getResources() {
        if (res == null) {
            res = new Res(mactivity.getResources());
        }
        return res;
    }

    public static void inflate_native_big_card(Activity activity, ViewGroup viewGroup, UnifiedNativeAd nativeAd, String nativeType, String direction) {
        mactivity = activity;

        viewGroup.setVisibility(View.VISIBLE);
        viewGroup.removeAllViews();
        LayoutInflater inflater = LayoutInflater.from(activity);

        View view = null;
        Log.d(TAG, "inflate_native_big_card -> " + MyApp.getString(Const.ads_btn));
        if (MyApp.getString(Const.ads_btn).equals("1")) {
            Log.d(TAG, "ads_nativ_admob_big_card ->");
            view = (View) inflater.inflate(R.layout.ads_nativ_admob_big_card, null);

            CardView card = view.findViewById(R.id.card);
            TextView ad_headline = view.findViewById(R.id.ad_headline);
            TextView ad_body = view.findViewById(R.id.ad_body);

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

        } else {
            Log.d(TAG, "ads_nativ_admob_big_card_custome ->");
            view = (View) inflater.inflate(R.layout.ads_nativ_admob_big_card_custome, null);
        }


        viewGroup.addView(view);

        //Set Text Theme
        TextView ad_call_to_action = view.findViewById(R.id.ad_call_to_action);
        if (!MyApp.getString(Const.ads_btn_text).equals("")) {
            ad_call_to_action.setText("" + MyApp.getString(Const.ads_btn_text));
        }
        if (!MyApp.getString(Const.ads_btn_color_text).equals("")) {
            ad_call_to_action.setTextColor(Color.parseColor(MyApp.getString(Const.ads_btn_color_text)));
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

        UnifiedNativeAdView adView = (UnifiedNativeAdView) view.findViewById(R.id.uadview);
        adView.setMediaView((MediaView) adView.findViewById(R.id.ad_media));
        adView.setHeadlineView(adView.findViewById(R.id.ad_headline));
        adView.setBodyView(adView.findViewById(R.id.ad_body));
        adView.setCallToActionView(adView.findViewById(R.id.ad_call_to_action));
        adView.setIconView(adView.findViewById(R.id.ad_app_icon));

        ((TextView) adView.getHeadlineView()).setText(nativeAd.getHeadline());
        adView.getMediaView().setMediaContent(nativeAd.getMediaContent());

        if (nativeAd.getBody() == null) {
            adView.getBodyView().setVisibility(View.INVISIBLE);
        } else {
            adView.getBodyView().setVisibility(View.VISIBLE);
            ((TextView) adView.getBodyView()).setText(nativeAd.getBody());
        }

        if (nativeAd.getCallToAction() == null) {
            adView.getCallToActionView().setVisibility(View.INVISIBLE);
        } else {
            adView.getCallToActionView().setVisibility(View.VISIBLE);
            if (MyApp.getString(Const.ads_btn_text).equals("")) {
                ((TextView) adView.getCallToActionView()).setText(nativeAd.getCallToAction());
            }
        }

        if (nativeAd.getIcon() == null) {
            adView.getIconView().setVisibility(View.GONE);
        } else {
            ((ImageView) adView.getIconView()).setImageDrawable(nativeAd.getIcon().getDrawable());
            adView.getIconView().setVisibility(View.VISIBLE);
        }

        adView.setNativeAd(nativeAd);
    }

    public static void inflate_native_SmallTop(Activity activity, ViewGroup viewGroup, UnifiedNativeAd nativeAd, String nativeType, String direction) {
        mactivity = activity;

        viewGroup.setVisibility(View.VISIBLE);
        viewGroup.removeAllViews();
        LayoutInflater inflater = LayoutInflater.from(activity);

        View view = (View) inflater.inflate(R.layout.ads_native_admob_small_top, null);
        viewGroup.addView(view);


        //Set Text Theme
        TextView ad_call_to_action = view.findViewById(R.id.ad_call_to_action);
        if (!MyApp.getString(Const.ads_btn_text).equals("")) {
            ad_call_to_action.setText("" + MyApp.getString(Const.ads_btn_text));
        }
        if (!MyApp.getString(Const.ads_btn_color_text).equals("")) {
            ad_call_to_action.setTextColor(Color.parseColor(MyApp.getString(Const.ads_btn_color_text)));
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



        UnifiedNativeAdView adView = (UnifiedNativeAdView) view.findViewById(R.id.uadview);
        adView.setMediaView((MediaView) adView.findViewById(R.id.ad_media));
        adView.setHeadlineView(adView.findViewById(R.id.ad_headline));
        adView.setBodyView(adView.findViewById(R.id.ad_body));
        adView.setCallToActionView(adView.findViewById(R.id.ad_call_to_action));
        adView.setIconView(adView.findViewById(R.id.ad_app_icon));

        ((TextView) adView.getHeadlineView()).setText(nativeAd.getHeadline());
        adView.getMediaView().setMediaContent(nativeAd.getMediaContent());

        if (nativeAd.getBody() == null) {
            adView.getBodyView().setVisibility(View.INVISIBLE);
        } else {
            adView.getBodyView().setVisibility(View.VISIBLE);
            ((TextView) adView.getBodyView()).setText(nativeAd.getBody());
        }

        if (nativeAd.getCallToAction() == null) {
            adView.getCallToActionView().setVisibility(View.INVISIBLE);
        } else {
            adView.getCallToActionView().setVisibility(View.VISIBLE);
            if (MyApp.getString(Const.ads_btn_text).equals("")) {
                ((TextView) adView.getCallToActionView()).setText(nativeAd.getCallToAction());
            }
        }

        if (nativeAd.getIcon() == null) {
            adView.getIconView().setVisibility(View.GONE);
        } else {
            ((ImageView) adView.getIconView()).setImageDrawable(nativeAd.getIcon().getDrawable());
            adView.getIconView().setVisibility(View.VISIBLE);
        }

        adView.setNativeAd(nativeAd);
    }

    public static void inflate_native_Small_Banner(Activity activity, ViewGroup viewGroup, UnifiedNativeAd nativeAd, String nativeType, String direction) {
        mactivity = activity;

        viewGroup.setVisibility(View.VISIBLE);
        LayoutInflater inflater = LayoutInflater.from(activity);
        View view = (View) inflater.inflate(R.layout.ads_native_admob_small_banner, null);
        viewGroup.removeAllViews();
        viewGroup.addView(view);

        CardView cardviewopanbtn = (CardView) view.findViewById(R.id.cardviewopanbtn);
        cardviewopanbtn.setCardBackgroundColor(getResources().getColor(R.color.ads_btn_color_start));
        cardviewopanbtn.setRadius(res.getDimension(R.dimen.ads_btn_radius));

        CardView card = view.findViewById(R.id.card);
        TextView ad_headline = view.findViewById(R.id.ad_headline);
        TextView ad_body = view.findViewById(R.id.ad_body);

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


        TextView ad_call_to_action = view.findViewById(R.id.ad_call_to_action);
        utils.setAdsBtnText(ad_call_to_action);

        UnifiedNativeAdView adView = (UnifiedNativeAdView) view.findViewById(R.id.uadview);
        adView.setHeadlineView(adView.findViewById(R.id.ad_headline));
        adView.setBodyView(adView.findViewById(R.id.ad_body));
        adView.setCallToActionView(adView.findViewById(R.id.ad_call_to_action));
        adView.setIconView(adView.findViewById(R.id.ad_app_icon));
        adView.setPriceView(adView.findViewById(R.id.ad_price));
        adView.setStarRatingView(adView.findViewById(R.id.ad_stars));
        adView.setStoreView(adView.findViewById(R.id.ad_store));
        adView.setAdvertiserView(adView.findViewById(R.id.ad_advertiser));

        ((TextView) adView.getHeadlineView()).setText(nativeAd.getHeadline());

        if (nativeAd.getBody() == null) {
            adView.getBodyView().setVisibility(View.INVISIBLE);
        } else {
            adView.getBodyView().setVisibility(View.VISIBLE);
            ((TextView) adView.getBodyView()).setText(nativeAd.getBody());
        }

        if (nativeAd.getCallToAction() == null) {
            adView.getCallToActionView().setVisibility(View.INVISIBLE);
        } else {
            adView.getCallToActionView().setVisibility(View.VISIBLE);
            if (MyApp.getString(Const.ads_btn_text).equals("")) {
                ((TextView) adView.getCallToActionView()).setText(nativeAd.getCallToAction());
            }
        }

        if (nativeAd.getIcon() == null) {
            adView.getIconView().setVisibility(View.GONE);
        } else {
            ((ImageView) adView.getIconView()).setImageDrawable(
                    nativeAd.getIcon().getDrawable());
            adView.getIconView().setVisibility(View.VISIBLE);
        }

        if (nativeAd.getStarRating() == null) {
            adView.getStarRatingView().setVisibility(View.INVISIBLE);

        } else {
            ((RatingBar) adView.getStarRatingView())
                    .setRating(nativeAd.getStarRating().floatValue());
            adView.getStarRatingView().setVisibility(View.VISIBLE);
        }

        if (nativeAd.getAdvertiser() == null) {
            adView.getAdvertiserView().setVisibility(View.INVISIBLE);
        } else {
            ((TextView) adView.getAdvertiserView()).setText(nativeAd.getAdvertiser());
            adView.getAdvertiserView().setVisibility(View.VISIBLE);
        }
        adView.setNativeAd(nativeAd);

    }

    public static void inflate_native_SmallBottom(Activity activity, ViewGroup viewGroup, UnifiedNativeAd nativeAd, String nativeType, String direction) {
        mactivity = activity;

        viewGroup.setVisibility(View.VISIBLE);
        viewGroup.removeAllViews();
        LayoutInflater inflater = LayoutInflater.from(activity);

        View view = (View) inflater.inflate(R.layout.ads_native_admob_small_bottom, null);
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


        UnifiedNativeAdView adView = (UnifiedNativeAdView) view.findViewById(R.id.uadview);
        adView.setMediaView((MediaView) adView.findViewById(R.id.ad_media));
        adView.setHeadlineView(adView.findViewById(R.id.ad_headline));
        adView.setBodyView(adView.findViewById(R.id.ad_body));
        adView.setCallToActionView(adView.findViewById(R.id.ad_call_to_action));
        adView.setIconView(adView.findViewById(R.id.ad_app_icon));

        ((TextView) adView.getHeadlineView()).setText(nativeAd.getHeadline());
        adView.getMediaView().setMediaContent(nativeAd.getMediaContent());

        if (nativeAd.getBody() == null) {
            adView.getBodyView().setVisibility(View.INVISIBLE);
        } else {
            adView.getBodyView().setVisibility(View.VISIBLE);
            ((TextView) adView.getBodyView()).setText(nativeAd.getBody());
        }

        if (nativeAd.getCallToAction() == null) {
            adView.getCallToActionView().setVisibility(View.INVISIBLE);
        } else {
            adView.getCallToActionView().setVisibility(View.VISIBLE);
            if (MyApp.getString(Const.ads_btn_text).equals("")) {
                ((TextView) adView.getCallToActionView()).setText(nativeAd.getCallToAction());
            }
        }

        if (nativeAd.getIcon() == null) {
            adView.getIconView().setVisibility(View.GONE);
        } else {
            ((ImageView) adView.getIconView()).setImageDrawable(nativeAd.getIcon().getDrawable());
            adView.getIconView().setVisibility(View.VISIBLE);
        }

        adView.setNativeAd(nativeAd);
    }
}
