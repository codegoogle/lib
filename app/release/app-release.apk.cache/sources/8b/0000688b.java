package com.p7700g.p99005;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import com.p7700g.p99005.b;
import com.p7700g.p99005.d6;
import com.p7700g.p99005.i2;
import java.util.ArrayList;
import java.util.List;

/* compiled from: CustomTabsClient.java */
/* loaded from: classes.dex */
public class z5 {
    private static final String a = "CustomTabsClient";
    private final c b;
    private final ComponentName c;
    private final Context d;

    /* compiled from: CustomTabsClient.java */
    /* loaded from: classes.dex */
    public class a extends c6 {
        public final /* synthetic */ Context s;

        public a(Context context) {
            this.s = context;
        }

        @Override // com.p7700g.p99005.c6
        public final void onCustomTabsServiceConnected(@x1 ComponentName componentName, @x1 z5 z5Var) {
            z5Var.n(0L);
            this.s.unbindService(this);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* compiled from: CustomTabsClient.java */
    /* loaded from: classes.dex */
    public class b extends b.AbstractBinderC0147b {
        public final /* synthetic */ y5 A;
        private Handler z = new Handler(Looper.getMainLooper());

        /* compiled from: CustomTabsClient.java */
        /* loaded from: classes.dex */
        public class a implements Runnable {
            public final /* synthetic */ int s;
            public final /* synthetic */ Bundle t;

            public a(int i, Bundle bundle) {
                this.s = i;
                this.t = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.A.d(this.s, this.t);
            }
        }

        /* compiled from: CustomTabsClient.java */
        /* renamed from: com.p7700g.p99005.z5$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0277b implements Runnable {
            public final /* synthetic */ String s;
            public final /* synthetic */ Bundle t;

            public RunnableC0277b(String str, Bundle bundle) {
                this.s = str;
                this.t = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.A.a(this.s, this.t);
            }
        }

        /* compiled from: CustomTabsClient.java */
        /* loaded from: classes.dex */
        public class c implements Runnable {
            public final /* synthetic */ Bundle s;

            public c(Bundle bundle) {
                this.s = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.A.c(this.s);
            }
        }

        /* compiled from: CustomTabsClient.java */
        /* loaded from: classes.dex */
        public class d implements Runnable {
            public final /* synthetic */ String s;
            public final /* synthetic */ Bundle t;

            public d(String str, Bundle bundle) {
                this.s = str;
                this.t = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.A.e(this.s, this.t);
            }
        }

        /* compiled from: CustomTabsClient.java */
        /* loaded from: classes.dex */
        public class e implements Runnable {
            public final /* synthetic */ int s;
            public final /* synthetic */ Uri t;
            public final /* synthetic */ boolean u;
            public final /* synthetic */ Bundle v;

            public e(int i, Uri uri, boolean z, Bundle bundle) {
                this.s = i;
                this.t = uri;
                this.u = z;
                this.v = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.A.f(this.s, this.t, this.u, this.v);
            }
        }

        public b(y5 y5Var) {
            this.A = y5Var;
        }

        @Override // com.p7700g.p99005.b
        public void A1(Bundle bundle) throws RemoteException {
            if (this.A == null) {
                return;
            }
            this.z.post(new c(bundle));
        }

        @Override // com.p7700g.p99005.b
        public void D1(int i, Uri uri, boolean z, @z1 Bundle bundle) throws RemoteException {
            if (this.A == null) {
                return;
            }
            this.z.post(new e(i, uri, z, bundle));
        }

        @Override // com.p7700g.p99005.b
        public void X0(String str, Bundle bundle) throws RemoteException {
            if (this.A == null) {
                return;
            }
            this.z.post(new RunnableC0277b(str, bundle));
        }

        @Override // com.p7700g.p99005.b
        public Bundle b0(@x1 String str, @z1 Bundle bundle) throws RemoteException {
            y5 y5Var = this.A;
            if (y5Var == null) {
                return null;
            }
            return y5Var.b(str, bundle);
        }

        @Override // com.p7700g.p99005.b
        public void k1(int i, Bundle bundle) {
            if (this.A == null) {
                return;
            }
            this.z.post(new a(i, bundle));
        }

        @Override // com.p7700g.p99005.b
        public void w(String str, Bundle bundle) throws RemoteException {
            if (this.A == null) {
                return;
            }
            this.z.post(new d(str, bundle));
        }
    }

