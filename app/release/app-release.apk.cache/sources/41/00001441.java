package com.facebook.ads.redexgen.X;

import android.content.pm.ApplicationInfo;
import android.os.Build;

/* renamed from: com.facebook.ads.redexgen.X.Tp  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1010Tp implements InterfaceC04416i {
    public final /* synthetic */ U7 A00;

    public C1010Tp(U7 u7) {
        this.A00 = u7;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04416i
    public final AbstractC04566x A50() {
        ApplicationInfo applicationInfo;
        ApplicationInfo applicationInfo2;
        if (Build.VERSION.SDK_INT < 26) {
            return this.A00.A08(EnumC04526t.A05);
        }
        applicationInfo = this.A00.A01;
        if (applicationInfo == null) {
            return this.A00.A08(EnumC04526t.A07);
        }
        U7 u7 = this.A00;
        applicationInfo2 = u7.A01;
        return u7.A05(applicationInfo2.category);
    }
}