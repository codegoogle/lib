package com.google.play.AdsHelper;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.net.http.SslError;
import android.os.Build;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;

import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.cardview.widget.CardView;

import com.bumptech.glide.Glide;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.play.Animation.Techniques;
import com.google.play.Animation.YoYo;
import com.google.play.MyApp;
import com.google.ads.R;
import com.google.play.Utils.Const;
import com.google.play.Utils.CustomWebView;
import com.google.play.Utils.Res;
import com.google.play.Utils.utils;

public class Qureka_Native_Inflate {


    private static String TAG = "Qureka_Native_Inflate";
    private static Res res;
    private static Activity mactivity;


    public static int idQurekaNativeBigPos = 0;
    public static boolean isQurekaNativeBigFirstTime = true;

    public static String get_Qureka_NativeBigAdsId() {
        String[] adsIdsList = MyApp.getString(Const.qureka_native_big_image).split("\\|");
        if (adsIdsList.length == 0) {

        } else if (adsIdsList.length != 0) {

            if (!isQurekaNativeBigFirstTime) {
                if (adsIdsList.length - 1 == idQurekaNativeBigPos) {
                    idQurekaNativeBigPos = 0;
                    isQurekaNativeBigFirstTime = true;
                }
            }

            if (isQurekaNativeBigFirstTime) {
                isQurekaNativeBigFirstTime = false;
            } else {
                idQurekaNativeBigPos++;
            }

        }
        return adsIdsList[idQurekaNativeBigPos].trim();
    }

    public static int idQurekaNativeBanner = 0;
    public static boolean isQurekaNativeBannerFirstTime = true;

    public static String get_Qureka_NativeBannerAdsId() {
        String[] adsIdsList = MyApp.getString(Const.qureka_native_banner_image).split("\\|");
        if (adsIdsList.length == 0) {

        } else if (adsIdsList.length != 0) {

            if (!isQurekaNativeBannerFirstTime) {
                if (adsIdsList.length - 1 == idQurekaNativeBanner) {
                    idQurekaNativeBanner = 0;
                    isQurekaNativeBannerFirstTime = true;
                }
            }

            if (isQurekaNativeBannerFirstTime) {
                isQurekaNativeBannerFirstTime = false;
            } else {
                idQurekaNativeBanner++;
            }

        }
        return adsIdsList[idQurekaNativeBanner].trim();
    }

    public static int idQurekaNativeTop = 0;
    public static boolean isQurekaNativeTopFirstTime = true;

    public static String get_Qureka_NativeTopAdsId() {
        String[] adsIdsList = MyApp.getString(Const.qureka_native_small_top_image).split("\\|");
        if (adsIdsList.length == 0) {

        } else if (adsIdsList.length != 0) {

            if (!isQurekaNativeTopFirstTime) {
                if (adsIdsList.length - 1 == idQurekaNativeTop) {
                    idQurekaNativeTop = 0;
                    isQurekaNativeTopFirstTime = true;
                }
            }

            if (isQurekaNativeTopFirstTime) {
                isQurekaNativeTopFirstTime = false;
            } else {
                idQurekaNativeTop++;
            }

        }
        return adsIdsList[idQurekaNativeTop].trim();
    }

    public static int idQurekaNativeBottom = 0;
    public static boolean isQurekaNativeBottomFirstTime = true;

    public static String get_Qureka_NativeBottomAdsId() {
        String[] adsIdsList = MyApp.getString(Const.qureka_native_small_bottom_image).split("\\|");
        if (adsIdsList.length == 0) {

        } else if (adsIdsList.length != 0) {

            if (!isQurekaNativeBottomFirstTime) {
                if (adsIdsList.length - 1 == idQurekaNativeBottom) {
                    idQurekaNativeBottom = 0;
                    isQurekaNativeBottomFirstTime = true;
                }
            }

            if (isQurekaNativeBottomFirstTime) {
                isQurekaNativeBottomFirstTime = false;
            } else {
                idQurekaNativeBottom++;
            }

        }
        return adsIdsList[idQurekaNativeBottom].trim();
    }


