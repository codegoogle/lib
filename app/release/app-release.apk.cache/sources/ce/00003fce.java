package com.p7700g.p99005;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import java.util.Locale;

/* compiled from: DependenciesInitializer.java */
/* loaded from: classes.dex */
public class e31 {
    @x1
    private static final kj1 a = kj1.b("DependenciesInitializer");
    @x1
    public static final String b = "init";
    @x1
    public static final String c = "done";

    public static boolean a(@x1 Context context) {
        Bundle call;
        try {
            call = context.getContentResolver().call(Uri.parse(String.format(Locale.US, "content://%s.anchorfree.sdk.init.provider", context.getPackageName())), b, (String) null, (Bundle) null);
        } catch (Throwable th) {
            a.f(th);
        }
        if (call != null && call.getBoolean(c, false)) {
            a.c("Initialization completed", new Object[0]);
            return true;
        }
        a.c("Initialization failed", new Object[0]);
        return false;
    }
}