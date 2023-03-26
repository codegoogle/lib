package com.anythink.expressad.a;

import android.text.TextUtils;
import android.webkit.URLUtil;
import com.anythink.expressad.foundation.h.n;
import com.p7700g.p99005.sm4;
import com.p7700g.p99005.wo1;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.zip.GZIPInputStream;

/* loaded from: classes2.dex */
public class f {
    private static final String a = "f";
    private static final int b = 60000;
    private com.anythink.expressad.d.a c;
    private String d;
    private boolean e = true;
    private final int f = 3145728;
    private a g;

    /* loaded from: classes2.dex */
    public static class a {
        public String a;
        public String b;
        public String c;
        public String d;
        public int e;
        public int f;
        public String g;
        public String h;

        public final String a() {
            StringBuilder G = wo1.G("statusCode=");
            G.append(this.f);
            G.append(", ");
            G.append("location=");
            wo1.g0(G, this.a, ", ", "contentType=");
            wo1.g0(G, this.b, ", ", "contentLength=");
            G.append(this.e);
            G.append(", ");
            G.append("contentEncoding=");
            wo1.g0(G, this.c, ", ", "referer=");
            G.append(this.d);
            return G.toString();
        }

        public final String toString() {
            StringBuilder K = wo1.K("http响应头：...\n", "statusCode=");
            K.append(this.f);
            K.append(", ");
            K.append("location=");
            wo1.g0(K, this.a, ", ", "contentType=");
            wo1.g0(K, this.b, ", ", "contentLength=");
            K.append(this.e);
            K.append(", ");
            K.append("contentEncoding=");
            wo1.g0(K, this.c, ", ", "referer=");
            K.append(this.d);
            return K.toString();
        }
    }

    public f() {
        com.anythink.expressad.d.b.a();
        com.anythink.expressad.foundation.b.a.b().e();
        com.anythink.expressad.d.a b2 = com.anythink.expressad.d.b.b();
        this.c = b2;
        if (b2 == null) {
            com.anythink.expressad.d.b.a();
            this.c = com.anythink.expressad.d.b.c();
        }
    }

    private void a(boolean z) {
        this.e = z;
    }

    public final a a(String str, boolean z, boolean z2, com.anythink.expressad.foundation.d.c cVar) {
        HttpURLConnection httpURLConnection;
        int i;
        byte[] bytes;
        HttpURLConnection httpURLConnection2 = null;
        if (URLUtil.isNetworkUrl(str)) {
            String replace = str.replace(" ", "%20");
            URLUtil.isHttpsUrl(replace);
            String str2 = a;
            n.b(str2, replace);
            this.g = new a();
            try {
                httpURLConnection = (HttpURLConnection) new URL(replace).openConnection();
            } catch (Throwable th) {
                th = th;
            }
            try {
                httpURLConnection.setRequestMethod("GET");
                if ((!z && !z2) || cVar == null) {
                    httpURLConnection.setRequestProperty(sm4.v, com.anythink.core.common.j.d.i());
                }
                if (z && cVar != null && cVar.C() == 1) {
                    httpURLConnection.setRequestProperty(sm4.v, com.anythink.core.common.j.d.i());
                }
                if (z2 && cVar != null && cVar.B() == 1) {
                    httpURLConnection.setRequestProperty(sm4.v, com.anythink.core.common.j.d.i());
                }
                httpURLConnection.setRequestProperty(sm4.c, "gzip");
                if (this.c.w() && !TextUtils.isEmpty(this.d)) {
                    httpURLConnection.setRequestProperty("referer", this.d);
                }
                httpURLConnection.setConnectTimeout(b);
                httpURLConnection.setReadTimeout(b);
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.connect();
                this.g.a = httpURLConnection.getHeaderField("Location");
                this.g.d = httpURLConnection.getHeaderField("Referer");
                this.g.f = httpURLConnection.getResponseCode();
                this.g.b = httpURLConnection.getContentType();
                this.g.e = httpURLConnection.getContentLength();
                this.g.c = httpURLConnection.getContentEncoding();
                n.b(str2, this.g.toString());
                boolean equalsIgnoreCase = "gzip".equalsIgnoreCase(this.g.c);
                a aVar = this.g;
                if (aVar.f == 200 && this.e && (i = aVar.e) > 0 && i < 3145728 && !TextUtils.isEmpty(replace) && !replace.endsWith(".apk")) {
                    try {
                        String a2 = a(httpURLConnection.getInputStream(), equalsIgnoreCase);
                        if (!TextUtils.isEmpty(a2) && (bytes = a2.getBytes()) != null && bytes.length > 0 && bytes.length < 3145728) {
                            this.g.g = a2.trim();
                        }
                    } catch (Throwable unused) {
                    }
                }
                this.d = replace;
                httpURLConnection.disconnect();
                return this.g;
            } catch (Throwable th2) {
                th = th2;
                httpURLConnection2 = httpURLConnection;
                try {
                    this.g.h = th.getMessage();
                    n.c("http jump", "connecting");
                    return this.g;
                } finally {
                    if (httpURLConnection2 != null) {
                        httpURLConnection2.disconnect();
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0033 A[Catch: all -> 0x002c, TryCatch #5 {all -> 0x002c, blocks: (B:4:0x0008, B:5:0x000e, B:19:0x002f, B:21:0x0033, B:22:0x0040), top: B:36:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045 A[Catch: Exception -> 0x0049, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x0049, blocks: (B:10:0x0022, B:24:0x0045), top: B:39:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0054 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String a(InputStream inputStream, boolean z) {
        Throwable th;
        Exception e;
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = null;
        try {
            if (z) {
                try {
                    try {
                        inputStream = new GZIPInputStream(inputStream);
                    } catch (Throwable th2) {
                        th = th2;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (Exception e2) {
                                e2.printStackTrace();
                            }
                        }
                        throw th;
                    }
                } catch (Exception e3) {
                    e = e3;
                    if (this.g == null) {
                        a aVar = new a();
                        this.g = aVar;
                        aVar.h = e.getMessage();
                    }
                    e.printStackTrace();
                    if (bufferedReader != null) {
                        bufferedReader.close();
                    }
                    return sb.toString();
                }
            }
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                try {
                    String readLine = bufferedReader2.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb.append(readLine);
                } catch (Exception e4) {
                    e = e4;
                    bufferedReader = bufferedReader2;
                    if (this.g == null) {
                    }
                    e.printStackTrace();
                    if (bufferedReader != null) {
                    }
                    return sb.toString();
                } catch (Throwable th3) {
                    th = th3;
                    bufferedReader = bufferedReader2;
                    if (bufferedReader != null) {
                    }
                    throw th;
                }
            }
            bufferedReader2.close();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        return sb.toString();
    }
}