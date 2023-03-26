package com.p7700g.p99005;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: AppInstallReconnectStrategy.java */
/* loaded from: classes2.dex */
public class le1 {
    @x1
    private static final kj1 a = kj1.b("AppInstallReconnectStrategy");
    @x1
    private static final String b = "vpn_connected_pref";
    @x1
    private static final String c = "vpn_connected_pref_version";
    @x1
    private final Context d;
    @x1
    private final SharedPreferences e;

    public le1(@x1 Context context) {
        this.d = context;
        this.e = context.getSharedPreferences(qe1.a, 0);
    }

    public void a() {
        this.e.edit().putLong(b, System.currentTimeMillis()).putLong(c, cj1.a(this.d)).apply();
    }

    public void b() {
        this.e.edit().remove(b).remove(c).apply();
    }

    public boolean c() {
        long j = this.e.getLong(b, 0L);
        long j2 = this.e.getLong(c, 0L);
        long a2 = cj1.a(this.d);
        a.c("connectTs: %s connectVersion: %d currentVersion: %d", Long.valueOf(j), Long.valueOf(j2), Long.valueOf(a2));
        return j != 0 && j2 < a2;
    }
}