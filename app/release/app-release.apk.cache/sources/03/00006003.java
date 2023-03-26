package com.p7700g.p99005;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.p7700g.p99005.ah;
import com.p7700g.p99005.bh;

/* compiled from: UnusedAppRestrictionsBackportServiceConnection.java */
/* loaded from: classes.dex */
public class uh implements ServiceConnection {
    @x1
    public d8<Integer> t;
    private final Context u;
    @r2
    @z1
    public bh s = null;
    private boolean v = false;

    /* compiled from: UnusedAppRestrictionsBackportServiceConnection.java */
    /* loaded from: classes.dex */
    public class a extends ah.b {
        public a() {
        }

        @Override // com.p7700g.p99005.ah
        public void q1(boolean z, boolean z2) throws RemoteException {
            if (!z) {
                uh.this.t.q(0);
            } else if (z2) {
                uh.this.t.q(3);
            } else {
                uh.this.t.q(2);
            }
        }
    }

    public uh(@x1 Context context) {
        this.u = context;
    }

    private ah c() {
        return new a();
    }

    public void a(@x1 d8<Integer> d8Var) {
        if (!this.v) {
            this.v = true;
            this.t = d8Var;
            this.u.bindService(new Intent(th.s).setPackage(oh.b(this.u.getPackageManager())), this, 1);
            return;
        }
        throw new IllegalStateException("Each UnusedAppRestrictionsBackportServiceConnection can only be bound once.");
    }

    public void b() {
        if (this.v) {
            this.v = false;
            this.u.unbindService(this);
            return;
        }
        throw new IllegalStateException("bindService must be called before unbind");
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        bh N1 = bh.b.N1(iBinder);
        this.s = N1;
        try {
            N1.a0(c());
        } catch (RemoteException unused) {
            this.t.q(0);
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        this.s = null;
    }
}