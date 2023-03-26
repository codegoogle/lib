package com.facebook.ads.redexgen.X;

import android.content.pm.PackageInfo;

/* renamed from: com.facebook.ads.redexgen.X.Vb  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1048Vb implements InterfaceC04416i {
    public final /* synthetic */ C1057Vk A00;

    public C1048Vb(C1057Vk c1057Vk) {
        this.A00 = c1057Vk;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04416i
    public final AbstractC04566x A50() {
        PackageInfo packageInfo;
        PackageInfo packageInfo2;
        packageInfo = this.A00.A01;
        if (packageInfo == null) {
            return this.A00.A08(EnumC04526t.A07);
        }
        C1057Vk c1057Vk = this.A00;
        packageInfo2 = c1057Vk.A01;
        return c1057Vk.A07(packageInfo2.firstInstallTime);
    }
}