package com.p7700g.p99005;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: HelperWidget.java */
/* loaded from: classes.dex */
public class ec extends zb implements dc {
    public zb[] A1 = new zb[4];
    public int B1 = 0;

    @Override // com.p7700g.p99005.dc
    public void a() {
        this.B1 = 0;
        Arrays.fill(this.A1, (Object) null);
    }

    @Override // com.p7700g.p99005.dc
    public void b(zb zbVar) {
        if (zbVar == this || zbVar == null) {
            return;
        }
        int i = this.B1 + 1;
        zb[] zbVarArr = this.A1;
        if (i > zbVarArr.length) {
            this.A1 = (zb[]) Arrays.copyOf(zbVarArr, zbVarArr.length * 2);
        }
        zb[] zbVarArr2 = this.A1;
        int i2 = this.B1;
        zbVarArr2[i2] = zbVar;
        this.B1 = i2 + 1;
    }

    @Override // com.p7700g.p99005.dc
    public void c(ac acVar) {
    }

    public void k2(ArrayList<yc> arrayList, int i, yc ycVar) {
        for (int i2 = 0; i2 < this.B1; i2++) {
            ycVar.a(this.A1[i2]);
        }
        for (int i3 = 0; i3 < this.B1; i3++) {
            sc.a(this.A1[i3], i, arrayList, ycVar);
        }
    }

    public int l2(int i) {
        int i2;
        int i3;
        for (int i4 = 0; i4 < this.B1; i4++) {
            zb zbVar = this.A1[i4];
            if (i == 0 && (i3 = zbVar.y1) != -1) {
                return i3;
            }
            if (i == 1 && (i2 = zbVar.z1) != -1) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.p7700g.p99005.zb
    public void n(zb zbVar, HashMap<zb, zb> hashMap) {
        super.n(zbVar, hashMap);
        ec ecVar = (ec) zbVar;
        this.B1 = 0;
        int i = ecVar.B1;
        for (int i2 = 0; i2 < i; i2++) {
            b(hashMap.get(ecVar.A1[i2]));
        }
    }
}