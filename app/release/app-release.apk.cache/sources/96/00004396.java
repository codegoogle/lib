package com.p7700g.p99005;

/* compiled from: MultiplePulseRing.java */
/* loaded from: classes2.dex */
public class g22 extends y12 {
    @Override // com.p7700g.p99005.y12
    public void R(x12... x12VarArr) {
        int i = 0;
        while (i < x12VarArr.length) {
            x12 x12Var = x12VarArr[i];
            i++;
            x12Var.x(i * 200);
        }
    }

    @Override // com.p7700g.p99005.y12
    public x12[] S() {
        return new x12[]{new i22(), new i22(), new i22()};
    }
}