package com.p7700g.p99005;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.p7700g.p99005.rp0;
import java.io.IOException;

/* compiled from: ConfigReader.java */
/* loaded from: classes2.dex */
public class wn1 {
    @x1
    private static final kj1 a = kj1.b("VpnConfigProvider");

    public static int a(@x1 Context context, @x1 String str, @d2 int i) {
        PackageManager.NameNotFoundException nameNotFoundException;
        ApplicationInfo applicationInfo;
        String str2 = null;
        try {
            applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            nameNotFoundException = null;
        } catch (PackageManager.NameNotFoundException e) {
            nameNotFoundException = e;
            applicationInfo = null;
        }
        Bundle bundle = applicationInfo != null ? applicationInfo.metaData : null;
        int i2 = (bundle == null || !bundle.containsKey(str)) ? 0 : bundle.getInt(str);
        if (i2 != 0) {
            return i2;
        }
        try {
            str2 = n81.n(context.getResources().openRawResource(i));
        } catch (IOException e2) {
            a.f(e2);
        }
        throw new RuntimeException(context.getString(rp0.k.F, str) + str2, nameNotFoundException);
    }
}