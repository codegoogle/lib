package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Ts  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1013Ts implements InterfaceC04416i {
    public static String[] A01;
    public final /* synthetic */ U7 A00;

    static {
        A00();
    }

    public static void A00() {
        A01 = new String[]{"hvm87xlnXDULJgpudJIAxjipYcLfVpPe", "aPn41y0iNcbQ3vA5A69njqeDstAsTpsV", "WXmwgMFdLW61FUxTxJC7XlBGpuRVL7Wu", "ePkGYIfh56SCQIxOGTOw2FZrMqM6oOvD", "H4G3VitdwZHOwCvFNAwNX1rKXwUNte3T", "QqBVensdyxYwCHnIBjshd9TsYmlVQcVc", "Npnx1Hqps9YG5SIKMksWN5UpsP86zlug", "K4PmfDIjqE3AfePNsovy4"};
    }

    public C1013Ts(U7 u7) {
        this.A00 = u7;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04416i
    public final AbstractC04566x A50() throws Exception {
        AnonymousClass72 anonymousClass72;
        anonymousClass72 = this.A00.A03;
        String A07 = anonymousClass72.A07(10005);
        if (A07 != null) {
            U7 u7 = this.A00;
            if (A01[7].length() != 21) {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[7] = "XG8OcIRWX82QEKbSmFw2M";
            strArr[7] = "XG8OcIRWX82QEKbSmFw2M";
            return u7.A09(A07);
        }
        return this.A00.A08(EnumC04526t.A07);
    }
}