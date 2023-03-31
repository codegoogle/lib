package com.google.play.Activity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.airbnb.lottie.LottieAnimationView;
import com.bumptech.glide.Glide;
import com.google.play.Listner.OnAdsClickListner;
import com.google.play.Model.QurekaIntModel;
import com.google.play.MyApp;
import com.google.ads.R;
import com.google.play.Utils.AppObserve;
import com.google.play.Utils.Const;
import com.google.play.Utils.CustomWebView;
import com.google.play.Utils.utils;

import java.text.DecimalFormat;
import java.text.NumberFormat;


public class FragmentQurekaInterstitial_4 extends Fragment {


    public static OnAdsClickListner onAdsClickListner = null;

    public static void setOnAdsClickListner(OnAdsClickListner monAdsClickListner) {
        onAdsClickListner = monAdsClickListner;
    }

    private static int idQurekaInterstitialPos1 = 0;
    private static boolean isQurekaInterstitialFirstTime1 = true;

    private static String get_Qureka_InterstitialAdsId(String strLinks) {
        String[] adsIdsList = strLinks.split("\\|");
        if (adsIdsList.length == 0) {

        } else if (adsIdsList.length != 0) {

            if (!isQurekaInterstitialFirstTime1) {
                if (adsIdsList.length - 1 == idQurekaInterstitialPos1) {
                    idQurekaInterstitialPos1 = 0;
                    isQurekaInterstitialFirstTime1 = true;
                }
            }

            if (isQurekaInterstitialFirstTime1) {
                isQurekaInterstitialFirstTime1 = false;
            } else {
                idQurekaInterstitialPos1++;
            }

        }
        return adsIdsList[idQurekaInterstitialPos1].trim();
    }

    private static int idQurekaInterstitialPosImg1 = 0;
    private static boolean isQurekaInterstitialFirstTimeImg1 = true;

    private static String get_Qureka_InterstitialAdsIdImg(String strLinks) {
        String[] adsIdsList = strLinks.split("\\|");
        if (adsIdsList.length == 0) {

        } else if (adsIdsList.length != 0) {

            if (!isQurekaInterstitialFirstTimeImg1) {
                if (adsIdsList.length - 1 == idQurekaInterstitialPosImg1) {
                    idQurekaInterstitialPosImg1 = 0;
                    isQurekaInterstitialFirstTimeImg1 = true;
                }
            }

            if (isQurekaInterstitialFirstTimeImg1) {
                isQurekaInterstitialFirstTimeImg1 = false;
            } else {
                idQurekaInterstitialPosImg1++;
            }

        }
        return adsIdsList[idQurekaInterstitialPosImg1].trim();
    }


    private QurekaIntModel qurekaIntModel;


    CardView button;
    TextView textView;
    CustomWebView webView;
    ImageView imageView;
    int number = 0;
    RelativeLayout header;
    LottieAnimationView progressbar;
    int DIALOGBOX_COUNTER = 3000;
    int COUNTER = 6000;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_qurek_interstitial_1, container, false);

        qurekaIntModel = MyApp.getQurekaIntList().get(3);

        String qureka_int = get_Qureka_InterstitialAdsId(qurekaIntModel.getQureka_int());
        String qureka_open_image_url = get_Qureka_InterstitialAdsIdImg(qurekaIntModel.getQureka_open_image_url());


        button = view.findViewById(R.id.close);
        textView = view.findViewById(R.id.text);
        webView = view.findViewById(R.id.webviews);
        header = view.findViewById(R.id.header);
        progressbar = view.findViewById(R.id.progressbar);
        imageView = view.findViewById(R.id.imageView);

//        utils.WebViewSetting(webView);
//        webView.setWebViewClient(new MyBrowser());

        utils.WebViewSetting(getActivity(), webView);
        this.webView.setWebViewClient(new WebViewClient() { // from class: com.fastbrowser.webbrowser.appinternet.mainactivity.WebFragment.83
            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                webView.loadUrl(str);
                return true;
            }

            @Override // android.webkit.WebViewClient
            public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                super.onPageStarted(webView, str, bitmap);
                progressbar.setVisibility(View.VISIBLE);
            }

            @Override
            public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
                final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
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

            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                progressbar.setVisibility(View.GONE);
                webView.setVisibility(View.VISIBLE);
            }

        });

        if (qurekaIntModel.getQureka_int_image_show().equals("true")) {
            webView.setVisibility(View.GONE);
            imageView.setVisibility(View.VISIBLE);
            Glide.with(this).load(qureka_open_image_url).centerCrop().into(imageView);
            progressbar.setVisibility(View.GONE);
        } else {
            progressbar.playAnimation();
            progressbar.setVisibility(View.VISIBLE);
            imageView.setVisibility(View.GONE);
            webView.setVisibility(View.GONE);
            webView.loadUrl(qureka_int);
        }

        header.setVisibility(View.VISIBLE);

        if (MyApp.getString(Const.qureka_int_timer).equals("")) {
            COUNTER = 6000;
        } else {
            COUNTER = Integer.parseInt(MyApp.getString(Const.qureka_int_timer));
        }

        Count_timer();


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (AppObserve.isShowingAd) {
                    if (onAdsClickListner != null) {
                        onAdsClickListner.OnAdsClick();
                    }
                    QurekaActivity.isBackPress = true;
                    getActivity().onBackPressed();
                } else {
                    if (onAdsClickListner != null) {
                        onAdsClickListner.OnAdsClick();
                    }
                    QurekaActivity.isBackPress = false;
                    getActivity().finish();
                }
            }
        });


        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                utils.open_Url_Browser(getActivity(), qureka_int);
            }
        });


        return view;
    }


    private class MyBrowser extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }

        @Override
        public void onPageFinished(WebView view, String url) {
            progressbar.setVisibility(View.GONE);
            webView.setVisibility(View.VISIBLE);
        }
    }

    private void Count_timer() {
        new CountDownTimer(COUNTER, 1000) {
            public void onTick(long millisUntilFinished) {
                NumberFormat f = new DecimalFormat("0");
                long sec = (millisUntilFinished / 1000) % 60;
                textView.setText(f.format(sec));
            }

            public void onFinish() {
                textView.setText("0");
                button.setVisibility(View.VISIBLE);
            }
        }.start();

    }


}
