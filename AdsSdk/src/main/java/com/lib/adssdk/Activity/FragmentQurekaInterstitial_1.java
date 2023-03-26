package com.lib.adssdk.Activity;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
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
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.lib.adssdk.Listner.OnAdsClickListner;
import com.lib.adssdk.Model.QurekaIntModel;
import com.lib.adssdk.MyApp;
import com.lib.adssdk.R;
import com.lib.adssdk.Utils.AppObserve;
import com.lib.adssdk.Utils.Const;
import com.lib.adssdk.Utils.CustomWebView;
import com.lib.adssdk.Utils.utils;

import java.text.DecimalFormat;
import java.text.NumberFormat;


public class FragmentQurekaInterstitial_1 extends Fragment {


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

    ImageView imageView;
    int number = 0;
    RelativeLayout header;
    int DIALOGBOX_COUNTER = 3000;
    int COUNTER = 6000;

    public CustomWebView webView;
    private LottieAnimationView progressbar;
    private String URL;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_qurek_interstitial_demo, container, false);

        qurekaIntModel = MyApp.getQurekaIntList().get(0);

        String qureka_int = get_Qureka_InterstitialAdsId(qurekaIntModel.getQureka_int());
        String qureka_open_image_url = get_Qureka_InterstitialAdsIdImg(qurekaIntModel.getQureka_open_image_url());

        button = view.findViewById(R.id.close);
        textView = view.findViewById(R.id.text);
        webView = view.findViewById(R.id.webviews);
        header = view.findViewById(R.id.header);
        progressbar = view.findViewById(R.id.progressbar);
        imageView = view.findViewById(R.id.imageView);

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
                URL = str;
            }

        });


        if (qurekaIntModel.getQureka_int_image_show().equals("true")) {
            webView.setVisibility(View.GONE);
            imageView.setVisibility(View.VISIBLE);
            Glide.with(this).load(qureka_open_image_url).centerCrop().into(imageView);
            progressbar.setVisibility(View.GONE);
        } else {
            progressbar.setVisibility(View.VISIBLE);
            imageView.setVisibility(View.GONE);
            setWebView(qureka_int);
        }

        if (MyApp.getString(Const.qureka_int_timer).equals("")) {
            COUNTER = 6000;
        } else {
            COUNTER = Integer.parseInt(MyApp.getString(Const.qureka_int_timer));
        }

        BottomSheet();

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


    private void setWebView(String str) {
        if (str.contains("http") || str.contains("https")) {
            this.URL = str;
        } else {
            this.URL = "http://" + str;
        }
        this.webView.loadUrl(this.URL);
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

    private void BottomSheet() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                View view = getLayoutInflater().inflate(R.layout.bottom_sheet_layout, null);
                BottomSheetDialog dialog = new BottomSheetDialog(getActivity(), R.style.BottomSheetDialog);

                TextView cancel = view.findViewById(R.id.cancel);
                TextView dismiss = view.findViewById(R.id.dismiss);
                cancel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog.dismiss();
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

                dismiss.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog.dismiss();
                        dialog.cancel();
                        header.setVisibility(View.VISIBLE);
                        Count_timer();
                    }
                });


                dialog.setCanceledOnTouchOutside(false);
                dialog.setCancelable(false);
                dialog.setContentView(view);
                dialog.show();

            }
        }, DIALOGBOX_COUNTER);
    }

}
