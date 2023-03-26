package com.lib.adssdk;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.ColorDrawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Handler;
import android.os.RemoteException;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;

import com.anchorfree.reporting.TrackingConstants;
import com.anchorfree.sdk.UnifiedSDK;
import com.anchorfree.vpnsdk.callbacks.Callback;
import com.anchorfree.vpnsdk.callbacks.CompletableCallback;
import com.anchorfree.vpnsdk.exceptions.VpnException;
import com.anchorfree.vpnsdk.vpnservice.VPNState;


import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.anythink.core.api.ATSDK;
import com.greedygame.core.AppConfig;
import com.greedygame.core.GreedyGameAds;
import com.greedygame.core.interfaces.GreedyGameAdsEventsListener;
import com.greedygame.core.models.general.InitErrors;
import com.ironsource.mediationsdk.IronSource;
import com.lib.adssdk.AdsHelper.Admob_AppOpen;
import com.lib.adssdk.AdsHelper.Admob_Interstitial;
import com.lib.adssdk.AdsHelper.Admob_Native;
import com.lib.adssdk.AdsHelper.Admob_Rewarded;
import com.lib.adssdk.AdsHelper.Facebook_Interstitial;
import com.lib.adssdk.AdsHelper.Facebook_Native;
import com.lib.adssdk.AdsHelper.Facebook_Rewarded;
import com.lib.adssdk.AdsHelper.IronSource_Interstitial;
import com.lib.adssdk.AdsHelper.IronSource_Native;
import com.lib.adssdk.AdsHelper.IronSource_Rewarded;
import com.lib.adssdk.AdsHelper.Sdk_AppOpen;
import com.lib.adssdk.AdsHelper.Sdk_Interstitial;
import com.lib.adssdk.AdsHelper.Sdk_Native;
import com.lib.adssdk.AdsHelper.Sdk_Rewarded;
import com.lib.adssdk.AdsHelper.Topon_Interstitial;
import com.lib.adssdk.AdsHelper.Topon_Native;
import com.lib.adssdk.AdsHelper.Topon_Rewarded;
import com.lib.adssdk.AdsManager.AdsManager;
import com.lib.adssdk.Listner.OnAdsClickListner;
import com.lib.adssdk.Model.QurekaIntModel;
import com.lib.adssdk.Utils.AESHelper;
import com.lib.adssdk.Utils.Const;
import com.lib.adssdk.Utils.utils;
import com.lib.adssdk.retrofit.ApiClient;
import com.lib.adssdk.retrofit.RequestInterface;
import com.microsoft.appcenter.AppCenter;
import com.microsoft.appcenter.analytics.Analytics;
import com.microsoft.appcenter.crashes.Crashes;
import com.onesignal.OneSignal;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Response;


public class Ads {

    private static Activity mactivity;
    public static final String TAG = "Ads";
    public static String URL = "";
    public static AdsInitListner adsInitListner;
    public static boolean isdebugMode = true;
    public static InstallReferrerClient referrerClient;

    public interface AdsInitListner {

        public void onAdsClick();

        public void successOnAdsInit();

        public void failedOnAdsInit(String error);
    }

    private static boolean isNetworkConnected() {
        ConnectivityManager cm = (ConnectivityManager) mactivity.getSystemService(Context.CONNECTIVITY_SERVICE);
        return cm.getActiveNetworkInfo() != null && cm.getActiveNetworkInfo().isConnected();
    }

    public static void init(Activity activity, AdsInitListner madsInitListner) {
        mactivity = activity;
        try {
            if (isdebugMode) {
                adsInitListner = madsInitListner;
                checkNet();
            } else {
                if (Settings.Secure.getInt(activity.getContentResolver(), Settings.Secure.ADB_ENABLED, 0) == 1) {
                    showUsbDebuggingDialog(activity, madsInitListner);
                } else {
                    adsInitListner = madsInitListner;
                    checkNet();
                }
            }
        } catch (Exception e) {
            adsInitListner = madsInitListner;
            checkNet();
            e.printStackTrace();
        }

    }

