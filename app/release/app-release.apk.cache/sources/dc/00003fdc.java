package com.p7700g.p99005;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import com.p7700g.p99005.b4;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.p4;
import java.lang.ref.WeakReference;

/* compiled from: StandaloneActionMode.java */
@i2({i2.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class e4 extends b4 implements p4.a {
    private p4 A;
    private Context u;
    private ActionBarContextView v;
    private b4.a w;
    private WeakReference<View> x;
    private boolean y;
    private boolean z;

    public e4(Context context, ActionBarContextView actionBarContextView, b4.a aVar, boolean z) {
        this.u = context;
        this.v = actionBarContextView;
        this.w = aVar;
        p4 Z = new p4(actionBarContextView.getContext()).Z(1);
        this.A = Z;
        Z.X(this);
        this.z = z;
    }

    @Override // com.p7700g.p99005.b4
    public void a() {
        if (this.y) {
            return;
        }
        this.y = true;
        this.w.a(this);
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
        return this.A;
    }

    @Override // com.p7700g.p99005.b4
    public MenuInflater d() {
        return new g4(this.v.getContext());
    }

    @Override // com.p7700g.p99005.b4
    public CharSequence e() {
        return this.v.getSubtitle();
    }

    @Override // com.p7700g.p99005.b4
    public CharSequence g() {
        return this.v.getTitle();
    }

    @Override // com.p7700g.p99005.b4
    public void i() {
        this.w.c(this, this.A);
    }

    @Override // com.p7700g.p99005.b4
    public boolean j() {
        return this.v.isTitleOptional();
    }

    @Override // com.p7700g.p99005.b4
    public boolean k() {
        return this.z;
    }

    @Override // com.p7700g.p99005.b4
    public void l(View view) {
        this.v.setCustomView(view);
        this.x = view != null ? new WeakReference<>(view) : null;
    }

    @Override // com.p7700g.p99005.b4
    public void m(int i) {
        n(this.u.getString(i));
    }

    @Override // com.p7700g.p99005.b4
    public void n(CharSequence charSequence) {
        this.v.setSubtitle(charSequence);
    }

    @Override // com.p7700g.p99005.p4.a
    public boolean onMenuItemSelected(@x1 p4 p4Var, @x1 MenuItem menuItem) {
        return this.w.d(this, menuItem);
    }

    @Override // com.p7700g.p99005.p4.a
    public void onMenuModeChange(@x1 p4 p4Var) {
        i();
        this.v.showOverflowMenu();
    }

    @Override // com.p7700g.p99005.b4
    public void p(int i) {
        q(this.u.getString(i));
    }

    @Override // com.p7700g.p99005.b4
    public void q(CharSequence charSequence) {
        this.v.setTitle(charSequence);
    }

    @Override // com.p7700g.p99005.b4
    public void r(boolean z) {
        super.r(z);
        this.v.setTitleOptional(z);
    }

    public void s(p4 p4Var, boolean z) {
    }

    public void t(b5 b5Var) {
    }

    public boolean u(b5 b5Var) {
        if (b5Var.hasVisibleItems()) {
            new v4(this.v.getContext(), b5Var).show();
            return true;
        }
        return true;
    }
}