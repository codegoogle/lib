package com.p7700g.p99005;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/* compiled from: DefaultDeviceIdStorage.java */
/* loaded from: classes.dex */
public class nt0 implements rt0 {
    private static final String a = "pref_hydrasdk_device_id";
    private final SharedPreferences b;

    public nt0(@x1 Context context) {
        this.b = PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext());
    }

    @Override // com.p7700g.p99005.rt0
    public void a(@x1 String str) {
        this.b.edit().putString(a, str).apply();
    }

    @Override // com.p7700g.p99005.rt0
    @x1
    public String get() {
        return this.b.getString(a, "");
    }
}