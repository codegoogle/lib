package com.p7700g.p99005;

import android.graphics.Path;

/* compiled from: ShapeFill.java */
/* loaded from: classes.dex */
public class bm0 implements pl0 {
    private final boolean a;
    private final Path.FillType b;
    private final String c;
    @z1
    private final yk0 d;
    @z1
    private final bl0 e;
    private final boolean f;

    public bm0(String str, boolean z, Path.FillType fillType, @z1 yk0 yk0Var, @z1 bl0 bl0Var, boolean z2) {
        this.c = str;
        this.a = z;
        this.b = fillType;
        this.d = yk0Var;
        this.e = bl0Var;
        this.f = z2;
    }

    @Override // com.p7700g.p99005.pl0
    public yi0 a(hi0 hi0Var, im0 im0Var) {
        return new cj0(hi0Var, im0Var, this);
    }

    @z1
    public yk0 b() {
        return this.d;
    }

    public Path.FillType c() {
        return this.b;
    }

    public String d() {
        return this.c;
    }

    @z1
    public bl0 e() {
        return this.e;
    }

    public boolean f() {
        return this.f;
    }

    public String toString() {
        StringBuilder G = wo1.G("ShapeFill{color=, fillEnabled=");
        G.append(this.a);
        G.append('}');
        return G.toString();
    }
}