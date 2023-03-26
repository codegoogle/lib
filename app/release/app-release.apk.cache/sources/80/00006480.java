package com.p7700g.p99005;

import java.io.IOException;
import pl.droidsonroids.gif.GifInfoHandle;

/* compiled from: GifTexImage2D.java */
/* loaded from: classes4.dex */
public class wx5 {
    private final GifInfoHandle a;

    public wx5(by5 by5Var, @z1 ux5 ux5Var) throws IOException {
        ux5Var = ux5Var == null ? new ux5() : ux5Var;
        GifInfoHandle c = by5Var.c();
        this.a = c;
        c.K(ux5Var.a, ux5Var.b);
        c.t();
    }

    public int a() {
        return this.a.d();
    }

    public int b() {
        return this.a.g();
    }

    public int c(@p1(from = 0) int i) {
        return this.a.h(i);
    }

    public int d() {
        return this.a.i();
    }

    public int e() {
        return this.a.n();
    }

    public int f() {
        return this.a.q();
    }

    public final void finalize() throws Throwable {
        try {
            i();
        } finally {
            super.finalize();
        }
    }

    public void g(int i, int i2) {
        this.a.r(i, i2);
    }

    public void h(int i, int i2) {
        this.a.s(i, i2);
    }

    public void i() {
        GifInfoHandle gifInfoHandle = this.a;
        if (gifInfoHandle != null) {
            gifInfoHandle.A();
        }
    }

    public void j(@p1(from = 0) int i) {
        this.a.H(i);
    }

    public void k(@g1(from = 0.0d, fromInclusive = false) float f) {
        this.a.L(f);
    }

    public void l() {
        this.a.M();
    }

    public void m() {
        this.a.N();
    }
}