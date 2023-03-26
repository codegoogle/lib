package com.anythink.expressad.foundation.g.f.h;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.expressad.foundation.g.f.d.d;
import com.anythink.expressad.foundation.g.f.d.g;
import com.anythink.expressad.foundation.g.f.e;
import com.anythink.expressad.foundation.g.f.i;
import com.anythink.expressad.foundation.g.f.l;
import com.anythink.expressad.foundation.g.f.m;
import com.anythink.expressad.foundation.h.n;
import com.anythink.expressad.foundation.h.o;
import com.anythink.expressad.out.k;
import com.p7700g.p99005.wo1;
import java.io.File;

/* loaded from: classes2.dex */
public class b {
    private static final String b = "b";
    public Context a;

    public b(Context context) {
        if (context == null) {
            this.a = com.anythink.expressad.foundation.b.a.b().d();
        } else {
            this.a = context.getApplicationContext();
        }
    }

    private void b(int i, String str, c cVar, e eVar) {
        b(i, str, cVar, new com.anythink.expressad.foundation.g.f.b(), eVar);
    }

    public void a(String str, c cVar) {
        if (cVar != null) {
            cVar.a("open", com.anythink.expressad.foundation.g.a.cy);
            StringBuilder sb = new StringBuilder();
            com.anythink.expressad.foundation.g.f.a.a();
            sb.append(com.anythink.expressad.foundation.g.f.a.b());
            cVar.a("band_width", sb.toString());
            String str2 = cVar.b().get("unit_id");
            if (str2 != null) {
                String a = k.a().a(str2, str);
                if (TextUtils.isEmpty(a)) {
                    return;
                }
                cVar.a("ch_info", a);
            }
        }
    }

    private void b(int i, String str, c cVar, l lVar, e eVar) {
        if (cVar == null) {
            try {
                cVar = new c();
            } catch (Exception e) {
                n.a(b, e.getMessage());
            }
        }
        a(str, cVar);
        i iVar = null;
        if (i == 0) {
            iVar = new g(1, str, cVar.toString(), eVar);
            iVar.a("Content-Type", "application/x-www-form-urlencoded");
        } else if (i == 1) {
            iVar = new d(1, str, cVar.toString(), eVar);
            iVar.a("Content-Type", "application/x-www-form-urlencoded");
        } else if (i == 2) {
            iVar = new com.anythink.expressad.foundation.g.f.d.c(1, str, cVar.toString(), eVar);
            iVar.a("Content-Type", "application/x-www-form-urlencoded");
        }
        if (iVar != null) {
            iVar.a(lVar);
            m.a(iVar);
        }
    }

    public final void a(String str, e eVar) {
        Exception e;
        c cVar;
        com.anythink.expressad.foundation.g.f.b bVar = new com.anythink.expressad.foundation.g.f.b();
        try {
            cVar = new c();
            try {
                a(str, cVar);
                String str2 = cVar.b().get("sign");
                if (str2 == null) {
                    str2 = "";
                }
                long currentTimeMillis = System.currentTimeMillis();
                cVar.a("ts", String.valueOf(currentTimeMillis));
                cVar.a("st", o.a(str2 + currentTimeMillis));
            } catch (Exception e2) {
                e = e2;
                n.a(b, e.getMessage());
                StringBuilder L = wo1.L(str, "?");
                L.append(cVar.toString());
                g gVar = new g(0, L.toString(), null, eVar);
                gVar.a((l) bVar);
                m.a(gVar);
            }
        } catch (Exception e3) {
            e = e3;
            cVar = null;
        }
        StringBuilder L2 = wo1.L(str, "?");
        L2.append(cVar.toString());
        g gVar2 = new g(0, L2.toString(), null, eVar);
        gVar2.a((l) bVar);
        m.a(gVar2);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(int i, String str, c cVar, l lVar, e eVar) {
        i gVar;
        if (cVar == null) {
            try {
                cVar = new c();
            } catch (Exception e) {
                n.a(b, e.getMessage());
            }
        }
        a(str, cVar);
        String str2 = cVar.b().get("sign");
        if (str2 == null) {
            str2 = "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        cVar.a("ts", String.valueOf(currentTimeMillis));
        cVar.a("st", o.a(str2 + currentTimeMillis));
        StringBuilder L = wo1.L(str, "?");
        L.append(cVar.toString());
        String sb = L.toString();
        i iVar = null;
        if (i == 0) {
            gVar = new g(0, sb, null, eVar);
        } else if (i != 1) {
            if (i == 2) {
                gVar = new com.anythink.expressad.foundation.g.f.d.c(0, sb, null, eVar);
            }
            if (iVar == null) {
                iVar.a(lVar);
                m.a(iVar);
                return;
            }
            return;
        } else {
            gVar = new d(0, sb, null, eVar);
        }
        iVar = gVar;
        if (iVar == null) {
        }
    }

    public static void a(File file, String str, e eVar) {
        m.a().a(file, str, eVar);
    }

    private void a(int i, String str, c cVar, e eVar) {
        String str2 = cVar.b().get("sign");
        if (str2 == null) {
            str2 = "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        cVar.a("ts", String.valueOf(currentTimeMillis));
        cVar.a("st", o.a(str2 + currentTimeMillis));
        b(i, str, cVar, new com.anythink.expressad.foundation.g.f.b(), eVar);
    }
}