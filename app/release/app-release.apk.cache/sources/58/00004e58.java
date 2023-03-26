package com.p7700g.p99005;

import android.content.Context;

/* compiled from: BatteryChargingController.java */
/* loaded from: classes.dex */
public class ld0 extends nd0<Boolean> {
    public ld0(Context context, cg0 taskExecutor) {
        super(be0.c(context, taskExecutor).a());
    }

    @Override // com.p7700g.p99005.nd0
    public boolean b(@x1 we0 workSpec) {
        return workSpec.m.g();
    }

    @Override // com.p7700g.p99005.nd0
    /* renamed from: i */
    public boolean c(@x1 Boolean isBatteryCharging) {
        return !isBatteryCharging.booleanValue();
    }
}