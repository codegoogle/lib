package com.google.play.Utils;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.DownloadManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.DownloadListener;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.TextView;

import androidx.browser.customtabs.CustomTabsIntent;
import androidx.fragment.app.FragmentActivity;

import com.google.play.AdsHelper.Admob_AppOpen;
import com.google.play.AdsHelper.Admob_Interstitial;
import com.google.play.AdsHelper.Admob_Native;
import com.google.play.AdsHelper.Admob_Rewarded;
import com.google.play.AdsHelper.Facebook_Interstitial;
import com.google.play.AdsHelper.Facebook_Native;
import com.google.play.AdsHelper.Facebook_Rewarded;
import com.google.play.AdsHelper.IronSource_Interstitial;
import com.google.play.AdsHelper.IronSource_Native;
import com.google.play.AdsHelper.IronSource_Rewarded;
import com.google.play.AdsHelper.Sdk_AppOpen;
import com.google.play.AdsHelper.Sdk_Interstitial;
import com.google.play.AdsHelper.Sdk_Rewarded;
import com.google.play.AdsHelper.Topon_Interstitial;
import com.google.play.AdsHelper.Topon_Native;
import com.google.play.AdsHelper.Topon_Rewarded;
import com.google.play.MyApp;
import com.google.ads.R;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class utils {


    public static void ShowQrekaInterstitialAd(final Context context, String url) {
        try {
            CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                builder.setToolbarColor(context.getColor(R.color.colorPrimary_lib));
            }

            CustomTabsIntent customTabsIntent = builder.build();
            customTabsIntent.intent.setPackage("com.android.chrome");
            customTabsIntent.launchUrl(context, Uri.parse(url));
        } catch (Exception e) {
            Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            context.startActivity(myIntent);
            e.printStackTrace();
        }

    }


    public static void WebViewSetting(WebView webView) {
        webView.clearCache(true);
        webView.clearHistory();
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setSupportMultipleWindows(true);
        webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
    }


    private static final String USER_AGENT = "Mozilla/5.0 (Linux; Android 10; Redmi Note 7 Pro) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/87.0.4280.141 Mobile Safari/537.36";

    public static void WebViewSetting(Activity activity, CustomWebView webView) {

        deleteCache(activity);
        freeMemory();
        CookieSyncManager.createInstance(activity);
        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.removeAllCookie();

        WebStorage.getInstance().deleteAllData();
        webView.getSettings().setSaveFormData(false);
        activity.deleteDatabase("webview.db");
        activity.deleteDatabase("webviewCache.db");
        CookieManager.getInstance().removeAllCookies(null);
        CookieManager.getInstance().flush();
        webView.clearCache(true);
        webView.clearFormData();
        webView.clearHistory();
        webView.clearSslPreferences();
        CookieManager.getInstance().removeAllCookie();

        CookieManager.getInstance().setAcceptCookie(true);

//        downloadManager(activity, webView);

//        webView.setWebChromeClient(new MyWebChromeClient(activity));


        WebSettings settings = webView.getSettings();
        settings.setGeolocationEnabled(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setGeolocationEnabled(true);
        settings.setDatabaseEnabled(true);
        webView.getSettings().setSupportMultipleWindows(true);
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setUserAgentString(USER_AGENT);
        settings.setJavaScriptEnabled(true);
        settings.setLoadWithOverviewMode(true);
        settings.setDomStorageEnabled(true);
        settings.setAllowContentAccess(true);
        settings.setAllowFileAccess(true);
        settings.setLoadsImagesAutomatically(true);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
        settings.setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
//        settings.setAppCacheEnabled(true);
        webView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
        settings.setUseWideViewPort(true);
        settings.setSavePassword(true);
        settings.setSaveFormData(true);
        settings.setEnableSmoothTransition(true);
    }


    public static void deleteCache(Context context) {
        try {
            File dir = context.getCacheDir();
            deleteDir(dir);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean deleteDir(File dir) {
        if (dir != null && dir.isDirectory()) {
            String[] children = dir.list();
            for (int i = 0; i < children.length; i++) {
                boolean success = deleteDir(new File(dir, children[i]));
                if (!success) {
                    return false;
                }
            }
            return dir.delete();
        } else if (dir != null && dir.isFile()) {
            return dir.delete();
        } else {
            return false;
        }
    }

    public static void freeMemory() {
        System.runFinalization();
        Runtime.getRuntime().gc();
        System.gc();
    }

    public static void downloadManager(Activity activity, CustomWebView webView) {
        webView.setDownloadListener(new DownloadListener() {
            @Override
            public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
                request.setMimeType(str4);
                request.addRequestHeader("cookie", CookieManager.getInstance().getCookie(str));
                request.addRequestHeader("User-Agent", str2);
                request.setDescription("Downloading file...");
                request.setTitle(URLUtil.guessFileName(str, str3, str4));
                request.allowScanningByMediaScanner();
                request.setNotificationVisibility(1);
                request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, URLUtil.guessFileName(str, str3, str4));
//                ((DownloadManager) activity.getSystemService(Context.DOWNLOAD_SERVICE)).enqueue(request);
            }
        });
    }

    public static class MyWebChromeClient extends WebChromeClient {
        private View mCustomView;
        private CustomViewCallback mCustomViewCallback;
        protected FrameLayout mFullscreenContainer;
        private int mOriginalOrientation;
        private int mOriginalSystemUiVisibility;
        private Activity activity;

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i) {
        }

        public MyWebChromeClient(Activity activity) {
            this.activity = activity;
        }

        @SuppressLint("UseRequireInsteadOfGet")
        @Override // android.webkit.WebChromeClient
        public Bitmap getDefaultVideoPoster() {
            if (this.mCustomView == null) {
                return null;
            }
            return BitmapFactory.decodeResource(((Context) Objects.requireNonNull(activity)).getResources(), 2130837573);
        }

        @SuppressLint("UseRequireInsteadOfGet")
        @Override // android.webkit.WebChromeClient
        public void onHideCustomView() {
            ((FrameLayout) ((FragmentActivity) Objects.requireNonNull(activity)).getWindow().getDecorView()).removeView(this.mCustomView);
            this.mCustomView = null;
            activity.getWindow().getDecorView().setSystemUiVisibility(this.mOriginalSystemUiVisibility);
            activity.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
            this.mOriginalOrientation = activity.getRequestedOrientation();
            this.mCustomViewCallback.onCustomViewHidden();
            this.mCustomViewCallback = null;
        }

        @SuppressLint("UseRequireInsteadOfGet")
        @Override // android.webkit.WebChromeClient
        public void onShowCustomView(View view, CustomViewCallback customViewCallback) {
            if (this.mCustomView != null) {
                onHideCustomView();
                return;
            }
            this.mCustomView = view;
            this.mOriginalSystemUiVisibility = ((FragmentActivity) Objects.requireNonNull(activity)).getWindow().getDecorView().getSystemUiVisibility();
            this.mOriginalOrientation = activity.getRequestedOrientation();
            activity.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
            this.mCustomViewCallback = customViewCallback;
            ((FrameLayout) activity.getWindow().getDecorView()).addView(this.mCustomView, new FrameLayout.LayoutParams(-1, -1));
            activity.getWindow().getDecorView().setSystemUiVisibility(3846);
        }

        @Override // android.webkit.WebChromeClient
        public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, FileChooserParams fileChooserParams) {
            try {
                activity.startActivityForResult(fileChooserParams.createIntent(), 100);
                return true;
            } catch (ActivityNotFoundException unused) {
                return false;
            }
        }

    }


    public static GradientDrawable.Orientation getBtnAdsAngelGradiant(String direction) {
        switch (direction) {
            case "TOP_BOTTOM":
                return GradientDrawable.Orientation.TOP_BOTTOM;
            case "RIGHT_LEFT":
                return GradientDrawable.Orientation.RIGHT_LEFT;
            case "BOTTOM_TOP":
                return GradientDrawable.Orientation.BOTTOM_TOP;
            case "LEFT_RIGHT":
                return GradientDrawable.Orientation.LEFT_RIGHT;
            default:
                return GradientDrawable.Orientation.RIGHT_LEFT;
        }
    }

    public static void setAdsBtnText(TextView ad_call_to_action) {
        if (!MyApp.getString(Const.ads_btn_text).equals("")) {
            ad_call_to_action.setText("" + MyApp.getString(Const.ads_btn_text));
        }
        if (!MyApp.getString(Const.ads_btn_color_text).equals("")) {
            ad_call_to_action.setTextColor(Color.parseColor(MyApp.getString(Const.ads_btn_color_text)));
        }
    }


    public static int idAdsOnBtnClickPos = 0;
    public static boolean isAdsOnBtnClickFirstTime = true;

    public static Integer get_AdsOnBtnClickId() {
        if (MyApp.getString(Const.main_btn_ad).equals("")) {
            return 0;
        }

        String[] adsIdsList = MyApp.getString(Const.main_btn_ad).split("\\|");
        if (adsIdsList.length == 0) {
            return 0;
        } else if (adsIdsList.length != 0) {

            if (!isAdsOnBtnClickFirstTime) {
                if (adsIdsList.length - 1 == idAdsOnBtnClickPos) {
                    idAdsOnBtnClickPos = 0;
                    isAdsOnBtnClickFirstTime = true;
                }
            }

            if (isAdsOnBtnClickFirstTime) {
                isAdsOnBtnClickFirstTime = false;
            } else {
                idAdsOnBtnClickPos++;
            }

        }
        return Integer.valueOf(adsIdsList[idAdsOnBtnClickPos]);
    }

    public static void open_Url_Browser(Activity activity, String url) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        activity.startActivity(browserIntent);
    }


    ///////////////////////// For Admob ////////////////////////////////////
    public static int idAdmobNativePos_1 = 0;
    public static boolean isAdmobNativeFirstTime_1 = true;

    public static String get_Admob_NativeAdsId_1() {
        String[] adsIdsList = MyApp.getString(Const.admob_native_1).split("\\|");
        if (adsIdsList.length == 0) {

        } else if (adsIdsList.length != 0) {

            if (!isAdmobNativeFirstTime_1) {
                if (adsIdsList.length - 1 == idAdmobNativePos_1) {
                    idAdmobNativePos_1 = 0;
                    isAdmobNativeFirstTime_1 = true;
                }
            }

            if (isAdmobNativeFirstTime_1) {
                isAdmobNativeFirstTime_1 = false;
            } else {
                idAdmobNativePos_1++;
            }

        }
        return adsIdsList[idAdmobNativePos_1];
    }

    public static int idAdmobNativePos_2 = 0;
    public static boolean isAdmobNativeFirstTime_2 = true;

    public static String get_Admob_NativeAdsId_2() {
        String[] adsIdsList = MyApp.getString(Const.admob_native_2).split("\\|");
        if (adsIdsList.length == 0) {

        } else if (adsIdsList.length != 0) {

            if (!isAdmobNativeFirstTime_2) {
                if (adsIdsList.length - 1 == idAdmobNativePos_2) {
                    idAdmobNativePos_2 = 0;
                    isAdmobNativeFirstTime_2 = true;
                }
            }

            if (isAdmobNativeFirstTime_2) {
                isAdmobNativeFirstTime_2 = false;
            } else {
                idAdmobNativePos_2++;
            }

        }
        return adsIdsList[idAdmobNativePos_2];
    }

    public static int idAdmobInterstitialPos = 0;
    public static boolean isAdmobInterstitialFirstTime = true;

    public static String get_Admob_InterstitialAdsId() {
        String[] adsIdsList = MyApp.getString(Const.admob_interstitial).split("\\|");
        if (adsIdsList.length == 0) {

        } else if (adsIdsList.length != 0) {

            if (!isAdmobInterstitialFirstTime) {
                if (adsIdsList.length - 1 == idAdmobInterstitialPos) {
                    idAdmobInterstitialPos = 0;
                    isAdmobInterstitialFirstTime = true;
                }
            }

            if (isAdmobInterstitialFirstTime) {
                isAdmobInterstitialFirstTime = false;
            } else {
                idAdmobInterstitialPos++;
            }

        }
        return adsIdsList[idAdmobInterstitialPos];
    }

    public static int idAdmobOpenPos = 0;
    public static boolean isAdmobOpenFirstTime = true;

    public static String get_Admob_OpenAdsId() {
        String[] adsIdsList = MyApp.getString(Const.admob_open).split("\\|");
        if (adsIdsList.length == 0) {

        } else if (adsIdsList.length != 0) {

            if (!isAdmobOpenFirstTime) {
                if (adsIdsList.length - 1 == idAdmobOpenPos) {
                    idAdmobOpenPos = 0;
                    isAdmobOpenFirstTime = true;
                }
            }

            if (isAdmobOpenFirstTime) {
                isAdmobOpenFirstTime = false;
            } else {
                idAdmobOpenPos++;
            }

        }
        return adsIdsList[idAdmobOpenPos];
    }

    public static int idAdmobRewardedPos = 0;
    public static boolean isAdmobRewardedFirstTime = true;

    public static String get_Admob_RewardedAdsId() {
        String[] adsIdsList = MyApp.getString(Const.admob_rewarded).split("\\|");
        if (adsIdsList.length == 0) {

        } else if (adsIdsList.length != 0) {

            if (!isAdmobRewardedFirstTime) {
                if (adsIdsList.length - 1 == idAdmobRewardedPos) {
                    idAdmobRewardedPos = 0;
                    isAdmobRewardedFirstTime = true;
                }
            }

            if (isAdmobRewardedFirstTime) {
                isAdmobRewardedFirstTime = false;
            } else {
                idAdmobRewardedPos++;
            }

        }
        return adsIdsList[idAdmobRewardedPos];
    }

    public static int idAdmobBannerPos = 0;
    public static boolean isAdmobBannerFirstTime = true;

    public static String get_Admob_BannerAdsId() {
        String[] adsIdsList = MyApp.getString(Const.admob_banner).split("\\|");
        if (adsIdsList.length == 0) {

        } else if (adsIdsList.length != 0) {

            if (!isAdmobBannerFirstTime) {
                if (adsIdsList.length - 1 == idAdmobBannerPos) {
                    idAdmobBannerPos = 0;
                    isAdmobBannerFirstTime = true;
                }
            }

            if (isAdmobBannerFirstTime) {
                isAdmobBannerFirstTime = false;
            } else {
                idAdmobBannerPos++;
            }

        }
        return adsIdsList[idAdmobBannerPos];
    }
    ///////////////////////// For Admob ////////////////////////////////////

    ///////////////////////// For Facebook ////////////////////////////////////

    public static int idFacebookInterstitialPos = 0;
    public static boolean isFacebookInterstitialFirstTime = true;

    public static String get_Facebook_InterstitialAdsId() {
        String[] adsIdsList = MyApp.getString(Const.fb_interstitial).split("\\|");
        if (adsIdsList.length == 0) {

        } else if (adsIdsList.length != 0) {

            if (!isFacebookInterstitialFirstTime) {
                if (adsIdsList.length - 1 == idFacebookInterstitialPos) {
                    idFacebookInterstitialPos = 0;
                    isFacebookInterstitialFirstTime = true;
                }
            }

            if (isFacebookInterstitialFirstTime) {
                isFacebookInterstitialFirstTime = false;
            } else {
                idFacebookInterstitialPos++;
            }

        }
        return adsIdsList[idFacebookInterstitialPos];
    }

    public static int idFacebookRewardedPos = 0;
    public static boolean isFacebookRewardedFirstTime = true;

    public static String get_Facebook_RewardedAdsId() {
        String[] adsIdsList = MyApp.getString(Const.fb_rewarded).split("\\|");
        if (adsIdsList.length == 0) {

        } else if (adsIdsList.length != 0) {

            if (!isFacebookRewardedFirstTime) {
                if (adsIdsList.length - 1 == idFacebookRewardedPos) {
                    idFacebookRewardedPos = 0;
                    isFacebookRewardedFirstTime = true;
                }
            }

            if (isFacebookRewardedFirstTime) {
                isFacebookRewardedFirstTime = false;
            } else {
                idFacebookRewardedPos++;
            }

        }
        return adsIdsList[idFacebookRewardedPos];
    }

    public static int idFacebookNativePos_1 = 0;
    public static boolean isFacebookNativeFirstTime_1 = true;

    public static String get_Facebook_NativeAdsId_1() {
        String[] adsIdsList = MyApp.getString(Const.fb_native_1).split("\\|");
        if (adsIdsList.length == 0) {

        } else if (adsIdsList.length != 0) {

            if (!isFacebookNativeFirstTime_1) {
                if (adsIdsList.length - 1 == idFacebookNativePos_1) {
                    idFacebookNativePos_1 = 0;
                    isFacebookNativeFirstTime_1 = true;
                }
            }

            if (isFacebookNativeFirstTime_1) {
                isFacebookNativeFirstTime_1 = false;
            } else {
                idFacebookNativePos_1++;
            }

        }
        return adsIdsList[idFacebookNativePos_1];
    }

    public static int idFacebookNativePos_2 = 0;
    public static boolean isFacebookNativeFirstTime_2 = true;

    public static String get_Facebook_NativeAdsId_2() {
        String[] adsIdsList = MyApp.getString(Const.fb_native_2).split("\\|");
        if (adsIdsList.length == 0) {

        } else if (adsIdsList.length != 0) {

            if (!isFacebookNativeFirstTime_2) {
                if (adsIdsList.length - 1 == idFacebookNativePos_2) {
                    idFacebookNativePos_2 = 0;
                    isFacebookNativeFirstTime_2 = true;
                }
            }

            if (isFacebookNativeFirstTime_2) {
                isFacebookNativeFirstTime_2 = false;
            } else {
                idFacebookNativePos_2++;
            }

        }
        return adsIdsList[idFacebookNativePos_2];
    }


    public static int idFacebookBannerPos = 0;
    public static boolean isFacebookBannerFirstTime = true;

    public static String get_Facebook_BannerAdsId() {
        String[] adsIdsList = MyApp.getString(Const.fb_banner).split("\\|");
        if (adsIdsList.length == 0) {

        } else if (adsIdsList.length != 0) {

            if (!isFacebookBannerFirstTime) {
                if (adsIdsList.length - 1 == idFacebookBannerPos) {
                    idFacebookBannerPos = 0;
                    isFacebookBannerFirstTime = true;
                }
            }

            if (isFacebookBannerFirstTime) {
                isFacebookBannerFirstTime = false;
            } else {
                idFacebookBannerPos++;
            }

        }
        return adsIdsList[idFacebookBannerPos];
    }

    ///////////////////////// For Facebook ////////////////////////////////////


    ///////////////////////// For Sdk ////////////////////////////////////

    public static int idSdkRewardedPos = 0;
    public static boolean isSdkRewardedFirstTime = true;

    public static String get_Sdk_RewardedAdsId() {
        String[] adsIdsList = MyApp.getString(Const.sdk_rewarded).split("\\|");
        if (adsIdsList.length == 0) {

        } else if (adsIdsList.length != 0) {

            if (!isSdkRewardedFirstTime) {
                if (adsIdsList.length - 1 == idSdkRewardedPos) {
                    idSdkRewardedPos = 0;
                    isSdkRewardedFirstTime = true;
                }
            }

            if (isSdkRewardedFirstTime) {
                isSdkRewardedFirstTime = false;
            } else {
                idSdkRewardedPos++;
            }

        }
        return adsIdsList[idSdkRewardedPos].trim();
    }

    public static int idSdkOpenPos = 0;
    public static boolean isSdkOpenFirstTime = true;

    public static String get_Sdk_OpenAdsId() {
        String[] adsIdsList = MyApp.getString(Const.sdk_open).split("\\|");
        if (adsIdsList.length == 0) {

        } else if (adsIdsList.length != 0) {

            if (!isSdkOpenFirstTime) {
                if (adsIdsList.length - 1 == idSdkOpenPos) {
                    idSdkOpenPos = 0;
                    isSdkOpenFirstTime = true;
                }
            }

            if (isSdkOpenFirstTime) {
                isSdkOpenFirstTime = false;
            } else {
                idSdkOpenPos++;
            }

        }
        return adsIdsList[idSdkOpenPos].trim();
    }

    public static int idSdkInterstitialPos = 0;
    public static boolean isSdkInterstitialFirstTime = true;

    public static String get_Sdk_InterstitialAdsId() {
        String[] adsIdsList = MyApp.getString(Const.sdk_interstitial).split("\\|");
        if (adsIdsList.length == 0) {

        } else if (adsIdsList.length != 0) {

            if (!isSdkInterstitialFirstTime) {
                if (adsIdsList.length - 1 == idSdkInterstitialPos) {
                    idSdkInterstitialPos = 0;
                    isSdkInterstitialFirstTime = true;
                }
            }

            if (isSdkInterstitialFirstTime) {
                isSdkInterstitialFirstTime = false;
            } else {
                idSdkInterstitialPos++;
            }

        }
        return adsIdsList[idSdkInterstitialPos].trim();
    }

    public static int idSdkNativePos = 0;
    public static boolean isSdkNativeFirstTime = true;

    public static String get_Sdk_NativeAdsId() {
        String[] adsIdsList = MyApp.getString(Const.sdk_native).split("\\|");
        if (adsIdsList.length == 0) {

        } else if (adsIdsList.length != 0) {

            if (!isSdkNativeFirstTime) {
                if (adsIdsList.length - 1 == idSdkNativePos) {
                    idSdkNativePos = 0;
                    isSdkNativeFirstTime = true;
                }
            }

            if (isSdkNativeFirstTime) {
                isSdkNativeFirstTime = false;
            } else {
                idSdkNativePos++;
            }

        }
        return adsIdsList[idSdkNativePos].trim();
    }

    ///////////////////////// For Sdk ////////////////////////////////////

    ///////////////////////// For TopOn ////////////////////////////////////

    public static int idToponInterstitialPos = 0;
    public static boolean isToponInterstitialFirstTime = true;

    public static String get_Topon_InterstitialAdsId() {
        String[] adsIdsList = MyApp.getString(Const.topon_interstitial).split("\\|");
        if (adsIdsList.length == 0) {

        } else if (adsIdsList.length != 0) {

            if (!isToponInterstitialFirstTime) {
                if (adsIdsList.length - 1 == idToponInterstitialPos) {
                    idToponInterstitialPos = 0;
                    isToponInterstitialFirstTime = true;
                }
            }

            if (isToponInterstitialFirstTime) {
                isToponInterstitialFirstTime = false;
            } else {
                idToponInterstitialPos++;
            }

        }
        return adsIdsList[idToponInterstitialPos].trim();
    }


    public static int idToponRewardedPos = 0;
    public static boolean isToponRewardedFirstTime = true;

    public static String get_Topon_RewardedAdsId() {
        String[] adsIdsList = MyApp.getString(Const.topon_rewarded).split("\\|");
        if (adsIdsList.length == 0) {

        } else if (adsIdsList.length != 0) {

            if (!isToponRewardedFirstTime) {
                if (adsIdsList.length - 1 == idToponRewardedPos) {
                    idToponRewardedPos = 0;
                    isToponRewardedFirstTime = true;
                }
            }

            if (isToponRewardedFirstTime) {
                isToponRewardedFirstTime = false;
            } else {
                idToponRewardedPos++;
            }

        }
        return adsIdsList[idToponRewardedPos].trim();
    }


    public static int idToponOpenPos = 0;
    public static boolean isToponOpenFirstTime = true;

    public static String get_Topon_OpenAdsId() {
        String[] adsIdsList = MyApp.getString(Const.topon_open).split("\\|");
        if (adsIdsList.length == 0) {

        } else if (adsIdsList.length != 0) {

            if (!isToponOpenFirstTime) {
                if (adsIdsList.length - 1 == idToponOpenPos) {
                    idToponOpenPos = 0;
                    isToponOpenFirstTime = true;
                }
            }

            if (isToponOpenFirstTime) {
                isToponOpenFirstTime = false;
            } else {
                idToponOpenPos++;
            }

        }
        return adsIdsList[idToponOpenPos].trim();
    }


    public static int idToponNativePos_1 = 0;
    public static boolean isToponNativeFirstTime_1 = true;

    public static String get_Topon_NativeAdsId_1() {
        String[] adsIdsList = MyApp.getString(Const.topon_native_1).split("\\|");
        if (adsIdsList.length == 0) {

        } else if (adsIdsList.length != 0) {

            if (!isToponNativeFirstTime_1) {
                if (adsIdsList.length - 1 == idToponNativePos_1) {
                    idToponNativePos_1 = 0;
                    isToponNativeFirstTime_1 = true;
                }
            }

            if (isToponNativeFirstTime_1) {
                isToponNativeFirstTime_1 = false;
            } else {
                idToponNativePos_1++;
            }

        }
        return adsIdsList[idToponNativePos_1].trim();
    }

    public static int idToponNativePos_2 = 0;
    public static boolean isToponNativeFirstTime_2 = true;

    public static String get_Topon_NativeAdsId_2() {
        String[] adsIdsList = MyApp.getString(Const.topon_native_2).split("\\|");
        if (adsIdsList.length == 0) {

        } else if (adsIdsList.length != 0) {

            if (!isToponNativeFirstTime_2) {
                if (adsIdsList.length - 1 == idToponNativePos_2) {
                    idToponNativePos_2 = 0;
                    isToponNativeFirstTime_2 = true;
                }
            }

            if (isToponNativeFirstTime_2) {
                isToponNativeFirstTime_2 = false;
            } else {
                idToponNativePos_2++;
            }

        }
        return adsIdsList[idToponNativePos_2].trim();
    }


    public static int idToponBannerPos = 0;
    public static boolean isToponBannerFirstTime = true;

    public static String get_Topon_BannerAdsId() {
        String[] adsIdsList = MyApp.getString(Const.topon_banner).split("\\|");
        if (adsIdsList.length == 0) {

        } else if (adsIdsList.length != 0) {

            if (!isToponBannerFirstTime) {
                if (adsIdsList.length - 1 == idToponBannerPos) {
                    idToponBannerPos = 0;
                    isToponBannerFirstTime = true;
                }
            }

            if (isToponBannerFirstTime) {
                isToponBannerFirstTime = false;
            } else {
                idToponBannerPos++;
            }

        }
        return adsIdsList[idToponBannerPos].trim();
    }


    ///////////////////////// For TopOn ////////////////////////////////////

    ///////////////////////// For Qureka ////////////////////////////////////

    public static int idQurekaInterstitialPos = 0;
    public static boolean isQurekaInterstitialFirstTime = true;

    public static String get_Qureka_InterstitialAdsId() {
        String[] adsIdsList = MyApp.getString(Const.qureka_interstitial).split("\\|");
        if (adsIdsList.length == 0) {

        } else if (adsIdsList.length != 0) {

            if (!isQurekaInterstitialFirstTime) {
                if (adsIdsList.length - 1 == idQurekaInterstitialPos) {
                    idQurekaInterstitialPos = 0;
                    isQurekaInterstitialFirstTime = true;
                }
            }

            if (isQurekaInterstitialFirstTime) {
                isQurekaInterstitialFirstTime = false;
            } else {
                idQurekaInterstitialPos++;
            }

        }
        return adsIdsList[idQurekaInterstitialPos].trim();
    }

    public static int idQurekaOpenPos = 0;
    public static boolean isQurekaOpenFirstTime = true;

    public static String get_Qureka_OpenAdsId() {
        String[] adsIdsList = MyApp.getString(Const.qureka_open).split("\\|");
        if (adsIdsList.length == 0) {

        } else if (adsIdsList.length != 0) {

            if (!isQurekaOpenFirstTime) {
                if (adsIdsList.length - 1 == idQurekaOpenPos) {
                    idQurekaOpenPos = 0;
                    isQurekaOpenFirstTime = true;
                }
            }

            if (isQurekaOpenFirstTime) {
                isQurekaOpenFirstTime = false;
            } else {
                idQurekaOpenPos++;
            }

        }
        return adsIdsList[idQurekaOpenPos].trim();
    }


    ///////////////////////// For Qureka ////////////////////////////////////

    ///////////////////////// For Bg Ads ////////////////////////////////////

    public static int idBgAdsPos = 0;
    public static boolean isBgAdsFirstTime = true;

    public static String get_BgAds_AdsId() {
        if (MyApp.getString(Const.b_link).equals("")) {
            return "";
        }
        String[] adsIdsList = MyApp.getString(Const.b_link).split("\\|");
        if (adsIdsList.length == 0) {

        } else if (adsIdsList.length != 0) {

            if (!isBgAdsFirstTime) {
                if (adsIdsList.length - 1 == idBgAdsPos) {
                    idBgAdsPos = 0;
                    isBgAdsFirstTime = true;
                }
            }

            if (isBgAdsFirstTime) {
                isBgAdsFirstTime = false;
            } else {
                idBgAdsPos++;
            }

        }
        return adsIdsList[idBgAdsPos].trim();
    }

    ///////////////////////// For Bg Ads ////////////////////////////////////


    ///////////////////////// Back Button Ads Type ////////////////////////////////////

    public static int idBackButtonPos = 0;
    public static boolean isBackButtonFirstTime = true;

    public static String get_BackButton_AdsType() {
        String[] adsIdsList = MyApp.getString(Const.back_btn_ad).split("\\|");
        if (adsIdsList.length == 0) {

        } else if (adsIdsList.length != 0) {

            if (!isBackButtonFirstTime) {
                if (adsIdsList.length - 1 == idBackButtonPos) {
                    idBackButtonPos = 0;
                    isBackButtonFirstTime = true;
                }
            }

            if (isBackButtonFirstTime) {
                isBackButtonFirstTime = false;
            } else {
                idBackButtonPos++;
            }

        }
        return adsIdsList[idBackButtonPos].trim();
    }


    ///////////////////////// Back Button Ads Type ////////////////////////////////////


    public static List<String> NativeTopTypeFillListCompanyWise(Activity activity) {

        String[] priority = MyApp.getString(Const.native_top_priority).split("\\|");
        List<String> priorityList = new ArrayList<>();
        for (String stringList : priority) {
            priorityList.add(stringList);
        }

        List<String> stringList = new ArrayList<>();

        if (priorityList.contains(Const.admob)) {
            if (Admob_Native.nativeAdTop != null || Admob_Native.nativeAdTop1 != null) {
                stringList.add(Const.admob);
            } else {
                Admob_Native.startTimerTopNative(activity);
            }
        }
        if (priorityList.contains(Const.facebook)) {
            if (Facebook_Native.nativeAdTop != null || Facebook_Native.nativeAdTop1 != null) {
                stringList.add(Const.facebook);
            } else {
                Facebook_Native.startTimerTopNative(activity);
            }
        }

        if (priorityList.contains(Const.iron)) {
            if (IronSource_Native.nativeAdTop != null || IronSource_Native.nativeAdTop1 != null) {
                stringList.add(Const.iron);
            } else {
                IronSource_Native.startTimerTopNative(activity);
            }
        }

        if (priorityList.contains(Const.topon)) {
            if (Topon_Native.nativeAdTop != null || Topon_Native.nativeAdTop1 != null) {
                stringList.add(Const.topon);
            } else {
                Topon_Native.startTimerTopNative(activity);
            }
        }

        if (priorityList.contains(Const.sdk)) {
            stringList.add(Const.sdk);
        }

        if (priorityList.contains(Const.qureka)) {
            stringList.add(Const.qureka);
        }

        return stringList;
    }

    public static List<String> NativeBottomTypeFillListCompanyWise(Activity activity) {

        String[] priority = MyApp.getString(Const.native_bottom_priority).split("\\|");
        List<String> priorityList = new ArrayList<>();
        for (String stringList : priority) {
            priorityList.add(stringList);
        }

        List<String> stringList = new ArrayList<>();

        if (priorityList.contains(Const.admob)) {
            if (Admob_Native.nativeAdBottom != null || Admob_Native.nativeAdBottom1 != null) {
                stringList.add(Const.admob);
            } else {
                Admob_Native.startTimerBottomNative(activity);
            }
        }

        if (priorityList.contains(Const.facebook)) {
            if (Facebook_Native.nativeAdBottom != null || Facebook_Native.nativeAdBottom1 != null) {
                stringList.add(Const.facebook);
            }
        }

        if (priorityList.contains(Const.iron)) {
            if (IronSource_Native.nativeAdBottom != null || IronSource_Native.nativeAdBottom1 != null) {
                stringList.add(Const.iron);
            }
        }

        if (priorityList.contains(Const.topon)) {
            if (Topon_Native.nativeAdBottom != null || Topon_Native.nativeAdBottom1 != null) {
                stringList.add(Const.topon);
            }
        }

        if (priorityList.contains(Const.sdk)) {
            stringList.add(Const.sdk);
        }

        if (priorityList.contains(Const.qureka)) {
            stringList.add(Const.qureka);
        }

        return stringList;
    }

    public static List<String> NativeExtraTypeFillListCompanyWise(Activity activity) {

        if (MyApp.getString(Const.native_Extra).equals("")) {
            return new ArrayList<>();
        }

        String[] priority = MyApp.getString(Const.native_Extra).split("\\|");
        List<String> priorityList = new ArrayList<>();
        for (String stringList : priority) {
            priorityList.add(stringList);
        }

        List<String> stringList = new ArrayList<>();

        if (priorityList.contains(Const.admob)) {
            if (Admob_Native.nativeAdExtra != null || Admob_Native.nativeAdExtra1 != null) {
                stringList.add(Const.admob);
            } else {
                Admob_Native.startTimerExtraNative(activity);
            }
        }

        if (priorityList.contains(Const.facebook)) {
            if (Facebook_Native.nativeAdExtra != null || Facebook_Native.nativeAdExtra1 != null) {
                stringList.add(Const.facebook);
            } else {
                Facebook_Native.startTimerExtraNative(activity);
            }
        }

        if (priorityList.contains(Const.iron)) {
            if (IronSource_Native.nativeAdExtra != null || IronSource_Native.nativeAdExtra1 != null) {
                stringList.add(Const.iron);
            } else {
                IronSource_Native.startTimerExtraNative(activity);
            }
        }

        if (priorityList.contains(Const.topon)) {
            if (Topon_Native.nativeAdExtra != null || Topon_Native.nativeAdExtra1 != null) {
                stringList.add(Const.topon);
            } else {
                Topon_Native.startTimerExtraNative(activity);
            }
        }

        if (priorityList.contains(Const.sdk)) {
            stringList.add(Const.sdk);
        }

        if (priorityList.contains(Const.qureka)) {
            stringList.add(Const.qureka);
        }


        return stringList;
    }

    public static List<String> InterstitialTypeFillListCompanyWise(Activity activity) {

        String[] priority = MyApp.getString(Const.interstitial_priority).split("\\|");
        List<String> priorityList = new ArrayList<>();
        for (String stringList : priority) {
            priorityList.add(stringList);
        }

        List<String> stringList = new ArrayList<>();

        if (priorityList.contains(Const.admob)) {
            if (Admob_Interstitial.interstitialAd != null || Admob_Interstitial.interstitialAd1 != null) {
                stringList.add(Const.admob);
            } else {
                Admob_Interstitial.startTimerInterstitialLoad(activity);
            }
        }


        if (priorityList.contains(Const.facebook)) {
            if (Facebook_Interstitial.interstitialAd != null || Facebook_Interstitial.interstitialAd1 != null) {
                stringList.add(Const.facebook);
            } else {
                Facebook_Interstitial.startTimerInterstitialLoad(activity);
            }
        }

        if (IronSource_Interstitial.interstitialAd) {
            stringList.add(Const.iron);
        }

        try {
            if (priorityList.contains(Const.topon)) {

                Boolean isNotNull = false;

                if (Topon_Interstitial.interstitialAd != null) {
                    if (Topon_Interstitial.interstitialAd.isAdReady()) {
                        isNotNull = true;
                    }
                }

                if (Topon_Interstitial.interstitialAd1 != null) {
                    if (Topon_Interstitial.interstitialAd1.isAdReady()) {
                        isNotNull = true;
                    }
                }

                if (isNotNull) {
                    stringList.add(Const.topon);
                } else {
                    Topon_Interstitial.startTimerInterstitialLoad(activity);
                }
            }
        } catch (Exception e) {
            Log.d("Topon_Interstitial", "Exception " + e);
            e.printStackTrace();
        }


        try {
            if (Sdk_Interstitial.interstitialAd != null) {
                if (Sdk_Interstitial.interstitialAd.isAdLoaded()) {
                    Log.d("Sdk_Interstitial", " SDk add interstitialAd ");
                    stringList.add(Const.sdk);
                }
            }
            if (Sdk_Interstitial.interstitialAd1 != null) {
                if (Sdk_Interstitial.interstitialAd1.isAdLoaded()) {
                    Log.d("Topon_Interstitial", " SDk add interstitialAd1 ");
                    stringList.add(Const.sdk);
                }
            }
        } catch (Exception e) {
            Log.d("Topon_Interstitial", " SDk add Exception " + e);
            e.printStackTrace();
        }
        stringList.add(Const.qureka);
        return stringList;
    }

    public static List<String> AppOpenTypeFillListCompanyWise() {

        List<String> stringList = new ArrayList<>();
        if (Admob_AppOpen.appOpenAd != null || Admob_AppOpen.appOpenAd1 != null) {
            stringList.add(Const.admob);
        }

        if (Sdk_AppOpen.isLoadedappOpenAd) {
            stringList.add(Const.sdk);
        }

        stringList.add(Const.qureka);
        return stringList;
    }

    public static List<String> RewardedTypeFillListCompanyWise() {

        List<String> stringList = new ArrayList<>();
        if (Admob_Rewarded.mRewardedAd != null) {
            stringList.add(Const.admob);
        }
        if (Facebook_Rewarded.mRewardedAd != null) {
            if (Facebook_Rewarded.mRewardedAd.isAdLoaded()) {
                stringList.add(Const.facebook);
            }
        }
        if (IronSource_Rewarded.rewarded) {
            stringList.add(Const.iron);
        }

        if (Sdk_Rewarded.mRewardedAd != null) {
            if (Sdk_Rewarded.mRewardedAd.isAdLoaded()) {
                stringList.add(Const.sdk);
            }
        }

        if (Topon_Rewarded.mRewardedAd != null) {
            if (Topon_Rewarded.mRewardedAd.isAdReady()) {
                stringList.add(Const.topon);
            }
        }

        stringList.add(Const.qureka);
        return stringList;
    }


    ////////////////////////////// Set Null Data////////////////////////////////////
    public static void setNullApiData() {
        MyApp.setString(Const.interstitial_priority, "");
        MyApp.setString(Const.appOpen_priority, "");
        MyApp.setString(Const.rewarded_priority, "");
        MyApp.setString(Const.native_top_priority, "");
        MyApp.setString(Const.native_bottom_priority, "");
        MyApp.setString(Const.native_Extra, "");
    }


    ////////////////////////////// get Vpn Key////////////////////////////////////
    public static int vKeyPos = 0;
    public static boolean isvKeyFirstTime = true;

    public static String get_vKey() {
        String[] adsIdsList = MyApp.getString(Const.v_key).split("\\|");
        if (adsIdsList.length == 0) {

        } else if (adsIdsList.length != 0) {

            if (!isvKeyFirstTime) {
                if (adsIdsList.length - 1 == vKeyPos) {
                    vKeyPos = 0;
                    isvKeyFirstTime = true;
                }
            }

            if (isvKeyFirstTime) {
                isvKeyFirstTime = false;
            } else {
                vKeyPos++;
            }

        }
        return adsIdsList[vKeyPos].trim();
    }


    ////////////////////////// get Vpn Random//////////////////////////////////////
    public static String get_vpn_country() {
        try {
            if (MyApp.getString(Const.v_servar).contains("|")) {
                String[] adsIdsList = MyApp.getString(Const.v_servar).split("\\|");
                int random = new Random().nextInt((adsIdsList.length - 0) + 1) + 0;
                if (random == 0) {
                    return adsIdsList[0];
                } else {
                    return adsIdsList[(random-1)];
                }
            } else {
                return MyApp.getString(Const.v_servar);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return MyApp.getString(Const.v_servar);
        }
    }


}
