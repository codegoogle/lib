package com.p7700g.p99005;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.JsonReader;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.common.util.VisibleForTesting;
import com.ironsource.adapters.ironsource.IronSourceAdapter;
import com.p7700g.p99005.js2;
import com.p7700g.p99005.ls2;
import com.p7700g.p99005.qr2;
import com.p7700g.p99005.xq2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: FirebaseInstallationServiceClient.java */
/* loaded from: classes3.dex */
public class is2 {
    private static final int A = 1;
    private static final String C = "a:";
    private static final String D = "Firebase-Installations";
    @VisibleForTesting
    public static final String E = "Invalid Expiration Timestamp.";
    private static final int a = 32768;
    private static final int b = 32769;
    private static final int c = 32770;
    private static final int d = 32771;
    private static final String e = "firebaseinstallations.googleapis.com";
    private static final String f = "projects/%s/installations";
    private static final String g = "projects/%s/installations/%s/authTokens:generate";
    private static final String h = "projects/%s/installations/%s";
    private static final String i = "v1";
    private static final String j = "FIS_v2";
    private static final String k = "Content-Type";
    private static final String l = "Accept";
    private static final String m = "application/json";
    private static final String n = "Content-Encoding";
    private static final String o = "gzip";
    private static final String p = "Cache-Control";
    private static final String q = "no-cache";
    private static final String r = "fire-installations-id";
    private static final String s = "x-firebase-client-log-type";
    private static final String t = "x-firebase-client";
    private static final String u = "X-Android-Package";
    private static final String v = "X-Android-Cert";
    private static final String w = "x-goog-fis-android-iid-migration-auth";
    private static final String x = "x-goog-api-key";
    private static final int y = 10000;
    private boolean F;
    private final Context G;
    private final er2<kv2> H;
    private final er2<xq2> I;
    private final ks2 J = new ks2();
    private static final Pattern z = Pattern.compile("[0-9]+s");
    private static final Charset B = Charset.forName("UTF-8");

    public is2(@x1 Context context, @x1 er2<kv2> er2Var, @x1 er2<xq2> er2Var2) {
        this.G = context;
        this.H = er2Var;
        this.I = er2Var2;
    }

    private static String a(@z1 String str, @x1 String str2, @x1 String str3) {
        Object[] objArr = new Object[3];
        objArr[0] = str2;
        objArr[1] = str3;
        objArr[2] = TextUtils.isEmpty(str) ? "" : wo1.t(", ", str);
        return String.format("Firebase options used while communicating with Firebase server APIs: %s, %s%s", objArr);
    }

