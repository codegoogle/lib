package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.os.PowerManager;

/* renamed from: com.facebook.ads.redexgen.X.Vm  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1059Vm implements InterfaceC04416i {
    public final /* synthetic */ C1061Vo A00;

    public C1059Vm(C1061Vo c1061Vo) {
        this.A00 = c1061Vo;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04416i
    public final AbstractC04566x A50() {
        PowerManager powerManager;
        PowerManager powerManager2;
        if (Build.VERSION.SDK_INT < 23) {
            return this.A00.A08(EnumC04526t.A05);
        }
        powerManager = this.A00.A00;
        if (powerManager == null) {
            return this.A00.A08(EnumC04526t.A07);
        }
        C1061Vo c1061Vo = this.A00;
        powerManager2 = c1061Vo.A00;
        return c1061Vo.A0G(powerManager2.isDeviceIdleMode());
    }
}