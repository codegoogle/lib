package com.p7700g.p99005;

import android.content.Context;
import android.os.Build;

/* compiled from: NetworkConnectedController.java */
/* loaded from: classes.dex */
public class od0 extends nd0<id0> {
    public od0(Context context, cg0 taskExecutor) {
        super(be0.c(context, taskExecutor).d());
    }

    @Override // com.p7700g.p99005.nd0
    public boolean b(@x1 we0 workSpec) {
        return workSpec.m.b() == ub0.CONNECTED;
    }

    @Override // com.p7700g.p99005.nd0
    /* renamed from: i */
    public boolean c(@x1 id0 state) {
        if (Build.VERSION.SDK_INT >= 26) {
            return (state.a() && state.d()) ? false : true;
        }
        return !state.a();
    }
}