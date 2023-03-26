package com.p7700g.p99005;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.EdgeEffect;

/* compiled from: EdgeEffectCompat.java */
/* loaded from: classes.dex */
public final class ft {
    private final EdgeEffect a;

    /* compiled from: EdgeEffectCompat.java */
    @e2(21)
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        @e1
        public static void a(EdgeEffect edgeEffect, float f, float f2) {
            edgeEffect.onPull(f, f2);
        }
    }

    /* compiled from: EdgeEffectCompat.java */
    @e2(31)
    /* loaded from: classes.dex */
    public static class b {
        private b() {
        }

        @e1
        public static EdgeEffect a(Context context, AttributeSet attributeSet) {
            try {
                return new EdgeEffect(context, attributeSet);
            } catch (Throwable unused) {
                return new EdgeEffect(context);
            }
        }

        @e1
        public static float b(EdgeEffect edgeEffect) {
            try {
                return edgeEffect.getDistance();
            } catch (Throwable unused) {
                return 0.0f;
            }
        }

        @e1
        public static float c(EdgeEffect edgeEffect, float f, float f2) {
            try {
                return edgeEffect.onPullDistance(f, f2);
            } catch (Throwable unused) {
                edgeEffect.onPull(f, f2);
                return 0.0f;
            }
        }
    }

    @Deprecated
    public ft(Context context) {
        this.a = new EdgeEffect(context);
    }

    @x1
    public static EdgeEffect a(@x1 Context context, @z1 AttributeSet attributeSet) {
        if (Build.VERSION.SDK_INT >= 31) {
            return b.a(context, attributeSet);
        }
        return new EdgeEffect(context);
    }

    public static float d(@x1 EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return b.b(edgeEffect);
        }
        return 0.0f;
    }

    public static void g(@x1 EdgeEffect edgeEffect, float f, float f2) {
        a.a(edgeEffect, f, f2);
    }

    public static float j(@x1 EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return b.c(edgeEffect, f, f2);
        }
        g(edgeEffect, f, f2);
        return f;
    }

    @Deprecated
    public boolean b(Canvas canvas) {
        return this.a.draw(canvas);
    }

    @Deprecated
    public void c() {
        this.a.finish();
    }

    @Deprecated
    public boolean e() {
        return this.a.isFinished();
    }

    @Deprecated
    public boolean f(int i) {
        this.a.onAbsorb(i);
        return true;
    }

    @Deprecated
    public boolean h(float f) {
        this.a.onPull(f);
        return true;
    }

    @Deprecated
    public boolean i(float f, float f2) {
        g(this.a, f, f2);
        return true;
    }

    @Deprecated
    public boolean k() {
        this.a.onRelease();
        return this.a.isFinished();
    }

    @Deprecated
    public void l(int i, int i2) {
        this.a.setSize(i, i2);
    }
}