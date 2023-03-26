package com.facebook.ads.redexgen.X;

import android.content.pm.PackageManager;

/* loaded from: assets/audience_network.dex */
public class VY implements InterfaceC04416i {
    public final /* synthetic */ C1057Vk A00;

    public VY(C1057Vk c1057Vk) {
        this.A00 = c1057Vk;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04416i
    public final AbstractC04566x A50() {
        PackageManager packageManager;
        PackageManager packageManager2;
        packageManager = this.A00.A02;
        if (packageManager == null) {
            return this.A00.A08(EnumC04526t.A07);
        }
        C1057Vk c1057Vk = this.A00;
        packageManager2 = c1057Vk.A02;
        return c1057Vk.A0G(packageManager2.isSafeMode());
    }
}