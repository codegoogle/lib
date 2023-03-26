package com.p7700g.p99005;

/* compiled from: OffsetEdgeTreatment.java */
/* loaded from: classes3.dex */
public final class nh2 extends ih2 {
    private final ih2 a;
    private final float b;

    public nh2(@x1 ih2 ih2Var, float f) {
        this.a = ih2Var;
        this.b = f;
    }

    @Override // com.p7700g.p99005.ih2
    public boolean a() {
        return this.a.a();
    }

    @Override // com.p7700g.p99005.ih2
    public void b(float f, float f2, float f3, @x1 sh2 sh2Var) {
        this.a.b(f, f2 - this.b, f3, sh2Var);
    }
}