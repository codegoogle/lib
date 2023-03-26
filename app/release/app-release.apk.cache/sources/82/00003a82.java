package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;

/* compiled from: AndroidUtils.java */
/* loaded from: classes.dex */
public class b81 {
    @x1
    public static String a(@x1 Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            return "";
        }
    }

    @z1
    @SuppressLint({"MissingPermission"})
    private static NetworkInfo b(@x1 Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager != null) {
            return connectivityManager.getActiveNetworkInfo();
        }
        return null;
    }

    @x1
    @SuppressLint({"MissingPermission"})
    public static String c(@x1 Context context) {
        WifiInfo connectionInfo;
        try {
            WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService(k21.b);
            if (wifiManager == null || !wifiManager.isWifiEnabled() || (connectionInfo = wifiManager.getConnectionInfo()) == null) {
                return "";
            }
            NetworkInfo.DetailedState detailedStateOf = WifiInfo.getDetailedStateOf(connectionInfo.getSupplicantState());
            return (detailedStateOf == NetworkInfo.DetailedState.CONNECTED || detailedStateOf == NetworkInfo.DetailedState.OBTAINING_IPADDR) ? connectionInfo.getSSID() : "";
        } catch (Exception unused) {
            return "";
        }
    }

    @x1
    public static String d(@x1 Context context) {
        NetworkInfo b = b(context);
        if (b != null && b.getState() != null) {
            return b.getState().name();
        }
        return NetworkInfo.State.UNKNOWN.name();
    }

    @x1
    public static String e(@x1 Context context) {
        NetworkInfo b = b(context);
        if (b == null || b.getState() != NetworkInfo.State.CONNECTED) {
            return "UNKNOWN";
        }
        int type = b.getType();
        if (type != 17) {
            switch (type) {
                case 0:
                    return "MOBILE";
                case 1:
                    return "WIFI";
                case 2:
                    return "MOBILE_MMS";
                case 3:
                    return "MOBILE_SUPL";
                case 4:
                    return "MOBILE_DUN";
                case 5:
                    return "MOBILE_HIPRI";
                case 6:
                    return "WIMAX";
                case 7:
                    return "BLUETOOTH";
                case 8:
                    return "DUMMY";
                case 9:
                    return "ETHERNET";
                default:
                    return "UNKNOWN";
            }
        }
        return "VPN";
    }

    @x1
    public static String f() {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://api.ipify.org").openConnection();
            httpURLConnection.setRequestMethod("GET");
            StringBuilder sb = new StringBuilder();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), Charset.forName("UTF-8")));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine);
                } else {
                    bufferedReader.close();
                    return sb.toString();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}