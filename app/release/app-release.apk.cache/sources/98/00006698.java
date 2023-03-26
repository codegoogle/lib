package com.p7700g.p99005;

import java.math.BigInteger;

/* compiled from: IPAddressLargeDivisionGrouping.java */
/* loaded from: classes3.dex */
public class y24 extends g24 implements r24 {
    private static final long E = 1;
    private l14<?, ?, ?, ?, ?> F;

    public y24(x24[] x24VarArr, l14<?, ?, ?, ?, ?> l14Var) {
        super(x24VarArr);
        x24 x24Var;
        Integer f;
        this.F = l14Var;
        int i = 0;
        int i2 = 0;
        while (i < x24VarArr.length) {
            x24 x24Var2 = x24VarArr[i];
            Integer f2 = x24Var2.f();
            if (f2 != null) {
                this.z = g24.b(f2.intValue() + i2);
                do {
                    i++;
                    if (i >= x24VarArr.length) {
                        return;
                    }
                    x24Var = x24VarArr[i];
                    f = x24Var.f();
                    if (f == null) {
                        break;
                    }
                } while (f.intValue() == 0);
                throw new u14(x24VarArr[i - 1], x24Var, f);
            }
            i2 += x24Var2.A0();
            i++;
        }
        this.z = g24.t;
    }

    @Override // com.p7700g.p99005.g24, com.p7700g.p99005.l24
    public boolean B3(int i) {
        return g24.e(this, i);
    }

    @Override // com.p7700g.p99005.g24
    public boolean G(g24 g24Var) {
        return (g24Var instanceof y24) && super.G(g24Var);
    }

    @Override // com.p7700g.p99005.r24
    public Integer K3() {
        Integer num = this.z;
        if (num == null) {
            Integer c = g24.c(this);
            if (c != null) {
                this.z = c;
                return c;
            }
            this.z = g24.t;
            return null;
        } else if (num.intValue() == g24.t.intValue()) {
            return null;
        } else {
            return num;
        }
    }

    @Override // com.p7700g.p99005.g24, com.p7700g.p99005.i24
    public Integer L0() {
        return K3();
    }

    @Override // com.p7700g.p99005.g24
    /* renamed from: P */
    public x24 t(int i) {
        return (x24) super.e0(i);
    }

    @Override // com.p7700g.p99005.g24, com.p7700g.p99005.l24
    public Integer X3() {
        return g24.A(this);
    }

    @Override // com.p7700g.p99005.g24, com.p7700g.p99005.l24
    public boolean Y2(int i) throws y14 {
        return g24.f(this, i);
    }

    @Override // com.p7700g.p99005.g24
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof y24) {
            return ((y24) obj).G(this);
        }
        return false;
    }

    @Override // com.p7700g.p99005.g24
    public byte[] m(boolean z) {
        int A0 = (A0() + 7) >> 3;
        byte[] bArr = new byte[A0];
        int i = A0 - 1;
        int i2 = 8;
        for (int p1 = p1() - 1; p1 >= 0; p1--) {
            x24 t = t(p1);
            BigInteger value = z ? t.getValue() : t.C1();
            int A02 = t.A0();
            while (true) {
                if (A02 > 0) {
                    bArr[i] = (byte) (value.shiftLeft(8 - i2).byteValue() | bArr[i]);
                    value = value.shiftRight(i2);
                    if (A02 < i2) {
                        i2 -= A02;
                        break;
                    }
                    A02 -= i2;
                    i--;
                    i2 = 8;
                }
            }
        }
        return bArr;
    }

    @Override // com.p7700g.p99005.o34, com.p7700g.p99005.p14, com.p7700g.p99005.q04
    public l14<?, ?, ?, ?, ?> m0() {
        return this.F;
    }
}