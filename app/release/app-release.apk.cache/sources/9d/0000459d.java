package com.p7700g.p99005;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: ApplicationVersionSignature.java */
/* loaded from: classes2.dex */
public final class h02 {
    private static final String a = "AppVersionSignature";
    private static final ConcurrentMap<String, gq1> b = new ConcurrentHashMap();

    private h02() {
    }

    @z1
    private static PackageInfo a(@x1 Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException unused) {
            context.getPackageName();
            return null;
        }
    }

    @x1
    private static String b(@z1 PackageInfo packageInfo) {
        if (packageInfo != null) {
            return String.valueOf(packageInfo.versionCode);
        }
        return UUID.randomUUID().toString();
    }

    @x1
    public static gq1 c(@x1 Context context) {
        String packageName = context.getPackageName();
        ConcurrentMap<String, gq1> concurrentMap = b;
        gq1 gq1Var = concurrentMap.get(packageName);
        if (gq1Var == null) {
            gq1 d = d(context);
            gq1 putIfAbsent = concurrentMap.putIfAbsent(packageName, d);
            return putIfAbsent == null ? d : putIfAbsent;
        }
        return gq1Var;
    }

    @x1
    private static gq1 d(@x1 Context context) {
        return new k02(b(a(context)));
    }

    @r2
    public static void e() {
        b.clear();
    }
}