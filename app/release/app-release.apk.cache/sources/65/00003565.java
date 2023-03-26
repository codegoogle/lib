package com.ironsource.mediationsdk.server;

import android.text.TextUtils;
import com.ironsource.mediationsdk.L;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes3.dex */
public class HttpFunctions {
    public static final String ERROR_PREFIX = "ERROR:";
    private static final ExecutorService a = Executors.newSingleThreadExecutor();

    /* loaded from: classes3.dex */
    public static class a implements Runnable {
        private /* synthetic */ String s;
        private /* synthetic */ String t;
        private /* synthetic */ String u;
        private /* synthetic */ String v;
        private /* synthetic */ com.ironsource.mediationsdk.server.a w;

        public a(String str, String str2, String str3, String str4, com.ironsource.mediationsdk.server.a aVar) {
            this.s = str;
            this.t = str2;
            this.u = str3;
            this.v = str4;
            this.w = aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:48:0x00c6  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x00bc A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r1v0, types: [java.io.OutputStream, java.net.HttpURLConnection] */
        /* JADX WARN: Type inference failed for: r1v2, types: [java.io.OutputStream] */
        /* JADX WARN: Type inference failed for: r1v3 */
        /* JADX WARN: Type inference failed for: r1v4, types: [java.io.OutputStream] */
        /* JADX WARN: Type inference failed for: r1v5 */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void run() {
            Exception e;
            HttpURLConnection httpURLConnection;
            String str;
            ?? r1 = 0;
            r1 = 0;
            try {
                try {
                    URL url = new URL(this.s);
                    String str2 = this.t;
                    if (str2 != null && (str = this.u) != null) {
                        IronSourceUtils.getBase64Auth(str2, str);
                        throw null;
                    }
                    httpURLConnection = (HttpURLConnection) url.openConnection();
                } catch (Exception e2) {
                    e = e2;
                    httpURLConnection = null;
                } catch (Throwable th) {
                    th = th;
                    if (0 != 0) {
                    }
                    if (0 != 0) {
                    }
                    throw th;
                }
                try {
                    httpURLConnection.setReadTimeout(15000);
                    httpURLConnection.setConnectTimeout(15000);
                    httpURLConnection.setRequestMethod("POST");
                    boolean z = true;
                    httpURLConnection.setDoInput(true);
                    httpURLConnection.setDoOutput(true);
                    r1 = httpURLConnection.getOutputStream();
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter((OutputStream) r1, "UTF-8"));
                    bufferedWriter.write(this.v);
                    bufferedWriter.flush();
                    bufferedWriter.close();
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode != 200) {
                        z = false;
                    }
                    if (!z) {
                        IronLog.INTERNAL.error("invalid response code " + responseCode + " sending request");
                    }
                    this.w.a(z);
                    if (r1 != 0) {
                        try {
                            r1.close();
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                    }
                    httpURLConnection.disconnect();
                } catch (Exception e4) {
                    e = e4;
                    e.printStackTrace();
                    IronLog.INTERNAL.error("exception while sending request " + e.getMessage());
                    this.w.a(false);
                    if (r1 != 0) {
                        try {
                            r1.close();
                        } catch (IOException e5) {
                            e5.printStackTrace();
                        }
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (0 != 0) {
                    try {
                        r1.close();
                    } catch (IOException e6) {
                        e6.printStackTrace();
                    }
                }
                if (0 != 0) {
                    r1.disconnect();
                }
                throw th;
            }
        }
    }

    public static String getStringFromURL(String str) {
        return getStringFromURL(str, null);
    }

    public static String getStringFromURL(String str, L.a aVar) {
        BufferedReader bufferedReader;
        HttpURLConnection httpURLConnection;
        BufferedReader bufferedReader2;
        HttpURLConnection httpURLConnection2 = null;
        try {
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            try {
                httpURLConnection.setReadTimeout(15000);
                httpURLConnection.setConnectTimeout(15000);
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setDoInput(true);
                httpURLConnection.connect();
                if (httpURLConnection.getResponseCode() == 400) {
                    if (aVar != null) {
                        aVar.a("Bad Request - 400");
                    }
                    httpURLConnection.disconnect();
                    return null;
                }
                bufferedReader2 = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                try {
                    StringBuilder sb = new StringBuilder();
                    while (true) {
                        String readLine = bufferedReader2.readLine();
                        if (readLine == null) {
                            break;
                        }
                        sb.append(readLine);
                    }
                    String sb2 = sb.toString();
                    boolean isEmpty = TextUtils.isEmpty(sb2);
                    httpURLConnection.disconnect();
                    bufferedReader2.close();
                    if (isEmpty) {
                        return null;
                    }
                    return sb2;
                } catch (Exception unused) {
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    if (bufferedReader2 != null) {
                        bufferedReader2.close();
                    }
                    return null;
                } catch (Throwable th) {
                    httpURLConnection2 = httpURLConnection;
                    bufferedReader = bufferedReader2;
                    th = th;
                    if (httpURLConnection2 != null) {
                        httpURLConnection2.disconnect();
                    }
                    if (bufferedReader != null) {
                        bufferedReader.close();
                    }
                    throw th;
                }
            } catch (Exception unused2) {
                bufferedReader2 = null;
            } catch (Throwable th2) {
                th = th2;
                httpURLConnection2 = httpURLConnection;
                bufferedReader = null;
            }
        } catch (Exception unused3) {
            httpURLConnection = null;
            bufferedReader2 = null;
        } catch (Throwable th3) {
            th = th3;
            bufferedReader = null;
        }
    }

    public static void sendPostRequest(String str, String str2, com.ironsource.mediationsdk.server.a aVar) {
        sendPostRequestWithAutho(str, str2, null, null, aVar);
    }

    public static void sendPostRequestWithAutho(String str, String str2, String str3, String str4, com.ironsource.mediationsdk.server.a aVar) {
        a.submit(new a(str, str3, str4, str2, aVar));
    }
}