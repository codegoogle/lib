package com.lib.adssdk.Activity;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.lib.adssdk.Listner.OnAdsClickListner;
import com.lib.adssdk.MyApp;
import com.lib.adssdk.R;
import com.lib.adssdk.Utils.AppObserve;
import com.lib.adssdk.Utils.Const;
import com.lib.adssdk.Utils.CustomWebView;
import com.lib.adssdk.Utils.utils;

public class FragmentQurekaAppOpen extends Fragment {


    public static OnAdsClickListner onAdsClickListner = null;

    public static void setOnAdsClickListner(OnAdsClickListner monAdsClickListner) {
        onAdsClickListner = monAdsClickListner;
    }

    CustomWebView webView;
    RelativeLayout relative;
    CardView header;
    ImageView next;
    ImageView appOpenimageView;
    ProgressBar progressBar;
    ShimmerFrameLayout shimmer_view_container;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_qurek_app_open, container, false);


        relative = view.findViewById(R.id.relative);
        webView = view.findViewById(R.id.appOpenWebView);
        header = view.findViewById(R.id.header);
        progressBar = view.findViewById(R.id.progressbar);
        next = view.findViewById(R.id.next_button);
        appOpenimageView = view.findViewById(R.id.appOpenimageView);
        shimmer_view_container = view.findViewById(R.id.shimmer_view_container);


        shimmer_view_container.startShimmer();

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
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        shimmer_view_container.setVisibility(View.GONE);
                        webView.setVisibility(View.VISIBLE);
                    }
                }, 1000);
            }

        });

        if (MyApp.getString(Const.qureka_open_image_show).equals("true")) {
            shimmer_view_container.setVisibility(View.GONE);
            webView.setVisibility(View.GONE);
            appOpenimageView.setVisibility(View.VISIBLE);
            Glide.with(this).load(MyApp.getString(Const.qureka_open_image_url)).into(appOpenimageView);
        } else {
            shimmer_view_container.setVisibility(View.VISIBLE);
            appOpenimageView.setVisibility(View.GONE);
            webView.loadUrl(utils.get_Qureka_OpenAdsId());
        }

        int HANDLER = 3000;

        if (MyApp.getString(Const.qureka_open_timer).equals("")) {
            HANDLER = 3000;
        } else {
            HANDLER = Integer.parseInt(MyApp.getString(Const.qureka_open_timer));
        }

        click();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                progressBar.setVisibility(View.GONE);
                next.setVisibility(View.VISIBLE);
                header.setOnClickListener(new View.OnClickListener() {
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
            }
        }, HANDLER);

        return view;
    }


//    private class MyBrowser extends WebViewClient {
//        @Override
//        public boolean shouldOverrideUrlLoading(WebView view, String url) {
//            view.loadUrl(url);
//            return true;
//        }
//
//        @Override
//        public void onPageFinished(WebView view, String url) {
//            new Handler().postDelayed(new Runnable() {
//                @Override
//                public void run() {
//                    shimmer_view_container.setVisibility(View.GONE);
//                    webView.setVisibility(View.VISIBLE);
//                }
//            }, 1000);
//
//        }
//    }


    public void click() {
        appOpenimageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                utils.open_Url_Browser(getActivity(), utils.get_Qureka_OpenAdsId());
            }
        });
    }
}
