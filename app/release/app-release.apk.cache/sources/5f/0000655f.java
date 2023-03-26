package com.p7700g.p99005;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.p7700g.p99005.i2;

/* compiled from: BroadcastReceiverConstraintTracker.java */
@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public abstract class xd0<T> extends yd0<T> {
    private static final String g = tb0.f("BrdcstRcvrCnstrntTrckr");
    private final BroadcastReceiver h;

    /* compiled from: BroadcastReceiverConstraintTracker.java */
    /* loaded from: classes.dex */
    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                xd0.this.h(context, intent);
            }
        }
    }

    public xd0(@x1 Context context, @x1 cg0 taskExecutor) {
        super(context, taskExecutor);
        this.h = new a();
    }

    @Override // com.p7700g.p99005.yd0
    public void e() {
        tb0.c().a(g, String.format("%s: registering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.c.registerReceiver(this.h, g());
    }

    @Override // com.p7700g.p99005.yd0
    public void f() {
        tb0.c().a(g, String.format("%s: unregistering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.c.unregisterReceiver(this.h);
    }

    public abstract IntentFilter g();

    public abstract void h(Context context, @x1 Intent intent);
}