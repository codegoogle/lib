package com.p7700g.p99005;

import android.graphics.Color;
import android.graphics.Paint;
import com.p7700g.p99005.tj0;

/* compiled from: DropShadowKeyframeAnimation.java */
/* loaded from: classes.dex */
public class vj0 implements tj0.b {
    private static final double a = 0.017453292519943295d;
    private final tj0.b b;
    private final tj0<Integer, Integer> c;
    private final tj0<Float, Float> d;
    private final tj0<Float, Float> e;
    private final tj0<Float, Float> f;
    private final tj0<Float, Float> g;
    private boolean h = true;

    /* compiled from: DropShadowKeyframeAnimation.java */
    /* loaded from: classes.dex */
    public class a extends np0<Float> {
        public final /* synthetic */ np0 d;

        public a(np0 np0Var) {
            this.d = np0Var;
        }

        @Override // com.p7700g.p99005.np0
        @z1
        /* renamed from: e */
        public Float a(fp0<Float> fp0Var) {
            Float f = (Float) this.d.a(fp0Var);
            if (f == null) {
                return null;
            }
            return Float.valueOf(f.floatValue() * 2.55f);
        }
    }

    public vj0(tj0.b bVar, im0 im0Var, in0 in0Var) {
        this.b = bVar;
        tj0<Integer, Integer> a2 = in0Var.a().a();
        this.c = a2;
        a2.a(this);
        im0Var.f(a2);
        tj0<Float, Float> a3 = in0Var.d().a();
        this.d = a3;
        a3.a(this);
        im0Var.f(a3);
        tj0<Float, Float> a4 = in0Var.b().a();
        this.e = a4;
        a4.a(this);
        im0Var.f(a4);
        tj0<Float, Float> a5 = in0Var.c().a();
        this.f = a5;
        a5.a(this);
        im0Var.f(a5);
        tj0<Float, Float> a6 = in0Var.e().a();
        this.g = a6;
        a6.a(this);
        im0Var.f(a6);
    }

    @Override // com.p7700g.p99005.tj0.b
    public void a() {
        this.h = true;
        this.b.a();
    }

    public void b(Paint paint) {
        if (this.h) {
            this.h = false;
            double floatValue = this.e.h().floatValue() * a;
            float floatValue2 = this.f.h().floatValue();
            float sin = ((float) Math.sin(floatValue)) * floatValue2;
            float cos = ((float) Math.cos(floatValue + 3.141592653589793d)) * floatValue2;
            int intValue = this.c.h().intValue();
            paint.setShadowLayer(this.g.h().floatValue(), sin, cos, Color.argb(Math.round(this.d.h().floatValue()), Color.red(intValue), Color.green(intValue), Color.blue(intValue)));
        }
    }

    public void c(@z1 np0<Integer> np0Var) {
        this.c.n(np0Var);
    }

    public void d(@z1 np0<Float> np0Var) {
        this.e.n(np0Var);
    }

    public void e(@z1 np0<Float> np0Var) {
        this.f.n(np0Var);
    }

    public void f(@z1 np0<Float> np0Var) {
        if (np0Var == null) {
            this.d.n(null);
        } else {
            this.d.n(new a(np0Var));
        }
    }

    public void g(@z1 np0<Float> np0Var) {
        this.g.n(np0Var);
    }
}