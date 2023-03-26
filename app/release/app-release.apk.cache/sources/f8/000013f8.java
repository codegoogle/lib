package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Sd  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0974Sd implements AnonymousClass49 {
    public static String[] A01;
    public final /* synthetic */ ES A00;

    static {
        A00();
    }

    public static void A00() {
        A01 = new String[]{"IP6gXu3Aic9rrZpr", "DSm6OHbiM4aoMyjFh2wy7Spd3inn5axc", "lJd94ygIcpnkIi9oYNWqXg3HQV8t0X4Q", "337I3pVrWHOBtYrFGcdtPHZp8Kpz9VIJ", "vd5lczoeg9gY82TvyWngHoQKFpNC9gt0", "CefcuhKyPhUbDvzsvxPUhaoMgi2Xy5FO", "Qia1n7qQgpdEP2KZeQvga8Xzcvoo51Ij", "UfDKqgBAky8ekVpIbdpaQQPTuf6RISL4"};
    }

    public C0974Sd(ES es) {
        this.A00 = es;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass49
    public final void A8r(C4X c4x) {
        boolean A0B;
        c4x.A0a(true);
        if (c4x.A06 != null && c4x.A07 == null) {
            c4x.A06 = null;
        }
        c4x.A07 = null;
        A0B = c4x.A0B();
        if (!A0B && !this.A00.A20(c4x.A0H) && c4x.A0f()) {
            ES es = this.A00;
            if (A01[6].charAt(16) != 'e') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[0] = "BbBTSQcWyeSpGVnm";
            strArr[0] = "BbBTSQcWyeSpGVnm";
            es.removeDetachedView(c4x.A0H, false);
        }
    }
}