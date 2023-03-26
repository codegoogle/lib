package com.p7700g.p99005;

import android.content.Context;
import android.view.View;
import com.p7700g.p99005.ls;

/* compiled from: ClickActionDelegate.java */
/* loaded from: classes3.dex */
public class zi2 extends fq {
    private final ls.a d;

    public zi2(Context context, int i) {
        this.d = new ls.a(16, context.getString(i));
    }

    @Override // com.p7700g.p99005.fq
    public void g(View view, ls lsVar) {
        super.g(view, lsVar);
        lsVar.b(this.d);
    }
}