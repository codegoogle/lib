package com.google.firebase;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.p7700g.p99005.fv2;
import com.p7700g.p99005.gl4;
import com.p7700g.p99005.hv2;
import com.p7700g.p99005.in2;
import com.p7700g.p99005.j14;
import com.p7700g.p99005.jn2;
import com.p7700g.p99005.jv2;
import com.p7700g.p99005.kn2;
import com.p7700g.p99005.ln2;
import com.p7700g.p99005.mn2;
import com.p7700g.p99005.n04;
import com.p7700g.p99005.pc5;
import com.p7700g.p99005.so2;
import com.p7700g.p99005.uq2;
import com.p7700g.p99005.wo2;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class FirebaseCommonRegistrar implements wo2 {
    private static final String a = "fire-android";
    private static final String b = "fire-core";
    private static final String c = "device-name";
    private static final String d = "device-model";
    private static final String e = "device-brand";
    private static final String f = "android-target-sdk";
    private static final String g = "android-min-sdk";
    private static final String h = "android-platform";
    private static final String i = "android-installer";
    private static final String j = "kotlin";

    public static /* synthetic */ String b(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return (applicationInfo == null || Build.VERSION.SDK_INT < 24) ? "" : String.valueOf(applicationInfo.minSdkVersion);
    }

    public static /* synthetic */ String c(Context context) {
        int i2 = Build.VERSION.SDK_INT;
        return context.getPackageManager().hasSystemFeature("android.hardware.type.television") ? "tv" : context.getPackageManager().hasSystemFeature("android.hardware.type.watch") ? "watch" : (i2 < 23 || !context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) ? (i2 < 26 || !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) ? "" : "embedded" : pc5.c;
    }

    private static String e(String str) {
        return str.replace(gl4.R, n04.E).replace(j14.P, n04.E);
    }

    @Override // com.p7700g.p99005.wo2
    public List<so2<?>> getComponents() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(fv2.b());
        arrayList.add(uq2.d());
        arrayList.add(jv2.a(a, String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(jv2.a(b, mn2.f));
        arrayList.add(jv2.a(c, e(Build.PRODUCT)));
        arrayList.add(jv2.a(d, e(Build.DEVICE)));
        arrayList.add(jv2.a(e, e(Build.BRAND)));
        arrayList.add(jv2.b(f, jn2.a));
        arrayList.add(jv2.b(g, kn2.a));
        arrayList.add(jv2.b(h, ln2.a));
        arrayList.add(jv2.b(i, in2.a));
        String a2 = hv2.a();
        if (a2 != null) {
            arrayList.add(jv2.a(j, a2));
        }
        return arrayList;
    }
}