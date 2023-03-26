package com.p7700g.p99005;

import android.app.AppOpsManager;
import android.app.Application;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.net.VpnService;
import android.os.Process;
import android.provider.Settings;

/* compiled from: AndroidPermissions.java */
/* loaded from: classes2.dex */
public class p81 {
    @x1
    public static final String a = "App Permissions Required";
    @x1
    private static final String b = "p81";
    @x1
    private final Context c;
    @x1
    private final ContentResolver d;
    @z1
    private final AppOpsManager e;

    public p81(@x1 Application application) {
        this.c = application;
        this.d = application.getContentResolver();
        this.e = (AppOpsManager) application.getSystemService("appops");
    }

    public boolean a() {
        AppOpsManager appOpsManager = this.e;
        if (appOpsManager != null) {
            try {
                if (appOpsManager.checkOpNoThrow("android:get_usage_stats", Process.myUid(), this.c.getPackageName()) != 0) {
                    return false;
                }
            } catch (Exception unused) {
                return false;
            }
        }
        return true;
    }

    public boolean b() {
        try {
            return Settings.Secure.getInt(this.d, "install_non_market_apps") == 1;
        } catch (Throwable unused) {
            return false;
        }
    }

    public boolean c() {
        Intent intent;
        try {
            intent = VpnService.prepare(this.c);
        } catch (Throwable unused) {
            intent = null;
        }
        return intent == null;
    }
}