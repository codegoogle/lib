package com.facebook.ads.redexgen.X;

import android.content.pm.PackageInfo;
import android.os.Build;

/* renamed from: com.facebook.ads.redexgen.X.Vd  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1050Vd implements InterfaceC04416i {
    public final /* synthetic */ C1057Vk A00;

    public C1050Vd(C1057Vk c1057Vk) {
        this.A00 = c1057Vk;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04416i
    public final AbstractC04566x A50() {
        PackageInfo packageInfo;
        PackageInfo packageInfo2;
        PackageInfo packageInfo3;
        packageInfo = this.A00.A01;
        if (packageInfo != null) {
            if (Build.VERSION.SDK_INT < 28) {
                C1057Vk c1057Vk = this.A00;
                packageInfo2 = c1057Vk.A01;
                return c1057Vk.A05(packageInfo2.versionCode);
            }
            C1057Vk c1057Vk2 = this.A00;
            packageInfo3 = c1057Vk2.A01;
            return c1057Vk2.A07(packageInfo3.getLongVersionCode());
        }
        return this.A00.A08(EnumC04526t.A07);
    }
}