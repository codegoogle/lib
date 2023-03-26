package com.anythink.expressad.video.dynview.endcard.cloudview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class c {
    private static final int c = 3;
    private static final float[] d = {0.886f, 0.725f, 0.188f, 1.0f};
    private static final float[] e = {0.3f, 0.3f, 0.3f, 1.0f};
    private List<a> a;
    private int b;
    private float[] f;
    private float[] g;
    private float h;
    private float i;
    private float j;
    private float k;
    private float l;
    private float m;
    private float n;
    private float o;
    private float p;
    private int q;
    private int r;
    private boolean s;
    private float t;
    private float u;

    public c() {
        this((byte) 0);
    }

    private void e() {
        float f;
        float f2;
        for (int i = 0; i < this.a.size(); i++) {
            try {
                a aVar = this.a.get(i);
                float a = aVar.a();
                float b = aVar.b();
                float c2 = aVar.c();
                float f3 = this.i;
                float f4 = this.h;
                float f5 = ((-f4) * c2) + (b * f3);
                float f6 = (c2 * f3) + (b * f4);
                float f7 = this.k;
                float f8 = this.j;
                float f9 = (f6 * f8) + (a * f7);
                float f10 = (f6 * f7) + (a * (-f8));
                float f11 = this.m;
                float f12 = this.l;
                float f13 = ((-f12) * f5) + (f9 * f11);
                aVar.a(f13);
                aVar.b((f5 * f11) + (f9 * f12));
                aVar.c(f10);
                float f14 = this.b * 2;
                float f15 = f14 / 1.0f;
                float f16 = f14 + f10;
                aVar.f((int) (f13 * f2));
                aVar.g((int) (f * f2));
                aVar.d(f15 / f16);
                this.t = Math.max(this.t, f16);
                float min = Math.min(this.u, f16);
                this.u = min;
                aVar.e(1.0f - ((f16 - min) / (this.t - min)));
            } catch (Exception e2) {
                e2.printStackTrace();
                return;
            }
        }
        Collections.sort(this.a);
    }

    private void f() {
        this.h = (float) Math.sin(this.o * 0.017453292519943295d);
        this.i = (float) Math.cos(this.o * 0.017453292519943295d);
        this.j = (float) Math.sin(this.p * 0.017453292519943295d);
        this.k = (float) Math.cos(this.p * 0.017453292519943295d);
        this.l = (float) Math.sin(this.n * 0.017453292519943295d);
        this.m = (float) Math.cos(this.n * 0.017453292519943295d);
    }

    private void g() {
        Collections.sort(this.a);
    }

    private void h() {
        for (int i = 0; i < this.a.size(); i++) {
            try {
                int f = this.a.get(i).f();
                this.r = Math.max(this.r, f);
                this.q = Math.min(this.q, f);
            } catch (Exception e2) {
                e2.printStackTrace();
                return;
            }
        }
        for (a aVar : this.a) {
            b(aVar);
        }
    }

    public final void a(boolean z) {
        double random;
        double random2;
        double d2;
        this.s = z;
        try {
            int size = this.a.size();
            for (int i = 1; i < size + 1; i++) {
                if (z) {
                    random = Math.acos((((i * 2.0d) - 1.0d) / d2) - 1.0d);
                    random2 = Math.sqrt(size * 3.141592653589793d) * random;
                } else {
                    random = Math.random() * 3.141592653589793d;
                    random2 = Math.random() * 6.283185307179586d;
                }
                int i2 = i - 1;
                this.a.get(i2).a((int) (this.b * Math.cos(random2) * Math.sin(random)));
                this.a.get(i2).b((int) (this.b * Math.sin(random2) * Math.sin(random)));
                this.a.get(i2).c((int) (this.b * Math.cos(random)));
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        for (int i3 = 0; i3 < this.a.size(); i3++) {
            try {
                int f = this.a.get(i3).f();
                this.r = Math.max(this.r, f);
                this.q = Math.min(this.q, f);
            } catch (Exception e3) {
                e3.printStackTrace();
            }
        }
        for (a aVar : this.a) {
            b(aVar);
        }
        f();
        e();
    }

    public final List<a> b() {
        return this.a;
    }

    public final void c() {
        a(this.s);
    }

    public final void d() {
        if (Math.abs(this.o) > 0.1f || Math.abs(this.p) > 0.1f) {
            f();
            e();
        }
    }

    private c(byte b) {
        this(new ArrayList(), (byte) 0);
    }

    private void b(a aVar) {
        aVar.a(a(c(aVar)));
    }

    private float c(a aVar) {
        int f = aVar.f();
        int i = this.q;
        int i2 = this.r;
        if (i == i2) {
            return 1.0f;
        }
        return (f - i) / (i2 - i);
    }

    private c(List<a> list) {
        this(list, (byte) 0);
    }

    private c(List<a> list, byte b) {
        this(list, d, e);
    }

    private void d(a aVar) {
        double random = Math.random() * 3.141592653589793d;
        double random2 = Math.random() * 6.283185307179586d;
        aVar.a((int) (Math.sin(random) * Math.cos(random2) * this.b));
        aVar.b((int) (Math.sin(random) * Math.sin(random2) * this.b));
        aVar.c((int) (Math.cos(random) * this.b));
    }

    private c(List<a> list, float[] fArr, float[] fArr2) {
        this.n = 0.0f;
        this.o = 0.0f;
        this.p = 0.0f;
        this.s = true;
        this.a = list;
        this.b = 3;
        this.f = fArr;
        this.g = fArr2;
    }

    private void b(boolean z) {
        double random;
        double random2;
        double d2;
        try {
            int size = this.a.size();
            for (int i = 1; i < size + 1; i++) {
                if (z) {
                    random = Math.acos((((i * 2.0d) - 1.0d) / d2) - 1.0d);
                    random2 = Math.sqrt(size * 3.141592653589793d) * random;
                } else {
                    random = Math.random() * 3.141592653589793d;
                    random2 = Math.random() * 6.283185307179586d;
                }
                int i2 = i - 1;
                this.a.get(i2).a((int) (this.b * Math.cos(random2) * Math.sin(random)));
                this.a.get(i2).b((int) (this.b * Math.sin(random2) * Math.sin(random)));
                this.a.get(i2).c((int) (this.b * Math.cos(random)));
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void b(int i) {
        this.b = i;
    }

    public final void b(float[] fArr) {
        this.g = fArr;
    }

    public final void a() {
        this.a.clear();
    }

    public final a a(int i) {
        return this.a.get(i);
    }

    public final void a(a aVar) {
        b(aVar);
        double random = Math.random() * 3.141592653589793d;
        double random2 = Math.random() * 6.283185307179586d;
        aVar.a((int) (Math.sin(random) * Math.cos(random2) * this.b));
        aVar.b((int) (Math.sin(random) * Math.sin(random2) * this.b));
        aVar.c((int) (Math.cos(random) * this.b));
        this.a.add(aVar);
        e();
    }

    private float[] a(float f) {
        float[] fArr = this.g;
        float f2 = 1.0f - f;
        float[] fArr2 = this.f;
        return new float[]{1.0f, (fArr2[0] * f2) + (fArr[0] * f), (fArr2[1] * f2) + (fArr[1] * f), (f2 * fArr2[2]) + (f * fArr[2])};
    }

    public final void a(float[] fArr) {
        this.f = fArr;
    }

    public final void a(float f, float f2) {
        this.o = f;
        this.p = f2;
    }
}