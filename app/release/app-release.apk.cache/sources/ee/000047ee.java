package com.p7700g.p99005;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import com.p7700g.p99005.i2;
import java.io.File;

/* compiled from: TrustedWebUtils.java */
/* loaded from: classes.dex */
public class i6 {
    public static final String a = "android.support.customtabs.extra.LAUNCH_AS_TRUSTED_WEB_ACTIVITY";
    @i2({i2.a.LIBRARY})
    public static final String b = "android.support.customtabs.action.ACTION_MANAGE_TRUSTED_WEB_ACTIVITY_DATA";

    private i6() {
    }

    public static boolean a(@x1 Context context, @x1 String str, @x1 String str2) {
        IntentFilter intentFilter;
        ResolveInfo resolveService = context.getPackageManager().resolveService(new Intent().setAction(b6.s).setPackage(str), 64);
        if (resolveService == null || (intentFilter = resolveService.filter) == null) {
            return false;
        }
        return intentFilter.hasCategory(str2);
    }

    @Deprecated
    public static void b(@x1 Context context, @x1 a6 a6Var, @x1 Uri uri) {
        if (ag.a(a6Var.P.getExtras(), a6.b) != null) {
            a6Var.P.putExtra(a, true);
            a6Var.c(context, uri);
            return;
        }
        throw new IllegalArgumentException("Given CustomTabsIntent should be associated with a valid CustomTabsSession");
    }

    @i2({i2.a.LIBRARY})
    public static void c(@x1 Context context, @x1 d6 d6Var, @x1 Uri uri) {
        Intent intent = new Intent(b);
        intent.setPackage(d6Var.e().getPackageName());
        intent.setData(uri);
        Bundle bundle = new Bundle();
        ag.b(bundle, a6.b, d6Var.d());
        intent.putExtras(bundle);
        PendingIntent f = d6Var.f();
        if (f != null) {
            intent.putExtra(a6.c, f);
        }
        context.startActivity(intent);
    }

    @s2
    public static boolean d(@x1 Context context, @x1 File file, @x1 String str, @x1 String str2, @x1 d6 d6Var) {
        Uri f = ih.f(context, str, file);
        context.grantUriPermission(str2, f, 1);
        return d6Var.i(f, 1, null);
    }
}