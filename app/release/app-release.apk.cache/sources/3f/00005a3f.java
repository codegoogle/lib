package com.p7700g.p99005;

import android.graphics.Path;

/* compiled from: GradientFill.java */
/* loaded from: classes.dex */
public class rl0 implements pl0 {
    private final tl0 a;
    private final Path.FillType b;
    private final al0 c;
    private final bl0 d;
    private final dl0 e;
    private final dl0 f;
    private final String g;
    @z1
    private final zk0 h;
    @z1
    private final zk0 i;
    private final boolean j;

    public rl0(String str, tl0 tl0Var, Path.FillType fillType, al0 al0Var, bl0 bl0Var, dl0 dl0Var, dl0 dl0Var2, zk0 zk0Var, zk0 zk0Var2, boolean z) {
        this.a = tl0Var;
        this.b = fillType;
        this.c = al0Var;
        this.d = bl0Var;
        this.e = dl0Var;
        this.f = dl0Var2;
        this.g = str;
        this.h = zk0Var;
        this.i = zk0Var2;
        this.j = z;
    }

    @Override // com.p7700g.p99005.pl0
    public yi0 a(hi0 hi0Var, im0 im0Var) {
        return new dj0(hi0Var, im0Var, this);
    }

    public dl0 b() {
        return this.f;
    }

    public Path.FillType c() {
        return this.b;
    }

    public al0 d() {
        return this.c;
    }

    public tl0 e() {
        return this.a;
    }

    public String f() {
        return this.g;
    }

    public bl0 g() {
        return this.d;
    }

    public dl0 h() {
        return this.e;
    }

    public boolean i() {
        return this.j;
    }
}