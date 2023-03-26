package com.p7700g.p99005;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.p7700g.p99005.cx;
import com.p7700g.p99005.nm;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: SpecialEffectsController.java */
/* loaded from: classes.dex */
public abstract class ky {
    private final ViewGroup a;
    public final ArrayList<e> b = new ArrayList<>();
    public final ArrayList<e> c = new ArrayList<>();
    public boolean d = false;
    public boolean e = false;

    /* compiled from: SpecialEffectsController.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ d s;

        public a(d dVar) {
            this.s = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ky.this.b.contains(this.s)) {
                this.s.e().a(this.s.f().mView);
            }
        }
    }

    /* compiled from: SpecialEffectsController.java */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        public final /* synthetic */ d s;

        public b(d dVar) {
            this.s = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            ky.this.b.remove(this.s);
            ky.this.c.remove(this.s);
        }
    }

    /* compiled from: SpecialEffectsController.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class c {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            e.b.values();
            int[] iArr = new int[3];
            b = iArr;
            try {
                iArr[e.b.ADDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[e.b.REMOVING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[e.b.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            e.c.values();
            int[] iArr2 = new int[4];
            a = iArr2;
            try {
                iArr2[e.c.REMOVED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[e.c.VISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[e.c.GONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[e.c.INVISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: SpecialEffectsController.java */
    /* loaded from: classes.dex */
    public static class d extends e {
        @x1
        private final yx h;

        public d(@x1 e.c cVar, @x1 e.b bVar, @x1 yx yxVar, @x1 nm nmVar) {
            super(cVar, bVar, yxVar.k(), nmVar);
            this.h = yxVar;
        }

        @Override // com.p7700g.p99005.ky.e
        public void c() {
            super.c();
            this.h.m();
        }

        @Override // com.p7700g.p99005.ky.e
        public void l() {
            if (g() == e.b.ADDING) {
                Fragment k = this.h.k();
                View findFocus = k.mView.findFocus();
                if (findFocus != null) {
                    k.setFocusedView(findFocus);
                    if (FragmentManager.T0(2)) {
                        String str = "requestFocus: Saved focused view " + findFocus + " for Fragment " + k;
                    }
                }
                View requireView = f().requireView();
                if (requireView.getParent() == null) {
                    this.h.b();
                    requireView.setAlpha(0.0f);
                }
                if (requireView.getAlpha() == 0.0f && requireView.getVisibility() == 0) {
                    requireView.setVisibility(4);
                }
                requireView.setAlpha(k.getPostOnViewCreatedAlpha());
            }
        }
    }

    /* compiled from: SpecialEffectsController.java */
    /* loaded from: classes.dex */
    public static class e {
        @x1
        private c a;
        @x1
        private b b;
        @x1
        private final Fragment c;
        @x1
        private final List<Runnable> d = new ArrayList();
        @x1
        private final HashSet<nm> e = new HashSet<>();
        private boolean f = false;
        private boolean g = false;

        /* compiled from: SpecialEffectsController.java */
        /* loaded from: classes.dex */
        public class a implements nm.b {
            public a() {
            }

            @Override // com.p7700g.p99005.nm.b
            public void onCancel() {
                e.this.b();
            }
        }

        /* compiled from: SpecialEffectsController.java */
        /* loaded from: classes.dex */
        public enum b {
            NONE,
            ADDING,
            REMOVING
        }

        /* compiled from: SpecialEffectsController.java */
        /* loaded from: classes.dex */
        public enum c {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            @x1
            public static c b(int i) {
                if (i != 0) {
                    if (i != 4) {
                        if (i == 8) {
                            return GONE;
                        }
                        throw new IllegalArgumentException(wo1.l("Unknown visibility ", i));
                    }
                    return INVISIBLE;
                }
                return VISIBLE;
            }

            @x1
            public static c c(@x1 View view) {
                if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
                    return INVISIBLE;
                }
                return b(view.getVisibility());
            }

            public void a(@x1 View view) {
                int ordinal = ordinal();
                if (ordinal == 0) {
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        if (FragmentManager.T0(2)) {
                            String str = "SpecialEffectsController: Removing view " + view + " from container " + viewGroup;
                        }
                        viewGroup.removeView(view);
                    }
                } else if (ordinal == 1) {
                    if (FragmentManager.T0(2)) {
                        String str2 = "SpecialEffectsController: Setting view " + view + " to VISIBLE";
                    }
                    view.setVisibility(0);
                } else if (ordinal == 2) {
                    if (FragmentManager.T0(2)) {
                        String str3 = "SpecialEffectsController: Setting view " + view + " to GONE";
                    }
                    view.setVisibility(8);
                } else if (ordinal != 3) {
                } else {
                    if (FragmentManager.T0(2)) {
                        String str4 = "SpecialEffectsController: Setting view " + view + " to INVISIBLE";
                    }
                    view.setVisibility(4);
                }
            }
        }

        public e(@x1 c cVar, @x1 b bVar, @x1 Fragment fragment, @x1 nm nmVar) {
            this.a = cVar;
            this.b = bVar;
            this.c = fragment;
            nmVar.d(new a());
        }

        public final void a(@x1 Runnable runnable) {
            this.d.add(runnable);
        }

        public final void b() {
            if (h()) {
                return;
            }
            this.f = true;
            if (this.e.isEmpty()) {
                c();
                return;
            }
            Iterator it = new ArrayList(this.e).iterator();
            while (it.hasNext()) {
                ((nm) it.next()).a();
            }
        }

        @t0
        public void c() {
            if (this.g) {
                return;
            }
            if (FragmentManager.T0(2)) {
                String str = "SpecialEffectsController: " + this + " has called complete.";
            }
            this.g = true;
            for (Runnable runnable : this.d) {
                runnable.run();
            }
        }

        public final void d(@x1 nm nmVar) {
            if (this.e.remove(nmVar) && this.e.isEmpty()) {
                c();
            }
        }

        @x1
        public c e() {
            return this.a;
        }

        @x1
        public final Fragment f() {
            return this.c;
        }

        @x1
        public b g() {
            return this.b;
        }

        public final boolean h() {
            return this.f;
        }

        public final boolean i() {
            return this.g;
        }

        public final void j(@x1 nm nmVar) {
            l();
            this.e.add(nmVar);
        }

        public final void k(@x1 c cVar, @x1 b bVar) {
            int ordinal = bVar.ordinal();
            if (ordinal == 0) {
                if (this.a != c.REMOVED) {
                    if (FragmentManager.T0(2)) {
                        StringBuilder G = wo1.G("SpecialEffectsController: For fragment ");
                        G.append(this.c);
                        G.append(" mFinalState = ");
                        G.append(this.a);
                        G.append(" -> ");
                        G.append(cVar);
                        G.append(". ");
                        G.toString();
                    }
                    this.a = cVar;
                }
            } else if (ordinal == 1) {
                if (this.a == c.REMOVED) {
                    if (FragmentManager.T0(2)) {
                        StringBuilder G2 = wo1.G("SpecialEffectsController: For fragment ");
                        G2.append(this.c);
                        G2.append(" mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = ");
                        G2.append(this.b);
                        G2.append(" to ADDING.");
                        G2.toString();
                    }
                    this.a = c.VISIBLE;
                    this.b = b.ADDING;
                }
            } else if (ordinal != 2) {
            } else {
                if (FragmentManager.T0(2)) {
                    StringBuilder G3 = wo1.G("SpecialEffectsController: For fragment ");
                    G3.append(this.c);
                    G3.append(" mFinalState = ");
                    G3.append(this.a);
                    G3.append(" -> REMOVED. mLifecycleImpact  = ");
                    G3.append(this.b);
                    G3.append(" to REMOVING.");
                    G3.toString();
                }
                this.a = c.REMOVED;
                this.b = b.REMOVING;
            }
        }

        public void l() {
        }

        @x1
        public String toString() {
            StringBuilder L = wo1.L("Operation ", "{");
            L.append(Integer.toHexString(System.identityHashCode(this)));
            L.append("} ");
            L.append("{");
            L.append("mFinalState = ");
            L.append(this.a);
            L.append("} ");
            L.append("{");
            L.append("mLifecycleImpact = ");
            L.append(this.b);
            L.append("} ");
            L.append("{");
            L.append("mFragment = ");
            L.append(this.c);
            L.append("}");
            return L.toString();
        }
    }

    public ky(@x1 ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    private void a(@x1 e.c cVar, @x1 e.b bVar, @x1 yx yxVar) {
        synchronized (this.b) {
            nm nmVar = new nm();
            e h = h(yxVar.k());
            if (h != null) {
                h.k(cVar, bVar);
                return;
            }
            d dVar = new d(cVar, bVar, yxVar, nmVar);
            this.b.add(dVar);
            dVar.a(new a(dVar));
            dVar.a(new b(dVar));
        }
    }

    @z1
    private e h(@x1 Fragment fragment) {
        Iterator<e> it = this.b.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (next.f().equals(fragment) && !next.h()) {
                return next;
            }
        }
        return null;
    }

    @z1
    private e i(@x1 Fragment fragment) {
        Iterator<e> it = this.c.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (next.f().equals(fragment) && !next.h()) {
                return next;
            }
        }
        return null;
    }

    @x1
    public static ky n(@x1 ViewGroup viewGroup, @x1 FragmentManager fragmentManager) {
        return o(viewGroup, fragmentManager.M0());
    }

    @x1
    public static ky o(@x1 ViewGroup viewGroup, @x1 ly lyVar) {
        int i = cx.g.e0;
        Object tag = viewGroup.getTag(i);
        if (tag instanceof ky) {
            return (ky) tag;
        }
        ky a2 = lyVar.a(viewGroup);
        viewGroup.setTag(i, a2);
        return a2;
    }

    private void q() {
        Iterator<e> it = this.b.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (next.g() == e.b.ADDING) {
                next.k(e.c.b(next.f().requireView().getVisibility()), e.b.NONE);
            }
        }
    }

    public void b(@x1 e.c cVar, @x1 yx yxVar) {
        if (FragmentManager.T0(2)) {
            StringBuilder G = wo1.G("SpecialEffectsController: Enqueuing add operation for fragment ");
            G.append(yxVar.k());
            G.toString();
        }
        a(cVar, e.b.ADDING, yxVar);
    }

    public void c(@x1 yx yxVar) {
        if (FragmentManager.T0(2)) {
            StringBuilder G = wo1.G("SpecialEffectsController: Enqueuing hide operation for fragment ");
            G.append(yxVar.k());
            G.toString();
        }
        a(e.c.GONE, e.b.NONE, yxVar);
    }

    public void d(@x1 yx yxVar) {
        if (FragmentManager.T0(2)) {
            StringBuilder G = wo1.G("SpecialEffectsController: Enqueuing remove operation for fragment ");
            G.append(yxVar.k());
            G.toString();
        }
        a(e.c.REMOVED, e.b.REMOVING, yxVar);
    }

    public void e(@x1 yx yxVar) {
        if (FragmentManager.T0(2)) {
            StringBuilder G = wo1.G("SpecialEffectsController: Enqueuing show operation for fragment ");
            G.append(yxVar.k());
            G.toString();
        }
        a(e.c.VISIBLE, e.b.NONE, yxVar);
    }

    public abstract void f(@x1 List<e> list, boolean z);

    public void g() {
        if (this.e) {
            return;
        }
        if (!sr.N0(this.a)) {
            j();
            this.d = false;
            return;
        }
        synchronized (this.b) {
            if (!this.b.isEmpty()) {
                ArrayList arrayList = new ArrayList(this.c);
                this.c.clear();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    e eVar = (e) it.next();
                    if (FragmentManager.T0(2)) {
                        String str = "SpecialEffectsController: Cancelling operation " + eVar;
                    }
                    eVar.b();
                    if (!eVar.i()) {
                        this.c.add(eVar);
                    }
                }
                q();
                ArrayList arrayList2 = new ArrayList(this.b);
                this.b.clear();
                this.c.addAll(arrayList2);
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    ((e) it2.next()).l();
                }
                f(arrayList2, this.d);
                this.d = false;
            }
        }
    }

    public void j() {
        String str;
        String str2;
        boolean N0 = sr.N0(this.a);
        synchronized (this.b) {
            q();
            Iterator<e> it = this.b.iterator();
            while (it.hasNext()) {
                it.next().l();
            }
            Iterator it2 = new ArrayList(this.c).iterator();
            while (it2.hasNext()) {
                e eVar = (e) it2.next();
                if (FragmentManager.T0(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("SpecialEffectsController: ");
                    if (N0) {
                        str2 = "";
                    } else {
                        str2 = "Container " + this.a + " is not attached to window. ";
                    }
                    sb.append(str2);
                    sb.append("Cancelling running operation ");
                    sb.append(eVar);
                    sb.toString();
                }
                eVar.b();
            }
            Iterator it3 = new ArrayList(this.b).iterator();
            while (it3.hasNext()) {
                e eVar2 = (e) it3.next();
                if (FragmentManager.T0(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: ");
                    if (N0) {
                        str = "";
                    } else {
                        str = "Container " + this.a + " is not attached to window. ";
                    }
                    sb2.append(str);
                    sb2.append("Cancelling pending operation ");
                    sb2.append(eVar2);
                    sb2.toString();
                }
                eVar2.b();
            }
        }
    }

    public void k() {
        if (this.e) {
            this.e = false;
            g();
        }
    }

    @z1
    public e.b l(@x1 yx yxVar) {
        e h = h(yxVar.k());
        e.b g = h != null ? h.g() : null;
        e i = i(yxVar.k());
        return (i == null || !(g == null || g == e.b.NONE)) ? g : i.g();
    }

    @x1
    public ViewGroup m() {
        return this.a;
    }

    public void p() {
        synchronized (this.b) {
            q();
            this.e = false;
            int size = this.b.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                e eVar = this.b.get(size);
                e.c c2 = e.c.c(eVar.f().mView);
                e.c e2 = eVar.e();
                e.c cVar = e.c.VISIBLE;
                if (e2 == cVar && c2 != cVar) {
                    this.e = eVar.f().isPostponed();
                    break;
                }
                size--;
            }
        }
    }

    public void r(boolean z) {
        this.d = z;
    }
}