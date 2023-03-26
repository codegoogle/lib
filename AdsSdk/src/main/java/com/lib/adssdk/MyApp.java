package com.lib.adssdk;

import static android.content.Context.MODE_PRIVATE;

import android.app.Application;
import android.content.SharedPreferences;
import android.os.Build;


import android.webkit.WebView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatDelegate;

import com.anchorfree.partner.api.ClientInfo;
import com.anchorfree.sdk.HydraTransportConfig;
import com.anchorfree.sdk.SdkInfo;
import com.anchorfree.sdk.TransportConfig;
import com.anchorfree.sdk.UnifiedSDK;
import com.anchorfree.sdk.UnifiedSDKConfig;
import com.anchorfree.vpnsdk.callbacks.Callback;
import com.anchorfree.vpnsdk.callbacks.CompletableCallback;
import com.anchorfree.vpnsdk.exceptions.VpnException;


import com.facebook.ads.AudienceNetworkAds;
import com.google.android.gms.ads.MobileAds;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.lib.adssdk.Model.QurekaIntModel;
import com.lib.adssdk.Utils.AppObserve;
import com.lib.adssdk.Utils.Const;
import com.lib.adssdk.Utils.utils;
import com.northghost.caketube.OpenVpnTransportConfig;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class MyApp {

    private static SharedPreferences sharedPreferences;
    private static SharedPreferences.Editor editor;
    private static MyApp mAppInstance;
    private static String TAG = "MyApp";
    private static Application application;


    public void MyApp() {
        mAppInstance = this;
    }


    public void init(Application application) {

        mAppInstance = this;
        this.application = application;

        ///////////////////// For Topon////////////////////////
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
            String processName = application.getProcessName();
            if (!application.getPackageName().equals(processName)) {
                WebView.setDataDirectorySuffix(processName);
            }
        }


        MobileAds.initialize(application);
        AudienceNetworkAds.initialize(application);

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);

        sharedPreferences = application.getSharedPreferences("MyAds", MODE_PRIVATE);
        editor = sharedPreferences.edit();

        ///////////////////// Background Ads////////////////////////
        AppObserve appObserve = new AppObserve(application);



    }


    ///////////////////// For Vpn////////////////////////
    public static Application getAppInstance() {
        return application;
    }

    public static MyApp getMyAppInstance() {
        return mAppInstance;
    }


    public interface VpnInit {
        public void init();
    }

    public void initHydraSdk(VpnInit vpnInit) {

        String v_host = MyApp.getString(Const.v_host);
        String v_key = utils.get_vKey();

        ClientInfo clientInfo = ClientInfo.newBuilder()
                .baseUrl(v_host)
                .carrierId(v_key)
                .build();

        List<TransportConfig> transportConfigList = new ArrayList<>();
        transportConfigList.add(HydraTransportConfig.create());
        transportConfigList.add(OpenVpnTransportConfig.tcp());
        transportConfigList.add(OpenVpnTransportConfig.udp());
        UnifiedSDK.update(transportConfigList, CompletableCallback.EMPTY);

        UnifiedSDKConfig config = UnifiedSDKConfig.newBuilder().idfaEnabled(false).build();
        UnifiedSDK.getInstance(clientInfo, config);

        try {
            UnifiedSDK.getInstance().getInfo(new Callback<SdkInfo>() {
                @Override
                public void success(@NonNull SdkInfo sdkInfo) {
                    vpnInit.init();
                }

                @Override
                public void failure(@NonNull VpnException e) {
                    vpnInit.init();
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    ///////////////////// For Vpn////////////////////////


    public static String getString(String key) {
        return sharedPreferences.getString(key, "");
    }

    public static void setString(String key, String value) {
        editor.putString(key, value.trim());
        editor.commit();
    }

    public static List<QurekaIntModel> getQurekaIntList() {
        Gson gson = new Gson();
        String json = sharedPreferences.getString("QurekaIntList", "");
        Type type = new TypeToken<List<QurekaIntModel>>() {
        }.getType();
        List<QurekaIntModel> students = gson.fromJson(json, type);
        return students;
    }

    public static void setQurekaIntList(List<QurekaIntModel> QurekaIntList) {
        Gson gson = new Gson();
        String json = gson.toJson(QurekaIntList);
        editor.putString("QurekaIntList", json);
        editor.commit();
    }

}
