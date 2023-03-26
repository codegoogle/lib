package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Tt  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1014Tt implements InterfaceC04416i {
    public final /* synthetic */ U7 A00;

    public C1014Tt(U7 u7) {
        this.A00 = u7;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04416i
    public final AbstractC04566x A50() throws Throwable {
        C04325z c04325z;
        AnonymousClass72 anonymousClass72;
        c04325z = this.A00.A02;
        if (c04325z.A0a() == EnumC04456m.A0I) {
            return this.A00.A08(EnumC04526t.A04);
        }
        anonymousClass72 = this.A00.A03;
        String A07 = anonymousClass72.A07(10010);
        if (A07 != null) {
            return this.A00.A09(A07);
        }
        return this.A00.A08(EnumC04526t.A07);
    }
}