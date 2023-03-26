package com.p7700g.p99005;

/* compiled from: GifDrawableResource.java */
/* loaded from: classes2.dex */
public class xw1 extends mw1<vw1> implements yr1 {
    public xw1(vw1 vw1Var) {
        super(vw1Var);
    }

    @Override // com.p7700g.p99005.cs1
    public void a() {
        ((vw1) this.s).stop();
        ((vw1) this.s).p();
    }

    @Override // com.p7700g.p99005.cs1
    public int c() {
        return ((vw1) this.s).m();
    }

    @Override // com.p7700g.p99005.cs1
    @x1
    public Class<vw1> d() {
        return vw1.class;
    }

    @Override // com.p7700g.p99005.mw1, com.p7700g.p99005.yr1
    public void initialize() {
        ((vw1) this.s).h().prepareToDraw();
    }
}