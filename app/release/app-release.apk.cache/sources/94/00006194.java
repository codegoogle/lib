package com.p7700g.p99005;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.p7700g.p99005.i2;

/* compiled from: BatteryChargingTracker.java */
@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class vd0 extends xd0<Boolean> {
    private static final String i = tb0.f("BatteryChrgTracker");

    public vd0(@x1 Context context, @x1 cg0 taskExecutor) {
        super(context, taskExecutor);
    }

    private boolean j(Intent intent) {
        if (Build.VERSION.SDK_INT >= 23) {
            int intExtra = intent.getIntExtra("status", -1);
            if (intExtra == 2 || intExtra == 5) {
                return true;
            }
        } else if (intent.getIntExtra("plugged", 0) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.p7700g.p99005.xd0
    public IntentFilter g() {
        IntentFilter intentFilter = new IntentFilter();
        if (Build.VERSION.SDK_INT >= 23) {
            intentFilter.addAction("android.os.action.CHARGING");
            intentFilter.addAction("android.os.action.DISCHARGING");
        } else {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        }
        return intentFilter;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
        if (r6.equals("android.os.action.DISCHARGING") == false) goto L7;
     */
    @Override // com.p7700g.p99005.xd0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void h(Context context, @x1 Intent intent) {
        String action = intent.getAction();
        if (action == null) {
            return;
        }
        char c = 1;
        tb0.c().a(i, String.format("Received %s", action), new Throwable[0]);
        switch (action.hashCode()) {
            case -1886648615:
                if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -54942926:
                break;
            case 948344062:
                if (action.equals("android.os.action.CHARGING")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1019184907:
                if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                d(Boolean.FALSE);
                return;
            case 1:
                d(Boolean.FALSE);
                return;
            case 2:
                d(Boolean.TRUE);
                return;
            case 3:
                d(Boolean.TRUE);
                return;
            default:
                return;
        }
    }

    @Override // com.p7700g.p99005.yd0
    /* renamed from: i */
    public Boolean b() {
        Intent registerReceiver = this.c.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            tb0.c().b(i, "getInitialState - null intent received", new Throwable[0]);
            return null;
        }
        return Boolean.valueOf(j(registerReceiver));
    }
}