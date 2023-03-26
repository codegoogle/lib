package com.p7700g.p99005;

import com.p7700g.p99005.d20;
import com.p7700g.p99005.i2;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: VolumeProviderCompat.java */
/* loaded from: classes.dex */
public abstract class c20 {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    private final int d;
    private final int e;
    private int f;
    private b g;
    private Object h;

    /* compiled from: VolumeProviderCompat.java */
    /* loaded from: classes.dex */
    public class a implements d20.b {
        public a() {
        }

        @Override // com.p7700g.p99005.d20.b
        public void a(int i) {
            c20.this.f(i);
        }

        @Override // com.p7700g.p99005.d20.b
        public void b(int i) {
            c20.this.e(i);
        }
    }

    /* compiled from: VolumeProviderCompat.java */
    /* loaded from: classes.dex */
    public static abstract class b {
        public abstract void a(c20 c20Var);
    }

    /* compiled from: VolumeProviderCompat.java */
    @i2({i2.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface c {
    }

    public c20(int i, int i2, int i3) {
        this.d = i;
        this.e = i2;
        this.f = i3;
    }

    public final int a() {
        return this.f;
    }

    public final int b() {
        return this.e;
    }

    public final int c() {
        return this.d;
    }

    public Object d() {
        if (this.h == null) {
            this.h = d20.a(this.d, this.e, this.f, new a());
        }
        return this.h;
    }

    public void e(int i) {
    }

    public void f(int i) {
    }

    public void g(b bVar) {
        this.g = bVar;
    }

    public final void h(int i) {
        this.f = i;
        Object d = d();
        if (d != null) {
            d20.b(d, i);
        }
        b bVar = this.g;
        if (bVar != null) {
            bVar.a(this);
        }
    }
}