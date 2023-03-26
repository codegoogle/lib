package com.p7700g.p99005;

/* compiled from: GradientColor.java */
/* loaded from: classes.dex */
public class ql0 {
    private final float[] a;
    private final int[] b;

    public ql0(float[] fArr, int[] iArr) {
        this.a = fArr;
        this.b = iArr;
    }

    public int[] a() {
        return this.b;
    }

    public float[] b() {
        return this.a;
    }

    public int c() {
        return this.b.length;
    }

    public void d(ql0 ql0Var, ql0 ql0Var2, float f) {
        if (ql0Var.b.length == ql0Var2.b.length) {
            for (int i = 0; i < ql0Var.b.length; i++) {
                this.a[i] = bp0.k(ql0Var.a[i], ql0Var2.a[i], f);
                this.b[i] = wo0.c(f, ql0Var.b[i], ql0Var2.b[i]);
            }
            return;
        }
        StringBuilder G = wo1.G("Cannot interpolate between gradients. Lengths vary (");
        G.append(ql0Var.b.length);
        G.append(" vs ");
        throw new IllegalArgumentException(wo1.z(G, ql0Var2.b.length, ")"));
    }
}