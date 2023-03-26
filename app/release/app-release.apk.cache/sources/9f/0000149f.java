package com.facebook.ads.redexgen.X;

import android.os.Build;
import java.util.Locale;

/* loaded from: assets/audience_network.dex */
public class VL implements InterfaceC04416i {
    public final /* synthetic */ VN A00;

    public VL(VN vn) {
        this.A00 = vn;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04416i
    public final AbstractC04566x A50() {
        if (Build.VERSION.SDK_INT < 21) {
            return this.A00.A08(EnumC04526t.A05);
        }
        return this.A00.A09(Locale.getDefault().getScript());
    }
}