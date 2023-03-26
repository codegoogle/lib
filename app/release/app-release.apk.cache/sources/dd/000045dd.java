package com.p7700g.p99005;

import com.p7700g.p99005.l54;
import com.p7700g.p99005.o34;

/* compiled from: IPAddressPartConfiguredString.java */
/* loaded from: classes3.dex */
public class h54<T extends o34, P extends l54<T>> {
    public final T a;
    public final P b;
    public String c;

    public h54(T t, P p) {
        this.b = p;
        this.a = t;
    }

    public <S extends h54<T, P>> r54<T, P, S> a(boolean z, p54 p54Var) {
        return new r54<>(this, z, p54Var);
    }

    public String b() {
        if (this.c == null) {
            this.c = this.b.n(this.a);
        }
        return this.c;
    }

    public char c() {
        return this.b.a();
    }

    public int d() {
        return this.b.i(this.a);
    }

    public String toString() {
        return b();
    }
}