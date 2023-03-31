package com.google.play.Activity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

public class FragmentQurekaInterstitial_5 extends Fragment {


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

        qurekaIntModel = MyApp.getQurekaIntList().get(4);

        String qureka_int = get_Qureka_InterstitialAdsId(qurekaIntModel.getQureka_int());
        String qureka_open_image_url = get_Qureka_InterstitialAdsIdImg(qurekaIntModel.getQureka_open_image_url());


        button = view.findViewById(R.id.close);
        textView = view.findViewById(R.id.text);
        webView = view.findViewById(R.id.webviews);
        header = view.findViewById(R.id.header);
        progressbar = view.findViewById(R.id.progressbar);
        imageView = view.findViewById(R.id.imageView);


        if (qurekaIntModel.getQureka_int_image_show().equals("true")) {
            webView.setVisibility(View.GONE);
            imageView.setVisibility(View.VISIBLE);
            Glide.with(this).load(qureka_open_image_url).centerCrop().into(imageView);
            progressbar.setVisibility(View.GONE);
        } else {
            progressbar.setVisibility(View.GONE);
            imageView.setVisibility(View.GONE);
            webView.setVisibility(View.GONE);

            if (AppObserve.isShowingAd) {
                if (onAdsClickListner != null) {
                    onAdsClickListner.OnAdsClick();
                }
                QurekaActivity.isBackPress = false;
                getActivity().finish();
            } else {
                if (onAdsClickListner != null) {
                    onAdsClickListner.OnAdsClick();
                }
                QurekaActivity.isBackPress = false;
                getActivity().finish();
            }

            utils.ShowQrekaInterstitialAd(getActivity(), qureka_int);

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
