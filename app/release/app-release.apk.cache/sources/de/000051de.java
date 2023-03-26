package com.p7700g.p99005;

import com.p7700g.p99005.j14;
import com.p7700g.p99005.o64;
import java.util.Objects;

/* compiled from: IPAddressProvider.java */
/* loaded from: classes3.dex */
public final /* synthetic */ class n64 {
    public static boolean A(o64 _this, o64 o64Var) throws t14 {
        if (_this == o64Var) {
            return true;
        }
        j14 w1 = _this.w1();
        if (w1 == null) {
            return _this.getType() == o64Var.getType();
        }
        j14 w12 = o64Var.w1();
        if (w12 != null) {
            return w1.equals(w12);
        }
        return false;
    }

    public static int B(o64 _this) throws t14 {
        j14 w1 = _this.w1();
        if (w1 != null) {
            return w1.hashCode();
        }
        return Objects.hashCode(_this.getType());
    }

    public static o64 C(j14 j14Var, j14 j14Var2) {
        return new o64.h(j14Var, j14Var2, null);
    }

    public static Boolean a(o64 o64Var, o64 o64Var2) {
        return null;
    }

    public static Boolean b(o64 o64Var, String str) {
        return null;
    }

    public static r24 c(o64 _this) throws t14 {
        return _this.w1();
    }

    public static s14 d(o64 o64Var) {
        return null;
    }

    public static j14.b e(o64 o64Var) {
        return null;
    }

    public static j14 f(o64 o64Var) {
        return null;
    }

    public static Integer g(o64 o64Var) {
        return null;
    }

    public static q14 h(o64 _this) {
        j14 w1 = _this.w1();
        if (w1 != null) {
            return w1.z2();
        }
        return null;
    }

    public static boolean i(o64 _this) {
        return _this.c2() != null;
    }

    public static boolean j(o64 o64Var) {
        return false;
    }

    public static boolean k(o64 o64Var) {
        return false;
    }

    public static boolean l(o64 o64Var) {
        return false;
    }

    public static boolean m(o64 o64Var) {
        return false;
    }

    public static boolean n(o64 o64Var) {
        return false;
    }

    public static boolean o(o64 o64Var) {
        return false;
    }

    public static boolean p(o64 o64Var) {
        return false;
    }

    public static boolean q(o64 o64Var) {
        return false;
    }

    public static boolean r(o64 o64Var) {
        return false;
    }

    public static boolean s(o64 _this) {
        try {
            j14 w1 = _this.w1();
            if (w1 != null) {
                return w1.M0();
            }
            return false;
        } catch (t14 unused) {
            return false;
        }
    }

    public static boolean t(o64 o64Var) {
        return false;
    }

    public static Boolean u(o64 o64Var, o64 o64Var2) {
        return null;
    }

    public static Boolean v(o64 o64Var, o64 o64Var2) {
        return null;
    }

    public static Boolean w(o64 o64Var, String str) {
        return null;
    }

    public static Boolean x(o64 o64Var, o64 o64Var2) {
        return null;
    }

    public static Boolean y(o64 o64Var, String str) {
        return null;
    }

    public static int z(o64 _this, o64 o64Var) throws t14 {
        j14 w1;
        if (_this == o64Var) {
            return 0;
        }
        j14 w12 = _this.w1();
        if (w12 != null && (w1 = o64Var.w1()) != null) {
            return w12.m4(w1);
        }
        o64.i type = _this.getType();
        o64.i type2 = o64Var.getType();
        if (type == null) {
            return type2 == null ? 0 : -1;
        } else if (type2 == null) {
            return 1;
        } else {
            return type.ordinal() - type2.ordinal();
        }
    }
}