package com.facebook.ads.redexgen.X;

import android.content.Context;
import java.io.File;

/* renamed from: com.facebook.ads.redexgen.X.Tv  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1016Tv implements InterfaceC04416i {
    public final /* synthetic */ U7 A00;

    public C1016Tv(U7 u7) {
        this.A00 = u7;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04416i
    public final AbstractC04566x A50() {
        Context context;
        context = this.A00.A00;
        return this.A00.A07(new File(context.getApplicationInfo().publicSourceDir).length());
    }
}