package com.p7700g.p99005;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: TransitionManager.java */
/* loaded from: classes.dex */
public class v80 {
    private static final String a = "TransitionManager";
    private static s80 b = new o70();
    private static ThreadLocal<WeakReference<q7<ViewGroup, ArrayList<s80>>>> c = new ThreadLocal<>();
    public static ArrayList<ViewGroup> d = new ArrayList<>();
    private q7<o80, s80> e = new q7<>();
    private q7<o80, q7<o80, s80>> f = new q7<>();

    /* compiled from: TransitionManager.java */
    /* loaded from: classes.dex */
    public static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
        public s80 s;
        public ViewGroup t;

        /* compiled from: TransitionManager.java */
        /* renamed from: com.p7700g.p99005.v80$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0260a extends u80 {
            public final /* synthetic */ q7 s;

            public C0260a(q7 q7Var) {
                this.s = q7Var;
            }

            @Override // com.p7700g.p99005.u80, com.p7700g.p99005.s80.h
            public void c(@x1 s80 s80Var) {
                ((ArrayList) this.s.get(a.this.t)).remove(s80Var);
                s80Var.v0(this);
            }
        }

        public a(s80 s80Var, ViewGroup viewGroup) {
            this.s = s80Var;
            this.t = viewGroup;
        }

        private void a() {
            this.t.getViewTreeObserver().removeOnPreDrawListener(this);
            this.t.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            a();
            if (v80.d.remove(this.t)) {
                q7<ViewGroup, ArrayList<s80>> e = v80.e();
                ArrayList<s80> arrayList = e.get(this.t);
                ArrayList arrayList2 = null;
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    e.put(this.t, arrayList);
                } else if (arrayList.size() > 0) {
                    arrayList2 = new ArrayList(arrayList);
                }
                arrayList.add(this.s);
                this.s.a(new C0260a(e));
                this.s.u(this.t, false);
                if (arrayList2 != null) {
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        ((s80) it.next()).C0(this.t);
                    }
                }
                this.s.u0(this.t);
                return true;
            }
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            a();
            v80.d.remove(this.t);
            ArrayList<s80> arrayList = v80.e().get(this.t);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator<s80> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().C0(this.t);
                }
            }
            this.s.x(true);
        }
    }

    public static void a(@x1 ViewGroup viewGroup) {
        b(viewGroup, null);
    }

    public static void b(@x1 ViewGroup viewGroup, @z1 s80 s80Var) {
        if (d.contains(viewGroup) || !sr.T0(viewGroup)) {
            return;
        }
        d.add(viewGroup);
        if (s80Var == null) {
            s80Var = b;
        }
        s80 clone = s80Var.clone();
        j(viewGroup, clone);
        o80.g(viewGroup, null);
        i(viewGroup, clone);
    }

    private static void c(o80 o80Var, s80 s80Var) {
        ViewGroup e = o80Var.e();
        if (d.contains(e)) {
            return;
        }
        o80 c2 = o80.c(e);
        if (s80Var == null) {
            if (c2 != null) {
                c2.b();
            }
            o80Var.a();
            return;
        }
        d.add(e);
        s80 clone = s80Var.clone();
        clone.M0(e);
        if (c2 != null && c2.f()) {
            clone.F0(true);
        }
        j(e, clone);
        o80Var.a();
        i(e, clone);
    }

    public static void d(ViewGroup viewGroup) {
        d.remove(viewGroup);
        ArrayList<s80> arrayList = e().get(viewGroup);
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            ((s80) arrayList2.get(size)).Q(viewGroup);
        }
    }

    public static q7<ViewGroup, ArrayList<s80>> e() {
        q7<ViewGroup, ArrayList<s80>> q7Var;
        WeakReference<q7<ViewGroup, ArrayList<s80>>> weakReference = c.get();
        if (weakReference == null || (q7Var = weakReference.get()) == null) {
            q7<ViewGroup, ArrayList<s80>> q7Var2 = new q7<>();
            c.set(new WeakReference<>(q7Var2));
            return q7Var2;
        }
        return q7Var;
    }

    private s80 f(o80 o80Var) {
        o80 c2;
        q7<o80, s80> q7Var;
        s80 s80Var;
        ViewGroup e = o80Var.e();
        if (e == null || (c2 = o80.c(e)) == null || (q7Var = this.f.get(o80Var)) == null || (s80Var = q7Var.get(c2)) == null) {
            s80 s80Var2 = this.e.get(o80Var);
            return s80Var2 != null ? s80Var2 : b;
        }
        return s80Var;
    }

    public static void g(@x1 o80 o80Var) {
        c(o80Var, b);
    }

    public static void h(@x1 o80 o80Var, @z1 s80 s80Var) {
        c(o80Var, s80Var);
    }

    private static void i(ViewGroup viewGroup, s80 s80Var) {
        if (s80Var == null || viewGroup == null) {
            return;
        }
        a aVar = new a(s80Var, viewGroup);
        viewGroup.addOnAttachStateChangeListener(aVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
    }

    private static void j(ViewGroup viewGroup, s80 s80Var) {
        ArrayList<s80> arrayList = e().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<s80> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().t0(viewGroup);
            }
        }
        if (s80Var != null) {
            s80Var.u(viewGroup, true);
        }
        o80 c2 = o80.c(viewGroup);
        if (c2 != null) {
            c2.b();
        }
    }

    public void k(@x1 o80 o80Var, @x1 o80 o80Var2, @z1 s80 s80Var) {
        q7<o80, s80> q7Var = this.f.get(o80Var2);
        if (q7Var == null) {
            q7Var = new q7<>();
            this.f.put(o80Var2, q7Var);
        }
        q7Var.put(o80Var, s80Var);
    }

    public void l(@x1 o80 o80Var, @z1 s80 s80Var) {
        this.e.put(o80Var, s80Var);
    }

    public void m(@x1 o80 o80Var) {
        c(o80Var, f(o80Var));
    }
}