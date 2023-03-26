package com.anythink.core.a;

import android.content.Context;
import com.anythink.core.c.d;
import com.anythink.core.common.b.g;
import com.anythink.core.common.b.m;
import com.anythink.core.common.e.af;
import com.anythink.core.common.j.n;

/* loaded from: classes2.dex */
public final class c {
    private static c a;
    private final String b = "pacing_";

    public static c a() {
        if (a == null) {
            a = new c();
        }
        return a;
    }

    public static void a(String str) {
        try {
            n.a(m.a().e(), g.o, "pacing_".concat(String.valueOf(str)), System.currentTimeMillis());
        } catch (Exception unused) {
        }
    }

    public static boolean a(String str, d dVar) {
        if (dVar == null) {
            return true;
        }
        if (dVar.Y() == -1) {
            return false;
        }
        long longValue = n.a(m.a().e(), g.o, "pacing_".concat(String.valueOf(str)), (Long) 0L).longValue();
        if (System.currentTimeMillis() - longValue >= 0) {
            return System.currentTimeMillis() - longValue < dVar.Y();
        }
        a(str);
        return false;
    }

    public final void a(final String str, final String str2) {
        com.anythink.core.common.j.b.a.a().a(new Runnable() { // from class: com.anythink.core.a.c.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    Context e = m.a().e();
                    n.a(e, g.o, "pacing_" + str + "_" + str2, System.currentTimeMillis());
                } catch (Exception unused) {
                }
            }
        });
    }

    public final boolean a(String str, af afVar) {
        if (afVar == null) {
            return true;
        }
        if (afVar.s() == -1) {
            return false;
        }
        Context e = m.a().e();
        long longValue = n.a(e, g.o, "pacing_" + str + "_" + afVar.t(), (Long) 0L).longValue();
        if (System.currentTimeMillis() - longValue >= 0) {
            return System.currentTimeMillis() - longValue < afVar.s();
        }
        a(str, afVar.t());
        return false;
    }
}