package com.p7700g.p99005;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.VectorEnabledTintResources;
import com.p7700g.p99005.a3;
import com.p7700g.p99005.b4;
import com.p7700g.p99005.f60;
import com.p7700g.p99005.zg;

/* compiled from: AppCompatActivity.java */
/* loaded from: classes.dex */
public class d3 extends hx implements e3, zg.b, a3.c {
    private static final String Q = "androidx:appcompat";
    private f3 R;
    private Resources S;

    /* compiled from: AppCompatActivity.java */
    /* loaded from: classes.dex */
    public class a implements f60.c {
        public a() {
        }

        @Override // com.p7700g.p99005.f60.c
        @x1
        public Bundle a() {
            Bundle bundle = new Bundle();
            d3.this.c0().B(bundle);
            return bundle;
        }
    }

    /* compiled from: AppCompatActivity.java */
    /* loaded from: classes.dex */
    public class b implements c0 {
        public b() {
        }

        @Override // com.p7700g.p99005.c0
        public void a(@x1 Context context) {
            f3 c0 = d3.this.c0();
            c0.s();
            c0.x(d3.this.getSavedStateRegistry().a(d3.Q));
        }
    }

    public d3() {
        e0();
    }

    private void E() {
        r00.b(getWindow().getDecorView(), this);
        t00.b(getWindow().getDecorView(), this);
        i60.b(getWindow().getDecorView(), this);
    }

    private void e0() {
        getSavedStateRegistry().j(Q, new a());
        v(new b());
    }

    private boolean k0(KeyEvent keyEvent) {
        Window window;
        return (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) ? false : true;
    }

    @Override // com.p7700g.p99005.hx
    public void Z() {
        c0().t();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        E();
        c0().b(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(c0().f(context));
    }

    @Override // com.p7700g.p99005.a3.c
    @z1
    public a3.b b() {
        return c0().n();
    }

    @x1
    public f3 c0() {
        if (this.R == null) {
            this.R = f3.g(this, this);
        }
        return this.R;
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        z2 d0 = d0();
        if (getWindow().hasFeature(0)) {
            if (d0 == null || !d0.f()) {
                super.closeOptionsMenu();
            }
        }
    }

    @z1
    public z2 d0() {
        return c0().q();
    }

    @Override // com.p7700g.p99005.bg, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        z2 d0 = d0();
        if (keyCode == 82 && d0 != null && d0.F(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // com.p7700g.p99005.e3
    @t0
    public void e(@x1 b4 b4Var) {
    }

    @Override // com.p7700g.p99005.e3
    @t0
    public void f(@x1 b4 b4Var) {
    }

    public void f0(@x1 zg zgVar) {
        zgVar.c(this);
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(@m1 int i) {
        return (T) c0().l(i);
    }

    public void g0(int i) {
    }

    @Override // android.app.Activity
    @x1
    public MenuInflater getMenuInflater() {
        return c0().p();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.S == null && VectorEnabledTintResources.shouldBeUsed()) {
            this.S = new VectorEnabledTintResources(this, super.getResources());
        }
        Resources resources = this.S;
        return resources == null ? super.getResources() : resources;
    }

    public void h0(@x1 zg zgVar) {
    }

    @Deprecated
    public void i0() {
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        c0().t();
    }

    public boolean j0() {
        Intent o = o();
        if (o != null) {
            if (t0(o)) {
                zg f = zg.f(this);
                f0(f);
                h0(f);
                f.t();
                try {
                    sf.v(this);
                    return true;
                } catch (IllegalStateException unused) {
                    finish();
                    return true;
                }
            }
            r0(o);
            return true;
        }
        return false;
    }

    public void l0(@z1 Toolbar toolbar) {
        c0().O(toolbar);
    }

    @Deprecated
    public void m0(int i) {
    }

    @Deprecated
    public void n0(boolean z) {
    }

    @Override // com.p7700g.p99005.zg.b
    @z1
    public Intent o() {
        return gg.a(this);
    }

    @Deprecated
    public void o0(boolean z) {
    }

    @Override // com.p7700g.p99005.hx, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@x1 Configuration configuration) {
        super.onConfigurationChanged(configuration);
        c0().w(configuration);
        if (this.S != null) {
            this.S.updateConfiguration(super.getResources().getConfiguration(), super.getResources().getDisplayMetrics());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        i0();
    }

    @Override // com.p7700g.p99005.hx, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        c0().y();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (k0(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // com.p7700g.p99005.hx, androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, @x1 MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        z2 d0 = d0();
        if (menuItem.getItemId() != 16908332 || d0 == null || (d0.j() & 4) == 0) {
            return false;
        }
        return j0();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    @Override // com.p7700g.p99005.hx, androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, @x1 Menu menu) {
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onPostCreate(@z1 Bundle bundle) {
        super.onPostCreate(bundle);
        c0().z(bundle);
    }

    @Override // com.p7700g.p99005.hx, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        c0().A();
    }

    @Override // com.p7700g.p99005.hx, android.app.Activity
    public void onStart() {
        super.onStart();
        c0().C();
    }

    @Override // com.p7700g.p99005.hx, android.app.Activity
    public void onStop() {
        super.onStop();
        c0().D();
    }

    @Override // android.app.Activity
    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        c0().Q(charSequence);
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        z2 d0 = d0();
        if (getWindow().hasFeature(0)) {
            if (d0 == null || !d0.G()) {
                super.openOptionsMenu();
            }
        }
    }

    @Deprecated
    public void p0(boolean z) {
    }

    @Override // com.p7700g.p99005.e3
    @z1
    public b4 q(@x1 b4.a aVar) {
        return null;
    }

    @z1
    public b4 q0(@x1 b4.a aVar) {
        return c0().R(aVar);
    }

    public void r0(@x1 Intent intent) {
        gg.g(this, intent);
    }

    public boolean s0(int i) {
        return c0().G(i);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(@s1 int i) {
        E();
        c0().I(i);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(@m2 int i) {
        super.setTheme(i);
        c0().P(i);
    }

    public boolean t0(@x1 Intent intent) {
        return gg.h(this, intent);
    }

    @z0
    public d3(@s1 int i) {
        super(i);
        e0();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        E();
        c0().J(view);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        E();
        c0().K(view, layoutParams);
    }
}