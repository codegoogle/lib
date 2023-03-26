package com.facebook.ads.redexgen.X;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Ta  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0995Ta extends C6V {
    public final List<C04386f> A00;

    public C0995Ta(Context context, C04325z c04325z) {
        super(context, c04325z);
        this.A00 = new ArrayList();
    }

    public final void A03(C04386f c04386f) {
        if (!c04386f.A03().contains(EnumC04456m.A0B)) {
            this.A00.add(c04386f);
        }
    }

    public final void A04(EnumC04426j enumC04426j) {
        A02(enumC04426j, this.A00);
    }
}