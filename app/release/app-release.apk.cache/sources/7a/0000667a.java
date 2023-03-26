package com.p7700g.p99005;

import android.graphics.drawable.Drawable;

/* compiled from: DrawableCrossFadeFactory.java */
/* loaded from: classes2.dex */
public class xz1 implements b02<Drawable> {
    private final int a;
    private final boolean b;
    private yz1 c;

    /* compiled from: DrawableCrossFadeFactory.java */
    /* loaded from: classes2.dex */
    public static class a {
        private static final int a = 300;
        private final int b;
        private boolean c;

        public a() {
            this(a);
        }

        public xz1 a() {
            return new xz1(this.b, this.c);
        }

        public a b(boolean z) {
            this.c = z;
            return this;
        }

        public a(int i) {
            this.b = i;
        }
    }

    public xz1(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    private a02<Drawable> b() {
        if (this.c == null) {
            this.c = new yz1(this.a, this.b);
        }
        return this.c;
    }

    @Override // com.p7700g.p99005.b02
    public a02<Drawable> a(aq1 aq1Var, boolean z) {
        if (aq1Var == aq1.MEMORY_CACHE) {
            return zz1.b();
        }
        return b();
    }
}