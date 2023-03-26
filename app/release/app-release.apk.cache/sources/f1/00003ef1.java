package com.p7700g.p99005;

/* compiled from: ShapePath.java */
/* loaded from: classes.dex */
public class dm0 implements pl0 {
    private final String a;
    private final int b;
    private final fl0 c;
    private final boolean d;

    public dm0(String str, int i, fl0 fl0Var, boolean z) {
        this.a = str;
        this.b = i;
        this.c = fl0Var;
        this.d = z;
    }

    @Override // com.p7700g.p99005.pl0
    public yi0 a(hi0 hi0Var, im0 im0Var) {
        return new oj0(hi0Var, im0Var, this);
    }

    public String b() {
        return this.a;
    }

    public fl0 c() {
        return this.c;
    }

    public boolean d() {
        return this.d;
    }

    public String toString() {
        StringBuilder G = wo1.G("ShapePath{name=");
        G.append(this.a);
        G.append(", index=");
        return wo1.y(G, this.b, '}');
    }
}