package com.p7700g.p99005;

import android.content.Context;
import android.os.Build;

/* compiled from: NetworkMeteredController.java */
/* loaded from: classes.dex */
public class pd0 extends nd0<id0> {
    private static final String e = tb0.f("NetworkMeteredCtrlr");

    public pd0(Context context, cg0 taskExecutor) {
        super(be0.c(context, taskExecutor).d());
    }

    @Override // com.p7700g.p99005.nd0
    public boolean b(@x1 we0 workSpec) {
        return workSpec.m.b() == ub0.METERED;
    }

    @Override // com.p7700g.p99005.nd0
    /* renamed from: i */
    public boolean c(@x1 id0 state) {
        if (Build.VERSION.SDK_INT >= 26) {
            return (state.a() && state.b()) ? false : true;
        }
        tb0.c().a(e, "Metered network constraint is not supported before API 26, only checking for connected state.", new Throwable[0]);
        return !state.a();
    }
}