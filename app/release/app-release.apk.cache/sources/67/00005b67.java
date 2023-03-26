package com.p7700g.p99005;

import com.p7700g.p99005.n04;
import com.p7700g.p99005.o64;
import com.p7700g.p99005.v04;
import com.p7700g.p99005.x04;
import java.io.Serializable;

/* compiled from: ParsedAddressCreator.java */
/* loaded from: classes3.dex */
public abstract class s64<T extends n04, R extends v04, E extends v04, S extends x04> implements Serializable {
    private static final long s = 4;

    public R A(S[] sArr, E e, Integer num, boolean z) {
        return t(sArr, num, z);
    }

    public abstract S B(int i, int i2, Integer num, CharSequence charSequence, int i3, int i4, boolean z, boolean z2, int i5, int i6, int i7);

    public abstract S D(int i, Integer num, CharSequence charSequence, int i2, boolean z, int i3, int i4);

    public abstract int E();

    public void G(boolean z) {
    }

    public abstract S c(int i, int i2, Integer num);

    public abstract S[] d(int i);

    public void f() {
        int i = 0;
        while (true) {
            o64.k[][] kVarArr = z64.A;
            if (i >= kVarArr.length) {
                return;
            }
            kVarArr[i] = null;
            i++;
        }
    }

    public abstract T g(R r, e14 e14Var);

    public abstract T h(R r, CharSequence charSequence, e14 e14Var);

    public abstract T i(R r, CharSequence charSequence, e14 e14Var, T t, T t2);

    public abstract T m(byte[] bArr, CharSequence charSequence);

    public T n(S[] sArr, e14 e14Var, Integer num) {
        return g(p(sArr, num), e14Var);
    }

    public T o(S[] sArr, CharSequence charSequence, e14 e14Var, Integer num) {
        return h(p(sArr, num), charSequence, e14Var);
    }

    public abstract R p(S[] sArr, Integer num);

    public abstract R t(S[] sArr, Integer num, boolean z);

    public abstract R u(S[] sArr);

    public R x(S[] sArr, E e) {
        return u(sArr);
    }

    public R y(S[] sArr, E e, Integer num) {
        return p(sArr, num);
    }
}