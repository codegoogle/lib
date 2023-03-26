package com.p7700g.p99005;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.p7700g.p99005.fa2;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

/* compiled from: InstallReferrerClientImpl.java */
/* loaded from: classes2.dex */
public class so1 extends ro1 {
    private static final String a = "InstallReferrerClient";
    private static final int b = 80837300;
    private static final String c = "com.android.vending";
    private static final String d = "com.google.android.finsky.externalreferrer.GetInstallReferrerService";
    private static final String e = "com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE";
    private int f = 0;
    private final Context g;
    private fa2 h;
    private ServiceConnection i;

    /* compiled from: InstallReferrerClientImpl.java */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface b {
        public static final int K = 0;
        public static final int L = 1;
        public static final int M = 2;
        public static final int N = 3;
    }

    /* compiled from: InstallReferrerClientImpl.java */
    /* loaded from: classes2.dex */
    public final class c implements ServiceConnection {
        private final to1 s;

        private c(to1 to1Var) {
            if (to1Var != null) {
                this.s = to1Var;
                return;
            }
            throw new RuntimeException("Please specify a listener to know when setup is done.");
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            vo1.a(so1.a, "Install Referrer service connected.");
            so1.this.h = fa2.a.O1(iBinder);
            so1.this.f = 2;
            this.s.a(0);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            vo1.b(so1.a, "Install Referrer service disconnected.");
            so1.this.h = null;
            so1.this.f = 0;
            this.s.b();
        }
    }

    public so1(Context context) {
        this.g = context.getApplicationContext();
    }

    private boolean h() {
        return this.g.getPackageManager().getPackageInfo("com.android.vending", 128).versionCode >= b;
    }

    @Override // com.p7700g.p99005.ro1
    public void a() {
        this.f = 3;
        if (this.i != null) {
            vo1.a(a, "Unbinding from service.");
            this.g.unbindService(this.i);
            this.i = null;
        }
        this.h = null;
    }

    @Override // com.p7700g.p99005.ro1
    public uo1 b() throws RemoteException {
        if (c()) {
            Bundle bundle = new Bundle();
            bundle.putString("package_name", this.g.getPackageName());
            try {
                return new uo1(this.h.g0(bundle));
            } catch (RemoteException e2) {
                vo1.b(a, "RemoteException getting install referrer information");
                this.f = 0;
                throw e2;
            }
        }
        throw new IllegalStateException("Service not connected. Please start a connection before using the service.");
    }

    @Override // com.p7700g.p99005.ro1
    public boolean c() {
        return (this.f != 2 || this.h == null || this.i == null) ? false : true;
    }

    @Override // com.p7700g.p99005.ro1
    public void e(to1 to1Var) {
        ServiceInfo serviceInfo;
        if (c()) {
            vo1.a(a, "Service connection is valid. No need to re-initialize.");
            to1Var.a(0);
            return;
        }
        int i = this.f;
        if (i == 1) {
            vo1.b(a, "Client is already in the process of connecting to the service.");
            to1Var.a(3);
        } else if (i == 3) {
            vo1.b(a, "Client was already closed and can't be reused. Please create another instance.");
            to1Var.a(3);
        } else {
            vo1.a(a, "Starting install referrer service setup.");
            Intent intent = new Intent(e);
            intent.setComponent(new ComponentName("com.android.vending", d));
            List<ResolveInfo> queryIntentServices = this.g.getPackageManager().queryIntentServices(intent, 0);
            if (queryIntentServices != null && !queryIntentServices.isEmpty() && (serviceInfo = queryIntentServices.get(0).serviceInfo) != null) {
                String str = serviceInfo.packageName;
                String str2 = serviceInfo.name;
                if ("com.android.vending".equals(str) && str2 != null && h()) {
                    Intent intent2 = new Intent(intent);
                    c cVar = new c(to1Var);
                    this.i = cVar;
                    try {
                        if (this.g.bindService(intent2, cVar, 1)) {
                            vo1.a(a, "Service was bonded successfully.");
                            return;
                        }
                        vo1.b(a, "Connection to service is blocked.");
                        this.f = 0;
                        to1Var.a(1);
                        return;
                    } catch (SecurityException unused) {
                        vo1.b(a, "No permission to connect to service.");
                        this.f = 0;
                        to1Var.a(4);
                        return;
                    }
                }
                vo1.b(a, "Play Store missing or incompatible. Version 8.3.73 or later required.");
                this.f = 0;
                to1Var.a(2);
                return;
            }
            this.f = 0;
            vo1.a(a, "Install Referrer service unavailable on device.");
            to1Var.a(2);
        }
    }
}