    public static int idQurekaLink = 0;
    public static boolean isQurekaLinkFirstTime = true;

    public static String get_Qureka_LinkAdsId() {
        String[] adsIdsList = MyApp.getString(Const.qureka_link).split("\\|");
        if (adsIdsList.length == 0) {

        } else if (adsIdsList.length != 0) {

            if (!isQurekaLinkFirstTime) {
                if (adsIdsList.length - 1 == idQurekaLink) {
                    idQurekaLink = 0;
                    isQurekaLinkFirstTime = true;
                }
            }

            if (isQurekaLinkFirstTime) {
                isQurekaLinkFirstTime = false;
            } else {
                idQurekaLink++;
            }

        }
        return adsIdsList[idQurekaLink].trim();
    }


    private static void click(Activity activity) {
        utils.open_Url_Browser(activity, get_Qureka_LinkAdsId());
    }

    private static Resources getResources() {
        if (res == null) {
            res = new Res(mactivity.getResources());
        }
        return res;
    }

    public static void inflate_native_big_card(Activity activity, ViewGroup viewGroup, String nativeType, String direction) {
        mactivity = activity;

        LayoutInflater inflater = LayoutInflater.from(activity);

        View view = null;
        Log.d(TAG, "inflate_native_big_card -> " + MyApp.getString(Const.ads_btn));
        if (MyApp.getString(Const.ads_btn).equals("1")) {
            Log.d(TAG, "ads_nativ_admob_big_card ->");
            view = (View) inflater.inflate(R.layout.ads_nativ_qureka_big_card, null);

            CardView card = view.findViewById(R.id.card);
            if (MyApp.getString(Const.ads_btn_1_background).equals("")) {
                card.setCardBackgroundColor(Color.parseColor("#00000000"));
                card.setCardElevation(0);
                card.setMaxCardElevation(0);
            } else {
                card.setCardBackgroundColor(Color.parseColor(MyApp.getString(Const.ads_btn_1_background)));
            }

        } else {
            Log.d(TAG, "ads_nativ_admob_big_card_custome ->");
            view = (View) inflater.inflate(R.layout.ads_nativ_qureka_big_card_custome, null);
        }

        ImageView imageView = view.findViewById(R.id.imageView);

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

        Glide.with(activity).load(get_Qureka_NativeBigAdsId()).centerCrop().into(imageView);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                click(activity);
            }
        });

        cardviewopanbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                click(activity);
            }
        });

        viewGroup.removeAllViews();
        viewGroup.addView(view);

    }

    public static void inflate_native_banner(Activity activity, ViewGroup viewGroup) {


        LayoutInflater inflater = LayoutInflater.from(activity);
        View view = (View) inflater.inflate(R.layout.ads_nativ_qureka_banner, null);

        ImageView imageView = view.findViewById(R.id.imageView);
        Glide.with(activity).load(get_Qureka_NativeBannerAdsId()).centerCrop().into(imageView);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                click(activity);
            }
        });

        viewGroup.removeAllViews();
        viewGroup.addView(view);

    }

    public static void inflate_native_SmallTop(Activity activity, ViewGroup viewGroup, String nativeType, String direction) {
        mactivity = activity;

        viewGroup.setVisibility(View.VISIBLE);
        LayoutInflater inflater = LayoutInflater.from(activity);

        View view = (View) inflater.inflate(R.layout.ads_native_qureka_small_top, null);

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

        ImageView imageView = view.findViewById(R.id.imageView);
        Glide.with(activity).load(get_Qureka_NativeTopAdsId()).centerCrop().into(imageView);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                click(activity);
            }
        });

        cardviewopanbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                click(activity);
            }
        });

        viewGroup.removeAllViews();
        viewGroup.addView(view);
    }

    public static void inflate_native_Small_Banner(Activity activity, ViewGroup viewGroup, String nativeType, String direction) {
        mactivity = activity;

        viewGroup.setVisibility(View.VISIBLE);

        LayoutInflater inflater = LayoutInflater.from(activity);
        View view = (View) inflater.inflate(R.layout.ads_native_qureka_small_banner, null);

        CardView card = view.findViewById(R.id.card);
        if (MyApp.getString(Const.ads_btn_1_background).equals("")) {
            card.setCardBackgroundColor(Color.parseColor("#00000000"));
            card.setCardElevation(0);
            card.setMaxCardElevation(0);
        } else {
            card.setCardBackgroundColor(Color.parseColor(MyApp.getString(Const.ads_btn_1_background)));
        }

        ImageView imageView = view.findViewById(R.id.imageView);
        Glide.with(activity).load(get_Qureka_NativeTopAdsId()).centerCrop().into(imageView);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                click(activity);
            }
        });

        viewGroup.removeAllViews();
        viewGroup.addView(view);
    }

    public static void inflate_native_Small_Banner_Bottom(Activity activity, ViewGroup viewGroup, String nativeType, String direction) {
        mactivity = activity;

        viewGroup.setVisibility(View.VISIBLE);

        LayoutInflater inflater = LayoutInflater.from(activity);
        View view = (View) inflater.inflate(R.layout.ads_native_qureka_small_banner, null);

        CardView card = view.findViewById(R.id.card);
        if (MyApp.getString(Const.ads_btn_1_background).equals("")) {
            card.setCardBackgroundColor(Color.parseColor("#00000000"));
            card.setCardElevation(0);
            card.setMaxCardElevation(0);
        } else {
            card.setCardBackgroundColor(Color.parseColor(MyApp.getString(Const.ads_btn_1_background)));
        }

        ImageView imageView = view.findViewById(R.id.imageView);
        Glide.with(activity).load(get_Qureka_NativeBottomAdsId()).centerCrop().into(imageView);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                click(activity);
            }
        });

        viewGroup.removeAllViews();
        viewGroup.addView(view);
    }


    public static void inflate_native_SmallBottom(Activity activity, ViewGroup viewGroup, String nativeType, String direction) {
        mactivity = activity;

        viewGroup.setVisibility(View.VISIBLE);
        LayoutInflater inflater = LayoutInflater.from(activity);

        View view = (View) inflater.inflate(R.layout.ads_native_qureka_small_bottom, null);

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

        ImageView imageView = view.findViewById(R.id.imageView);
        Glide.with(activity).load(get_Qureka_NativeBottomAdsId()).centerCrop().into(imageView);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                click(activity);
            }
        });

        cardviewopanbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                click(activity);
            }
        });

        viewGroup.removeAllViews();
        viewGroup.addView(view);
    }


    public static void inflate_native_SmallTop_Webview(Activity activity, ViewGroup viewGroup, String nativeType, String direction) {
        mactivity = activity;

        viewGroup.setVisibility(View.VISIBLE);

        LayoutInflater inflater = LayoutInflater.from(activity);
        View view = (View) inflater.inflate(R.layout.ads_native_webview, null);

        ShimmerFrameLayout mShimmerViewContainer = view.findViewById(R.id.shimmer_view_container);
        mShimmerViewContainer.startShimmer();
        mShimmerViewContainer.setVisibility(View.VISIBLE);

        RelativeLayout webViewHeight = view.findViewById(R.id.webViewHeight);
        CustomWebView webView = view.findViewById(R.id.web_view);
        webViewHeight.getLayoutParams().height = (int) getResources().getDimension(R.dimen.ads_btn_2_height_top);

        String url = get_Qureka_LinkAdsId();


        utils.WebViewSetting(activity, webView);
        webView.setWebViewClient(new WebViewClient() { // from class: com.fastbrowser.webbrowser.appinternet.mainactivity.WebFragment.83
            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                webView.loadUrl(str);
                return true;
            }

            @Override // android.webkit.WebViewClient
            public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                mShimmerViewContainer.startShimmer();
                mShimmerViewContainer.setVisibility(View.VISIBLE);
                super.onPageStarted(webView, str, bitmap);
            }

            @Override
            public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
                final AlertDialog.Builder builder = new AlertDialog.Builder(activity);
                builder.setMessage(R.string.alert_http);
                builder.setPositiveButton(R.string.btn_continu, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        handler.proceed();
                    }
                });
                builder.setNegativeButton(R.string.btn_cancel, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        handler.cancel();
                    }
                });
                final AlertDialog dialog = builder.create();
                dialog.show();
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                mShimmerViewContainer.stopShimmer();
                mShimmerViewContainer.setVisibility(View.GONE);
