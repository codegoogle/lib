package com.p7700g.p99005;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* compiled from: NetworkTools.java */
/* loaded from: classes3.dex */
public class aq5 {
    private static final String a = "com.p7700g.p99005.aq5";

    public static boolean a(Context context) {
        String str = a;
        bq5.a(str, "Testing connectivity:");
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        NetworkInfo networkInfo = connectivityManager.getNetworkInfo(1);
        if (networkInfo != null && networkInfo.isConnected()) {
            bq5.a(str, "Connected to Internet");
            return true;
        }
        NetworkInfo networkInfo2 = connectivityManager.getNetworkInfo(0);
        if (networkInfo2 != null && networkInfo2.isConnected()) {
            bq5.a(str, "Connected to Internet");
            return true;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            bq5.a(str, "Connected to Internet");
            return true;
        }
        bq5.a(str, "No Internet connection");
        return false;
    }
}