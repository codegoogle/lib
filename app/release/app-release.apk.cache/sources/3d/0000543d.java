package com.p7700g.p99005;

import android.os.Build;
import com.p7700g.p99005.i2;
import java.util.Locale;

/* compiled from: ManufacturerUtils.java */
@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class oe2 {
    private static final String a = "lge";
    private static final String b = "samsung";
    private static final String c = "meizu";

    private oe2() {
    }

    public static boolean a() {
        return b() || d();
    }

    public static boolean b() {
        return Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals(a);
    }

    public static boolean c() {
        return Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals(c);
    }

    public static boolean d() {
        return Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals(b);
    }
}