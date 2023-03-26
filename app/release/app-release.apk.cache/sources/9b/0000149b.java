package com.facebook.ads.redexgen.X;

import android.app.KeyguardManager;
import android.os.Build;

/* loaded from: assets/audience_network.dex */
public class VH implements InterfaceC04416i {
    public final /* synthetic */ VI A00;

    public VH(VI vi) {
        this.A00 = vi;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04416i
    public final AbstractC04566x A50() {
        KeyguardManager keyguardManager;
        KeyguardManager keyguardManager2;
        if (Build.VERSION.SDK_INT < 16) {
            return this.A00.A08(EnumC04526t.A05);
        }
        keyguardManager = this.A00.A00;
        if (keyguardManager == null) {
            return this.A00.A08(EnumC04526t.A07);
        }
        VI vi = this.A00;
        keyguardManager2 = vi.A00;
        return vi.A0G(keyguardManager2.isKeyguardSecure());
    }
}