package com.p7700g.p99005;

import android.content.Context;
import android.view.SubMenu;
import com.p7700g.p99005.i2;

/* compiled from: NavigationMenu.java */
@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class qe2 extends p4 {
    public qe2(Context context) {
        super(context);
    }

    @Override // com.p7700g.p99005.p4, android.view.Menu
    @x1
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        s4 s4Var = (s4) a(i, i2, i3, charSequence);
        se2 se2Var = new se2(x(), this, s4Var);
        s4Var.A(se2Var);
        return se2Var;
    }
}