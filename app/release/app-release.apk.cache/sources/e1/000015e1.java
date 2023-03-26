package com.facebook.ads.redexgen.X;

import android.content.Context;

/* renamed from: com.facebook.ads.redexgen.X.ab  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1210ab implements HL {
    public final Context A00;
    public final HL A01;
    public final InterfaceC0701Hh<? super HM> A02;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Hh != com.facebook.ads.internal.exoplayer2.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.upstream.DataSource> */
    public C1210ab(Context context, InterfaceC0701Hh<? super HM> interfaceC0701Hh, HL hl) {
        this.A00 = context.getApplicationContext();
        this.A02 = interfaceC0701Hh;
        this.A01 = hl;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Hh != com.facebook.ads.internal.exoplayer2.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.upstream.DataSource> */
    public C1210ab(Context context, String str, InterfaceC0701Hh<? super HM> interfaceC0701Hh) {
        this(context, interfaceC0701Hh, new C2Z(str, interfaceC0701Hh));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.HL
    /* renamed from: A00 */
    public final C1209aa A4D() {
        return new C1209aa(this.A00, this.A02, this.A01.A4D());
    }
}