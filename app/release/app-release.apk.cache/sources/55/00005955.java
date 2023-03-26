package com.p7700g.p99005;

import android.os.Bundle;
import com.p7700g.p99005.a21;
import java.util.Objects;
import java.util.concurrent.Callable;

/* compiled from: RemoteVpnBolts.java */
/* loaded from: classes.dex */
public class r41 {
    @x1
    public final ui1 a;

    public r41(@x1 ui1 ui1Var) {
        this.a = ui1Var;
    }

    @x1
    public dq0<Void> a() {
        a21.b bVar = new a21.b();
        this.a.a(bVar);
        return bVar.b();
    }

    @x1
    public dq0<lm1> b() {
        a21.a aVar = new a21.a();
        this.a.C(aVar);
        return aVar.c();
    }

    @x1
    public dq0<fo1> c() {
        a21.a aVar = new a21.a();
        this.a.D(aVar);
        return aVar.c();
    }

    @x1
    public dq0<String> d() {
        a21.a aVar = new a21.a();
        this.a.E(aVar);
        return aVar.c();
    }

    @x1
    public dq0<Long> e() {
        a21.a aVar = new a21.a();
        this.a.I(aVar);
        return aVar.c();
    }

    @x1
    public dq0<en1> f() {
        a21.a aVar = new a21.a();
        this.a.K(aVar);
        return aVar.c();
    }

    @x1
    public dq0<bn1> g() {
        a21.a aVar = new a21.a();
        this.a.M(aVar);
        return aVar.c();
    }

    @x1
    public dq0<td1> h() {
        final ui1 ui1Var = this.a;
        Objects.requireNonNull(ui1Var);
        return dq0.g(new Callable() { // from class: com.p7700g.p99005.v11
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ui1.this.N();
            }
        });
    }

    @x1
    public dq0<Void> i(@x1 String str, @x1 String str2, @x1 co1 co1Var, @x1 Bundle bundle) {
        a21.b bVar = new a21.b();
        this.a.i1(str, str2, co1Var, bundle, bVar);
        return bVar.b();
    }

    @x1
    public dq0<Void> j(@x1 String str, @x1 String str2) {
        a21.b bVar = new a21.b();
        this.a.m1(str, str2, bVar);
        return bVar.b();
    }

    @x1
    public dq0<Void> k(@x1 String str, @x1 String str2, @x1 co1 co1Var, @x1 Bundle bundle) {
        a21.b bVar = new a21.b();
        this.a.o1(str, str2, co1Var, bundle, bVar);
        return bVar.b();
    }

    public dq0<Void> l(@x1 String str) {
        a21.b bVar = new a21.b();
        this.a.p1(str, bVar);
        return bVar.b();
    }

    @x1
    public dq0<Void> m(int i, @x1 Bundle bundle) {
        a21.b bVar = new a21.b();
        this.a.r1(i, bundle, bVar);
        return bVar.b();
    }

    @x1
    public dq0<Void> n(@x1 String str, @x1 String str2, @x1 Bundle bundle) {
        a21.b bVar = new a21.b();
        this.a.s1(str, str2, bundle, bVar);
        return bVar.b();
    }
}