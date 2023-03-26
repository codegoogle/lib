package com.p7700g.p99005;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.p4;

/* compiled from: SubMenuBuilder.java */
@i2({i2.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class b5 extends p4 implements SubMenu {
    private p4 Q;
    private s4 R;

    public b5(Context context, p4 p4Var, s4 s4Var) {
        super(context);
        this.Q = p4Var;
        this.R = s4Var;
    }

    @Override // com.p7700g.p99005.p4
    public p4 G() {
        return this.Q.G();
    }

    @Override // com.p7700g.p99005.p4
    public boolean I() {
        return this.Q.I();
    }

    @Override // com.p7700g.p99005.p4
    public boolean J() {
        return this.Q.J();
    }

    @Override // com.p7700g.p99005.p4
    public boolean K() {
        return this.Q.K();
    }

    @Override // com.p7700g.p99005.p4
    public void X(p4.a aVar) {
        this.Q.X(aVar);
    }

    @Override // com.p7700g.p99005.p4
    public boolean g(s4 s4Var) {
        return this.Q.g(s4Var);
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return this.R;
    }

    @Override // com.p7700g.p99005.p4
    public boolean i(@x1 p4 p4Var, @x1 MenuItem menuItem) {
        return super.i(p4Var, menuItem) || this.Q.i(p4Var, menuItem);
    }

    @Override // com.p7700g.p99005.p4
    public void j0(boolean z) {
        this.Q.j0(z);
    }

    @Override // com.p7700g.p99005.p4
    public boolean n(s4 s4Var) {
        return this.Q.n(s4Var);
    }

    public Menu n0() {
        return this.Q;
    }

    @Override // com.p7700g.p99005.p4, com.p7700g.p99005.tk, android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.Q.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.c0(drawable);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.f0(charSequence);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        return (SubMenu) super.g0(view);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.R.setIcon(drawable);
        return this;
    }

    @Override // com.p7700g.p99005.p4, android.view.Menu
    public void setQwertyMode(boolean z) {
        this.Q.setQwertyMode(z);
    }

    @Override // com.p7700g.p99005.p4
    public String w() {
        s4 s4Var = this.R;
        int itemId = s4Var != null ? s4Var.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        return super.w() + ":" + itemId;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i) {
        return (SubMenu) super.b0(i);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i) {
        return (SubMenu) super.e0(i);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i) {
        this.R.setIcon(i);
        return this;
    }
}