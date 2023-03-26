package com.p7700g.p99005;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PagerAdapter.java */
/* loaded from: classes.dex */
public abstract class ra0 {
    public static final int a = -1;
    public static final int b = -2;
    private final DataSetObservable c = new DataSetObservable();
    private DataSetObserver d;

    @Deprecated
    public void a(@x1 View view, int i, @x1 Object obj) {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    public void b(@x1 ViewGroup viewGroup, int i, @x1 Object obj) {
        a(viewGroup, i, obj);
    }

    @Deprecated
    public void c(@x1 View view) {
    }

    public void d(@x1 ViewGroup viewGroup) {
        c(viewGroup);
    }

    public abstract int e();

    public int f(@x1 Object obj) {
        return -1;
    }

    @z1
    public CharSequence g(int i) {
        return null;
    }

    public float h(int i) {
        return 1.0f;
    }

    @x1
    @Deprecated
    public Object i(@x1 View view, int i) {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    @x1
    public Object j(@x1 ViewGroup viewGroup, int i) {
        return i(viewGroup, i);
    }

    public abstract boolean k(@x1 View view, @x1 Object obj);

    public void l() {
        synchronized (this) {
            DataSetObserver dataSetObserver = this.d;
            if (dataSetObserver != null) {
                dataSetObserver.onChanged();
            }
        }
        this.c.notifyChanged();
    }

    public void m(@x1 DataSetObserver dataSetObserver) {
        this.c.registerObserver(dataSetObserver);
    }

    public void n(@z1 Parcelable parcelable, @z1 ClassLoader classLoader) {
    }

    @z1
    public Parcelable o() {
        return null;
    }

    @Deprecated
    public void p(@x1 View view, int i, @x1 Object obj) {
    }

    public void q(@x1 ViewGroup viewGroup, int i, @x1 Object obj) {
        p(viewGroup, i, obj);
    }

    public void r(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.d = dataSetObserver;
        }
    }

    @Deprecated
    public void s(@x1 View view) {
    }

    public void t(@x1 ViewGroup viewGroup) {
        s(viewGroup);
    }

    public void u(@x1 DataSetObserver dataSetObserver) {
        this.c.unregisterObserver(dataSetObserver);
    }
}