package com.p7700g.p99005;

/* compiled from: Mask.java */
/* loaded from: classes.dex */
public class ul0 {
    private final a a;
    private final fl0 b;
    private final bl0 c;
    private final boolean d;

    /* compiled from: Mask.java */
    /* loaded from: classes.dex */
    public enum a {
        MASK_MODE_ADD,
        MASK_MODE_SUBTRACT,
        MASK_MODE_INTERSECT,
        MASK_MODE_NONE
    }

    public ul0(a aVar, fl0 fl0Var, bl0 bl0Var, boolean z) {
        this.a = aVar;
        this.b = fl0Var;
        this.c = bl0Var;
        this.d = z;
    }

    public a a() {
        return this.a;
    }

    public fl0 b() {
        return this.b;
    }

    public bl0 c() {
        return this.c;
    }

    public boolean d() {
        return this.d;
    }
}