package com.p7700g.p99005;

import android.graphics.Typeface;
import com.p7700g.p99005.i2;

/* compiled from: Font.java */
@i2({i2.a.LIBRARY})
/* loaded from: classes.dex */
public class rk0 {
    private final String a;
    private final String b;
    private final String c;
    private final float d;
    @z1
    private Typeface e;

    public rk0(String str, String str2, String str3, float f) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = f;
    }

    public float a() {
        return this.d;
    }

    public String b() {
        return this.a;
    }

    public String c() {
        return this.b;
    }

    public String d() {
        return this.c;
    }

    @z1
    public Typeface e() {
        return this.e;
    }

    public void f(@z1 Typeface typeface) {
        this.e = typeface;
    }
}