    private static void checkNet() {

        if (isNetworkConnected()) {

            if (!isVpnConnected()) {

                if (MyApp.getString(Const.is_organic_user).equals("")) {
                    referrerClient = InstallReferrerClient.newBuilder(mactivity).build();
                    referrerClient.startConnection(new InstallReferrerStateListener() {
                        @Override
                        public void onInstallReferrerSetupFinished(int responseCode) {
                            switch (responseCode) {
                                case InstallReferrerClient.InstallReferrerResponse.OK:
                                    ReferrerDetails response = null;
                                    try {
                                        response = referrerClient.getInstallReferrer();
                                        String referrerUrl = response.getInstallReferrer();
                                        if (referrerUrl.contains("google-play") || referrerUrl.contains("(not%20set)")) {
                                            MyApp.setString(Const.is_organic_user, "true");
                                        } else {
                                            MyApp.setString(Const.is_organic_user, "false");
                                        }
                                    } catch (RemoteException e) {
                                        MyApp.setString(Const.is_organic_user, "");
                                        e.printStackTrace();
                                    }
                                    break;
                                case InstallReferrerClient.InstallReferrerResponse.FEATURE_NOT_SUPPORTED:
                                    MyApp.setString(Const.is_organic_user, "");
                                    break;
                                case InstallReferrerClient.InstallReferrerResponse.SERVICE_UNAVAILABLE:
                                    MyApp.setString(Const.is_organic_user, "");
                                    break;
                            }
                        }

                        @Override
                        public void onInstallReferrerServiceDisconnected() {
                            MyApp.setString(Const.is_organic_user, "");
                        }
                    });
                }

                apiCallForGetData();

                // In App Review Init
                AppUtil.InAppReviewInit(mactivity);

            } else {
                showDisconnectDialog();
            }
        } else {
            showNoInternetDialog();
        }
    }


