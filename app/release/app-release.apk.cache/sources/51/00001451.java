package com.facebook.ads.redexgen.X;

import android.content.pm.ApplicationInfo;

/* loaded from: assets/audience_network.dex */
public class U5 implements InterfaceC04416i {
    public final /* synthetic */ U7 A00;

    public U5(U7 u7) {
        this.A00 = u7;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04416i
    public final AbstractC04566x A50() {
        ApplicationInfo applicationInfo;
        ApplicationInfo applicationInfo2;
        applicationInfo = this.A00.A01;
        if (applicationInfo == null) {
            return this.A00.A08(EnumC04526t.A07);
        }
        U7 u7 = this.A00;
        applicationInfo2 = u7.A01;
        return u7.A09(applicationInfo2.processName);
    }
}