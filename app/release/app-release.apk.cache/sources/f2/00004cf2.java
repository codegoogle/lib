package com.p7700g.p99005;

import android.os.Parcelable;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: VpnTransportThreadWrapCallback.java */
/* loaded from: classes2.dex */
public class kn1 implements jn1 {
    @x1
    private final jn1 s;
    @x1
    private final Executor t;

    public kn1(@x1 jn1 jn1Var, @x1 Executor executor) {
        this.s = jn1Var;
        this.t = executor;
    }

    private /* synthetic */ void c(long j, long j2) {
        this.s.a(j, j2);
    }

    private /* synthetic */ void e(Parcelable parcelable) {
        this.s.b(parcelable);
    }

    private /* synthetic */ void g(kc1 kc1Var) {
        this.s.i(kc1Var);
    }

    @Override // com.p7700g.p99005.jn1
    public void a(final long j, final long j2) {
        this.t.execute(new Runnable() { // from class: com.p7700g.p99005.dm1
            @Override // java.lang.Runnable
            public final void run() {
                kn1.this.d(j, j2);
            }
        });
    }

    @Override // com.p7700g.p99005.jn1
    public void b(@x1 final Parcelable parcelable) {
        this.t.execute(new Runnable() { // from class: com.p7700g.p99005.em1
            @Override // java.lang.Runnable
            public final void run() {
                kn1.this.f(parcelable);
            }
        });
    }

    public /* synthetic */ void d(long j, long j2) {
        this.s.a(j, j2);
    }

    public /* synthetic */ void f(Parcelable parcelable) {
        this.s.b(parcelable);
    }

    @Override // com.p7700g.p99005.jn1
    public void h() {
        Executor executor = this.t;
        final jn1 jn1Var = this.s;
        Objects.requireNonNull(jn1Var);
        executor.execute(new Runnable() { // from class: com.p7700g.p99005.sk1
            @Override // java.lang.Runnable
            public final void run() {
                jn1.this.h();
            }
        });
    }

    @Override // com.p7700g.p99005.jn1
    public void i(@x1 final kc1 kc1Var) {
        this.t.execute(new Runnable() { // from class: com.p7700g.p99005.fm1
            @Override // java.lang.Runnable
            public final void run() {
                kn1.this.j(kc1Var);
            }
        });
    }

    public /* synthetic */ void j(kc1 kc1Var) {
        this.s.i(kc1Var);
    }
}