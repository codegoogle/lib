package com.p7700g.p99005;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.p7700g.p99005.zo1;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* compiled from: RequestManagerRetriever.java */
/* loaded from: classes2.dex */
public class zx1 implements Handler.Callback {
    @r2
    public static final String s = "com.bumptech.glide.manager";
    private static final String t = "RMRetriever";
    private static final int u = 1;
    private static final int v = 1;
    private static final int w = 2;
    private static final String x = "key";
    private static final b y = new a();
    private final Handler C;
    private final b D;
    private final ux1 H;
    private volatile jp1 z;
    @r2
    public final Map<FragmentManager, yx1> A = new HashMap();
    @r2
    public final Map<androidx.fragment.app.FragmentManager, dy1> B = new HashMap();
    private final q7<View, Fragment> E = new q7<>();
    private final q7<View, android.app.Fragment> F = new q7<>();
    private final Bundle G = new Bundle();

    /* compiled from: RequestManagerRetriever.java */
    /* loaded from: classes2.dex */
    public class a implements b {
        @Override // com.p7700g.p99005.zx1.b
        @x1
        public jp1 a(@x1 yo1 yo1Var, @x1 vx1 vx1Var, @x1 ay1 ay1Var, @x1 Context context) {
            return new jp1(yo1Var, vx1Var, ay1Var, context);
        }
    }

    /* compiled from: RequestManagerRetriever.java */
    /* loaded from: classes2.dex */
    public interface b {
        @x1
        jp1 a(@x1 yo1 yo1Var, @x1 vx1 vx1Var, @x1 ay1 ay1Var, @x1 Context context);
    }

    public zx1(@z1 b bVar, bp1 bp1Var) {
        this.D = bVar == null ? y : bVar;
        this.C = new Handler(Looper.getMainLooper(), this);
        this.H = b(bp1Var);
    }

