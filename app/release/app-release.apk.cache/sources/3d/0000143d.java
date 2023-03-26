package com.facebook.ads.redexgen.X;

import android.app.ActivityManager;

/* renamed from: com.facebook.ads.redexgen.X.Tl  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1006Tl implements InterfaceC04416i {
    public final /* synthetic */ C1007Tm A00;

    public C1006Tl(C1007Tm c1007Tm) {
        this.A00 = c1007Tm;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04416i
    public final AbstractC04566x A50() {
        ActivityManager activityManager;
        activityManager = this.A00.A02;
        if (activityManager != null) {
            return this.A00.A0G(ActivityManager.isRunningInTestHarness());
        }
        return this.A00.A08(EnumC04526t.A07);
    }
}