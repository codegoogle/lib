package com.facebook.ads.redexgen.X;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class TZ extends C6V {
    public final List<C04386f> A00;

    public TZ(Context context, C04325z c04325z) {
        super(context, c04325z);
        this.A00 = new ArrayList();
    }

    public final List<C04386f> A03() {
        return Collections.unmodifiableList(this.A00);
    }

    public final void A04(C04386f c04386f) {
        if (c04386f.A03().contains(EnumC04456m.A0B)) {
            this.A00.add(c04386f);
        }
    }

    public final void A05(EnumC04426j enumC04426j) {
        A02(enumC04426j, this.A00);
    }
}