package com.facebook.ads.internal.dynamicloading;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.p7700g.p99005.pt0;
import com.p7700g.p99005.sm4;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class DexLoadErrorReporter {
    public static final double SAMPLING = 0.1d;
    private static final String a = "https://www.facebook.com/adnw_logging/";
    private static final AtomicBoolean b = new AtomicBoolean();

    /* loaded from: classes2.dex */
    public static class a extends Thread {
        public final /* synthetic */ Context s;
        public final /* synthetic */ String t;

        public a(Context context, String str) {
            this.s = context;
            this.t = str;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            InputStream inputStream;
            HttpURLConnection httpURLConnection;
            String jSONObject;
            DataOutputStream dataOutputStream;
            super.run();
            DataOutputStream dataOutputStream2 = null;
            InputStream inputStream2 = null;
            dataOutputStream2 = null;
            try {
                httpURLConnection = (HttpURLConnection) new URL(DexLoadErrorReporter.a).openConnection();
                try {
                    httpURLConnection.setRequestMethod("POST");
                    httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8");
                    httpURLConnection.setRequestProperty(sm4.a, "application/json");
                    httpURLConnection.setRequestProperty(sm4.b, "UTF-8");
                    httpURLConnection.setRequestProperty("user-agent", "[FBAN/AudienceNetworkForAndroid;FBSN/Android]");
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.setDoInput(true);
                    httpURLConnection.connect();
                    String uuid = UUID.randomUUID().toString();
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("attempt", "0");
                    DexLoadErrorReporter.b(this.s, jSONObject2, uuid);
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("subtype", "generic");
                    jSONObject3.put("subtype_code", "1320");
                    jSONObject3.put("caught_exception", "1");
                    jSONObject3.put("stacktrace", this.t);
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("id", UUID.randomUUID().toString());
                    jSONObject4.put("type", "debug");
                    jSONObject4.put("session_time", "" + (System.currentTimeMillis() / 1000));
                    jSONObject4.put("time", "" + (System.currentTimeMillis() / 1000));
                    jSONObject4.put("session_id", uuid);
                    jSONObject4.put("data", jSONObject3);
                    jSONObject4.put("attempt", "0");
                    DexLoadErrorReporter.b(this.s, jSONObject3, uuid);
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(jSONObject4);
                    JSONObject jSONObject5 = new JSONObject();
                    jSONObject5.put("data", jSONObject2);
                    jSONObject5.put("events", jSONArray);
                    jSONObject = jSONObject5.toString();
                    dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                } catch (Throwable unused) {
                    inputStream = null;
                }
                try {
                    dataOutputStream.writeBytes("payload=" + URLEncoder.encode(jSONObject, "UTF-8"));
                    dataOutputStream.flush();
                    byte[] bArr = new byte[16384];
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    inputStream2 = httpURLConnection.getInputStream();
                    while (true) {
                        int read = inputStream2.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, read);
                    }
                    byteArrayOutputStream.flush();
                    try {
                        dataOutputStream.close();
                    } catch (Exception unused2) {
                    }
                    try {
                        inputStream2.close();
                    } catch (Exception unused3) {
                        httpURLConnection.disconnect();
                    }
                } catch (Throwable unused4) {
                    inputStream = inputStream2;
                    dataOutputStream2 = dataOutputStream;
                    if (dataOutputStream2 != null) {
                        try {
                            dataOutputStream2.close();
                        } catch (Exception unused5) {
                        }
                    }
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Exception unused6) {
                        }
                    }
                    if (httpURLConnection == null) {
                        return;
                    }
                    httpURLConnection.disconnect();
                }
            } catch (Throwable unused7) {
                inputStream = null;
                httpURLConnection = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Context context, JSONObject jSONObject, String str) throws JSONException, PackageManager.NameNotFoundException {
        String packageName = context.getPackageName();
        jSONObject.put("APPBUILD", context.getPackageManager().getPackageInfo(packageName, 0).versionCode);
        jSONObject.put("APPNAME", context.getPackageManager().getApplicationLabel(context.getPackageManager().getApplicationInfo(packageName, 0)));
        jSONObject.put("APPVERS", context.getPackageManager().getPackageInfo(packageName, 0).versionName);
        jSONObject.put("OSVERS", Build.VERSION.RELEASE);
        jSONObject.put("SDK", pt0.a);
        jSONObject.put("SESSION_ID", str);
        jSONObject.put("MODEL", Build.MODEL);
        jSONObject.put("BUNDLE", packageName);
        jSONObject.put("SDK_VERSION", BuildConfigApi.getVersionName(context));
        jSONObject.put("OS", "Android");
    }

    @SuppressLint({"CatchGeneralException"})
    public static void reportDexLoadingIssue(Context context, String str, double d) {
        AtomicBoolean atomicBoolean = b;
        if (atomicBoolean.get() || Math.random() >= d) {
            return;
        }
        atomicBoolean.set(true);
        new a(context, str).start();
    }
}