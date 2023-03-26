package com.ironsource.environment;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.text.TextUtils;
import com.ironsource.mediationsdk.config.VersionInfo;
import com.p7700g.p99005.fe3;
import com.p7700g.p99005.k21;
import com.p7700g.p99005.sm4;
import java.io.DataOutputStream;
import java.lang.Thread;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class e {
    public static String c = "";
    private JSONObject a;
    private String b;
    private String d;
    private boolean e;
    public Context f;
    private Thread.UncaughtExceptionHandler g;
    private String h;
    public String i;

    /* loaded from: classes3.dex */
    public class a implements fe3 {
        public a() {
        }

        @Override // com.p7700g.p99005.fe3
        public final void a() {
            Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
            StringBuilder sb = new StringBuilder(128);
            for (Thread thread : allStackTraces.keySet()) {
                StackTraceElement[] stackTrace = thread.getStackTrace();
                if (stackTrace != null && stackTrace.length > 0) {
                    sb.append("*** Thread Name ");
                    sb.append(thread.getName());
                    sb.append(" Thread ID ");
                    sb.append(thread.getId());
                    sb.append(" (");
                    sb.append(thread.getState().toString());
                    sb.append(") ***\n");
                    for (StackTraceElement stackTraceElement : stackTrace) {
                        sb.append(stackTraceElement.toString());
                        sb.append(" ");
                        sb.append(thread.getState().toString());
                        sb.append("\n");
                    }
                }
            }
            e.c = sb.toString();
        }

        @Override // com.p7700g.p99005.fe3
        public final void b() {
        }
    }

    /* loaded from: classes3.dex */
    public class b implements Runnable {
        private /* synthetic */ Context s;
        private /* synthetic */ String t;

        public b(Context context, String str) {
            this.s = context;
            this.t = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                String[] C = h.C(this.s);
                if (C == null || C.length != 2) {
                    return;
                }
                if (!TextUtils.isEmpty(C[0])) {
                    e.this.b = C[0];
                }
                e.this.e = Boolean.parseBoolean(C[1]);
                SharedPreferences.Editor edit = this.s.getSharedPreferences("CRep", 0).edit();
                edit.putString("String1", e.this.b);
                edit.putString("sId", this.t);
                edit.apply();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* loaded from: classes3.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(e.a().h).openConnection();
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setRequestProperty("Content-Type", "application/json;charset=UTF-8");
                httpURLConnection.setRequestProperty(sm4.a, "application/json");
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setDoInput(true);
                e.this.a.toString();
                DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                dataOutputStream.writeBytes(e.this.a.toString());
                dataOutputStream.flush();
                dataOutputStream.close();
                String.valueOf(httpURLConnection.getResponseCode());
                httpURLConnection.getResponseMessage();
                httpURLConnection.disconnect();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class d {
        public static volatile e a = new e((byte) 0);
    }

    private e() {
        this.e = false;
        this.a = new JSONObject();
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        this.g = defaultUncaughtExceptionHandler;
        this.i = " ";
        this.h = "https://outcome-crash-report.supersonicads.com/reporter";
        Thread.setDefaultUncaughtExceptionHandler(new com.ironsource.environment.d(defaultUncaughtExceptionHandler));
    }

    public /* synthetic */ e(byte b2) {
        this();
    }

    public static e a() {
        return d.a;
    }

    private static String b(Context context) {
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
        } catch (Exception e) {
            e.printStackTrace();
            return "none";
        }
    }

    public final void a(Context context, HashSet<String> hashSet, String str, String str2, boolean z, String str3, int i, boolean z2) {
        if (context != null) {
            this.f = context;
            if (!TextUtils.isEmpty(str2)) {
                this.i = str2;
            }
            if (!TextUtils.isEmpty(str)) {
                this.h = str;
            }
            this.d = str3;
            if (z) {
                com.ironsource.environment.a aVar = new com.ironsource.environment.a(i);
                aVar.A = z2;
                aVar.z = true;
                aVar.u = new a();
                aVar.start();
            }
            String b2 = b(this.f);
            if (!b2.equals("none")) {
                SharedPreferences sharedPreferences = context.getSharedPreferences("CRep", 0);
                String string = sharedPreferences.getString("String1", this.b);
                String string2 = sharedPreferences.getString("sId", this.d);
                for (com.ironsource.environment.c cVar : f.a()) {
                    String b3 = cVar.b();
                    String a2 = cVar.a();
                    String c2 = cVar.c();
                    String packageName = context.getPackageName();
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("crashDate", b3);
                        jSONObject.put("stacktraceCrash", a2);
                        jSONObject.put("crashType", c2);
                        jSONObject.put("CrashReporterVersion", "1.0.5");
                        jSONObject.put("SDKVersion", VersionInfo.VERSION);
                        jSONObject.put("deviceLanguage", h.a(context));
                        jSONObject.put("appVersion", com.ironsource.environment.c.c(context, packageName));
                        jSONObject.put("deviceOSVersion", h.e());
                        jSONObject.put("network", b2);
                        jSONObject.put("deviceApiLevel", h.f());
                        jSONObject.put("deviceModel", h.g());
                        jSONObject.put("deviceOS", h.i());
                        jSONObject.put("advertisingId", string);
                        jSONObject.put("isLimitAdTrackingEnabled", this.e);
                        jSONObject.put("deviceOEM", h.h());
                        jSONObject.put("systemProperties", System.getProperties());
                        jSONObject.put("bundleId", packageName);
                        jSONObject.put("sId", string2);
                        JSONObject jSONObject2 = new JSONObject();
                        if (hashSet != null && !hashSet.isEmpty()) {
                            Iterator<String> it = hashSet.iterator();
                            while (it.hasNext()) {
                                String next = it.next();
                                try {
                                    if (jSONObject.has(next)) {
                                        jSONObject2.put(next, jSONObject.opt(next));
                                    }
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                            jSONObject = jSONObject2;
                        }
                        this.a = jSONObject;
                    } catch (Exception unused) {
                    }
                    if (this.a.length() != 0) {
                        new Thread(new c()).start();
                        f.c();
                    }
                }
            }
            new Thread(new b(context, str3)).start();
        }
    }
}