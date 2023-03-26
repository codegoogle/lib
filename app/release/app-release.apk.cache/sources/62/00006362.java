package com.p7700g.p99005;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.anythink.expressad.foundation.c.d;
import com.p7700g.p99005.i2;

/* compiled from: BatteryNotLowTracker.java */
@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class wd0 extends xd0<Boolean> {
    private static final String i = tb0.f("BatteryNotLowTracker");
    public static final float j = 0.15f;

    public wd0(@x1 Context context, @x1 cg0 taskExecutor) {
        super(context, taskExecutor);
    }

    @Override // com.p7700g.p99005.xd0
    public IntentFilter g() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
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
        if (action.equals("android.intent.action.BATTERY_OKAY")) {
            d(Boolean.TRUE);
        } else if (action.equals("android.intent.action.BATTERY_LOW")) {
            d(Boolean.FALSE);
        }
    }

    @Override // com.p7700g.p99005.yd0
    /* renamed from: i */
    public Boolean b() {
        Intent registerReceiver = this.c.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z = false;
        if (registerReceiver == null) {
            tb0.c().b(i, "getInitialState - null intent received", new Throwable[0]);
            return null;
        }
        return Boolean.valueOf((registerReceiver.getIntExtra("status", -1) == 1 || ((float) registerReceiver.getIntExtra(d.a.w, -1)) / ((float) registerReceiver.getIntExtra("scale", -1)) > 0.15f) ? true : true);
    }
}