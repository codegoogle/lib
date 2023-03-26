package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;
import org.xbill.DNS.Flags;

/* renamed from: com.facebook.ads.redexgen.X.Ys  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1143Ys implements DQ {
    public static String[] A0C;
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public Format A05;
    public CW A06;
    public String A07;
    public boolean A08;
    public final IP A09;
    public final IQ A0A;
    public final String A0B;

    static {
        A01();
    }

    public static void A01() {
        A0C = new String[]{"nJiMpwDCR7ZAmhQyp9AOHiC56UVcRx0k", "lCnqxh0y89Em7p481QheNATB6nErTPja", "EOgZonHCFyaPw1rQOdlgFposS9KMweND", "oVFhsCJtzutno5RzvIOwcHRYGNjJYB0M", "4", "S", "C7ZxqwSPJTae6vgKBRSPBAMVUD", "Gg5xSTo0LtnMpcaC7QBiBySoh1"};
    }

    public C1143Ys() {
        this(null);
    }

    public C1143Ys(String str) {
        this.A09 = new IP(new byte[128]);
        this.A0A = new IQ(this.A09.A00);
        this.A02 = 0;
        this.A0B = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004a, code lost:
        if (r1.A05 == r13.A05.A0O) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A00() {
        this.A09.A08(0);
        C0544Ar A09 = C0545As.A09(this.A09);
        if (this.A05 != null && A09.A00 == this.A05.A05) {
            int i = A09.A03;
            Format format = this.A05;
            String[] strArr = A0C;
            if (strArr[5].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0C;
            strArr2[2] = "c77shWRMJ0xw1RnCUz3RaGOhMvVQh1Vq";
            strArr2[2] = "c77shWRMJ0xw1RnCUz3RaGOhMvVQh1Vq";
            if (i == format.A0C) {
            }
        }
        this.A05 = Format.A07(this.A07, A09.A05, null, -1, -1, A09.A00, A09.A03, null, null, 0, this.A0B);
        this.A06.A5A(this.A05);
        this.A01 = A09.A01;
        this.A03 = (A09.A02 * 1000000) / this.A05.A0C;
    }

    private boolean A02(IQ iq) {
        while (true) {
            if (iq.A05() <= 0) {
                return false;
            }
            if (!this.A08) {
                this.A08 = iq.A0F() == 11;
            } else {
                int A0F = iq.A0F();
                if (A0F == 119) {
                    this.A08 = false;
                    return true;
                }
                this.A08 = A0F == 11;
            }
        }
    }

    private boolean A03(IQ iq, byte[] bArr, int i) {
        int min = Math.min(iq.A05(), i - this.A00);
        iq.A0d(bArr, this.A00, min);
        this.A00 += min;
        return this.A00 == i;
    }

    @Override // com.facebook.ads.redexgen.X.DQ
    public final void A48(IQ iq) {
        while (iq.A05() > 0) {
            int i = this.A02;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        int min = Math.min(iq.A05(), this.A01 - this.A00);
                        this.A06.ACe(iq, min);
                        this.A00 += min;
                        int i2 = this.A00;
                        int i3 = this.A01;
                        if (i2 == i3) {
                            this.A06.ACf(this.A04, 1, i3, 0, null);
                            this.A04 += this.A03;
                            this.A02 = 0;
                        }
                    }
                } else if (A03(iq, this.A0A.A00, 128)) {
                    A00();
                    this.A0A.A0Z(0);
                    this.A06.ACe(this.A0A, 128);
                    this.A02 = 2;
                }
            } else if (A02(iq)) {
                this.A02 = 1;
                this.A0A.A00[0] = Flags.CD;
                this.A0A.A00[1] = 119;
                this.A00 = 2;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.DQ
    public final void A4U(CM cm, C0600De c0600De) {
        c0600De.A06();
        this.A07 = c0600De.A05();
        this.A06 = cm.ADY(c0600De.A04(), 1);
    }

    @Override // com.facebook.ads.redexgen.X.DQ
    public final void ABV() {
    }

    @Override // com.facebook.ads.redexgen.X.DQ
    public final void ABW(long j, boolean z) {
        this.A04 = j;
    }

    @Override // com.facebook.ads.redexgen.X.DQ
    public final void ACi() {
        this.A02 = 0;
        this.A00 = 0;
        this.A08 = false;
    }
}