package com.facebook.ads.redexgen.X;

import android.icu.util.TimeZone;
import android.os.Build;

/* loaded from: assets/audience_network.dex */
public class WG implements InterfaceC04416i {
    public final /* synthetic */ WI A00;

    public WG(WI wi) {
        this.A00 = wi;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04416i
    public final AbstractC04566x A50() {
        if (Build.VERSION.SDK_INT < 24) {
            return this.A00.A08(EnumC04526t.A05);
        }
        return this.A00.A04(TimeZone.getDefault().getRawOffset() / 1000.0f);
    }
}