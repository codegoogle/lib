package com.anythink.expressad.foundation.g.f.e;

import android.text.TextUtils;
import com.anythink.expressad.foundation.g.f.c.c;
import com.anythink.expressad.foundation.g.f.d.f;
import com.anythink.expressad.foundation.g.f.i;
import com.p7700g.p99005.cm4;
import java.io.DataOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes2.dex */
public final class b implements com.anythink.expressad.foundation.g.f.e.a {
    private static final int a = 100;
    private SSLSocketFactory c = null;
    private com.anythink.expressad.foundation.g.f.c.a b = null;

    /* loaded from: classes2.dex */
    public static class a extends FilterInputStream {
        private final HttpURLConnection a;

        public a(HttpURLConnection httpURLConnection) {
            super(b.b(httpURLConnection));
            this.a = httpURLConnection;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            super.close();
            this.a.disconnect();
        }
    }

    private static boolean a(int i, int i2) {
        if (i != 4) {
            return ((100 <= i2 && i2 < 200) || i2 == 204 || i2 == 304) ? false : true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static InputStream b(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getInputStream();
        } catch (IOException unused) {
            return httpURLConnection.getErrorStream();
        }
    }

    @Override // com.anythink.expressad.foundation.g.f.e.a
    public final com.anythink.expressad.foundation.g.f.f.b a(i<?> iVar) {
        HttpURLConnection httpURLConnection;
        SSLSocketFactory sSLSocketFactory;
        URL url = new URL(iVar.d());
        com.anythink.expressad.foundation.g.f.c.a aVar = this.b;
        if (aVar != null && !TextUtils.isEmpty(aVar.b) && !TextUtils.isEmpty(this.b.c)) {
            Proxy.Type type = Proxy.Type.HTTP;
            com.anythink.expressad.foundation.g.f.c.a aVar2 = this.b;
            httpURLConnection = (HttpURLConnection) url.openConnection(new Proxy(type, new InetSocketAddress(aVar2.b, Integer.valueOf(aVar2.c).intValue())));
        } else {
            httpURLConnection = (HttpURLConnection) url.openConnection();
        }
        boolean z = false;
        httpURLConnection.setInstanceFollowRedirects(false);
        int k = iVar.k();
        httpURLConnection.setConnectTimeout(k);
        httpURLConnection.setReadTimeout(k);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        if ("https".equals(url.getProtocol()) && (sSLSocketFactory = this.c) != null) {
            ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(sSLSocketFactory);
        }
        try {
            for (Map.Entry<String, String> entry : iVar.g().entrySet()) {
                httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
            }
            switch (iVar.a()) {
                case 0:
                    httpURLConnection.setRequestMethod("GET");
                    break;
                case 1:
                    httpURLConnection.setRequestMethod("POST");
                    b(httpURLConnection, iVar);
                    break;
                case 2:
                    httpURLConnection.setRequestMethod(cm4.y0);
                    b(httpURLConnection, iVar);
                    break;
                case 3:
                    httpURLConnection.setRequestMethod("DELETE");
                    break;
                case 4:
                    httpURLConnection.setRequestMethod("HEAD");
                    break;
                case 5:
                    httpURLConnection.setRequestMethod(cm4.B0);
                    break;
                case 6:
                    httpURLConnection.setRequestMethod("TRACE");
                    break;
                case 7:
                    b(httpURLConnection, iVar);
                    httpURLConnection.setRequestMethod("PATCH");
                    break;
                default:
                    throw new IllegalStateException("Unknown method type.");
            }
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode != -1) {
                if (!((iVar.a() == 4 || (100 <= responseCode && responseCode < 200) || responseCode == 204 || responseCode == 304) ? false : true)) {
                    com.anythink.expressad.foundation.g.f.f.b bVar = new com.anythink.expressad.foundation.g.f.f.b(responseCode, a(httpURLConnection.getHeaderFields()));
                    httpURLConnection.disconnect();
                    return bVar;
                }
                try {
                    return new com.anythink.expressad.foundation.g.f.f.b(responseCode, a(httpURLConnection.getHeaderFields()), new a(httpURLConnection));
                } catch (Throwable th) {
                    th = th;
                    z = true;
                    if (!z) {
                        httpURLConnection.disconnect();
                    }
                    throw th;
                }
            }
            throw new IOException("Could not retrieve response code from HttpUrlConnection.");
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static void b(HttpURLConnection httpURLConnection, i<?> iVar) {
        byte[] h = iVar.h();
        if (h != null) {
            boolean z = iVar instanceof f;
            if (z) {
                httpURLConnection.setChunkedStreamingMode(2048);
            }
            httpURLConnection.setDoOutput(true);
            DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
            dataOutputStream.write(h);
            if (z) {
                iVar.a((OutputStream) dataOutputStream);
            }
            dataOutputStream.close();
        }
    }

    private static List<c> a(Map<String, List<String>> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            if (entry.getKey() != null) {
                for (String str : entry.getValue()) {
                    arrayList.add(new c(entry.getKey(), str));
                }
            }
        }
        return arrayList;
    }

    private HttpURLConnection a(URL url) {
        HttpURLConnection httpURLConnection;
        com.anythink.expressad.foundation.g.f.c.a aVar = this.b;
        if (aVar != null && !TextUtils.isEmpty(aVar.b) && !TextUtils.isEmpty(this.b.c)) {
            Proxy.Type type = Proxy.Type.HTTP;
            com.anythink.expressad.foundation.g.f.c.a aVar2 = this.b;
            httpURLConnection = (HttpURLConnection) url.openConnection(new Proxy(type, new InetSocketAddress(aVar2.b, Integer.valueOf(aVar2.c).intValue())));
        } else {
            httpURLConnection = (HttpURLConnection) url.openConnection();
        }
        httpURLConnection.setInstanceFollowRedirects(false);
        return httpURLConnection;
    }

    private static void a(HttpURLConnection httpURLConnection, i<?> iVar) {
        switch (iVar.a()) {
            case 0:
                httpURLConnection.setRequestMethod("GET");
                return;
            case 1:
                httpURLConnection.setRequestMethod("POST");
                b(httpURLConnection, iVar);
                return;
            case 2:
                httpURLConnection.setRequestMethod(cm4.y0);
                b(httpURLConnection, iVar);
                return;
            case 3:
                httpURLConnection.setRequestMethod("DELETE");
                return;
            case 4:
                httpURLConnection.setRequestMethod("HEAD");
                return;
            case 5:
                httpURLConnection.setRequestMethod(cm4.B0);
                return;
            case 6:
                httpURLConnection.setRequestMethod("TRACE");
                return;
            case 7:
                b(httpURLConnection, iVar);
                httpURLConnection.setRequestMethod("PATCH");
                return;
            default:
                throw new IllegalStateException("Unknown method type.");
        }
    }

    private HttpURLConnection a(URL url, i<?> iVar) {
        HttpURLConnection httpURLConnection;
        SSLSocketFactory sSLSocketFactory;
        com.anythink.expressad.foundation.g.f.c.a aVar = this.b;
        if (aVar != null && !TextUtils.isEmpty(aVar.b) && !TextUtils.isEmpty(this.b.c)) {
            Proxy.Type type = Proxy.Type.HTTP;
            com.anythink.expressad.foundation.g.f.c.a aVar2 = this.b;
            httpURLConnection = (HttpURLConnection) url.openConnection(new Proxy(type, new InetSocketAddress(aVar2.b, Integer.valueOf(aVar2.c).intValue())));
        } else {
            httpURLConnection = (HttpURLConnection) url.openConnection();
        }
        httpURLConnection.setInstanceFollowRedirects(false);
        int k = iVar.k();
        httpURLConnection.setConnectTimeout(k);
        httpURLConnection.setReadTimeout(k);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        if ("https".equals(url.getProtocol()) && (sSLSocketFactory = this.c) != null) {
            ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(sSLSocketFactory);
        }
        return httpURLConnection;
    }
}