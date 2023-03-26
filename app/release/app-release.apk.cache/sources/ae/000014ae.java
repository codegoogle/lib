package com.facebook.ads.redexgen.X;

import android.content.pm.PackageManager;
import android.os.Build;

/* renamed from: com.facebook.ads.redexgen.X.Va  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1047Va implements InterfaceC04416i {
    public final /* synthetic */ C1057Vk A00;

    public C1047Va(C1057Vk c1057Vk) {
        this.A00 = c1057Vk;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04416i
    public final AbstractC04566x A50() {
        PackageManager packageManager;
        PackageManager packageManager2;
        if (Build.VERSION.SDK_INT < 26) {
            return this.A00.A08(EnumC04526t.A05);
        }
        packageManager = this.A00.A02;
        if (packageManager == null) {
            return this.A00.A08(EnumC04526t.A07);
        }
        C1057Vk c1057Vk = this.A00;
        packageManager2 = c1057Vk.A02;
        return c1057Vk.A0G(packageManager2.canRequestPackageInstalls());
    }
}