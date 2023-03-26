package com.p7700g.p99005;

/* compiled from: RotatorApiCallback.java */
/* loaded from: classes.dex */
public class ar0 implements hr0<mr0> {
    @x1
    private final br0 b;
    @x1
    private final hr0<mr0> c;
    @x1
    private final String d;

    public ar0(@x1 br0 br0Var, @x1 hr0<mr0> hr0Var, @x1 String str) {
        this.b = br0Var;
        this.c = hr0Var;
        this.d = str;
    }

    @Override // com.p7700g.p99005.hr0
    public void a(@x1 au0 au0Var) {
        this.b.a(this.d, au0Var);
        this.c.a(au0Var);
    }

    @Override // com.p7700g.p99005.hr0
    /* renamed from: c */
    public void b(@x1 dr0 dr0Var, @x1 mr0 mr0Var) {
        this.b.b(this.d);
        this.c.b(dr0Var, mr0Var);
    }
}