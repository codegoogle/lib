package com.p7700g.p99005;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import com.p7700g.p99005.i2;

/* compiled from: NavigationBarMenu.java */
@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class qf2 extends p4 {
    @x1
    private final Class<?> Q;
    private final int R;

    public qf2(@x1 Context context, @x1 Class<?> cls, int i) {
        super(context);
        this.Q = cls;
        this.R = i;
    }

    @Override // com.p7700g.p99005.p4
    @x1
    public MenuItem a(int i, int i2, int i3, @x1 CharSequence charSequence) {
        if (size() + 1 <= this.R) {
            m0();
            MenuItem a = super.a(i, i2, i3, charSequence);
            if (a instanceof s4) {
                ((s4) a).w(true);
            }
            l0();
            return a;
        }
        String simpleName = this.Q.getSimpleName();
        StringBuilder M = wo1.M("Maximum number of items supported by ", simpleName, " is ");
        M.append(this.R);
        M.append(". Limit can be checked with ");
        M.append(simpleName);
        M.append("#getMaxItemCount()");
        throw new IllegalArgumentException(M.toString());
    }

    @Override // com.p7700g.p99005.p4, android.view.Menu
    @x1
    public SubMenu addSubMenu(int i, int i2, int i3, @x1 CharSequence charSequence) {
        throw new UnsupportedOperationException(this.Q.getSimpleName() + " does not support submenus");
    }

    public int n0() {
        return this.R;
    }
}