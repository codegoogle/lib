package com.anythink.expressad.splash.d;

import android.text.TextUtils;
import com.anythink.expressad.foundation.h.n;
import com.anythink.expressad.out.e;
import java.util.Random;

/* loaded from: classes2.dex */
public final class d implements com.anythink.expressad.splash.b.d {
    private static final String a = "SplashShowListenerImpl";
    private e b;
    private com.anythink.expressad.foundation.d.c c;
    private boolean d;
    private c e;

    public d(c cVar, e eVar, double d, com.anythink.expressad.foundation.d.c cVar2) {
        this.e = cVar;
        this.b = eVar;
        this.c = cVar2;
        this.d = a(d, cVar2);
    }

    private static void e() {
    }

    private static void f() {
    }

    private void g() {
        if (this.b != null) {
            this.b = null;
        }
    }

    @Override // com.anythink.expressad.splash.b.d
    public final void a() {
        c cVar = this.e;
        if (cVar != null) {
            cVar.a = true;
        }
        StringBuffer stringBuffer = new StringBuffer("load_to=");
        stringBuffer.append(this.e.c());
        stringBuffer.append("&allow_skip=");
        stringBuffer.append(this.e.d() ? 1 : 0);
        stringBuffer.append("&countdown=");
        stringBuffer.append(this.e.e());
        stringBuffer.append("&");
        e eVar = this.b;
        if (eVar == null || this.d) {
            return;
        }
        eVar.a();
    }

    @Override // com.anythink.expressad.splash.b.d
    public final void b() {
        c cVar = this.e;
        if (cVar != null) {
            cVar.a = false;
        }
    }

    @Override // com.anythink.expressad.splash.b.d
    public final void c() {
        e eVar = this.b;
        if (eVar != null) {
            eVar.c();
        }
        c cVar = this.e;
        if (cVar != null) {
            cVar.a = false;
        }
    }

    @Override // com.anythink.expressad.splash.b.d
    public final void d() {
    }

    @Override // com.anythink.expressad.splash.b.d
    public final void a(com.anythink.expressad.foundation.d.c cVar) {
        e eVar = this.b;
        if (eVar == null || this.d) {
            return;
        }
        eVar.a(cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0053 A[Catch: Exception -> 0x009c, TryCatch #0 {Exception -> 0x009c, blocks: (B:3:0x0003, B:5:0x0013, B:7:0x001c, B:9:0x002f, B:11:0x0053, B:13:0x0059, B:15:0x005d, B:17:0x0062, B:22:0x006f, B:26:0x008e), top: B:33:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean a(double d, com.anythink.expressad.foundation.d.c cVar) {
        long j;
        try {
            long j2 = 0;
            if (!TextUtils.isEmpty(com.anythink.expressad.foundation.b.a.b().e())) {
                com.anythink.expressad.d.b.a();
                com.anythink.expressad.d.a b = com.anythink.expressad.d.b.b();
                if (b != null) {
                    long m = b.m() * 1000;
                    j2 = 1000 * b.y();
                    j = m;
                    n.d(a, "cbp : " + d + " plct : " + j2 + " plctb : " + j);
                    if (cVar != null) {
                        if (cVar.a(j2, j)) {
                            cVar.d(1);
                            return true;
                        }
                        cVar.d(0);
                    }
                    if (cVar != null || cVar.y() || d == 1.0d) {
                        return false;
                    }
                    double nextDouble = new Random().nextDouble();
                    StringBuilder sb = new StringBuilder("hit : ");
                    sb.append(nextDouble);
                    sb.append(" ");
                    int i = (nextDouble > d ? 1 : (nextDouble == d ? 0 : -1));
                    sb.append(i > 0);
                    n.d(a, sb.toString());
                    return i > 0;
                }
            }
            j = 0;
            n.d(a, "cbp : " + d + " plct : " + j2 + " plctb : " + j);
            if (cVar != null) {
            }
            if (cVar != null) {
            }
        } catch (Exception e) {
            n.b(a, "CBPERROR", e);
            return false;
        }
    }
}