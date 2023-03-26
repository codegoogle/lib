package com.facebook.ads.redexgen.X;

import android.content.pm.ConfigurationInfo;

/* renamed from: com.facebook.ads.redexgen.X.Th  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1002Th implements InterfaceC04416i {
    public final /* synthetic */ C1007Tm A00;

    public C1002Th(C1007Tm c1007Tm) {
        this.A00 = c1007Tm;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04416i
    public final AbstractC04566x A50() {
        ConfigurationInfo configurationInfo;
        ConfigurationInfo configurationInfo2;
        configurationInfo = this.A00.A00;
        if (configurationInfo == null) {
            return this.A00.A08(EnumC04526t.A07);
        }
        C1007Tm c1007Tm = this.A00;
        configurationInfo2 = c1007Tm.A00;
        return c1007Tm.A05(configurationInfo2.reqNavigation);
    }
}