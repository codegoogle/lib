package com.p7700g.p99005;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.p7700g.p99005.un3;
import com.p7700g.p99005.zp5;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/* compiled from: HttpTools.java */
/* loaded from: classes3.dex */
public class zp5 {
    private static Handler a = new Handler(Looper.getMainLooper());
    private static final String b = zp5.class.getName();

    /* compiled from: HttpTools.java */
    /* loaded from: classes3.dex */
    public static class a extends Thread {
        public final /* synthetic */ String s;

        public a(final String val$url) {
            this.s = val$url;
        }

        /* JADX WARN: Removed duplicated region for block: B:46:0x00b6  */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void run() {
            HttpURLConnection httpURLConnection;
            Throwable th;
            Exception e;
            try {
                try {
                    bq5.g(zp5.b, "connection to URL:" + this.s);
                    URL url = new URL(this.s);
                    HttpURLConnection.setFollowRedirects(true);
                    httpURLConnection = (HttpURLConnection) url.openConnection();
                } catch (Exception e2) {
                    httpURLConnection = null;
                    e = e2;
                } catch (Throwable th2) {
                    httpURLConnection = null;
                    th = th2;
                    if (httpURLConnection != null) {
                    }
                    throw th;
                }
                try {
                    httpURLConnection.setConnectTimeout(un3.f.v);
                    httpURLConnection.setRequestProperty("Connection", com.anythink.expressad.foundation.d.c.cd);
                    httpURLConnection.setRequestMethod("GET");
                    httpURLConnection.connect();
                    int responseCode = httpURLConnection.getResponseCode();
                    bq5.g(zp5.b, "response code:" + responseCode + ", for URL:" + this.s);
                    httpURLConnection.getInputStream().close();
                    httpURLConnection.getOutputStream().close();
                } catch (Exception e3) {
                    e = e3;
                    bq5.h(zp5.b, this.s + ": " + e.getMessage() + ":" + e.toString());
                    if (httpURLConnection == null) {
                        return;
                    }
                    httpURLConnection.disconnect();
                }
                httpURLConnection.disconnect();
            } catch (Throwable th3) {
                th = th3;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        }
    }

    /* compiled from: HttpTools.java */
    /* loaded from: classes3.dex */
    public static class b extends Thread {
        public final /* synthetic */ String s;
        public final /* synthetic */ File t;
        public final /* synthetic */ c u;

        public b(final String val$listener, final File val$outFile, final c val$url) {
            this.s = val$listener;
            this.t = val$outFile;
            this.u = val$url;
        }

        public static /* synthetic */ void a(final c listener) {
            listener.a();
        }

        public static /* synthetic */ void b(final c listener, final Exception e) {
            listener.b(e);
        }

        /* JADX WARN: Removed duplicated region for block: B:52:0x00d9  */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void run() {
            Throwable th;
            HttpURLConnection httpURLConnection;
            final Exception e;
            HttpURLConnection httpURLConnection2 = null;
            try {
                try {
                    bq5.g(zp5.b, "connection to URL:" + this.s);
                    URL url = new URL(this.s);
                    HttpURLConnection.setFollowRedirects(true);
                    httpURLConnection = (HttpURLConnection) url.openConnection();
                } catch (Exception e2) {
                    httpURLConnection = null;
                    e = e2;
                } catch (Throwable th2) {
                    th = th2;
                    if (0 != 0) {
                    }
                    throw th;
                }
                try {
                    httpURLConnection.setRequestMethod("GET");
                    FileOutputStream fileOutputStream = new FileOutputStream(this.t);
                    InputStream inputStream = httpURLConnection.getInputStream();
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read <= 0) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, read);
                    }
                    fileOutputStream.close();
                    int responseCode = httpURLConnection.getResponseCode();
                    bq5.g(zp5.b, "response code:" + responseCode + ", for URL:" + this.s);
                    httpURLConnection.getInputStream().close();
                    Handler handler = zp5.a;
                    final c cVar = this.u;
                    handler.post(new Runnable() { // from class: com.p7700g.p99005.vp5
                        @Override // java.lang.Runnable
                        public final void run() {
                            zp5.b.a(zp5.c.this);
                        }
                    });
                } catch (Exception e3) {
                    e = e3;
                    bq5.h(zp5.b, this.s + ": " + e.getMessage() + ":" + e.toString());
                    Handler handler2 = zp5.a;
                    final c cVar2 = this.u;
                    handler2.post(new Runnable() { // from class: com.p7700g.p99005.wp5
                        @Override // java.lang.Runnable
                        public final void run() {
                            zp5.b.b(zp5.c.this, e);
                        }
                    });
                    if (httpURLConnection == null) {
                        return;
                    }
                    httpURLConnection.disconnect();
                }
                httpURLConnection.disconnect();
            } catch (Throwable th3) {
                th = th3;
                if (0 != 0) {
                    httpURLConnection2.disconnect();
                }
                throw th;
            }
        }
    }

    /* compiled from: HttpTools.java */
    /* loaded from: classes3.dex */
    public interface c {
        void a();

        void b(Throwable t);
    }

    public static void c(final String url, File outFile, c listener) {
        if (!TextUtils.isEmpty(url)) {
            new b(url, outFile, listener).start();
        } else {
            bq5.h(b, "url is null or empty");
        }
    }

    public static void d(final String url) {
        if (!TextUtils.isEmpty(url)) {
            new a(url).start();
        } else {
            bq5.h(b, "url is null or empty");
        }
    }
}