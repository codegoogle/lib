package com.p7700g.p99005;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: FragmentLifecycleCallbacksDispatcher.java */
/* loaded from: classes.dex */
public class ox {
    @x1
    private final CopyOnWriteArrayList<a> a = new CopyOnWriteArrayList<>();
    @x1
    private final FragmentManager b;

    /* compiled from: FragmentLifecycleCallbacksDispatcher.java */
    /* loaded from: classes.dex */
    public static final class a {
        @x1
        public final FragmentManager.m a;
        public final boolean b;

        public a(@x1 FragmentManager.m mVar, boolean z) {
            this.a = mVar;
            this.b = z;
        }
    }

    public ox(@x1 FragmentManager fragmentManager) {
        this.b = fragmentManager;
    }

    public void a(@x1 Fragment fragment, @z1 Bundle bundle, boolean z) {
        Fragment K0 = this.b.K0();
        if (K0 != null) {
            K0.getParentFragmentManager().J0().a(fragment, bundle, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.a(this.b, fragment, bundle);
            }
        }
    }

    public void b(@x1 Fragment fragment, boolean z) {
        Context g = this.b.H0().g();
        Fragment K0 = this.b.K0();
        if (K0 != null) {
            K0.getParentFragmentManager().J0().b(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.b(this.b, fragment, g);
            }
        }
    }

    public void c(@x1 Fragment fragment, @z1 Bundle bundle, boolean z) {
        Fragment K0 = this.b.K0();
        if (K0 != null) {
            K0.getParentFragmentManager().J0().c(fragment, bundle, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.c(this.b, fragment, bundle);
            }
        }
    }

    public void d(@x1 Fragment fragment, boolean z) {
        Fragment K0 = this.b.K0();
        if (K0 != null) {
            K0.getParentFragmentManager().J0().d(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.d(this.b, fragment);
            }
        }
    }

    public void e(@x1 Fragment fragment, boolean z) {
        Fragment K0 = this.b.K0();
        if (K0 != null) {
            K0.getParentFragmentManager().J0().e(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.e(this.b, fragment);
            }
        }
    }

    public void f(@x1 Fragment fragment, boolean z) {
        Fragment K0 = this.b.K0();
        if (K0 != null) {
            K0.getParentFragmentManager().J0().f(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.f(this.b, fragment);
            }
        }
    }

    public void g(@x1 Fragment fragment, boolean z) {
        Context g = this.b.H0().g();
        Fragment K0 = this.b.K0();
        if (K0 != null) {
            K0.getParentFragmentManager().J0().g(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.g(this.b, fragment, g);
            }
        }
    }

    public void h(@x1 Fragment fragment, @z1 Bundle bundle, boolean z) {
        Fragment K0 = this.b.K0();
        if (K0 != null) {
            K0.getParentFragmentManager().J0().h(fragment, bundle, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.h(this.b, fragment, bundle);
            }
        }
    }

    public void i(@x1 Fragment fragment, boolean z) {
        Fragment K0 = this.b.K0();
        if (K0 != null) {
            K0.getParentFragmentManager().J0().i(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.i(this.b, fragment);
            }
        }
    }

    public void j(@x1 Fragment fragment, @x1 Bundle bundle, boolean z) {
        Fragment K0 = this.b.K0();
        if (K0 != null) {
            K0.getParentFragmentManager().J0().j(fragment, bundle, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.j(this.b, fragment, bundle);
            }
        }
    }

    public void k(@x1 Fragment fragment, boolean z) {
        Fragment K0 = this.b.K0();
        if (K0 != null) {
            K0.getParentFragmentManager().J0().k(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.k(this.b, fragment);
            }
        }
    }

    public void l(@x1 Fragment fragment, boolean z) {
        Fragment K0 = this.b.K0();
        if (K0 != null) {
            K0.getParentFragmentManager().J0().l(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.l(this.b, fragment);
            }
        }
    }

    public void m(@x1 Fragment fragment, @x1 View view, @z1 Bundle bundle, boolean z) {
        Fragment K0 = this.b.K0();
        if (K0 != null) {
            K0.getParentFragmentManager().J0().m(fragment, view, bundle, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.m(this.b, fragment, view, bundle);
            }
        }
    }

    public void n(@x1 Fragment fragment, boolean z) {
        Fragment K0 = this.b.K0();
        if (K0 != null) {
            K0.getParentFragmentManager().J0().n(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.n(this.b, fragment);
            }
        }
    }

    public void o(@x1 FragmentManager.m mVar, boolean z) {
        this.a.add(new a(mVar, z));
    }

    public void p(@x1 FragmentManager.m mVar) {
        synchronized (this.a) {
            int i = 0;
            int size = this.a.size();
            while (true) {
                if (i >= size) {
                    break;
                } else if (this.a.get(i).a == mVar) {
                    this.a.remove(i);
                    break;
                } else {
                    i++;
                }
            }
        }
    }
}