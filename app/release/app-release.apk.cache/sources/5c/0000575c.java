package com.p7700g.p99005;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.SpinnerAdapter;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.DecorToolbar;
import androidx.appcompat.widget.ScrollingTabContainerView;
import androidx.appcompat.widget.Toolbar;
import com.p7700g.p99005.b4;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.p4;
import com.p7700g.p99005.x2;
import com.p7700g.p99005.z2;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: WindowDecorActionBar.java */
@i2({i2.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class q3 extends z2 implements ActionBarOverlayLayout.ActionBarVisibilityCallback {
    private static final String i = "WindowDecorActionBar";
    private static final Interpolator j = new AccelerateInterpolator();
    private static final Interpolator k = new DecelerateInterpolator();
    private static final int l = -1;
    private static final long m = 100;
    private static final long n = 200;
    private boolean A;
    public d B;
    public b4 C;
    public b4.a D;
    private boolean E;
    private boolean G;
    public boolean J;
    public boolean K;
    private boolean L;
    public h4 N;
    private boolean O;
    public boolean P;
    public Context o;
    private Context p;
    private Activity q;
    public ActionBarOverlayLayout r;
    public ActionBarContainer s;
    public DecorToolbar t;
    public ActionBarContextView u;
    public View v;
    public ScrollingTabContainerView w;
    private e y;
    private ArrayList<e> x = new ArrayList<>();
    private int z = -1;
    private ArrayList<z2.d> F = new ArrayList<>();
    private int H = 0;
    public boolean I = true;
    private boolean M = true;
    public final zr Q = new a();
    public final zr R = new b();
    public final bs S = new c();

    /* compiled from: WindowDecorActionBar.java */
    /* loaded from: classes.dex */
    public class a extends as {
        public a() {
        }

        @Override // com.p7700g.p99005.as, com.p7700g.p99005.zr
        public void onAnimationEnd(View view) {
            View view2;
            q3 q3Var = q3.this;
            if (q3Var.I && (view2 = q3Var.v) != null) {
                view2.setTranslationY(0.0f);
                q3.this.s.setTranslationY(0.0f);
            }
            q3.this.s.setVisibility(8);
            q3.this.s.setTransitioning(false);
            q3 q3Var2 = q3.this;
            q3Var2.N = null;
            q3Var2.B0();
            ActionBarOverlayLayout actionBarOverlayLayout = q3.this.r;
            if (actionBarOverlayLayout != null) {
                sr.u1(actionBarOverlayLayout);
            }
        }
    }

    /* compiled from: WindowDecorActionBar.java */
    /* loaded from: classes.dex */
    public class b extends as {
        public b() {
        }

        @Override // com.p7700g.p99005.as, com.p7700g.p99005.zr
        public void onAnimationEnd(View view) {
            q3 q3Var = q3.this;
            q3Var.N = null;
            q3Var.s.requestLayout();
        }
    }

    /* compiled from: WindowDecorActionBar.java */
    /* loaded from: classes.dex */
    public class c implements bs {
        public c() {
        }

        @Override // com.p7700g.p99005.bs
        public void a(View view) {
            ((View) q3.this.s.getParent()).invalidate();
        }
    }

    /* compiled from: WindowDecorActionBar.java */
    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public class d extends b4 implements p4.a {
        private final Context u;
        private final p4 v;
        private b4.a w;
        private WeakReference<View> x;

        public d(Context context, b4.a aVar) {
            this.u = context;
            this.w = aVar;
            p4 Z = new p4(context).Z(1);
            this.v = Z;
            Z.X(this);
        }

        @Override // com.p7700g.p99005.b4
        public void a() {
            q3 q3Var = q3.this;
            if (q3Var.B != this) {
                return;
            }
            if (!q3.z0(q3Var.J, q3Var.K, false)) {
                q3 q3Var2 = q3.this;
                q3Var2.C = this;
                q3Var2.D = this.w;
            } else {
                this.w.a(this);
            }
            this.w = null;
            q3.this.y0(false);
            q3.this.u.closeMode();
            q3 q3Var3 = q3.this;
            q3Var3.r.setHideOnContentScrollEnabled(q3Var3.P);
            q3.this.B = null;
        }

        @Override // com.p7700g.p99005.b4
        public View b() {
            WeakReference<View> weakReference = this.x;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // com.p7700g.p99005.b4
        public Menu c() {
            return this.v;
        }

        @Override // com.p7700g.p99005.b4
        public MenuInflater d() {
            return new g4(this.u);
        }

        @Override // com.p7700g.p99005.b4
        public CharSequence e() {
            return q3.this.u.getSubtitle();
        }

        @Override // com.p7700g.p99005.b4
        public CharSequence g() {
            return q3.this.u.getTitle();
        }

        @Override // com.p7700g.p99005.b4
        public void i() {
            if (q3.this.B != this) {
                return;
            }
            this.v.m0();
            try {
                this.w.c(this, this.v);
            } finally {
                this.v.l0();
            }
        }

        @Override // com.p7700g.p99005.b4
        public boolean j() {
            return q3.this.u.isTitleOptional();
        }

        @Override // com.p7700g.p99005.b4
        public void l(View view) {
            q3.this.u.setCustomView(view);
            this.x = new WeakReference<>(view);
        }

        @Override // com.p7700g.p99005.b4
        public void m(int i) {
            n(q3.this.o.getResources().getString(i));
        }

        @Override // com.p7700g.p99005.b4
        public void n(CharSequence charSequence) {
            q3.this.u.setSubtitle(charSequence);
        }

        @Override // com.p7700g.p99005.p4.a
        public boolean onMenuItemSelected(@x1 p4 p4Var, @x1 MenuItem menuItem) {
            b4.a aVar = this.w;
            if (aVar != null) {
                return aVar.d(this, menuItem);
            }
            return false;
        }

        @Override // com.p7700g.p99005.p4.a
        public void onMenuModeChange(@x1 p4 p4Var) {
            if (this.w == null) {
                return;
            }
            i();
            q3.this.u.showOverflowMenu();
        }

        @Override // com.p7700g.p99005.b4
        public void p(int i) {
            q(q3.this.o.getResources().getString(i));
        }

        @Override // com.p7700g.p99005.b4
        public void q(CharSequence charSequence) {
            q3.this.u.setTitle(charSequence);
        }

        @Override // com.p7700g.p99005.b4
        public void r(boolean z) {
            super.r(z);
            q3.this.u.setTitleOptional(z);
        }

        public boolean s() {
            this.v.m0();
            try {
                return this.w.b(this, this.v);
            } finally {
                this.v.l0();
            }
        }

        public void t(p4 p4Var, boolean z) {
        }

        public void u(b5 b5Var) {
        }

        public boolean v(b5 b5Var) {
            if (this.w == null) {
                return false;
            }
            if (b5Var.hasVisibleItems()) {
                new v4(q3.this.u(), b5Var).show();
                return true;
            }
            return true;
        }
    }

    /* compiled from: WindowDecorActionBar.java */
    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public class e extends z2.f {
        private z2.g b;
        private Object c;
        private Drawable d;
        private CharSequence e;
        private CharSequence f;
        private int g = -1;
        private View h;

        public e() {
        }

        @Override // com.p7700g.p99005.z2.f
        public CharSequence a() {
            return this.f;
        }

        @Override // com.p7700g.p99005.z2.f
        public View b() {
            return this.h;
        }

        @Override // com.p7700g.p99005.z2.f
        public Drawable c() {
            return this.d;
        }

        @Override // com.p7700g.p99005.z2.f
        public int d() {
            return this.g;
        }

        @Override // com.p7700g.p99005.z2.f
        public Object e() {
            return this.c;
        }

        @Override // com.p7700g.p99005.z2.f
        public CharSequence f() {
            return this.e;
        }

        @Override // com.p7700g.p99005.z2.f
        public void g() {
            q3.this.M(this);
        }

        @Override // com.p7700g.p99005.z2.f
        public z2.f h(int i) {
            return i(q3.this.o.getResources().getText(i));
        }

        @Override // com.p7700g.p99005.z2.f
        public z2.f i(CharSequence charSequence) {
            this.f = charSequence;
            int i = this.g;
            if (i >= 0) {
                q3.this.w.updateTab(i);
            }
            return this;
        }

        @Override // com.p7700g.p99005.z2.f
        public z2.f j(int i) {
            return k(LayoutInflater.from(q3.this.u()).inflate(i, (ViewGroup) null));
        }

        @Override // com.p7700g.p99005.z2.f
        public z2.f k(View view) {
            this.h = view;
            int i = this.g;
            if (i >= 0) {
                q3.this.w.updateTab(i);
            }
            return this;
        }

        @Override // com.p7700g.p99005.z2.f
        public z2.f l(int i) {
            return m(r3.b(q3.this.o, i));
        }

        @Override // com.p7700g.p99005.z2.f
        public z2.f m(Drawable drawable) {
            this.d = drawable;
            int i = this.g;
            if (i >= 0) {
                q3.this.w.updateTab(i);
            }
            return this;
        }

        @Override // com.p7700g.p99005.z2.f
        public z2.f n(z2.g gVar) {
            this.b = gVar;
            return this;
        }

        @Override // com.p7700g.p99005.z2.f
        public z2.f o(Object obj) {
            this.c = obj;
            return this;
        }

        @Override // com.p7700g.p99005.z2.f
        public z2.f p(int i) {
            return q(q3.this.o.getResources().getText(i));
        }

        @Override // com.p7700g.p99005.z2.f
        public z2.f q(CharSequence charSequence) {
            this.e = charSequence;
            int i = this.g;
            if (i >= 0) {
                q3.this.w.updateTab(i);
            }
            return this;
        }

        public z2.g r() {
            return this.b;
        }

        public void s(int i) {
            this.g = i;
        }
    }

    public q3(Activity activity, boolean z) {
        this.q = activity;
        View decorView = activity.getWindow().getDecorView();
        K0(decorView);
        if (z) {
            return;
        }
        this.v = decorView.findViewById(16908290);
    }

    private void A0() {
        if (this.y != null) {
            M(null);
        }
        this.x.clear();
        ScrollingTabContainerView scrollingTabContainerView = this.w;
        if (scrollingTabContainerView != null) {
            scrollingTabContainerView.removeAllTabs();
        }
        this.z = -1;
    }

    private void C0(z2.f fVar, int i2) {
        e eVar = (e) fVar;
        if (eVar.r() != null) {
            eVar.s(i2);
            this.x.add(i2, eVar);
            int size = this.x.size();
            while (true) {
                i2++;
                if (i2 >= size) {
                    return;
                }
                this.x.get(i2).s(i2);
            }
        } else {
            throw new IllegalStateException("Action Bar Tab must have a Callback");
        }
    }

    private void F0() {
        if (this.w != null) {
            return;
        }
        ScrollingTabContainerView scrollingTabContainerView = new ScrollingTabContainerView(this.o);
        if (this.G) {
            scrollingTabContainerView.setVisibility(0);
            this.t.setEmbeddedTabView(scrollingTabContainerView);
        } else {
            if (o() == 2) {
                scrollingTabContainerView.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.r;
                if (actionBarOverlayLayout != null) {
                    sr.u1(actionBarOverlayLayout);
                }
            } else {
                scrollingTabContainerView.setVisibility(8);
            }
            this.s.setTabContainer(scrollingTabContainerView);
        }
        this.w = scrollingTabContainerView;
    }

    private DecorToolbar G0(View view) {
        if (view instanceof DecorToolbar) {
            return (DecorToolbar) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder G = wo1.G("Can't make a decor toolbar out of ");
        G.append(view != null ? view.getClass().getSimpleName() : pg1.d);
        throw new IllegalStateException(G.toString());
    }

    private void J0() {
        if (this.L) {
            this.L = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.r;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            O0(false);
        }
    }

    private void K0(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(x2.g.x);
        this.r = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.t = G0(view.findViewById(x2.g.a));
        this.u = (ActionBarContextView) view.findViewById(x2.g.h);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(x2.g.c);
        this.s = actionBarContainer;
        DecorToolbar decorToolbar = this.t;
        if (decorToolbar != null && this.u != null && actionBarContainer != null) {
            this.o = decorToolbar.getContext();
            boolean z = (this.t.getDisplayOptions() & 4) != 0;
            if (z) {
                this.A = true;
            }
            a4 b2 = a4.b(this.o);
            g0(b2.a() || z);
            L0(b2.g());
            TypedArray obtainStyledAttributes = this.o.obtainStyledAttributes(null, x2.m.a, x2.b.f, 0);
            if (obtainStyledAttributes.getBoolean(x2.m.p, false)) {
                b0(true);
            }
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(x2.m.n, 0);
            if (dimensionPixelSize != 0) {
                Z(dimensionPixelSize);
            }
            obtainStyledAttributes.recycle();
            return;
        }
        throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
    }

    private void L0(boolean z) {
        this.G = z;
        if (!z) {
            this.t.setEmbeddedTabView(null);
            this.s.setTabContainer(this.w);
        } else {
            this.s.setTabContainer(null);
            this.t.setEmbeddedTabView(this.w);
        }
        boolean z2 = true;
        boolean z3 = o() == 2;
        ScrollingTabContainerView scrollingTabContainerView = this.w;
        if (scrollingTabContainerView != null) {
            if (z3) {
                scrollingTabContainerView.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.r;
                if (actionBarOverlayLayout != null) {
                    sr.u1(actionBarOverlayLayout);
                }
            } else {
                scrollingTabContainerView.setVisibility(8);
            }
        }
        this.t.setCollapsible(!this.G && z3);
        this.r.setHasNonEmbeddedTabs((this.G || !z3) ? false : false);
    }

    private boolean M0() {
        return sr.T0(this.s);
    }

    private void N0() {
        if (this.L) {
            return;
        }
        this.L = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.r;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setShowingForActionMode(true);
        }
        O0(false);
    }

    private void O0(boolean z) {
        if (z0(this.J, this.K, this.L)) {
            if (this.M) {
                return;
            }
            this.M = true;
            E0(z);
        } else if (this.M) {
            this.M = false;
            D0(z);
        }
    }

    public static boolean z0(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        return (z || z2) ? false : true;
    }

    @Override // com.p7700g.p99005.z2
    public boolean A() {
        DecorToolbar decorToolbar = this.t;
        return decorToolbar != null && decorToolbar.isTitleTruncated();
    }

    @Override // com.p7700g.p99005.z2
    public z2.f B() {
        return new e();
    }

    public void B0() {
        b4.a aVar = this.D;
        if (aVar != null) {
            aVar.a(this.C);
            this.C = null;
            this.D = null;
        }
    }

    @Override // com.p7700g.p99005.z2
    public void C(Configuration configuration) {
        L0(a4.b(this.o).g());
    }

    public void D0(boolean z) {
        View view;
        int[] iArr;
        h4 h4Var = this.N;
        if (h4Var != null) {
            h4Var.a();
        }
        if (this.H == 0 && (this.O || z)) {
            this.s.setAlpha(1.0f);
            this.s.setTransitioning(true);
            h4 h4Var2 = new h4();
            float f = -this.s.getHeight();
            if (z) {
                this.s.getLocationInWindow(new int[]{0, 0});
                f -= iArr[1];
            }
            yr A = sr.f(this.s).A(f);
            A.w(this.S);
            h4Var2.c(A);
            if (this.I && (view = this.v) != null) {
                h4Var2.c(sr.f(view).A(f));
            }
            h4Var2.f(j);
            h4Var2.e(250L);
            h4Var2.g(this.Q);
            this.N = h4Var2;
            h4Var2.h();
            return;
        }
        this.Q.onAnimationEnd(null);
    }

    @Override // com.p7700g.p99005.z2
    public boolean E(int i2, KeyEvent keyEvent) {
        Menu c2;
        d dVar = this.B;
        if (dVar == null || (c2 = dVar.c()) == null) {
            return false;
        }
        c2.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return c2.performShortcut(i2, keyEvent, 0);
    }

    public void E0(boolean z) {
        View view;
        View view2;
        int[] iArr;
        h4 h4Var = this.N;
        if (h4Var != null) {
            h4Var.a();
        }
        this.s.setVisibility(0);
        if (this.H == 0 && (this.O || z)) {
            this.s.setTranslationY(0.0f);
            float f = -this.s.getHeight();
            if (z) {
                this.s.getLocationInWindow(new int[]{0, 0});
                f -= iArr[1];
            }
            this.s.setTranslationY(f);
            h4 h4Var2 = new h4();
            yr A = sr.f(this.s).A(0.0f);
            A.w(this.S);
            h4Var2.c(A);
            if (this.I && (view2 = this.v) != null) {
                view2.setTranslationY(f);
                h4Var2.c(sr.f(this.v).A(0.0f));
            }
            h4Var2.f(k);
            h4Var2.e(250L);
            h4Var2.g(this.R);
            this.N = h4Var2;
            h4Var2.h();
        } else {
            this.s.setAlpha(1.0f);
            this.s.setTranslationY(0.0f);
            if (this.I && (view = this.v) != null) {
                view.setTranslationY(0.0f);
            }
            this.R.onAnimationEnd(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.r;
        if (actionBarOverlayLayout != null) {
            sr.u1(actionBarOverlayLayout);
        }
    }

    @Override // com.p7700g.p99005.z2
    public void H() {
        A0();
    }

    public boolean H0() {
        return this.t.hasIcon();
    }

    @Override // com.p7700g.p99005.z2
    public void I(z2.d dVar) {
        this.F.remove(dVar);
    }

    public boolean I0() {
        return this.t.hasLogo();
    }

    @Override // com.p7700g.p99005.z2
    public void J(z2.f fVar) {
        K(fVar.d());
    }

    @Override // com.p7700g.p99005.z2
    public void K(int i2) {
        if (this.w == null) {
            return;
        }
        e eVar = this.y;
        int d2 = eVar != null ? eVar.d() : this.z;
        this.w.removeTabAt(i2);
        e remove = this.x.remove(i2);
        if (remove != null) {
            remove.s(-1);
        }
        int size = this.x.size();
        for (int i3 = i2; i3 < size; i3++) {
            this.x.get(i3).s(i3);
        }
        if (d2 == i2) {
            M(this.x.isEmpty() ? null : this.x.get(Math.max(0, i2 - 1)));
        }
    }

    @Override // com.p7700g.p99005.z2
    public boolean L() {
        ViewGroup viewGroup = this.t.getViewGroup();
        if (viewGroup == null || viewGroup.hasFocus()) {
            return false;
        }
        viewGroup.requestFocus();
        return true;
    }

    @Override // com.p7700g.p99005.z2
    public void M(z2.f fVar) {
        if (o() != 2) {
            this.z = fVar != null ? fVar.d() : -1;
            return;
        }
        dy w = (!(this.q instanceof hx) || this.t.getViewGroup().isInEditMode()) ? null : ((hx) this.q).L().r().w();
        e eVar = this.y;
        if (eVar != fVar) {
            this.w.setTabSelected(fVar != null ? fVar.d() : -1);
            e eVar2 = this.y;
            if (eVar2 != null) {
                eVar2.r().b(this.y, w);
            }
            e eVar3 = (e) fVar;
            this.y = eVar3;
            if (eVar3 != null) {
                eVar3.r().a(this.y, w);
            }
        } else if (eVar != null) {
            eVar.r().c(this.y, w);
            this.w.animateToTab(fVar.d());
        }
        if (w == null || w.A()) {
            return;
        }
        w.q();
    }

    @Override // com.p7700g.p99005.z2
    public void N(Drawable drawable) {
        this.s.setPrimaryBackground(drawable);
    }

    @Override // com.p7700g.p99005.z2
    public void O(int i2) {
        P(LayoutInflater.from(u()).inflate(i2, this.t.getViewGroup(), false));
    }

    @Override // com.p7700g.p99005.z2
    public void P(View view) {
        this.t.setCustomView(view);
    }

    @Override // com.p7700g.p99005.z2
    public void Q(View view, z2.b bVar) {
        view.setLayoutParams(bVar);
        this.t.setCustomView(view);
    }

    @Override // com.p7700g.p99005.z2
    public void R(boolean z) {
        if (this.A) {
            return;
        }
        S(z);
    }

    @Override // com.p7700g.p99005.z2
    public void S(boolean z) {
        U(z ? 4 : 0, 4);
    }

    @Override // com.p7700g.p99005.z2
    public void T(int i2) {
        if ((i2 & 4) != 0) {
            this.A = true;
        }
        this.t.setDisplayOptions(i2);
    }

    @Override // com.p7700g.p99005.z2
    public void U(int i2, int i3) {
        int displayOptions = this.t.getDisplayOptions();
        if ((i3 & 4) != 0) {
            this.A = true;
        }
        this.t.setDisplayOptions((i2 & i3) | ((~i3) & displayOptions));
    }

    @Override // com.p7700g.p99005.z2
    public void V(boolean z) {
        U(z ? 16 : 0, 16);
    }

    @Override // com.p7700g.p99005.z2
    public void W(boolean z) {
        U(z ? 2 : 0, 2);
    }

    @Override // com.p7700g.p99005.z2
    public void X(boolean z) {
        U(z ? 8 : 0, 8);
    }

    @Override // com.p7700g.p99005.z2
    public void Y(boolean z) {
        U(z ? 1 : 0, 1);
    }

    @Override // com.p7700g.p99005.z2
    public void Z(float f) {
        sr.M1(this.s, f);
    }

    @Override // com.p7700g.p99005.z2
    public void a(z2.d dVar) {
        this.F.add(dVar);
    }

    @Override // com.p7700g.p99005.z2
    public void a0(int i2) {
        if (i2 != 0 && !this.r.isInOverlayMode()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to set a non-zero hide offset");
        }
        this.r.setActionBarHideOffset(i2);
    }

    @Override // com.p7700g.p99005.z2
    public void b(z2.f fVar) {
        e(fVar, this.x.isEmpty());
    }

    @Override // com.p7700g.p99005.z2
    public void b0(boolean z) {
        if (z && !this.r.isInOverlayMode()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.P = z;
        this.r.setHideOnContentScrollEnabled(z);
    }

    @Override // com.p7700g.p99005.z2
    public void c(z2.f fVar, int i2) {
        d(fVar, i2, this.x.isEmpty());
    }

    @Override // com.p7700g.p99005.z2
    public void c0(int i2) {
        this.t.setNavigationContentDescription(i2);
    }

    @Override // com.p7700g.p99005.z2
    public void d(z2.f fVar, int i2, boolean z) {
        F0();
        this.w.addTab(fVar, i2, z);
        C0(fVar, i2);
        if (z) {
            M(fVar);
        }
    }

    @Override // com.p7700g.p99005.z2
    public void d0(CharSequence charSequence) {
        this.t.setNavigationContentDescription(charSequence);
    }

    @Override // com.p7700g.p99005.z2
    public void e(z2.f fVar, boolean z) {
        F0();
        this.w.addTab(fVar, z);
        C0(fVar, this.x.size());
        if (z) {
            M(fVar);
        }
    }

    @Override // com.p7700g.p99005.z2
    public void e0(int i2) {
        this.t.setNavigationIcon(i2);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    public void enableContentAnimations(boolean z) {
        this.I = z;
    }

    @Override // com.p7700g.p99005.z2
    public void f0(Drawable drawable) {
        this.t.setNavigationIcon(drawable);
    }

    @Override // com.p7700g.p99005.z2
    public boolean g() {
        DecorToolbar decorToolbar = this.t;
        if (decorToolbar == null || !decorToolbar.hasExpandedActionView()) {
            return false;
        }
        this.t.collapseActionView();
        return true;
    }

    @Override // com.p7700g.p99005.z2
    public void g0(boolean z) {
        this.t.setHomeButtonEnabled(z);
    }

    @Override // com.p7700g.p99005.z2
    public void h(boolean z) {
        if (z == this.E) {
            return;
        }
        this.E = z;
        int size = this.F.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.F.get(i2).a(z);
        }
    }

    @Override // com.p7700g.p99005.z2
    public void h0(int i2) {
        this.t.setIcon(i2);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    public void hideForSystem() {
        if (this.K) {
            return;
        }
        this.K = true;
        O0(true);
    }

    @Override // com.p7700g.p99005.z2
    public View i() {
        return this.t.getCustomView();
    }

    @Override // com.p7700g.p99005.z2
    public void i0(Drawable drawable) {
        this.t.setIcon(drawable);
    }

    @Override // com.p7700g.p99005.z2
    public int j() {
        return this.t.getDisplayOptions();
    }

    @Override // com.p7700g.p99005.z2
    public void j0(SpinnerAdapter spinnerAdapter, z2.e eVar) {
        this.t.setDropdownParams(spinnerAdapter, new l3(eVar));
    }

    @Override // com.p7700g.p99005.z2
    public float k() {
        return sr.Q(this.s);
    }

    @Override // com.p7700g.p99005.z2
    public void k0(int i2) {
        this.t.setLogo(i2);
    }

    @Override // com.p7700g.p99005.z2
    public int l() {
        return this.s.getHeight();
    }

    @Override // com.p7700g.p99005.z2
    public void l0(Drawable drawable) {
        this.t.setLogo(drawable);
    }

    @Override // com.p7700g.p99005.z2
    public int m() {
        return this.r.getActionBarHideOffset();
    }

    @Override // com.p7700g.p99005.z2
    public void m0(int i2) {
        ActionBarOverlayLayout actionBarOverlayLayout;
        int navigationMode = this.t.getNavigationMode();
        if (navigationMode == 2) {
            this.z = p();
            M(null);
            this.w.setVisibility(8);
        }
        if (navigationMode != i2 && !this.G && (actionBarOverlayLayout = this.r) != null) {
            sr.u1(actionBarOverlayLayout);
        }
        this.t.setNavigationMode(i2);
        boolean z = false;
        if (i2 == 2) {
            F0();
            this.w.setVisibility(0);
            int i3 = this.z;
            if (i3 != -1) {
                n0(i3);
                this.z = -1;
            }
        }
        this.t.setCollapsible(i2 == 2 && !this.G);
        ActionBarOverlayLayout actionBarOverlayLayout2 = this.r;
        if (i2 == 2 && !this.G) {
            z = true;
        }
        actionBarOverlayLayout2.setHasNonEmbeddedTabs(z);
    }

    @Override // com.p7700g.p99005.z2
    public int n() {
        int navigationMode = this.t.getNavigationMode();
        if (navigationMode != 1) {
            if (navigationMode != 2) {
                return 0;
            }
            return this.x.size();
        }
        return this.t.getDropdownItemCount();
    }

    @Override // com.p7700g.p99005.z2
    public void n0(int i2) {
        int navigationMode = this.t.getNavigationMode();
        if (navigationMode == 1) {
            this.t.setDropdownSelectedPosition(i2);
        } else if (navigationMode == 2) {
            M(this.x.get(i2));
        } else {
            throw new IllegalStateException("setSelectedNavigationIndex not valid for current navigation mode");
        }
    }

    @Override // com.p7700g.p99005.z2
    public int o() {
        return this.t.getNavigationMode();
    }

    @Override // com.p7700g.p99005.z2
    public void o0(boolean z) {
        h4 h4Var;
        this.O = z;
        if (z || (h4Var = this.N) == null) {
            return;
        }
        h4Var.a();
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    public void onContentScrollStarted() {
        h4 h4Var = this.N;
        if (h4Var != null) {
            h4Var.a();
            this.N = null;
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    public void onContentScrollStopped() {
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    public void onWindowVisibilityChanged(int i2) {
        this.H = i2;
    }

    @Override // com.p7700g.p99005.z2
    public int p() {
        e eVar;
        int navigationMode = this.t.getNavigationMode();
        if (navigationMode != 1) {
            if (navigationMode == 2 && (eVar = this.y) != null) {
                return eVar.d();
            }
            return -1;
        }
        return this.t.getDropdownSelectedPosition();
    }

    @Override // com.p7700g.p99005.z2
    public void p0(Drawable drawable) {
    }

    @Override // com.p7700g.p99005.z2
    public z2.f q() {
        return this.y;
    }

    @Override // com.p7700g.p99005.z2
    public void q0(Drawable drawable) {
        this.s.setStackedBackground(drawable);
    }

    @Override // com.p7700g.p99005.z2
    public CharSequence r() {
        return this.t.getSubtitle();
    }

    @Override // com.p7700g.p99005.z2
    public void r0(int i2) {
        s0(this.o.getString(i2));
    }

    @Override // com.p7700g.p99005.z2
    public z2.f s(int i2) {
        return this.x.get(i2);
    }

    @Override // com.p7700g.p99005.z2
    public void s0(CharSequence charSequence) {
        this.t.setSubtitle(charSequence);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    public void showForSystem() {
        if (this.K) {
            this.K = false;
            O0(true);
        }
    }

    @Override // com.p7700g.p99005.z2
    public int t() {
        return this.x.size();
    }

    @Override // com.p7700g.p99005.z2
    public void t0(int i2) {
        u0(this.o.getString(i2));
    }

    @Override // com.p7700g.p99005.z2
    public Context u() {
        if (this.p == null) {
            TypedValue typedValue = new TypedValue();
            this.o.getTheme().resolveAttribute(x2.b.k, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                this.p = new ContextThemeWrapper(this.o, i2);
            } else {
                this.p = this.o;
            }
        }
        return this.p;
    }

    @Override // com.p7700g.p99005.z2
    public void u0(CharSequence charSequence) {
        this.t.setTitle(charSequence);
    }

    @Override // com.p7700g.p99005.z2
    public CharSequence v() {
        return this.t.getTitle();
    }

    @Override // com.p7700g.p99005.z2
    public void v0(CharSequence charSequence) {
        this.t.setWindowTitle(charSequence);
    }

    @Override // com.p7700g.p99005.z2
    public void w() {
        if (this.J) {
            return;
        }
        this.J = true;
        O0(false);
    }

    @Override // com.p7700g.p99005.z2
    public void w0() {
        if (this.J) {
            this.J = false;
            O0(false);
        }
    }

    @Override // com.p7700g.p99005.z2
    public b4 x0(b4.a aVar) {
        d dVar = this.B;
        if (dVar != null) {
            dVar.a();
        }
        this.r.setHideOnContentScrollEnabled(false);
        this.u.killMode();
        d dVar2 = new d(this.u.getContext(), aVar);
        if (dVar2.s()) {
            this.B = dVar2;
            dVar2.i();
            this.u.initForMode(dVar2);
            y0(true);
            return dVar2;
        }
        return null;
    }

    @Override // com.p7700g.p99005.z2
    public boolean y() {
        return this.r.isHideOnContentScrollEnabled();
    }

    public void y0(boolean z) {
        yr yrVar;
        yr yrVar2;
        if (z) {
            N0();
        } else {
            J0();
        }
        if (!M0()) {
            if (z) {
                this.t.setVisibility(4);
                this.u.setVisibility(0);
                return;
            }
            this.t.setVisibility(0);
            this.u.setVisibility(8);
            return;
        }
        if (z) {
            yrVar2 = this.t.setupAnimatorToVisibility(4, 100L);
            yrVar = this.u.setupAnimatorToVisibility(0, n);
        } else {
            yrVar = this.t.setupAnimatorToVisibility(0, n);
            yrVar2 = this.u.setupAnimatorToVisibility(8, 100L);
        }
        h4 h4Var = new h4();
        h4Var.d(yrVar2, yrVar);
        h4Var.h();
    }

    @Override // com.p7700g.p99005.z2
    public boolean z() {
        int l2 = l();
        return this.M && (l2 == 0 || m() < l2);
    }

    public q3(Dialog dialog) {
        K0(dialog.getWindow().getDecorView());
    }

    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    public q3(View view) {
        K0(view);
    }
}