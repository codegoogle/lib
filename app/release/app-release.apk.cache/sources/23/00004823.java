package com.p7700g.p99005;

import android.os.Bundle;
import android.os.Parcelable;
import android.os.RemoteCallbackList;
import android.os.RemoteException;

/* compiled from: ClientNotifier.java */
/* loaded from: classes2.dex */
public class ib1 {
    @x1
    private final kj1 a;
    @x1
    private final ob1 b;
    @x1
    private final RemoteCallbackList<qm1> c = new RemoteCallbackList<>();
    @x1
    private final RemoteCallbackList<sm1> d = new RemoteCallbackList<>();
    @x1
    private final RemoteCallbackList<pm1> e = new RemoteCallbackList<>();
    @x1
    private final RemoteCallbackList<rm1> f = new RemoteCallbackList<>();

    public ib1(@x1 kj1 kj1Var, @x1 ob1 ob1Var) {
        this.a = kj1Var;
        this.b = ob1Var;
    }

    public void a(@x1 pm1 pm1Var) {
        this.e.register(pm1Var);
    }

    public void b(@x1 qm1 qm1Var) {
        this.c.register(qm1Var);
        try {
            bn1 d = this.b.d();
            qm1Var.a(d.d(), d.c());
        } catch (RemoteException e) {
            this.a.f(e);
        }
    }

    public void c(@x1 rm1 rm1Var) {
        this.f.register(rm1Var);
    }

    public void d(@x1 sm1 sm1Var) {
        this.d.register(sm1Var);
        try {
            sm1Var.m(this.b.c());
        } catch (RemoteException e) {
            this.a.f(e);
        }
    }

    public synchronized void e(@x1 en1 en1Var) {
        int beginBroadcast = this.d.beginBroadcast();
        for (int i = 0; i < beginBroadcast; i++) {
            try {
                this.d.getBroadcastItem(i).m(en1Var);
            } catch (RemoteException e) {
                this.a.f(e);
            }
        }
        this.d.finishBroadcast();
    }

    public synchronized void f(@x1 gc1 gc1Var) {
        int beginBroadcast = this.d.beginBroadcast();
        for (int i = 0; i < beginBroadcast; i++) {
            try {
                this.d.getBroadcastItem(i).X(new nm1(gc1Var));
            } catch (RemoteException e) {
                this.a.f(e);
            }
        }
        this.d.finishBroadcast();
    }

    public synchronized void g(@x1 String str) {
        int beginBroadcast = this.e.beginBroadcast();
        for (int i = 0; i < beginBroadcast; i++) {
            try {
                this.e.getBroadcastItem(i).f(str);
            } catch (RemoteException e) {
                this.a.f(e);
            }
        }
        this.e.finishBroadcast();
    }

    public synchronized void h(long j, long j2) {
        this.b.m(j, j2);
        int beginBroadcast = this.c.beginBroadcast();
        for (int i = 0; i < beginBroadcast; i++) {
            try {
                this.c.getBroadcastItem(i).a(j, j2);
            } catch (RemoteException e) {
                this.a.f(e);
            }
        }
        this.c.finishBroadcast();
    }

    public void i(@x1 Parcelable parcelable) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("arg", parcelable);
        int beginBroadcast = this.f.beginBroadcast();
        for (int i = 0; i < beginBroadcast; i++) {
            try {
                this.f.getBroadcastItem(i).J1(bundle);
            } catch (RemoteException e) {
                this.a.f(e);
            }
        }
        this.f.finishBroadcast();
    }

    public void j(@x1 pm1 pm1Var) {
        this.e.unregister(pm1Var);
    }

    public void k(@x1 qm1 qm1Var) {
        this.c.unregister(qm1Var);
    }

    public void l(@x1 rm1 rm1Var) {
        this.f.unregister(rm1Var);
    }

    public void m(@x1 sm1 sm1Var) {
        this.d.unregister(sm1Var);
    }
}