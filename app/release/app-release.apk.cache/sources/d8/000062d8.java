package com.p7700g.p99005;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: DefaultItemAnimator.java */
/* loaded from: classes.dex */
public class w20 extends p30 {
    private static final boolean o = false;
    private static TimeInterpolator p;
    private ArrayList<RecyclerView.f0> q = new ArrayList<>();
    private ArrayList<RecyclerView.f0> r = new ArrayList<>();
    private ArrayList<j> s = new ArrayList<>();
    private ArrayList<i> t = new ArrayList<>();
    public ArrayList<ArrayList<RecyclerView.f0>> u = new ArrayList<>();
    public ArrayList<ArrayList<j>> v = new ArrayList<>();
    public ArrayList<ArrayList<i>> w = new ArrayList<>();
    public ArrayList<RecyclerView.f0> x = new ArrayList<>();
    public ArrayList<RecyclerView.f0> y = new ArrayList<>();
    public ArrayList<RecyclerView.f0> z = new ArrayList<>();
    public ArrayList<RecyclerView.f0> A = new ArrayList<>();

    /* compiled from: DefaultItemAnimator.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ ArrayList s;

        public a(ArrayList arrayList) {
            this.s = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.s.iterator();
            while (it.hasNext()) {
                j jVar = (j) it.next();
                w20.this.b0(jVar.a, jVar.b, jVar.c, jVar.d, jVar.e);
            }
            this.s.clear();
            w20.this.v.remove(this.s);
        }
    }

    /* compiled from: DefaultItemAnimator.java */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        public final /* synthetic */ ArrayList s;

