package com.p7700g.p99005;

import android.animation.TypeEvaluator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.Property;
import com.p7700g.p99005.sb2;

/* compiled from: CircularRevealWidget.java */
/* loaded from: classes.dex */
public interface vb2 extends sb2.a {

    /* compiled from: CircularRevealWidget.java */
    /* loaded from: classes.dex */
    public static class b implements TypeEvaluator<e> {
        public static final TypeEvaluator<e> a = new b();
        private final e b = new e();

        @Override // android.animation.TypeEvaluator
        @x1
        /* renamed from: a */
        public e evaluate(float f, @x1 e eVar, @x1 e eVar2) {
            this.b.b(nf2.f(eVar.b, eVar2.b, f), nf2.f(eVar.c, eVar2.c, f), nf2.f(eVar.d, eVar2.d, f));
            return this.b;
        }
    }

    /* compiled from: CircularRevealWidget.java */
    /* loaded from: classes.dex */
    public static class c extends Property<vb2, e> {
        public static final Property<vb2, e> a = new c("circularReveal");

        private c(String str) {
            super(e.class, str);
        }

        @Override // android.util.Property
        @z1
        /* renamed from: a */
        public e get(@x1 vb2 vb2Var) {
            return vb2Var.getRevealInfo();
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(@x1 vb2 vb2Var, @z1 e eVar) {
            vb2Var.setRevealInfo(eVar);
        }
    }

    /* compiled from: CircularRevealWidget.java */
    /* loaded from: classes.dex */
    public static class d extends Property<vb2, Integer> {
        public static final Property<vb2, Integer> a = new d("circularRevealScrimColor");

        private d(String str) {
            super(Integer.class, str);
        }

        @Override // android.util.Property
        @x1
        /* renamed from: a */
        public Integer get(@x1 vb2 vb2Var) {
            return Integer.valueOf(vb2Var.getCircularRevealScrimColor());
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(@x1 vb2 vb2Var, @x1 Integer num) {
            vb2Var.setCircularRevealScrimColor(num.intValue());
        }
    }

    /* compiled from: CircularRevealWidget.java */
    /* loaded from: classes.dex */
    public static class e {
        public static final float a = Float.MAX_VALUE;
        public float b;
        public float c;
        public float d;

        public boolean a() {
            return this.d == Float.MAX_VALUE;
        }

        public void b(float f, float f2, float f3) {
            this.b = f;
            this.c = f2;
            this.d = f3;
        }

        public void c(@x1 e eVar) {
            b(eVar.b, eVar.c, eVar.d);
        }

        private e() {
        }

        public e(float f, float f2, float f3) {
            this.b = f;
            this.c = f2;
            this.d = f3;
        }

        public e(@x1 e eVar) {
            this(eVar.b, eVar.c, eVar.d);
        }
    }

    void a();

    void b();

    void draw(Canvas canvas);

    @z1
    Drawable getCircularRevealOverlayDrawable();

    @w0
    int getCircularRevealScrimColor();

    @z1
    e getRevealInfo();

    boolean isOpaque();

    void setCircularRevealOverlayDrawable(@z1 Drawable drawable);

    void setCircularRevealScrimColor(@w0 int i);

    void setRevealInfo(@z1 e eVar);
}