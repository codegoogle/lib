package com.ironsource.mediationsdk.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.ironsource.mediationsdk.AbstractC1270b;
import com.ironsource.mediationsdk.C1283q;
import com.ironsource.mediationsdk.H;
import com.ironsource.mediationsdk.K;
import com.ironsource.mediationsdk.L;
import com.ironsource.mediationsdk.adunit.data.DataKeys;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.microsoft.appcenter.AppCenter;
import com.p7700g.p99005.k21;
import com.p7700g.p99005.wo1;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class IronSourceUtils {
    public static final int NOT_SAVED_NUMBER_SHARED_PREFERENCE = -1;
    private static final String a = "default_is_events_formatter_type";
    private static final String b = "default_is_events_url";
    private static final String c = "default_is_non_connectivity_events";
    private static final String d = "default_is_opt_in_events";
    private static final String e = "default_is_opt_out_events";
    private static final String f = "default_is_trigger_events";
    private static final String g = "default_rv_events_formatter_type";
    private static final String h = "default_rv_events_url";
    private static final String i = "default_rv_non_connectivity_events";
    private static final String j = "default_rv_opt_in_events";
    private static final String k = "default_rv_opt_out_events";
    private static final String l = "default_rv_trigger_events";
    private static final String m = "default_pxl_events_url";
    private static final String n = "default_pxl_trigger_events";
    private static final String o = "general_properties";
    private static final String p = "last_response";
    private static final String q = "firstSessionTimestamp";
    private static final String r = "providerPriority";
    private static final String s = "7.2.4.1";
    private static final String t = "Mediation_Shared_Preferences";
    private static int u = 1;
    private static AtomicBoolean v = new AtomicBoolean(false);
    private static String w = null;
    private static Boolean x = null;
    private static IronSourceUtils y = new IronSourceUtils();

    public static boolean a(Context context, String str, boolean z) {
        return context.getSharedPreferences(t, 0).getBoolean(str, z);
    }

    @Deprecated
    private static JSONObject b(Context context) {
        try {
            return new JSONObject(getLastResponse(context));
        } catch (JSONException unused) {
            return new JSONObject();
        }
    }

    private static String c(String str) {
        return IronSourceConstants.INTERSTITIAL_EVENT_TYPE.equals(str) ? b : IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE.equals(str) ? h : IronSourceConstants.PIXEL_EVENT_TYPE.equals(str) ? m : "";
    }

    public static void createAndStartWorker(Runnable runnable, String str) {
        Thread thread = new Thread(runnable, str);
        thread.setUncaughtExceptionHandler(new com.ironsource.mediationsdk.logger.c());
        thread.start();
    }

    private static String d(String str) {
        return IronSourceConstants.INTERSTITIAL_EVENT_TYPE.equals(str) ? a : (IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE.equals(str) || IronSourceConstants.PIXEL_EVENT_TYPE.equals(str)) ? g : "";
    }

    public static boolean doesClassExist(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static String e(String str) {
        return IronSourceConstants.INTERSTITIAL_EVENT_TYPE.equals(str) ? c : IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE.equals(str) ? i : "";
    }

    private static String f(String str) {
        return IronSourceConstants.INTERSTITIAL_EVENT_TYPE.equals(str) ? d : IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE.equals(str) ? j : "";
    }

    private static String g(String str) {
        return IronSourceConstants.INTERSTITIAL_EVENT_TYPE.equals(str) ? e : IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE.equals(str) ? k : "";
    }

    public static String getBase64Auth(String str, String str2) {
        String u2 = wo1.u(str, ":", str2);
        return "Basic " + Base64.encodeToString(u2.getBytes(), 10);
    }

    @Deprecated
    public static String getCachedValueByKeyOfCachedInitResponse(Context context, String str) {
        return b(context).optString(str);
    }

    public static String getConnectionType(Context context) {
        ConnectivityManager connectivityManager;
        if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return "none";
        }
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                if (networkCapabilities == null) {
                    return "none";
                }
                if (networkCapabilities.hasTransport(1)) {
                    return k21.b;
                }
                if (networkCapabilities.hasTransport(0)) {
                    return "cellular";
                }
            } else {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                    if (activeNetworkInfo.getTypeName().equalsIgnoreCase("WIFI")) {
                        return k21.b;
                    }
                    if (activeNetworkInfo.getTypeName().equalsIgnoreCase("MOBILE")) {
                        return "cellular";
                    }
                }
            }
            return "none";
        } catch (Exception e2) {
            IronLog ironLog = IronLog.NATIVE;
            ironLog.error("failed to connection type - exception = " + e2);
            return "none";
        }
    }

    public static String getCurrentMethodName() {
        try {
            return new Throwable().getStackTrace()[1].getMethodName();
        } catch (Exception unused) {
            return "";
        }
    }

    public static int getCurrentTimestamp() {
        return (int) (System.currentTimeMillis() / 1000);
    }

    public static synchronized String getDefaultEventsFormatterType(Context context, String str, String str2) {
        synchronized (IronSourceUtils.class) {
            try {
                str2 = context.getSharedPreferences(t, 0).getString(d(str), str2);
            } catch (Exception e2) {
                IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
                logger.logException(ironSourceTag, "IronSourceUtils:getDefaultEventsFormatterType(eventType: " + str + ", defaultFormatterType:" + str2 + ")", e2);
            }
        }
        return str2;
    }

    public static synchronized String getDefaultEventsURL(Context context, String str, String str2) {
        synchronized (IronSourceUtils.class) {
            try {
                str2 = context.getSharedPreferences(t, 0).getString(c(str), str2);
            } catch (Exception e2) {
                IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
                logger.logException(ironSourceTag, "IronSourceUtils:getDefaultEventsURL(eventType: " + str + ", defaultEventsURL:" + str2 + ")", e2);
            }
        }
        return str2;
    }

    public static synchronized int[] getDefaultNonConnectivityEvents(Context context, String str) {
        int[] iArr;
        synchronized (IronSourceUtils.class) {
            iArr = null;
            try {
                String string = context.getSharedPreferences(t, 0).getString(e(str), null);
                if (!TextUtils.isEmpty(string)) {
                    StringTokenizer stringTokenizer = new StringTokenizer(string, ",");
                    ArrayList arrayList = new ArrayList();
                    while (stringTokenizer.hasMoreTokens()) {
                        arrayList.add(Integer.valueOf(Integer.parseInt(stringTokenizer.nextToken())));
                    }
                    int size = arrayList.size();
                    iArr = new int[size];
                    for (int i2 = 0; i2 < size; i2++) {
                        iArr[i2] = ((Integer) arrayList.get(i2)).intValue();
                    }
                }
            } catch (Exception e2) {
                IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
                logger.logException(ironSourceTag, "IronSourceUtils:getDefaultNonConnectivityEvents(eventType: " + str + ")", e2);
            }
        }
        return iArr;
    }

    public static synchronized int[] getDefaultOptInEvents(Context context, String str) {
        int[] iArr;
        synchronized (IronSourceUtils.class) {
            iArr = null;
            try {
                String string = context.getSharedPreferences(t, 0).getString(f(str), null);
                if (!TextUtils.isEmpty(string)) {
                    StringTokenizer stringTokenizer = new StringTokenizer(string, ",");
                    ArrayList arrayList = new ArrayList();
                    while (stringTokenizer.hasMoreTokens()) {
                        arrayList.add(Integer.valueOf(Integer.parseInt(stringTokenizer.nextToken())));
                    }
                    int size = arrayList.size();
                    iArr = new int[size];
                    for (int i2 = 0; i2 < size; i2++) {
                        iArr[i2] = ((Integer) arrayList.get(i2)).intValue();
                    }
                }
            } catch (Exception e2) {
                IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
                logger.logException(ironSourceTag, "IronSourceUtils:getDefaultOptInEvents(eventType: " + str + ")", e2);
            }
        }
        return iArr;
    }

    public static synchronized int[] getDefaultOptOutEvents(Context context, String str) {
        int[] iArr;
        synchronized (IronSourceUtils.class) {
            iArr = null;
            try {
                String string = context.getSharedPreferences(t, 0).getString(g(str), null);
                if (!TextUtils.isEmpty(string)) {
                    StringTokenizer stringTokenizer = new StringTokenizer(string, ",");
                    ArrayList arrayList = new ArrayList();
                    while (stringTokenizer.hasMoreTokens()) {
                        arrayList.add(Integer.valueOf(Integer.parseInt(stringTokenizer.nextToken())));
                    }
                    int size = arrayList.size();
                    iArr = new int[size];
                    for (int i2 = 0; i2 < size; i2++) {
                        iArr[i2] = ((Integer) arrayList.get(i2)).intValue();
                    }
                }
            } catch (Exception e2) {
                IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
                logger.logException(ironSourceTag, "IronSourceUtils:getDefaultOptOutEvents(eventType: " + str + ")", e2);
            }
        }
        return iArr;
    }

    public static synchronized int[] getDefaultTriggerEvents(Context context, String str) {
        int[] iArr;
        synchronized (IronSourceUtils.class) {
            iArr = null;
            try {
                String string = context.getSharedPreferences(t, 0).getString(h(str), null);
                if (!TextUtils.isEmpty(string)) {
                    StringTokenizer stringTokenizer = new StringTokenizer(string, ",");
                    ArrayList arrayList = new ArrayList();
                    while (stringTokenizer.hasMoreTokens()) {
                        arrayList.add(Integer.valueOf(Integer.parseInt(stringTokenizer.nextToken())));
                    }
                    int size = arrayList.size();
                    iArr = new int[size];
                    for (int i2 = 0; i2 < size; i2++) {
                        iArr[i2] = ((Integer) arrayList.get(i2)).intValue();
                    }
                }
            } catch (Exception e2) {
                IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
                logger.logException(ironSourceTag, "IronSourceUtils:getDefaultTriggerEvents(eventType: " + str + ")", e2);
            }
        }
        return iArr;
    }

    public static String getDeviceType(Context context) {
        return com.ironsource.environment.h.c(context) ? "Tablet" : "Phone";
    }

    public static boolean getFirstSession(Context context) {
        if (x == null) {
            x = Boolean.valueOf(!H.b(context));
        }
        return x.booleanValue();
    }

    public static long getFirstSessionTimestamp(Context context) {
        if (context == null) {
            return -1L;
        }
        return context.getSharedPreferences(t, 0).getLong("firstSessionTimestamp", -1L);
    }

    public static synchronized JSONObject getGeneralProperties(Context context) {
        synchronized (IronSourceUtils.class) {
            JSONObject jSONObject = new JSONObject();
            if (context == null) {
                return jSONObject;
            }
            try {
                jSONObject = new JSONObject(context.getSharedPreferences(t, 0).getString(o, jSONObject.toString()));
            } catch (JSONException unused) {
            }
            return jSONObject;
        }
    }

    public static IronSourceUtils getInstance() {
        return y;
    }

    public static K getIronSourceAdvId(Context context) {
        String str;
        if (context != null) {
            L.a();
            String a2 = L.a(context);
            if (TextUtils.isEmpty(a2)) {
                a2 = com.ironsource.environment.h.x(context);
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "using custom identifier", 0);
                str = IronSourceConstants.TYPE_UUID;
            } else {
                str = IronSourceConstants.TYPE_GAID;
            }
            return new K(a2, str);
        }
        return null;
    }

    public static JSONObject getJsonForMetaData(String str, List<String> list, List<String> list2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            for (int i3 = 0; i2 < list.size() && i3 < list2.size(); i3++) {
                String str2 = list.get(i2);
                String str3 = list2.get(i3);
                if (!TextUtils.isEmpty(str3) && !str2.equals(str3)) {
                    str2 = str2 + AppCenter.PAIR_DELIMITER + str3;
                }
                arrayList.add(str2);
                i2++;
            }
            jSONObject.put(IronSourceConstants.EVENTS_EXT1, str + AppCenter.PAIR_DELIMITER + TextUtils.join(",", arrayList));
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public static JSONObject getJsonForUserId(boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
            if (z) {
                jSONObject.put(IronSourceConstants.EVENTS_EXT1, "dynamic");
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public static String getLastResponse(Context context) {
        return context.getSharedPreferences(t, 0).getString(p, "");
    }

    public static String getMD5(String str) {
        try {
            String bigInteger = new BigInteger(1, MessageDigest.getInstance("MD5").digest(str.getBytes())).toString(16);
            while (bigInteger.length() < 32) {
                bigInteger = "0" + bigInteger;
            }
            return bigInteger;
        } catch (Throwable th) {
            if (str == null) {
                IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getMD5(input:null)", th);
                return "";
            }
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getMD5(input:" + str + ")", th);
            return "";
        }
    }

    public static JSONObject getMediationAdditionalData(boolean z) {
        return getMediationAdditionalData(z, false, 1);
    }

    public static JSONObject getMediationAdditionalData(boolean z, boolean z2, int i2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
            if (z) {
                jSONObject.put(IronSourceConstants.EVENTS_DEMAND_ONLY, 1);
            }
            if (z2 && i2 != -1) {
                jSONObject.put(IronSourceConstants.EVENTS_PROGRAMMATIC, i2);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public static String getMediationUserId() {
        return com.ironsource.mediationsdk.sdk.e.a().a(DataKeys.USER_ID);
    }

    public static JSONObject getProviderAdditionalData(AbstractC1270b abstractC1270b) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(r, abstractC1270b.n);
            jSONObject.put(IronSourceConstants.EVENTS_SUB_PROVIDER_ID, abstractC1270b.f);
            jSONObject.put(IronSourceConstants.EVENTS_PROVIDER, !TextUtils.isEmpty(abstractC1270b.g) ? abstractC1270b.g : abstractC1270b.j());
            jSONObject.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, abstractC1270b.b.getCoreSDKVersion());
            jSONObject.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, abstractC1270b.b.getVersion());
        } catch (Exception e2) {
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
            logger.logException(ironSourceTag, "IronSourceUtils:getProviderAdditionalData(adapter: " + abstractC1270b.j() + ")", e2);
        }
        return jSONObject;
    }

    public static JSONObject getProviderAdditionalData(C1283q c1283q) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(IronSourceConstants.EVENTS_SUB_PROVIDER_ID, c1283q.b.getSubProviderId());
            jSONObject.put(IronSourceConstants.EVENTS_PROVIDER, !TextUtils.isEmpty(c1283q.b.getAdSourceNameForEvents()) ? c1283q.b.getAdSourceNameForEvents() : c1283q.a());
            jSONObject.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, c1283q.a.getCoreSDKVersion());
            jSONObject.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, c1283q.a.getVersion());
            jSONObject.put(r, c1283q.f);
        } catch (Exception e2) {
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
            logger.logException(ironSourceTag, "IronSourceUtils:getProviderAdditionalData(adapter: " + c1283q.a() + ")", e2);
        }
        return jSONObject;
    }

    public static String getSDKVersion() {
        return "7.2.4.1";
    }

    public static String getSHA256(String str) {
        try {
            return String.format("%064x", new BigInteger(1, MessageDigest.getInstance("SHA-256").digest(str.getBytes())));
        } catch (NoSuchAlgorithmException e2) {
            if (str == null) {
                IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getSHA256(input:null)", e2);
                return "";
            }
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
            logger.logException(ironSourceTag, "getSHA256(input:" + str + ")", e2);
            return "";
        }
    }

    public static int getSerr() {
        return u;
    }

    public static synchronized String getSessionId() {
        String str;
        synchronized (IronSourceUtils.class) {
            if (v.compareAndSet(false, true)) {
                w = UUID.randomUUID().toString();
            }
            str = w;
        }
        return str;
    }

    public static long getTimeStamp() {
        return System.currentTimeMillis();
    }

    public static String getTransId(long j2, String str) {
        return getSHA256(String.format("%s%s%s", Long.valueOf(j2), L.a().j, str));
    }

    public static String getUserIdForNetworks() {
        String a2 = com.ironsource.mediationsdk.sdk.e.a().a("userIdType");
        String a3 = com.ironsource.mediationsdk.sdk.e.a().a(DataKeys.USER_ID);
        if (a2 == null || !a2.equals(IronSourceConstants.TYPE_USER_GENERATED) || TextUtils.isEmpty(a3)) {
            return null;
        }
        return a3;
    }

    private static String h(String str) {
        return IronSourceConstants.INTERSTITIAL_EVENT_TYPE.equals(str) ? f : IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE.equals(str) ? l : IronSourceConstants.PIXEL_EVENT_TYPE.equals(str) ? n : "";
    }

    public static int i(Context context, String str, int i2) {
        return context.getSharedPreferences(t, 0).getInt(str, i2);
    }

    public static boolean isAndroidXAvailable() {
        return doesClassExist("androidx.appcompat.app.AppCompatActivity") || doesClassExist("androidx.core.app.CoreComponentFactory") || doesClassExist("androidx.fragment.app.Fragment") || doesClassExist("androidx.lifecycle.LiveData") || doesClassExist("androidx.annotation.Keep");
    }

    public static boolean isGooglePlayInstalled(Context context) {
        return com.ironsource.environment.k.a(context);
    }

    @Deprecated
    public static boolean isInitResponseCached(Context context) {
        return (TextUtils.isEmpty(getCachedValueByKeyOfCachedInitResponse(context, "appKey")) || TextUtils.isEmpty(getCachedValueByKeyOfCachedInitResponse(context, DataKeys.USER_ID)) || TextUtils.isEmpty(getCachedValueByKeyOfCachedInitResponse(context, "response"))) ? false : true;
    }

    public static boolean isNetworkConnected(Context context) {
        ConnectivityManager connectivityManager;
        if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return false;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return false;
            }
            return activeNetworkInfo.isConnected();
        } catch (Exception e2) {
            IronLog ironLog = IronLog.NATIVE;
            ironLog.error("failed to check if network is connected - exception = " + e2);
            return false;
        }
    }

    public static long j(Context context, String str, long j2) {
        return context.getSharedPreferences(t, 0).getLong(str, j2);
    }

    public static String k(Context context, String str, String str2) {
        return context.getSharedPreferences(t, 0).getString(str, str2);
    }

    public static void l(Context context, String str, boolean z) {
        SharedPreferences.Editor edit = context.getSharedPreferences(t, 0).edit();
        edit.putBoolean(str, z);
        edit.apply();
    }

    public static synchronized void m(Context context, JSONObject jSONObject) {
        synchronized (IronSourceUtils.class) {
            if (context == null || jSONObject == null) {
                return;
            }
            SharedPreferences.Editor edit = context.getSharedPreferences(t, 0).edit();
            edit.putString(o, jSONObject.toString());
            edit.apply();
        }
    }

    public static JSONObject mergeJsons(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        if (jSONObject == null && jSONObject2 == null) {
            return new JSONObject();
        }
        if (jSONObject == null) {
            return jSONObject2;
        }
        if (jSONObject2 == null) {
            return jSONObject;
        }
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (!jSONObject.has(next)) {
                jSONObject.put(next, jSONObject2.get(next));
            }
        }
        return jSONObject;
    }

    public static void n(Context context, String str, int i2) {
        SharedPreferences.Editor edit = context.getSharedPreferences(t, 0).edit();
        edit.putInt(str, i2);
        edit.apply();
    }

    public static void o(Context context, String str, long j2) {
        SharedPreferences.Editor edit = context.getSharedPreferences(t, 0).edit();
        edit.putLong(str, j2);
        edit.apply();
    }

    public static void p(Context context, String str, String str2) {
        SharedPreferences.Editor edit = context.getSharedPreferences(t, 0).edit();
        edit.putString(str, str2);
        edit.apply();
    }

    public static Vector<Pair<String, String>> parseJsonToPairVector(JSONObject jSONObject) {
        Vector<Pair<String, String>> vector = new Vector<>();
        try {
            if (jSONObject != JSONObject.NULL) {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (!jSONObject.get(next).toString().isEmpty()) {
                        vector.add(new Pair<>(next, jSONObject.get(next).toString()));
                    }
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return vector;
    }

    public static Map<String, String> parseJsonToStringMap(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        try {
            if (jSONObject != JSONObject.NULL) {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (!jSONObject.get(next).toString().isEmpty()) {
                        hashMap.put(next, jSONObject.get(next).toString());
                    }
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return hashMap;
    }

    private static void q(int i2) {
        u = i2;
    }

    public static synchronized void saveDefaultEventsFormatterType(Context context, String str, String str2) {
        synchronized (IronSourceUtils.class) {
            try {
                SharedPreferences.Editor edit = context.getSharedPreferences(t, 0).edit();
                edit.putString(d(str), str2);
                edit.commit();
            } catch (Exception e2) {
                IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
                logger.logException(ironSourceTag, "IronSourceUtils:saveDefaultEventsFormatterType(eventType: " + str + ", formatterType:" + str2 + ")", e2);
            }
        }
    }

    public static synchronized void saveDefaultEventsURL(Context context, String str, String str2) {
        synchronized (IronSourceUtils.class) {
            try {
                SharedPreferences.Editor edit = context.getSharedPreferences(t, 0).edit();
                edit.putString(c(str), str2);
                edit.commit();
            } catch (Exception e2) {
                IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
                logger.logException(ironSourceTag, "IronSourceUtils:saveDefaultEventsURL(eventType: " + str + ", eventsUrl:" + str2 + ")", e2);
            }
        }
    }

    public static synchronized void saveDefaultNonConnectivityEvents(Context context, String str, int[] iArr) {
        synchronized (IronSourceUtils.class) {
            try {
                SharedPreferences.Editor edit = context.getSharedPreferences(t, 0).edit();
                String str2 = null;
                if (iArr != null) {
                    StringBuilder sb = new StringBuilder();
                    for (int i2 : iArr) {
                        sb.append(i2);
                        sb.append(",");
                    }
                    str2 = sb.toString();
                }
                edit.putString(e(str), str2);
                edit.commit();
            } catch (Exception e2) {
                IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:saveDefaultNonConnectivityEvents(eventType: " + str + ", nonConnectivityEvents:" + iArr + ")", e2);
            }
        }
    }

    public static synchronized void saveDefaultOptInEvents(Context context, String str, int[] iArr) {
        synchronized (IronSourceUtils.class) {
            try {
                SharedPreferences.Editor edit = context.getSharedPreferences(t, 0).edit();
                String str2 = null;
                if (iArr != null) {
                    StringBuilder sb = new StringBuilder();
                    for (int i2 : iArr) {
                        sb.append(i2);
                        sb.append(",");
                    }
                    str2 = sb.toString();
                }
                edit.putString(f(str), str2);
                edit.commit();
            } catch (Exception e2) {
                IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:saveDefaultOptInEvents(eventType: " + str + ", optInEvents:" + iArr + ")", e2);
            }
        }
    }

    public static synchronized void saveDefaultOptOutEvents(Context context, String str, int[] iArr) {
        synchronized (IronSourceUtils.class) {
            try {
                SharedPreferences.Editor edit = context.getSharedPreferences(t, 0).edit();
                String str2 = null;
                if (iArr != null) {
                    StringBuilder sb = new StringBuilder();
                    for (int i2 : iArr) {
                        sb.append(i2);
                        sb.append(",");
                    }
                    str2 = sb.toString();
                }
                edit.putString(g(str), str2);
                edit.commit();
            } catch (Exception e2) {
                IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:saveDefaultOptOutEvents(eventType: " + str + ", optOutEvents:" + iArr + ")", e2);
            }
        }
    }

    public static synchronized void saveDefaultTriggerEvents(Context context, String str, int[] iArr) {
        synchronized (IronSourceUtils.class) {
            try {
                SharedPreferences.Editor edit = context.getSharedPreferences(t, 0).edit();
                String str2 = null;
                if (iArr != null) {
                    StringBuilder sb = new StringBuilder();
                    for (int i2 : iArr) {
                        sb.append(i2);
                        sb.append(",");
                    }
                    str2 = sb.toString();
                }
                edit.putString(h(str), str2);
                edit.commit();
            } catch (Exception e2) {
                IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:saveDefaultTriggerEvents(eventType: " + str + ", triggerEvents:" + iArr + ")", e2);
            }
        }
    }

    public static void saveFirstSessionTimestamp(Context context, long j2) {
        if (context == null) {
            return;
        }
        SharedPreferences.Editor edit = context.getSharedPreferences(t, 0).edit();
        edit.putLong("firstSessionTimestamp", j2);
        edit.apply();
    }

    public static synchronized void saveLastResponse(Context context, String str) {
        synchronized (IronSourceUtils.class) {
            SharedPreferences.Editor edit = context.getSharedPreferences(t, 0).edit();
            edit.putString(p, str);
            edit.apply();
        }
    }

    public static synchronized void sendAutomationLog(String str) {
        synchronized (IronSourceUtils.class) {
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "automation_log:" + Long.toString(System.currentTimeMillis()) + " text: " + str, 0);
        }
    }
}