package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.SpinnerAdapter;
import androidx.appcompat.widget.DecorToolbar;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ToolbarWidgetWrapper;
import com.p7700g.p99005.g3;
import com.p7700g.p99005.p4;
import com.p7700g.p99005.w4;
import com.p7700g.p99005.z2;
import java.util.ArrayList;

/* compiled from: ToolbarActionBar.java */
/* loaded from: classes.dex */
public class n3 extends z2 {
    public final DecorToolbar i;
    public final Window.Callback j;
    public final g3.i k;
    public boolean l;
    private boolean m;
    private boolean n;
    private ArrayList<z2.d> o = new ArrayList<>();
    private final Runnable p = new a();
    private final Toolbar.OnMenuItemClickListener q;

    /* compiled from: ToolbarActionBar.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            n3.this.z0();
        }
    }

    /* compiled from: ToolbarActionBar.java */
    /* loaded from: classes.dex */
    public class b implements Toolbar.OnMenuItemClickListener {
        public b() {
        }

        @Override // androidx.appcompat.widget.Toolbar.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            return n3.this.j.onMenuItemSelected(0, menuItem);
        }
    }

    /* compiled from: ToolbarActionBar.java */
    /* loaded from: classes.dex */
    public final class c implements w4.a {
        private boolean s;

        public c() {
        }

        @Override // com.p7700g.p99005.w4.a
        public void onCloseMenu(@x1 p4 p4Var, boolean z) {
            if (this.s) {
                return;
            }
            this.s = true;
            n3.this.i.dismissPopupMenus();
            n3.this.j.onPanelClosed(108, p4Var);
            this.s = false;
        }

        @Override // com.p7700g.p99005.w4.a
        public boolean onOpenSubMenu(@x1 p4 p4Var) {
            n3.this.j.onMenuOpened(108, p4Var);
            return true;
        }
    }

    /* compiled from: ToolbarActionBar.java */
    /* loaded from: classes.dex */
    public final class d implements p4.a {
        public d() {
        }

        @Override // com.p7700g.p99005.p4.a
        public boolean onMenuItemSelected(@x1 p4 p4Var, @x1 MenuItem menuItem) {
            return false;
        }

        @Override // com.p7700g.p99005.p4.a
        public void onMenuModeChange(@x1 p4 p4Var) {
            if (n3.this.i.isOverflowMenuShowing()) {
                n3.this.j.onPanelClosed(108, p4Var);
            } else if (n3.this.j.onPreparePanel(0, null, p4Var)) {
                n3.this.j.onMenuOpened(108, p4Var);
            }
        }
    }

    /* compiled from: ToolbarActionBar.java */
    /* loaded from: classes.dex */
    public class e implements g3.i {
        public e() {
        }

        @Override // com.p7700g.p99005.g3.i
        public boolean a(int i) {
            if (i == 0) {
                n3 n3Var = n3.this;
                if (n3Var.l) {
                    return false;
                }
                n3Var.i.setMenuPrepared();
                n3.this.l = true;
                return false;
            }
            return false;
        }

        @Override // com.p7700g.p99005.g3.i
        public View onCreatePanelView(int i) {
            if (i == 0) {
                return new View(n3.this.i.getContext());
            }
            return null;
        }
    }

    public n3(@x1 Toolbar toolbar, @z1 CharSequence charSequence, @x1 Window.Callback callback) {
        b bVar = new b();
        this.q = bVar;
        jp.l(toolbar);
        ToolbarWidgetWrapper toolbarWidgetWrapper = new ToolbarWidgetWrapper(toolbar, false);
        this.i = toolbarWidgetWrapper;
        this.j = (Window.Callback) jp.l(callback);
        toolbarWidgetWrapper.setWindowCallback(callback);
        toolbar.setOnMenuItemClickListener(bVar);
        toolbarWidgetWrapper.setWindowTitle(charSequence);
        this.k = new e();
    }

    private Menu y0() {
        if (!this.m) {
            this.i.setMenuCallbacks(new c(), new d());
            this.m = true;
        }
        return this.i.getMenu();
    }

    @Override // com.p7700g.p99005.z2
    public boolean A() {
        return super.A();
    }

    @Override // com.p7700g.p99005.z2
    public z2.f B() {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // com.p7700g.p99005.z2
    public void C(Configuration configuration) {
        super.C(configuration);
    }

    @Override // com.p7700g.p99005.z2
    public void D() {
        this.i.getViewGroup().removeCallbacks(this.p);
    }

    @Override // com.p7700g.p99005.z2
    public boolean E(int i, KeyEvent keyEvent) {
        Menu y0 = y0();
        if (y0 != null) {
            y0.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
            return y0.performShortcut(i, keyEvent, 0);
        }
        return false;
    }

    @Override // com.p7700g.p99005.z2
    public boolean F(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            G();
        }
        return true;
    }

    @Override // com.p7700g.p99005.z2
    public boolean G() {
        return this.i.showOverflowMenu();
    }

    @Override // com.p7700g.p99005.z2
    public void H() {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // com.p7700g.p99005.z2
    public void I(z2.d dVar) {
        this.o.remove(dVar);
    }

    @Override // com.p7700g.p99005.z2
    public void J(z2.f fVar) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // com.p7700g.p99005.z2
    public void K(int i) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // com.p7700g.p99005.z2
    public boolean L() {
        ViewGroup viewGroup = this.i.getViewGroup();
        if (viewGroup == null || viewGroup.hasFocus()) {
            return false;
        }
        viewGroup.requestFocus();
        return true;
    }

    @Override // com.p7700g.p99005.z2
    public void M(z2.f fVar) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // com.p7700g.p99005.z2
    public void N(@z1 Drawable drawable) {
        this.i.setBackgroundDrawable(drawable);
    }

    @Override // com.p7700g.p99005.z2
    public void O(int i) {
        P(LayoutInflater.from(this.i.getContext()).inflate(i, this.i.getViewGroup(), false));
    }

    @Override // com.p7700g.p99005.z2
    public void P(View view) {
        Q(view, new z2.b(-2, -2));
    }

    @Override // com.p7700g.p99005.z2
    public void Q(View view, z2.b bVar) {
        if (view != null) {
            view.setLayoutParams(bVar);
        }
        this.i.setCustomView(view);
    }

    @Override // com.p7700g.p99005.z2
    public void R(boolean z) {
    }

    @Override // com.p7700g.p99005.z2
    public void S(boolean z) {
        U(z ? 4 : 0, 4);
    }

    @Override // com.p7700g.p99005.z2
    @SuppressLint({"WrongConstant"})
    public void T(int i) {
        U(i, -1);
    }

    @Override // com.p7700g.p99005.z2
    public void U(int i, int i2) {
        this.i.setDisplayOptions((i & i2) | ((~i2) & this.i.getDisplayOptions()));
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
        sr.M1(this.i.getViewGroup(), f);
    }

    @Override // com.p7700g.p99005.z2
    public void a(z2.d dVar) {
        this.o.add(dVar);
    }

    @Override // com.p7700g.p99005.z2
    public void b(z2.f fVar) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // com.p7700g.p99005.z2
    public void c(z2.f fVar, int i) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // com.p7700g.p99005.z2
    public void c0(int i) {
        this.i.setNavigationContentDescription(i);
    }

    @Override // com.p7700g.p99005.z2
    public void d(z2.f fVar, int i, boolean z) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // com.p7700g.p99005.z2
    public void d0(CharSequence charSequence) {
        this.i.setNavigationContentDescription(charSequence);
    }

    @Override // com.p7700g.p99005.z2
    public void e(z2.f fVar, boolean z) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // com.p7700g.p99005.z2
    public void e0(int i) {
        this.i.setNavigationIcon(i);
    }

    @Override // com.p7700g.p99005.z2
    public boolean f() {
        return this.i.hideOverflowMenu();
    }

    @Override // com.p7700g.p99005.z2
    public void f0(Drawable drawable) {
        this.i.setNavigationIcon(drawable);
    }

    @Override // com.p7700g.p99005.z2
    public boolean g() {
        if (this.i.hasExpandedActionView()) {
            this.i.collapseActionView();
            return true;
        }
        return false;
    }

    @Override // com.p7700g.p99005.z2
    public void g0(boolean z) {
    }

    @Override // com.p7700g.p99005.z2
    public void h(boolean z) {
        if (z == this.n) {
            return;
        }
        this.n = z;
        int size = this.o.size();
        for (int i = 0; i < size; i++) {
            this.o.get(i).a(z);
        }
    }

    @Override // com.p7700g.p99005.z2
    public void h0(int i) {
        this.i.setIcon(i);
    }

    @Override // com.p7700g.p99005.z2
    public View i() {
        return this.i.getCustomView();
    }

    @Override // com.p7700g.p99005.z2
    public void i0(Drawable drawable) {
        this.i.setIcon(drawable);
    }

    @Override // com.p7700g.p99005.z2
    public int j() {
        return this.i.getDisplayOptions();
    }

    @Override // com.p7700g.p99005.z2
    public void j0(SpinnerAdapter spinnerAdapter, z2.e eVar) {
        this.i.setDropdownParams(spinnerAdapter, new l3(eVar));
    }

    @Override // com.p7700g.p99005.z2
    public float k() {
        return sr.Q(this.i.getViewGroup());
    }

    @Override // com.p7700g.p99005.z2
    public void k0(int i) {
        this.i.setLogo(i);
    }

    @Override // com.p7700g.p99005.z2
    public int l() {
        return this.i.getHeight();
    }

    @Override // com.p7700g.p99005.z2
    public void l0(Drawable drawable) {
        this.i.setLogo(drawable);
    }

    @Override // com.p7700g.p99005.z2
    public void m0(int i) {
        if (i != 2) {
            this.i.setNavigationMode(i);
            return;
        }
        throw new IllegalArgumentException("Tabs not supported in this configuration");
    }

    @Override // com.p7700g.p99005.z2
    public int n() {
        return 0;
    }

    @Override // com.p7700g.p99005.z2
    public void n0(int i) {
        if (this.i.getNavigationMode() == 1) {
            this.i.setDropdownSelectedPosition(i);
            return;
        }
        throw new IllegalStateException("setSelectedNavigationIndex not valid for current navigation mode");
    }

    @Override // com.p7700g.p99005.z2
    public int o() {
        return 0;
    }

    @Override // com.p7700g.p99005.z2
    public void o0(boolean z) {
    }

    @Override // com.p7700g.p99005.z2
    public int p() {
        return -1;
    }

    @Override // com.p7700g.p99005.z2
    public void p0(Drawable drawable) {
    }

    @Override // com.p7700g.p99005.z2
    public z2.f q() {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // com.p7700g.p99005.z2
    public void q0(Drawable drawable) {
    }

    @Override // com.p7700g.p99005.z2
    public CharSequence r() {
        return this.i.getSubtitle();
    }

    @Override // com.p7700g.p99005.z2
    public void r0(int i) {
        DecorToolbar decorToolbar = this.i;
        decorToolbar.setSubtitle(i != 0 ? decorToolbar.getContext().getText(i) : null);
    }

    @Override // com.p7700g.p99005.z2
    public z2.f s(int i) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // com.p7700g.p99005.z2
    public void s0(CharSequence charSequence) {
        this.i.setSubtitle(charSequence);
    }

    @Override // com.p7700g.p99005.z2
    public int t() {
        return 0;
    }

    @Override // com.p7700g.p99005.z2
    public void t0(int i) {
        DecorToolbar decorToolbar = this.i;
        decorToolbar.setTitle(i != 0 ? decorToolbar.getContext().getText(i) : null);
    }

    @Override // com.p7700g.p99005.z2
    public Context u() {
        return this.i.getContext();
    }

    @Override // com.p7700g.p99005.z2
    public void u0(CharSequence charSequence) {
        this.i.setTitle(charSequence);
    }

    @Override // com.p7700g.p99005.z2
    public CharSequence v() {
        return this.i.getTitle();
    }

    @Override // com.p7700g.p99005.z2
    public void v0(CharSequence charSequence) {
        this.i.setWindowTitle(charSequence);
    }

    @Override // com.p7700g.p99005.z2
    public void w() {
        this.i.setVisibility(8);
    }

    @Override // com.p7700g.p99005.z2
    public void w0() {
        this.i.setVisibility(0);
    }

    @Override // com.p7700g.p99005.z2
    public boolean x() {
        this.i.getViewGroup().removeCallbacks(this.p);
        sr.o1(this.i.getViewGroup(), this.p);
        return true;
    }

    @Override // com.p7700g.p99005.z2
    public boolean z() {
        return this.i.getVisibility() == 0;
    }

    public void z0() {
        Menu y0 = y0();
        p4 p4Var = y0 instanceof p4 ? (p4) y0 : null;
        if (p4Var != null) {
            p4Var.m0();
        }
        try {
            y0.clear();
            if (!this.j.onCreatePanelMenu(0, y0) || !this.j.onPreparePanel(0, null, y0)) {
                y0.clear();
            }
        } finally {
            if (p4Var != null) {
                p4Var.l0();
            }
        }
    }
}