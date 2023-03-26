package com.p7700g.p99005;

import android.os.Parcelable;
import android.os.PersistableBundle;

/* compiled from: BundleCompat.java */
@e2(api = 22)
/* loaded from: classes3.dex */
public class pi3 implements mi3<PersistableBundle> {
    private PersistableBundle a;

    public pi3() {
        this.a = new PersistableBundle();
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
        this.a = (PersistableBundle) parcelable;
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
    public PersistableBundle h() {
        return this.a;
    }

    public pi3(PersistableBundle persistableBundle) {
        this.a = persistableBundle;
    }
}