package com.anythink.basead.a;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.anythink.core.api.IExHandler;
import com.anythink.core.common.b.m;
import com.anythink.core.common.e.k;
import com.anythink.core.common.e.q;
import com.anythink.core.common.e.x;
import com.anythink.core.common.e.y;
import com.p7700g.p99005.x1;

/* loaded from: classes2.dex */
public final class b {
    public static final int A = 27;
    public static final int B = 28;
    public static final int C = 29;
    public static final int D = 30;
    public static final int E = 31;
    public static final int F = 32;
    public static final int G = 33;
    public static final int H = 34;
    public static final int a = 1;
    public static final int b = 2;
    public static final int c = 3;
    public static final int d = 4;
    public static final int e = 5;
    public static final int f = 6;
    public static final int g = 7;
    public static final int h = 8;
    public static final int i = 9;
    public static final int j = 10;
    public static final int k = 11;
    public static final int l = 12;
    public static final int m = 13;
    public static final int n = 14;
    public static final int o = 15;
    public static final int p = 16;
    public static final int q = 17;
    public static final int r = 18;
    public static final int s = 19;
    public static final int t = 20;
    public static final int u = 21;
    public static final int v = 22;
    public static final int w = 23;
    public static final int x = 24;
    public static final int y = 25;
    public static final int z = 26;

    public static boolean a(Context context, com.anythink.core.common.e.j jVar, final com.anythink.core.common.e.i iVar, com.anythink.basead.c.d dVar, String str, com.anythink.core.common.f.b bVar) {
        try {
            IExHandler b2 = m.a().b();
            String str2 = (dVar == null || TextUtils.isEmpty(dVar.c)) ? "" : dVar.c;
            if (b2 != null) {
                final Context applicationContext = context.getApplicationContext();
                b2.handleOfferClick(applicationContext, jVar, iVar, str, str2, new Runnable() { // from class: com.anythink.basead.a.b.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (com.anythink.core.common.e.i.this instanceof x) {
                            h.a(applicationContext).a();
                            h.a(applicationContext).a(com.anythink.core.common.e.i.this.k(), com.anythink.core.common.e.i.this);
                        }
                    }
                }, bVar);
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static void a(final int i2, final com.anythink.core.common.e.i iVar, @x1 final com.anythink.basead.c.i iVar2) {
        Runnable runnable = new Runnable() { // from class: com.anythink.basead.a.b.2
            @Override // java.lang.Runnable
            public final void run() {
                com.anythink.core.common.e.i iVar3 = com.anythink.core.common.e.i.this;
                if (iVar3 instanceof q) {
                    q qVar = (q) iVar3;
                    boolean a2 = iVar3.g() != null ? b.a(i2, com.anythink.core.common.e.i.this.g()) : false;
                    if (i2 == 8) {
                        new com.anythink.basead.g.c(qVar.K(), iVar2.a, a2).a(0, (com.anythink.core.common.g.h) null);
                    }
                    com.anythink.basead.g.b bVar = new com.anythink.basead.g.b(i2, qVar, iVar2.a);
                    bVar.b(iVar2.b);
                    bVar.a(0, (com.anythink.core.common.g.h) null);
                } else {
                    j.a(i2, (x) iVar3, iVar2);
                }
                if (i2 == 21) {
                    com.anythink.core.common.e.i iVar4 = com.anythink.core.common.e.i.this;
                    if (iVar4 instanceof com.anythink.core.common.e.g) {
                        com.anythink.core.common.e.g gVar = (com.anythink.core.common.e.g) iVar4;
                        if (gVar.c() == 1) {
                            if (com.anythink.core.common.j.h.a(m.a().e().getApplicationContext(), gVar.w())) {
                                com.anythink.core.common.j.e.a("DspInfoLog", "check offer installed(Apk Install Broadcast):true,dsp offerid:" + gVar.N() + ",packagename:" + gVar.w());
                                com.anythink.core.common.a.b.a().c(gVar);
                                return;
                            }
                            com.anythink.core.common.j.e.a("DspInfoLog", "check offer installed(Apk Install Broadcast):false,dsp offerid:" + gVar.N() + ",packagename:" + gVar.w());
                        }
                    }
                }
            }
        };
        if (Looper.getMainLooper() != Looper.myLooper()) {
            runnable.run();
        } else {
            com.anythink.core.common.j.b.a.a().a(runnable);
        }
    }

    public static boolean a(int i2, k kVar) {
        if (i2 != 1 && i2 != 2 && i2 != 3 && i2 != 4 && i2 != 5 && i2 != 8) {
            if (i2 != 9 || kVar.d() != 1) {
                return false;
            }
        } else if (kVar.c() != 1) {
            return false;
        }
        return true;
    }

    private static boolean a(com.anythink.core.common.e.i iVar, k kVar) {
        if (iVar instanceof com.anythink.core.common.e.g) {
            if (!(kVar instanceof y) || ((y) kVar).N() != 1) {
                return false;
            }
        } else if (!(iVar instanceof q) || ((q) iVar).J() != 1) {
            return false;
        }
        return true;
    }

    public static boolean a(Context context, String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                context.getPackageManager().getApplicationInfo(str, 8192);
                return true;
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    public static boolean a(Context context, com.anythink.core.common.e.i iVar) {
        if (TextUtils.isEmpty(iVar.u()) || !com.anythink.core.basead.a.a.a(context, iVar.u(), false)) {
            if (TextUtils.isEmpty(iVar.w())) {
                return false;
            }
            return c.a(context, iVar.w());
        }
        return true;
    }

    private static void a(com.anythink.core.common.e.i iVar) {
        if (iVar instanceof com.anythink.core.common.e.g) {
            com.anythink.core.common.e.g gVar = (com.anythink.core.common.e.g) iVar;
            if (gVar.c() == 1) {
                if (com.anythink.core.common.j.h.a(m.a().e().getApplicationContext(), gVar.w())) {
                    com.anythink.core.common.j.e.a("DspInfoLog", "check offer installed(Apk Install Broadcast):true,dsp offerid:" + gVar.N() + ",packagename:" + gVar.w());
                    com.anythink.core.common.a.b.a().c(gVar);
                    return;
                }
                com.anythink.core.common.j.e.a("DspInfoLog", "check offer installed(Apk Install Broadcast):false,dsp offerid:" + gVar.N() + ",packagename:" + gVar.w());
            }
        }
    }
}