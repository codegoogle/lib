package com.p7700g.p99005;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.anchorfree.ucr.UCRService;
import com.p7700g.p99005.ci3;

/* compiled from: RemoteServiceSource.java */
/* loaded from: classes2.dex */
public class o91 {
    private final kj1 a;
    @z1
    private final k91<ci3> b;
    @z1
    private final k91<ci3> c;
    @z1
    private c d;
    @z1
    private eq0<ci3> e;

    /* compiled from: RemoteServiceSource.java */
    /* loaded from: classes2.dex */
    public static final class b {
        private k91<ci3> a;
        private k91<ci3> b;

        @x1
        public b c(k91<ci3> k91Var) {
            this.b = k91Var;
            return this;
        }

        @x1
        public b d(k91<ci3> k91Var) {
            this.a = k91Var;
            return this;
        }

        @x1
        public o91 e() {
            return new o91(this);
        }

        private b() {
            this.a = l91.a();
            this.b = l91.a();
        }
    }

    /* compiled from: RemoteServiceSource.java */
    /* loaded from: classes2.dex */
    public class c implements ServiceConnection {
        private c() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(@x1 ComponentName componentName, @z1 IBinder iBinder) {
            if (o91.this.d != this || o91.this.e == null || o91.this.c == null) {
                return;
            }
            ci3 N1 = ci3.b.N1(iBinder);
            if (!o91.this.e.g(N1)) {
                o91.this.e = new eq0();
                o91.this.e.d(N1);
            }
            o91 o91Var = o91.this;
            o91Var.g(o91Var.c);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(@x1 ComponentName componentName) {
            if (o91.this.d != this || o91.this.e == null || o91.this.b == null) {
                return;
            }
            o91 o91Var = o91.this;
            o91Var.g(o91Var.b);
            o91.this.e.e();
            o91.this.e = null;
        }
    }

    @x1
    public static b i() {
        return new b();
    }

    public synchronized dq0<ci3> f(@x1 Context context) {
        if (this.e == null) {
            this.e = new eq0<>();
            this.d = new c();
            if (!context.bindService(new Intent(context, UCRService.class), this.d, 1)) {
                this.e.f(new IllegalStateException("Can not bind remote service"));
                return this.e.a();
            }
        }
        return this.e.a();
    }

    public void g(@x1 k91<ci3> k91Var) {
        ci3 F;
        eq0<ci3> eq0Var = this.e;
        if (eq0Var == null || (F = eq0Var.a().F()) == null) {
            return;
        }
        try {
            k91Var.accept(F);
        } catch (Exception e) {
            this.a.f(e);
        }
    }

    public <T> T h(@x1 T t, @x1 n91<ci3, T> n91Var) {
        ci3 F;
        eq0<ci3> eq0Var = this.e;
        if (eq0Var != null && (F = eq0Var.a().F()) != null) {
            try {
                return n91Var.apply(F);
            } catch (Exception e) {
                this.a.f(e);
            }
        }
        return t;
    }

    private o91(@x1 b bVar) {
        this.a = kj1.b("RemoteServiceSource");
        this.b = bVar.a;
        this.c = bVar.b;
    }
}