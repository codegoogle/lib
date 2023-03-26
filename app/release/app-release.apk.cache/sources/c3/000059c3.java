package com.p7700g.p99005;

import android.content.Context;
import android.os.Build;

/* compiled from: NetworkUnmeteredController.java */
/* loaded from: classes.dex */
public class rd0 extends nd0<id0> {
    public rd0(@x1 Context context, @x1 cg0 taskExecutor) {
        super(be0.c(context, taskExecutor).d());
    }

    @Override // com.p7700g.p99005.nd0
    public boolean b(@x1 we0 workSpec) {
        return workSpec.m.b() == ub0.UNMETERED || (Build.VERSION.SDK_INT >= 30 && workSpec.m.b() == ub0.TEMPORARILY_UNMETERED);
    }

    @Override // com.p7700g.p99005.nd0
    /* renamed from: i */
    public boolean c(@x1 id0 state) {
        return !state.a() || state.b();
    }
}