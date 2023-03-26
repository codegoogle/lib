package com.p7700g.p99005;

import java.math.BigInteger;

/* compiled from: AddressItem.java */
/* loaded from: classes3.dex */
public final /* synthetic */ class k24 {
    public static int a(l24 _this, l24 l24Var) {
        return n04.G.compare(_this, l24Var);
    }

    public static boolean c(l24 _this, int i) {
        if (i == 0) {
            return _this.H0();
        }
        BigInteger C1 = _this.C1();
        return f24.E3(_this.getValue(), C1, C1, _this.A0(), i);
    }

    public static boolean d(l24 _this, int i) {
        if (i == 0) {
            return _this.H0();
        }
        BigInteger value = _this.getValue();
        return f24.E3(value, value, _this.C1(), _this.A0(), i);
    }

    public static int e(l24 _this) {
        return (_this.A0() + 7) >>> 3;
    }

    public static BigInteger f(l24 _this) {
        return _this.C1().subtract(_this.getValue()).add(BigInteger.ONE);
    }

    public static int g(l24 _this) {
        int numberOfTrailingZeros;
        int A0 = _this.A0();
        BigInteger value = _this.getValue();
        BigInteger C1 = _this.C1();
        do {
            int numberOfTrailingZeros2 = Long.numberOfTrailingZeros(value.longValue());
            if (numberOfTrailingZeros2 == 0 || (numberOfTrailingZeros = Long.numberOfTrailingZeros(~C1.longValue())) == 0) {
                break;
            }
            int min = Math.min(numberOfTrailingZeros2, numberOfTrailingZeros);
            A0 -= min;
            if (min < 64) {
                break;
            }
            value = value.shiftRight(64);
            C1 = C1.shiftRight(64);
        } while (!C1.equals(BigInteger.ZERO));
        return A0;
    }

    public static BigInteger h(l24 _this, int i) {
        if (i >= 0) {
            int A0 = _this.A0();
            if (A0 <= i) {
                return _this.getCount();
            }
            int i2 = A0 - i;
            return _this.C1().shiftRight(i2).subtract(_this.getValue().shiftRight(i2)).add(BigInteger.ONE);
        }
        throw new y14(_this, i);
    }

    public static Integer i(l24 _this) {
        int b3 = _this.b3();
        BigInteger value = _this.getValue();
        BigInteger C1 = _this.C1();
        int A0 = _this.A0();
        if (b3 == A0) {
            if (value.equals(C1)) {
                return g24.b(b3);
            }
            return null;
        }
        int i = A0 - b3;
        if (value.shiftRight(i).equals(C1.shiftRight(i))) {
            return g24.b(b3);
        }
        return null;
    }

    public static boolean j(l24 _this) {
        return _this.v1() && _this.x1();
    }

    public static boolean k(l24 _this) {
        return !_this.getCount().equals(BigInteger.ONE);
    }
}