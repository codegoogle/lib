package com.p7700g.p99005;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;

/* compiled from: BaseMenuWrapper.java */
/* loaded from: classes.dex */
public abstract class l4 {
    public final Context l;
    private y7<vk, MenuItem> m;
    private y7<wk, SubMenu> n;

    public l4(Context context) {
        this.l = context;
    }

    public final MenuItem e(MenuItem menuItem) {
        if (menuItem instanceof vk) {
            vk vkVar = (vk) menuItem;
            if (this.m == null) {
                this.m = new y7<>();
            }
            MenuItem menuItem2 = this.m.get(vkVar);
            if (menuItem2 == null) {
                t4 t4Var = new t4(this.l, vkVar);
                this.m.put(vkVar, t4Var);
                return t4Var;
            }
            return menuItem2;
        }
        return menuItem;
    }

    public final SubMenu f(SubMenu subMenu) {
        if (subMenu instanceof wk) {
            wk wkVar = (wk) subMenu;
            if (this.n == null) {
                this.n = new y7<>();
            }
            SubMenu subMenu2 = this.n.get(wkVar);
            if (subMenu2 == null) {
                c5 c5Var = new c5(this.l, wkVar);
                this.n.put(wkVar, c5Var);
                return c5Var;
            }
            return subMenu2;
        }
        return subMenu;
    }

    public final void g() {
        y7<vk, MenuItem> y7Var = this.m;
        if (y7Var != null) {
            y7Var.clear();
        }
        y7<wk, SubMenu> y7Var2 = this.n;
        if (y7Var2 != null) {
            y7Var2.clear();
        }
    }

    public final void h(int i) {
        if (this.m == null) {
            return;
        }
        int i2 = 0;
        while (i2 < this.m.size()) {
            if (this.m.n(i2).getGroupId() == i) {
                this.m.p(i2);
                i2--;
            }
            i2++;
        }
    }

    public final void i(int i) {
        if (this.m == null) {
            return;
        }
        for (int i2 = 0; i2 < this.m.size(); i2++) {
            if (this.m.n(i2).getItemId() == i) {
                this.m.p(i2);
                return;
            }
        }
    }
}