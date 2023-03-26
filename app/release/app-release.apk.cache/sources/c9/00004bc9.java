package com.p7700g.p99005;

import android.text.TextUtils;
import com.p7700g.p99005.q71;

/* compiled from: CnlConfigHelper.java */
/* loaded from: classes.dex */
public class k21 {
    @x1
    private static final kj1 a = kj1.b("CNLSwitchHandler");
    @x1
    public static final String b = "wifi";
    @x1
    public static final String c = "wwan";
    @x1
    public static final String d = "lan";
    @x1
    public static final String e = "enable";
    @x1
    public static final String f = "disable";
    @x1
    public static final String g = "yes";
    @x1
    public static final String h = "no";
    @x1
    private final o71 i;
    @x1
    private final n21 j;

    public k21(@x1 o71 o71Var, @x1 n21 n21Var) {
        this.i = o71Var;
        this.j = n21Var;
    }

    private boolean b(@x1 j21 j21Var, @x1 q71 q71Var) {
        return j21Var.f() || j21Var.d().contains(q71Var.c()) || j21Var.c().contains(q71Var.a());
    }

    @z1
    private en1 c(@x1 j21 j21Var, @x1 q71 q71Var) {
        kj1 kj1Var = a;
        kj1Var.c("fitNetwork config: %s status: %s", j21Var, q71Var);
        if (q71Var.d() == q71.b.WIFI && b.equals(j21Var.e())) {
            boolean b2 = b(j21Var, q71Var);
            boolean d2 = d(j21Var, q71Var);
            kj1Var.c("fitNetwork wifi name: %s security: %s", Boolean.valueOf(b2), Boolean.valueOf(d2));
            if (b2 && d2) {
                return f(j21Var.a());
            }
            return null;
        } else if (q71Var.d() == q71.b.LAN && d.equals(j21Var.e())) {
            kj1Var.c("fitNetwork lan", new Object[0]);
            return f(j21Var.a());
        } else if (q71Var.d() == q71.b.MOBILE && c.equals(j21Var.e())) {
            kj1Var.c("fitNetwork wwan", new Object[0]);
            return f(j21Var.a());
        } else {
            return null;
        }
    }

    private boolean d(@x1 j21 j21Var, @x1 q71 q71Var) {
        if (TextUtils.isEmpty(j21Var.b())) {
            return true;
        }
        if (q71Var.b().equals(q71.a.OPEN)) {
            return h.equals(j21Var.b());
        }
        if (q71Var.b().equals(q71.a.SECURE)) {
            return g.equals(j21Var.b());
        }
        return false;
    }

    @x1
    private en1 f(@x1 String str) {
        if (e.equals(str)) {
            return en1.CONNECTED;
        }
        return en1.IDLE;
    }

    @z1
    public en1 a(@x1 String str) {
        q71 c2 = this.i.c();
        a.c("onNetworkChange status: %s", c2);
        if (c2.d() == q71.b.NONE) {
            return null;
        }
        for (j21 j21Var : this.j.a(str)) {
            en1 c3 = c(j21Var, c2);
            a.c("target state: %s", c3);
            if (c3 != null) {
                return c3;
            }
        }
        return null;
    }

    public boolean e(@x1 String str) {
        return this.j.a(str).size() > 0;
    }
}