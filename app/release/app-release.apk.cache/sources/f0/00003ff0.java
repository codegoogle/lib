package com.p7700g.p99005;

import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.p7700g.p99005.b;
import com.p7700g.p99005.i2;

/* compiled from: CustomTabsSessionToken.java */
/* loaded from: classes.dex */
public class e6 {
    private static final String a = "CustomTabsSessionToken";
    @z1
    public final com.p7700g.p99005.b b;
    @z1
    private final PendingIntent c;
    @z1
    private final y5 d;

    /* compiled from: CustomTabsSessionToken.java */
    /* loaded from: classes.dex */
    public class a extends y5 {
        public a() {
        }

        @Override // com.p7700g.p99005.y5
        public void a(@x1 String str, @z1 Bundle bundle) {
            try {
                e6.this.b.X0(str, bundle);
            } catch (RemoteException unused) {
            }
        }

        @Override // com.p7700g.p99005.y5
        @x1
        public Bundle b(@x1 String str, @z1 Bundle bundle) {
            try {
                return e6.this.b.b0(str, bundle);
            } catch (RemoteException unused) {
                return null;
            }
        }

        @Override // com.p7700g.p99005.y5
        public void c(@z1 Bundle bundle) {
            try {
                e6.this.b.A1(bundle);
            } catch (RemoteException unused) {
            }
        }

        @Override // com.p7700g.p99005.y5
        public void d(int i, @z1 Bundle bundle) {
            try {
                e6.this.b.k1(i, bundle);
            } catch (RemoteException unused) {
            }
        }

        @Override // com.p7700g.p99005.y5
        public void e(@x1 String str, @z1 Bundle bundle) {
            try {
                e6.this.b.w(str, bundle);
            } catch (RemoteException unused) {
            }
        }

        @Override // com.p7700g.p99005.y5
        public void f(int i, @x1 Uri uri, boolean z, @z1 Bundle bundle) {
            try {
                e6.this.b.D1(i, uri, z, bundle);
            } catch (RemoteException unused) {
            }
        }
    }

    /* compiled from: CustomTabsSessionToken.java */
    /* loaded from: classes.dex */
    public static class b extends b.AbstractBinderC0147b {
        @Override // com.p7700g.p99005.b
        public void A1(Bundle bundle) {
        }

        @Override // com.p7700g.p99005.b
        public void D1(int i, Uri uri, boolean z, Bundle bundle) {
        }

        @Override // com.p7700g.p99005.b
        public void X0(String str, Bundle bundle) {
        }

        @Override // com.p7700g.p99005.b.AbstractBinderC0147b, android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // com.p7700g.p99005.b
        public Bundle b0(String str, Bundle bundle) {
            return null;
        }

        @Override // com.p7700g.p99005.b
        public void k1(int i, Bundle bundle) {
        }

        @Override // com.p7700g.p99005.b
        public void w(String str, Bundle bundle) {
        }
    }

    public e6(@z1 com.p7700g.p99005.b bVar, @z1 PendingIntent pendingIntent) {
        if (bVar == null && pendingIntent == null) {
            throw new IllegalStateException("CustomTabsSessionToken must have either a session id or a callback (or both).");
        }
        this.b = bVar;
        this.c = pendingIntent;
        this.d = bVar == null ? null : new a();
    }

    @x1
    public static e6 a() {
        return new e6(new b(), null);
    }

    private IBinder d() {
        com.p7700g.p99005.b bVar = this.b;
        if (bVar != null) {
            return bVar.asBinder();
        }
        throw new IllegalStateException("CustomTabSessionToken must have valid binder or pending session");
    }

    @z1
    public static e6 f(@x1 Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return null;
        }
        IBinder a2 = ag.a(extras, a6.b);
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra(a6.c);
        if (a2 == null && pendingIntent == null) {
            return null;
        }
        return new e6(a2 != null ? b.AbstractBinderC0147b.N1(a2) : null, pendingIntent);
    }

    @z1
    public y5 b() {
        return this.d;
    }

    @z1
    public IBinder c() {
        com.p7700g.p99005.b bVar = this.b;
        if (bVar == null) {
            return null;
        }
        return bVar.asBinder();
    }

    @z1
    public PendingIntent e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj instanceof e6) {
            e6 e6Var = (e6) obj;
            PendingIntent e = e6Var.e();
            PendingIntent pendingIntent = this.c;
            if ((pendingIntent == null) != (e == null)) {
                return false;
            }
            if (pendingIntent != null) {
                return pendingIntent.equals(e);
            }
            return d().equals(e6Var.d());
        }
        return false;
    }

    @i2({i2.a.LIBRARY})
    public boolean g() {
        return this.b != null;
    }

    @i2({i2.a.LIBRARY})
    public boolean h() {
        return this.c != null;
    }

    public int hashCode() {
        PendingIntent pendingIntent = this.c;
        return pendingIntent != null ? pendingIntent.hashCode() : d().hashCode();
    }

    public boolean i(@x1 d6 d6Var) {
        return d6Var.d().equals(this.b);
    }
}