package com.ironsource.d;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.text.TextUtils;
import com.ironsource.environment.a;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.p7700g.p99005.k21;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class a {
    private static a a;
    private final HashSet<ImpressionDataListener> b = new HashSet<>();
    private ConcurrentHashMap<String, List<String>> c = new ConcurrentHashMap<>();

    public static synchronized a a() {
        a aVar;
        synchronized (a.class) {
            if (a == null) {
                a = new a();
            }
            aVar = a;
        }
        return aVar;
    }

    public static String a(Context context) {
        return Build.VERSION.SDK_INT >= 23 ? a(b(context), context) : d(context);
    }

    @SuppressLint({"MissingPermission"})
    public static String a(Network network, Context context) {
        String str;
        if (context == null) {
            return "none";
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (network == null || connectivityManager == null) {
            return "none";
        }
        try {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
            if (networkCapabilities == null) {
                return d(context);
            }
            if (networkCapabilities.hasTransport(1)) {
                str = k21.b;
            } else if (!networkCapabilities.hasTransport(0)) {
                return d(context);
            } else {
                str = "3g";
            }
            return str;
        } catch (Exception e) {
            e.printStackTrace();
            return "none";
        }
    }

    @SuppressLint({"MissingPermission"})
    public static JSONObject a(Context context, Network network) {
        NetworkCapabilities networkCapabilities;
        if (context == null) {
            return new JSONObject();
        }
        JSONObject jSONObject = new JSONObject();
        if (Build.VERSION.SDK_INT >= 23 && network != null) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(network)) != null) {
                    jSONObject.put("networkCapabilities", networkCapabilities.toString());
                    jSONObject.put("downloadSpeed", networkCapabilities.getLinkDownstreamBandwidthKbps());
                    jSONObject.put("uploadSpeed", networkCapabilities.getLinkUpstreamBandwidthKbps());
                    jSONObject.put("hasVPN", c(context));
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return jSONObject;
    }

    @SuppressLint({"MissingPermission"})
    public static Network b(Context context) {
        if (context == null) {
            return null;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (Build.VERSION.SDK_INT >= 23 && connectivityManager != null) {
            try {
                return connectivityManager.getActiveNetwork();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    @SuppressLint({"MissingPermission"})
    private static String c(Context context, Network network) {
        NetworkCapabilities networkCapabilities;
        if (Build.VERSION.SDK_INT >= 23 && network != null && context != null) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(network)) == null) {
                    return "";
                }
                if (networkCapabilities.hasTransport(1)) {
                    return k21.b;
                }
                if (networkCapabilities.hasTransport(0)) {
                    return "cellular";
                }
                if (networkCapabilities.hasTransport(4)) {
                    return "vpn";
                }
                if (networkCapabilities.hasTransport(3)) {
                    return "ethernet";
                }
                if (networkCapabilities.hasTransport(5)) {
                    return "wifiAware";
                }
                if (networkCapabilities.hasTransport(6)) {
                    return "lowpan";
                }
                if (networkCapabilities.hasTransport(2)) {
                    return "bluetooth";
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return "";
    }

    public static boolean c(Context context) {
        return c(context, b(context)).equals("vpn");
    }

    private static String d(Context context) {
        String a2 = a.AnonymousClass1.a(context);
        return TextUtils.isEmpty(a2) ? "none" : a2;
    }

    public void a(ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.b.add(impressionDataListener);
        }
    }

    public void a(String str, List<String> list) {
        this.c.put(str, list);
    }

    public HashSet<ImpressionDataListener> b() {
        return this.b;
    }

    public void b(ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.b.remove(impressionDataListener);
        }
    }

    public void c() {
        synchronized (this) {
            this.b.clear();
        }
    }

    public ConcurrentHashMap<String, List<String>> d() {
        return this.c;
    }
}