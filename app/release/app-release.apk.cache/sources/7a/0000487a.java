package com.p7700g.p99005;

import android.graphics.Bitmap;
import com.p7700g.p99005.i2;

/* compiled from: LottieImageAsset.java */
/* loaded from: classes.dex */
public class ii0 {
    private final int a;
    private final int b;
    private final String c;
    private final String d;
    private final String e;
    @z1
    private Bitmap f;

    @i2({i2.a.s})
    public ii0(int i, int i2, String str, String str2, String str3) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    @z1
    public Bitmap a() {
        return this.f;
    }

    public String b() {
        return this.e;
    }

    public String c() {
        return this.d;
    }

    public int d() {
        return this.b;
    }

    public String e() {
        return this.c;
    }

    public int f() {
        return this.a;
    }

    public boolean g() {
        return this.f != null || (this.d.startsWith("data:") && this.d.indexOf("base64,") > 0);
    }

    public void h(@z1 Bitmap bitmap) {
        this.f = bitmap;
    }
}