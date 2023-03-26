package com.p7700g.p99005;

import android.os.Bundle;

/* compiled from: ReferrerDetails.java */
/* loaded from: classes2.dex */
public class uo1 {
    private static final String a = "install_referrer";
    private static final String b = "referrer_click_timestamp_seconds";
    private static final String c = "install_begin_timestamp_seconds";
    private static final String d = "google_play_instant";
    private static final String e = "referrer_click_timestamp_server_seconds";
    private static final String f = "install_begin_timestamp_server_seconds";
    private static final String g = "install_version";
    private final Bundle h;

    public uo1(Bundle bundle) {
        this.h = bundle;
    }

    public boolean a() {
        return this.h.getBoolean(d);
    }

    public long b() {
        return this.h.getLong(c);
    }

    public long c() {
        return this.h.getLong(f);
    }

    public String d() {
        return this.h.getString(a);
    }

    public String e() {
        return this.h.getString(g);
    }

    public long f() {
        return this.h.getLong(b);
    }

    public long g() {
        return this.h.getLong(e);
    }
}