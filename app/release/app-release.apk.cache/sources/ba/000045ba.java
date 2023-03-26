package com.p7700g.p99005;

import java.math.BigInteger;

/* compiled from: AddressDivisionSeries.java */
/* loaded from: classes3.dex */
public final /* synthetic */ class h24 {
    public static int a(i24 _this) {
        int p1 = _this.p1();
        int i = 0;
        for (int i2 = 0; i2 < p1; i2++) {
            i += _this.e0(i2).A0();
        }
        return i;
    }

    public static BigInteger b(i24 _this, int i) {
        if (i >= 0) {
            BigInteger bigInteger = BigInteger.ONE;
            int p1 = _this.p1();
            if (i >= p1) {
                i = p1;
            }
            for (int i2 = 0; i2 < i; i2++) {
                j24 e0 = _this.e0(i2);
                if (e0.z3()) {
                    bigInteger = bigInteger.multiply(e0.getCount());
                }
            }
            return bigInteger;
        }
        throw new IllegalArgumentException();
    }

    public static BigInteger c(i24 _this) {
        BigInteger bigInteger = BigInteger.ONE;
        int p1 = _this.p1();
        if (p1 > 0) {
            for (int i = 0; i < p1; i++) {
                if (_this.e0(i).z3()) {
                    bigInteger = bigInteger.multiply(_this.e0(i).getCount());
                }
            }
        }
        return bigInteger;
    }

    public static /* synthetic */ k34 d(i24 _this, int i) {
        return _this.e0(i);
    }

    public static BigInteger e(i24 _this) {
        Integer L0 = _this.L0();
        if (L0 != null && L0.intValue() < _this.A0()) {
            return _this.h1(L0.intValue());
        }
        return _this.getCount();
    }

    public static BigInteger f(i24 _this, int i) {
        if (i >= 0 && i <= _this.A0()) {
            BigInteger bigInteger = BigInteger.ONE;
            if (_this.z3()) {
                int p1 = _this.p1();
                for (int i2 = 0; i2 < p1; i2++) {
                    j24 e0 = _this.e0(i2);
                    int A0 = e0.A0();
                    if (e0.z3()) {
                        bigInteger = bigInteger.multiply(i < A0 ? e0.h1(i) : e0.getCount());
                    }
                    if (i <= A0) {
                        break;
                    }
                    i -= A0;
                }
            }
            return bigInteger;
        }
        throw new y14(_this, i);
    }

    public static int g(i24 _this) {
        int p1 = _this.p1();
        if (p1 == 0) {
            return 0;
        }
        do {
            p1--;
            if (p1 <= 0) {
                break;
            }
        } while (_this.e0(p1).H0());
        return p1;
    }

    public static int h(i24 _this, i24 i24Var) {
        if (!_this.z3()) {
            return i24Var.z3() ? -1 : 0;
        } else if (i24Var.z3()) {
            return _this.getCount().compareTo(i24Var.getCount());
        } else {
            return 1;
        }
    }

    public static boolean i(i24 _this) {
        int p1 = _this.p1();
        if (p1 > 1) {
            for (int i = 0; i < p1; i++) {
                if (_this.e0(i).z3()) {
                    for (int i2 = i + 1; i2 < p1; i2++) {
                        if (!_this.e0(i2).H0()) {
                            return false;
                        }
                    }
                    return true;
                }
            }
        }
        return true;
    }
}