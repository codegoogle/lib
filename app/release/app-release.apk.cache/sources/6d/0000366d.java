package com.ironsource.sdk.k;

import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import com.p7700g.p99005.nr;
import com.p7700g.p99005.un3;
import com.p7700g.p99005.wo1;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class b {
    private static b c;
    public com.ironsource.sdk.k.a a = new com.ironsource.sdk.k.a(com.ironsource.environment.e.a.a());
    public final String b;
    private Thread d;

    /* loaded from: classes3.dex */
    public static class a implements Callable<C0133b> {
        private String a;
        private String b;
        private String c;
        private long d;
        private String e;

        public a(String str, String str2, String str3, long j, String str4) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = j;
            this.e = str4;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:125:0x00dd A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:134:0x00f7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:57:0x00d4 A[Catch: all -> 0x00f2, TRY_LEAVE, TryCatch #2 {all -> 0x00f2, blocks: (B:55:0x00ca, B:57:0x00d4, B:40:0x009f, B:42:0x00a9), top: B:129:0x0018 }] */
        /* JADX WARN: Removed duplicated region for block: B:63:0x00e5 A[Catch: all -> 0x00e1, TRY_LEAVE, TryCatch #0 {all -> 0x00e1, blocks: (B:59:0x00dd, B:63:0x00e5), top: B:125:0x00dd }] */
        /* JADX WARN: Removed duplicated region for block: B:74:0x00ff A[Catch: all -> 0x00fb, TRY_LEAVE, TryCatch #8 {all -> 0x00fb, blocks: (B:70:0x00f7, B:74:0x00ff), top: B:134:0x00f7 }] */
        /* JADX WARN: Type inference failed for: r3v10 */
        /* JADX WARN: Type inference failed for: r3v18 */
        /* JADX WARN: Type inference failed for: r3v5, types: [java.net.HttpURLConnection] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private C0133b b(String str, int i) {
            HttpURLConnection httpURLConnection;
            InputStream inputStream;
            InputStream inputStream2;
            int i2;
            ?? r3;
            int responseCode;
            C0133b c0133b = new C0133b();
            if (TextUtils.isEmpty(str)) {
                c0133b.a = str;
                c0133b.b = 1007;
                return c0133b;
            }
            int i3 = nr.t;
            InputStream inputStream3 = null;
            r3 = null;
            r3 = null;
            r3 = null;
            InputStream inputStream4 = null;
            HttpURLConnection httpURLConnection2 = null;
            try {
                try {
                    URL url = new URL(str);
                    url.toURI();
                    httpURLConnection = (HttpURLConnection) url.openConnection();
                } catch (FileNotFoundException unused) {
                    httpURLConnection = null;
                } catch (Error e) {
                    e = e;
                    inputStream2 = null;
                } catch (MalformedURLException unused2) {
                    httpURLConnection = null;
                } catch (SocketTimeoutException unused3) {
                    httpURLConnection = null;
                } catch (URISyntaxException unused4) {
                    httpURLConnection = null;
                } catch (Exception e2) {
                    e = e2;
                    inputStream = null;
                } catch (Throwable th) {
                    th = th;
                    httpURLConnection = null;
                }
                try {
                    try {
                        httpURLConnection.setRequestMethod("GET");
                        httpURLConnection.setConnectTimeout(un3.f.v);
                        httpURLConnection.setReadTimeout(un3.f.v);
                        httpURLConnection.connect();
                        responseCode = httpURLConnection.getResponseCode();
                    } catch (FileNotFoundException unused5) {
                        if (0 != 0) {
                            try {
                                inputStream3.close();
                            } catch (Throwable th2) {
                                th2.printStackTrace();
                                c0133b.a = str;
                                i2 = nr.s;
                                c0133b.b = i2;
                                return c0133b;
                            }
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        c0133b.a = str;
                        i2 = nr.s;
                        c0133b.b = i2;
                        return c0133b;
                    } catch (Error e3) {
                        e = e3;
                        inputStream2 = null;
                        httpURLConnection2 = httpURLConnection;
                        if (!TextUtils.isEmpty(e.getMessage())) {
                            Logger.i("DownloadManager", e.getMessage());
                        }
                        if (inputStream2 != null) {
                            try {
                                inputStream2.close();
                            } catch (Throwable th3) {
                                th3.printStackTrace();
                                c0133b.a = str;
                                c0133b.b = nr.t;
                                return c0133b;
                            }
                        }
                        if (httpURLConnection2 != null) {
                            httpURLConnection2.disconnect();
                        }
                        c0133b.a = str;
                        c0133b.b = nr.t;
                        return c0133b;
                    } catch (MalformedURLException unused6) {
                        if (0 != 0) {
                            try {
                                inputStream3.close();
                            } catch (Throwable th4) {
                                th4.printStackTrace();
                                c0133b.a = str;
                                i2 = 1004;
                                c0133b.b = i2;
                                return c0133b;
                            }
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        c0133b.a = str;
                        i2 = 1004;
                        c0133b.b = i2;
                        return c0133b;
                    } catch (SocketTimeoutException unused7) {
                        if (0 != 0) {
                            try {
                                inputStream3.close();
                            } catch (Throwable th5) {
                                th5.printStackTrace();
                                c0133b.a = str;
                                i2 = 1008;
                                c0133b.b = i2;
                                return c0133b;
                            }
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        c0133b.a = str;
                        i2 = 1008;
                        c0133b.b = i2;
                        return c0133b;
                    } catch (URISyntaxException unused8) {
                        if (0 != 0) {
                            try {
                                inputStream3.close();
                            } catch (Throwable th6) {
                                th6.printStackTrace();
                                c0133b.a = str;
                                i2 = 1010;
                                c0133b.b = i2;
                                return c0133b;
                            }
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        c0133b.a = str;
                        i2 = 1010;
                        c0133b.b = i2;
                        return c0133b;
                    }
                } catch (Exception e4) {
                    e = e4;
                    inputStream = null;
                    inputStream3 = httpURLConnection;
                    r3 = inputStream3;
                    if (!TextUtils.isEmpty(e.getMessage())) {
                    }
                    if (inputStream != null) {
                    }
                    if (r3 != 0) {
                    }
                    c0133b.a = str;
                    i2 = nr.j;
                    c0133b.b = i2;
                    return c0133b;
                } catch (Throwable th7) {
                    th = th7;
                    i3 = 0;
                    if (inputStream4 != null) {
                    }
                    if (httpURLConnection != null) {
                    }
                    c0133b.a = str;
                    c0133b.b = i3;
                    throw th;
                }
                try {
                    if (responseCode < 200 || responseCode >= 400) {
                        Logger.i("DownloadManager", " RESPONSE CODE: " + responseCode + " URL: " + str + " ATTEMPT: " + i);
                        responseCode = 1011;
                    } else {
                        inputStream4 = httpURLConnection.getInputStream();
                        c0133b.c = c(inputStream4);
                    }
                    if (inputStream4 != null) {
                        try {
                            inputStream4.close();
                        } catch (Throwable th8) {
                            th8.printStackTrace();
                        }
                    }
                    httpURLConnection.disconnect();
                    c0133b.a = str;
                    c0133b.b = responseCode;
                } catch (Exception e5) {
                    e = e5;
                    inputStream = inputStream4;
                    r3 = httpURLConnection;
                    if (!TextUtils.isEmpty(e.getMessage())) {
                        Logger.i("DownloadManager", e.getMessage());
                    }
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Throwable th9) {
                            th9.printStackTrace();
                            c0133b.a = str;
                            i2 = nr.j;
                            c0133b.b = i2;
                            return c0133b;
                        }
                    }
                    if (r3 != 0) {
                        r3.disconnect();
                    }
                    c0133b.a = str;
                    i2 = nr.j;
                    c0133b.b = i2;
                    return c0133b;
                } catch (Throwable th10) {
                    th = th10;
                    i3 = responseCode;
                    if (inputStream4 != null) {
                        try {
                            inputStream4.close();
                        } catch (Throwable th11) {
                            th11.printStackTrace();
                            c0133b.a = str;
                            c0133b.b = i3;
                            throw th;
                        }
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    c0133b.a = str;
                    c0133b.b = i3;
                    throw th;
                }
                return c0133b;
            } catch (Throwable th12) {
                th = th12;
                httpURLConnection = null;
                inputStream4 = null;
            }
        }

        private static byte[] c(InputStream inputStream) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[8192];
            while (true) {
                int read = inputStream.read(bArr, 0, 8192);
                if (read == -1) {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public final C0133b call() {
            int i;
            int i2;
            if (this.d == 0) {
                this.d = 1L;
            }
            C0133b c0133b = null;
            for (int i3 = 0; i3 < this.d && ((i2 = (c0133b = b(this.a, i3)).b) == 1008 || i2 == 1009); i3++) {
            }
            if (c0133b != null && c0133b.c != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(this.b);
                String str = File.separator;
                sb.append(str);
                sb.append(this.c);
                String sb2 = sb.toString();
                StringBuilder sb3 = new StringBuilder();
                wo1.g0(sb3, this.e, str, "tmp_");
                sb3.append(this.c);
                String sb4 = sb3.toString();
                try {
                    if (IronSourceStorageUtils.saveFile(c0133b.c, sb4) == 0) {
                        c0133b.b = 1006;
                    } else if (!IronSourceStorageUtils.renameFile(sb4, sb2)) {
                        c0133b.b = 1020;
                    }
                } catch (FileNotFoundException unused) {
                    i = nr.s;
                    c0133b.b = i;
                } catch (Error e) {
                    if (!TextUtils.isEmpty(e.getMessage())) {
                        Logger.i("DownloadManager", e.getMessage());
                    }
                    i = nr.t;
                    c0133b.b = i;
                } catch (Exception e2) {
                    if (!TextUtils.isEmpty(e2.getMessage())) {
                        Logger.i("DownloadManager", e2.getMessage());
                    }
                    c0133b.b = nr.j;
                }
            }
            return c0133b;
        }
    }

    /* renamed from: com.ironsource.sdk.k.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0133b {
        public String a;
        public int b;
        public byte[] c;
    }

    /* loaded from: classes3.dex */
    public static class c implements Runnable {
        private final String t;
        private Handler u;
        private String v;
        private String w;
        private String x;
        private final long s = 3;
        private long y = 3;

        public c(com.ironsource.sdk.h.c cVar, String str, Handler handler, String str2) {
            this.v = str;
            this.w = cVar.getParent();
            this.x = cVar.getName();
            this.u = handler;
            this.t = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i;
            com.ironsource.sdk.h.c cVar = new com.ironsource.sdk.h.c(this.w, this.x);
            Message message = new Message();
            message.obj = cVar;
            String makeDir = IronSourceStorageUtils.makeDir(cVar.getParent());
            if (makeDir == null) {
                i = 1020;
            } else {
                i = new a(this.v, makeDir, cVar.getName(), this.y, this.t).call().b;
                if (i == 200) {
                    i = nr.q;
                }
            }
            message.what = i;
            this.u.sendMessage(message);
        }
    }

    private b(String str, com.ironsource.environment.e.a aVar) {
        this.b = str;
        IronSourceStorageUtils.deleteFolder(c());
        IronSourceStorageUtils.makeDir(c());
    }

    public static synchronized b a(String str, com.ironsource.environment.e.a aVar) {
        b bVar;
        synchronized (b.class) {
            if (c == null) {
                c = new b(str, aVar);
            }
            bVar = c;
        }
        return bVar;
    }

    private String c() {
        return IronSourceStorageUtils.buildAbsolutePathToDirInCache(this.b, "temp");
    }

    public final synchronized void a() {
        c = null;
        com.ironsource.sdk.k.a aVar = this.a;
        if (aVar != null) {
            aVar.a = null;
            this.a = null;
        }
    }

    public final void a(com.ironsource.sdk.h.c cVar, String str) {
        Thread thread = new Thread(new c(cVar, str, this.a, c()));
        this.d = thread;
        thread.start();
    }

    public final void a(com.ironsource.sdk.h.c cVar, String str, Handler handler) {
        new Thread(new c(cVar, str, handler, c())).start();
    }

    public final boolean b() {
        Thread thread = this.d;
        return thread != null && thread.isAlive();
    }
}