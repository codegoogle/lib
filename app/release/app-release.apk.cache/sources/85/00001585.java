package com.facebook.ads.redexgen.X;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.Format;
import java.util.Arrays;
import java.util.Collections;

/* loaded from: assets/audience_network.dex */
public final class Z3 implements DQ {
    public static byte[] A0K;
    public static String[] A0L;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public long A09;
    public long A0A;
    public long A0B;
    public Format A0C;
    public CW A0D;
    public String A0E;
    public boolean A0F;
    public boolean A0G;
    public final String A0J;
    public final IQ A0I = new IQ(1024);
    public final IP A0H = new IP(this.A0I.A00);

    static {
        A05();
        A04();
    }

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0K, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            int i5 = (copyOfRange[i4] - i3) - 35;
            String[] strArr = A0L;
            if (strArr[1].charAt(19) != strArr[0].charAt(19)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0L;
            strArr2[3] = "gooppkWHFs0OH8ZO7KHmI5JoYki0niEb";
            strArr2[4] = "gQ32BKgMXcn7uGYeyK4g8BO1uII782R4";
            copyOfRange[i4] = (byte) i5;
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A0K = new byte[]{-87, -67, -84, -79, -73, 119, -75, -72, 124, -87, 117, -76, -87, -68, -75};
    }

    public static void A05() {
        A0L = new String[]{"hgUALiBHRBx3rc9PT3qyJLJuKriNjQIA", "JcSPF8dLSzFIe8gapkYyYGiPDe1iVZ7T", "a8IrrF5hi8IFjeZ2lIy6xY1armnYmb5o", "dI536DedIqR9AIwKwKzHAZoNzdw0gd0o", "spoCU0rWYssiPe95xKAIpCDVtAt9VbvV", "ZT5oGWr6FGwuE", "k3I4LHvMKlhfRum43HVkkWOAjRBPWhRl", "GOwjxx90kdElmS0"};
    }

    public Z3(@Nullable String str) {
        this.A0J = str;
    }

    private int A00(IP ip) throws AN {
        int A02 = ip.A02();
        Pair<Integer, Integer> A022 = I5.A02(ip, true);
        this.A05 = ((Integer) A022.first).intValue();
        this.A02 = ((Integer) A022.second).intValue();
        return A02 - ip.A02();
    }

    private int A01(IP ip) throws AN {
        int A05;
        int i = 0;
        if (this.A03 == 0) {
            do {
                A05 = ip.A05(8);
                i += A05;
            } while (A05 == 255);
            return i;
        }
        throw new AN();
    }

    public static long A02(IP ip) {
        return ip.A05((ip.A05(2) + 1) * 8);
    }

    private void A06(int i) {
        this.A0I.A0X(i);
        this.A0H.A0C(this.A0I.A00);
    }

    private void A07(IP ip) throws AN {
        if (!ip.A0G()) {
            this.A0G = true;
            A09(ip);
        } else if (!this.A0G) {
            return;
        }
        if (this.A00 == 0) {
            if (this.A04 == 0) {
                A0A(ip, A01(ip));
                if (this.A0F) {
                    ip.A09((int) this.A09);
                    return;
                }
                return;
            }
            throw new AN();
        }
        throw new AN();
    }

    private void A08(IP ip) {
        this.A03 = ip.A05(3);
        int i = this.A03;
        if (i == 0) {
            ip.A09(8);
        } else if (i != 1) {
            if (i != 3 && i != 4 && i != 5) {
                if (i != 6) {
                    if (A0L[7].length() != 15) {
                        throw new RuntimeException();
                    }
                    String[] strArr = A0L;
                    strArr[1] = "QJhjenmrzPYVr6mrKS1ywIZfks2sEqmv";
                    strArr[0] = "rtM7Stfru76sVtn814uyI2mxrEEn9Ydu";
                    if (i != 7) {
                        return;
                    }
                }
                ip.A09(1);
                return;
            }
            ip.A09(6);
        } else {
            ip.A09(9);
        }
    }

