package com.p7700g.p99005;

import java.util.Arrays;
import java.util.List;

/* compiled from: ShapeGroup.java */
/* loaded from: classes.dex */
public class cm0 implements pl0 {
    private final String a;
    private final List<pl0> b;
    private final boolean c;

    public cm0(String str, List<pl0> list, boolean z) {
        this.a = str;
        this.b = list;
        this.c = z;
    }

    @Override // com.p7700g.p99005.pl0
    public yi0 a(hi0 hi0Var, im0 im0Var) {
        return new zi0(hi0Var, im0Var, this);
    }

    public List<pl0> b() {
        return this.b;
    }

    public String c() {
        return this.a;
    }

    public boolean d() {
        return this.c;
    }

    public String toString() {
        StringBuilder G = wo1.G("ShapeGroup{name='");
        G.append(this.a);
        G.append("' Shapes: ");
        G.append(Arrays.toString(this.b.toArray()));
        G.append('}');
        return G.toString();
    }
}