package com.p7700g.p99005;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;

/* compiled from: BundleCompat.java */
/* loaded from: classes3.dex */
public class ni3 implements mi3<Bundle> {
    private Bundle a;

    public ni3() {
        this.a = new Bundle();
    }

    @Override // com.p7700g.p99005.mi3
    public boolean a(String str, boolean z) {
        return this.a.getBoolean(str, z);
    }

    @Override // com.p7700g.p99005.mi3
    public void b(String str, String str2) {
        this.a.putString(str, str2);
    }

    @Override // com.p7700g.p99005.mi3
    public void c(String str, Long l) {
        this.a.putLong(str, l.longValue());
    }

    @Override // com.p7700g.p99005.mi3
    public void d(Parcelable parcelable) {
        this.a = (Bundle) parcelable;
    }

    @Override // com.p7700g.p99005.mi3
    public boolean e(String str) {
        return this.a.getBoolean(str);
    }

    @Override // com.p7700g.p99005.mi3
    public Long f(String str) {
        return Long.valueOf(this.a.getLong(str));
    }

    @Override // com.p7700g.p99005.mi3
    public void g(String str, Boolean bool) {
        this.a.putBoolean(str, bool.booleanValue());
    }

    @Override // com.p7700g.p99005.mi3
    public void i(String str, Integer num) {
        this.a.putInt(str, num.intValue());
    }

    @Override // com.p7700g.p99005.mi3
    public Integer j(String str) {
        return Integer.valueOf(this.a.getInt(str));
    }

    @Override // com.p7700g.p99005.mi3
    public String k(String str) {
        return this.a.getString(str);
    }

    @Override // com.p7700g.p99005.mi3
    public boolean l(String str) {
        return this.a.containsKey(str);
    }

    @Override // com.p7700g.p99005.mi3
    /* renamed from: m */
    public Bundle h() {
        return this.a;
    }

    public ni3(Bundle bundle) {
        this.a = bundle;
    }

    public ni3(Intent intent) {
        this.a = intent.getExtras();
    }
}