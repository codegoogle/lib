package com.p7700g.p99005;

import com.p7700g.p99005.e02;
import com.p7700g.p99005.kp1;

/* compiled from: TransitionOptions.java */
/* loaded from: classes2.dex */
public abstract class kp1<CHILD extends kp1<CHILD, TranscodeType>, TranscodeType> implements Cloneable {
    private b02<? super TranscodeType> s = zz1.c();

    private CHILD d() {
        return this;
    }

    /* renamed from: a */
    public final CHILD clone() {
        try {
            return (CHILD) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @x1
    public final CHILD b() {
        return f(zz1.c());
    }

    public final b02<? super TranscodeType> c() {
        return this.s;
    }

    @x1
    public final CHILD e(int i) {
        return f(new c02(i));
    }

    @x1
    public final CHILD f(@x1 b02<? super TranscodeType> b02Var) {
        this.s = (b02) x02.d(b02Var);
        return d();
    }

    @x1
    public final CHILD g(@x1 e02.a aVar) {
        return f(new d02(aVar));
    }
}