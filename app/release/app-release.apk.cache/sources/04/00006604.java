package com.p7700g.p99005;

import android.text.TextUtils;
import android.util.Log;
import com.p7700g.p99005.rq1;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* compiled from: HttpUrlFetcher.java */
/* loaded from: classes2.dex */
public class xq1 implements rq1<InputStream> {
    private static final String s = "HttpUrlFetcher";
    private static final int t = 5;
    @r2
    public static final String u = "Location";
    @r2
    public static final b v = new a();
    @r2
    public static final int w = -1;
    private HttpURLConnection A;
    private InputStream B;
    private volatile boolean C;
    private final wt1 x;
    private final int y;
    private final b z;

    /* compiled from: HttpUrlFetcher.java */
    /* loaded from: classes2.dex */
    public static class a implements b {
        @Override // com.p7700g.p99005.xq1.b
        public HttpURLConnection a(URL url) throws IOException {
            return (HttpURLConnection) url.openConnection();
        }
    }

    /* compiled from: HttpUrlFetcher.java */
    /* loaded from: classes2.dex */
    public interface b {
        HttpURLConnection a(URL url) throws IOException;
    }

    public xq1(wt1 wt1Var, int i) {
        this(wt1Var, i, v);
    }

    private HttpURLConnection c(URL url, Map<String, String> map) throws eq1 {
        try {
            HttpURLConnection a2 = this.z.a(url);
            for (Map.Entry<String, String> entry : map.entrySet()) {
                a2.addRequestProperty(entry.getKey(), entry.getValue());
            }
            a2.setConnectTimeout(this.y);
            a2.setReadTimeout(this.y);
            a2.setUseCaches(false);
            a2.setDoInput(true);
            a2.setInstanceFollowRedirects(false);
            return a2;
        } catch (IOException e) {
            throw new eq1("URL.openConnection threw", 0, e);
        }
    }

    private static int f(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException unused) {
            Log.isLoggable(s, 3);
            return -1;
        }
    }

    private InputStream g(HttpURLConnection httpURLConnection) throws eq1 {
        try {
            if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
                this.B = n02.b(httpURLConnection.getInputStream(), httpURLConnection.getContentLength());
            } else {
                if (Log.isLoggable(s, 3)) {
                    httpURLConnection.getContentEncoding();
                }
                this.B = httpURLConnection.getInputStream();
            }
            return this.B;
        } catch (IOException e) {
            throw new eq1("Failed to obtain InputStream", f(httpURLConnection), e);
        }
    }

    private static boolean h(int i) {
        return i / 100 == 2;
    }

    private static boolean i(int i) {
        return i / 100 == 3;
    }

    private InputStream j(URL url, int i, URL url2, Map<String, String> map) throws eq1 {
        if (i < 5) {
            if (url2 != null) {
                try {
                    if (url.toURI().equals(url2.toURI())) {
                        throw new eq1("In re-direct loop", -1);
                    }
                } catch (URISyntaxException unused) {
                }
            }
            HttpURLConnection c = c(url, map);
            this.A = c;
            try {
                c.connect();
                this.B = this.A.getInputStream();
                if (this.C) {
                    return null;
                }
                int f = f(this.A);
                if (h(f)) {
                    return g(this.A);
                }
                if (!i(f)) {
                    if (f == -1) {
                        throw new eq1(f);
                    }
                    try {
                        throw new eq1(this.A.getResponseMessage(), f);
                    } catch (IOException e) {
                        throw new eq1("Failed to get a response message", f, e);
                    }
                }
                String headerField = this.A.getHeaderField("Location");
                if (!TextUtils.isEmpty(headerField)) {
                    try {
                        URL url3 = new URL(url, headerField);
                        b();
                        return j(url3, i + 1, url, map);
                    } catch (MalformedURLException e2) {
                        throw new eq1(wo1.t("Bad redirect url: ", headerField), f, e2);
                    }
                }
                throw new eq1("Received empty or null redirect url", f);
            } catch (IOException e3) {
                throw new eq1("Failed to connect or obtain data", f(this.A), e3);
            }
        }
        throw new eq1("Too many (> 5) redirects!", -1);
    }

    @Override // com.p7700g.p99005.rq1
    @x1
    public Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // com.p7700g.p99005.rq1
    public void b() {
        InputStream inputStream = this.B;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.A;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.A = null;
    }

    @Override // com.p7700g.p99005.rq1
    public void cancel() {
        this.C = true;
    }

    @Override // com.p7700g.p99005.rq1
    @x1
    public aq1 d() {
        return aq1.REMOTE;
    }

    @Override // com.p7700g.p99005.rq1
    public void e(@x1 fp1 fp1Var, @x1 rq1.a<? super InputStream> aVar) {
        long b2 = t02.b();
        try {
            try {
                aVar.f(j(this.x.i(), 0, null, this.x.e()));
                if (!Log.isLoggable(s, 2)) {
                    return;
                }
            } catch (IOException e) {
                Log.isLoggable(s, 3);
                aVar.c(e);
                if (!Log.isLoggable(s, 2)) {
                    return;
                }
            }
            t02.a(b2);
        } catch (Throwable th) {
            if (Log.isLoggable(s, 2)) {
                t02.a(b2);
            }
            throw th;
        }
    }

    @r2
    public xq1(wt1 wt1Var, int i, b bVar) {
        this.x = wt1Var;
        this.y = i;
        this.z = bVar;
    }
}