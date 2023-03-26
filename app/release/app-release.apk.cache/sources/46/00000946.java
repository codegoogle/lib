package com.anythink.expressad.splash.c;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import com.anythink.core.common.b.m;
import com.anythink.expressad.foundation.h.n;
import com.anythink.expressad.foundation.h.o;
import com.anythink.expressad.foundation.h.s;
import com.anythink.expressad.foundation.h.w;
import com.anythink.expressad.splash.a.b;
import com.anythink.expressad.splash.c.a;
import com.anythink.expressad.splash.c.e;
import com.anythink.expressad.splash.view.ATSplashView;
import com.anythink.expressad.videocommon.b.g;
import com.p7700g.p99005.x1;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class c {
    private static String c = "SplashLoadManager";
    private static final int l = 1;
    private static final int m = 2;
    private static final int n = 3;
    private int B;
    public com.anythink.expressad.foundation.d.c b;
    private String d;
    private String e;
    private long f;
    private long g;
    private com.anythink.expressad.splash.b.c h;
    private ATSplashView j;
    private com.anythink.expressad.d.c k;
    private boolean o;
    private int p;
    private int q;
    private int r;
    private String s;
    private int t;
    private boolean u;
    private volatile boolean v;
    private com.anythink.expressad.videocommon.d.b w;
    private g.d x;
    private String y;
    private int z;
    private String A = "";
    private Handler C = new Handler(Looper.getMainLooper()) { // from class: com.anythink.expressad.splash.c.c.1
        @Override // android.os.Handler
        public final void handleMessage(@x1 Message message) {
            super.handleMessage(message);
            int i = message.what;
            if (i == 1) {
                Object obj = message.obj;
                int i2 = message.arg1;
                if (obj instanceof com.anythink.expressad.foundation.d.c) {
                    com.anythink.expressad.foundation.d.c cVar = (com.anythink.expressad.foundation.d.c) obj;
                    c.this.a(g.a().c(cVar.c()), cVar, i2);
                }
            } else if (i != 2) {
                if (i != 3) {
                    return;
                }
                Object obj2 = message.obj;
                if (obj2 instanceof com.anythink.expressad.foundation.d.c) {
                    c cVar2 = c.this;
                    cVar2.b((com.anythink.expressad.foundation.d.c) obj2, cVar2.t);
                }
            } else {
                Object obj3 = message.obj;
                if (obj3 instanceof String) {
                    c cVar3 = c.this;
                    String obj4 = obj3.toString();
                    String unused = c.this.s;
                    int unused2 = c.this.t;
                    cVar3.a(obj4);
                }
            }
        }
    };
    private Runnable D = new Runnable() { // from class: com.anythink.expressad.splash.c.c.2
        @Override // java.lang.Runnable
        public final void run() {
            c cVar = c.this;
            String unused = cVar.s;
            int unused2 = c.this.t;
            cVar.a("load timeout");
        }
    };
    public boolean a = false;
    private Context i = m.a().e();

    public c(String str, String str2, long j) {
        this.e = str;
        this.d = str2;
        this.g = j;
    }

    private boolean e() {
        return this.o;
    }

    private int f() {
        return this.p;
    }

    private void g() {
        try {
            int i = this.z + 1;
            this.z = i;
            com.anythink.expressad.d.c cVar = this.k;
            if (cVar == null || i > cVar.t()) {
                n.b(c, "onload 重置offset为0");
                this.z = 0;
            }
            String str = c;
            n.b(str, "onload 算出 下次的offset是:" + this.z);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void h() {
    }

    private void h(com.anythink.expressad.foundation.d.c cVar, int i) {
        if (this.j.isH5Ready()) {
            return;
        }
        this.j.setH5Ready(true);
        b(cVar, i);
    }

    private static void i() {
    }

    private void i(com.anythink.expressad.foundation.d.c cVar, int i) {
        this.w = new AnonymousClass7(cVar);
        ArrayList arrayList = new ArrayList();
        arrayList.add(cVar);
        com.anythink.expressad.videocommon.b.c.a().a(this.d, arrayList, com.anythink.expressad.foundation.g.a.aV, this.w);
        if (!com.anythink.expressad.videocommon.b.c.a().a(com.anythink.expressad.foundation.g.a.aV, this.d, cVar.y())) {
            com.anythink.expressad.videocommon.b.c.a().d(this.d);
            return;
        }
        this.j.setVideoReady(true);
        b(cVar, i);
    }

    private void j() {
        this.z = 0;
    }

    private static void k() {
    }

    private void l() {
        this.C.removeCallbacks(this.D);
    }

    private void e(com.anythink.expressad.foundation.d.c cVar, int i) {
        File file;
        File file2;
        FileOutputStream fileOutputStream = null;
        try {
            try {
                try {
                    file2 = new File(cVar.d());
                    try {
                        if (!file2.exists()) {
                            String b = com.anythink.expressad.foundation.g.c.d.b(com.anythink.expressad.foundation.g.c.a.ANYTHINK_700_HTML);
                            String a = o.a(w.a(cVar.d()));
                            if (TextUtils.isEmpty(a)) {
                                a = String.valueOf(System.currentTimeMillis());
                            }
                            file = new File(b, a.concat(".html"));
                            try {
                                if (!file.exists()) {
                                    FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                                    try {
                                        fileOutputStream2.write(("<script>" + com.anythink.expressad.d.b.a.a().b() + "</script>" + cVar.d()).getBytes());
                                        fileOutputStream2.flush();
                                        fileOutputStream = fileOutputStream2;
                                    } catch (Exception e) {
                                        e = e;
                                        fileOutputStream = fileOutputStream2;
                                        e.printStackTrace();
                                        cVar.i("");
                                        if (fileOutputStream != null) {
                                            fileOutputStream.close();
                                        }
                                        file2 = file;
                                        if (!file2.exists()) {
                                        }
                                        a("html file write failed");
                                    } catch (Throwable th) {
                                        th = th;
                                        fileOutputStream = fileOutputStream2;
                                        if (fileOutputStream != null) {
                                            fileOutputStream.close();
                                        }
                                        throw th;
                                    }
                                }
                                file2 = file;
                            } catch (Exception e2) {
                                e = e2;
                            }
                        }
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                    } catch (Exception e3) {
                        e = e3;
                        file = file2;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception e4) {
                e = e4;
                file = null;
            }
            if (!file2.exists() && file2.isFile() && file2.canRead()) {
                cVar.a(file2.getAbsolutePath());
                a("file:////" + file2.getAbsolutePath(), cVar, i);
                return;
            }
            a("html file write failed");
        } catch (Exception e5) {
            a(e5.getMessage());
        }
    }

    private void f(com.anythink.expressad.foundation.d.c cVar, int i) {
        if (cVar.j()) {
            return;
        }
        this.x = new AnonymousClass4(cVar, i);
        g.a().b(cVar.c(), (g.a) this.x);
    }

    public final void b(boolean z) {
        this.o = z;
    }

    public final com.anythink.expressad.foundation.d.c c() {
        return this.b;
    }

    private void c(com.anythink.expressad.foundation.d.c cVar, int i) {
        this.j.clearResState();
        if (!TextUtils.isEmpty(cVar.c()) && !cVar.j()) {
            this.x = new AnonymousClass4(cVar, i);
            g.a().b(cVar.c(), (g.a) this.x);
        }
        if (cVar.j()) {
            return;
        }
        if (!TextUtils.isEmpty(cVar.d())) {
            e(cVar, i);
        }
        if (!TextUtils.isEmpty(cVar.R())) {
            this.w = new AnonymousClass7(cVar);
            ArrayList arrayList = new ArrayList();
            arrayList.add(cVar);
            com.anythink.expressad.videocommon.b.c.a().a(this.d, arrayList, com.anythink.expressad.foundation.g.a.aV, this.w);
            if (!com.anythink.expressad.videocommon.b.c.a().a(com.anythink.expressad.foundation.g.a.aV, this.d, cVar.y())) {
                com.anythink.expressad.videocommon.b.c.a().d(this.d);
            } else {
                this.j.setVideoReady(true);
                b(cVar, i);
            }
        }
        if (TextUtils.isEmpty(cVar.be())) {
            return;
        }
        d(cVar, i);
    }

    private void d(final com.anythink.expressad.foundation.d.c cVar, final int i) {
        b.a(this.j, cVar, new com.anythink.expressad.splash.view.a() { // from class: com.anythink.expressad.splash.c.c.3
            @Override // com.anythink.expressad.splash.view.a
            public final void a() {
                if (cVar.j() && c.this.j != null) {
                    c.this.j.setImageReady(true);
                    c.b(c.this, cVar, i);
                }
                c.this.b(cVar, i);
            }

            @Override // com.anythink.expressad.splash.view.a
            public final void b() {
                if (!cVar.j() || c.this.j == null) {
                    return;
                }
                c.this.j.setImageReady(false);
                c cVar2 = c.this;
                String unused = cVar2.s;
                cVar2.a("Image resource load faile");
            }
        });
    }

    public final void b(int i) {
        this.p = i;
    }

    /* renamed from: com.anythink.expressad.splash.c.c$5  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass5 implements com.anythink.expressad.splash.b.a {
        public final /* synthetic */ com.anythink.expressad.foundation.d.c a;
        public final /* synthetic */ int b;

        public AnonymousClass5(com.anythink.expressad.foundation.d.c cVar, int i) {
            this.a = cVar;
            this.b = i;
        }

        @Override // com.anythink.expressad.splash.b.a
        public final void a(View view) {
            if (c.this.j != null) {
                c.this.j.setDynamicView(true);
                c.this.j.setSplashNativeView(view);
                c.this.b(this.a, this.b);
            }
        }

        @Override // com.anythink.expressad.splash.b.a
        public final void a(String str) {
            c cVar = c.this;
            String unused = cVar.s;
            cVar.a(str);
        }
    }

    public final void b() {
        if (this.h != null) {
            this.h = null;
        }
        if (this.w != null) {
            this.w = null;
        }
        if (this.x != null) {
            this.x = null;
        }
    }

    /* renamed from: com.anythink.expressad.splash.c.c$4  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass4 implements g.d {
        public final /* synthetic */ com.anythink.expressad.foundation.d.c a;
        public final /* synthetic */ int b;

        public AnonymousClass4(com.anythink.expressad.foundation.d.c cVar, int i) {
            this.a = cVar;
            this.b = i;
        }

        @Override // com.anythink.expressad.videocommon.b.g.a
        public final void a(String str) {
            Message obtain = Message.obtain();
            obtain.what = 1;
            obtain.obj = this.a;
            obtain.arg1 = this.b;
            c.this.C.sendMessage(obtain);
        }

        @Override // com.anythink.expressad.videocommon.b.g.a
        public final void a(String str, String str2) {
            c cVar = c.this;
            String unused = cVar.s;
            cVar.a(str);
            Message obtain = Message.obtain();
            obtain.what = 2;
            obtain.obj = str;
            c.this.C.sendMessage(obtain);
        }
    }

    public final void a(int i) {
        this.B = i;
    }

    /* renamed from: com.anythink.expressad.splash.c.c$7  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass7 implements com.anythink.expressad.videocommon.d.b {
        public final /* synthetic */ com.anythink.expressad.foundation.d.c a;

        public AnonymousClass7(com.anythink.expressad.foundation.d.c cVar) {
            this.a = cVar;
        }

        @Override // com.anythink.expressad.videocommon.d.b
        public final void a(String str) {
            c.this.j.setVideoReady(true);
            n.a(c.c, "========VIDEO SUC");
            Message obtain = Message.obtain();
            obtain.obj = this.a;
            obtain.what = 3;
            c.this.C.sendMessage(obtain);
        }

        @Override // com.anythink.expressad.videocommon.d.b
        public final void a(String str, String str2) {
            c.this.j.setVideoReady(false);
            n.a(c.c, "========VIDEO FAI");
            Message obtain = Message.obtain();
            obtain.obj = str;
            obtain.what = 2;
            c.this.C.sendMessage(obtain);
        }
    }

    public final void a(boolean z) {
        this.a = z;
    }

    private void g(com.anythink.expressad.foundation.d.c cVar, int i) {
        if (cVar.j()) {
            b.a aVar = new b.a();
            aVar.b(this.d).a(this.e).a(this.o).a(cVar).a(this.p).h(this.B);
            try {
                if (!TextUtils.isEmpty(cVar.c())) {
                    Uri parse = Uri.parse(cVar.c());
                    String queryParameter = parse.getQueryParameter("hdbtn");
                    String queryParameter2 = parse.getQueryParameter(com.anythink.expressad.video.dynview.a.a.I);
                    String queryParameter3 = parse.getQueryParameter("hdinfo");
                    String queryParameter4 = parse.getQueryParameter("shake_show");
                    String queryParameter5 = parse.getQueryParameter("shake_strength");
                    String queryParameter6 = parse.getQueryParameter("shake_time");
                    String queryParameter7 = parse.getQueryParameter("n_logo");
                    if (!TextUtils.isEmpty(queryParameter)) {
                        aVar.b(Integer.parseInt(queryParameter));
                    }
                    if (!TextUtils.isEmpty(queryParameter2)) {
                        aVar.c(Integer.parseInt(queryParameter2));
                    }
                    if (!TextUtils.isEmpty(queryParameter3)) {
                        aVar.d(Integer.parseInt(queryParameter3));
                    }
                    if (!TextUtils.isEmpty(queryParameter4)) {
                        aVar.e(Integer.parseInt(queryParameter4));
                    }
                    if (!TextUtils.isEmpty(queryParameter5)) {
                        aVar.f(Integer.parseInt(queryParameter5));
                    }
                    if (!TextUtils.isEmpty(queryParameter6)) {
                        aVar.g(Integer.parseInt(queryParameter6));
                    }
                    if (!TextUtils.isEmpty(queryParameter7)) {
                        aVar.i(Integer.parseInt(queryParameter7) == 0 ? 0 : 1);
                    }
                }
            } catch (Throwable th) {
                n.d(c, th.getMessage());
            }
            a.C0074a.a();
            a.a(this.j, new com.anythink.expressad.splash.a.b(aVar), new AnonymousClass5(cVar, i));
        }
    }

    public final void a(com.anythink.expressad.d.c cVar) {
        this.k = cVar;
    }

    public final void a(ATSplashView aTSplashView) {
        this.j = aTSplashView;
    }

    public final void a(int i, int i2) {
        this.r = i;
        this.q = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(com.anythink.expressad.foundation.d.c cVar, int i) {
        if (!b.a(this.j, cVar) || this.v) {
            return;
        }
        l();
        this.b = cVar;
        this.v = true;
        com.anythink.expressad.splash.b.c cVar2 = this.h;
        if (cVar2 != null) {
            cVar2.a(cVar, i);
        }
    }

    public final String a() {
        return this.A;
    }

    public final void a(com.anythink.expressad.foundation.d.d dVar) {
        ArrayList arrayList;
        this.v = false;
        this.s = "";
        this.t = 2;
        if (dVar == null || dVar.J == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            com.anythink.expressad.foundation.d.c cVar = dVar.J.get(0);
            cVar.j(this.d);
            this.y = dVar.c();
            if (cVar.N() != 99 && (!TextUtils.isEmpty(cVar.c()) || !TextUtils.isEmpty(cVar.d()))) {
                if (s.a(cVar)) {
                    cVar.h(s.a(this.i, cVar.ba()) ? 1 : 2);
                }
                if (cVar.ag() != 1 && s.a(this.i, cVar.ba())) {
                    if (s.a(cVar)) {
                        arrayList.add(cVar);
                    } else {
                        int i = com.anythink.expressad.foundation.g.a.cz;
                        s.c();
                    }
                } else {
                    arrayList.add(cVar);
                }
            }
        }
        if (arrayList != null && arrayList.size() > 0) {
            g();
            String str = c;
            n.b(str, "onload load成功 size:" + arrayList.size());
            com.anythink.expressad.foundation.d.c cVar2 = (com.anythink.expressad.foundation.d.c) arrayList.get(0);
            if (TextUtils.isEmpty(cVar2.c()) && (TextUtils.isEmpty(cVar2.d()) || !cVar2.d().contains("<MBTPLMARK>"))) {
                cVar2.a(false);
                cVar2.b(true);
            } else {
                cVar2.a(true);
                cVar2.b(false);
            }
            ATSplashView aTSplashView = this.j;
            if (aTSplashView != null) {
                aTSplashView.setDynamicView(false);
            }
            if (cVar2.j()) {
                d(cVar2, 2);
            }
            if (b.a(this.j, cVar2)) {
                b(cVar2, 2);
                return;
            }
            this.j.clearResState();
            if (!TextUtils.isEmpty(cVar2.c()) && !cVar2.j()) {
                this.x = new AnonymousClass4(cVar2, 2);
                g.a().b(cVar2.c(), (g.a) this.x);
            }
            if (cVar2.j()) {
                return;
            }
            if (!TextUtils.isEmpty(cVar2.d())) {
                e(cVar2, 2);
            }
            if (!TextUtils.isEmpty(cVar2.R())) {
                this.w = new AnonymousClass7(cVar2);
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(cVar2);
                com.anythink.expressad.videocommon.b.c.a().a(this.d, arrayList2, com.anythink.expressad.foundation.g.a.aV, this.w);
                if (!com.anythink.expressad.videocommon.b.c.a().a(com.anythink.expressad.foundation.g.a.aV, this.d, cVar2.y())) {
                    com.anythink.expressad.videocommon.b.c.a().d(this.d);
                } else {
                    this.j.setVideoReady(true);
                    b(cVar2, 2);
                }
            }
            if (TextUtils.isEmpty(cVar2.be())) {
                return;
            }
            d(cVar2, 2);
            return;
        }
        n.b(c, "onload load失败 返回的compaign没有可以用的");
        a("invalid  campaign");
    }

    private void b(String str) {
        if (this.v) {
            return;
        }
        l();
        n.d(c, "real failed ");
        this.v = true;
        com.anythink.expressad.splash.b.c cVar = this.h;
        if (cVar != null) {
            cVar.a(str);
        }
    }

    private List<com.anythink.expressad.foundation.d.c> b(com.anythink.expressad.foundation.d.d dVar) {
        if (dVar == null || dVar.J == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        com.anythink.expressad.foundation.d.c cVar = dVar.J.get(0);
        cVar.j(this.d);
        this.y = dVar.c();
        if (cVar.N() != 99) {
            if (TextUtils.isEmpty(cVar.c()) && TextUtils.isEmpty(cVar.d())) {
                return arrayList;
            }
            if (s.a(cVar)) {
                cVar.h(s.a(this.i, cVar.ba()) ? 1 : 2);
            }
            if (cVar.ag() != 1 && s.a(this.i, cVar.ba())) {
                if (s.a(cVar)) {
                    arrayList.add(cVar);
                    return arrayList;
                }
                int i = com.anythink.expressad.foundation.g.a.cz;
                s.c();
                return arrayList;
            }
            arrayList.add(cVar);
            return arrayList;
        }
        return arrayList;
    }

    private void c(String str) {
        a(str);
    }

    public static /* synthetic */ void c(c cVar, com.anythink.expressad.foundation.d.c cVar2, int i) {
        if (cVar.j.isH5Ready()) {
            return;
        }
        cVar.j.setH5Ready(true);
        cVar.b(cVar2, i);
    }

    public static /* synthetic */ void b(c cVar, com.anythink.expressad.foundation.d.c cVar2, int i) {
        if (cVar2.j()) {
            b.a aVar = new b.a();
            aVar.b(cVar.d).a(cVar.e).a(cVar.o).a(cVar2).a(cVar.p).h(cVar.B);
            try {
                if (!TextUtils.isEmpty(cVar2.c())) {
                    Uri parse = Uri.parse(cVar2.c());
                    String queryParameter = parse.getQueryParameter("hdbtn");
                    String queryParameter2 = parse.getQueryParameter(com.anythink.expressad.video.dynview.a.a.I);
                    String queryParameter3 = parse.getQueryParameter("hdinfo");
                    String queryParameter4 = parse.getQueryParameter("shake_show");
                    String queryParameter5 = parse.getQueryParameter("shake_strength");
                    String queryParameter6 = parse.getQueryParameter("shake_time");
                    String queryParameter7 = parse.getQueryParameter("n_logo");
                    if (!TextUtils.isEmpty(queryParameter)) {
                        aVar.b(Integer.parseInt(queryParameter));
                    }
                    if (!TextUtils.isEmpty(queryParameter2)) {
                        aVar.c(Integer.parseInt(queryParameter2));
                    }
                    if (!TextUtils.isEmpty(queryParameter3)) {
                        aVar.d(Integer.parseInt(queryParameter3));
                    }
                    if (!TextUtils.isEmpty(queryParameter4)) {
                        aVar.e(Integer.parseInt(queryParameter4));
                    }
                    if (!TextUtils.isEmpty(queryParameter5)) {
                        aVar.f(Integer.parseInt(queryParameter5));
                    }
                    if (!TextUtils.isEmpty(queryParameter6)) {
                        aVar.g(Integer.parseInt(queryParameter6));
                    }
                    if (!TextUtils.isEmpty(queryParameter7)) {
                        aVar.i(Integer.parseInt(queryParameter7) == 0 ? 0 : 1);
                    }
                }
            } catch (Throwable th) {
                n.d(c, th.getMessage());
            }
            a.C0074a.a();
            a.a(cVar.j, new com.anythink.expressad.splash.a.b(aVar), new AnonymousClass5(cVar2, i));
        }
    }

    private void a(long j) {
        this.C.postDelayed(this.D, j);
    }

    public final void a(com.anythink.expressad.splash.b.c cVar) {
        this.h = cVar;
    }

    private void a(com.anythink.expressad.foundation.d.c cVar, int i) {
        ATSplashView aTSplashView = this.j;
        if (aTSplashView != null) {
            aTSplashView.setDynamicView(false);
        }
        if (cVar.j()) {
            d(cVar, i);
        }
        if (b.a(this.j, cVar)) {
            b(cVar, i);
            return;
        }
        this.j.clearResState();
        if (!TextUtils.isEmpty(cVar.c()) && !cVar.j()) {
            this.x = new AnonymousClass4(cVar, i);
            g.a().b(cVar.c(), (g.a) this.x);
        }
        if (cVar.j()) {
            return;
        }
        if (!TextUtils.isEmpty(cVar.d())) {
            e(cVar, i);
        }
        if (!TextUtils.isEmpty(cVar.R())) {
            this.w = new AnonymousClass7(cVar);
            ArrayList arrayList = new ArrayList();
            arrayList.add(cVar);
            com.anythink.expressad.videocommon.b.c.a().a(this.d, arrayList, com.anythink.expressad.foundation.g.a.aV, this.w);
            if (!com.anythink.expressad.videocommon.b.c.a().a(com.anythink.expressad.foundation.g.a.aV, this.d, cVar.y())) {
                com.anythink.expressad.videocommon.b.c.a().d(this.d);
            } else {
                this.j.setVideoReady(true);
                b(cVar, i);
            }
        }
        if (TextUtils.isEmpty(cVar.be())) {
            return;
        }
        d(cVar, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        if (this.u) {
            this.u = false;
        } else {
            b(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, final com.anythink.expressad.foundation.d.c cVar, final int i) {
        e.c cVar2 = new e.c();
        cVar2.c(this.d);
        cVar2.b(this.e);
        cVar2.a(cVar);
        cVar2.a(str);
        cVar2.b(this.o);
        cVar2.a(this.p);
        cVar2.a(this.a);
        e.a.a().a(this.j, cVar2, new e.b() { // from class: com.anythink.expressad.splash.c.c.6
            @Override // com.anythink.expressad.splash.c.e.b
            public final void a() {
                if (cVar.r()) {
                    return;
                }
                c.c(c.this, cVar, i);
            }

            @Override // com.anythink.expressad.splash.c.e.b
            public final void a(String str2) {
                c.this.a(str2);
            }

            @Override // com.anythink.expressad.splash.c.e.b
            public final void a(int i2) {
                if (i2 == 1) {
                    c.c(c.this, cVar, i);
                } else {
                    c.this.a("readyState 2");
                }
            }
        });
    }

    private void a(com.anythink.expressad.foundation.d.d dVar, int i) {
        ArrayList arrayList;
        if (dVar == null || dVar.J == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            com.anythink.expressad.foundation.d.c cVar = dVar.J.get(0);
            cVar.j(this.d);
            this.y = dVar.c();
            if (cVar.N() != 99 && (!TextUtils.isEmpty(cVar.c()) || !TextUtils.isEmpty(cVar.d()))) {
                if (s.a(cVar)) {
                    cVar.h(s.a(this.i, cVar.ba()) ? 1 : 2);
                }
                if (cVar.ag() != 1 && s.a(this.i, cVar.ba())) {
                    if (s.a(cVar)) {
                        arrayList.add(cVar);
                    } else {
                        int i2 = com.anythink.expressad.foundation.g.a.cz;
                        s.c();
                    }
                } else {
                    arrayList.add(cVar);
                }
            }
        }
        if (arrayList != null && arrayList.size() > 0) {
            g();
            String str = c;
            n.b(str, "onload load成功 size:" + arrayList.size());
            com.anythink.expressad.foundation.d.c cVar2 = (com.anythink.expressad.foundation.d.c) arrayList.get(0);
            if (TextUtils.isEmpty(cVar2.c()) && (TextUtils.isEmpty(cVar2.d()) || !cVar2.d().contains("<MBTPLMARK>"))) {
                cVar2.a(false);
                cVar2.b(true);
            } else {
                cVar2.a(true);
                cVar2.b(false);
            }
            ATSplashView aTSplashView = this.j;
            if (aTSplashView != null) {
                aTSplashView.setDynamicView(false);
            }
            if (cVar2.j()) {
                d(cVar2, i);
            }
            if (b.a(this.j, cVar2)) {
                b(cVar2, i);
                return;
            }
            this.j.clearResState();
            if (!TextUtils.isEmpty(cVar2.c()) && !cVar2.j()) {
                this.x = new AnonymousClass4(cVar2, i);
                g.a().b(cVar2.c(), (g.a) this.x);
            }
            if (cVar2.j()) {
                return;
            }
            if (!TextUtils.isEmpty(cVar2.d())) {
                e(cVar2, i);
            }
            if (!TextUtils.isEmpty(cVar2.R())) {
                this.w = new AnonymousClass7(cVar2);
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(cVar2);
                com.anythink.expressad.videocommon.b.c.a().a(this.d, arrayList2, com.anythink.expressad.foundation.g.a.aV, this.w);
                if (!com.anythink.expressad.videocommon.b.c.a().a(com.anythink.expressad.foundation.g.a.aV, this.d, cVar2.y())) {
                    com.anythink.expressad.videocommon.b.c.a().d(this.d);
                } else {
                    this.j.setVideoReady(true);
                    b(cVar2, i);
                }
            }
            if (TextUtils.isEmpty(cVar2.be())) {
                return;
            }
            d(cVar2, i);
            return;
        }
        n.b(c, "onload load失败 返回的compaign没有可以用的");
        a("invalid  campaign");
    }
}