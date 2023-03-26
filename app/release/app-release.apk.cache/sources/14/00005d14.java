package com.p7700g.p99005;

import android.view.View;
import android.view.ViewParent;
import com.p7700g.p99005.e10;

/* compiled from: ViewTreeViewModelStoreOwner.java */
/* loaded from: classes.dex */
public class t00 {
    private t00() {
    }

    @z1
    public static q00 a(@x1 View view) {
        q00 q00Var = (q00) view.getTag(e10.a.a);
        if (q00Var != null) {
            return q00Var;
        }
        ViewParent parent = view.getParent();
        while (q00Var == null && (parent instanceof View)) {
            View view2 = (View) parent;
            q00Var = (q00) view2.getTag(e10.a.a);
            parent = view2.getParent();
        }
        return q00Var;
    }

    public static void b(@x1 View view, @z1 q00 q00Var) {
        view.setTag(e10.a.a, q00Var);
    }
}