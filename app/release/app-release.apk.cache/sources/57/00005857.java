package com.p7700g.p99005;

import com.p7700g.p99005.i2;

/* compiled from: DocumentData.java */
@i2({i2.a.LIBRARY})
/* loaded from: classes.dex */
public class qk0 {
    public String a;
    public String b;
    public float c;
    public a d;
    public int e;
    public float f;
    public float g;
    @w0
    public int h;
    @w0
    public int i;
    public float j;
    public boolean k;

    /* compiled from: DocumentData.java */
    /* loaded from: classes.dex */
    public enum a {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public qk0(String str, String str2, float f, a aVar, int i, float f2, float f3, @w0 int i2, @w0 int i3, float f4, boolean z) {
        a(str, str2, f, aVar, i, f2, f3, i2, i3, f4, z);
    }

    public void a(String str, String str2, float f, a aVar, int i, float f2, float f3, @w0 int i2, @w0 int i3, float f4, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = f;
        this.d = aVar;
        this.e = i;
        this.f = f2;
        this.g = f3;
        this.h = i2;
        this.i = i3;
        this.j = f4;
        this.k = z;
    }

    public int hashCode() {
        String str = this.b;
        int ordinal = ((this.d.ordinal() + (((int) (wo1.x(str, this.a.hashCode() * 31, 31) + this.c)) * 31)) * 31) + this.e;
        long floatToRawIntBits = Float.floatToRawIntBits(this.f);
        return (((ordinal * 31) + ((int) (floatToRawIntBits ^ (floatToRawIntBits >>> 32)))) * 31) + this.h;
    }

    public qk0() {
    }
}