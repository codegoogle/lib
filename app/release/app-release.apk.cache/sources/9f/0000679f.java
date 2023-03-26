package com.p7700g.p99005;

/* compiled from: Repeater.java */
/* loaded from: classes.dex */
public class yl0 implements pl0 {
    private final String a;
    private final zk0 b;
    private final zk0 c;
    private final jl0 d;
    private final boolean e;

    public yl0(String str, zk0 zk0Var, zk0 zk0Var2, jl0 jl0Var, boolean z) {
        this.a = str;
        this.b = zk0Var;
        this.c = zk0Var2;
        this.d = jl0Var;
        this.e = z;
    }

    @Override // com.p7700g.p99005.pl0
    @z1
    public yi0 a(hi0 hi0Var, im0 im0Var) {
        return new mj0(hi0Var, im0Var, this);
    }

    public zk0 b() {
        return this.b;
    }

    public String c() {
        return this.a;
    }

    public zk0 d() {
        return this.c;
    }

    public jl0 e() {
        return this.d;
    }

    public boolean f() {
        return this.e;
    }
}