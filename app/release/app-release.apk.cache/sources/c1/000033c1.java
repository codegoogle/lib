package com.ironsource.d;

import android.util.Pair;
import com.ironsource.environment.a;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.p7700g.p99005.sm4;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class b {
    private boolean a = true;
    private IronSourceError b = null;

    /* loaded from: classes3.dex */
    public static class a {
        public final String a;
        public final String b;
        public final String c;
        public final int d;
        public final int e;
        public final String f;
        public ArrayList<Pair<String, String>> g;

        /* renamed from: com.ironsource.d.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static class C0110a {
            public String b;
            public String d;
            public List<Pair<String, String>> a = new ArrayList();
            public String c = "POST";
            public int e = 15000;
            public int f = 15000;
            public String g = "UTF-8";

            public final C0110a a(List<Pair<String, String>> list) {
                this.a.addAll(list);
                return this;
            }

            public final a a() {
                return new a(this);
            }
        }

        public a(C0110a c0110a) {
            this.a = c0110a.b;
            this.b = c0110a.c;
            this.c = c0110a.d;
            this.g = new ArrayList<>(c0110a.a);
            this.d = c0110a.e;
            this.e = c0110a.f;
            this.f = c0110a.g;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static c a(a aVar) {
        HttpURLConnection httpURLConnection;
        InputStream inputStream;
        String str = aVar.a;
        String str2 = aVar.c;
        if ((str == null || str.isEmpty() || str2 == null || str2.isEmpty()) ? false : true) {
            c cVar = new c();
            InputStream inputStream2 = null;
            inputStream2 = null;
            inputStream2 = null;
            HttpURLConnection httpURLConnection2 = null;
            try {
                httpURLConnection = (HttpURLConnection) new URL(aVar.a).openConnection();
                httpURLConnection.setConnectTimeout(aVar.d);
                httpURLConnection.setReadTimeout(aVar.e);
                httpURLConnection.setRequestMethod(aVar.b);
                try {
                    b(httpURLConnection, aVar.g);
                    if ("POST".equals(aVar.b)) {
                        byte[] bytes = aVar.c.getBytes(aVar.f);
                        httpURLConnection.setRequestProperty(sm4.i, Integer.toString(bytes.length));
                        c(httpURLConnection, bytes);
                    }
                    inputStream2 = httpURLConnection.getInputStream();
                    cVar.a = httpURLConnection.getResponseCode();
                    if (inputStream2 != null) {
                        cVar.b = a.AnonymousClass1.a(inputStream2);
                    }
                    if (inputStream2 != null) {
                        inputStream2.close();
                    }
                    httpURLConnection.disconnect();
                } catch (IOException e) {
                    e = e;
                    inputStream = inputStream2;
                    httpURLConnection2 = httpURLConnection;
                    if (httpURLConnection2 != null) {
                        try {
                            int responseCode = httpURLConnection2.getResponseCode();
                            cVar.a = responseCode;
                            if (responseCode >= 400) {
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                httpURLConnection2.disconnect();
                                return cVar;
                            }
                        } catch (Throwable th) {
                            th = th;
                            InputStream inputStream3 = inputStream;
                            httpURLConnection = httpURLConnection2;
                            inputStream2 = inputStream3;
                            if (inputStream2 != null) {
                                inputStream2.close();
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            throw th;
                        }
                    }
                    throw e;
                } catch (Throwable th2) {
                    th = th2;
                    if (inputStream2 != null) {
                    }
                    if (httpURLConnection != null) {
                    }
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
                inputStream = null;
            } catch (Throwable th3) {
                th = th3;
                httpURLConnection = null;
            }
            return cVar;
        }
        throw new InvalidParameterException("not valid params");
    }

    public static c a(String str, String str2, List<Pair<String, String>> list) {
        a.C0110a c0110a = new a.C0110a();
        c0110a.b = str;
        c0110a.d = str2;
        c0110a.c = "POST";
        c0110a.a(list);
        return a(c0110a.a());
    }

    private static void b(HttpURLConnection httpURLConnection, List<Pair<String, String>> list) {
        for (Pair<String, String> pair : list) {
            httpURLConnection.setRequestProperty((String) pair.first, (String) pair.second);
        }
    }

    private static void c(HttpURLConnection httpURLConnection, byte[] bArr) {
        httpURLConnection.setDoOutput(true);
        DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
        try {
            dataOutputStream.write(bArr);
            dataOutputStream.flush();
        } finally {
            dataOutputStream.close();
        }
    }

    public void a(IronSourceError ironSourceError) {
        this.a = false;
        this.b = ironSourceError;
    }

    public boolean a() {
        return this.a;
    }

    public IronSourceError b() {
        return this.b;
    }

    public String toString() {
        StringBuilder sb;
        if (a()) {
            sb = new StringBuilder("valid:");
            sb.append(this.a);
        } else {
            sb = new StringBuilder("valid:");
            sb.append(this.a);
            sb.append(", IronSourceError:");
            sb.append(this.b);
        }
        return sb.toString();
    }
}