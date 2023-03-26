package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import android.util.Log;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: RequestManagerFragment.java */
@Deprecated
/* loaded from: classes2.dex */
public class yx1 extends Fragment {
    private static final String s = "RMFragment";
    private final kx1 t;
    private final ay1 u;
    private final Set<yx1> v;
    @z1
    private jp1 w;
    @z1
    private yx1 x;
    @z1
    private Fragment y;

    /* compiled from: RequestManagerFragment.java */
    /* loaded from: classes2.dex */
    public class a implements ay1 {
        public a() {
        }

        @Override // com.p7700g.p99005.ay1
        @x1
        public Set<jp1> a() {
            Set<yx1> b = yx1.this.b();
            HashSet hashSet = new HashSet(b.size());
            for (yx1 yx1Var : b) {
                if (yx1Var.e() != null) {
                    hashSet.add(yx1Var.e());
                }
            }
            return hashSet;
        }

        public String toString() {
            return super.toString() + "{fragment=" + yx1.this + "}";
        }
    }

    public yx1() {
        this(new kx1());
    }

    private void a(yx1 yx1Var) {
        this.v.add(yx1Var);
    }

    @z1
    @TargetApi(17)
    private Fragment d() {
        Fragment parentFragment = getParentFragment();
        return parentFragment != null ? parentFragment : this.y;
    }

    @TargetApi(17)
    private boolean g(@x1 Fragment fragment) {
        Fragment parentFragment = getParentFragment();
        while (true) {
            Fragment parentFragment2 = fragment.getParentFragment();
            if (parentFragment2 == null) {
                return false;
            }
            if (parentFragment2.equals(parentFragment)) {
                return true;
            }
            fragment = fragment.getParentFragment();
        }
    }

    private void h(@x1 Activity activity) {
        l();
        yx1 q = yo1.e(activity).o().q(activity);
        this.x = q;
        if (equals(q)) {
            return;
        }
        this.x.a(this);
    }

    private void i(yx1 yx1Var) {
        this.v.remove(yx1Var);
    }

    private void l() {
        yx1 yx1Var = this.x;
        if (yx1Var != null) {
            yx1Var.i(this);
            this.x = null;
        }
    }

    @x1
    @TargetApi(17)
    public Set<yx1> b() {
        if (equals(this.x)) {
            return Collections.unmodifiableSet(this.v);
        }
        if (this.x != null) {
            HashSet hashSet = new HashSet();
            for (yx1 yx1Var : this.x.b()) {
                if (g(yx1Var.getParentFragment())) {
                    hashSet.add(yx1Var);
                }
            }
            return Collections.unmodifiableSet(hashSet);
        }
        return Collections.emptySet();
    }

    @x1
    public kx1 c() {
        return this.t;
    }

    @z1
    public jp1 e() {
        return this.w;
    }

    @x1
    public ay1 f() {
        return this.u;
    }

    public void j(@z1 Fragment fragment) {
        this.y = fragment;
        if (fragment == null || fragment.getActivity() == null) {
            return;
        }
        h(fragment.getActivity());
    }

    public void k(@z1 jp1 jp1Var) {
        this.w = jp1Var;
    }

    @Override // android.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            h(activity);
        } catch (IllegalStateException unused) {
            Log.isLoggable(s, 5);
        }
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.t.c();
        l();
    }

    @Override // android.app.Fragment
    public void onDetach() {
        super.onDetach();
        l();
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        this.t.d();
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        this.t.e();
    }

    @Override // android.app.Fragment
    public String toString() {
        return super.toString() + "{parent=" + d() + "}";
    }

    @r2
    @SuppressLint({"ValidFragment"})
    public yx1(@x1 kx1 kx1Var) {
        this.u = new a();
        this.v = new HashSet();
        this.t = kx1Var;
    }
}