    public static void apiCallForGetData() {
        RequestInterface requestInterface = ApiClient.getClient().create(RequestInterface.class);
        Call<ResponseBody> call = requestInterface.getData(mactivity.getPackageName()+".json");
        call.enqueue(new retrofit2.Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                if (response.code() == 200) {

                    if (response.body() != null) {
                        try {
                            String result = response.body().string();
                            if (result != null) {
                                JSONArray jsonarray = new JSONArray(result);
                                getallkey(jsonarray);
                            }
                        } catch (Exception e) {
                            utils.setNullApiData();
                            Log.d(TAG, "apiCallForGetData Exception -> " + response.code() + "" + response.errorBody());
                            adsInitListner.failedOnAdsInit("apiCallForGetData Exception -> " + response.code() + "" + response.errorBody());
                            e.printStackTrace();
                        }
                    }

                } else {
                    utils.setNullApiData();
                    Log.d(TAG, "apiCallForGetData Exception -> " + response.code() + "" + response.errorBody());
                    adsInitListner.failedOnAdsInit("apiCallForGetData Exception -> " + response.code() + "" + response.errorBody());
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                adsInitListner.failedOnAdsInit("apiCallForGetData onResponse -> " + t.getMessage());
                utils.setNullApiData();
                t.printStackTrace();
            }
        });
    }



    private static void getallkey(JSONArray jsonObject2) {

        try {

            adsInitListner.successOnAdsInit();

            for (int i = 0; i < jsonObject2.length(); i++) {
                JSONObject jsonobject = jsonObject2.getJSONObject(i);

                //    <!--    For Other-->
                MyApp.setString(Const.label, jsonobject.getString(Const.label));


                try {

                    //    <!--    For Other-->
                    MyApp.setString(Const.privacy_policy, jsonobject.getString(Const.privacy_policy));
                    MyApp.setString(Const.version_code, jsonobject.getString(Const.version_code));
                    MyApp.setString(Const.rate_us, jsonobject.getString(Const.rate_us));
                    MyApp.setString(Const.update_link, jsonobject.getString(Const.update_link));
                    MyApp.setString(Const.screen_counter, jsonobject.getString(Const.screen_counter));
                    MyApp.setString(Const.ads_btn, jsonobject.getString(Const.ads_btn));
                    MyApp.setString(Const.ads_btn_top, jsonobject.getString(Const.ads_btn_top));
                    MyApp.setString(Const.ads_btn_bottom, jsonobject.getString(Const.ads_btn_bottom));
                    MyApp.setString(Const.ads_btn_2_height_top, jsonobject.getString(Const.ads_btn_2_height_top));
                    MyApp.setString(Const.ads_btn_2_height_bottom, jsonobject.getString(Const.ads_btn_2_height_bottom));
                    MyApp.setString(Const.anim, jsonobject.getString(Const.anim));
                    MyApp.setString(Const.data_other, jsonobject.getString(Const.data_other));

                    MyApp.setString(Const.ads_btn_1_background, jsonobject.getString(Const.ads_btn_1_background));
                    MyApp.setString(Const.ads_btn_1_text, jsonobject.getString(Const.ads_btn_1_text));

                    //    <!--    For show ads type-->
                    MyApp.setString(Const.background_ad, jsonobject.getString(Const.background_ad));
                    MyApp.setString(Const.splace_ad, jsonobject.getString(Const.splace_ad));
                    MyApp.setString(Const.splace_time, jsonobject.getString(Const.splace_time));
                    MyApp.setString(Const.main_btn_ad, jsonobject.getString(Const.main_btn_ad));

                    MyApp.setString(Const.banner_type_top, jsonobject.getString(Const.banner_type_top));
                    MyApp.setString(Const.banner_type_bottom, jsonobject.getString(Const.banner_type_bottom));

                    //    <!--    For Bg Ads-->
                    MyApp.setString(Const.b_link, jsonobject.getString(Const.b_link));
                    MyApp.setString(Const.b_show, jsonobject.getString(Const.b_show));

                    //    <!--    For admob ids-->
                    MyApp.setString(Const.admob_interstitial, jsonobject.getString(Const.admob_interstitial));
                    MyApp.setString(Const.admob_native_1, jsonobject.getString(Const.admob_native_1));
                    MyApp.setString(Const.admob_native_2, jsonobject.getString(Const.admob_native_2));
                    MyApp.setString(Const.admob_open, jsonobject.getString(Const.admob_open));
                    MyApp.setString(Const.admob_rewarded, jsonobject.getString(Const.admob_rewarded));
                    MyApp.setString(Const.admob_banner, jsonobject.getString(Const.admob_banner));

                    //    <!--    For facebook ids-->
                    MyApp.setString(Const.fb_banner, jsonobject.getString(Const.fb_banner));
                    MyApp.setString(Const.fb_native_1, jsonobject.getString(Const.fb_native_1));
                    MyApp.setString(Const.fb_native_2, jsonobject.getString(Const.fb_native_2));
                    MyApp.setString(Const.fb_interstitial, jsonobject.getString(Const.fb_interstitial));
                    MyApp.setString(Const.fb_open, jsonobject.getString(Const.fb_open));
                    MyApp.setString(Const.fb_rewarded, jsonobject.getString(Const.fb_rewarded));

                    //    <!--    For sdk ids-->
                    MyApp.setString(Const.sdk_banner, jsonobject.getString(Const.sdk_banner));
                    MyApp.setString(Const.sdk_interstitial, jsonobject.getString(Const.sdk_interstitial));
                    MyApp.setString(Const.sdk_native, jsonobject.getString(Const.sdk_native));
                    MyApp.setString(Const.sdk_open, jsonobject.getString(Const.sdk_open));
                    MyApp.setString(Const.sdk_rewarded, jsonobject.getString(Const.sdk_rewarded));

                    //    <!--    For topon ids-->
                    MyApp.setString(Const.topon_appid, jsonobject.getString(Const.topon_appid));
                    MyApp.setString(Const.topon_appkey, jsonobject.getString(Const.topon_appkey));
                    MyApp.setString(Const.topon_banner, jsonobject.getString(Const.topon_banner));
                    MyApp.setString(Const.topon_native_1, jsonobject.getString(Const.topon_native_1));
                    MyApp.setString(Const.topon_native_2, jsonobject.getString(Const.topon_native_2));
                    MyApp.setString(Const.topon_interstitial, jsonobject.getString(Const.topon_interstitial));
                    MyApp.setString(Const.topon_open, jsonobject.getString(Const.topon_open));
                    MyApp.setString(Const.topon_rewarded, jsonobject.getString(Const.topon_rewarded));

                    //    <!--    For Qureka ids-->
                    MyApp.setString(Const.qureka_link, jsonobject.getString(Const.qureka_link));

                    JSONObject objectQureka = jsonobject.getJSONObject("qureka_ads");

                    // For Qureka open
                    JSONObject qureka_open_object = objectQureka.getJSONObject(Const.qureka_open);
                    MyApp.setString(Const.qureka_open, qureka_open_object.getString(Const.qureka_open));
                    MyApp.setString(Const.qureka_open_image_url, qureka_open_object.getString(Const.qureka_open_image_url));
                    MyApp.setString(Const.qureka_open_image_show, qureka_open_object.getString(Const.qureka_open_image_show));
                    MyApp.setString(Const.qureka_open_timer, qureka_open_object.getString(Const.qureka_open_timer));

                    // For Qureka interstitial
                    JSONObject qureka_interstitial_object = objectQureka.getJSONObject("qureka_interstitial");
                    MyApp.setString(Const.qureka_interstitial, qureka_interstitial_object.getString(Const.qureka_interstitial));
                    MyApp.setString(Const.qureka_int_timer, qureka_interstitial_object.getString(Const.qureka_int_timer));

                    JSONArray qureka_int_ads = qureka_interstitial_object.getJSONArray("qureka_int_ads");
                    List<QurekaIntModel> qurekaIntModelList = new ArrayList<>();
                    for (int j = 0; j < qureka_int_ads.length(); j++) {

                        JSONObject object = qureka_int_ads.getJSONObject(j);

                        QurekaIntModel qurekaIntModel = new QurekaIntModel();
                        qurekaIntModel.setQureka_int(object.getString("qureka_int"));
                        qurekaIntModel.setQureka_open_image_url(object.getString("qureka_open_image_url"));
                        qurekaIntModel.setQureka_int_image_show(object.getString("qureka_int_image_show"));
                        qurekaIntModel.setQureka_int_image_top(object.getString("qureka_int_image_top"));
                        qurekaIntModel.setQureka_int_image_ss(object.getString("qureka_int_image_ss"));
                        qurekaIntModelList.add(qurekaIntModel);
                    }
                    MyApp.setQurekaIntList(qurekaIntModelList);

                    // For Qureka native
                    JSONObject qureka_native = objectQureka.getJSONObject("qureka_native");
                    MyApp.setString(Const.qureka_native_big_image, qureka_native.getString(Const.qureka_native_big_image));
                    MyApp.setString(Const.qureka_native_small_top_image, qureka_native.getString(Const.qureka_native_small_top_image));
                    MyApp.setString(Const.qureka_native_small_bottom_image, qureka_native.getString(Const.qureka_native_small_bottom_image));
                    MyApp.setString(Const.qureka_native_banner_image, qureka_native.getString(Const.qureka_native_banner_image));

                    MyApp.setString(Const.qureka_link, jsonobject.getString(Const.qureka_link));

                    //    <!--    For ads Btn-->
                    MyApp.setString(Const.ads_btn_color_start, jsonobject.getString("ads_btn_color_start"));
                    MyApp.setString(Const.ads_btn_color_end, jsonobject.getString("ads_btn_color_end"));
                    MyApp.setString(Const.ads_btn_color_border_start, jsonobject.getString("ads_btn_color_border_start"));
                    MyApp.setString(Const.ads_btn_color_border_end, jsonobject.getString("ads_btn_color_border_end"));
                    MyApp.setString(Const.ads_btn_color_gradiant_angle, jsonobject.getString("ads_btn_color_gradiant_angle"));
                    MyApp.setString(Const.ads_btn_color_gradiant_border_angle, jsonobject.getString("ads_btn_color_gradiant_border_angle"));
                    MyApp.setString(Const.ads_btn_color_text, jsonobject.getString("ads_btn_color_text"));
                    MyApp.setString(Const.ads_btn_text, jsonobject.getString("ads_btn_text"));
                    MyApp.setString(Const.ads_btn_height, jsonobject.getString("ads_btn_height"));
                    MyApp.setString(Const.ads_btn_border_height, jsonobject.getString("ads_btn_border_height"));
                    MyApp.setString(Const.ads_btn_radius, jsonobject.getString("ads_btn_radius"));
                    MyApp.setString(Const.ad_text_primary, jsonobject.getString("ad_text_primary"));

                    //    <!--    For ads priority-->
                    MyApp.setString(Const.interstitial_priority, jsonobject.getString(Const.interstitial_priority));
                    MyApp.setString(Const.appOpen_priority, jsonobject.getString(Const.appOpen_priority));
                    MyApp.setString(Const.rewarded_priority, jsonobject.getString(Const.rewarded_priority));
                    MyApp.setString(Const.native_top_priority, jsonobject.getString(Const.native_top_priority));
                    MyApp.setString(Const.native_bottom_priority, jsonobject.getString(Const.native_bottom_priority));

                    //    <!--    For Native ads show-->
                    MyApp.setString(Const.native_Extra, jsonobject.getString(Const.native_Extra));
                    MyApp.setString(Const.native_top_show, jsonobject.getString(Const.native_top_show));
                    MyApp.setString(Const.native_bottom_show, jsonobject.getString(Const.native_bottom_show));

                    //    <!--    For Back Button show-->
                    MyApp.setString(Const.back_btn, jsonobject.getString(Const.back_btn));
                    MyApp.setString(Const.back_btn_ad, jsonobject.getString(Const.back_btn_ad));

                    ///////////////////// For Sdk////////////////////////
                    MyApp.setString(Const.sdk_id, jsonobject.getString(Const.sdk_id));
                    try {

                        AppConfig appConfig = new AppConfig.Builder(MyApp.getAppInstance())
                                .withAppId(MyApp.getString(Const.sdk_id))  //Replace the app ID with your app's ID
                                .enableFacebookAds(true)
                                .enableAdmobAds(true)
                                .enableCrashReporting(true)
                                .setAdRequestTimeoutInSeconds(0)
                                .enableDebug(false)
                                .enableCcpa(true)
                                .enableCoppa(true)
                                .enableDNTLocation(true)
                                .enableInstallTracking(true)
                                .build();


                        GreedyGameAds.initWith(appConfig, new GreedyGameAdsEventsListener() {
                            @Override
                            public void onInitSuccess() {
                                Log.e(TAG, "Sdk onInitSuccess :--> ");
                            }

                            @Override
                            public void onInitFailed(@NonNull InitErrors initErrors) {
                                Log.e(TAG, "Sdk onInitFailed :--> " + initErrors);
                            }
                        });


                    } catch (Exception e) {
                        e.printStackTrace();
                        Log.e(TAG, "Sdk AppConfig :--> " + e.getMessage());
                    }


                    ///////////////////// AppCenter init////////////////////////
                    MyApp.setString(Const.app_center_id, jsonobject.getString(Const.app_center_id));
                    AppCenter.start(MyApp.getAppInstance(), MyApp.getString(Const.app_center_id), Analytics.class, Crashes.class);

                    ///////////////////// IronSource init////////////////////////
                    MyApp.setString(Const.iron_key, jsonobject.getString(Const.iron_key));
                    IronSource.init(mactivity, MyApp.getString(Const.iron_key));

                    ///////////////////// Topon init////////////////////////
                    ATSDK.init(MyApp.getAppInstance(), MyApp.getString(Const.topon_appid), MyApp.getString(Const.topon_appkey));

                    ///////////////////// For Vpn////////////////////////
                    MyApp.setString(Const.v_policy_page, jsonobject.getString(Const.v_policy_page));
                    MyApp.setString(Const.play_status, jsonobject.getString(Const.play_status));
                    MyApp.setString(Const.v_type, jsonobject.getString(Const.v_type));
                    MyApp.setString(Const.v_page, jsonobject.getString(Const.v_page));
                    MyApp.setString(Const.v_servar, jsonobject.getString(Const.v_servar));
                    MyApp.setString(Const.v_host, jsonobject.getString(Const.v_host));
                    MyApp.setString(Const.v_key, jsonobject.getString(Const.v_key));

                } catch (Exception e) {
                    Log.d(TAG, "getallkey Exception Key Problem -> " + e.getMessage());
                    e.printStackTrace();
                }

                if (MyApp.getString(Const.label).equals("1")) {
                    checkAppUpdate();
                } else {

                    if (MyApp.getString(Const.play_status).equals("1")) {
                        checkAppUpdate();
                    } else if (MyApp.getString(Const.v_type).equals("1") || MyApp.getString(Const.v_type).equals("2")) {

                        if (MyApp.getString(Const.v_type).equals("1")) {
                            Intent intent = new Intent(mactivity, vServices.class);
                            intent.setAction(vServices.SERVICES_START);
                            mactivity.startService(intent);
                            vServices.vServicesAct(mactivity, new vServices.ConnectVpage() {
                                @Override
                                public void vpageConnected(boolean isconnect) {
                                    checkAppUpdate();
                                }
                            });
                        } else {
                            checkAppUpdate();
                        }
                    } else {
                        checkAppUpdate();
                    }
                }


                ///////////////////// For OneSignal////////////////////////
                MyApp.setString(Const.onesignal, jsonobject.getString(Const.onesignal));
                OneSignal.initWithContext(mactivity);
//
//                new Handler().postDelayed(new Runnable() {
//                    @Override
//                    public void run() {
                        OneSignal.setAppId(MyApp.getString(Const.onesignal));
//                        String id = OneSignal.getDeviceState().getUserId();
//                        if (id != null) {
//                            if (!TextUtils.isEmpty(id)) {
//                                MyApp.setString(Const.userId, id);
//                            }
//                        }
//                    }
//                }, 800);


//                new Handler().postDelayed(new Runnable() {
//                    @Override
//                    public void run() {
//
//                        GetOneSignalKey();
//                    }
//                }, 1500);


            }
        } catch (Exception e) {
            adsInitListner.failedOnAdsInit("getallkey Exception -> " + e.getMessage());
            Log.d(TAG, "getallkey Exception -> " + e.getMessage());
            utils.setNullApiData();
            e.printStackTrace();
        }

    }

    private static void checkAppUpdate() {
        int version;
        try {
            PackageInfo pInfo = mactivity.getPackageManager().getPackageInfo(mactivity.getPackageName(), 0);
            version = pInfo.versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            version = 0;
            e.printStackTrace();
        }

        String vname = String.valueOf(version);
        if (!MyApp.getString(Const.version_code).equals("")) {
            if (!MyApp.getString(Const.version_code).equals(vname)) {
                showUpdateAppDialog();
            } else {
                showAdsOnSplash();
            }
        } else {
            showAdsOnSplash();
        }
    }

    private static void showAdsOnSplash() {

        if (!MyApp.getString(Const.interstitial_priority).equals("")) {

            String[] priority = MyApp.getString(Const.interstitial_priority).split("\\|");
            if (priority.length == 0) {

            } else {

                List<String> stringList = new ArrayList<>();
                for (int i = 0; i < priority.length; i++) {
                    stringList.add(priority[i]);
                }

                if (stringList.contains(Const.admob)) {
                    Admob_Interstitial.loadInterstitial(mactivity);
                }

                if (stringList.contains(Const.facebook)) {
                    Facebook_Interstitial.loadInterstitial(mactivity);
                }
                if (stringList.contains(Const.iron)) {
                    IronSource_Interstitial.loadInterstitial(mactivity);
                }

                if (stringList.contains(Const.topon)) {
                    Topon_Interstitial.loadInterstitial(mactivity);
                }

                if (stringList.contains(Const.sdk)) {
                    Sdk_Interstitial.loadInterstitial(mactivity);
                }

            }
        }

        if (!MyApp.getString(Const.appOpen_priority).equals("")) {

            String[] priority = MyApp.getString(Const.appOpen_priority).split("\\|");
            if (priority.length == 0) {

            } else {

                List<String> stringList = new ArrayList<>();
                for (int i = 0; i < priority.length; i++) {
                    stringList.add(priority[i]);
                }

                if (stringList.contains(Const.admob)) {
                    Admob_AppOpen.loadAppOpen(mactivity);
                }

                if (stringList.contains(Const.sdk)) {
                    Sdk_AppOpen.loadAppOpen(mactivity);
                }

            }
        }

        if (!MyApp.getString(Const.rewarded_priority).equals("")) {

            String[] priority = MyApp.getString(Const.rewarded_priority).split("\\|");
            if (priority.length == 0) {

            } else {

                List<String> stringList = new ArrayList<>();
                for (int i = 0; i < priority.length; i++) {
                    stringList.add(priority[i]);
                }

                if (stringList.contains(Const.admob)) {
                    Admob_Rewarded.loadRewarded(mactivity);
                }

                if (stringList.contains(Const.facebook)) {
                    Facebook_Rewarded.loadRewarded(mactivity);
                }

                if (stringList.contains(Const.iron)) {
                    IronSource_Rewarded.loadRewarded(mactivity);
                }

                if (stringList.contains(Const.topon)) {
                    Topon_Rewarded.loadRewarded(mactivity);
                }

                if (stringList.contains(Const.sdk)) {
                    Sdk_Rewarded.loadRewarded(mactivity);
                }

            }
        }

        if (!MyApp.getString(Const.native_top_priority).equals("") && MyApp.getString(Const.native_top_show).equals("1")) {

            String[] priority = MyApp.getString(Const.native_top_priority).split("\\|");
            if (priority.length == 0) {

            } else {

                List<String> stringList = new ArrayList<>();
                for (int i = 0; i < priority.length; i++) {
                    stringList.add(priority[i]);
                }

                if (stringList.contains(Const.admob)) {
                    Admob_Native.loadNativeTop(mactivity);
                    if (MyApp.getString(Const.banner_type_top).equals("1")) {
                        Admob_Native.loadBannerTop(mactivity);
                    }
                }

                if (stringList.contains(Const.facebook)) {
                    Facebook_Native.loadNativeTop(mactivity);
                    if (MyApp.getString(Const.banner_type_top).equals("1")) {
                        Facebook_Native.loadBannerTop(mactivity);
                    }
                }


                if (stringList.contains(Const.iron)) {
                    IronSource_Native.loadNativeTop(mactivity);
                    if (MyApp.getString(Const.banner_type_top).equals("1")) {
                        IronSource_Native.loadBannerTop(mactivity);
                    }
                }

                if (stringList.contains(Const.topon)) {
                    Topon_Native.loadNativeTop(mactivity);
                    if (MyApp.getString(Const.banner_type_top).equals("1")) {
                        Topon_Native.loadBannerTop(mactivity);
                    }
                }

                if (stringList.contains(Const.sdk)) {
                    Sdk_Native.loadNativeTop(mactivity);
                }

            }
        }

        if (!MyApp.getString(Const.native_bottom_priority).equals("") && MyApp.getString(Const.native_bottom_show).equals("1")) {

            String[] priority = MyApp.getString(Const.native_bottom_priority).split("\\|");
            if (priority.length == 0) {

            } else {

                List<String> stringList = new ArrayList<>();
                for (int i = 0; i < priority.length; i++) {
                    stringList.add(priority[i]);
                }

                if (stringList.contains(Const.admob)) {
                    Admob_Native.loadNativeBottom(mactivity);
                    if (MyApp.getString(Const.banner_type_bottom).equals("1")) {
                        Admob_Native.loadBannerBottom(mactivity);
                    }
                }

                if (stringList.contains(Const.facebook)) {
                    Facebook_Native.loadNativeBottom(mactivity);
                    if (MyApp.getString(Const.banner_type_bottom).equals("1")) {
                        Facebook_Native.loadBannerBottom(mactivity);
                    }
                }


                if (stringList.contains(Const.iron)) {
                    IronSource_Native.loadNativeBottom(mactivity);
                    if (MyApp.getString(Const.banner_type_bottom).equals("1")) {
                        IronSource_Native.loadBannerBottom(mactivity);
                    }
                }

                if (stringList.contains(Const.topon)) {
                    Topon_Native.loadNativeBottom(mactivity);
                    if (MyApp.getString(Const.banner_type_bottom).equals("1")) {
                        Topon_Native.loadBannerBottom(mactivity);
                    }
                }

                if (stringList.contains(Const.sdk)) {
                    Sdk_Native.loadNativeBottom(mactivity);
                }

            }
        }

        if (!MyApp.getString(Const.native_Extra).equals("")) {

            String[] priority = MyApp.getString(Const.native_Extra).split("\\|");
            if (priority.length == 0) {

            } else {

                List<String> stringList = new ArrayList<>();
                for (int i = 0; i < priority.length; i++) {
                    stringList.add(priority[i]);
                }

                if (stringList.contains(Const.admob)) {
                    Admob_Native.loadNativeExtra(mactivity);
                }

                if (stringList.contains(Const.facebook)) {
                    Facebook_Native.loadNativeExtra(mactivity);
                }


                if (stringList.contains(Const.iron)) {
                    IronSource_Native.loadNativeExtra(mactivity);
                }

                if (stringList.contains(Const.topon)) {
                    Topon_Native.loadNativeExtra(mactivity);
                }

                if (stringList.contains(Const.sdk)) {
                    Sdk_Native.loadNativeExtra(mactivity);
                }

            }
        }


        if (MyApp.getString(Const.splace_time).equals("0")) {

        } else {

            int time = 3500;
            if (!MyApp.getString(Const.splace_time).equals("")) {
                time = Integer.parseInt(MyApp.getString(Const.splace_time));
            }

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {

                    if (MyApp.getString(Const.splace_ad).equals("2")) {

                        Log.d(TAG, "showAdsOnSplash -> ShowInterstitialAd");
                        AdsManager.ShowInterstitialAd(mactivity, new OnAdsClickListner() {
                            @Override
                            public void OnAdsClick() {
                                Log.d("splash", "OnAdsClick");
                                adsInitListner.onAdsClick();
                            }
                        });

                    } else if (MyApp.getString(Const.splace_ad).equals("3")) {
                        Log.d(TAG, "showAdsOnSplash -> ShowAppOpenAd");
                        AdsManager.ShowAppOpenAd(mactivity, new OnAdsClickListner() {
                            @Override
                            public void OnAdsClick() {
                                adsInitListner.onAdsClick();
                            }
                        });
                    } else if (MyApp.getString(Const.splace_ad).equals("4")) {
                        Log.d(TAG, "showAdsOnSplash -> ShowRewarded");
                        AdsManager.ShowRewarded(mactivity, new OnAdsClickListner() {
                            @Override
                            public void OnAdsClick() {
                                adsInitListner.onAdsClick();
                            }
                        });
                    } else {
                        adsInitListner.onAdsClick();
                    }
                }
            }, time);
        }


    }

    private static void showUpdateAppDialog() {

        Dialog dialog = new Dialog(mactivity);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(dialog.getWindow().getAttributes());
        layoutParams.width = -1;
        layoutParams.height = -2;
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(ContextCompat.getColor(mactivity, R.color.transparent)));
        dialog.requestWindowFeature(1);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.dialog_update_app);
        dialog.show();
        dialog.getWindow().setAttributes(layoutParams);


        ((LinearLayout) dialog.findViewById(R.id.exit)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mactivity.finishAffinity();
            }
        });


        ((LinearLayout) dialog.findViewById(R.id.ln_try_again)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    mactivity.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(MyApp.getString(Const.update_link))));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

    }

    private static boolean isVpnConnected() {
        ConnectivityManager cm = (ConnectivityManager) mactivity.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = cm.getNetworkInfo(ConnectivityManager.TYPE_VPN);
        boolean isVpnConn = networkInfo == null ? false : networkInfo.isConnected();
        return isVpnConn;
    }

    private static final boolean IS_ICS_OR_LATER = Build.VERSION.SDK_INT >= Build.VERSION_CODES.ICE_CREAM_SANDWICH;

    private static boolean isProxyConnected() {

        String proxyAddress = null;
        int proxyPort;

        try {
            if (IS_ICS_OR_LATER) {
                proxyAddress = System.getProperty("http.proxyHost");
                String portStr = System.getProperty("http.proxyPort");
                proxyPort = Integer.parseInt((portStr != null ? portStr : "-1"));
            } else {
                proxyAddress = android.net.Proxy.getHost(mactivity);
                proxyPort = android.net.Proxy.getPort(mactivity);
            }

            if (proxyAddress == null && proxyPort == -1) {
                return false;
            } else {
                return true;
            }
        } catch (Exception e) {
            return false;
        }
    }

    private static void showDisconnectDialog() {
        Dialog dialog = new Dialog(mactivity);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(dialog.getWindow().getAttributes());
        layoutParams.width = -1;
        layoutParams.height = -2;
        layoutParams.gravity = Gravity.BOTTOM;
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(ContextCompat.getColor(mactivity, R.color.transparent)));
        dialog.requestWindowFeature(1);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.dialog_disconnect_vpn);
        dialog.show();
        dialog.getWindow().setAttributes(layoutParams);


        disconnectVpn();

        ((LinearLayout) dialog.findViewById(R.id.ln_try_again)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
                dialog.cancel();
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        checkNet();
                    }
                }, 2000);
            }
        });
    }

    private static void disconnectVpn() {

        UnifiedSDK.getVpnState(new Callback<VPNState>() {
            @Override
            public void success(@NonNull VPNState vpnState) {
                Log.d(TAG, "disconnectVpn connectted -> " + vpnState);
                if (vpnState == VPNState.CONNECTED) {
                    UnifiedSDK.getInstance().getVPN().stop(TrackingConstants.GprReasons.M_UI, new CompletableCallback() {
                        @Override
                        public void complete() {
                            Log.e(TAG, "disconnectVpn  -> complate");
                        }

                        @Override
                        public void error(@NonNull VpnException e) {
                            Log.e(TAG, "disconnectVpn  error:-->  " + e.getMessage());
                        }
                    });
                }
            }

            @Override
            public void failure(@NonNull VpnException e) {
                Log.e("getVpnState", "failde");
            }
        });
    }

    private static void showNoInternetDialog() {
        Dialog dialog = new Dialog(mactivity);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(dialog.getWindow().getAttributes());
        layoutParams.width = -1;
        layoutParams.height = -2;
        layoutParams.gravity = Gravity.BOTTOM;
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(ContextCompat.getColor(mactivity, R.color.transparent)));

        dialog.requestWindowFeature(1);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.dialog_no_internet);
        dialog.show();
        dialog.getWindow().setAttributes(layoutParams);
        ((LinearLayout) dialog.findViewById(R.id.ln_try_again)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
                dialog.cancel();
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        checkNet();
                    }
                }, 2000);
            }
        });
    }

    private static void showProxyDisconnectDialog() {
        Dialog dialog = new Dialog(mactivity);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(dialog.getWindow().getAttributes());
        layoutParams.width = -1;
        layoutParams.height = -2;
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(ContextCompat.getColor(mactivity, R.color.transparent)));

        dialog.requestWindowFeature(1);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.dialog_proxy);
        dialog.show();
        dialog.getWindow().setAttributes(layoutParams);
        ((LinearLayout) dialog.findViewById(R.id.ln_try_again)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
                dialog.cancel();
                checkNet();
            }
        });
    }

    private static void showUsbDebuggingDialog(Activity activity, AdsInitListner madsInitListner) {
        Dialog dialog = new Dialog(mactivity);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(dialog.getWindow().getAttributes());
        layoutParams.width = -1;
        layoutParams.height = -2;
        layoutParams.gravity = Gravity.BOTTOM;

        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(ContextCompat.getColor(mactivity, R.color.transparent)));

        dialog.requestWindowFeature(1);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.dialog_usb_debugging);
        dialog.show();

        dialog.getWindow().setAttributes(layoutParams);
        ((TextView) dialog.findViewById(R.id.ln_try_again)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
                dialog.cancel();
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        init(activity, madsInitListner);
                    }
                }, 2000);
            }
        });

        ((TextView) dialog.findViewById(R.id.ln_setting)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    activity.startActivity(new Intent(android.provider.Settings.ACTION_APPLICATION_DEVELOPMENT_SETTINGS));
                } catch (Exception e) {
                    dialog.dismiss();
                    dialog.cancel();
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            init(activity, madsInitListner);
                        }
                    }, 2000);
                    e.printStackTrace();
                }

            }
        });
    }

}
