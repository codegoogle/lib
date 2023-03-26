package com.p7700g.p99005;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* compiled from: Utils.java */
/* loaded from: classes3.dex */
public final class xr2 {
    private static final String b = ":";
    private static xr2 d;
    private final ms2 e;
    public static final long a = TimeUnit.HOURS.toSeconds(1);
    private static final Pattern c = Pattern.compile("\\AA[\\w-]{38}\\z");

    private xr2(ms2 ms2Var) {
        this.e = ms2Var;
    }

    public static xr2 c() {
        return d(ns2.a());
    }

    public static xr2 d(ms2 ms2Var) {
        if (d == null) {
            d = new xr2(ms2Var);
        }
        return d;
    }

    public static boolean g(@z1 String str) {
        return c.matcher(str).matches();
    }

    public static boolean h(@z1 String str) {
        return str.contains(":");
    }

    public long a() {
        return this.e.currentTimeMillis();
    }

    public long b() {
        return TimeUnit.MILLISECONDS.toSeconds(a());
    }

    public long e() {
        return (long) (Math.random() * 1000.0d);
    }

    public boolean f(@x1 fs2 fs2Var) {
        if (TextUtils.isEmpty(fs2Var.b())) {
            return true;
        }
        return fs2Var.c() + fs2Var.h() < b() + a;
    }
}