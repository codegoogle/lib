package com.anythink.expressad.videocommon.b;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.anythink.expressad.foundation.d.q;
import com.anythink.expressad.foundation.g.f.d.b;
import com.anythink.expressad.foundation.h.n;
import com.p7700g.p99005.wo1;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.Serializable;
import java.math.BigDecimal;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class a implements Serializable {
    public static final String a = "2000077";
    public static final String b = "CampaignDownLoadTask";
    private static final long c = -510642107992871538L;
    private static final int d = 1;
    private static final int e = 2000;
    private static final int g = 1;
    private static final int h = 2;
    private static final int i = 3;
    private static final int j = 4;
    private static final int k = 5;
    private static final String l = "errorMsg";
    private static final int o = 10010;
    private Class A;
    private Object B;
    private com.anythink.expressad.foundation.d.c C;
    private String D;
    private Context F;
    private long G;
    private String H;
    private String I;
    private String M;
    private long P;
    private com.anythink.expressad.videocommon.d.b Q;
    private com.anythink.expressad.videocommon.d.b R;
    private com.anythink.expressad.foundation.c.d U;
    private String W;
    private b.a X;
    private int aa;
    private File ab;
    private File ac;
    private boolean n;
    private int p;
    private String q;
    private String r;
    private Runnable s;
    private d v;
    private ExecutorService w;
    private m x;
    private Class y;
    private Object z;
    private boolean f = false;
    private int m = 1;
    private volatile int t = 0;
    private CopyOnWriteArrayList<d> u = new CopyOnWriteArrayList<>();
    private boolean E = false;
    private boolean J = true;
    private long K = 0;
    private int L = 0;
    private boolean N = false;
    private boolean O = false;
    private int S = 100;
    private boolean T = false;
    private boolean V = false;
    private d Y = new d() { // from class: com.anythink.expressad.videocommon.b.a.1
        @Override // com.anythink.expressad.videocommon.b.d
        public final void a(long j2, int i2) {
            if (a.this.E) {
                return;
            }
            a.a(a.this, j2, i2);
        }
    };
    private Handler Z = new Handler(Looper.getMainLooper()) { // from class: com.anythink.expressad.videocommon.b.a.2
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            a.this.U = com.anythink.expressad.foundation.c.d.a(com.anythink.expressad.foundation.c.c.a(com.anythink.expressad.foundation.b.a.b().d()));
            int i2 = message.what;
            if (i2 == 1) {
                a aVar = a.this;
                a.a(aVar, aVar.K, a.this.t);
            } else if (i2 == 2) {
                if (a.this.t != 2) {
                    a.this.t = 2;
                    a aVar2 = a.this;
                    a.a(aVar2, aVar2.K, a.this.t);
                    a.this.n();
                }
            } else if (i2 == 3) {
                if (a.this.t == 4 || a.this.t == 2 || a.this.t == 5) {
                    return;
                }
                a.this.t = 4;
                a aVar3 = a.this;
                a.a(aVar3, aVar3.K, a.this.t);
                a.this.n();
            } else if (i2 == 4) {
                a.this.t = 5;
                a.r();
                a.this.f = false;
                a aVar4 = a.this;
                a.a(aVar4, aVar4.K, a.this.t);
            } else if (i2 != 5) {
                if (i2 == a.o && message.obj != null) {
                    com.anythink.expressad.foundation.b.a.b();
                }
            } else {
                a.this.f();
            }
        }
    };

    public a(Context context, com.anythink.expressad.foundation.d.c cVar, ExecutorService executorService, String str) {
        File file;
        this.n = false;
        if (context == null && cVar == null) {
            return;
        }
        this.P = System.currentTimeMillis();
        this.F = com.anythink.expressad.foundation.b.a.b().d();
        this.C = cVar;
        this.D = str;
        this.w = executorService;
        if (cVar != null) {
            this.H = cVar.R();
        }
        this.W = com.anythink.expressad.foundation.h.l.d(this.H);
        this.I = com.anythink.expressad.foundation.g.c.d.b(com.anythink.expressad.foundation.g.c.a.ANYTHINK_VC);
        this.M = this.I + File.separator + this.W;
        this.n = false;
        try {
            if (!TextUtils.isEmpty(this.H) && this.m != 3) {
                File file2 = null;
                if (!TextUtils.isEmpty(this.I)) {
                    file2 = new File(this.I);
                    if (!file2.exists()) {
                        file2.mkdirs();
                    }
                }
                if (file2 != null && file2.exists() && ((file = this.ac) == null || !file.exists())) {
                    File file3 = new File(file2 + "/.nomedia");
                    this.ac = file3;
                    if (!file3.exists()) {
                        this.ac.createNewFile();
                    }
                }
                c(true);
                d(this.H);
            }
        } catch (Exception e2) {
            n.b(b, e2.getMessage());
        }
    }

    private void A() {
        try {
            if (this.y == null || this.z == null) {
                Class<?> cls = Class.forName("com.anythink.expressad.reward.b.a");
                this.y = cls;
                this.z = cls.newInstance();
                this.y.getMethod("insertExcludeId", String.class, com.anythink.expressad.foundation.d.c.class).invoke(this.z, this.D, this.C);
            }
            if (this.A == null || this.B == null) {
                Class<?> cls2 = Class.forName("com.anythink.expressad.atnative.controller.NativeController");
                this.A = cls2;
                this.B = cls2.newInstance();
                this.A.getMethod("insertExcludeId", String.class, com.anythink.expressad.foundation.d.c.class).invoke(this.B, this.D, this.C);
            }
        } catch (Exception e2) {
            n.d(b, e2.getMessage());
        }
    }

    private static void B() {
    }

    private static void C() {
    }

    private void D() {
        String str;
        Message obtain = Message.obtain();
        obtain.what = o;
        if (this.C == null || TextUtils.isEmpty(this.D) || TextUtils.isEmpty(this.C.aa()) || TextUtils.isEmpty(this.C.R())) {
            str = "";
        } else {
            StringBuilder G = wo1.G("key=2000077&unit_id=");
            G.append(this.D);
            G.append("&request_id=");
            G.append(this.C.aa());
            G.append("&request_id_notice=");
            G.append(this.C.ab());
            G.append("&package_name=");
            G.append(com.anythink.expressad.foundation.b.a.b().a());
            G.append("&app_id=");
            G.append(com.anythink.expressad.foundation.b.a.b().e());
            G.append("&video_url=");
            G.append(URLEncoder.encode(this.C.R()));
            G.append("&process_size=");
            G.append(this.K);
            G.append("&file_size=");
            G.append(this.G);
            G.append("&ready_rate=");
            G.append(this.S);
            G.append("&cd_rate=");
            G.append(this.p);
            G.append("&cid=");
            G.append(this.C.aZ());
            G.append("&type=");
            G.append(this.t);
            str = G.toString();
        }
        obtain.obj = str;
        this.Z.sendMessage(obtain);
    }

    private static void E() {
        com.anythink.expressad.foundation.b.a.b();
    }

    private String F() {
        if (this.C == null || TextUtils.isEmpty(this.D) || TextUtils.isEmpty(this.C.aa()) || TextUtils.isEmpty(this.C.R())) {
            return "";
        }
        StringBuilder G = wo1.G("key=2000077&unit_id=");
        G.append(this.D);
        G.append("&request_id=");
        G.append(this.C.aa());
        G.append("&request_id_notice=");
        G.append(this.C.ab());
        G.append("&package_name=");
        G.append(com.anythink.expressad.foundation.b.a.b().a());
        G.append("&app_id=");
        G.append(com.anythink.expressad.foundation.b.a.b().e());
        G.append("&video_url=");
        G.append(URLEncoder.encode(this.C.R()));
        G.append("&process_size=");
        G.append(this.K);
        G.append("&file_size=");
        G.append(this.G);
        G.append("&ready_rate=");
        G.append(this.S);
        G.append("&cd_rate=");
        G.append(this.p);
        G.append("&cid=");
        G.append(this.C.aZ());
        G.append("&type=");
        G.append(this.t);
        return G.toString();
    }

    public static /* synthetic */ void r() {
    }

    private void t() {
        File file;
        try {
            if (!TextUtils.isEmpty(this.H) && this.m != 3) {
                File file2 = null;
                if (!TextUtils.isEmpty(this.I)) {
                    file2 = new File(this.I);
                    if (!file2.exists()) {
                        file2.mkdirs();
                    }
                }
                if (file2 != null && file2.exists() && ((file = this.ac) == null || !file.exists())) {
                    File file3 = new File(file2 + "/.nomedia");
                    this.ac = file3;
                    if (!file3.exists()) {
                        this.ac.createNewFile();
                    }
                }
                c(true);
                d(this.H);
            }
        } catch (Exception e2) {
            n.b(b, e2.getMessage());
        }
    }

    private Runnable u() {
        return this.s;
    }

    private boolean v() {
        return this.E;
    }

    private String w() {
        String message;
        String str = this.I + File.separator + this.W;
        File file = new File(str);
        try {
            if (!file.exists()) {
                message = "file is not exist ";
            } else if (!file.isFile()) {
                message = "file is not file ";
            } else if (!file.canRead()) {
                message = "file can not readed ";
            } else if (file.length() > 0) {
                this.M = str;
                message = "";
            } else {
                message = "file length is 0 ";
            }
        } catch (Throwable th) {
            if (com.anythink.expressad.a.a) {
                th.printStackTrace();
            }
            message = th.getMessage();
        }
        if (this.t == 5 && !TextUtils.isEmpty(message)) {
            n.d(b, "delFileAndDB");
            z();
        }
        return message;
    }

    private boolean x() {
        return this.J;
    }

    private d y() {
        return this.Y;
    }

    private void z() {
        if (this.U == null) {
            this.U = com.anythink.expressad.foundation.c.d.a(com.anythink.expressad.foundation.c.c.a(com.anythink.expressad.foundation.b.a.b().d()));
        }
        try {
            try {
                n.d(b, "delFileAndDB");
                this.U.c(this.H);
                File file = new File(this.M);
                if (file.exists() && file.isFile()) {
                    file.delete();
                }
            } catch (Throwable unused) {
                n.d(b, "del DB or file failed");
            }
        } finally {
            this.t = 0;
        }
    }

    public final void b(int i2) {
        this.p = i2;
    }

    public final long c() {
        return this.P;
    }

    public final String d() {
        return this.M;
    }

    public final long e() {
        return this.G;
    }

    public final void f() {
        Runnable runnable = this.s;
        if (runnable != null) {
            this.w.execute(runnable);
            this.E = true;
            return;
        }
        d(this.H);
        this.w.execute(this.s);
        this.E = true;
    }

    public final void g() {
        A();
        this.t = 4;
    }

    public final int h() {
        return this.t;
    }

    public final void i() {
        this.t = 0;
        if (this.U == null) {
            this.U = com.anythink.expressad.foundation.c.d.a(com.anythink.expressad.foundation.c.c.a(com.anythink.expressad.foundation.b.a.b().d()));
        }
        this.U.a(this.H, 0L, 0);
    }

    public final String j() {
        String str = "";
        if (this.m == 3) {
            return "";
        }
        String str2 = this.I + File.separator + this.W;
        File file = new File(str2);
        try {
            if (!file.exists()) {
                str = "file is not exist ";
            } else if (!file.isFile()) {
                str = "file is not file ";
            } else if (!file.canRead()) {
                str = "file can not readed ";
            } else if (file.length() > 0) {
                this.M = str2;
            } else {
                str = "file length is 0 ";
            }
        } catch (Throwable th) {
            if (com.anythink.expressad.a.a) {
                th.printStackTrace();
            }
            str = th.getMessage();
        }
        if (this.t == 5 && !TextUtils.isEmpty(str)) {
            n.d(b, "delFileAndDB");
            z();
        }
        return str;
    }

    public final com.anythink.expressad.foundation.d.c k() {
        return this.C;
    }

    public final void l() {
        if (this.u != null) {
            this.u = null;
        }
    }

    public final long m() {
        return this.K;
    }

    public final void n() {
        try {
            n.d(b, "delFileAndDB");
            z();
            com.anythink.expressad.foundation.d.c cVar = this.C;
            if (cVar != null) {
                if (cVar.H() == 2) {
                }
            }
        } catch (Exception unused) {
            n.d(b, "del file is failed");
        } finally {
            this.t = 0;
        }
    }

    public final void o() {
        String str;
        Message obtain = Message.obtain();
        obtain.what = o;
        if (this.C == null || TextUtils.isEmpty(this.D) || TextUtils.isEmpty(this.C.aa()) || TextUtils.isEmpty(this.C.R())) {
            str = "";
        } else {
            StringBuilder G = wo1.G("key=2000077&unit_id=");
            G.append(this.D);
            G.append("&request_id=");
            G.append(this.C.aa());
            G.append("&request_id_notice=");
            G.append(this.C.ab());
            G.append("&package_name=");
            G.append(com.anythink.expressad.foundation.b.a.b().a());
            G.append("&app_id=");
            G.append(com.anythink.expressad.foundation.b.a.b().e());
            G.append("&video_url=");
            G.append(URLEncoder.encode(this.C.R()));
            G.append("&process_size=");
            G.append(this.K);
            G.append("&file_size=");
            G.append(this.G);
            G.append("&ready_rate=");
            G.append(this.S);
            G.append("&cd_rate=");
            G.append(this.p);
            G.append("&cid=");
            G.append(this.C.aZ());
            G.append("&type=");
            G.append(this.t);
            str = G.toString();
        }
        obtain.obj = str;
        this.Z.sendMessage(obtain);
    }

    public final String p() {
        return this.r;
    }

    public final String q() {
        return this.q;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(boolean z) {
        com.anythink.expressad.foundation.c.d a2 = com.anythink.expressad.foundation.c.d.a(com.anythink.expressad.foundation.c.c.a(com.anythink.expressad.foundation.b.a.b().d()));
        q b2 = a2.b(this.H);
        if (b2 != null) {
            this.K = b2.b();
            if (this.t != 2) {
                this.t = b2.d();
            }
            if (z && this.t == 1) {
                this.t = 2;
            }
            this.G = b2.c();
            if (b2.a() > 0) {
                this.P = b2.a();
            }
            if (this.t == 5 && !this.N) {
                StringBuilder sb = new StringBuilder();
                sb.append(this.I);
                String str = File.separator;
                sb.append(str);
                sb.append(this.W);
                File file = new File(sb.toString());
                File file2 = new File(this.I + str + this.W);
                if (file.exists()) {
                    this.M = this.I + str + this.W;
                    return;
                } else if (file2.exists()) {
                    this.M = this.I + str + this.W;
                    return;
                } else {
                    n.d(b, "delFileAndDB");
                    z();
                    return;
                }
            } else if (this.t != 0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.I);
                String str2 = File.separator;
                sb2.append(str2);
                this.M = wo1.C(sb2, this.W, "");
                if (this.t == 6) {
                    this.M = this.I + str2 + this.W;
                    return;
                }
                return;
            } else {
                return;
            }
        }
        a2.a(this.H, this.P);
    }

    private void d(final String str) {
        this.s = new Runnable() { // from class: com.anythink.expressad.videocommon.b.a.3
            /* JADX WARN: Finally extract failed */
            /* JADX WARN: Removed duplicated region for block: B:312:0x0542  */
            /* JADX WARN: Removed duplicated region for block: B:340:0x0598  */
            /* JADX WARN: Removed duplicated region for block: B:387:0x059f A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:393:0x05ae A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:399:0x05bd A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:405:0x0549 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:416:0x0558 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:424:0x0567 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                HttpURLConnection httpURLConnection;
                InputStream inputStream;
                FileOutputStream fileOutputStream;
                File file;
                a aVar;
                long j2;
                boolean z;
                FileOutputStream fileOutputStream2;
                InputStream inputStream2;
                File file2;
                String str2 = str;
                a.this.c(false);
                if (a.this.t == 5) {
                    if (a.this.Q != null) {
                        a.this.Q.a(a.this.H);
                    }
                    if (a.this.R != null) {
                        a.this.R.a(a.this.H);
                        return;
                    }
                    return;
                }
                int i2 = 0;
                if (a.this.m != 3) {
                    if (a.this.t == 1) {
                        a.this.t = 2;
                    }
                    try {
                        try {
                            if (a.this.t != 0 && a.this.t != 5 && a.this.t != 6) {
                                a.this.n();
                            }
                            if (a.this.t != 1 && a.this.t != 5) {
                                if (TextUtils.isEmpty(str2)) {
                                    if (a.this.t == 1) {
                                        a.this.t = 2;
                                        return;
                                    }
                                    return;
                                }
                                if (a.this.t == 6) {
                                    a aVar2 = a.this;
                                    if (l.a(aVar2, aVar2.S)) {
                                        if (a.this.t == 1) {
                                            a.this.t = 2;
                                            return;
                                        }
                                        return;
                                    }
                                }
                                HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(str2).openConnection();
                                try {
                                    httpURLConnection2.setConnectTimeout(15000);
                                    httpURLConnection2.setReadTimeout(600000);
                                    httpURLConnection2.setRequestMethod("GET");
                                    httpURLConnection2.setInstanceFollowRedirects(true);
                                    long c2 = com.anythink.expressad.foundation.h.q.c();
                                    int responseCode = httpURLConnection2.getResponseCode();
                                    try {
                                        if (responseCode != 200 && responseCode != 206) {
                                            a.a(a.this, "http response failed");
                                            fileOutputStream2 = null;
                                            inputStream2 = null;
                                            if (a.this.t == 1) {
                                                a.this.t = 2;
                                            }
                                            try {
                                                httpURLConnection2.disconnect();
                                            } catch (Throwable th) {
                                                n.b(a.b, th.getMessage(), th);
                                            }
                                            if (inputStream2 != null) {
                                                try {
                                                    inputStream2.close();
                                                } catch (Throwable th2) {
                                                    n.b(a.b, th2.getMessage(), th2);
                                                }
                                            }
                                            if (fileOutputStream2 != null) {
                                                try {
                                                    fileOutputStream2.flush();
                                                } catch (Throwable th3) {
                                                    n.b(a.b, th3.getMessage(), th3);
                                                }
                                                try {
                                                    fileOutputStream2.close();
                                                    return;
                                                } catch (Throwable th4) {
                                                    n.b(a.b, th4.getMessage(), th4);
                                                    return;
                                                }
                                            }
                                            return;
                                        }
                                        a.this.G = httpURLConnection2.getContentLength();
                                        if (c2 == 0 || c2 > a.this.G) {
                                            a.this.J = true;
                                            int i3 = 100;
                                            if (a.this.S != 100 && a.this.S != 0) {
                                                a aVar3 = a.this;
                                                if (l.a(aVar3, aVar3.S)) {
                                                    if (a.this.t == 1) {
                                                        a.this.t = 2;
                                                    }
                                                    try {
                                                        httpURLConnection2.disconnect();
                                                    } catch (Throwable th5) {
                                                        n.b(a.b, th5.getMessage(), th5);
                                                    }
                                                    if (inputStream != null) {
                                                        try {
                                                            inputStream.close();
                                                            return;
                                                        } catch (Throwable th6) {
                                                            n.b(a.b, th6.getMessage(), th6);
                                                            return;
                                                        }
                                                    }
                                                    return;
                                                }
                                                file = new File(a.this.I, a.this.W);
                                            } else if (!str2.equals(str)) {
                                                file = new File(a.this.I, a.this.W);
                                            } else {
                                                file = new File(a.this.I, a.this.W);
                                            }
                                            File file3 = file;
                                            a.this.t = 1;
                                            FileOutputStream fileOutputStream3 = str2.equals(str) ? new FileOutputStream(file3) : null;
                                            try {
                                                if (a.this.U == null) {
                                                    a.this.U = com.anythink.expressad.foundation.c.d.a(com.anythink.expressad.foundation.c.c.a(com.anythink.expressad.foundation.b.a.b().d()));
                                                }
                                                a.this.U.a(a.this.C, a.this.G, a.this.M, a.this.t);
                                                byte[] bArr = new byte[4096];
                                                if (!file3.exists()) {
                                                    if (a.this.t == 1) {
                                                        a.this.t = 2;
                                                    }
                                                    try {
                                                        httpURLConnection2.disconnect();
                                                    } catch (Throwable th7) {
                                                        n.b(a.b, th7.getMessage(), th7);
                                                    }
                                                    if (inputStream != null) {
                                                        try {
                                                            inputStream.close();
                                                        } catch (Throwable th8) {
                                                            n.b(a.b, th8.getMessage(), th8);
                                                        }
                                                    }
                                                    if (fileOutputStream3 != null) {
                                                        try {
                                                            fileOutputStream3.flush();
                                                        } catch (Throwable th9) {
                                                            n.b(a.b, th9.getMessage(), th9);
                                                        }
                                                        try {
                                                            fileOutputStream3.close();
                                                            return;
                                                        } catch (Throwable th10) {
                                                            n.b(a.b, th10.getMessage(), th10);
                                                            return;
                                                        }
                                                    }
                                                    return;
                                                }
                                                int i4 = 0;
                                                while (true) {
                                                    int read = inputStream.read(bArr);
                                                    if (read != -1) {
                                                        if (str2.equals(str)) {
                                                            fileOutputStream3.write(bArr, i2, read);
                                                            int i5 = read + i4;
                                                            try {
                                                                a aVar4 = a.this;
                                                                a.a(aVar4, i5, aVar4.t);
                                                            } catch (Throwable th11) {
                                                                n.b(a.b, th11.getMessage(), th11);
                                                            }
                                                            if (a.this.S == i3 || a.this.S == 0) {
                                                                file2 = file3;
                                                            } else {
                                                                file2 = file3;
                                                                if (a.a(i5, a.this.G) * 100.0d >= a.this.S) {
                                                                    a.this.t = 6;
                                                                    a.this.f = false;
                                                                    a aVar5 = a.this;
                                                                    a.a(aVar5, aVar5.K, a.this.t);
                                                                    a.this.o();
                                                                    if (a.this.t == 1) {
                                                                        a.this.t = 2;
                                                                    }
                                                                    try {
                                                                        httpURLConnection2.disconnect();
                                                                    } catch (Throwable th12) {
                                                                        n.b(a.b, th12.getMessage(), th12);
                                                                    }
                                                                    try {
                                                                        inputStream.close();
                                                                    } catch (Throwable th13) {
                                                                        n.b(a.b, th13.getMessage(), th13);
                                                                    }
                                                                    try {
                                                                        fileOutputStream3.flush();
                                                                    } catch (Throwable th14) {
                                                                        n.b(a.b, th14.getMessage(), th14);
                                                                    }
                                                                    try {
                                                                        fileOutputStream3.close();
                                                                        return;
                                                                    } catch (Throwable th15) {
                                                                        n.b(a.b, th15.getMessage(), th15);
                                                                        return;
                                                                    }
                                                                }
                                                            }
                                                            if (a.this.t == 2 || a.this.t == 4) {
                                                                break;
                                                            }
                                                            i4 = i5;
                                                            file3 = file2;
                                                        }
                                                        i3 = 100;
                                                        i2 = 0;
                                                    } else {
                                                        File file4 = file3;
                                                        if (str2.equals(str)) {
                                                            if (a.this.S != 100 && a.this.S != 0) {
                                                                j2 = i4;
                                                                aVar = a.this;
                                                            }
                                                            String str3 = a.this.C.bI;
                                                            if (!TextUtils.isEmpty(str3)) {
                                                                try {
                                                                    if (str3.equals(com.anythink.expressad.foundation.h.k.a(file4))) {
                                                                        a aVar6 = a.this;
                                                                        aVar6.a(aVar6.K, true);
                                                                        a.this.o();
                                                                        if (a.this.t == 1) {
                                                                            a.this.t = 2;
                                                                        }
                                                                        try {
                                                                            httpURLConnection2.disconnect();
                                                                        } catch (Throwable th16) {
                                                                            n.b(a.b, th16.getMessage(), th16);
                                                                        }
                                                                        try {
                                                                            inputStream.close();
                                                                        } catch (Throwable th17) {
                                                                            n.b(a.b, th17.getMessage(), th17);
                                                                        }
                                                                        if (fileOutputStream3 != null) {
                                                                            try {
                                                                                fileOutputStream3.flush();
                                                                            } catch (Throwable th18) {
                                                                                n.b(a.b, th18.getMessage(), th18);
                                                                            }
                                                                            try {
                                                                                fileOutputStream3.close();
                                                                                return;
                                                                            } catch (Throwable th19) {
                                                                                n.b(a.b, th19.getMessage(), th19);
                                                                                return;
                                                                            }
                                                                        }
                                                                        return;
                                                                    }
                                                                } catch (Throwable th20) {
                                                                    n.b(a.b, th20.getMessage(), th20);
                                                                }
                                                                a.this.a("MD5 check failed");
                                                                fileOutputStream2 = fileOutputStream3;
                                                                inputStream2 = inputStream;
                                                            } else {
                                                                a aVar7 = a.this;
                                                                aVar7.a(aVar7.K, false);
                                                                a.this.o();
                                                                if (a.this.t == 1) {
                                                                    a.this.t = 2;
                                                                }
                                                                try {
                                                                    httpURLConnection2.disconnect();
                                                                } catch (Throwable th21) {
                                                                    n.b(a.b, th21.getMessage(), th21);
                                                                }
                                                                try {
                                                                    inputStream.close();
                                                                } catch (Throwable th22) {
                                                                    n.b(a.b, th22.getMessage(), th22);
                                                                }
                                                                if (fileOutputStream3 != null) {
                                                                    try {
                                                                        fileOutputStream3.flush();
                                                                    } catch (Throwable th23) {
                                                                        n.b(a.b, th23.getMessage(), th23);
                                                                    }
                                                                    try {
                                                                        fileOutputStream3.close();
                                                                        return;
                                                                    } catch (Throwable th24) {
                                                                        n.b(a.b, th24.getMessage(), th24);
                                                                        return;
                                                                    }
                                                                }
                                                                return;
                                                            }
                                                        } else {
                                                            aVar = a.this;
                                                            j2 = aVar.K;
                                                            if (!TextUtils.isEmpty(a.this.C.bI)) {
                                                                z = true;
                                                                aVar.a(j2, z);
                                                                a.this.o();
                                                                fileOutputStream2 = fileOutputStream3;
                                                                inputStream2 = inputStream;
                                                            }
                                                        }
                                                        z = false;
                                                        aVar.a(j2, z);
                                                        a.this.o();
                                                        fileOutputStream2 = fileOutputStream3;
                                                        inputStream2 = inputStream;
                                                    }
                                                }
                                                int i6 = a.this.t == 4 ? 3 : 2;
                                                Message obtain = Message.obtain();
                                                obtain.what = i6;
                                                a.this.Z.sendMessage(obtain);
                                                if (a.this.t == 1) {
                                                    a.this.t = 2;
                                                }
                                                try {
                                                    httpURLConnection2.disconnect();
                                                } catch (Throwable th25) {
                                                    n.b(a.b, th25.getMessage(), th25);
                                                }
                                                try {
                                                    inputStream.close();
                                                } catch (Throwable th26) {
                                                    n.b(a.b, th26.getMessage(), th26);
                                                }
                                                try {
                                                    fileOutputStream3.flush();
                                                } catch (Throwable th27) {
                                                    n.b(a.b, th27.getMessage(), th27);
                                                }
                                                try {
                                                    fileOutputStream3.close();
                                                    return;
                                                } catch (Throwable th28) {
                                                    n.b(a.b, th28.getMessage(), th28);
                                                    return;
                                                }
                                            } catch (Exception e2) {
                                                e = e2;
                                                fileOutputStream = fileOutputStream3;
                                                httpURLConnection = httpURLConnection2;
                                                a.a(a.this, e.getMessage());
                                                if (a.this.t == 1) {
                                                }
                                                if (httpURLConnection != null) {
                                                }
                                                if (inputStream != null) {
                                                }
                                                if (fileOutputStream != null) {
                                                }
                                                return;
                                            } catch (Throwable th29) {
                                                th = th29;
                                                fileOutputStream = fileOutputStream3;
                                                httpURLConnection = httpURLConnection2;
                                                a.a(a.this, th.getMessage());
                                                th.printStackTrace();
                                                if (a.this.t == 1) {
                                                }
                                                if (httpURLConnection != null) {
                                                }
                                                if (inputStream != null) {
                                                }
                                                if (fileOutputStream != null) {
                                                }
                                                return;
                                            }
                                        }
                                        if (a.this.t == 1) {
                                            a.this.t = 2;
                                        }
                                        try {
                                            httpURLConnection2.disconnect();
                                        } catch (Throwable th30) {
                                            n.b(a.b, th30.getMessage(), th30);
                                        }
                                        if (inputStream != null) {
                                            try {
                                                inputStream.close();
                                                return;
                                            } catch (Throwable th31) {
                                                n.b(a.b, th31.getMessage(), th31);
                                                return;
                                            }
                                        }
                                        return;
                                    } catch (Exception e3) {
                                        e = e3;
                                        httpURLConnection = httpURLConnection2;
                                        fileOutputStream = null;
                                        a.a(a.this, e.getMessage());
                                        if (a.this.t == 1) {
                                        }
                                        if (httpURLConnection != null) {
                                        }
                                        if (inputStream != null) {
                                        }
                                        if (fileOutputStream != null) {
                                        }
                                        return;
                                    } catch (Throwable th32) {
                                        th = th32;
                                        httpURLConnection = httpURLConnection2;
                                        fileOutputStream = null;
                                        a.a(a.this, th.getMessage());
                                        th.printStackTrace();
                                        if (a.this.t == 1) {
                                        }
                                        if (httpURLConnection != null) {
                                        }
                                        if (inputStream != null) {
                                        }
                                        if (fileOutputStream != null) {
                                        }
                                        return;
                                    }
                                    inputStream = httpURLConnection2.getInputStream();
                                } catch (Exception e4) {
                                    e = e4;
                                    httpURLConnection = httpURLConnection2;
                                    inputStream = null;
                                    fileOutputStream = null;
                                    a.a(a.this, e.getMessage());
                                    if (a.this.t == 1) {
                                        a.this.t = 2;
                                    }
                                    if (httpURLConnection != null) {
                                        try {
                                            httpURLConnection.disconnect();
                                        } catch (Throwable th33) {
                                            n.b(a.b, th33.getMessage(), th33);
                                        }
                                    }
                                    if (inputStream != null) {
                                        try {
                                            inputStream.close();
                                        } catch (Throwable th34) {
                                            n.b(a.b, th34.getMessage(), th34);
                                        }
                                    }
                                    if (fileOutputStream != null) {
                                        try {
                                            fileOutputStream.flush();
                                        } catch (Throwable th35) {
                                            n.b(a.b, th35.getMessage(), th35);
                                        }
                                        try {
                                            fileOutputStream.close();
                                            return;
                                        } catch (Throwable th36) {
                                            n.b(a.b, th36.getMessage(), th36);
                                            return;
                                        }
                                    }
                                    return;
                                } catch (Throwable th37) {
                                    th = th37;
                                    httpURLConnection = httpURLConnection2;
                                    inputStream = null;
                                    fileOutputStream = null;
                                    a.a(a.this, th.getMessage());
                                    th.printStackTrace();
                                    if (a.this.t == 1) {
                                        a.this.t = 2;
                                    }
                                    if (httpURLConnection != null) {
                                        try {
                                            httpURLConnection.disconnect();
                                        } catch (Throwable th38) {
                                            n.b(a.b, th38.getMessage(), th38);
                                        }
                                    }
                                    if (inputStream != null) {
                                        try {
                                            inputStream.close();
                                        } catch (Throwable th39) {
                                            n.b(a.b, th39.getMessage(), th39);
                                        }
                                    }
                                    if (fileOutputStream != null) {
                                        try {
                                            fileOutputStream.flush();
                                        } catch (Throwable th40) {
                                            n.b(a.b, th40.getMessage(), th40);
                                        }
                                        try {
                                            fileOutputStream.close();
                                            return;
                                        } catch (Throwable th41) {
                                            n.b(a.b, th41.getMessage(), th41);
                                            return;
                                        }
                                    }
                                    return;
                                }
                            }
                            if (a.this.t == 1) {
                                a.this.t = 2;
                            }
                        } catch (Exception e5) {
                            e = e5;
                            httpURLConnection = null;
                        } catch (Throwable th42) {
                            th = th42;
                            httpURLConnection = null;
                        }
                    } catch (Throwable th43) {
                        if (a.this.t == 1) {
                            a.this.t = 2;
                        }
                        if (httpURLConnection != null) {
                            try {
                                httpURLConnection.disconnect();
                            } catch (Throwable th44) {
                                n.b(a.b, th44.getMessage(), th44);
                            }
                        }
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th45) {
                                n.b(a.b, th45.getMessage(), th45);
                            }
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.flush();
                            } catch (Throwable th46) {
                                n.b(a.b, th46.getMessage(), th46);
                            }
                            try {
                                fileOutputStream.close();
                            } catch (Throwable th47) {
                                n.b(a.b, th47.getMessage(), th47);
                            }
                        }
                        throw th43;
                    }
                } else {
                    a.this.a(0L, false);
                }
            }
        };
    }

    @SuppressLint({"MissingPermission"})
    private void e(String str) {
        this.L++;
        try {
            Context context = this.F;
            if (context != null) {
                Object systemService = context.getSystemService("connectivity");
                ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
                if (connectivityManager != null && connectivityManager.getActiveNetworkInfo() != null) {
                    if (!connectivityManager.getActiveNetworkInfo().isAvailable()) {
                        return;
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (this.L <= 1) {
            n.d(b, "delFileAndDB");
            z();
            this.Z.sendEmptyMessageDelayed(5, 2000L);
            return;
        }
        A();
        a(str);
    }

    public final boolean b() {
        return this.V;
    }

    public final void b(boolean z) {
        this.O = z;
    }

    public final void d(int i2) {
        this.aa = i2;
    }

    private void b(com.anythink.expressad.videocommon.d.b bVar) {
        this.R = bVar;
    }

    public final void a(int i2) {
        this.m = i2;
    }

    private void b(d dVar) {
        CopyOnWriteArrayList<d> copyOnWriteArrayList = this.u;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.add(dVar);
        }
    }

    public final String a() {
        return this.H;
    }

    public final void a(boolean z) {
        if (!z) {
            this.n = false;
        }
        this.V = z;
    }

    public final void b(String str) {
        this.q = str;
    }

    public static double a(double d2, double d3) {
        return new BigDecimal(Double.toString(d2)).divide(new BigDecimal(Double.toString(d3)), 4, 4).doubleValue();
    }

    public final void a(long j2, boolean z) {
        int i2 = this.S;
        if ((i2 == 100 || i2 == 0) && this.m != 3 && j2 != this.G && !z) {
            a("File downloaded is smaller than the file");
            return;
        }
        Message obtain = Message.obtain();
        this.t = 5;
        obtain.what = 4;
        this.Z.sendMessage(obtain);
    }

    public final void a(String str) {
        if (this.Q != null) {
            n.d(b, "video load retry fail");
            this.Q.a(str, this.H);
        }
        com.anythink.expressad.videocommon.d.b bVar = this.R;
        if (bVar != null) {
            bVar.a(str, this.H);
        }
        this.t = 4;
        Message obtain = Message.obtain();
        obtain.what = 3;
        this.Z.sendMessage(obtain);
    }

    public final void c(int i2) {
        this.S = i2;
        n.b(b, "mReadyRate:" + this.S);
    }

    public final void a(com.anythink.expressad.foundation.d.c cVar) {
        this.C = cVar;
    }

    public final void a(com.anythink.expressad.videocommon.d.b bVar) {
        this.Q = bVar;
    }

    public final void c(String str) {
        this.r = str;
    }

    public final void a(d dVar) {
        this.v = dVar;
    }

    private void a(long j2, int i2) {
        this.K = j2;
        int i3 = this.S;
        if (100 * j2 >= i3 * this.G && !this.T && i2 != 4) {
            if (i3 == 100 && i2 != 5) {
                this.t = 5;
                return;
            }
            this.T = true;
            if (!TextUtils.isEmpty(j())) {
                String w = w();
                if (!TextUtils.isEmpty(w)) {
                    com.anythink.expressad.videocommon.d.b bVar = this.Q;
                    if (bVar != null) {
                        bVar.a("file is not effective".concat(String.valueOf(w)), this.H);
                    }
                    com.anythink.expressad.videocommon.d.b bVar2 = this.R;
                    if (bVar2 != null) {
                        bVar2.a("file is not effective".concat(String.valueOf(w)), this.H);
                    }
                }
            }
            com.anythink.expressad.videocommon.d.b bVar3 = this.Q;
            if (bVar3 != null) {
                bVar3.a(this.H);
            }
            com.anythink.expressad.videocommon.d.b bVar4 = this.R;
            if (bVar4 != null) {
                bVar4.a(this.H);
            }
        }
        if (!this.f && j2 > 0) {
            this.f = true;
            if (this.U == null) {
                this.U = com.anythink.expressad.foundation.c.d.a(com.anythink.expressad.foundation.c.c.a(com.anythink.expressad.foundation.b.a.b().d()));
            }
            this.U.a(this.H, j2, this.t);
        }
        if (this.E) {
            CopyOnWriteArrayList<d> copyOnWriteArrayList = this.u;
            if (copyOnWriteArrayList != null) {
                Iterator<d> it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    d next = it.next();
                    if (next != null) {
                        next.a(j2, i2);
                    }
                }
            }
            if (this.v != null) {
                if (this.t == 5 || this.t == 4 || this.t == 2 || this.t == 6) {
                    this.v.a(j2, i2);
                    this.v = null;
                }
            }
        }
    }

    public static /* synthetic */ void a(a aVar, long j2, int i2) {
        aVar.K = j2;
        int i3 = aVar.S;
        if (100 * j2 >= i3 * aVar.G && !aVar.T && i2 != 4) {
            if (i3 == 100 && i2 != 5) {
                aVar.t = 5;
                return;
            }
            aVar.T = true;
            if (!TextUtils.isEmpty(aVar.j())) {
                String w = aVar.w();
                if (!TextUtils.isEmpty(w)) {
                    com.anythink.expressad.videocommon.d.b bVar = aVar.Q;
                    if (bVar != null) {
                        bVar.a("file is not effective".concat(String.valueOf(w)), aVar.H);
                    }
                    com.anythink.expressad.videocommon.d.b bVar2 = aVar.R;
                    if (bVar2 != null) {
                        bVar2.a("file is not effective".concat(String.valueOf(w)), aVar.H);
                    }
                }
            }
            com.anythink.expressad.videocommon.d.b bVar3 = aVar.Q;
            if (bVar3 != null) {
                bVar3.a(aVar.H);
            }
            com.anythink.expressad.videocommon.d.b bVar4 = aVar.R;
            if (bVar4 != null) {
                bVar4.a(aVar.H);
            }
        }
        if (!aVar.f && j2 > 0) {
            aVar.f = true;
            if (aVar.U == null) {
                aVar.U = com.anythink.expressad.foundation.c.d.a(com.anythink.expressad.foundation.c.c.a(com.anythink.expressad.foundation.b.a.b().d()));
            }
            aVar.U.a(aVar.H, j2, aVar.t);
        }
        if (aVar.E) {
            CopyOnWriteArrayList<d> copyOnWriteArrayList = aVar.u;
            if (copyOnWriteArrayList != null) {
                Iterator<d> it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    d next = it.next();
                    if (next != null) {
                        next.a(j2, i2);
                    }
                }
            }
            if (aVar.v != null) {
                if (aVar.t == 5 || aVar.t == 4 || aVar.t == 2 || aVar.t == 6) {
                    aVar.v.a(j2, i2);
                    aVar.v = null;
                }
            }
        }
    }

    public static /* synthetic */ void a(a aVar, String str) {
        aVar.L++;
        try {
            Context context = aVar.F;
            if (context != null) {
                Object systemService = context.getSystemService("connectivity");
                ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
                if (connectivityManager != null && connectivityManager.getActiveNetworkInfo() != null) {
                    if (!connectivityManager.getActiveNetworkInfo().isAvailable()) {
                        return;
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (aVar.L <= 1) {
            n.d(b, "delFileAndDB");
            aVar.z();
            aVar.Z.sendEmptyMessageDelayed(5, 2000L);
            return;
        }
        aVar.A();
        aVar.a(str);
    }
}