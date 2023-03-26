package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public class SN implements C3N {
    public final /* synthetic */ C0624Ee A00;
    public final /* synthetic */ C3L A01;

    public SN(C0624Ee c0624Ee, C3L c3l) {
        this.A00 = c0624Ee;
        this.A01 = c3l;
    }

    @Override // com.facebook.ads.redexgen.X.C3N
    public final Object A4C(int i) {
        C3J A00 = this.A01.A00(i);
        if (A00 == null) {
            return null;
        }
        return A00.A0N();
    }

    @Override // com.facebook.ads.redexgen.X.C3N
    public final List<Object> A55(String str, int i) {
        List<C3J> A03 = this.A01.A03(str, i);
        if (A03 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int size = A03.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(A03.get(i2).A0N());
        }
        return arrayList;
    }

    @Override // com.facebook.ads.redexgen.X.C3N
    public final boolean ABb(int i, int i2, Bundle bundle) {
        return this.A01.A04(i, i2, bundle);
    }
}