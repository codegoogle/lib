package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: SupportRequestManagerFragment.java */
/* loaded from: classes2.dex */
public class dy1 extends Fragment {
    private static final String s = "SupportRMFragment";
    private final kx1 t;
    private final ay1 u;
    private final Set<dy1> v;
    @z1
    private dy1 w;
    @z1
    private jp1 x;
    @z1
    private Fragment y;

    /* compiled from: SupportRequestManagerFragment.java */
    /* loaded from: classes2.dex */
    public class a implements ay1 {
        public a() {
        }

        @Override // com.p7700g.p99005.ay1
        @x1
        public Set<jp1> a() {
            Set<dy1> d = dy1.this.d();
            HashSet hashSet = new HashSet(d.size());
            for (dy1 dy1Var : d) {
                if (dy1Var.g() != null) {
                    hashSet.add(dy1Var.g());
                }
            }
            return hashSet;
        }

        public String toString() {
            return super.toString() + "{fragment=" + dy1.this + "}";
        }
    }

    public dy1() {
        this(new kx1());
    }

    private void b(dy1 dy1Var) {
        this.v.add(dy1Var);
    }

    @z1
    private Fragment f() {
        Fragment parentFragment = getParentFragment();
        return parentFragment != null ? parentFragment : this.y;
    }

    @z1
    private static FragmentManager i(@x1 Fragment fragment) {
        while (fragment.getParentFragment() != null) {
            fragment = fragment.getParentFragment();
        }
        return fragment.getFragmentManager();
    }

    private boolean k(@x1 Fragment fragment) {
        Fragment f = f();
        while (true) {
            Fragment parentFragment = fragment.getParentFragment();
            if (parentFragment == null) {
                return false;
            }
            if (parentFragment.equals(f)) {
                return true;
            }
            fragment = fragment.getParentFragment();
        }
    }

    private void l(@x1 Context context, @x1 FragmentManager fragmentManager) {
        p();
        dy1 s2 = yo1.e(context).o().s(fragmentManager);
        this.w = s2;
        if (equals(s2)) {
            return;
        }
        this.w.b(this);
    }

    private void m(dy1 dy1Var) {
        this.v.remove(dy1Var);
    }

    private void p() {
        dy1 dy1Var = this.w;
        if (dy1Var != null) {
            dy1Var.m(this);
            this.w = null;
        }
    }

    @x1
    public Set<dy1> d() {
        dy1 dy1Var = this.w;
        if (dy1Var == null) {
            return Collections.emptySet();
        }
        if (equals(dy1Var)) {
            return Collections.unmodifiableSet(this.v);
        }
        HashSet hashSet = new HashSet();
        for (dy1 dy1Var2 : this.w.d()) {
            if (k(dy1Var2.f())) {
                hashSet.add(dy1Var2);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    @x1
    public kx1 e() {
        return this.t;
    }

    @z1
    public jp1 g() {
        return this.x;
    }

    @x1
    public ay1 h() {
        return this.u;
    }

    public void n(@z1 Fragment fragment) {
        FragmentManager i;
        this.y = fragment;
        if (fragment == null || fragment.getContext() == null || (i = i(fragment)) == null) {
            return;
        }
        l(fragment.getContext(), i);
    }

    public void o(@z1 jp1 jp1Var) {
        this.x = jp1Var;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        FragmentManager i = i(this);
        if (i == null) {
            Log.isLoggable(s, 5);
            return;
        }
        try {
            l(getContext(), i);
        } catch (IllegalStateException unused) {
            Log.isLoggable(s, 5);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.t.c();
        p();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.y = null;
        p();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        this.t.d();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        this.t.e();
    }

    @Override // androidx.fragment.app.Fragment
    public String toString() {
        return super.toString() + "{parent=" + f() + "}";
    }

    @r2
    @SuppressLint({"ValidFragment"})
    public dy1(@x1 kx1 kx1Var) {
        this.u = new a();
        this.v = new HashSet();
        this.t = kx1Var;
    }
}