package androidx.viewpager2.adapter;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p7700g.p99005.dy;
import com.p7700g.p99005.fb0;
import com.p7700g.p99005.hx;
import com.p7700g.p99005.jp;
import com.p7700g.p99005.mz;
import com.p7700g.p99005.oz;
import com.p7700g.p99005.qz;
import com.p7700g.p99005.r7;
import com.p7700g.p99005.sr;
import com.p7700g.p99005.t0;
import com.p7700g.p99005.v7;
import com.p7700g.p99005.wa0;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.xa0;
import com.p7700g.p99005.z1;

/* loaded from: classes.dex */
public abstract class FragmentStateAdapter extends RecyclerView.g<wa0> implements xa0 {
    private static final String c = "f#";
    private static final String d = "s#";
    private static final long e = 10000;
    public final mz f;
    public final FragmentManager g;
    public final v7<Fragment> h;
    private final v7<Fragment.m> i;
    private final v7<Integer> j;
    private FragmentMaxLifecycleEnforcer k;
    public boolean l;
    private boolean m;

    /* loaded from: classes.dex */
    public class FragmentMaxLifecycleEnforcer {
        private fb0.j a;
        private RecyclerView.i b;
        private oz c;
        private fb0 d;
        private long e = -1;

        /* loaded from: classes.dex */
        public class a extends fb0.j {
            public a() {
            }

            @Override // com.p7700g.p99005.fb0.j
            public void a(int i) {
                FragmentMaxLifecycleEnforcer.this.d(false);
            }

            @Override // com.p7700g.p99005.fb0.j
            public void c(int i) {
                FragmentMaxLifecycleEnforcer.this.d(false);
            }
        }

        /* loaded from: classes.dex */
        public class b extends d {
            public b() {
                super(null);
            }

            @Override // androidx.viewpager2.adapter.FragmentStateAdapter.d, androidx.recyclerview.widget.RecyclerView.i
            public void a() {
                FragmentMaxLifecycleEnforcer.this.d(true);
            }
        }

        public FragmentMaxLifecycleEnforcer() {
        }

        @x1
        private fb0 a(@x1 RecyclerView recyclerView) {
            ViewParent parent = recyclerView.getParent();
            if (parent instanceof fb0) {
                return (fb0) parent;
            }
            throw new IllegalStateException("Expected ViewPager2 instance. Got: " + parent);
        }

        public void b(@x1 RecyclerView recyclerView) {
            this.d = a(recyclerView);
            a aVar = new a();
            this.a = aVar;
            this.d.n(aVar);
            b bVar = new b();
            this.b = bVar;
            FragmentStateAdapter.this.C(bVar);
            oz ozVar = new oz() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.FragmentMaxLifecycleEnforcer.3
                @Override // com.p7700g.p99005.oz
                public void i(@x1 qz qzVar, @x1 mz.b bVar2) {
                    FragmentMaxLifecycleEnforcer.this.d(false);
                }
            };
            this.c = ozVar;
            FragmentStateAdapter.this.f.a(ozVar);
        }

        public void c(@x1 RecyclerView recyclerView) {
            a(recyclerView).x(this.a);
            FragmentStateAdapter.this.E(this.b);
            FragmentStateAdapter.this.f.c(this.c);
            this.d = null;
        }

