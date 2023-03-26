package com.p7700g.p99005;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.p7700g.p99005.a42;
import com.p7700g.p99005.b42;
import com.p7700g.p99005.c42;
import com.p7700g.p99005.e42;
import com.p7700g.p99005.o32;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* compiled from: CctTransportBackend.java */
/* loaded from: classes2.dex */
public final class o32 implements p52 {
    private static final String a = "CctTransportBackend";
    private static final int b = 30000;
    private static final int c = 40000;
    private static final int d = -1;
    private static final String e = "Accept-Encoding";
    private static final String f = "Content-Encoding";
    private static final String g = "gzip";
    private static final String h = "Content-Type";
    public static final String i = "X-Goog-Api-Key";
    private static final String j = "application/json";
    @r2
    public static final String k = "net-type";
    @r2
    public static final String l = "mobile-subtype";
    private static final String m = "sdk-version";
    private static final String n = "model";
    private static final String o = "hardware";
    private static final String p = "device";
    private static final String q = "product";
    private static final String r = "os-uild";
    private static final String s = "manufacturer";
    private static final String t = "fingerprint";
    private static final String u = "locale";
    private static final String v = "country";
    private static final String w = "mcc_mnc";
    private static final String x = "tz-offset";
    private static final String y = "application_build";
    private final ConnectivityManager A;
    private final Context B;
    public final URL C;
    private final v92 D;
    private final v92 E;
    private final int F;
    private final qp2 z;

    /* compiled from: CctTransportBackend.java */
    /* loaded from: classes2.dex */
    public static final class a {
        public final URL a;
        public final z32 b;
        @z1
        public final String c;

        public a(URL url, z32 z32Var, @z1 String str) {
            this.a = url;
            this.b = z32Var;
            this.c = str;
        }

        public a a(URL url) {
            return new a(url, this.b, this.c);
        }
    }

    /* compiled from: CctTransportBackend.java */
    /* loaded from: classes2.dex */
    public static final class b {
        public final int a;
        @z1
        public final URL b;
        public final long c;

        public b(int i, @z1 URL url, long j) {
            this.a = i;
            this.b = url;
            this.c = j;
        }
    }

    public o32(Context context, v92 v92Var, v92 v92Var2, int i2) {
        this.z = z32.b();
        this.B = context;
        this.A = (ConnectivityManager) context.getSystemService("connectivity");
        this.C = m(n32.b);
        this.D = v92Var2;
        this.E = v92Var;
        this.F = i2;
    }

    public b c(a aVar) throws IOException {
        d72.b(a, "Making request to: %s", aVar.a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) aVar.a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(this.F);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty(sm4.v, String.format("datatransport/%s android/", j32.f));
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = aVar.c;
        if (str != null) {
            httpURLConnection.setRequestProperty(i, str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                this.z.a(aVar.b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                gZIPOutputStream.close();
                if (outputStream != null) {
                    outputStream.close();
                }
                int responseCode = httpURLConnection.getResponseCode();
                d72.g(a, "Status Code: " + responseCode);
                d72.g(a, "Content-Type: " + httpURLConnection.getHeaderField("Content-Type"));
                d72.g(a, "Content-Encoding: " + httpURLConnection.getHeaderField("Content-Encoding"));
                if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                    return new b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                }
                if (responseCode != 200) {
                    return new b(responseCode, null, 0L);
                }
                InputStream inputStream = httpURLConnection.getInputStream();
                try {
                    InputStream l2 = l(inputStream, httpURLConnection.getHeaderField("Content-Encoding"));
                    b bVar = new b(responseCode, null, d42.b(new BufferedReader(new InputStreamReader(l2))).c());
                    if (l2 != null) {
                        l2.close();
                    }
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    return bVar;
                } catch (Throwable th) {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (sp2 e2) {
            e = e2;
            d72.e(a, "Couldn't encode request, returning with 400", e);
            return new b(400, null, 0L);
        } catch (ConnectException e3) {
            e = e3;
            d72.e(a, "Couldn't open connection, returning with 500", e);
            return new b(500, null, 0L);
        } catch (UnknownHostException e4) {
            e = e4;
            d72.e(a, "Couldn't open connection, returning with 500", e);
            return new b(500, null, 0L);
        } catch (IOException e5) {
            e = e5;
            d72.e(a, "Couldn't encode request, returning with 400", e);
            return new b(400, null, 0L);
        }
    }

    private static int d(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return e42.b.UNKNOWN_MOBILE_SUBTYPE.f();
        }
        int subtype = networkInfo.getSubtype();
        if (subtype == -1) {
            return e42.b.COMBINED.f();
        }
        if (e42.b.b(subtype) != null) {
            return subtype;
        }
        return 0;
    }

    private static int e(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return e42.c.NONE.f();
        }
        return networkInfo.getType();
    }

    private static int f(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e2) {
            d72.e(a, "Unable to find version code for package", e2);
            return -1;
        }
    }

