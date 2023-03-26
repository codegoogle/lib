package com.p7700g.p99005;

import android.net.TrafficStats;
import android.os.Build;
import com.onesignal.OSUtils;
import com.p7700g.p99005.am3;
import com.p7700g.p99005.jm3;
import com.p7700g.p99005.un3;
import java.io.IOException;
import java.io.InputStream;
import java.lang.Thread;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.Scanner;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONObject;

/* compiled from: OneSignalRestClient.java */
/* loaded from: classes3.dex */
public class xm3 {
    public static final String a = "CACHE_KEY_GET_TAGS";
    public static final String b = "CACHE_KEY_REMOTE_PARAMS";
    private static final String c = "1";
    private static final String d = "application/vnd.onesignal.v1+json";
    private static final String e = "https://api.onesignal.com/";
    private static final int f = 10000;
    private static final int g = 120000;
    private static final int h = 60000;

    /* compiled from: OneSignalRestClient.java */
    /* loaded from: classes3.dex */
    public class a implements Runnable {
        public final /* synthetic */ String s;
        public final /* synthetic */ JSONObject t;
        public final /* synthetic */ g u;

        public a(String str, JSONObject jSONObject, g gVar) {
            this.s = str;
            this.t = jSONObject;
            this.u = gVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            xm3.h(this.s, cm4.y0, this.t, this.u, xm3.g, null);
        }
    }

    /* compiled from: OneSignalRestClient.java */
    /* loaded from: classes3.dex */
    public class b implements Runnable {
        public final /* synthetic */ String s;
        public final /* synthetic */ JSONObject t;
        public final /* synthetic */ g u;

        public b(String str, JSONObject jSONObject, g gVar) {
            this.s = str;
            this.t = jSONObject;
            this.u = gVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            xm3.h(this.s, "POST", this.t, this.u, xm3.g, null);
        }
    }

    /* compiled from: OneSignalRestClient.java */
    /* loaded from: classes3.dex */
    public class c implements Runnable {
        public final /* synthetic */ String s;
        public final /* synthetic */ g t;
        public final /* synthetic */ String u;

        public c(String str, g gVar, String str2) {
            this.s = str;
            this.t = gVar;
            this.u = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            xm3.h(this.s, null, null, this.t, xm3.h, this.u);
        }
    }

    /* compiled from: OneSignalRestClient.java */
    /* loaded from: classes3.dex */
    public class d implements Runnable {
        public final /* synthetic */ Thread[] s;
        public final /* synthetic */ String t;
        public final /* synthetic */ String u;
        public final /* synthetic */ JSONObject v;
        public final /* synthetic */ g w;
        public final /* synthetic */ int x;
        public final /* synthetic */ String y;

        public d(Thread[] threadArr, String str, String str2, JSONObject jSONObject, g gVar, int i, String str3) {
            this.s = threadArr;
            this.t = str;
            this.u = str2;
            this.v = jSONObject;
            this.w = gVar;
            this.x = i;
            this.y = str3;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.s[0] = xm3.n(this.t, this.u, this.v, this.w, this.x, this.y);
        }
    }

    /* compiled from: OneSignalRestClient.java */
    /* loaded from: classes3.dex */
    public class e implements Runnable {
        public final /* synthetic */ g s;
        public final /* synthetic */ String t;

        public e(g gVar, String str) {
            this.s = gVar;
            this.t = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.s.b(this.t);
        }
    }

    /* compiled from: OneSignalRestClient.java */
    /* loaded from: classes3.dex */
    public class f implements Runnable {
        public final /* synthetic */ g s;
        public final /* synthetic */ int t;
        public final /* synthetic */ String u;
        public final /* synthetic */ Throwable v;

        public f(g gVar, int i, String str, Throwable th) {
            this.s = gVar;
            this.t = i;
            this.u = str;
            this.v = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.s.a(this.t, this.u, this.v);
        }
    }

    /* compiled from: OneSignalRestClient.java */
    /* loaded from: classes3.dex */
    public static abstract class g {
        public void a(int i, String str, Throwable th) {
        }

        public void b(String str) {
        }
    }

    private static Thread c(g gVar, int i, String str, Throwable th) {
        if (gVar == null) {
            return null;
        }
        Thread thread = new Thread(new f(gVar, i, str, th), "OS_REST_FAILURE_CALLBACK");
        thread.start();
        return thread;
    }

