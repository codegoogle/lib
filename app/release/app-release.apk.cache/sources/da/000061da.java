package com.p7700g.p99005;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.anchorfree.vpnsdk.vpnservice.AFVpnService;
import com.p7700g.p99005.tm1;

/* compiled from: RemoteServiceSource.java */
/* loaded from: classes2.dex */
public class vi1 {
    @x1
    private final kj1 a;
    @x1
    private final xa1<tm1> b;
    @x1
    private final xa1<tm1> c;
    @z1
    private c d;
    @z1
    private eq0<tm1> e;

    /* compiled from: RemoteServiceSource.java */
    /* loaded from: classes2.dex */
    public static final class b {
        @x1
        private xa1<tm1> a;
        @x1
        private xa1<tm1> b;

        @x1
        public b c(@x1 xa1<tm1> xa1Var) {
            this.b = xa1Var;
            return this;
        }

        @x1
        public b d(@x1 xa1<tm1> xa1Var) {
            this.a = xa1Var;
            return this;
        }

        @x1
        public vi1 e() {
            return new vi1(this);
        }

        private b() {
            this.a = ya1.a();
            this.b = ya1.a();
        }
    }

    /* compiled from: RemoteServiceSource.java */
    /* loaded from: classes2.dex */
    public class c implements ServiceConnection {
        private c() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(@x1 ComponentName componentName, @x1 IBinder iBinder) {
            if (vi1.this.d != this || vi1.this.e == null) {
                return;
            }
            tm1 N1 = tm1.b.N1(iBinder);
            if (!vi1.this.e.g(N1)) {
                vi1.this.e = new eq0();
                vi1.this.e.d(N1);
            }
            vi1 vi1Var = vi1.this;
            vi1Var.g(vi1Var.c);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(@x1 ComponentName componentName) {
            if (vi1.this.d != this || vi1.this.e == null) {
                return;
            }
            vi1 vi1Var = vi1.this;
            vi1Var.g(vi1Var.b);
            vi1.this.e.e();
            vi1.this.e = null;
        }
    }

    @x1
    public static b i() {
        return new b();
    }

    @x1
    public synchronized dq0<tm1> f(@x1 Context context) {
        if (this.e == null) {
            this.e = new eq0<>();
            this.d = new c();
            if (!context.bindService(new Intent(context, AFVpnService.class), this.d, 1)) {
                this.e.f(new dc1());
                eq0<tm1> eq0Var = this.e;
                this.e = null;
                return eq0Var.a();
            }
        }
        return this.e.a();
    }

    public void g(@x1 xa1<tm1> xa1Var) {
        tm1 F;
        eq0<tm1> eq0Var = this.e;
        if (eq0Var == null || (F = eq0Var.a().F()) == null) {
            return;
        }
        try {
            xa1Var.accept(F);
        } catch (Exception e) {
            this.a.f(e);
        }
    }

    @x1
    public <T> T h(@x1 T t, @x1 za1<tm1, T> za1Var) {
        tm1 F;
        eq0<tm1> eq0Var = this.e;
        if (eq0Var != null && (F = eq0Var.a().F()) != null) {
            try {
                return za1Var.apply(F);
            } catch (Exception e) {
                this.a.f(e);
            }
        }
        return t;
    }

    private vi1(@x1 b bVar) {
        this.a = kj1.b("RemoteServiceSource");
        this.b = bVar.a;
        this.c = bVar.b;
    }
}