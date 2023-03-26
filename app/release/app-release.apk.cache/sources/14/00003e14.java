package com.p7700g.p99005;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.widget.RemoteViews;
import com.p7700g.p99005.c;
import com.p7700g.p99005.e6;
import com.p7700g.p99005.i2;
import java.util.List;

/* compiled from: CustomTabsSession.java */
/* loaded from: classes.dex */
public final class d6 {
    private static final String a = "CustomTabsSession";
    private final Object b = new Object();
    private final c c;
    private final com.p7700g.p99005.b d;
    private final ComponentName e;
    @z1
    private final PendingIntent f;

    /* compiled from: CustomTabsSession.java */
    /* loaded from: classes.dex */
    public static class a extends c.b {
        @Override // com.p7700g.p99005.c
        public boolean F(com.p7700g.p99005.b bVar, Uri uri, Bundle bundle, List<Bundle> list) throws RemoteException {
            return false;
        }

        @Override // com.p7700g.p99005.c
        public boolean J(com.p7700g.p99005.b bVar, int i, Uri uri, Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // com.p7700g.p99005.c
        public int N0(com.p7700g.p99005.b bVar, String str, Bundle bundle) throws RemoteException {
            return 0;
        }

        @Override // com.p7700g.p99005.c
        public boolean Q0(com.p7700g.p99005.b bVar) throws RemoteException {
            return false;
        }

        @Override // com.p7700g.p99005.c
        public boolean S0(com.p7700g.p99005.b bVar, Uri uri, Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // com.p7700g.p99005.c
        public boolean U(com.p7700g.p99005.b bVar, Uri uri, int i, Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // com.p7700g.p99005.c
        public boolean V0(com.p7700g.p99005.b bVar, Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // com.p7700g.p99005.c
        public Bundle d0(String str, Bundle bundle) throws RemoteException {
            return null;
        }

        @Override // com.p7700g.p99005.c
        public boolean g1(com.p7700g.p99005.b bVar, Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // com.p7700g.p99005.c
        public boolean n1(com.p7700g.p99005.b bVar, Uri uri) throws RemoteException {
            return false;
        }

        @Override // com.p7700g.p99005.c
        public boolean v0(long j) throws RemoteException {
            return false;
        }
    }

    /* compiled from: CustomTabsSession.java */
    @i2({i2.a.LIBRARY})
    /* loaded from: classes.dex */
    public static class b {
        @z1
        private final y5 a;
        @z1
        private final PendingIntent b;

        public b(@z1 y5 y5Var, @z1 PendingIntent pendingIntent) {
            this.a = y5Var;
            this.b = pendingIntent;
        }

        @z1
        public y5 a() {
            return this.a;
        }

        @z1
        public PendingIntent b() {
            return this.b;
        }
    }

    public d6(c cVar, com.p7700g.p99005.b bVar, ComponentName componentName, @z1 PendingIntent pendingIntent) {
        this.c = cVar;
        this.d = bVar;
        this.e = componentName;
        this.f = pendingIntent;
    }

    private void a(Bundle bundle) {
        PendingIntent pendingIntent = this.f;
        if (pendingIntent != null) {
            bundle.putParcelable(a6.c, pendingIntent);
        }
    }

    private Bundle b(@z1 Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        a(bundle2);
        return bundle2;
    }

    @x1
    @r2
    public static d6 c(@x1 ComponentName componentName) {
        return new d6(new a(), new e6.b(), componentName, null);
    }

    public IBinder d() {
        return this.d.asBinder();
    }

    public ComponentName e() {
        return this.e;
    }

    @z1
    public PendingIntent f() {
        return this.f;
    }

    public boolean g(@z1 Uri uri, @z1 Bundle bundle, @z1 List<Bundle> list) {
        try {
            return this.c.F(this.d, uri, b(bundle), list);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public int h(@x1 String str, @z1 Bundle bundle) {
        int N0;
        Bundle b2 = b(bundle);
        synchronized (this.b) {
            try {
                try {
                    N0 = this.c.N0(this.d, str, b2);
                } catch (RemoteException unused) {
                    return -2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return N0;
    }

    public boolean i(@x1 Uri uri, int i, @z1 Bundle bundle) {
        try {
            return this.c.U(this.d, uri, i, b(bundle));
        } catch (RemoteException unused) {
            return false;
        }
    }

    public boolean j(@x1 Uri uri) {
        try {
            if (this.f != null) {
                return this.c.S0(this.d, uri, b(null));
            }
            return this.c.n1(this.d, uri);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public boolean k(@x1 Bitmap bitmap, @x1 String str) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(a6.r, bitmap);
        bundle.putString(a6.s, str);
        Bundle bundle2 = new Bundle();
        bundle2.putBundle(a6.o, bundle);
        a(bundle);
        try {
            return this.c.g1(this.d, bundle2);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public boolean l(@z1 RemoteViews remoteViews, @z1 int[] iArr, @z1 PendingIntent pendingIntent) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(a6.E, remoteViews);
        bundle.putIntArray(a6.F, iArr);
        bundle.putParcelable(a6.G, pendingIntent);
        a(bundle);
        try {
            return this.c.g1(this.d, bundle);
        } catch (RemoteException unused) {
            return false;
        }
    }

    @Deprecated
    public boolean m(int i, @x1 Bitmap bitmap, @x1 String str) {
        Bundle bundle = new Bundle();
        bundle.putInt(a6.M, i);
        bundle.putParcelable(a6.r, bitmap);
        bundle.putString(a6.s, str);
        Bundle bundle2 = new Bundle();
        bundle2.putBundle(a6.o, bundle);
        a(bundle2);
        try {
            return this.c.g1(this.d, bundle2);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public boolean n(int i, @x1 Uri uri, @z1 Bundle bundle) {
        if (i >= 1 && i <= 2) {
            try {
                return this.c.J(this.d, i, uri, b(bundle));
            } catch (RemoteException unused) {
            }
        }
        return false;
    }
}