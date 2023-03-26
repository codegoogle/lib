package com.p7700g.p99005;

import android.content.Context;
import android.content.ContextWrapper;
import android.widget.ImageView;
import com.p7700g.p99005.yo1;
import java.util.List;
import java.util.Map;

/* compiled from: GlideContext.java */
/* loaded from: classes2.dex */
public class ap1 extends ContextWrapper {
    @r2
    public static final kp1<?, ?> a = new xo1();
    private final is1 b;
    private final hp1 c;
    private final nz1 d;
    private final yo1.a e;
    private final List<yy1<Object>> f;
    private final Map<Class<?>, kp1<?, ?>> g;
    private final rr1 h;
    private final bp1 i;
    private final int j;
    @z1
    @k1("this")
    private zy1 k;

    public ap1(@x1 Context context, @x1 is1 is1Var, @x1 hp1 hp1Var, @x1 nz1 nz1Var, @x1 yo1.a aVar, @x1 Map<Class<?>, kp1<?, ?>> map, @x1 List<yy1<Object>> list, @x1 rr1 rr1Var, @x1 bp1 bp1Var, int i) {
        super(context.getApplicationContext());
        this.b = is1Var;
        this.c = hp1Var;
        this.d = nz1Var;
        this.e = aVar;
        this.f = list;
        this.g = map;
        this.h = rr1Var;
        this.i = bp1Var;
        this.j = i;
    }

    @x1
    public <X> uz1<ImageView, X> a(@x1 ImageView imageView, @x1 Class<X> cls) {
        return this.d.a(imageView, cls);
    }

    @x1
    public is1 b() {
        return this.b;
    }

    public List<yy1<Object>> c() {
        return this.f;
    }

    public synchronized zy1 d() {
        if (this.k == null) {
            this.k = this.e.build().A0();
        }
        return this.k;
    }

    @x1
    public <T> kp1<?, T> e(@x1 Class<T> cls) {
        kp1<?, T> kp1Var = (kp1<?, T>) this.g.get(cls);
        if (kp1Var == null) {
            for (Map.Entry<Class<?>, kp1<?, ?>> entry : this.g.entrySet()) {
                if (entry.getKey().isAssignableFrom(cls)) {
                    kp1Var = (kp1<?, T>) entry.getValue();
                }
            }
        }
        return kp1Var == null ? (kp1<?, T>) a : kp1Var;
    }

    @x1
    public rr1 f() {
        return this.h;
    }

    public bp1 g() {
        return this.i;
    }

    public int h() {
        return this.j;
    }

    @x1
    public hp1 i() {
        return this.c;
    }
}