package com.p7700g.p99005;

/* compiled from: Rectangle.java */
/* loaded from: classes.dex */
public class hc {
    public int a;
    public int b;
    public int c;
    public int d;

    public boolean a(int i, int i2) {
        int i3;
        int i4 = this.a;
        return i >= i4 && i < i4 + this.c && i2 >= (i3 = this.b) && i2 < i3 + this.d;
    }

    public int b() {
        return (this.a + this.c) / 2;
    }

    public int c() {
        return (this.b + this.d) / 2;
    }

    public void d(int i, int i2) {
        this.a -= i;
        this.b -= i2;
        this.c = (i * 2) + this.c;
        this.d = (i2 * 2) + this.d;
    }

    public boolean e(hc hcVar) {
        int i;
        int i2;
        int i3 = this.a;
        int i4 = hcVar.a;
        return i3 >= i4 && i3 < i4 + hcVar.c && (i = this.b) >= (i2 = hcVar.b) && i < i2 + hcVar.d;
    }

    public void f(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }
}