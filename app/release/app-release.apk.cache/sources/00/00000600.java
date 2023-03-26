package com.anythink.core.common.b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.p7700g.p99005.q10;

/* loaded from: classes2.dex */
public final class k {
    private static k b;
    public Context a;

    private k(Context context) {
        this.a = context;
    }

    public static synchronized k a(Context context) {
        k kVar;
        synchronized (k.class) {
            if (b == null) {
                b = new k(context.getApplicationContext());
            }
            kVar = b;
        }
        return kVar;
    }

    public final void a(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            q10.b(this.a).c(broadcastReceiver, intentFilter);
        } catch (Throwable unused) {
        }
        try {
            q10.b(this.a).c(broadcastReceiver, intentFilter);
        } catch (Throwable unused2) {
        }
    }

    public final void a(BroadcastReceiver broadcastReceiver) {
        try {
            q10.b(this.a).f(broadcastReceiver);
        } catch (Throwable unused) {
        }
        try {
            q10.b(this.a).f(broadcastReceiver);
        } catch (Throwable unused2) {
        }
    }

    public final void a(Intent intent) {
        try {
            q10.b(this.a).d(intent);
        } catch (Throwable unused) {
        }
        try {
            q10.b(this.a).d(intent);
        } catch (Throwable unused2) {
        }
    }
}