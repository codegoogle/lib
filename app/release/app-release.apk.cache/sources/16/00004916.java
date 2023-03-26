package com.p7700g.p99005;

import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: InfinitePagerAdapter.java */
/* loaded from: classes3.dex */
public class ir3 extends ra0 {
    public static final int e = 32400;
    private static final String f = "InfinitePagerAdapter";
    private mr3 g;

    public ir3(mr3 mr3Var) {
        this.g = mr3Var;
    }

    @Override // com.p7700g.p99005.ra0
    public void b(ViewGroup viewGroup, int i, Object obj) {
        if (x() < 1) {
            this.g.b(viewGroup, 0, obj);
        } else {
            this.g.b(viewGroup, y(i), obj);
        }
    }

    @Override // com.p7700g.p99005.ra0
    public void d(ViewGroup viewGroup) {
        this.g.d(viewGroup);
    }

    @Override // com.p7700g.p99005.ra0
    public int e() {
        if (x() < 1) {
            return 0;
        }
        return x() * e;
    }

    @Override // com.p7700g.p99005.ra0
    public int f(Object obj) {
        return this.g.f(obj);
    }

    @Override // com.p7700g.p99005.ra0
    public CharSequence g(int i) {
        return this.g.g(y(i));
    }

    @Override // com.p7700g.p99005.ra0
    public float h(int i) {
        return this.g.h(i);
    }

    @Override // com.p7700g.p99005.ra0
    @x1
    public Object j(ViewGroup viewGroup, int i) {
        if (x() < 1) {
            return this.g.j(viewGroup, 0);
        }
        return this.g.j(viewGroup, y(i));
    }

    @Override // com.p7700g.p99005.ra0
    public boolean k(View view, Object obj) {
        return this.g.k(view, obj);
    }

    @Override // com.p7700g.p99005.ra0
    public void m(DataSetObserver dataSetObserver) {
        this.g.m(dataSetObserver);
    }

    @Override // com.p7700g.p99005.ra0
    public void n(Parcelable parcelable, ClassLoader classLoader) {
        this.g.n(parcelable, classLoader);
    }

    @Override // com.p7700g.p99005.ra0
    public Parcelable o() {
        return this.g.o();
    }

    @Override // com.p7700g.p99005.ra0
    public void q(ViewGroup viewGroup, int i, Object obj) {
        this.g.q(viewGroup, i, obj);
    }

    @Override // com.p7700g.p99005.ra0
    public void t(ViewGroup viewGroup) {
        this.g.t(viewGroup);
    }

    @Override // com.p7700g.p99005.ra0
    public void u(DataSetObserver dataSetObserver) {
        this.g.u(dataSetObserver);
    }

    public int v(int i) {
        return (Math.max(0, x()) * 16200) + i;
    }

    public ra0 w() {
        return this.g;
    }

    public int x() {
        try {
            return w().e();
        } catch (Exception unused) {
            return 0;
        }
    }

    public int y(int i) {
        if (x() > 0) {
            return i % x();
        }
        return 0;
    }
}