        public void d(boolean z) {
            int currentItem;
            Fragment h;
            if (FragmentStateAdapter.this.Y() || this.d.getScrollState() != 0 || FragmentStateAdapter.this.h.p() || FragmentStateAdapter.this.e() == 0 || (currentItem = this.d.getCurrentItem()) >= FragmentStateAdapter.this.e()) {
                return;
            }
            long f = FragmentStateAdapter.this.f(currentItem);
            if ((f != this.e || z) && (h = FragmentStateAdapter.this.h.h(f)) != null && h.isAdded()) {
                this.e = f;
                dy r = FragmentStateAdapter.this.g.r();
                Fragment fragment = null;
                for (int i = 0; i < FragmentStateAdapter.this.h.H(); i++) {
                    long t = FragmentStateAdapter.this.h.t(i);
                    Fragment I = FragmentStateAdapter.this.h.I(i);
                    if (I.isAdded()) {
                        if (t != this.e) {
                            r.O(I, mz.c.STARTED);
                        } else {
                            fragment = I;
                        }
                        I.setMenuVisibility(t == this.e);
                    }
                }
                if (fragment != null) {
                    r.O(fragment, mz.c.RESUMED);
                }
                if (r.A()) {
                    return;
                }
                r.s();
            }
        }
    }

    /* loaded from: classes.dex */
    public class a implements View.OnLayoutChangeListener {
        public final /* synthetic */ FrameLayout a;
        public final /* synthetic */ wa0 b;

        public a(FrameLayout frameLayout, wa0 wa0Var) {
            this.a = frameLayout;
            this.b = wa0Var;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (this.a.getParent() != null) {
                this.a.removeOnLayoutChangeListener(this);
                FragmentStateAdapter.this.U(this.b);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b extends FragmentManager.m {
        public final /* synthetic */ Fragment a;
        public final /* synthetic */ FrameLayout b;

        public b(Fragment fragment, FrameLayout frameLayout) {
            this.a = fragment;
            this.b = frameLayout;
        }

        @Override // androidx.fragment.app.FragmentManager.m
        public void m(@x1 FragmentManager fragmentManager, @x1 Fragment fragment, @x1 View view, @z1 Bundle bundle) {
            if (fragment == this.a) {
                fragmentManager.T1(this);
                FragmentStateAdapter.this.F(view, this.b);
            }
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FragmentStateAdapter fragmentStateAdapter = FragmentStateAdapter.this;
            fragmentStateAdapter.l = false;
            fragmentStateAdapter.K();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class d extends RecyclerView.i {
        private d() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public abstract void a();

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void b(int i, int i2) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void c(int i, int i2, @z1 Object obj) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void d(int i, int i2) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void e(int i, int i2, int i3) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void f(int i, int i2) {
            a();
        }

        public /* synthetic */ d(a aVar) {
            this();
        }
    }

    public FragmentStateAdapter(@x1 hx hxVar) {
        this(hxVar.L(), hxVar.getLifecycle());
    }

    @x1
    private static String I(@x1 String str, long j) {
        return wo1.p(str, j);
    }

    private void J(int i) {
        long f = f(i);
        if (this.h.d(f)) {
            return;
        }
        Fragment H = H(i);
        H.setInitialSavedState(this.i.h(f));
        this.h.u(f, H);
    }

    private boolean L(long j) {
        View view;
        if (this.j.d(j)) {
            return true;
        }
        Fragment h = this.h.h(j);
        return (h == null || (view = h.getView()) == null || view.getParent() == null) ? false : true;
    }

    private static boolean M(@x1 String str, @x1 String str2) {
        return str.startsWith(str2) && str.length() > str2.length();
    }

    private Long N(int i) {
        Long l = null;
        for (int i2 = 0; i2 < this.j.H(); i2++) {
            if (this.j.I(i2).intValue() == i) {
                if (l == null) {
                    l = Long.valueOf(this.j.t(i2));
                } else {
                    throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                }
            }
        }
        return l;
    }

    private static long T(@x1 String str, @x1 String str2) {
        return Long.parseLong(str.substring(str2.length()));
    }

    private void V(long j) {
        ViewParent parent;
        Fragment h = this.h.h(j);
        if (h == null) {
            return;
        }
        if (h.getView() != null && (parent = h.getView().getParent()) != null) {
            ((FrameLayout) parent).removeAllViews();
        }
        if (!G(j)) {
            this.i.A(j);
        }
        if (!h.isAdded()) {
            this.h.A(j);
        } else if (Y()) {
            this.m = true;
        } else {
            if (h.isAdded() && G(j)) {
                this.i.u(j, this.g.I1(h));
            }
            this.g.r().B(h).s();
            this.h.A(j);
        }
    }

    private void W() {
        final Handler handler = new Handler(Looper.getMainLooper());
        final c cVar = new c();
        this.f.a(new oz() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.5
            @Override // com.p7700g.p99005.oz
            public void i(@x1 qz qzVar, @x1 mz.b bVar) {
                if (bVar == mz.b.ON_DESTROY) {
                    handler.removeCallbacks(cVar);
                    qzVar.getLifecycle().c(this);
                }
            }
        });
        handler.postDelayed(cVar, 10000L);
    }

    private void X(Fragment fragment, @x1 FrameLayout frameLayout) {
        this.g.v1(new b(fragment, frameLayout), false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void D(boolean z) {
        throw new UnsupportedOperationException("Stable Ids are required for the adapter to function properly, and the adapter takes care of setting the flag.");
    }

    public void F(@x1 View view, @x1 FrameLayout frameLayout) {
        if (frameLayout.getChildCount() <= 1) {
            if (view.getParent() == frameLayout) {
                return;
            }
            if (frameLayout.getChildCount() > 0) {
                frameLayout.removeAllViews();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            frameLayout.addView(view);
            return;
        }
        throw new IllegalStateException("Design assumption violated.");
    }

    public boolean G(long j) {
        return j >= 0 && j < ((long) e());
    }

    @x1
    public abstract Fragment H(int i);

    public void K() {
        if (!this.m || Y()) {
            return;
        }
        r7<Long> r7Var = new r7();
        for (int i = 0; i < this.h.H(); i++) {
            long t = this.h.t(i);
            if (!G(t)) {
                r7Var.add(Long.valueOf(t));
                this.j.A(t);
            }
        }
        if (!this.l) {
            this.m = false;
            for (int i2 = 0; i2 < this.h.H(); i2++) {
                long t2 = this.h.t(i2);
                if (!L(t2)) {
                    r7Var.add(Long.valueOf(t2));
                }
            }
        }
        for (Long l : r7Var) {
            V(l.longValue());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: O */
    public final void u(@x1 wa0 wa0Var, int i) {
        long k = wa0Var.k();
        int id = wa0Var.P().getId();
        Long N = N(id);
        if (N != null && N.longValue() != k) {
            V(N.longValue());
            this.j.A(N.longValue());
        }
        this.j.u(k, Integer.valueOf(id));
        J(i);
        FrameLayout P = wa0Var.P();
        if (sr.N0(P)) {
            if (P.getParent() == null) {
                P.addOnLayoutChangeListener(new a(P, wa0Var));
            } else {
                throw new IllegalStateException("Design assumption violated.");
            }
        }
        K();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @x1
    /* renamed from: P */
    public final wa0 w(@x1 ViewGroup viewGroup, int i) {
        return wa0.O(viewGroup);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: Q */
    public final boolean y(@x1 wa0 wa0Var) {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: R */
    public final void z(@x1 wa0 wa0Var) {
        U(wa0Var);
        K();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: S */
    public final void B(@x1 wa0 wa0Var) {
        Long N = N(wa0Var.P().getId());
        if (N != null) {
            V(N.longValue());
            this.j.A(N.longValue());
        }
    }

    public void U(@x1 final wa0 wa0Var) {
        Fragment h = this.h.h(wa0Var.k());
        if (h != null) {
            FrameLayout P = wa0Var.P();
            View view = h.getView();
            if (!h.isAdded() && view != null) {
                throw new IllegalStateException("Design assumption violated.");
            }
            if (h.isAdded() && view == null) {
                X(h, P);
                return;
            } else if (h.isAdded() && view.getParent() != null) {
                if (view.getParent() != P) {
                    F(view, P);
                    return;
                }
                return;
            } else if (h.isAdded()) {
                F(view, P);
                return;
            } else if (!Y()) {
                X(h, P);
                dy r = this.g.r();
                StringBuilder G = wo1.G("f");
                G.append(wa0Var.k());
                r.k(h, G.toString()).O(h, mz.c.STARTED).s();
                this.k.d(false);
                return;
            } else if (this.g.S0()) {
                return;
            } else {
                this.f.a(new oz() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.2
                    @Override // com.p7700g.p99005.oz
                    public void i(@x1 qz qzVar, @x1 mz.b bVar) {
                        if (FragmentStateAdapter.this.Y()) {
                            return;
                        }
                        qzVar.getLifecycle().c(this);
                        if (sr.N0(wa0Var.P())) {
                            FragmentStateAdapter.this.U(wa0Var);
                        }
                    }
                });
                return;
            }
        }
        throw new IllegalStateException("Design assumption violated.");
    }

    public boolean Y() {
        return this.g.Y0();
    }

    @Override // com.p7700g.p99005.xa0
    @x1
    public final Parcelable a() {
        Bundle bundle = new Bundle(this.i.H() + this.h.H());
        for (int i = 0; i < this.h.H(); i++) {
            long t = this.h.t(i);
            Fragment h = this.h.h(t);
            if (h != null && h.isAdded()) {
                this.g.u1(bundle, I(c, t), h);
            }
        }
        for (int i2 = 0; i2 < this.i.H(); i2++) {
            long t2 = this.i.t(i2);
            if (G(t2)) {
                bundle.putParcelable(I(d, t2), this.i.h(t2));
            }
        }
        return bundle;
    }

    @Override // com.p7700g.p99005.xa0
    public final void b(@x1 Parcelable parcelable) {
        if (this.i.p() && this.h.p()) {
            Bundle bundle = (Bundle) parcelable;
            if (bundle.getClassLoader() == null) {
                bundle.setClassLoader(getClass().getClassLoader());
            }
            for (String str : bundle.keySet()) {
                if (M(str, c)) {
                    this.h.u(T(str, c), this.g.C0(bundle, str));
                } else if (M(str, d)) {
                    long T = T(str, d);
                    Fragment.m mVar = (Fragment.m) bundle.getParcelable(str);
                    if (G(T)) {
                        this.i.u(T, mVar);
                    }
                } else {
                    throw new IllegalArgumentException(wo1.t("Unexpected key in savedState: ", str));
                }
            }
            if (this.h.p()) {
                return;
            }
            this.m = true;
            this.l = true;
            K();
            W();
            return;
        }
        throw new IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public long f(int i) {
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @t0
    public void t(@x1 RecyclerView recyclerView) {
        jp.a(this.k == null);
        FragmentMaxLifecycleEnforcer fragmentMaxLifecycleEnforcer = new FragmentMaxLifecycleEnforcer();
        this.k = fragmentMaxLifecycleEnforcer;
        fragmentMaxLifecycleEnforcer.b(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @t0
    public void x(@x1 RecyclerView recyclerView) {
        this.k.c(recyclerView);
        this.k = null;
    }

    public FragmentStateAdapter(@x1 Fragment fragment) {
        this(fragment.getChildFragmentManager(), fragment.getLifecycle());
    }

    public FragmentStateAdapter(@x1 FragmentManager fragmentManager, @x1 mz mzVar) {
        this.h = new v7<>();
        this.i = new v7<>();
        this.j = new v7<>();
        this.l = false;
        this.m = false;
        this.g = fragmentManager;
        this.f = mzVar;
        super.D(true);
    }
}