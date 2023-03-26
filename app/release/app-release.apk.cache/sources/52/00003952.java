package com.p7700g.p99005;

/* compiled from: MeanCalculator.java */
/* loaded from: classes.dex */
public class ap0 {
    private float a;
    private int b;

    public void a(float f) {
        float f2 = this.a + f;
        this.a = f2;
        int i = this.b + 1;
        this.b = i;
        if (i == Integer.MAX_VALUE) {
            this.a = f2 / 2.0f;
            this.b = i / 2;
        }
    }

    public float b() {
        int i = this.b;
        if (i == 0) {
            return 0.0f;
        }
        return this.a / i;
    }
}