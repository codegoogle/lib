package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.Zh  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1157Zh implements InterfaceC0647Fd {
    public static String[] A03;
    public boolean A00;
    public final InterfaceC0647Fd A01;
    public final /* synthetic */ B0 A02;

    static {
        A00();
    }

    public static void A00() {
        A03 = new String[]{"Y0RqBQKF49030hyQzszDurtmlsUicf4U", "tAeRat44Mts19", "EPGGJhXl7bdoeZDT1hnWH0ijeyZXJvPV", "NBArrZMeyPwcwZbguPm4zDdVfStRBHKE", "9Syc9rzKlnhB1gjxfWOFcJRGeL88RA9A", "zPpMUsK8OtHy3XCHJzxzsSjo5boBV7qo", "d", "R"};
    }

    public C1157Zh(B0 b0, InterfaceC0647Fd interfaceC0647Fd) {
        this.A02 = b0;
        this.A01 = interfaceC0647Fd;
    }

    public final void A01() {
        this.A00 = false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0647Fd
    public final boolean A7i() {
        return !this.A02.A04() && this.A01.A7i();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0647Fd
    public final void A8U() throws IOException {
        this.A01.A8U();
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0083, code lost:
        if (r7 == Long.MIN_VALUE) goto L29;
     */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0647Fd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int AC0(AH ah, C1121Xw c1121Xw, boolean z) {
        if (this.A02.A04()) {
            return -3;
        }
        if (this.A00) {
            c1121Xw.A02(4);
            return -4;
        }
        int AC0 = this.A01.AC0(ah, c1121Xw, z);
        if (AC0 == -5) {
            Format format = ah.A00;
            if (format.A06 != 0 || format.A07 != 0) {
                ah.A00 = format.A0H(this.A02.A01 != 0 ? 0 : format.A06, this.A02.A00 == Long.MIN_VALUE ? format.A07 : 0);
            }
            return -5;
        }
        if (this.A02.A00 != Long.MIN_VALUE) {
            if (AC0 != -4 || c1121Xw.A00 < this.A02.A00) {
                if (AC0 == -3) {
                    long A5Y = this.A02.A5Y();
                    if (A03[0].charAt(9) == 'D') {
                        throw new RuntimeException();
                    }
                    String[] strArr = A03;
                    strArr[3] = "5QKVTlH6XMkdzqZX2Kpnrvt1Zx1xK1pY";
                    strArr[5] = "sZN1P6CG5u8rJaXjKPttrcVUDogJ8FeU";
                }
            }
            c1121Xw.A07();
            c1121Xw.A02(4);
            this.A00 = true;
            return -4;
        }
        return AC0;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0647Fd
    public final int ADF(long j) {
        if (this.A02.A04()) {
            return -3;
        }
        return this.A01.ADF(j);
    }
}