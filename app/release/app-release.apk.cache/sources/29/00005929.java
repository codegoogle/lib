package com.p7700g.p99005;

import android.view.View;
import android.view.ViewParent;
import com.p7700g.p99005.x00;

/* compiled from: ViewTreeLifecycleOwner.java */
/* loaded from: classes.dex */
public class r00 {
    private r00() {
    }

    @z1
    public static qz a(@x1 View view) {
        qz qzVar = (qz) view.getTag(x00.a.a);
        if (qzVar != null) {
            return qzVar;
        }
        ViewParent parent = view.getParent();
        while (qzVar == null && (parent instanceof View)) {
            View view2 = (View) parent;
            qzVar = (qz) view2.getTag(x00.a.a);
            parent = view2.getParent();
        }
        return qzVar;
    }

    public static void b(@x1 View view, @z1 qz qzVar) {
        view.setTag(x00.a.a, qzVar);
    }
}