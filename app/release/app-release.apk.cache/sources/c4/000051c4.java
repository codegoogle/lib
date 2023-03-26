package com.p7700g.p99005;

import java.io.DataOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: HurlStack.java */
/* loaded from: classes3.dex */
public class n53 extends e53 {
    private static final int a = 100;
    private final b b;
    private final SSLSocketFactory c;

    /* compiled from: HurlStack.java */
    /* loaded from: classes3.dex */
    public static class a extends FilterInputStream {
        private final HttpURLConnection s;

        public a(HttpURLConnection connection) {
            super(n53.i(connection));
            this.s = connection;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            super.close();
            this.s.disconnect();
        }
    }

    /* compiled from: HurlStack.java */
    /* loaded from: classes3.dex */
    public interface b {
        String rewriteUrl(String originalUrl);
    }

    public n53() {
        this(null);
    }

    private static void d(HttpURLConnection connection, t43<?> request, byte[] body) throws IOException {
        connection.setDoOutput(true);
        if (!connection.getRequestProperties().containsKey("Content-Type")) {
            connection.setRequestProperty("Content-Type", request.k());
        }
        DataOutputStream dataOutputStream = new DataOutputStream(connection.getOutputStream());
        dataOutputStream.write(body);
        dataOutputStream.close();
    }

    private static void e(HttpURLConnection connection, t43<?> request) throws IOException, e43 {
        byte[] j = request.j();
        if (j != null) {
            d(connection, request, j);
        }
    }

    @r2
    public static List<l43> f(Map<String, List<String>> responseHeaders) {
        ArrayList arrayList = new ArrayList(responseHeaders.size());
        for (Map.Entry<String, List<String>> entry : responseHeaders.entrySet()) {
            if (entry.getKey() != null) {
                for (String str : entry.getValue()) {
                    arrayList.add(new l43(entry.getKey(), str));
                }
            }
        }
        return arrayList;
    }

    private static boolean h(int requestMethod, int responseCode) {
        return (requestMethod == 4 || (100 <= responseCode && responseCode < 200) || responseCode == 204 || responseCode == 304) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static InputStream i(HttpURLConnection connection) {
        try {
            return connection.getInputStream();
        } catch (IOException unused) {
            return connection.getErrorStream();
        }
    }

    private HttpURLConnection j(URL url, t43<?> request) throws IOException {
        SSLSocketFactory sSLSocketFactory;
        HttpURLConnection g = g(url);
        int A = request.A();
        g.setConnectTimeout(A);
        g.setReadTimeout(A);
        g.setUseCaches(false);
        g.setDoInput(true);
        if ("https".equals(url.getProtocol()) && (sSLSocketFactory = this.c) != null) {
            ((HttpsURLConnection) g).setSSLSocketFactory(sSLSocketFactory);
        }
        return g;
    }

    public static void k(HttpURLConnection connection, t43<?> request) throws IOException, e43 {
        switch (request.p()) {
            case -1:
                byte[] s = request.s();
                if (s != null) {
                    connection.setRequestMethod("POST");
                    d(connection, request, s);
                    return;
                }
                return;
            case 0:
                connection.setRequestMethod("GET");
                return;
            case 1:
                connection.setRequestMethod("POST");
                e(connection, request);
                return;
            case 2:
                connection.setRequestMethod(cm4.y0);
                e(connection, request);
                return;
            case 3:
                connection.setRequestMethod("DELETE");
                return;
            case 4:
                connection.setRequestMethod("HEAD");
                return;
            case 5:
                connection.setRequestMethod(cm4.B0);
                return;
            case 6:
                connection.setRequestMethod("TRACE");
                return;
            case 7:
                connection.setRequestMethod("PATCH");
                e(connection, request);
                return;
            default:
                throw new IllegalStateException("Unknown method type.");
        }
    }

    @Override // com.p7700g.p99005.e53
    public l53 b(t43<?> request, Map<String, String> additionalHeaders) throws IOException, e43 {
        String D = request.D();
        HashMap hashMap = new HashMap();
        hashMap.putAll(additionalHeaders);
        hashMap.putAll(request.o());
        b bVar = this.b;
        if (bVar != null) {
            String rewriteUrl = bVar.rewriteUrl(D);
            if (rewriteUrl == null) {
                throw new IOException(wo1.t("URL blocked by rewriter: ", D));
            }
            D = rewriteUrl;
        }
        HttpURLConnection j = j(new URL(D), request);
        try {
            for (String str : hashMap.keySet()) {
                j.setRequestProperty(str, (String) hashMap.get(str));
            }
            k(j, request);
            int responseCode = j.getResponseCode();
            if (responseCode != -1) {
                if (!h(request.p(), responseCode)) {
                    l53 l53Var = new l53(responseCode, f(j.getHeaderFields()));
                    j.disconnect();
                    return l53Var;
                }
                return new l53(responseCode, f(j.getHeaderFields()), j.getContentLength(), new a(j));
            }
            throw new IOException("Could not retrieve response code from HttpUrlConnection.");
        } catch (Throwable th) {
            if (0 == 0) {
                j.disconnect();
            }
            throw th;
        }
    }

    public HttpURLConnection g(URL url) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
        return httpURLConnection;
    }

    public n53(b urlRewriter) {
        this(urlRewriter, null);
    }

    public n53(b urlRewriter, SSLSocketFactory sslSocketFactory) {
        this.b = urlRewriter;
        this.c = sslSocketFactory;
    }
}