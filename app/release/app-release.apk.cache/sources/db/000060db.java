package com.p7700g.p99005;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.p7700g.p99005.mz;

/* compiled from: FragmentPagerAdapter.java */
@Deprecated
/* loaded from: classes.dex */
public abstract class ux extends ra0 {
    private static final String e = "FragmentPagerAdapter";
    private static final boolean f = false;
    @Deprecated
    public static final int g = 0;
    public static final int h = 1;
    private final FragmentManager i;
    private final int j;
    private dy k;
    private Fragment l;
    private boolean m;

    @Deprecated
    public ux(@x1 FragmentManager fragmentManager) {
        this(fragmentManager, 0);
    }

    private static String x(int i, long j) {
        return "android:switcher:" + i + ":" + j;
    }

    @Override // com.p7700g.p99005.ra0
    public void b(@x1 ViewGroup viewGroup, int i, @x1 Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.k == null) {
            this.k = this.i.r();
        }
        this.k.v(fragment);
        if (fragment.equals(this.l)) {
            this.l = null;
        }
    }

    @Override // com.p7700g.p99005.ra0
    public void d(@x1 ViewGroup viewGroup) {
        dy dyVar = this.k;
        if (dyVar != null) {
            if (!this.m) {
                try {
                    this.m = true;
                    dyVar.t();
                } finally {
                    this.m = false;
                }
            }
            this.k = null;
        }
    }

    @Override // com.p7700g.p99005.ra0
    @x1
    public Object j(@x1 ViewGroup viewGroup, int i) {
        if (this.k == null) {
            this.k = this.i.r();
        }
        long w = w(i);
        Fragment q0 = this.i.q0(x(viewGroup.getId(), w));
        if (q0 != null) {
            this.k.p(q0);
        } else {
            q0 = v(i);
            this.k.g(viewGroup.getId(), q0, x(viewGroup.getId(), w));
        }
        if (q0 != this.l) {
            q0.setMenuVisibility(false);
            if (this.j == 1) {
                this.k.O(q0, mz.c.STARTED);
            } else {
                q0.setUserVisibleHint(false);
            }
        }
        return q0;
    }

    @Override // com.p7700g.p99005.ra0
    public boolean k(@x1 View view, @x1 Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    @Override // com.p7700g.p99005.ra0
    public void n(@z1 Parcelable parcelable, @z1 ClassLoader classLoader) {
    }

    @Override // com.p7700g.p99005.ra0
    @z1
    public Parcelable o() {
        return null;
    }

    @Override // com.p7700g.p99005.ra0
    public void q(@x1 ViewGroup viewGroup, int i, @x1 Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.l;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                if (this.j == 1) {
                    if (this.k == null) {
                        this.k = this.i.r();
                    }
                    this.k.O(this.l, mz.c.STARTED);
                } else {
                    this.l.setUserVisibleHint(false);
                }
            }
            fragment.setMenuVisibility(true);
            if (this.j == 1) {
                if (this.k == null) {
                    this.k = this.i.r();
                }
                this.k.O(fragment, mz.c.RESUMED);
            } else {
                fragment.setUserVisibleHint(true);
            }
            this.l = fragment;
        }
    }

    @Override // com.p7700g.p99005.ra0
    public void t(@x1 ViewGroup viewGroup) {
        if (viewGroup.getId() != -1) {
            return;
        }
        throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
    }

    @x1
    public abstract Fragment v(int i);

    public long w(int i) {
        return i;
    }

    public ux(@x1 FragmentManager fragmentManager, int i) {
        this.k = null;
        this.l = null;
        this.i = fragmentManager;
        this.j = i;
    }
}