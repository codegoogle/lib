package com.p7700g.p99005;

import android.graphics.PointF;
import com.p7700g.p99005.tj0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: RoundedCornersContent.java */
/* loaded from: classes.dex */
public class nj0 implements pj0, tj0.b {
    private static final float a = 0.5519f;
    private final hi0 b;
    private final String c;
    private final tj0<Float, Float> d;
    @z1
    private am0 e;

    public nj0(hi0 hi0Var, im0 im0Var, zl0 zl0Var) {
        this.b = hi0Var;
        this.c = zl0Var.c();
        tj0<Float, Float> a2 = zl0Var.b().a();
        this.d = a2;
        im0Var.f(a2);
        a2.a(this);
    }

    private static int c(int i, int i2) {
        int i3 = i / i2;
        return ((i ^ i2) >= 0 || i2 * i3 == i) ? i3 : i3 - 1;
    }

    private static int f(int i, int i2) {
        return i - (c(i, i2) * i2);
    }

    @x1
    private am0 i(am0 am0Var) {
        List<pk0> a2 = am0Var.a();
        boolean d = am0Var.d();
        int size = a2.size() - 1;
        int i = 0;
        while (size >= 0) {
            pk0 pk0Var = a2.get(size);
            pk0 pk0Var2 = a2.get(f(size - 1, a2.size()));
            PointF c = (size != 0 || d) ? pk0Var2.c() : am0Var.b();
            i = (((size != 0 || d) ? pk0Var2.b() : c).equals(c) && pk0Var.a().equals(c) && !(!am0Var.d() && size == 0 && size == a2.size() - 1)) ? i + 2 : i + 1;
            size--;
        }
        am0 am0Var2 = this.e;
        if (am0Var2 == null || am0Var2.a().size() != i) {
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(new pk0());
            }
            this.e = new am0(new PointF(0.0f, 0.0f), false, arrayList);
        }
        this.e.e(d);
        return this.e;
    }

    @Override // com.p7700g.p99005.tj0.b
    public void a() {
        this.b.invalidateSelf();
    }

    @Override // com.p7700g.p99005.yi0
    public void b(List<yi0> list, List<yi0> list2) {
    }

    @Override // com.p7700g.p99005.pj0
    public am0 d(am0 am0Var) {
        List<pk0> list;
        List<pk0> a2 = am0Var.a();
        if (a2.size() <= 2) {
            return am0Var;
        }
        float floatValue = this.d.h().floatValue();
        if (floatValue == 0.0f) {
            return am0Var;
        }
        am0 i = i(am0Var);
        i.f(am0Var.b().x, am0Var.b().y);
        List<pk0> a3 = i.a();
        boolean d = am0Var.d();
        int i2 = 0;
        int i3 = 0;
        while (i2 < a2.size()) {
            pk0 pk0Var = a2.get(i2);
            pk0 pk0Var2 = a2.get(f(i2 - 1, a2.size()));
            pk0 pk0Var3 = a2.get(f(i2 - 2, a2.size()));
            PointF c = (i2 != 0 || d) ? pk0Var2.c() : am0Var.b();
            PointF b = (i2 != 0 || d) ? pk0Var2.b() : c;
            PointF a4 = pk0Var.a();
            PointF c2 = pk0Var3.c();
            PointF c3 = pk0Var.c();
            boolean z = !am0Var.d() && i2 == 0 && i2 == a2.size() + (-1);
            if (b.equals(c) && a4.equals(c) && !z) {
                float f = c.x;
                float f2 = f - c2.x;
                float f3 = c.y;
                float f4 = f3 - c2.y;
                float f5 = c3.x - f;
                float f6 = c3.y - f3;
                list = a2;
                float min = Math.min(floatValue / ((float) Math.hypot(f2, f4)), 0.5f);
                float min2 = Math.min(floatValue / ((float) Math.hypot(f5, f6)), 0.5f);
                float f7 = c.x;
                float a5 = wo1.a(c2.x, f7, min, f7);
                float f8 = c.y;
                float a6 = wo1.a(c2.y, f8, min, f8);
                float a7 = wo1.a(c3.x, f7, min2, f7);
                float a8 = wo1.a(c3.y, f8, min2, f8);
                float f9 = a5 - ((a5 - f7) * a);
                float f10 = a6 - ((a6 - f8) * a);
                float f11 = a7 - ((a7 - f7) * a);
                float f12 = a8 - ((a8 - f8) * a);
                pk0 pk0Var4 = a3.get(f(i3 - 1, a3.size()));
                pk0 pk0Var5 = a3.get(i3);
                pk0Var4.e(a5, a6);
                pk0Var4.g(a5, a6);
                if (i2 == 0) {
                    i.f(a5, a6);
                }
                pk0Var5.d(f9, f10);
                i3++;
                pk0Var5.e(f11, f12);
                pk0Var5.g(a7, a8);
                a3.get(i3).d(a7, a8);
            } else {
                list = a2;
                pk0 pk0Var6 = a3.get(f(i3 - 1, a3.size()));
                pk0Var6.e(pk0Var2.c().x, pk0Var2.c().y);
                pk0Var6.g(pk0Var2.c().x, pk0Var2.c().y);
                a3.get(i3).d(pk0Var.c().x, pk0Var.c().y);
            }
            i3++;
            i2++;
            a2 = list;
        }
        return i;
    }

    @Override // com.p7700g.p99005.yi0
    public String getName() {
        return this.c;
    }

    public tj0<Float, Float> h() {
        return this.d;
    }
}