        public b(ArrayList arrayList) {
            this.s = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.s.iterator();
            while (it.hasNext()) {
                w20.this.a0((i) it.next());
            }
            this.s.clear();
            w20.this.w.remove(this.s);
        }
    }

    /* compiled from: DefaultItemAnimator.java */
    /* loaded from: classes.dex */
    public class c implements Runnable {
        public final /* synthetic */ ArrayList s;

        public c(ArrayList arrayList) {
            this.s = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.s.iterator();
            while (it.hasNext()) {
                w20.this.Z((RecyclerView.f0) it.next());
            }
            this.s.clear();
            w20.this.u.remove(this.s);
        }
    }

    /* compiled from: DefaultItemAnimator.java */
    /* loaded from: classes.dex */
    public class d extends AnimatorListenerAdapter {
        public final /* synthetic */ RecyclerView.f0 s;
        public final /* synthetic */ ViewPropertyAnimator t;
        public final /* synthetic */ View u;

        public d(RecyclerView.f0 f0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.s = f0Var;
            this.t = viewPropertyAnimator;
            this.u = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.t.setListener(null);
            this.u.setAlpha(1.0f);
            w20.this.N(this.s);
            w20.this.z.remove(this.s);
            w20.this.e0();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            w20.this.O(this.s);
        }
    }

    /* compiled from: DefaultItemAnimator.java */
    /* loaded from: classes.dex */
    public class e extends AnimatorListenerAdapter {
        public final /* synthetic */ RecyclerView.f0 s;
        public final /* synthetic */ View t;
        public final /* synthetic */ ViewPropertyAnimator u;

        public e(RecyclerView.f0 f0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.s = f0Var;
            this.t = view;
            this.u = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.t.setAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.u.setListener(null);
            w20.this.H(this.s);
            w20.this.x.remove(this.s);
            w20.this.e0();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            w20.this.I(this.s);
        }
    }

    /* compiled from: DefaultItemAnimator.java */
    /* loaded from: classes.dex */
    public class f extends AnimatorListenerAdapter {
        public final /* synthetic */ RecyclerView.f0 s;
        public final /* synthetic */ int t;
        public final /* synthetic */ View u;
        public final /* synthetic */ int v;
        public final /* synthetic */ ViewPropertyAnimator w;

        public f(RecyclerView.f0 f0Var, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
            this.s = f0Var;
            this.t = i;
            this.u = view;
            this.v = i2;
            this.w = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.t != 0) {
                this.u.setTranslationX(0.0f);
            }
            if (this.v != 0) {
                this.u.setTranslationY(0.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.w.setListener(null);
            w20.this.L(this.s);
            w20.this.y.remove(this.s);
            w20.this.e0();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            w20.this.M(this.s);
        }
    }

    /* compiled from: DefaultItemAnimator.java */
    /* loaded from: classes.dex */
    public class g extends AnimatorListenerAdapter {
        public final /* synthetic */ i s;
        public final /* synthetic */ ViewPropertyAnimator t;
        public final /* synthetic */ View u;

        public g(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.s = iVar;
            this.t = viewPropertyAnimator;
            this.u = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.t.setListener(null);
            this.u.setAlpha(1.0f);
            this.u.setTranslationX(0.0f);
            this.u.setTranslationY(0.0f);
            w20.this.J(this.s.a, true);
            w20.this.A.remove(this.s.a);
            w20.this.e0();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            w20.this.K(this.s.a, true);
        }
    }

    /* compiled from: DefaultItemAnimator.java */
    /* loaded from: classes.dex */
    public class h extends AnimatorListenerAdapter {
        public final /* synthetic */ i s;
        public final /* synthetic */ ViewPropertyAnimator t;
        public final /* synthetic */ View u;

        public h(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.s = iVar;
            this.t = viewPropertyAnimator;
            this.u = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.t.setListener(null);
            this.u.setAlpha(1.0f);
            this.u.setTranslationX(0.0f);
            this.u.setTranslationY(0.0f);
            w20.this.J(this.s.b, false);
            w20.this.A.remove(this.s.b);
            w20.this.e0();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            w20.this.K(this.s.b, false);
        }
    }

    /* compiled from: DefaultItemAnimator.java */
    /* loaded from: classes.dex */
    public static class j {
        public RecyclerView.f0 a;
        public int b;
        public int c;
        public int d;
        public int e;

        public j(RecyclerView.f0 f0Var, int i, int i2, int i3, int i4) {
            this.a = f0Var;
            this.b = i;
            this.c = i2;
            this.d = i3;
            this.e = i4;
        }
    }

    private void c0(RecyclerView.f0 f0Var) {
        View view = f0Var.p;
        ViewPropertyAnimator animate = view.animate();
        this.z.add(f0Var);
        animate.setDuration(p()).alpha(0.0f).setListener(new d(f0Var, animate, view)).start();
    }

    private void f0(List<i> list, RecyclerView.f0 f0Var) {
        for (int size = list.size() - 1; size >= 0; size--) {
            i iVar = list.get(size);
            if (h0(iVar, f0Var) && iVar.a == null && iVar.b == null) {
                list.remove(iVar);
            }
        }
    }

    private void g0(i iVar) {
        RecyclerView.f0 f0Var = iVar.a;
        if (f0Var != null) {
            h0(iVar, f0Var);
        }
        RecyclerView.f0 f0Var2 = iVar.b;
        if (f0Var2 != null) {
            h0(iVar, f0Var2);
        }
    }

    private boolean h0(i iVar, RecyclerView.f0 f0Var) {
        boolean z = false;
        if (iVar.b == f0Var) {
            iVar.b = null;
        } else if (iVar.a != f0Var) {
            return false;
        } else {
            iVar.a = null;
            z = true;
        }
        f0Var.p.setAlpha(1.0f);
        f0Var.p.setTranslationX(0.0f);
        f0Var.p.setTranslationY(0.0f);
        J(f0Var, z);
        return true;
    }

    private void i0(RecyclerView.f0 f0Var) {
        if (p == null) {
            p = new ValueAnimator().getInterpolator();
        }
        f0Var.p.animate().setInterpolator(p);
        k(f0Var);
    }

    @Override // com.p7700g.p99005.p30
    public boolean D(RecyclerView.f0 f0Var) {
        i0(f0Var);
        f0Var.p.setAlpha(0.0f);
        this.r.add(f0Var);
        return true;
    }

    @Override // com.p7700g.p99005.p30
    public boolean E(RecyclerView.f0 f0Var, RecyclerView.f0 f0Var2, int i2, int i3, int i4, int i5) {
        if (f0Var == f0Var2) {
            return F(f0Var, i2, i3, i4, i5);
        }
        float translationX = f0Var.p.getTranslationX();
        float translationY = f0Var.p.getTranslationY();
        float alpha = f0Var.p.getAlpha();
        i0(f0Var);
        int i6 = (int) ((i4 - i2) - translationX);
        int i7 = (int) ((i5 - i3) - translationY);
        f0Var.p.setTranslationX(translationX);
        f0Var.p.setTranslationY(translationY);
        f0Var.p.setAlpha(alpha);
        if (f0Var2 != null) {
            i0(f0Var2);
            f0Var2.p.setTranslationX(-i6);
            f0Var2.p.setTranslationY(-i7);
            f0Var2.p.setAlpha(0.0f);
        }
        this.t.add(new i(f0Var, f0Var2, i2, i3, i4, i5));
        return true;
    }

    @Override // com.p7700g.p99005.p30
    public boolean F(RecyclerView.f0 f0Var, int i2, int i3, int i4, int i5) {
        View view = f0Var.p;
        int translationX = i2 + ((int) view.getTranslationX());
        int translationY = i3 + ((int) f0Var.p.getTranslationY());
        i0(f0Var);
        int i6 = i4 - translationX;
        int i7 = i5 - translationY;
        if (i6 == 0 && i7 == 0) {
            L(f0Var);
            return false;
        }
        if (i6 != 0) {
            view.setTranslationX(-i6);
        }
        if (i7 != 0) {
            view.setTranslationY(-i7);
        }
        this.s.add(new j(f0Var, translationX, translationY, i4, i5));
        return true;
    }

    @Override // com.p7700g.p99005.p30
    public boolean G(RecyclerView.f0 f0Var) {
        i0(f0Var);
        this.q.add(f0Var);
        return true;
    }

    public void Z(RecyclerView.f0 f0Var) {
        View view = f0Var.p;
        ViewPropertyAnimator animate = view.animate();
        this.x.add(f0Var);
        animate.alpha(1.0f).setDuration(m()).setListener(new e(f0Var, view, animate)).start();
    }

    public void a0(i iVar) {
        RecyclerView.f0 f0Var = iVar.a;
        View view = f0Var == null ? null : f0Var.p;
        RecyclerView.f0 f0Var2 = iVar.b;
        View view2 = f0Var2 != null ? f0Var2.p : null;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(n());
            this.A.add(iVar.a);
            duration.translationX(iVar.e - iVar.c);
            duration.translationY(iVar.f - iVar.d);
            duration.alpha(0.0f).setListener(new g(iVar, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator animate = view2.animate();
            this.A.add(iVar.b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(n()).alpha(1.0f).setListener(new h(iVar, animate, view2)).start();
        }
    }

    public void b0(RecyclerView.f0 f0Var, int i2, int i3, int i4, int i5) {
        View view = f0Var.p;
        int i6 = i4 - i2;
        int i7 = i5 - i3;
        if (i6 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i7 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator animate = view.animate();
        this.y.add(f0Var);
        animate.setDuration(o()).setListener(new f(f0Var, i6, view, i7, animate)).start();
    }

    public void d0(List<RecyclerView.f0> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).p.animate().cancel();
        }
    }

    public void e0() {
        if (q()) {
            return;
        }
        j();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean g(@x1 RecyclerView.f0 f0Var, @x1 List<Object> list) {
        return !list.isEmpty() || super.g(f0Var, list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void k(RecyclerView.f0 f0Var) {
        View view = f0Var.p;
        view.animate().cancel();
        int size = this.s.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (this.s.get(size).a == f0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                L(f0Var);
                this.s.remove(size);
            }
        }
        f0(this.t, f0Var);
        if (this.q.remove(f0Var)) {
            view.setAlpha(1.0f);
            N(f0Var);
        }
        if (this.r.remove(f0Var)) {
            view.setAlpha(1.0f);
            H(f0Var);
        }
        for (int size2 = this.w.size() - 1; size2 >= 0; size2--) {
            ArrayList<i> arrayList = this.w.get(size2);
            f0(arrayList, f0Var);
            if (arrayList.isEmpty()) {
                this.w.remove(size2);
            }
        }
        for (int size3 = this.v.size() - 1; size3 >= 0; size3--) {
            ArrayList<j> arrayList2 = this.v.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (arrayList2.get(size4).a == f0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    L(f0Var);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.v.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.u.size() - 1; size5 >= 0; size5--) {
            ArrayList<RecyclerView.f0> arrayList3 = this.u.get(size5);
            if (arrayList3.remove(f0Var)) {
                view.setAlpha(1.0f);
                H(f0Var);
                if (arrayList3.isEmpty()) {
                    this.u.remove(size5);
                }
            }
        }
        this.z.remove(f0Var);
        this.x.remove(f0Var);
        this.A.remove(f0Var);
        this.y.remove(f0Var);
        e0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void l() {
        int size = this.s.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            j jVar = this.s.get(size);
            View view = jVar.a.p;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            L(jVar.a);
            this.s.remove(size);
        }
        for (int size2 = this.q.size() - 1; size2 >= 0; size2--) {
            N(this.q.get(size2));
            this.q.remove(size2);
        }
        int size3 = this.r.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.f0 f0Var = this.r.get(size3);
            f0Var.p.setAlpha(1.0f);
            H(f0Var);
            this.r.remove(size3);
        }
        for (int size4 = this.t.size() - 1; size4 >= 0; size4--) {
            g0(this.t.get(size4));
        }
        this.t.clear();
        if (q()) {
            for (int size5 = this.v.size() - 1; size5 >= 0; size5--) {
                ArrayList<j> arrayList = this.v.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    j jVar2 = arrayList.get(size6);
                    View view2 = jVar2.a.p;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    L(jVar2.a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.v.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.u.size() - 1; size7 >= 0; size7--) {
                ArrayList<RecyclerView.f0> arrayList2 = this.u.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.f0 f0Var2 = arrayList2.get(size8);
                    f0Var2.p.setAlpha(1.0f);
                    H(f0Var2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.u.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.w.size() - 1; size9 >= 0; size9--) {
                ArrayList<i> arrayList3 = this.w.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    g0(arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.w.remove(arrayList3);
                    }
                }
            }
            d0(this.z);
            d0(this.y);
            d0(this.x);
            d0(this.A);
            j();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean q() {
        return (this.r.isEmpty() && this.t.isEmpty() && this.s.isEmpty() && this.q.isEmpty() && this.y.isEmpty() && this.z.isEmpty() && this.x.isEmpty() && this.A.isEmpty() && this.v.isEmpty() && this.u.isEmpty() && this.w.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void x() {
        boolean z = !this.q.isEmpty();
        boolean z2 = !this.s.isEmpty();
        boolean z3 = !this.t.isEmpty();
        boolean z4 = !this.r.isEmpty();
        if (z || z2 || z4 || z3) {
            Iterator<RecyclerView.f0> it = this.q.iterator();
            while (it.hasNext()) {
                c0(it.next());
            }
            this.q.clear();
            if (z2) {
                ArrayList<j> arrayList = new ArrayList<>();
                arrayList.addAll(this.s);
                this.v.add(arrayList);
                this.s.clear();
                a aVar = new a(arrayList);
                if (z) {
                    sr.p1(arrayList.get(0).a.p, aVar, p());
                } else {
                    aVar.run();
                }
            }
            if (z3) {
                ArrayList<i> arrayList2 = new ArrayList<>();
                arrayList2.addAll(this.t);
                this.w.add(arrayList2);
                this.t.clear();
                b bVar = new b(arrayList2);
                if (z) {
                    sr.p1(arrayList2.get(0).a.p, bVar, p());
                } else {
                    bVar.run();
                }
            }
            if (z4) {
                ArrayList<RecyclerView.f0> arrayList3 = new ArrayList<>();
                arrayList3.addAll(this.r);
                this.u.add(arrayList3);
                this.r.clear();
                c cVar = new c(arrayList3);
                if (!z && !z2 && !z3) {
                    cVar.run();
                    return;
                }
                sr.p1(arrayList3.get(0).p, cVar, Math.max(z2 ? o() : 0L, z3 ? n() : 0L) + (z ? p() : 0L));
            }
        }
    }

    /* compiled from: DefaultItemAnimator.java */
    /* loaded from: classes.dex */
    public static class i {
        public RecyclerView.f0 a;
        public RecyclerView.f0 b;
        public int c;
        public int d;
        public int e;
        public int f;

        private i(RecyclerView.f0 f0Var, RecyclerView.f0 f0Var2) {
            this.a = f0Var;
            this.b = f0Var2;
        }

        public String toString() {
            StringBuilder G = wo1.G("ChangeInfo{oldHolder=");
            G.append(this.a);
            G.append(", newHolder=");
            G.append(this.b);
            G.append(", fromX=");
            G.append(this.c);
            G.append(", fromY=");
            G.append(this.d);
            G.append(", toX=");
            G.append(this.e);
            G.append(", toY=");
            return wo1.y(G, this.f, '}');
        }

        public i(RecyclerView.f0 f0Var, RecyclerView.f0 f0Var2, int i, int i2, int i3, int i4) {
            this(f0Var, f0Var2);
            this.c = i;
            this.d = i2;
            this.e = i3;
            this.f = i4;
        }
    }
}