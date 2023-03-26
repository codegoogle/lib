package com.p7700g.p99005;

/* compiled from: GuidelineReference.java */
/* loaded from: classes.dex */
public class sb implements rb, hb {
    public final kb a;
    private int b;
    private cc c;
    private int d = -1;
    private int e = -1;
    private float f = 0.0f;
    private Object g;

    public sb(kb kbVar) {
        this.a = kbVar;
    }

    @Override // com.p7700g.p99005.rb, com.p7700g.p99005.hb
    public void a() {
        this.c.B2(this.b);
        int i = this.d;
        if (i != -1) {
            this.c.w2(i);
            return;
        }
        int i2 = this.e;
        if (i2 != -1) {
            this.c.x2(i2);
        } else {
            this.c.y2(this.f);
        }
    }

    @Override // com.p7700g.p99005.rb, com.p7700g.p99005.hb
    public zb b() {
        if (this.c == null) {
            this.c = new cc();
        }
        return this.c;
    }

    @Override // com.p7700g.p99005.hb
    public void c(zb zbVar) {
        if (zbVar instanceof cc) {
            this.c = (cc) zbVar;
        } else {
            this.c = null;
        }
    }

    @Override // com.p7700g.p99005.hb
    public void d(Object obj) {
        this.g = obj;
    }

    @Override // com.p7700g.p99005.hb
    public rb e() {
        return null;
    }

    public sb f(Object obj) {
        this.d = -1;
        this.e = this.a.f(obj);
        this.f = 0.0f;
        return this;
    }

    public int g() {
        return this.b;
    }

    @Override // com.p7700g.p99005.hb
    public Object getKey() {
        return this.g;
    }

    public sb h(float f) {
        this.d = -1;
        this.e = -1;
        this.f = f;
        return this;
    }

    public void i(int i) {
        this.b = i;
    }

    public sb j(Object obj) {
        this.d = this.a.f(obj);
        this.e = -1;
        this.f = 0.0f;
        return this;
    }
}