package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.metadata.Metadata;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import org.xbill.DNS.Flags;
import org.xbill.DNS.WKSRecord;

/* loaded from: assets/audience_network.dex */
public final class YW implements CK {
    public static byte[] A0E;
    public static String[] A0F;
    public static final CN A0G;
    public static final int A0H;
    public static final int A0I;
    public static final int A0J;
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public CM A04;
    public CW A05;
    public YV A06;
    public Metadata A07;
    public final int A08;
    public final long A09;
    public final CO A0A;
    public final CP A0B;
    public final CQ A0C;
    public final IQ A0D;

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0E, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 28);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A0E = new byte[]{117, 82, 90, 83, 97, 87, 83, 64, 81, 90, 87, 86, 18, 70, 93, 93, 18, 95, 83, 92, 75, 18, 80, 75, 70, 87, 65, 28, 0, 20, 4, 31, Flags.CD, 58, 61, 52};
    }

    public static void A06() {
        A0F = new String[]{"ydp2W5xsf3wxxmCItZRtLRLpaCcQN61V", "ZzeQ67WJ6", "MfxT7BiZm", "QAZkmCdKFAHfN7ilsO4NsWCm7AIOdsAB", "uXA2W", "sq6CLgUZZ", "GhmTF3RrY3ydpwpSZCJZy8aIHeXkOr61", "710SvX7FP4z"};
    }

    static {
        A06();
        A05();
        A0G = new YU();
        A0J = C0726Ig.A08(A04(32, 4, 79));
        A0H = C0726Ig.A08(A04(0, 4, 32));
        A0I = C0726Ig.A08(A04(28, 4, 74));
    }

    public YW() {
        this(0);
    }

    public YW(int i) {
        this(i, -9223372036854775807L);
    }

    public YW(int i, long j) {
        this.A08 = i;
        this.A09 = j;
        this.A0D = new IQ(10);
        this.A0C = new CQ();
        this.A0A = new CO();
        this.A02 = -9223372036854775807L;
        this.A0B = new CP();
    }

    private int A00(CL cl) throws IOException, InterruptedException {
        if (this.A00 == 0) {
            cl.ACa();
            String[] strArr = A0F;
            if (strArr[1].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0F;
            strArr2[0] = "k6Z5PTGWNQqxWVGEWp2g14fMjsllqw2H";
            strArr2[6] = "hJNgcdrxKvM79jF48EqDHnrsGOClnbxU";
            if (!cl.ABa(this.A0D.A00, 0, 4, true)) {
                return -1;
            }
            this.A0D.A0Z(0);
            int A09 = this.A0D.A09();
            if (!A07(A09, this.A01) || CQ.A00(A09) == -1) {
                cl.ADG(1);
                this.A01 = 0;
                return 0;
            }
            CQ.A05(A09, this.A0C);
            if (this.A02 == -9223372036854775807L) {
                this.A02 = this.A06.A76(cl.A6m());
                if (this.A09 != -9223372036854775807L) {
                    this.A02 += this.A09 - this.A06.A76(0L);
                }
            }
            this.A00 = this.A0C.A02;
        }
        int ACd = this.A05.ACd(cl, this.A00, true);
        if (ACd == -1) {
            return -1;
        }
        this.A00 -= ACd;
        if (this.A00 > 0) {
            return 0;
        }
        this.A05.ACf(this.A02 + ((this.A03 * 1000000) / this.A0C.A03), 1, this.A0C.A02, 0, null);
        this.A03 += this.A0C.A04;
        this.A00 = 0;
        return 0;
    }

    public static int A01(IQ iq, int i) {
        if (iq.A08() >= i + 4) {
            iq.A0Z(i);
            int A09 = iq.A09();
            if (A09 == A0J || A09 == A0H) {
                return A09;
            }
        }
        if (iq.A08() >= 40) {
            iq.A0Z(36);
            int A092 = iq.A09();
            int i2 = A0I;
            if (A092 == i2) {
                return i2;
            }
            return 0;
        }
        return 0;
    }

    private YV A02(CL cl) throws IOException, InterruptedException {
        cl.ABZ(this.A0D.A00, 0, 4);
        this.A0D.A0Z(0);
        CQ.A05(this.A0D.A09(), this.A0C);
        return new CH(cl.A6T(), cl.A6m(), this.A0C);
    }

    private YV A03(CL cl) throws IOException, InterruptedException {
        IQ iq = new IQ(this.A0C.A02);
        cl.ABZ(iq.A00, 0, this.A0C.A02);
        int i = 21;
        if ((this.A0C.A05 & 1) == 0) {
            int seekHeader = this.A0C.A01;
            if (seekHeader == 1) {
                i = 13;
            }
        } else if (this.A0C.A01 != 1) {
            i = 36;
        }
        int A01 = A01(iq, i);
        int seekHeader2 = A0J;
        if (A01 != seekHeader2) {
            int seekHeader3 = A0H;
            if (A01 != seekHeader3) {
                int seekHeader4 = A0I;
                if (A01 == seekHeader4) {
                    CG A00 = CG.A00(cl.A6T(), cl.A6m(), this.A0C, iq);
                    int seekHeader5 = this.A0C.A02;
                    cl.ADG(seekHeader5);
                    return A00;
                }
                cl.ACa();
                return null;
            }
        }
        CD A012 = CD.A01(cl.A6T(), cl.A6m(), this.A0C, iq);
        if (A012 != null && !this.A0A.A04()) {
            cl.ACa();
            int seekHeader6 = i + WKSRecord.Service.EMFIS_CNTL;
            cl.A3M(seekHeader6);
            cl.ABZ(this.A0D.A00, 0, 3);
            this.A0D.A0Z(0);
            CO co = this.A0A;
            int seekHeader7 = this.A0D.A0H();
            co.A05(seekHeader7);
        }
        int seekHeader8 = this.A0C.A02;
        cl.ADG(seekHeader8);
        if (A012 == null || A012.A7m()) {
            return A012;
        }
        int seekHeader9 = A0H;
        if (A01 == seekHeader9) {
            return A02(cl);
        }
        return A012;
    }

    public static boolean A07(int i, long j) {
        return ((long) ((-128000) & i)) == ((-128000) & j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
        if (r15 == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004d, code lost:
        r14.ADG(r5 + r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0051, code lost:
        r13.A01 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0053, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0054, code lost:
        r14.ACa();
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x009b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean A08(CL cl, boolean z) throws IOException, InterruptedException {
        int searchedBytes = 0;
        int searchLimitBytes = 0;
        int headerData = 0;
        int searchedBytes2 = 0;
        int i = z ? 16384 : 131072;
        cl.ACa();
        if (cl.A6m() == 0) {
            this.A07 = this.A0B.A00(cl, (this.A08 & 2) != 0 ? CO.A04 : null);
            Metadata metadata = this.A07;
            if (metadata != null) {
                this.A0A.A06(metadata);
            }
            headerData = (int) cl.A6h();
            if (!z) {
                cl.ADG(headerData);
            }
        }
        while (true) {
            if (!cl.ABa(this.A0D.A00, 0, 4, searchedBytes > 0)) {
                break;
            }
            this.A0D.A0Z(0);
            int A09 = this.A0D.A09();
            if (searchLimitBytes != 0) {
                boolean A07 = A07(A09, searchLimitBytes);
                String[] strArr = A0F;
                if (strArr[2].length() != strArr[5].length()) {
                    break;
                }
                String[] strArr2 = A0F;
                strArr2[2] = "nssPeb4tx";
                strArr2[5] = "z93zYtEja";
                if (!A07) {
                    int i2 = searchedBytes2 + 1;
                    if (searchedBytes2 != i) {
                        if (z) {
                            return false;
                        }
                        throw new AN(A04(4, 24, 46));
                    }
                    searchedBytes = 0;
                    searchLimitBytes = 0;
                    if (z) {
                        cl.ACa();
                        cl.A3M(headerData + i2);
                    } else {
                        cl.ADG(1);
                    }
                    searchedBytes2 = i2;
                }
            }
            int A00 = CQ.A00(A09);
            if (A00 == -1) {
                int i22 = searchedBytes2 + 1;
                if (searchedBytes2 != i) {
                }
            } else {
                searchedBytes++;
                if (searchedBytes == 1) {
                    CQ.A05(A09, this.A0C);
                    String[] strArr3 = A0F;
                    if (strArr3[1].length() == strArr3[4].length()) {
                        break;
                    }
                    String[] strArr4 = A0F;
                    strArr4[0] = "7zrNMK9WlizC5ZgtVSnCLN45BdGxm2zl";
                    strArr4[6] = "9rqhFN3Qk74SkJ0Nh6RYQs7QnFKhXl33";
                    searchLimitBytes = A09;
                } else if (searchedBytes == 4) {
                    break;
                }
                cl.A3M(A00 - 4);
            }
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.X.CK
    public final void A7Q(CM cm) {
        this.A04 = cm;
        this.A05 = this.A04.ADY(0, 1);
        this.A04.A4w();
    }

    @Override // com.facebook.ads.redexgen.X.CK
    public final int ABx(CL cl, CR cr) throws IOException, InterruptedException {
        if (this.A01 == 0) {
            try {
                A08(cl, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.A06 == null) {
            this.A06 = A03(cl);
            YV yv = this.A06;
            if (yv == null || (!yv.A7m() && (this.A08 & 1) != 0)) {
                YV A02 = A02(cl);
                String[] strArr = A0F;
                if (strArr[2].length() != strArr[5].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0F;
                strArr2[3] = "vRoDRHRtSRtNnEEJ64K4r5ogXxosELXw";
                strArr2[3] = "vRoDRHRtSRtNnEEJ64K4r5ogXxosELXw";
                this.A06 = A02;
            }
            this.A04.ACk(this.A06);
            this.A05.A5A(Format.A05(null, this.A0C.A06, null, -1, 4096, this.A0C.A01, this.A0C.A03, -1, this.A0A.A00, this.A0A.A01, null, null, 0, null, (this.A08 & 2) != 0 ? null : this.A07));
        }
        return A00(cl);
    }

    @Override // com.facebook.ads.redexgen.X.CK
    public final void ACj(long j, long j2) {
        this.A01 = 0;
        this.A02 = -9223372036854775807L;
        this.A03 = 0L;
        this.A00 = 0;
    }

    @Override // com.facebook.ads.redexgen.X.CK
    public final boolean ADH(CL cl) throws IOException, InterruptedException {
        return A08(cl, true);
    }
}