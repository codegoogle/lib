package com.p7700g.p99005;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.microsoft.appcenter.utils.crypto.CryptoConstants;
import com.p7700g.p99005.aa;
import java.util.ArrayDeque;
import java.util.Queue;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
@KeepForSdk
/* loaded from: classes3.dex */
public class ju2 {
    public static final int a = -1;
    @KeepForSdk
    public static final int b = 500;
    private static ju2 c;
    @GuardedBy("this")
    @z1
    private String d = null;
    private Boolean e = null;
    private Boolean f = null;
    private final Queue<Intent> g = new ArrayDeque();

    private ju2() {
    }

    private int a(Context context, Intent intent) {
        ComponentName startService;
        String f = f(context, intent);
        if (f != null) {
            if (Log.isLoggable(rs2.a, 3)) {
                if (f.length() != 0) {
                    "Restricting intent to a specific service: ".concat(f);
                } else {
                    new String("Restricting intent to a specific service: ");
                }
            }
            intent.setClassName(context.getPackageName(), f);
        }
        try {
            if (e(context)) {
                startService = tu2.e(context, intent);
            } else {
                startService = context.startService(intent);
            }
            if (startService == null) {
                return com.anythink.expressad.video.dynview.a.a.t;
            }
            return -1;
        } catch (IllegalStateException e) {
            String.valueOf(e).length();
            return aa.c.c;
        } catch (SecurityException unused) {
            return 401;
        }
    }

    public static synchronized ju2 b() {
        ju2 ju2Var;
        synchronized (ju2.class) {
            if (c == null) {
                c = new ju2();
            }
            ju2Var = c;
        }
        return ju2Var;
    }

    @z1
    private synchronized String f(Context context, Intent intent) {
        ServiceInfo serviceInfo;
        String str;
        String str2 = this.d;
        if (str2 != null) {
            return str2;
        }
        ResolveInfo resolveService = context.getPackageManager().resolveService(intent, 0);
        if (resolveService != null && (serviceInfo = resolveService.serviceInfo) != null) {
            if (context.getPackageName().equals(serviceInfo.packageName) && (str = serviceInfo.name) != null) {
                if (str.startsWith(CryptoConstants.ALIAS_SEPARATOR)) {
                    String valueOf = String.valueOf(context.getPackageName());
                    String valueOf2 = String.valueOf(serviceInfo.name);
                    this.d = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                } else {
                    this.d = serviceInfo.name;
                }
                return this.d;
            }
            String str3 = serviceInfo.packageName;
            String str4 = serviceInfo.name;
            String.valueOf(str3).length();
            String.valueOf(str4).length();
            return null;
        }
        return null;
    }

    @r2
    public static void g(@x1 ju2 ju2Var) {
        c = ju2Var;
    }

    @u1
    public Intent c() {
        return this.g.poll();
    }

    public boolean d(Context context) {
        if (this.f == null) {
            this.f = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!this.e.booleanValue()) {
            Log.isLoggable(rs2.a, 3);
        }
        return this.f.booleanValue();
    }

    public boolean e(Context context) {
        if (this.e == null) {
            this.e = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!this.e.booleanValue()) {
            Log.isLoggable(rs2.a, 3);
        }
        return this.e.booleanValue();
    }

    @u1
    public int h(@x1 Context context, @x1 Intent intent) {
        Log.isLoggable(rs2.a, 3);
        this.g.offer(intent);
        Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
        intent2.setPackage(context.getPackageName());
        return a(context, intent2);
    }
}