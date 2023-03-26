package com.facebook.ads.redexgen.X;

import android.os.Build;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Ue  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1025Ue implements InterfaceC04416i {
    public final /* synthetic */ C1045Uy A00;

    public C1025Ue(C1045Uy c1045Uy) {
        this.A00 = c1045Uy;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04416i
    public final AbstractC04566x A50() {
        if (Build.VERSION.SDK_INT < 21) {
            return this.A00.A08(EnumC04526t.A05);
        }
        String[] strArr = Build.SUPPORTED_ABIS;
        if (strArr != null) {
            return this.A00.A0F(Arrays.asList(strArr));
        }
        return this.A00.A08(EnumC04526t.A07);
    }
}