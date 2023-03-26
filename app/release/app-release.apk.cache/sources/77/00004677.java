package com.p7700g.p99005;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.p7700g.p99005.ag2;

/* compiled from: DrawingDelegate.java */
/* loaded from: classes3.dex */
public abstract class hg2<S extends ag2> {
    public S a;
    public gg2 b;

    public hg2(S s) {
        this.a = s;
    }

    public abstract void a(@x1 Canvas canvas, @g1(from = 0.0d, to = 1.0d) float f);

    public abstract void b(@x1 Canvas canvas, @x1 Paint paint, @g1(from = 0.0d, to = 1.0d) float f, @g1(from = 0.0d, to = 1.0d) float f2, @w0 int i);

    public abstract void c(@x1 Canvas canvas, @x1 Paint paint);

    public abstract int d();

    public abstract int e();

    public void f(@x1 gg2 gg2Var) {
        this.b = gg2Var;
    }

    public void g(@x1 Canvas canvas, @g1(from = 0.0d, to = 1.0d) float f) {
        this.a.e();
        a(canvas, f);
    }
}