//                super.onPageFinished(view, url);
            }

            //            @Override // android.webkit.WebViewClient
//            public void onPageFinished(WebView webView, String str) {
//                if (str.equals(url)) {
//                    mShimmerViewContainer.stopShimmer();
//                    mShimmerViewContainer.setVisibility(View.GONE);
//                    viewGroup.removeAllViews();
//                    viewGroup.addView(view);
//                }
//            }

        });
        webView.loadUrl(url);
        viewGroup.removeAllViews();
        viewGroup.addView(view);

    }

    public static void inflate_native_SmallBottom_Webview(Activity activity, ViewGroup viewGroup, String nativeType, String direction) {
        mactivity = activity;

        viewGroup.setVisibility(View.VISIBLE);

        LayoutInflater inflater = LayoutInflater.from(activity);
        View view = (View) inflater.inflate(R.layout.ads_native_webview, null);

        ShimmerFrameLayout mShimmerViewContainer = view.findViewById(R.id.shimmer_view_container);
        mShimmerViewContainer.startShimmer();
        mShimmerViewContainer.setVisibility(View.VISIBLE);

        RelativeLayout webViewHeight = view.findViewById(R.id.webViewHeight);
        CustomWebView webView = view.findViewById(R.id.web_view);
        webViewHeight.getLayoutParams().height = (int) getResources().getDimension(R.dimen.ads_btn_2_height_bottom);


        String url = get_Qureka_LinkAdsId();

        utils.WebViewSetting(activity, webView);
        webView.setWebViewClient(new WebViewClient() { // from class: com.fastbrowser.webbrowser.appinternet.mainactivity.WebFragment.83
            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                webView.loadUrl(str);
                return true;
            }

            @Override // android.webkit.WebViewClient
            public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                mShimmerViewContainer.startShimmer();
                mShimmerViewContainer.setVisibility(View.VISIBLE);
                super.onPageStarted(webView, str, bitmap);
            }

            @Override
            public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
                final AlertDialog.Builder builder = new AlertDialog.Builder(activity);
                builder.setMessage(R.string.alert_http);
                builder.setPositiveButton(R.string.btn_continu, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        handler.proceed();
                    }
                });
                builder.setNegativeButton(R.string.btn_cancel, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        handler.cancel();
                    }
                });
                final AlertDialog dialog = builder.create();
                dialog.show();
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                mShimmerViewContainer.stopShimmer();
                mShimmerViewContainer.setVisibility(View.GONE);
//                super.onPageFinished(view, url);
            }

            //            @Override // android.webkit.WebViewClient
//            public void onPageFinished(WebView webView, String str) {
//                if (str.equals(url)) {
//                    mShimmerViewContainer.stopShimmer();
//                    mShimmerViewContainer.setVisibility(View.GONE);
//                    viewGroup.removeAllViews();
//                    viewGroup.addView(view);
//                }
//            }

        });
        webView.loadUrl(url);
        viewGroup.removeAllViews();
        viewGroup.addView(view);

    }

}
