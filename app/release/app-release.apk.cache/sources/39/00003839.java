package com.p7700g.p99005;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Messenger;
import com.anchorfree.sdk.SdkNotificationService;

/* compiled from: NotificationServiceSource.java */
/* loaded from: classes.dex */
public class a41 {
    @x1
    private static final kj1 a = kj1.b("NotificationServiceSource");
    @x1
    private final Context b;
    @z1
    private eq0<Messenger> c;
    @z1
    private b d;

    /* compiled from: NotificationServiceSource.java */
    /* loaded from: classes.dex */
    public class b implements ServiceConnection {
        private b() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(@x1 ComponentName componentName, @x1 IBinder iBinder) {
            a41.a.c("onServiceConnected", new Object[0]);
            eq0 eq0Var = a41.this.c;
            if (eq0Var == null || a41.this.d != this) {
                a41.a.c("onServiceConnected source==null", new Object[0]);
                return;
            }
            a41.a.c("onServiceConnected source!=null", new Object[0]);
            eq0Var.g(new Messenger(iBinder));
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(@x1 ComponentName componentName) {
            a41.a.c("onServiceDisconnected", new Object[0]);
            a41.this.c = null;
        }
    }

    public a41(@x1 Context context) {
        this.b = context;
    }

    @x1
    public dq0<Messenger> e() {
        if (this.c == null) {
            kj1 kj1Var = a;
            kj1Var.c("bindService is null", new Object[0]);
            this.c = new eq0<>();
            this.d = new b();
            if (!this.b.bindService(new Intent(this.b, SdkNotificationService.class), this.d, 1)) {
                this.c = null;
                kj1Var.c("return task with error", new Object[0]);
                return dq0.C(new dc1());
            }
        }
        a.c("return service task %s result: %s error: %s", this.c.a(), this.c.a().F(), this.c.a().E());
        return this.c.a();
    }
}