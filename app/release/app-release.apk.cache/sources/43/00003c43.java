package com.p7700g.p99005;

import android.app.Notification;
import android.content.ComponentName;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.RemoteException;
import com.p7700g.p99005.e;
import com.p7700g.p99005.i2;

/* compiled from: TrustedWebActivityServiceConnection.java */
/* loaded from: classes.dex */
public final class c7 {
    private static final String a = "android.support.customtabs.trusted.PLATFORM_TAG";
    private static final String b = "android.support.customtabs.trusted.PLATFORM_ID";
    private static final String c = "android.support.customtabs.trusted.NOTIFICATION";
    private static final String d = "android.support.customtabs.trusted.CHANNEL_NAME";
    private static final String e = "android.support.customtabs.trusted.ACTIVE_NOTIFICATIONS";
    private static final String f = "android.support.customtabs.trusted.NOTIFICATION_SUCCESS";
    private final com.p7700g.p99005.f g;
    private final ComponentName h;

    /* compiled from: TrustedWebActivityServiceConnection.java */
    /* loaded from: classes.dex */
    public class a extends e.b {
        public final /* synthetic */ v6 u;

        public a(v6 v6Var) {
            this.u = v6Var;
        }

        @Override // com.p7700g.p99005.e
        public void z1(String str, Bundle bundle) throws RemoteException {
            this.u.a(str, bundle);
        }
    }

    /* compiled from: TrustedWebActivityServiceConnection.java */
    /* loaded from: classes.dex */
    public static class b {
        public final Parcelable[] a;

        public b(Parcelable[] parcelableArr) {
            this.a = parcelableArr;
        }

        public static b a(Bundle bundle) {
            c7.c(bundle, c7.e);
            return new b(bundle.getParcelableArray(c7.e));
        }

        public Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putParcelableArray(c7.e, this.a);
            return bundle;
        }
    }

    /* compiled from: TrustedWebActivityServiceConnection.java */
    /* loaded from: classes.dex */
    public static class c {
        public final String a;
        public final int b;

        public c(String str, int i) {
            this.a = str;
            this.b = i;
        }

        public static c a(Bundle bundle) {
            c7.c(bundle, c7.a);
            c7.c(bundle, c7.b);
            return new c(bundle.getString(c7.a), bundle.getInt(c7.b));
        }

        public Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putString(c7.a, this.a);
            bundle.putInt(c7.b, this.b);
            return bundle;
        }
    }

    /* compiled from: TrustedWebActivityServiceConnection.java */
    /* loaded from: classes.dex */
    public static class d {
        public final String a;

        public d(String str) {
            this.a = str;
        }

        public static d a(Bundle bundle) {
            c7.c(bundle, c7.d);
            return new d(bundle.getString(c7.d));
        }

        public Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putString(c7.d, this.a);
            return bundle;
        }
    }

    /* compiled from: TrustedWebActivityServiceConnection.java */
    /* loaded from: classes.dex */
    public static class e {
        public final String a;
        public final int b;
        public final Notification c;
        public final String d;

        public e(String str, int i, Notification notification, String str2) {
            this.a = str;
            this.b = i;
            this.c = notification;
            this.d = str2;
        }

        public static e a(Bundle bundle) {
            c7.c(bundle, c7.a);
            c7.c(bundle, c7.b);
            c7.c(bundle, c7.c);
            c7.c(bundle, c7.d);
            return new e(bundle.getString(c7.a), bundle.getInt(c7.b), (Notification) bundle.getParcelable(c7.c), bundle.getString(c7.d));
        }

        public Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putString(c7.a, this.a);
            bundle.putInt(c7.b, this.b);
            bundle.putParcelable(c7.c, this.c);
            bundle.putString(c7.d, this.d);
            return bundle;
        }
    }

    /* compiled from: TrustedWebActivityServiceConnection.java */
    /* loaded from: classes.dex */
    public static class f {
        public final boolean a;

        public f(boolean z) {
            this.a = z;
        }

        public static f a(Bundle bundle) {
            c7.c(bundle, c7.f);
            return new f(bundle.getBoolean(c7.f));
        }

        public Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putBoolean(c7.f, this.a);
            return bundle;
        }
    }

    public c7(@x1 com.p7700g.p99005.f fVar, @x1 ComponentName componentName) {
        this.g = fVar;
        this.h = componentName;
    }

    public static void c(Bundle bundle, String str) {
        if (!bundle.containsKey(str)) {
            throw new IllegalArgumentException(wo1.t("Bundle must contain ", str));
        }
    }

    @z1
    private static com.p7700g.p99005.e j(@z1 v6 v6Var) {
        if (v6Var == null) {
            return null;
        }
        return new a(v6Var);
    }

    public boolean a(@x1 String str) throws RemoteException {
        return f.a(this.g.M0(new d(str).b())).a;
    }

    public void b(@x1 String str, int i) throws RemoteException {
        this.g.a1(new c(str, i).b());
    }

    @e2(23)
    @i2({i2.a.LIBRARY})
    @x1
    public Parcelable[] d() throws RemoteException {
        return b.a(this.g.N()).a;
    }

    @x1
    public ComponentName e() {
        return this.h;
    }

    @z1
    public Bitmap f() throws RemoteException {
        return (Bitmap) this.g.I0().getParcelable(b7.u);
    }

    public int g() throws RemoteException {
        return this.g.F0();
    }

    public boolean h(@x1 String str, int i, @x1 Notification notification, @x1 String str2) throws RemoteException {
        return f.a(this.g.c1(new e(str, i, notification, str2).b())).a;
    }

    @z1
    public Bundle i(@x1 String str, @x1 Bundle bundle, @z1 v6 v6Var) throws RemoteException {
        com.p7700g.p99005.e j = j(v6Var);
        return this.g.k0(str, bundle, j == null ? null : j.asBinder());
    }
}