package com.p7700g.p99005;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.p7700g.p99005.b;
import com.p7700g.p99005.d;
import com.p7700g.p99005.i2;

/* compiled from: PostMessageServiceConnection.java */
/* loaded from: classes.dex */
public abstract class h6 implements f6, ServiceConnection {
    private static final String s = "PostMessageServConn";
    private final Object t = new Object();
    private final b u;
    @z1
    private d v;
    @z1
    private String w;
    private boolean x;

    public h6(@x1 e6 e6Var) {
        IBinder c = e6Var.c();
        if (c != null) {
            this.u = b.AbstractBinderC0147b.N1(c);
            return;
        }
        throw new IllegalArgumentException("Provided session must have binder.");
    }

    private boolean f() {
        return this.v != null;
    }

    private boolean h(@z1 Bundle bundle) {
        if (this.v == null) {
            return false;
        }
        synchronized (this.t) {
            try {
                try {
                    this.v.o0(this.u, bundle);
                } catch (RemoteException unused) {
                    return false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    @Override // com.p7700g.p99005.f6
    @i2({i2.a.LIBRARY})
    public void a(@x1 Context context) {
        m(context);
    }

    @Override // com.p7700g.p99005.f6
    @i2({i2.a.LIBRARY})
    public final boolean b(@z1 Bundle bundle) {
        return g(bundle);
    }

    @i2({i2.a.LIBRARY})
    public boolean c(@x1 Context context) {
        String str = this.w;
        if (str != null) {
            return d(context, str);
        }
        throw new IllegalStateException("setPackageName must be called before bindSessionToPostMessageService.");
    }

    public boolean d(@x1 Context context, @x1 String str) {
        Intent intent = new Intent();
        intent.setClassName(str, g6.class.getName());
        return context.bindService(intent, this, 1);
    }

    @i2({i2.a.LIBRARY})
    public void e(@x1 Context context) {
        if (f()) {
            m(context);
        }
    }

    public final boolean g(@z1 Bundle bundle) {
        this.x = true;
        return h(bundle);
    }

    public void i() {
        if (this.x) {
            h(null);
        }
    }

    public void j() {
    }

    public final boolean k(@x1 String str, @z1 Bundle bundle) {
        if (this.v == null) {
            return false;
        }
        synchronized (this.t) {
            try {
                try {
                    this.v.y0(this.u, str, bundle);
                } catch (RemoteException unused) {
                    return false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    @i2({i2.a.LIBRARY})
    public void l(@x1 String str) {
        this.w = str;
    }

    public void m(@x1 Context context) {
        if (f()) {
            context.unbindService(this);
            this.v = null;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(@x1 ComponentName componentName, @x1 IBinder iBinder) {
        this.v = d.b.N1(iBinder);
        i();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(@x1 ComponentName componentName) {
        this.v = null;
        j();
    }

    @Override // com.p7700g.p99005.f6
    @i2({i2.a.LIBRARY})
    public final boolean w(@x1 String str, @z1 Bundle bundle) {
        return k(str, bundle);
    }
}