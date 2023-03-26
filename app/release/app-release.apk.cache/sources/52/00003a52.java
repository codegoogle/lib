package com.p7700g.p99005;

import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.p7700g.p99005.b6;
import com.p7700g.p99005.c;
import com.p7700g.p99005.i2;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: CustomTabsService.java */
/* loaded from: classes.dex */
public abstract class b6 extends Service {
    public static final int A = 0;
    public static final int B = -1;
    public static final int C = -2;
    public static final int D = -3;
    public static final int E = 1;
    public static final int F = 2;
    public static final int G = 1;
    public static final String s = "android.support.customtabs.action.CustomTabsService";
    public static final String t = "androidx.browser.customtabs.category.NavBarColorCustomization";
    public static final String u = "androidx.browser.customtabs.category.ColorSchemeCustomization";
    public static final String v = "androidx.browser.trusted.category.TrustedWebActivities";
    public static final String w = "androidx.browser.trusted.category.WebShareTargetV2";
    public static final String x = "androidx.browser.trusted.category.ImmersiveMode";
    public static final String y = "android.support.customtabs.otherurls.URL";
    public static final String z = "androidx.browser.customtabs.SUCCESS";
    public final y7<IBinder, IBinder.DeathRecipient> H = new y7<>();
    private c.b I = new a();

    /* compiled from: CustomTabsService.java */
    /* loaded from: classes.dex */
    public class a extends c.b {
        public a() {
        }

        @z1
        private PendingIntent Q1(@z1 Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable(a6.c);
            bundle.remove(a6.c);
            return pendingIntent;
        }

        private /* synthetic */ void R1(e6 e6Var) {
            b6.this.a(e6Var);
        }

        private boolean T1(@x1 com.p7700g.p99005.b bVar, @z1 PendingIntent pendingIntent) {
            final e6 e6Var = new e6(bVar, pendingIntent);
            try {
                IBinder.DeathRecipient deathRecipient = new IBinder.DeathRecipient() { // from class: com.p7700g.p99005.w5
                    @Override // android.os.IBinder.DeathRecipient
                    public final void binderDied() {
                        b6.a aVar = b6.a.this;
                        b6.this.a(e6Var);
                    }
                };
                synchronized (b6.this.H) {
                    bVar.asBinder().linkToDeath(deathRecipient, 0);
                    b6.this.H.put(bVar.asBinder(), deathRecipient);
                }
                return b6.this.d(e6Var);
            } catch (RemoteException unused) {
                return false;
            }
        }

        @Override // com.p7700g.p99005.c
        public boolean F(@z1 com.p7700g.p99005.b bVar, @z1 Uri uri, @z1 Bundle bundle, @z1 List<Bundle> list) {
            return b6.this.c(new e6(bVar, Q1(bundle)), uri, bundle, list);
        }

        @Override // com.p7700g.p99005.c
        public boolean J(@x1 com.p7700g.p99005.b bVar, int i, @x1 Uri uri, @z1 Bundle bundle) {
            return b6.this.i(new e6(bVar, Q1(bundle)), i, uri, bundle);
        }

        @Override // com.p7700g.p99005.c
        public int N0(@x1 com.p7700g.p99005.b bVar, @x1 String str, @z1 Bundle bundle) {
            return b6.this.e(new e6(bVar, Q1(bundle)), str, bundle);
        }

        @Override // com.p7700g.p99005.c
        public boolean Q0(@x1 com.p7700g.p99005.b bVar) {
            return T1(bVar, null);
        }

        @Override // com.p7700g.p99005.c
        public boolean S0(@x1 com.p7700g.p99005.b bVar, @x1 Uri uri, @x1 Bundle bundle) {
            return b6.this.g(new e6(bVar, Q1(bundle)), uri);
        }

        public /* synthetic */ void S1(e6 e6Var) {
            b6.this.a(e6Var);
        }

        @Override // com.p7700g.p99005.c
        public boolean U(@x1 com.p7700g.p99005.b bVar, @x1 Uri uri, int i, @z1 Bundle bundle) {
            return b6.this.f(new e6(bVar, Q1(bundle)), uri, i, bundle);
        }

        @Override // com.p7700g.p99005.c
        public boolean V0(@x1 com.p7700g.p99005.b bVar, @z1 Bundle bundle) {
            return T1(bVar, Q1(bundle));
        }

        @Override // com.p7700g.p99005.c
        public Bundle d0(@x1 String str, @z1 Bundle bundle) {
            return b6.this.b(str, bundle);
        }

        @Override // com.p7700g.p99005.c
        public boolean g1(@x1 com.p7700g.p99005.b bVar, @z1 Bundle bundle) {
            return b6.this.h(new e6(bVar, Q1(bundle)), bundle);
        }

        @Override // com.p7700g.p99005.c
        public boolean n1(@x1 com.p7700g.p99005.b bVar, @x1 Uri uri) {
            return b6.this.g(new e6(bVar, null), uri);
        }

        @Override // com.p7700g.p99005.c
        public boolean v0(long j) {
            return b6.this.j(j);
        }
    }

    /* compiled from: CustomTabsService.java */
    @i2({i2.a.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface b {
    }

    /* compiled from: CustomTabsService.java */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface c {
    }

    /* compiled from: CustomTabsService.java */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface d {
    }

    public boolean a(@x1 e6 e6Var) {
        try {
            synchronized (this.H) {
                IBinder c2 = e6Var.c();
                if (c2 == null) {
                    return false;
                }
                c2.unlinkToDeath(this.H.get(c2), 0);
                this.H.remove(c2);
                return true;
            }
        } catch (NoSuchElementException unused) {
            return false;
        }
    }

    @z1
    public abstract Bundle b(@x1 String str, @z1 Bundle bundle);

    public abstract boolean c(@x1 e6 e6Var, @z1 Uri uri, @z1 Bundle bundle, @z1 List<Bundle> list);

    public abstract boolean d(@x1 e6 e6Var);

    public abstract int e(@x1 e6 e6Var, @x1 String str, @z1 Bundle bundle);

    public abstract boolean f(@x1 e6 e6Var, @x1 Uri uri, int i, @z1 Bundle bundle);

    public abstract boolean g(@x1 e6 e6Var, @x1 Uri uri);

    public abstract boolean h(@x1 e6 e6Var, @z1 Bundle bundle);

    public abstract boolean i(@x1 e6 e6Var, int i, @x1 Uri uri, @z1 Bundle bundle);

    public abstract boolean j(long j);

    @Override // android.app.Service
    @x1
    public IBinder onBind(@z1 Intent intent) {
        return this.I;
    }
}