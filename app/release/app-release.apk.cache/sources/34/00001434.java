package com.facebook.ads.redexgen.X;

import android.app.ActivityManager;
import android.os.Build;

/* renamed from: com.facebook.ads.redexgen.X.Tc  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0997Tc implements InterfaceC04416i {
    public final /* synthetic */ C1007Tm A00;

    public C0997Tc(C1007Tm c1007Tm) {
        this.A00 = c1007Tm;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04416i
    public final AbstractC04566x A50() {
        ActivityManager activityManager;
        ActivityManager activityManager2;
        if (Build.VERSION.SDK_INT < 23) {
            return this.A00.A08(EnumC04526t.A05);
        }
        activityManager = this.A00.A02;
        if (activityManager == null) {
            return this.A00.A08(EnumC04526t.A07);
        }
        C1007Tm c1007Tm = this.A00;
        activityManager2 = c1007Tm.A02;
        return c1007Tm.A05(activityManager2.getLockTaskModeState());
    }
}