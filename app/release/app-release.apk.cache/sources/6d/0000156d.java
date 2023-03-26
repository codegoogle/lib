package com.facebook.ads.redexgen.X;

import android.support.v4.media.session.PlaybackStateCompat;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.metadata.Metadata;
import com.microsoft.appcenter.AppCenter;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import org.xbill.DNS.Flags;
import org.xbill.DNS.TTL;

/* renamed from: com.facebook.ads.redexgen.X.Yf  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1130Yf implements CK, CT {
    public static byte[] A0J;
    public static String[] A0K;
    public static final CN A0L;
    public static final int A0M;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public long A07;
    public long A08;
    public CM A09;
    public IQ A0A;
    public boolean A0B;
    public D0[] A0C;
    public long[][] A0D;
    public final int A0E;
    public final IQ A0F;
    public final IQ A0G;
    public final IQ A0H;
    public final ArrayDeque<YX> A0I;

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0J, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 28);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A0J = new byte[]{57, 12, 23, 21, 88, Flags.CD, 17, 2, 29, 88, 20, 29, Flags.CD, Flags.CD, 88, 12, 16, 25, 22, 88, 16, 29, 25, 28, 29, 10, 88, 20, 29, 22, 31, 12, 16, 88, 80, 13, 22, Flags.CD, 13, 8, 8, 23, 10, 12, 29, 28, 81, 86, 4, 1, 85, 85};
    }

    public static void A08() {
        A0K = new String[]{"0jSfxoXEMfCjtmnyDugkNcQJRjSOySMa", "bnCyjA5DcUmWUqivzOXdDI", "awYt8cnKxKdhDKIItvFTiUYUED9yM0q1", "Luabopmg5NHaS5SoCXeHIbwAQFsLRvJ0", "odfzLqPoxtdmNhQ8QVXSS2", "Wo8IxRBaFRXe4oQbEdt7BomqryNllMGC", "1wQy", "sEQm6Nsu4XqoPKwwi3EdYrJfunZcOKFC"};
    }

    static {
        A08();
        A07();
        A0L = new C1129Ye();
        A0M = C0726Ig.A08(A04(48, 4, 105));
    }

    public C1130Yf() {
        this(0);
    }

    public C1130Yf(int i) {
        this.A0E = i;
        this.A0F = new IQ(16);
        this.A0I = new ArrayDeque<>();
        this.A0H = new IQ(IM.A03);
        this.A0G = new IQ(4);
        this.A06 = -1;
    }

    private int A00(long preferredSkipAmount) {
        long j = Long.MAX_VALUE;
        int i = 1;
        int i2 = -1;
        long j2 = Long.MAX_VALUE;
        long j3 = Long.MAX_VALUE;
        int trackIndex = 1;
        int sampleIndex = -1;
        int i3 = 0;
        while (true) {
            D0[] d0Arr = this.A0C;
            if (i3 >= d0Arr.length) {
                break;
            }
            D0 d0 = d0Arr[i3];
            int i4 = d0.A00;
            if (i4 != d0.A03.A01) {
                long j4 = d0.A03.A06[i4];
                long j5 = this.A0D[i3][i4];
                long j6 = j4 - preferredSkipAmount;
                int i5 = (j6 < 0 || j6 >= PlaybackStateCompat.K) ? 1 : 0;
                if ((i5 == 0 && i != 0) || (i5 == i && j6 < j)) {
                    i = i5;
                    j = j6;
                    i2 = i3;
                    j2 = j5;
                }
                if (j5 < j3) {
                    j3 = j5;
                    trackIndex = i5;
                    sampleIndex = i3;
                }
            }
            i3++;
        }
        int i6 = (j3 > Long.MAX_VALUE ? 1 : (j3 == Long.MAX_VALUE ? 0 : -1));
        if (A0K[5].charAt(28) != 'l') {
            throw new RuntimeException();
        }
        String[] strArr = A0K;
        strArr[7] = "2rf3IkD44HipF2iEZWYVpECLVHr0uALb";
        strArr[0] = "2zlrhAiZVnIklu1FhIrlCsqVaSaq97eM";
        if (i6 == 0 || trackIndex == 0) {
            return i2;
        }
        long sampleOffset = AppCenter.DEFAULT_MAX_STORAGE_SIZE_IN_BYTES + j3;
        return j2 < sampleOffset ? i2 : sampleIndex;
    }

    private int A01(CL cl, CR cr) throws IOException, InterruptedException {
        int i;
        long A6m = cl.A6m();
        if (this.A06 == -1) {
            this.A06 = A00(A6m);
            if (this.A06 == -1) {
                return -1;
            }
        }
        D0 d0 = this.A0C[this.A06];
        CW cw = d0.A01;
        int i2 = d0.A00;
        long j = d0.A03.A06[i2];
        int i3 = d0.A03.A05[i2];
        long inputPosition = j - A6m;
        long position = inputPosition + this.A04;
        int sampleSize = (position > 0L ? 1 : (position == 0L ? 0 : -1));
        if (sampleSize >= 0) {
            int sampleSize2 = (position > PlaybackStateCompat.K ? 1 : (position == PlaybackStateCompat.K ? 0 : -1));
            if (sampleSize2 < 0) {
                if (d0.A02.A02 == 1) {
                    position += 8;
                    i3 -= 8;
                }
                cl.ADG((int) position);
                if (d0.A02.A01 != 0) {
                    byte[] bArr = this.A0G.A00;
                    bArr[0] = 0;
                    bArr[1] = 0;
                    bArr[2] = 0;
                    int i4 = d0.A02.A01;
                    int i5 = 4 - d0.A02.A01;
                    while (this.A04 < i3) {
                        int i6 = this.A05;
                        if (i6 == 0) {
                            byte[] nalLengthData = this.A0G.A00;
                            cl.readFully(nalLengthData, i5, i4);
                            this.A0G.A0Z(0);
                            this.A05 = this.A0G.A0I();
                            this.A0H.A0Z(0);
                            cw.ACe(this.A0H, 4);
                            this.A04 += 4;
                            i3 += i5;
                        } else {
                            int writtenBytes = cw.ACd(cl, i6, false);
                            this.A04 += writtenBytes;
                            this.A05 -= writtenBytes;
                        }
                    }
                    i = 0;
                } else {
                    while (true) {
                        int i7 = this.A04;
                        if (i7 >= i3) {
                            break;
                        }
                        int ACd = cw.ACd(cl, i3 - i7, false);
                        int writtenBytes2 = this.A04;
                        this.A04 = writtenBytes2 + ACd;
                        int writtenBytes3 = this.A05;
                        this.A05 = writtenBytes3 - ACd;
                    }
                    i = 0;
                }
                cw.ACf(d0.A03.A07[i2], d0.A03.A04[i2], i3, 0, null);
                d0.A00++;
                this.A06 = -1;
                this.A04 = i;
                this.A05 = i;
                return i;
            }
        }
        cr.A00 = j;
        return 1;
    }

    public static int A02(D9 d9, long j) {
        int A00 = d9.A00(j);
        if (A00 == -1) {
            return d9.A01(j);
        }
        return A00;
    }

    public static long A03(D9 d9, long j, long j2) {
        int A02 = A02(d9, j);
        if (A02 == -1) {
            return j2;
        }
        return Math.min(d9.A06[A02], j2);
    }

    private ArrayList<D9> A05(YX yx, CO co, boolean z) throws AN {
        D6 A0C;
        ArrayList<D9> arrayList = new ArrayList<>();
        int i = 0;
        while (true) {
            int size = yx.A01.size();
            String[] strArr = A0K;
            if (strArr[2].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0K;
            strArr2[7] = "cCqXKTxpaVHnB5xhxhubewm2proDizNi";
            strArr2[0] = "XNMFZPcuybbaYtAFLaJvO7GLnY5oO3YZ";
            if (i < size) {
                YX yx2 = yx.A01.get(i);
                if (((AbstractC0581Cl) yx2).A00 == AbstractC0581Cl.A1L && (A0C = C0586Cq.A0C(yx2, yx.A07(AbstractC0581Cl.A0n), -9223372036854775807L, null, z, this.A0B)) != null) {
                    D9 A0E = C0586Cq.A0E(A0C, yx2.A06(AbstractC0581Cl.A0d).A06(AbstractC0581Cl.A0h).A06(AbstractC0581Cl.A16), co);
                    if (A0E.A01 != 0) {
                        arrayList.add(A0E);
                    }
                }
                i++;
            } else {
                return arrayList;
            }
        }
    }

    private void A06() {
        this.A03 = 0;
        this.A00 = 0;
    }

    private void A09(long j) throws AN {
        while (!this.A0I.isEmpty() && this.A0I.peek().A00 == j) {
            YX pop = this.A0I.pop();
            if (((AbstractC0581Cl) pop).A00 == AbstractC0581Cl.A0j) {
                A0B(pop);
                this.A0I.clear();
                this.A03 = 2;
            } else if (!this.A0I.isEmpty()) {
                this.A0I.peek().A08(pop);
            }
        }
        if (this.A03 != 2) {
            A06();
        }
    }

    private void A0A(long j) {
        D0[] d0Arr;
        for (D0 d0 : this.A0C) {
            D9 d9 = d0.A03;
            int A00 = d9.A00(j);
            if (A00 == -1) {
                A00 = d9.A01(j);
            }
            d0.A00 = A00;
        }
    }

    private void A0B(YX yx) throws AN {
        ArrayList<D9> A05;
        int i = -1;
        long j = -9223372036854775807L;
        ArrayList arrayList = new ArrayList();
        Metadata metadata = null;
        CO co = new CO();
        YY A07 = yx.A07(AbstractC0581Cl.A1P);
        if (A07 != null && (metadata = C0586Cq.A0F(A07, this.A0B)) != null) {
            co.A06(metadata);
        }
        boolean ignoreEditLists = (this.A0E & 1) != 0;
        try {
            A05 = A05(yx, co, ignoreEditLists);
        } catch (C1126Yb unused) {
            co = new CO();
            A05 = A05(yx, co, true);
        }
        int size = A05.size();
        for (int i2 = 0; i2 < size; i2++) {
            D9 d9 = A05.get(i2);
            D6 d6 = d9.A03;
            D0 d0 = new D0(d6, d9, this.A09.ADY(i2, d6.A03));
            int trackCount = d9.A00 + 30;
            Format A0G = d6.A07.A0G(trackCount);
            if (d6.A03 == 1) {
                if (co.A04()) {
                    A0G = A0G.A0H(co.A00, co.A01);
                }
                if (metadata != null) {
                    A0G = A0G.A0K(metadata);
                }
            }
            d0.A01.A5A(A0G);
            j = Math.max(j, d6.A04 != -9223372036854775807L ? d6.A04 : d9.A02);
            int maxInputSize = d6.A03;
            if (maxInputSize == 2 && i == -1) {
                i = arrayList.size();
            }
            arrayList.add(d0);
        }
        this.A02 = i;
        this.A08 = j;
        this.A0C = (D0[]) arrayList.toArray(new D0[arrayList.size()]);
        this.A0D = A0H(this.A0C);
        this.A09.A4w();
        this.A09.ACk(this);
    }

    public static boolean A0C(int i) {
        if (i != AbstractC0581Cl.A0j) {
            int i2 = AbstractC0581Cl.A1L;
            String[] strArr = A0K;
            if (strArr[4].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0K;
            strArr2[2] = "xHWkCkmm9lwx55Xb6ilKRbCBaMi3tx91";
            strArr2[3] = "ufwmFaOIh4ETn2yFiF4b2v05oMaexVS8";
            if (i != i2 && i != AbstractC0581Cl.A0d && i != AbstractC0581Cl.A0h && i != AbstractC0581Cl.A16 && i != AbstractC0581Cl.A0N) {
                return false;
            }
        }
        return true;
    }

    public static boolean A0D(int i) {
        if (i != AbstractC0581Cl.A0c && i != AbstractC0581Cl.A0n && i != AbstractC0581Cl.A0V && i != AbstractC0581Cl.A1A && i != AbstractC0581Cl.A1D && i != AbstractC0581Cl.A1B) {
            int i2 = AbstractC0581Cl.A0C;
            if (A0K[1].length() != 22) {
                throw new RuntimeException();
            }
            String[] strArr = A0K;
            strArr[1] = "WjfYMB7jPbcUwDvfNOpuH1";
            strArr[1] = "WjfYMB7jPbcUwDvfNOpuH1";
            if (i != i2 && i != AbstractC0581Cl.A0O && i != AbstractC0581Cl.A19 && i != AbstractC0581Cl.A1C && i != AbstractC0581Cl.A1E && i != AbstractC0581Cl.A17 && i != AbstractC0581Cl.A0B && i != AbstractC0581Cl.A1J && i != AbstractC0581Cl.A0U && i != AbstractC0581Cl.A1P) {
                return false;
            }
        }
        return true;
    }

    private boolean A0E(CL cl) throws IOException, InterruptedException {
        if (this.A00 == 0) {
            if (!cl.AC2(this.A0F.A00, 0, 8, true)) {
                return false;
            }
            this.A00 = 8;
            this.A0F.A0Z(0);
            this.A07 = this.A0F.A0N();
            this.A01 = this.A0F.A09();
        }
        long j = this.A07;
        if (j == 1) {
            cl.readFully(this.A0F.A00, 8, 8);
            this.A00 += 8;
            this.A07 = this.A0F.A0O();
        } else if (j == 0) {
            long A6T = cl.A6T();
            if (A6T == -1 && !this.A0I.isEmpty()) {
                A6T = this.A0I.peek().A00;
            }
            if (A6T != -1) {
                this.A07 = (A6T - cl.A6m()) + this.A00;
            }
        }
        if (this.A07 >= this.A00) {
            if (A0C(this.A01)) {
                long A6m = (cl.A6m() + this.A07) - this.A00;
                this.A0I.push(new YX(this.A01, A6m));
                if (this.A07 == this.A00) {
                    A09(A6m);
                } else {
                    A06();
                }
            } else if (A0D(this.A01)) {
                I1.A04(this.A00 == 8);
                I1.A04(this.A07 <= TTL.MAX_VALUE);
                this.A0A = new IQ((int) this.A07);
                System.arraycopy(this.A0F.A00, 0, this.A0A.A00, 0, 8);
                this.A03 = 1;
            } else {
                this.A0A = null;
                this.A03 = 1;
            }
            return true;
        }
        throw new AN(A04(0, 48, 100));
    }

    private boolean A0F(CL cl, CR cr) throws IOException, InterruptedException {
        long j = this.A07 - this.A00;
        long A6m = cl.A6m() + j;
        boolean z = false;
        IQ iq = this.A0A;
        if (iq != null) {
            cl.readFully(iq.A00, this.A00, (int) j);
            if (this.A01 == AbstractC0581Cl.A0U) {
                this.A0B = A0G(this.A0A);
            } else if (!this.A0I.isEmpty()) {
                this.A0I.peek().A09(new YY(this.A01, this.A0A));
            }
        } else if (j < PlaybackStateCompat.K) {
            cl.ADG((int) j);
        } else {
            cr.A00 = cl.A6m() + j;
            z = true;
        }
        A09(A6m);
        return z && this.A03 != 2;
    }

    public static boolean A0G(IQ iq) {
        iq.A0Z(8);
        if (iq.A09() == A0M) {
            return true;
        }
        iq.A0a(4);
        while (iq.A05() > 0) {
            if (iq.A09() == A0M) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Incorrect condition in loop: B:11:0x0036 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long[][] A0H(D0[] d0Arr) {
        long[][] jArr = new long[d0Arr.length];
        int[] iArr = new int[d0Arr.length];
        long[] jArr2 = new long[d0Arr.length];
        boolean[] zArr = new boolean[d0Arr.length];
        for (int i = 0; i < d0Arr.length; i++) {
            jArr[i] = new long[d0Arr[i].A03.A01];
            jArr2[i] = d0Arr[i].A03.A07[0];
        }
        long j = 0;
        int minTimeTrackIndex = 0;
        while (minTimeTrackIndex < d0Arr.length) {
            long j2 = Long.MAX_VALUE;
            int i2 = -1;
            for (int i3 = 0; i3 < i; i3++) {
                if (!zArr[i3]) {
                    int i4 = (jArr2[i3] > j2 ? 1 : (jArr2[i3] == j2 ? 0 : -1));
                    if (i4 <= 0) {
                        i2 = i3;
                        j2 = jArr2[i3];
                    }
                }
            }
            int i5 = iArr[i2];
            jArr[i2][i5] = j;
            int trackSampleIndex = d0Arr[i2].A03.A05[i5];
            j += trackSampleIndex;
            int i6 = i5 + 1;
            iArr[i2] = i6;
            int trackSampleIndex2 = jArr[i2].length;
            if (i6 < trackSampleIndex2) {
                jArr2[i2] = d0Arr[i2].A03.A07[i6];
            } else {
                zArr[i2] = true;
                minTimeTrackIndex++;
            }
        }
        return jArr;
    }

    @Override // com.facebook.ads.redexgen.X.CT
    public final long A65() {
        return this.A08;
    }

    @Override // com.facebook.ads.redexgen.X.CT
    public final CS A6s(long secondTimeUs) {
        long j;
        long j2;
        int A01;
        D0[] d0Arr = this.A0C;
        if (d0Arr.length == 0) {
            return new CS(CU.A04);
        }
        long j3 = -9223372036854775807L;
        long j4 = -1;
        int i = this.A02;
        if (i != -1) {
            D9 d9 = d0Arr[i].A03;
            int A02 = A02(d9, secondTimeUs);
            if (A02 == -1) {
                return new CS(CU.A04);
            }
            j = d9.A07[A02];
            j2 = d9.A06[A02];
            if (j < secondTimeUs) {
                int i2 = d9.A01 - 1;
                if (A0K[5].charAt(28) == 'l') {
                    String[] strArr = A0K;
                    strArr[4] = "wZC6PUUkwbL39FGS7qgHi4";
                    strArr[6] = "ISWp";
                    if (A02 < i2 && (A01 = d9.A01(secondTimeUs)) != -1 && A01 != A02) {
                        j3 = d9.A07[A01];
                        j4 = d9.A06[A01];
                    }
                }
                throw new RuntimeException();
            }
        } else {
            j = secondTimeUs;
            j2 = Long.MAX_VALUE;
        }
        int i3 = 0;
        while (true) {
            D0[] d0Arr2 = this.A0C;
            if (A0K[5].charAt(28) != 'l') {
                break;
            }
            String[] strArr2 = A0K;
            strArr2[2] = "HuKpkwhwNffVsg1qOYm34WvQGcpzf7CA";
            strArr2[3] = "OpSxQ7AB5KpfVVm82hohcPrOWAs1xSas";
            if (i3 < d0Arr2.length) {
                if (i3 != this.A02) {
                    D9 d92 = d0Arr2[i3].A03;
                    j2 = A03(d92, j, j2);
                    if (j3 != -9223372036854775807L) {
                        j4 = A03(d92, j3, j4);
                    }
                }
                i3++;
            } else {
                CU cu = new CU(j, j2);
                if (j3 == -9223372036854775807L) {
                    return new CS(cu);
                }
                return new CS(cu, new CU(j3, j4));
            }
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.X.CK
    public final void A7Q(CM cm) {
        this.A09 = cm;
    }

    @Override // com.facebook.ads.redexgen.X.CT
    public final boolean A7m() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.CK
    public final int ABx(CL cl, CR cr) throws IOException, InterruptedException {
        while (true) {
            int i = this.A03;
            String[] strArr = A0K;
            if (strArr[2].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0K;
            strArr2[7] = "qJxbwGisfZf9YKIw0pjhTsx78598m8MK";
            strArr2[0] = "kX2rligkfJBBB9teOSCW5LaSmFhGBJWo";
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        return A01(cl, cr);
                    }
                    throw new IllegalStateException();
                } else if (A0F(cl, cr)) {
                    return 1;
                }
            } else if (!A0E(cl)) {
                return -1;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.CK
    public final void ACj(long j, long j2) {
        this.A0I.clear();
        this.A00 = 0;
        this.A06 = -1;
        this.A04 = 0;
        this.A05 = 0;
        if (j == 0) {
            A06();
        } else if (this.A0C == null) {
        } else {
            A0A(j2);
        }
    }

    @Override // com.facebook.ads.redexgen.X.CK
    public final boolean ADH(CL cl) throws IOException, InterruptedException {
        return D4.A05(cl);
    }
}