    private static JSONObject b(@z1 String str, @x1 String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put(com.anythink.expressad.videocommon.e.b.u, str2);
            jSONObject.put("authVersion", j);
            jSONObject.put("sdkVersion", "a:17.0.0");
            return jSONObject;
        } catch (JSONException e2) {
            throw new IllegalStateException(e2);
        }
    }

    private static JSONObject c() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:17.0.0");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            return jSONObject2;
        } catch (JSONException e2) {
            throw new IllegalStateException(e2);
        }
    }

    private String g() {
        try {
            Context context = this.G;
            byte[] packageCertificateHashBytes = AndroidUtilsLight.getPackageCertificateHashBytes(context, context.getPackageName());
            if (packageCertificateHashBytes == null) {
                this.G.getPackageName();
                return null;
            }
            return Hex.bytesToStringUppercase(packageCertificateHashBytes, false);
        } catch (PackageManager.NameNotFoundException unused) {
            this.G.getPackageName();
            return null;
        }
    }

    private URL h(String str) throws qr2 {
        try {
            return new URL(String.format("https://%s/%s/%s", e, i, str));
        } catch (MalformedURLException e2) {
            throw new qr2(e2.getMessage(), qr2.a.UNAVAILABLE);
        }
    }

    private static byte[] i(JSONObject jSONObject) throws IOException {
        return jSONObject.toString().getBytes("UTF-8");
    }

    private static boolean j(int i2) {
        return i2 >= 200 && i2 < 300;
    }

    private static void k() {
    }

    private static void l(HttpURLConnection httpURLConnection, @z1 String str, @x1 String str2, @x1 String str3) {
        if (TextUtils.isEmpty(p(httpURLConnection))) {
            return;
        }
        a(str, str2, str3);
    }

    private HttpURLConnection m(URL url, String str) throws qr2 {
        xq2.a b2;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.addRequestProperty("Content-Type", "application/json");
            httpURLConnection.addRequestProperty("Accept", "application/json");
            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
            httpURLConnection.addRequestProperty("Cache-Control", q);
            httpURLConnection.addRequestProperty(u, this.G.getPackageName());
            if (this.I.get() != null && this.H.get() != null && (b2 = this.I.get().b(r)) != xq2.a.NONE) {
                httpURLConnection.addRequestProperty(t, this.H.get().a());
                httpURLConnection.addRequestProperty(s, Integer.toString(b2.f()));
            }
            httpURLConnection.addRequestProperty(v, g());
            httpURLConnection.addRequestProperty(x, str);
            return httpURLConnection;
        } catch (IOException unused) {
            throw new qr2("Firebase Installations Service is unavailable. Please try again later.", qr2.a.UNAVAILABLE);
        }
    }

    @VisibleForTesting
    public static long n(String str) {
        Preconditions.checkArgument(z.matcher(str).matches(), E);
        if (str == null || str.length() == 0) {
            return 0L;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    private js2 o(HttpURLConnection httpURLConnection) throws AssertionError, IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, B));
        ls2.a a2 = ls2.a();
        js2.a a3 = js2.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("name")) {
                a3.f(jsonReader.nextString());
            } else if (nextName.equals("fid")) {
                a3.c(jsonReader.nextString());
            } else if (nextName.equals("refreshToken")) {
                a3.d(jsonReader.nextString());
            } else if (nextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if (nextName2.equals(IronSourceAdapter.IRONSOURCE_BIDDING_TOKEN_KEY)) {
                        a2.c(jsonReader.nextString());
                    } else if (nextName2.equals("expiresIn")) {
                        a2.d(n(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                a3.b(a2.a());
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return a3.e(js2.b.OK).a();
    }

    @z1
    private static String p(HttpURLConnection httpURLConnection) {
        InputStream errorStream = httpURLConnection.getErrorStream();
        if (errorStream == null) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, B));
        try {
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb.append(readLine);
                    sb.append('\n');
                }
                String format = String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage(), sb);
                try {
                    bufferedReader.close();
                } catch (IOException unused) {
                }
                return format;
            } catch (IOException unused2) {
                bufferedReader.close();
                return null;
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (IOException unused3) {
                }
                throw th;
            }
        } catch (IOException unused4) {
            return null;
        }
    }

    private ls2 q(HttpURLConnection httpURLConnection) throws AssertionError, IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, B));
        ls2.a a2 = ls2.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals(IronSourceAdapter.IRONSOURCE_BIDDING_TOKEN_KEY)) {
                a2.c(jsonReader.nextString());
            } else if (nextName.equals("expiresIn")) {
                a2.d(n(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return a2.b(ls2.b.OK).a();
    }

    private void r(HttpURLConnection httpURLConnection, @z1 String str, @x1 String str2) throws IOException {
        t(httpURLConnection, i(b(str, str2)));
    }

    private void s(HttpURLConnection httpURLConnection) throws IOException {
        t(httpURLConnection, i(c()));
    }

    private static void t(URLConnection uRLConnection, byte[] bArr) throws IOException {
        OutputStream outputStream = uRLConnection.getOutputStream();
        if (outputStream != null) {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
            try {
                gZIPOutputStream.write(bArr);
                try {
                    return;
                } catch (IOException unused) {
                    return;
                }
            } finally {
                try {
                    gZIPOutputStream.close();
                    outputStream.close();
                } catch (IOException unused2) {
                }
            }
        }
        throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
    }

    @x1
    public js2 d(@x1 String str, @z1 String str2, @x1 String str3, @x1 String str4, @z1 String str5) throws qr2 {
        int responseCode;
        js2 o2;
        if (this.J.b()) {
            URL h2 = h(String.format(f, str3));
            for (int i2 = 0; i2 <= 1; i2++) {
                TrafficStats.setThreadStatsTag(32769);
                HttpURLConnection m2 = m(h2, str);
                try {
                    m2.setRequestMethod("POST");
                    m2.setDoOutput(true);
                    if (str5 != null) {
                        m2.addRequestProperty(w, str5);
                    }
                    r(m2, str2, str4);
                    responseCode = m2.getResponseCode();
                    this.J.f(responseCode);
                } catch (IOException | AssertionError unused) {
                } catch (Throwable th) {
                    m2.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
                if (j(responseCode)) {
                    o2 = o(m2);
                } else {
                    l(m2, str4, str, str3);
                    if (responseCode == 429) {
                        throw new qr2("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", qr2.a.TOO_MANY_REQUESTS);
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        k();
                        o2 = js2.a().e(js2.b.BAD_CONFIG).a();
                    } else {
                        m2.disconnect();
                        TrafficStats.clearThreadStatsTag();
                    }
                }
                m2.disconnect();
                TrafficStats.clearThreadStatsTag();
                return o2;
            }
            throw new qr2("Firebase Installations Service is unavailable. Please try again later.", qr2.a.UNAVAILABLE);
        }
        throw new qr2("Firebase Installations Service is unavailable. Please try again later.", qr2.a.UNAVAILABLE);
    }

    @x1
    public void e(@x1 String str, @x1 String str2, @x1 String str3, @x1 String str4) throws qr2 {
        int responseCode;
        int i2 = 0;
        URL h2 = h(String.format(h, str3, str2));
        while (i2 <= 1) {
            TrafficStats.setThreadStatsTag(c);
            HttpURLConnection m2 = m(h2, str);
            try {
                m2.setRequestMethod("DELETE");
                m2.addRequestProperty("Authorization", "FIS_v2 " + str4);
                responseCode = m2.getResponseCode();
            } catch (IOException unused) {
            } catch (Throwable th) {
                m2.disconnect();
                TrafficStats.clearThreadStatsTag();
                throw th;
            }
            if (responseCode != 200 && responseCode != 401 && responseCode != 404) {
                l(m2, null, str, str3);
                if (responseCode != 429 && (responseCode < 500 || responseCode >= 600)) {
                    k();
                    throw new qr2("Bad config while trying to delete FID", qr2.a.BAD_CONFIG);
                    break;
                }
                i2++;
                m2.disconnect();
                TrafficStats.clearThreadStatsTag();
            }
            m2.disconnect();
            TrafficStats.clearThreadStatsTag();
            return;
        }
        throw new qr2("Firebase Installations Service is unavailable. Please try again later.", qr2.a.UNAVAILABLE);
    }

    @x1
    public ls2 f(@x1 String str, @x1 String str2, @x1 String str3, @x1 String str4) throws qr2 {
        int responseCode;
        ls2 q2;
        if (this.J.b()) {
            URL h2 = h(String.format(g, str3, str2));
            for (int i2 = 0; i2 <= 1; i2++) {
                TrafficStats.setThreadStatsTag(d);
                HttpURLConnection m2 = m(h2, str);
                try {
                    m2.setRequestMethod("POST");
                    m2.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    m2.setDoOutput(true);
                    s(m2);
                    responseCode = m2.getResponseCode();
                    this.J.f(responseCode);
                } catch (IOException | AssertionError unused) {
                } catch (Throwable th) {
                    m2.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
                if (j(responseCode)) {
                    q2 = q(m2);
                } else {
                    l(m2, null, str, str3);
                    if (responseCode != 401 && responseCode != 404) {
                        if (responseCode == 429) {
                            throw new qr2("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", qr2.a.TOO_MANY_REQUESTS);
                        }
                        if (responseCode < 500 || responseCode >= 600) {
                            k();
                            q2 = ls2.a().b(ls2.b.BAD_CONFIG).a();
                        } else {
                            m2.disconnect();
                            TrafficStats.clearThreadStatsTag();
                        }
                    }
                    q2 = ls2.a().b(ls2.b.AUTH_ERROR).a();
                }
                m2.disconnect();
                TrafficStats.clearThreadStatsTag();
                return q2;
            }
            throw new qr2("Firebase Installations Service is unavailable. Please try again later.", qr2.a.UNAVAILABLE);
        }
        throw new qr2("Firebase Installations Service is unavailable. Please try again later.", qr2.a.UNAVAILABLE);
    }
}