    public z5(c cVar, ComponentName componentName, Context context) {
        this.b = cVar;
        this.c = componentName;
        this.d = context;
    }

    public static boolean b(@x1 Context context, @z1 String str, @x1 c6 c6Var) {
        c6Var.setApplicationContext(context.getApplicationContext());
        Intent intent = new Intent(b6.s);
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, c6Var, 33);
    }

    public static boolean c(@x1 Context context, @z1 String str, @x1 c6 c6Var) {
        c6Var.setApplicationContext(context.getApplicationContext());
        Intent intent = new Intent(b6.s);
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, c6Var, 1);
    }

    public static boolean d(@x1 Context context, @x1 String str) {
        if (str == null) {
            return false;
        }
        Context applicationContext = context.getApplicationContext();
        try {
            return b(applicationContext, str, new a(applicationContext));
        } catch (SecurityException unused) {
            return false;
        }
    }

    private b.AbstractBinderC0147b e(@z1 y5 y5Var) {
        return new b(y5Var);
    }

    private static PendingIntent f(Context context, int i) {
        return PendingIntent.getActivity(context, i, new Intent(), 67108864);
    }

    @z1
    public static String h(@x1 Context context, @z1 List<String> list) {
        return i(context, list, false);
    }

    @z1
    public static String i(@x1 Context context, @z1 List<String> list, boolean z) {
        ResolveInfo resolveActivity;
        PackageManager packageManager = context.getPackageManager();
        ArrayList arrayList = list == null ? new ArrayList() : list;
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://"));
        if (!z && (resolveActivity = packageManager.resolveActivity(intent, 0)) != null) {
            String str = resolveActivity.activityInfo.packageName;
            ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
            arrayList2.add(str);
            if (list != null) {
                arrayList2.addAll(list);
            }
            arrayList = arrayList2;
        }
        Intent intent2 = new Intent(b6.s);
        for (String str2 : arrayList) {
            intent2.setPackage(str2);
            if (packageManager.resolveService(intent2, 0) != null) {
                return str2;
            }
        }
        int i = Build.VERSION.SDK_INT;
        return null;
    }

    @i2({i2.a.LIBRARY})
    @x1
    public static d6.b j(@x1 Context context, @z1 y5 y5Var, int i) {
        return new d6.b(y5Var, f(context, i));
    }

    @z1
    private d6 m(@z1 y5 y5Var, @z1 PendingIntent pendingIntent) {
        boolean Q0;
        b.AbstractBinderC0147b e = e(y5Var);
        try {
            if (pendingIntent != null) {
                Bundle bundle = new Bundle();
                bundle.putParcelable(a6.c, pendingIntent);
                Q0 = this.b.V0(e, bundle);
            } else {
                Q0 = this.b.Q0(e);
            }
            if (Q0) {
                return new d6(this.b, e, this.c, pendingIntent);
            }
            return null;
        } catch (RemoteException unused) {
            return null;
        }
    }

    @i2({i2.a.LIBRARY})
    @z1
    public d6 a(@x1 d6.b bVar) {
        return m(bVar.a(), bVar.b());
    }

    @z1
    public Bundle g(@x1 String str, @z1 Bundle bundle) {
        try {
            return this.b.d0(str, bundle);
        } catch (RemoteException unused) {
            return null;
        }
    }

    @z1
    public d6 k(@z1 y5 y5Var) {
        return m(y5Var, null);
    }

    @z1
    public d6 l(@z1 y5 y5Var, int i) {
        return m(y5Var, f(this.d, i));
    }

    public boolean n(long j) {
        try {
            return this.b.v0(j);
        } catch (RemoteException unused) {
            return false;
        }
    }
}