    @TargetApi(17)
    private static void a(@x1 Activity activity) {
        if (activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    private static ux1 b(bp1 bp1Var) {
        if (uv1.c && uv1.b) {
            if (bp1Var.b(zo1.g.class)) {
                return new sx1();
            }
            return new tx1();
        }
        return new qx1();
    }

    @z1
    private static Activity c(@x1 Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return c(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    @TargetApi(26)
    @Deprecated
    private void d(@x1 FragmentManager fragmentManager, @x1 q7<View, android.app.Fragment> q7Var) {
        if (Build.VERSION.SDK_INT >= 26) {
            for (android.app.Fragment fragment : fragmentManager.getFragments()) {
                if (fragment.getView() != null) {
                    q7Var.put(fragment.getView(), fragment);
                    d(fragment.getChildFragmentManager(), q7Var);
                }
            }
            return;
        }
        e(fragmentManager, q7Var);
    }

    @Deprecated
    private void e(@x1 FragmentManager fragmentManager, @x1 q7<View, android.app.Fragment> q7Var) {
        int i = 0;
        while (true) {
            int i2 = i + 1;
            this.G.putInt("key", i);
            android.app.Fragment fragment = null;
            try {
                fragment = fragmentManager.getFragment(this.G, "key");
            } catch (Exception unused) {
            }
            if (fragment == null) {
                return;
            }
            if (fragment.getView() != null) {
                q7Var.put(fragment.getView(), fragment);
                d(fragment.getChildFragmentManager(), q7Var);
            }
            i = i2;
        }
    }

    private static void f(@z1 Collection<Fragment> collection, @x1 Map<View, Fragment> map) {
        if (collection == null) {
            return;
        }
        for (Fragment fragment : collection) {
            if (fragment != null && fragment.getView() != null) {
                map.put(fragment.getView(), fragment);
                f(fragment.getChildFragmentManager().G0(), map);
            }
        }
    }

    @z1
    @Deprecated
    private android.app.Fragment g(@x1 View view, @x1 Activity activity) {
        this.F.clear();
        d(activity.getFragmentManager(), this.F);
        View findViewById = activity.findViewById(16908290);
        android.app.Fragment fragment = null;
        while (!view.equals(findViewById) && (fragment = this.F.get(view)) == null && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        this.F.clear();
        return fragment;
    }

    @z1
    private Fragment h(@x1 View view, @x1 hx hxVar) {
        this.E.clear();
        f(hxVar.L().G0(), this.E);
        View findViewById = hxVar.findViewById(16908290);
        Fragment fragment = null;
        while (!view.equals(findViewById) && (fragment = this.E.get(view)) == null && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        this.E.clear();
        return fragment;
    }

    @x1
    @Deprecated
    private jp1 i(@x1 Context context, @x1 FragmentManager fragmentManager, @z1 android.app.Fragment fragment, boolean z) {
        yx1 r = r(fragmentManager, fragment);
        jp1 e = r.e();
        if (e == null) {
            e = this.D.a(yo1.e(context), r.c(), r.f(), context);
            if (z) {
                e.onStart();
            }
            r.k(e);
        }
        return e;
    }

    @x1
    private jp1 p(@x1 Context context) {
        if (this.z == null) {
            synchronized (this) {
                if (this.z == null) {
                    this.z = this.D.a(yo1.e(context.getApplicationContext()), new lx1(), new rx1(), context.getApplicationContext());
                }
            }
        }
        return this.z;
    }

    @x1
    private yx1 r(@x1 FragmentManager fragmentManager, @z1 android.app.Fragment fragment) {
        yx1 yx1Var = this.A.get(fragmentManager);
        if (yx1Var == null) {
            yx1 yx1Var2 = (yx1) fragmentManager.findFragmentByTag(s);
            if (yx1Var2 == null) {
                yx1Var2 = new yx1();
                yx1Var2.j(fragment);
                this.A.put(fragmentManager, yx1Var2);
                fragmentManager.beginTransaction().add(yx1Var2, s).commitAllowingStateLoss();
                this.C.obtainMessage(1, fragmentManager).sendToTarget();
            }
            return yx1Var2;
        }
        return yx1Var;
    }

    @x1
    private dy1 t(@x1 androidx.fragment.app.FragmentManager fragmentManager, @z1 Fragment fragment) {
        dy1 dy1Var = this.B.get(fragmentManager);
        if (dy1Var == null) {
            dy1 dy1Var2 = (dy1) fragmentManager.q0(s);
            if (dy1Var2 == null) {
                dy1Var2 = new dy1();
                dy1Var2.n(fragment);
                this.B.put(fragmentManager, dy1Var2);
                fragmentManager.r().k(dy1Var2, s).r();
                this.C.obtainMessage(2, fragmentManager).sendToTarget();
            }
            return dy1Var2;
        }
        return dy1Var;
    }

    private static boolean u(Context context) {
        Activity c = c(context);
        return c == null || !c.isFinishing();
    }

    @x1
    private jp1 v(@x1 Context context, @x1 androidx.fragment.app.FragmentManager fragmentManager, @z1 Fragment fragment, boolean z) {
        dy1 t2 = t(fragmentManager, fragment);
        jp1 g = t2.g();
        if (g == null) {
            g = this.D.a(yo1.e(context), t2.e(), t2.h(), context);
            if (z) {
                g.onStart();
            }
            t2.o(g);
        }
        return g;
    }

    private boolean w(FragmentManager fragmentManager, boolean z) {
        yx1 yx1Var = this.A.get(fragmentManager);
        yx1 yx1Var2 = (yx1) fragmentManager.findFragmentByTag(s);
        if (yx1Var2 == yx1Var) {
            return true;
        }
        if (yx1Var2 != null && yx1Var2.e() != null) {
            throw new IllegalStateException("We've added two fragments with requests! Old: " + yx1Var2 + " New: " + yx1Var);
        } else if (!z && !fragmentManager.isDestroyed()) {
            FragmentTransaction add = fragmentManager.beginTransaction().add(yx1Var, s);
            if (yx1Var2 != null) {
                add.remove(yx1Var2);
            }
            add.commitAllowingStateLoss();
            this.C.obtainMessage(1, 1, 0, fragmentManager).sendToTarget();
            Log.isLoggable(t, 3);
            return false;
        } else {
            if (Log.isLoggable(t, 5)) {
                fragmentManager.isDestroyed();
            }
            yx1Var.c().c();
            return true;
        }
    }

    private boolean x(androidx.fragment.app.FragmentManager fragmentManager, boolean z) {
        dy1 dy1Var = this.B.get(fragmentManager);
        dy1 dy1Var2 = (dy1) fragmentManager.q0(s);
        if (dy1Var2 == dy1Var) {
            return true;
        }
        if (dy1Var2 != null && dy1Var2.g() != null) {
            throw new IllegalStateException("We've added two fragments with requests! Old: " + dy1Var2 + " New: " + dy1Var);
        } else if (!z && !fragmentManager.S0()) {
            dy k = fragmentManager.r().k(dy1Var, s);
            if (dy1Var2 != null) {
                k.B(dy1Var2);
            }
            k.t();
            this.C.obtainMessage(2, 1, 0, fragmentManager).sendToTarget();
            Log.isLoggable(t, 3);
            return false;
        } else {
            if (fragmentManager.S0()) {
                Log.isLoggable(t, 5);
            } else {
                Log.isLoggable(t, 6);
            }
            dy1Var.e().c();
            return true;
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        FragmentManager fragmentManager;
        FragmentManager fragmentManager2;
        boolean z = false;
        boolean z2 = true;
        boolean z3 = message.arg1 == 1;
        int i = message.what;
        Object obj = null;
        if (i == 1) {
            FragmentManager fragmentManager3 = (FragmentManager) message.obj;
            if (w(fragmentManager3, z3)) {
                obj = this.A.remove(fragmentManager3);
                fragmentManager2 = fragmentManager3;
                z = true;
                fragmentManager = fragmentManager2;
            }
            fragmentManager = null;
        } else if (i != 2) {
            fragmentManager = null;
            z2 = false;
        } else {
            androidx.fragment.app.FragmentManager fragmentManager4 = (androidx.fragment.app.FragmentManager) message.obj;
            if (x(fragmentManager4, z3)) {
                obj = this.B.remove(fragmentManager4);
                fragmentManager2 = fragmentManager4;
                z = true;
                fragmentManager = fragmentManager2;
            }
            fragmentManager = null;
        }
        if (Log.isLoggable(t, 5) && z && obj == null) {
            String str = "Failed to remove expected request manager fragment, manager: " + fragmentManager;
        }
        return z2;
    }

    @x1
    public jp1 j(@x1 Activity activity) {
        if (z02.t()) {
            return l(activity.getApplicationContext());
        }
        if (activity instanceof hx) {
            return o((hx) activity);
        }
        a(activity);
        this.H.a(activity);
        return i(activity, activity.getFragmentManager(), null, u(activity));
    }

    @x1
    @TargetApi(17)
    @Deprecated
    public jp1 k(@x1 android.app.Fragment fragment) {
        if (fragment.getActivity() != null) {
            if (!z02.t()) {
                if (fragment.getActivity() != null) {
                    this.H.a(fragment.getActivity());
                }
                return i(fragment.getActivity(), fragment.getChildFragmentManager(), fragment, fragment.isVisible());
            }
            return l(fragment.getActivity().getApplicationContext());
        }
        throw new IllegalArgumentException("You cannot start a load on a fragment before it is attached");
    }

    @x1
    public jp1 l(@x1 Context context) {
        if (context != null) {
            if (z02.u() && !(context instanceof Application)) {
                if (context instanceof hx) {
                    return o((hx) context);
                }
                if (context instanceof Activity) {
                    return j((Activity) context);
                }
                if (context instanceof ContextWrapper) {
                    ContextWrapper contextWrapper = (ContextWrapper) context;
                    if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                        return l(contextWrapper.getBaseContext());
                    }
                }
            }
            return p(context);
        }
        throw new IllegalArgumentException("You cannot start a load on a null Context");
    }

    @x1
    public jp1 m(@x1 View view) {
        if (z02.t()) {
            return l(view.getContext().getApplicationContext());
        }
        x02.d(view);
        x02.e(view.getContext(), "Unable to obtain a request manager for a view without a Context");
        Activity c = c(view.getContext());
        if (c == null) {
            return l(view.getContext().getApplicationContext());
        }
        if (c instanceof hx) {
            hx hxVar = (hx) c;
            Fragment h = h(view, hxVar);
            return h != null ? n(h) : o(hxVar);
        }
        android.app.Fragment g = g(view, c);
        if (g == null) {
            return j(c);
        }
        return k(g);
    }

    @x1
    public jp1 n(@x1 Fragment fragment) {
        x02.e(fragment.getContext(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
        if (z02.t()) {
            return l(fragment.getContext().getApplicationContext());
        }
        if (fragment.getActivity() != null) {
            this.H.a(fragment.getActivity());
        }
        return v(fragment.getContext(), fragment.getChildFragmentManager(), fragment, fragment.isVisible());
    }

    @x1
    public jp1 o(@x1 hx hxVar) {
        if (z02.t()) {
            return l(hxVar.getApplicationContext());
        }
        a(hxVar);
        this.H.a(hxVar);
        return v(hxVar, hxVar.L(), null, u(hxVar));
    }

    @x1
    @Deprecated
    public yx1 q(Activity activity) {
        return r(activity.getFragmentManager(), null);
    }

    @x1
    public dy1 s(androidx.fragment.app.FragmentManager fragmentManager) {
        return t(fragmentManager, null);
    }
}