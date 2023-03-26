package com.p7700g.p99005;

import android.content.Context;
import android.util.Base64;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: DeviceInfo.java */
/* loaded from: classes.dex */
public class pt0 {
    public static final String a = "android";
    private static final String b = "device_type";
    private static final String c = "device_name";
    private static final String d = "mcc";
    private static final String e = "mnc";
    public static final String f = "device_id";
    private static final String g = "tz";
    private static final String h = "country";
    private static final String i = "locale";
    @x1
    private final Context j;
    @x1
    private final ot0 k;

    private pt0(@x1 Context context, @x1 ot0 ot0Var) {
        this.j = context;
        this.k = ot0Var;
    }

    @x1
    public static pt0 b(@x1 Context context, @x1 ot0 ot0Var) {
        return new pt0(context, ot0Var);
    }

    @x1
    private String d(@x1 String str, @x1 String str2) {
        return Base64.encodeToString(String.format(Locale.US, "%s_%s", str, str2).getBytes(Charset.forName("UTF-8")), 3);
    }

    @x1
    public Map<String, String> a(@x1 String str) {
        HashMap hashMap = new HashMap();
        tt0.a(hashMap, f, c(str));
        tt0.a(hashMap, "device_type", a);
        tt0.a(hashMap, c, mt0.e());
        tt0.a(hashMap, "mnc", mt0.d(this.j));
        tt0.a(hashMap, "mcc", mt0.c(this.j));
        tt0.a(hashMap, "country", Locale.getDefault().getCountry());
        tt0.a(hashMap, i, Locale.getDefault().getLanguage());
        tt0.a(hashMap, "tz", mt0.g());
        return hashMap;
    }

    @x1
    public String c(@x1 String str) {
        return d(str, this.k.a());
    }
}