package com.p7700g.p99005;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* compiled from: ScreenStateObserver.java */
/* loaded from: classes2.dex */
public class mf1 extends BroadcastReceiver {
    @z1
    private xa1<Boolean> a;

    public void a(@x1 Context context, @z1 xa1<Boolean> xa1Var) {
        this.a = xa1Var;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        context.registerReceiver(this, intentFilter);
    }

    public void b(@x1 Context context) {
        try {
            context.unregisterReceiver(this);
        } catch (Throwable unused) {
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@x1 Context context, @x1 Intent intent) {
        xa1<Boolean> xa1Var = this.a;
        if (xa1Var != null) {
            try {
                xa1Var.accept(Boolean.valueOf("android.intent.action.SCREEN_ON".equals(intent.getAction())));
            } catch (Exception unused) {
            }
        }
    }
}