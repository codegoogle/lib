package com.p7700g.p99005;

import android.os.Parcelable;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: S2CController.java */
/* loaded from: classes2.dex */
public class wd1 implements jn1, yd1 {
    private final kj1 s = kj1.b("S2CController");
    private final xd1 t = new xd1();
    private final List<yd1> u = new CopyOnWriteArrayList();
    private final AtomicBoolean v = new AtomicBoolean();
    @x1
    private final hn1 w;

    public wd1(@x1 hn1 hn1Var) {
        this.w = hn1Var;
    }

    @Override // com.p7700g.p99005.jn1
    public /* synthetic */ void a(long j, long j2) {
        in1.a(this, j, j2);
    }

    @Override // com.p7700g.p99005.jn1
    public /* synthetic */ void b(Parcelable parcelable) {
        in1.b(this, parcelable);
    }

    public void c(@x1 yd1 yd1Var) {
        this.u.add(yd1Var);
    }

    public void d() {
        if (this.v.get()) {
            return;
        }
        synchronized (this.v) {
            if (!this.v.get()) {
                this.v.set(true);
                this.w.k(this);
                this.t.f(this);
            }
        }
    }

    public void e(@x1 yd1 yd1Var) {
        this.u.remove(yd1Var);
    }

    @Override // com.p7700g.p99005.yd1
    public void f(@x1 String str) {
        for (yd1 yd1Var : this.u) {
            yd1Var.f(str);
        }
    }

    @Override // com.p7700g.p99005.jn1
    public void h() {
        this.t.g();
    }

    @Override // com.p7700g.p99005.jn1
    public void i(@x1 kc1 kc1Var) {
        String message = kc1Var.getMessage();
        if (message != null) {
            this.s.e(message, new Object[0]);
        }
        this.t.h();
    }
}