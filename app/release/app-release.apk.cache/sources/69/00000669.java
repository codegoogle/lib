package com.anythink.core.common.g;

import android.content.Context;
import com.anythink.core.api.AdError;
import com.anythink.core.api.ErrorCode;
import com.anythink.core.common.b.g;
import com.anythink.core.common.b.m;
import com.microsoft.appcenter.AppCenter;
import com.p7700g.p99005.sm4;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.apache.http.conn.ConnectTimeoutException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class a {
    private static final String a = "http.loader";
    public h k;
    public boolean l;

    /* renamed from: com.anythink.core.common.g.a$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass1 extends com.anythink.core.common.j.b.b {
        public final /* synthetic */ int a;

        public AnonymousClass1(int i) {
            this.a = i;
        }

        private void b(String str) {
            HttpURLConnection httpURLConnection;
            byte[] d;
            HttpURLConnection httpURLConnection2 = null;
            try {
                try {
                    com.anythink.core.common.j.e.b(a.a, "REQUEST URL: ".concat(String.valueOf(str)));
                    httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                } catch (OutOfMemoryError e) {
                    e = e;
                } catch (StackOverflowError e2) {
                    e = e2;
                } catch (Error e3) {
                    e = e3;
                } catch (ConnectException e4) {
                    e = e4;
                } catch (SocketTimeoutException e5) {
                    e = e5;
                } catch (UnknownHostException e6) {
                    e = e6;
                } catch (ConnectTimeoutException e7) {
                    e = e7;
                } catch (Exception e8) {
                    e = e8;
                }
                try {
                    int a = a.this.a();
                    if (a != 1 && a != 2) {
                        a = 2;
                    }
                    if (a == 1) {
                        httpURLConnection.setDoInput(true);
                        httpURLConnection.setDoOutput(true);
                        httpURLConnection.setRequestMethod("POST");
                        httpURLConnection.setUseCaches(false);
                    }
                    if (a == 2) {
                        httpURLConnection.setInstanceFollowRedirects(false);
                    }
                    Map<String, String> c = a.this.c();
                    if (c != null && c.size() > 0) {
                        for (String str2 : c.keySet()) {
                            httpURLConnection.addRequestProperty(str2, c.get(str2));
                        }
                    }
                    a aVar = a.this;
                    if (aVar.l) {
                        aVar.a(this.a);
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                            return;
                        }
                        return;
                    }
                    if (m.a().a("ua")) {
                        httpURLConnection.addRequestProperty(sm4.v, com.anythink.core.common.j.g.a());
                    }
                    httpURLConnection.setConnectTimeout(60000);
                    httpURLConnection.setReadTimeout(60000);
                    httpURLConnection.connect();
                    if (a == 1 && (d = a.this.d()) != null) {
                        OutputStream outputStream = httpURLConnection.getOutputStream();
                        outputStream.write(d);
                        outputStream.flush();
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode != 200) {
                        if (responseCode != 302 && responseCode != 301 && responseCode != 307) {
                            a.this.a(this.a, "Http respond status code is ".concat(String.valueOf(responseCode)), ErrorCode.getErrorCode(ErrorCode.httpStatuException, String.valueOf(responseCode), httpURLConnection.getResponseMessage()));
                            httpURLConnection.disconnect();
                            return;
                        }
                        a aVar2 = a.this;
                        if (!aVar2.l) {
                            String headerField = httpURLConnection.getHeaderField("Location");
                            if (headerField != null) {
                                if (!headerField.startsWith("http")) {
                                    headerField = str + headerField;
                                }
                                b(headerField);
                            }
                        } else {
                            aVar2.a(this.a);
                        }
                        httpURLConnection.disconnect();
                        return;
                    }
                    a aVar3 = a.this;
                    if (aVar3.l) {
                        aVar3.a(this.a);
                        httpURLConnection.disconnect();
                        return;
                    }
                    InputStream a2 = a.a(httpURLConnection);
                    InputStreamReader inputStreamReader = new InputStreamReader(a2);
                    BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                    StringBuilder sb = new StringBuilder();
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        sb.append(readLine);
                    }
                    bufferedReader.close();
                    inputStreamReader.close();
                    if (a2 != null) {
                        a2.close();
                    }
                    if (a.this.o()) {
                        String trim = sb.toString().trim();
                        JSONObject jSONObject = new JSONObject(trim);
                        int optInt = jSONObject.optInt("code");
                        if (optInt == 0) {
                            JSONObject optJSONObject = jSONObject.optJSONObject(g.c.d);
                            if (optJSONObject == null) {
                                optJSONObject = new JSONObject();
                            }
                            String jSONObject2 = optJSONObject.toString();
                            a aVar4 = a.this;
                            httpURLConnection.getHeaderFields();
                            a.this.a(this.a, aVar4.a(jSONObject2));
                        } else {
                            a.this.a(this.a, trim, ErrorCode.getErrorCode(ErrorCode.statuError, String.valueOf(optInt), trim));
                        }
                    } else {
                        a aVar5 = a.this;
                        httpURLConnection.getHeaderFields();
                        a.this.a(this.a, aVar5.a(sb.toString()));
                    }
                    httpURLConnection.disconnect();
                } catch (StackOverflowError e9) {
                    e = e9;
                    httpURLConnection2 = httpURLConnection;
                    System.gc();
                    String message = e.getMessage();
                    if (e.getMessage() != null) {
                        message = e.getMessage();
                    }
                    a.this.a(this.a, message, ErrorCode.getErrorCode(ErrorCode.exception, ErrorCode.exception, e.getMessage()));
                    if (httpURLConnection2 != null) {
                        httpURLConnection2.disconnect();
                    }
                } catch (Error e10) {
                    e = e10;
                    httpURLConnection2 = httpURLConnection;
                    System.gc();
                    String message2 = e.getMessage();
                    if (e.getMessage() != null) {
                        message2 = e.getMessage();
                    }
                    a.this.a(this.a, message2, ErrorCode.getErrorCode(ErrorCode.exception, ErrorCode.exception, e.getMessage()));
                    if (httpURLConnection2 != null) {
                        httpURLConnection2.disconnect();
                    }
                } catch (ConnectException e11) {
                    e = e11;
                    httpURLConnection2 = httpURLConnection;
                    a.this.a(ErrorCode.getErrorCode(ErrorCode.exception, ErrorCode.exception, e.getMessage()));
                    a.this.a(this.a, "Connect error.", ErrorCode.getErrorCode(ErrorCode.exception, ErrorCode.exception, e.getMessage()));
                    com.anythink.core.common.j.e.d(a.a, "http connect error! " + e.toString());
                    if (httpURLConnection2 != null) {
                        httpURLConnection2.disconnect();
                    }
                } catch (SocketTimeoutException e12) {
                    e = e12;
                    httpURLConnection2 = httpURLConnection;
                    a.this.a(this.a, "Connect timeout.", ErrorCode.getErrorCode(ErrorCode.exception, ErrorCode.exception, e.getMessage()));
                    if (httpURLConnection2 != null) {
                        httpURLConnection2.disconnect();
                    }
                } catch (UnknownHostException e13) {
                    e = e13;
                    httpURLConnection2 = httpURLConnection;
                    a.this.a(ErrorCode.getErrorCode(ErrorCode.exception, ErrorCode.exception, e.getMessage()));
                    a.this.a(this.a, "UnknownHostException", ErrorCode.getErrorCode(ErrorCode.exception, ErrorCode.exception, e.getMessage()));
                    com.anythink.core.common.j.e.d(a.a, "UnknownHostException " + e.toString());
                    if (httpURLConnection2 != null) {
                        httpURLConnection2.disconnect();
                    }
                } catch (ConnectTimeoutException e14) {
                    e = e14;
                    httpURLConnection2 = httpURLConnection;
                    a.this.a(this.a, e);
                    if (httpURLConnection2 != null) {
                        httpURLConnection2.disconnect();
                    }
                } catch (Exception e15) {
                    e = e15;
                    httpURLConnection2 = httpURLConnection;
                    String message3 = e.getMessage();
                    if (e.getMessage() != null) {
                        message3 = e.getMessage();
                    }
                    a.this.a(this.a, message3, ErrorCode.getErrorCode(ErrorCode.exception, ErrorCode.exception, e.getMessage()));
                    if (httpURLConnection2 != null) {
                        httpURLConnection2.disconnect();
                    }
                } catch (OutOfMemoryError e16) {
                    e = e16;
                    httpURLConnection2 = httpURLConnection;
                    System.gc();
                    String message4 = e.getMessage();
                    if (e.getMessage() != null) {
                        message4 = e.getMessage();
                    }
                    a.this.a(this.a, message4, ErrorCode.getErrorCode(ErrorCode.exception, ErrorCode.exception, e.getMessage()));
                    if (httpURLConnection2 != null) {
                        httpURLConnection2.disconnect();
                    }
                } catch (Throwable th) {
                    th = th;
                    httpURLConnection2 = httpURLConnection;
                    if (httpURLConnection2 != null) {
                        httpURLConnection2.disconnect();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0054  */
        /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
        @Override // com.anythink.core.common.j.b.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void a() {
            h hVar;
            try {
                h hVar2 = a.this.k;
                if (hVar2 != null) {
                    hVar2.onLoadStart(this.a);
                }
                b(a.this.b());
            } catch (Exception e) {
                String message = e.getMessage();
                if (e.getMessage() != null) {
                    message = e.getMessage();
                }
                h hVar3 = a.this.k;
                if (hVar3 != null) {
                    hVar3.onLoadError(this.a, message, ErrorCode.getErrorCode(ErrorCode.exception, ErrorCode.exception, e.getMessage()));
                }
            } catch (OutOfMemoryError e2) {
                e = e2;
                System.gc();
                String message2 = e.getMessage();
                if (e.getMessage() != null) {
                    message2 = e.getMessage();
                }
                hVar = a.this.k;
                if (hVar == null) {
                    hVar.onLoadError(this.a, message2, ErrorCode.getErrorCode(ErrorCode.exception, ErrorCode.exception, e.getMessage()));
                }
            } catch (StackOverflowError e3) {
                e = e3;
                System.gc();
                String message22 = e.getMessage();
                if (e.getMessage() != null) {
                }
                hVar = a.this.k;
                if (hVar == null) {
                }
            }
        }
    }

    private void b(int i) {
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(i);
        if (p()) {
            com.anythink.core.common.j.b.a.a().a((com.anythink.core.common.j.b.b) anonymousClass1, 1);
        } else {
            com.anythink.core.common.j.b.a.a().a((com.anythink.core.common.j.b.b) anonymousClass1, 2);
        }
    }

    public static byte[] c(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(str.getBytes("utf-8"));
            gZIPOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return byteArrayOutputStream.toByteArray();
    }

    private void q() {
        this.l = true;
    }

    public abstract int a();

    public abstract Object a(String str);

    public void a(int i, h hVar) {
        this.l = false;
        this.k = hVar;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(i);
        if (p()) {
            com.anythink.core.common.j.b.a.a().a((com.anythink.core.common.j.b.b) anonymousClass1, 1);
        } else {
            com.anythink.core.common.j.b.a.a().a((com.anythink.core.common.j.b.b) anonymousClass1, 2);
        }
    }

    public abstract void a(AdError adError);

    public abstract String b();

    public abstract void b(AdError adError);

    public abstract Map<String, String> c();

    public abstract byte[] d();

    public JSONObject e() {
        return c.a(n());
    }

    public JSONObject f() {
        return c.a();
    }

    public String g() {
        HashMap hashMap = new HashMap();
        String a2 = com.anythink.core.common.j.c.a(e().toString());
        String a3 = com.anythink.core.common.j.c.a(f().toString());
        hashMap.put(c.L, "1.0");
        hashMap.put("p", a2);
        hashMap.put(c.U, a3);
        ArrayList arrayList = new ArrayList(hashMap.size());
        arrayList.addAll(hashMap.keySet());
        Collections.sort(arrayList);
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (sb.length() > 0) {
                sb.append("&");
            }
            sb.append(str);
            sb.append(AppCenter.KEY_VALUE_DELIMITER);
            sb.append(hashMap.get(str));
        }
        com.anythink.core.common.j.e.a(a, " sorted value list:" + sb.toString());
        hashMap.put("sign", com.anythink.core.common.j.f.c(k() + sb.toString()));
        Set<String> keySet = hashMap.keySet();
        JSONObject jSONObject = new JSONObject();
        try {
            for (String str2 : keySet) {
                jSONObject.put(str2, String.valueOf(hashMap.get(str2)));
            }
            return jSONObject.toString();
        } catch (Exception unused) {
            return null;
        } catch (OutOfMemoryError unused2) {
            System.gc();
            return null;
        }
    }

    public abstract boolean h();

    public abstract String i();

    public abstract Context j();

    public abstract String k();

    public abstract String l();

    public abstract Map<String, Object> m();

    public int n() {
        return 0;
    }

    public boolean o() {
        return false;
    }

    public boolean p() {
        return false;
    }

    public final void a(int i, ConnectTimeoutException connectTimeoutException) {
        AdError errorCode = ErrorCode.getErrorCode(ErrorCode.exception, ErrorCode.exception, connectTimeoutException.getMessage());
        h hVar = this.k;
        if (hVar != null) {
            hVar.onLoadError(i, "Connect timeout.", errorCode);
        }
        b(errorCode);
    }

    public final void a(int i, String str, AdError adError) {
        h hVar = this.k;
        if (hVar != null) {
            hVar.onLoadError(i, str, adError);
        }
        b(adError);
    }

    public final void a(int i) {
        h hVar = this.k;
        if (hVar != null) {
            hVar.onLoadCanceled(i);
        }
    }

    public void a(int i, Object obj) {
        h hVar = this.k;
        if (hVar != null) {
            hVar.onLoadFinish(i, obj);
        }
    }

    public static InputStream a(HttpURLConnection httpURLConnection) {
        InputStream inputStream = null;
        if (httpURLConnection == null) {
            return null;
        }
        try {
            inputStream = httpURLConnection.getInputStream();
        } catch (Exception unused) {
        }
        if ("gzip".equalsIgnoreCase(httpURLConnection.getHeaderField("Content-Encoding"))) {
            try {
                byte[] bArr = new byte[2];
                BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
                bufferedInputStream.mark(2);
                int read = bufferedInputStream.read(bArr);
                bufferedInputStream.reset();
                return (read == -1 || (((bArr[1] & 255) << 8) | (bArr[0] & 255)) != 35615) ? bufferedInputStream : new GZIPInputStream(bufferedInputStream);
            } catch (Exception unused2) {
                return inputStream;
            }
        }
        return inputStream;
    }
}