    private static Thread d(g gVar, String str) {
        if (gVar == null) {
            return null;
        }
        Thread thread = new Thread(new e(gVar, str), "OS_REST_SUCCESS_CALLBACK");
        thread.start();
        return thread;
    }

    public static void e(String str, g gVar, @x1 String str2) {
        new Thread(new c(str, gVar, str2), "OS_REST_ASYNC_GET").start();
    }

    public static void f(String str, g gVar, @x1 String str2) {
        h(str, null, null, gVar, h, str2);
    }

    private static int g(int i) {
        return i + un3.f.v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void h(String str, String str2, JSONObject jSONObject, g gVar, int i, String str3) {
        if (!OSUtils.I()) {
            if (str2 == null || !jm3.t3(null)) {
                Thread[] threadArr = new Thread[1];
                Thread thread = new Thread(new d(threadArr, str, str2, jSONObject, gVar, i, str3), "OS_HTTPConnection");
                thread.start();
                try {
                    thread.join(g(i));
                    if (thread.getState() != Thread.State.TERMINATED) {
                        thread.interrupt();
                    }
                    if (threadArr[0] != null) {
                        threadArr[0].join();
                        return;
                    }
                    return;
                } catch (InterruptedException e2) {
                    e2.printStackTrace();
                    return;
                }
            }
            return;
        }
        throw new am3.a(wo1.u("Method: ", str2, " was called from the Main Thread!"));
    }

    private static HttpURLConnection i(String str) throws IOException {
        return (HttpURLConnection) new URL(wo1.t(e, str)).openConnection();
    }

    public static void j(String str, JSONObject jSONObject, g gVar) {
        new Thread(new b(str, jSONObject, gVar), "OS_REST_ASYNC_POST").start();
    }

    public static void k(String str, JSONObject jSONObject, g gVar) {
        h(str, "POST", jSONObject, gVar, g, null);
    }

    public static void l(String str, JSONObject jSONObject, g gVar) {
        new Thread(new a(str, jSONObject, gVar), "OS_REST_ASYNC_PUT").start();
    }

    public static void m(String str, JSONObject jSONObject, g gVar) {
        h(str, cm4.y0, jSONObject, gVar, g, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x02c3, code lost:
        if (r10 != null) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Thread n(String str, String str2, JSONObject jSONObject, g gVar, int i, @z1 String str3) {
        HttpURLConnection httpURLConnection;
        Thread c2;
        String next;
        String headerField;
        Throwable th;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            TrafficStats.setThreadStatsTag(10000);
        }
        int i3 = -1;
        try {
            jm3.u0 u0Var = jm3.u0.DEBUG;
            jm3.a(u0Var, "OneSignalRestClient: Making request to: https://api.onesignal.com/" + str);
            httpURLConnection = i(str);
            if (i2 < 22) {
                try {
                    if (httpURLConnection instanceof HttpsURLConnection) {
                        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) httpURLConnection;
                        httpsURLConnection.setSSLSocketFactory(new in3(httpsURLConnection.getSSLSocketFactory()));
                    }
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        if (!(th instanceof ConnectException)) {
                            jm3.u0 u0Var2 = jm3.u0.WARN;
                            jm3.b(u0Var2, "OneSignalRestClient: " + str2 + " Error thrown from network stack. ", th);
                            c2 = c(gVar, i3, null, th);
                        }
                        jm3.u0 u0Var3 = jm3.u0.INFO;
                        jm3.a(u0Var3, "OneSignalRestClient: Could not send last request, device is offline. Throwable: " + th.getClass().getName());
                        c2 = c(gVar, i3, null, th);
                    } catch (Throwable th3) {
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        throw th3;
                    }
                }
            }
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setConnectTimeout(i);
            httpURLConnection.setReadTimeout(i);
            httpURLConnection.setRequestProperty("SDK-Version", "onesignal/android/" + jm3.P0());
            httpURLConnection.setRequestProperty(sm4.a, d);
            if (jSONObject != null) {
                httpURLConnection.setDoInput(true);
            }
            if (str2 != null) {
                httpURLConnection.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
                httpURLConnection.setRequestMethod(str2);
                httpURLConnection.setDoOutput(true);
            }
            if (jSONObject != null) {
                String l = dj3.l(jSONObject);
                jm3.a(u0Var, "OneSignalRestClient: " + str2 + " SEND JSON: " + l);
                byte[] bytes = l.getBytes("UTF-8");
                httpURLConnection.setFixedLengthStreamingMode(bytes.length);
                httpURLConnection.getOutputStream().write(bytes);
            }
            if (str3 != null) {
                String str4 = vm3.a;
                String g2 = vm3.g(str4, vm3.y + str3, null);
                if (g2 != null) {
                    httpURLConnection.setRequestProperty("if-none-match", g2);
                    jm3.a(u0Var, "OneSignalRestClient: Adding header if-none-match: " + g2);
                }
            }
            i3 = httpURLConnection.getResponseCode();
            try {
                jm3.u0 u0Var4 = jm3.u0.VERBOSE;
                jm3.a(u0Var4, "OneSignalRestClient: After con.getResponseCode to: https://api.onesignal.com/" + str);
                String str5 = "GET";
                if (i3 == 200 || i3 == 202) {
                    StringBuilder sb = new StringBuilder();
                    try {
                        sb.append("OneSignalRestClient: Successfully finished request to: https://api.onesignal.com/");
                        sb.append(str);
                        jm3.a(u0Var, sb.toString());
                        Scanner scanner = new Scanner(httpURLConnection.getInputStream(), "UTF-8");
                        next = scanner.useDelimiter("\\A").hasNext() ? scanner.next() : "";
                        scanner.close();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("OneSignalRestClient: ");
                        if (str2 != null) {
                            str5 = str2;
                        }
                        sb2.append(str5);
                        sb2.append(" RECEIVED JSON: ");
                        sb2.append(next);
                        jm3.a(u0Var, sb2.toString());
                        if (str3 != null && (headerField = httpURLConnection.getHeaderField("etag")) != null) {
                            jm3.a(u0Var, "OneSignalRestClient: Response has etag of " + headerField + " so caching the response.");
                            String str6 = vm3.a;
                            vm3.o(str6, vm3.y + str3, headerField);
                            vm3.o(str6, vm3.z + str3, next);
                        }
                        c2 = d(gVar, next);
                    } catch (Throwable th4) {
                        th = th4;
                        i3 = i3;
                        if (!(th instanceof ConnectException) && !(th instanceof UnknownHostException)) {
                            jm3.u0 u0Var22 = jm3.u0.WARN;
                            jm3.b(u0Var22, "OneSignalRestClient: " + str2 + " Error thrown from network stack. ", th);
                            c2 = c(gVar, i3, null, th);
                        }
                        jm3.u0 u0Var32 = jm3.u0.INFO;
                        jm3.a(u0Var32, "OneSignalRestClient: Could not send last request, device is offline. Throwable: " + th.getClass().getName());
                        c2 = c(gVar, i3, null, th);
                    }
                } else if (i3 != 304) {
                    jm3.a(u0Var, "OneSignalRestClient: Failed request to: https://api.onesignal.com/" + str);
                    InputStream errorStream = httpURLConnection.getErrorStream();
                    if (errorStream == null) {
                        errorStream = httpURLConnection.getInputStream();
                    }
                    if (errorStream != null) {
                        Scanner scanner2 = new Scanner(errorStream, "UTF-8");
                        next = scanner2.useDelimiter("\\A").hasNext() ? scanner2.next() : "";
                        scanner2.close();
                        jm3.u0 u0Var5 = jm3.u0.WARN;
                        jm3.a(u0Var5, "OneSignalRestClient: " + str2 + " RECEIVED JSON: " + next);
                        th = null;
                    } else {
                        jm3.u0 u0Var6 = jm3.u0.WARN;
                        jm3.a(u0Var6, "OneSignalRestClient: " + str2 + " HTTP Code: " + i3 + " No response body!");
                        th = null;
                        next = null;
                    }
                    c2 = c(gVar, i3, next, th);
                } else {
                    String str7 = vm3.a;
                    String g3 = vm3.g(str7, vm3.z + str3, null);
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("OneSignalRestClient: ");
                    if (str2 != null) {
                        str5 = str2;
                    }
                    sb3.append(str5);
                    sb3.append(" - Using Cached response due to 304: ");
                    sb3.append(g3);
                    jm3.a(u0Var, sb3.toString());
                    c2 = d(gVar, g3);
                }
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (Throwable th6) {
            th = th6;
            httpURLConnection = null;
        }
        httpURLConnection.disconnect();
        return c2;
    }
}