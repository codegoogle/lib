package com.p7700g.p99005;

import android.content.Context;

/* compiled from: BatteryNotLowController.java */
/* loaded from: classes.dex */
public class md0 extends nd0<Boolean> {
    public md0(Context context, cg0 taskExecutor) {
        super(be0.c(context, taskExecutor).b());
    }

    @Override // com.p7700g.p99005.nd0
    public boolean b(@x1 we0 workSpec) {
        return workSpec.m.f();
    }

    @Override // com.p7700g.p99005.nd0
    /* renamed from: i */
    public boolean c(@x1 Boolean isBatteryNotLow) {
        return !isBatteryNotLow.booleanValue();
    }
}