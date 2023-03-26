package com.p7700g.p99005;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.p7700g.p99005.mz;
import java.util.ArrayList;

/* compiled from: FragmentStatePagerAdapter.java */
@Deprecated
/* loaded from: classes.dex */
public abstract class ay extends ra0 {
    private static final String e = "FragmentStatePagerAdapt";
    private static final boolean f = false;
    @Deprecated
    public static final int g = 0;
    public static final int h = 1;
    private final FragmentManager i;
    private final int j;
    private dy k;
    private ArrayList<Fragment.m> l;
    private ArrayList<Fragment> m;
    private Fragment n;
    private boolean o;

    @Deprecated
    public ay(@x1 FragmentManager fragmentManager) {
        this(fragmentManager, 0);
    }

    @Override // com.p7700g.p99005.ra0
    public void b(@x1 ViewGroup viewGroup, int i, @x1 Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.k == null) {
            this.k = this.i.r();
        }
        while (this.l.size() <= i) {
            this.l.add(null);
        }
        this.l.set(i, fragment.isAdded() ? this.i.I1(fragment) : null);
        this.m.set(i, null);
        this.k.B(fragment);
        if (fragment.equals(this.n)) {
            this.n = null;
        }
    }

    @Override // com.p7700g.p99005.ra0
    public void d(@x1 ViewGroup viewGroup) {
        dy dyVar = this.k;
        if (dyVar != null) {
            if (!this.o) {
                try {
                    this.o = true;
                    dyVar.t();
                } finally {
                    this.o = false;
                }
            }
            this.k = null;
        }
    }

    @Override // com.p7700g.p99005.ra0
    @x1
    public Object j(@x1 ViewGroup viewGroup, int i) {
        Fragment.m mVar;
        Fragment fragment;
        if (this.m.size() <= i || (fragment = this.m.get(i)) == null) {
            if (this.k == null) {
                this.k = this.i.r();
            }
            Fragment v = v(i);
            if (this.l.size() > i && (mVar = this.l.get(i)) != null) {
                v.setInitialSavedState(mVar);
            }
            while (this.m.size() <= i) {
                this.m.add(null);
            }
            v.setMenuVisibility(false);
            if (this.j == 0) {
                v.setUserVisibleHint(false);
            }
            this.m.set(i, v);
            this.k.f(viewGroup.getId(), v);
            if (this.j == 1) {
                this.k.O(v, mz.c.STARTED);
            }
            return v;
        }
        return fragment;
    }

    @Override // com.p7700g.p99005.ra0
    public boolean k(@x1 View view, @x1 Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    @Override // com.p7700g.p99005.ra0
    public void n(@z1 Parcelable parcelable, @z1 ClassLoader classLoader) {
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            this.l.clear();
            this.m.clear();
            if (parcelableArray != null) {
                for (Parcelable parcelable2 : parcelableArray) {
                    this.l.add((Fragment.m) parcelable2);
                }
            }
            for (String str : bundle.keySet()) {
                if (str.startsWith("f")) {
                    int parseInt = Integer.parseInt(str.substring(1));
                    Fragment C0 = this.i.C0(bundle, str);
                    if (C0 != null) {
                        while (this.m.size() <= parseInt) {
                            this.m.add(null);
                        }
                        C0.setMenuVisibility(false);
                        this.m.set(parseInt, C0);
                    }
                }
            }
        }
    }

    @Override // com.p7700g.p99005.ra0
    @z1
    public Parcelable o() {
        Bundle bundle;
        if (this.l.size() > 0) {
            bundle = new Bundle();
            Fragment.m[] mVarArr = new Fragment.m[this.l.size()];
            this.l.toArray(mVarArr);
            bundle.putParcelableArray("states", mVarArr);
        } else {
            bundle = null;
        }
        for (int i = 0; i < this.m.size(); i++) {
            Fragment fragment = this.m.get(i);
            if (fragment != null && fragment.isAdded()) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                this.i.u1(bundle, wo1.l("f", i), fragment);
            }
        }
        return bundle;
    }

    @Override // com.p7700g.p99005.ra0
    public void q(@x1 ViewGroup viewGroup, int i, @x1 Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.n;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                if (this.j == 1) {
                    if (this.k == null) {
                        this.k = this.i.r();
                    }
                    this.k.O(this.n, mz.c.STARTED);
                } else {
                    this.n.setUserVisibleHint(false);
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
            this.n = fragment;
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

    public ay(@x1 FragmentManager fragmentManager, int i) {
        this.k = null;
        this.l = new ArrayList<>();
        this.m = new ArrayList<>();
        this.n = null;
        this.i = fragmentManager;
        this.j = i;
    }
}