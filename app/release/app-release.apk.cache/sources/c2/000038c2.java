package com.p7700g.p99005;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.p7700g.p99005.i2;

/* compiled from: StorageNotLowTracker.java */
@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class ae0 extends xd0<Boolean> {
    private static final String i = tb0.f("StorageNotLowTracker");

    public ae0(@x1 Context context, @x1 cg0 taskExecutor) {
        super(context, taskExecutor);
    }

    @Override // com.p7700g.p99005.xd0
    public IntentFilter g() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }

    @Override // com.p7700g.p99005.xd0
    public void h(Context context, @x1 Intent intent) {
        if (intent.getAction() == null) {
            return;
        }
        tb0.c().a(i, String.format("Received %s", intent.getAction()), new Throwable[0]);
        String action = intent.getAction();
        action.hashCode();
        if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
            d(Boolean.FALSE);
        } else if (action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
            d(Boolean.TRUE);
        }
    }

    @Override // com.p7700g.p99005.yd0
    /* renamed from: i */
    public Boolean b() {
        Intent registerReceiver = this.c.registerReceiver(null, g());
        if (registerReceiver != null && registerReceiver.getAction() != null) {
            String action = registerReceiver.getAction();
            action.hashCode();
            if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                return Boolean.FALSE;
            }
            if (action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                return Boolean.TRUE;
            }
            return null;
        }
        return Boolean.TRUE;
    }
}