package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public final class TY extends C6V implements C6Q {
    public C6F A00;
    public final C04325z A01;
    public final Map<Integer, C04386f> A02;

    @SuppressLint({"UseSparseArrays"})
    public TY(Context context, C04325z c04325z) {
        super(context, c04325z);
        this.A02 = new HashMap();
        this.A01 = c04325z;
    }

    public final void A03(C04386f c04386f) {
        this.A02.put(Integer.valueOf(c04386f.A00()), c04386f);
    }

    public final void A04(EnumC04426j enumC04426j, Context context) {
        this.A00 = C6F.A00(context, this.A01);
        this.A00.A05(this.A02, enumC04426j);
    }

    @Override // com.facebook.ads.redexgen.X.C6Q
    public final void ABY() {
        C6F c6f = this.A00;
        if (c6f != null) {
            c6f.A04();
        }
    }
}