    private z32 g(i52 i52Var) {
        b42.a j2;
        HashMap hashMap = new HashMap();
        for (p42 p42Var : i52Var.c()) {
            String l2 = p42Var.l();
            if (!hashMap.containsKey(l2)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(p42Var);
                hashMap.put(l2, arrayList);
            } else {
                ((List) hashMap.get(l2)).add(p42Var);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            p42 p42Var2 = (p42) ((List) entry.getValue()).get(0);
            c42.a b2 = c42.a().f(f42.DEFAULT).g(this.E.a()).h(this.D.a()).b(a42.a().c(a42.b.ANDROID_FIREBASE).b(q32.a().m(Integer.valueOf(p42Var2.g(m))).j(p42Var2.b("model")).f(p42Var2.b(o)).d(p42Var2.b("device")).l(p42Var2.b(q)).k(p42Var2.b(r)).h(p42Var2.b(s)).e(p42Var2.b(t)).c(p42Var2.b("country")).g(p42Var2.b(u)).i(p42Var2.b(w)).b(p42Var2.b(y)).a()).a());
            try {
                b2.i(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                b2.j((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (p42 p42Var3 : (List) entry.getValue()) {
                o42 e2 = p42Var3.e();
                b32 b3 = e2.b();
                if (b3.equals(b32.b("proto"))) {
                    j2 = b42.j(e2.a());
                } else if (b3.equals(b32.b("json"))) {
                    j2 = b42.i(new String(e2.a(), Charset.forName("UTF-8")));
                } else {
                    d72.h(a, "Received event of unsupported encoding %s. Skipping...", b3);
                }
                j2.c(p42Var3.f()).d(p42Var3.m()).h(p42Var3.h(x)).e(e42.a().c(e42.c.b(p42Var3.g(k))).b(e42.b.b(p42Var3.g(l))).a());
                if (p42Var3.d() != null) {
                    j2.b(p42Var3.d());
                }
                arrayList3.add(j2.a());
            }
            b2.c(arrayList3);
            arrayList2.add(b2.a());
        }
        return z32.a(arrayList2);
    }

    private static TelephonyManager h(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    @r2
    public static long i() {
        Calendar.getInstance();
        return TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
    }

    public static /* synthetic */ b j(o32 o32Var, a aVar) {
        return o32Var.c(aVar);
    }

    public static /* synthetic */ a k(a aVar, b bVar) {
        URL url = bVar.b;
        if (url != null) {
            d72.b(a, "Following redirect to: %s", url);
            return aVar.a(bVar.b);
        }
        return null;
    }

    private static InputStream l(InputStream inputStream, String str) throws IOException {
        return "gzip".equals(str) ? new GZIPInputStream(inputStream) : inputStream;
    }

    private static URL m(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e2) {
            throw new IllegalArgumentException(wo1.t("Invalid url: ", str), e2);
        }
    }

    @Override // com.p7700g.p99005.p52
    public j52 a(i52 i52Var) {
        z32 g2 = g(i52Var);
        URL url = this.C;
        if (i52Var.d() != null) {
            try {
                n32 e2 = n32.e(i52Var.d());
                r3 = e2.f() != null ? e2.f() : null;
                if (e2.g() != null) {
                    url = m(e2.g());
                }
            } catch (IllegalArgumentException unused) {
                return j52.a();
            }
        }
        try {
            b bVar = (b) f72.a(5, new a(url, g2, r3), new e72() { // from class: com.p7700g.p99005.m32
                @Override // com.p7700g.p99005.e72
                public final Object apply(Object obj) {
                    return o32.j(o32.this, (o32.a) obj);
                }
            }, l32.a);
            int i2 = bVar.a;
            if (i2 == 200) {
                return j52.d(bVar.c);
            }
            if (i2 < 500 && i2 != 404) {
                return j52.a();
            }
            return j52.e();
        } catch (IOException e3) {
            d72.e(a, "Could not make request to the backend", e3);
            return j52.e();
        }
    }

    @Override // com.p7700g.p99005.p52
    public p42 b(p42 p42Var) {
        NetworkInfo activeNetworkInfo = this.A.getActiveNetworkInfo();
        return p42Var.n().a(m, Build.VERSION.SDK_INT).c("model", Build.MODEL).c(o, Build.HARDWARE).c("device", Build.DEVICE).c(q, Build.PRODUCT).c(r, Build.ID).c(s, Build.MANUFACTURER).c(t, Build.FINGERPRINT).b(x, i()).a(k, e(activeNetworkInfo)).a(l, d(activeNetworkInfo)).c("country", Locale.getDefault().getCountry()).c(u, Locale.getDefault().getLanguage()).c(w, h(this.B).getSimOperator()).c(y, Integer.toString(f(this.B))).d();
    }

    public o32(Context context, v92 v92Var, v92 v92Var2) {
        this(context, v92Var, v92Var2, c);
    }
}