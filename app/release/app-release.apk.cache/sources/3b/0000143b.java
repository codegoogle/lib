package com.facebook.ads.redexgen.X;

import android.app.ActivityManager;

/* renamed from: com.facebook.ads.redexgen.X.Tj  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1004Tj implements InterfaceC04416i {
    public final /* synthetic */ C1007Tm A00;

    public C1004Tj(C1007Tm c1007Tm) {
        this.A00 = c1007Tm;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04416i
    public final AbstractC04566x A50() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo;
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo2;
        runningAppProcessInfo = this.A00.A01;
        if (runningAppProcessInfo == null) {
            return this.A00.A08(EnumC04526t.A07);
        }
        C1007Tm c1007Tm = this.A00;
        runningAppProcessInfo2 = c1007Tm.A01;
        return c1007Tm.A05(runningAppProcessInfo2.importance);
    }
}