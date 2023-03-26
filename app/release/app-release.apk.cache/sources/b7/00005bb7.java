package com.p7700g.p99005;

import android.content.Context;

/* compiled from: StorageNotLowController.java */
/* loaded from: classes.dex */
public class sd0 extends nd0<Boolean> {
    public sd0(@x1 Context context, @x1 cg0 taskExecutor) {
        super(be0.c(context, taskExecutor).e());
    }

    @Override // com.p7700g.p99005.nd0
    public boolean b(@x1 we0 workSpec) {
        return workSpec.m.i();
    }

    @Override // com.p7700g.p99005.nd0
    /* renamed from: i */
    public boolean c(@x1 Boolean isStorageNotLow) {
        return !isStorageNotLow.booleanValue();
    }
}