    private void A09(IP ip) throws AN {
        boolean A0G;
        int numProgram = ip.A05(1);
        int bitsRead = numProgram == 1 ? ip.A05(1) : 0;
        this.A00 = bitsRead;
        if (this.A00 == 0) {
            if (numProgram == 1) {
                A02(ip);
            }
            if (ip.A0G()) {
                this.A04 = ip.A05(6);
                int A05 = ip.A05(4);
                int A052 = ip.A05(3);
                if (A05 == 0 && A052 == 0) {
                    if (numProgram == 0) {
                        int readBits = ip.A04();
                        int A00 = A00(ip);
                        ip.A08(readBits);
                        int readBits2 = A00 + 7;
                        byte[] initData = new byte[readBits2 / 8];
                        ip.A0E(initData, 0, A00);
                        Format A07 = Format.A07(this.A0E, A03(0, 15, 37), null, -1, -1, this.A02, this.A05, Collections.singletonList(initData), null, 0, this.A0J);
                        if (!A07.equals(this.A0C)) {
                            this.A0C = A07;
                            this.A0A = 1024000000 / A07.A0C;
                            this.A0D.A5A(A07);
                        }
                    } else {
                        int A02 = (int) A02(ip);
                        int bitsRead2 = A00(ip);
                        ip.A09(A02 - bitsRead2);
                    }
                    A08(ip);
                    this.A0F = ip.A0G();
                    this.A09 = 0L;
                    if (this.A0F) {
                        if (numProgram == 1) {
                            this.A09 = A02(ip);
                        } else {
                            do {
                                A0G = ip.A0G();
                                this.A09 = (this.A09 << 8) + ip.A05(8);
                            } while (A0G);
                        }
                    }
                    if (ip.A0G()) {
                        ip.A09(8);
                        return;
                    }
                    return;
                }
                throw new AN();
            }
            throw new AN();
        }
        throw new AN();
    }

    private void A0A(IP ip, int i) {
        int A04 = ip.A04();
        if ((A04 & 7) == 0) {
            this.A0I.A0Z(A04 >> 3);
        } else {
            ip.A0E(this.A0I.A00, 0, i * 8);
            this.A0I.A0Z(0);
        }
        this.A0D.ACe(this.A0I, i);
        this.A0D.ACf(this.A0B, 1, i, 0, null);
        this.A0B += this.A0A;
    }

    @Override // com.facebook.ads.redexgen.X.DQ
    public final void A48(IQ iq) throws AN {
        while (iq.A05() > 0) {
            int i = this.A08;
            if (i != 0) {
                if (i == 1) {
                    int A0F = iq.A0F();
                    if ((A0F & 224) == 224) {
                        this.A07 = A0F;
                        this.A08 = 2;
                    } else if (A0F != 86) {
                        this.A08 = 0;
                    }
                } else if (A0L[7].length() != 15) {
                    throw new RuntimeException();
                } else {
                    String[] strArr = A0L;
                    strArr[3] = "eXMY6UfuU8mptnxKZK3KjbCMiU1pAKNs";
                    strArr[4] = "BrFOrdIatggcu5HdAKqvOHyOVIidANWA";
                    if (i == 2) {
                        this.A06 = ((this.A07 & (-225)) << 8) | iq.A0F();
                        if (this.A06 > this.A0I.A00.length) {
                            A06(this.A06);
                        }
                        this.A01 = 0;
                        this.A08 = 3;
                    } else if (i == 3) {
                        int min = Math.min(iq.A05(), this.A06 - this.A01);
                        iq.A0d(this.A0H.A00, this.A01, min);
                        this.A01 += min;
                        if (this.A01 == this.A06) {
                            this.A0H.A08(0);
                            A07(this.A0H);
                            this.A08 = 0;
                        }
                    }
                }
            } else if (iq.A0F() == 86) {
                this.A08 = 1;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.DQ
    public final void A4U(CM cm, C0600De c0600De) {
        c0600De.A06();
        this.A0D = cm.ADY(c0600De.A04(), 1);
        this.A0E = c0600De.A05();
    }

    @Override // com.facebook.ads.redexgen.X.DQ
    public final void ABV() {
    }

    @Override // com.facebook.ads.redexgen.X.DQ
    public final void ABW(long j, boolean z) {
        this.A0B = j;
    }

    @Override // com.facebook.ads.redexgen.X.DQ
    public final void ACi() {
        this.A08 = 0;
        this.A0G = false;
    }
}