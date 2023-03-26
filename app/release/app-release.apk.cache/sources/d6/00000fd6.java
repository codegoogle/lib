package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.os.Handler;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.source.TrackGroup;
import com.facebook.ads.internal.exoplayer2.source.TrackGroupArray;
import com.p7700g.p99005.gc0;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Az */
/* loaded from: assets/audience_network.dex */
public final class C0552Az implements InterfaceC1167Zu, CM, HX<C1164Zp>, InterfaceC0694Ha, InterfaceC0646Fc {
    public static byte[] A0c;
    public static String[] A0d;
    public int A00;
    public int A01;
    public int A02;
    public long A04;
    public CT A07;
    @Nullable
    public InterfaceC1166Zt A08;
    public TrackGroupArray A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean[] A0L;
    public boolean[] A0M;
    public boolean[] A0N;
    public final int A0O;
    public final long A0P;
    public final Uri A0Q;
    public final FC A0S;
    public final FD A0T;
    public final FT A0U;
    public final HE A0V;
    public final HM A0W;
    @Nullable
    public final String A0b;
    public final C1220al A0X = new C1220al(A07(0, 27, 82));
    public final I7 A0Y = new I7();
    public final Runnable A0Z = new FA(this);
    public final Runnable A0a = new FB(this);
    public final Handler A0R = new Handler();
    public int[] A0J = new int[0];
    public C1168Zv[] A0K = new C1168Zv[0];
    public long A06 = -9223372036854775807L;
    public long A05 = -1;
    public long A03 = -9223372036854775807L;

    static {
        A0C();
        A0B();
    }

    public static String A07(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0c, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A0d[7].length() != 22) {
                throw new RuntimeException();
            }
            String[] strArr = A0d;
            strArr[2] = "Up";
            strArr[2] = "Up";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 120);
            i4++;
        }
    }

    public static void A0B() {
        A0c = new byte[]{102, 69, 75, 78, 79, 88, 16, 111, 82, 94, 88, 75, 73, 94, 69, 88, 103, 79, 78, 67, 75, 122, 79, 88, 67, 69, 78};
    }

    public static void A0C() {
        A0d = new String[]{"iI0ZOGUFhjVKOFZqbUjTJbzZriBk", "wCM5SpVnQk8vEGvx3xuFkFQnwN8gnHkn", "CC", "sZUrtXRAji2vfBWVwphN9cenOJ8FQWpp", "F506DqgxlNyYyNAR0eHuGAxqIBb0RwxX", "mj8nEZtHpBznvwUNQKJPsV2u1H4", "sYtV3FATfn8NsU7nH3", "hZDPske6mXbyt4vhVom9Ng"};
    }

    public C0552Az(Uri uri, HM hm, CK[] ckArr, int i, FT ft, FD fd, HE he, @Nullable String str, int i2) {
        this.A0Q = uri;
        this.A0W = hm;
        this.A0O = i;
        this.A0U = ft;
        this.A0T = fd;
        this.A0V = he;
        this.A0b = str;
        this.A0P = i2;
        this.A0S = new FC(ckArr, this);
        this.A00 = i == -1 ? 3 : i;
        ft.A04();
    }

    private int A00() {
        C1168Zv[] c1168ZvArr;
        int i = 0;
        for (C1168Zv c1168Zv : this.A0K) {
            String[] strArr = A0d;
            if (strArr[5].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0d;
            strArr2[3] = "qSOUgbz3JlJaX9UdXA1gn9agrJ83m9Y6";
            strArr2[1] = "wkCF1xtIBevCyUX610AjJpYT598Om9ct";
            i += c1168Zv.A0D();
        }
        return i;
    }

    @Override // com.facebook.ads.redexgen.X.HX
    /* renamed from: A01 */
    public final int AA0(C1164Zp c1164Zp, long j, long j2, IOException iOException) {
        HQ hq;
        long j3;
        long j4;
        boolean isErrorFatal = A0O(iOException);
        FT ft = this.A0U;
        hq = c1164Zp.A03;
        j3 = c1164Zp.A02;
        long j5 = this.A03;
        j4 = c1164Zp.A00;
        ft.A0I(hq, 1, -1, null, 0, null, j3, j5, j, j2, j4, iOException, isErrorFatal);
        A0F(c1164Zp);
        if (isErrorFatal) {
            return 3;
        }
        int A00 = A00();
        boolean z = A00 > this.A02;
        if (A0M(c1164Zp, A00)) {
            return z ? 1 : 0;
        }
        return 2;
    }

    private long A02() {
        C1168Zv[] c1168ZvArr;
        long j = Long.MIN_VALUE;
        for (C1168Zv c1168Zv : this.A0K) {
            if (A0d[6].length() != 18) {
                throw new RuntimeException();
            }
            String[] strArr = A0d;
            strArr[6] = "ZyGj31aUIwj7oXhThZ";
            strArr[6] = "ZyGj31aUIwj7oXhThZ";
            j = Math.max(j, c1168Zv.A0G());
        }
        return j;
    }

    public void A09() {
        C1168Zv[] c1168ZvArr;
        if (this.A0G || this.A0F || this.A07 == null || !this.A0H) {
            return;
        }
        for (C1168Zv sampleQueue : this.A0K) {
            if (sampleQueue.A0H() == null) {
                return;
            }
        }
        this.A0Y.A02();
        int length = this.A0K.length;
        TrackGroup[] trackGroupArr = new TrackGroup[length];
        this.A0N = new boolean[length];
        this.A0L = new boolean[length];
        this.A0M = new boolean[length];
        this.A03 = this.A07.A65();
        int i = 0;
        while (true) {
            boolean z = true;
            if (i < length) {
                Format A0H = this.A0K[i].A0H();
                trackGroupArr[i] = new TrackGroup(A0H);
                String str = A0H.A0O;
                if (!IJ.A0C(str)) {
                    boolean A0A = IJ.A0A(str);
                    if (A0d[7].length() != 22) {
                        throw new RuntimeException();
                    }
                    String[] strArr = A0d;
                    strArr[4] = "sORkCePcQUNrHwPTmIu9z8sBJIN6eDJt";
                    strArr[4] = "sORkCePcQUNrHwPTmIu9z8sBJIN6eDJt";
                    if (!A0A) {
                        z = false;
                    }
                }
                this.A0N[i] = z;
                boolean isAudioVideo = this.A0A;
                this.A0A = isAudioVideo | z;
                i++;
            } else {
                this.A09 = new TrackGroupArray(trackGroupArr);
                if (this.A0O == -1 && this.A05 == -1 && this.A07.A65() == -9223372036854775807L) {
                    this.A00 = 6;
                }
                this.A0F = true;
                this.A0T.AAw(this.A03, this.A07.A7m());
                this.A08.AAb(this);
                return;
            }
        }
    }

    private void A0A() {
        HQ hq;
        long j;
        C1164Zp c1164Zp = new C1164Zp(this, this.A0Q, this.A0W, this.A0S, this.A0Y);
        if (this.A0F) {
            I1.A04(A0J());
            long j2 = this.A03;
            if (j2 != -9223372036854775807L && this.A06 >= j2) {
                this.A0B = true;
                this.A06 = -9223372036854775807L;
                return;
            }
            c1164Zp.A05(this.A07.A6s(this.A06).A00.A00, this.A06);
            this.A06 = -9223372036854775807L;
        }
        this.A02 = A00();
        long A05 = this.A0X.A05(c1164Zp, this, this.A00);
        FT ft = this.A0U;
        hq = c1164Zp.A03;
        j = c1164Zp.A02;
        ft.A0F(hq, 1, -1, null, 0, null, j, this.A03, A05);
    }

    private void A0D(int i) {
        if (!this.A0M[i]) {
            Format A02 = this.A09.A02(i).A02(0);
            this.A0U.A07(IJ.A01(A02.A0O), A02, 0, null, this.A04);
            this.A0M[i] = true;
        }
    }

    private void A0E(int i) {
        C1168Zv[] c1168ZvArr;
        if (!this.A0E || !this.A0N[i] || this.A0K[i].A0N()) {
            return;
        }
        this.A06 = 0L;
        this.A0E = false;
        this.A0D = true;
        this.A04 = 0L;
        this.A02 = 0;
        for (C1168Zv sampleQueue : this.A0K) {
            sampleQueue.A0J();
        }
        this.A08.A9F(this);
    }

    private void A0F(C1164Zp c1164Zp) {
        long j;
        if (this.A05 != -1) {
            return;
        }
        j = c1164Zp.A01;
        this.A05 = j;
    }

    @Override // com.facebook.ads.redexgen.X.HX
    /* renamed from: A0G */
    public final void A9z(C1164Zp c1164Zp, long j, long j2) {
        HQ hq;
        long j3;
        long j4;
        if (this.A03 == -9223372036854775807L) {
            long A02 = A02();
            long largestQueuedTimestampUs = A02 == Long.MIN_VALUE ? 0L : gc0.c + A02;
            this.A03 = largestQueuedTimestampUs;
            this.A0T.AAw(this.A03, this.A07.A7m());
        }
        FT ft = this.A0U;
        hq = c1164Zp.A03;
        j3 = c1164Zp.A02;
        long j5 = this.A03;
        j4 = c1164Zp.A00;
        ft.A0H(hq, 1, -1, null, 0, null, j3, j5, j, j2, j4);
        A0F(c1164Zp);
        this.A0B = true;
        this.A08.A9F(this);
    }

    @Override // com.facebook.ads.redexgen.X.HX
    /* renamed from: A0H */
    public final void A9x(C1164Zp c1164Zp, long j, long j2, boolean z) {
        HQ hq;
        long j3;
        long j4;
        FT ft = this.A0U;
        hq = c1164Zp.A03;
        j3 = c1164Zp.A02;
        long j5 = this.A03;
        j4 = c1164Zp.A00;
        ft.A0G(hq, 1, -1, null, 0, null, j3, j5, j, j2, j4);
        if (!z) {
            A0F(c1164Zp);
            for (C1168Zv c1168Zv : this.A0K) {
                c1168Zv.A0J();
            }
            if (this.A01 > 0) {
                this.A08.A9F(this);
            }
        }
    }

    private boolean A0J() {
        return this.A06 != -9223372036854775807L;
    }

    private boolean A0K() {
        if (!this.A0D) {
            boolean A0J = A0J();
            if (A0d[4].charAt(6) == 'Y') {
                throw new RuntimeException();
            }
            String[] strArr = A0d;
            strArr[7] = "wEe5Kid34hKwvsAXbAWEFW";
            strArr[7] = "wEe5Kid34hKwvsAXbAWEFW";
            if (!A0J) {
                return false;
            }
        }
        return true;
    }

    private boolean A0L(long j) {
        int length = this.A0K.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                return true;
            }
            C1168Zv sampleQueue = this.A0K[i];
            sampleQueue.A0K();
            if ((sampleQueue.A0E(j, true, false) != -1) || (!this.A0N[i] && this.A0A)) {
                i++;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0036, code lost:
        if (r7 != (-9223372036854775807L)) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean A0M(C1164Zp c1164Zp, int i) {
        if (this.A05 == -1) {
            CT ct = this.A07;
            if (ct != null) {
                long A65 = ct.A65();
                String[] strArr = A0d;
                if (strArr[5].length() == strArr[0].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0d;
                strArr2[4] = "Q0rpoNhjqPePbxzXOOIqRvZr1JNrttpQ";
                strArr2[4] = "Q0rpoNhjqPePbxzXOOIqRvZr1JNrttpQ";
            }
            if (this.A0F && !A0K()) {
                this.A0E = true;
                if (A0d[4].charAt(6) != 'Y') {
                    String[] strArr3 = A0d;
                    strArr3[2] = "yM";
                    strArr3[2] = "yM";
                    return false;
                }
                throw new RuntimeException();
            }
            this.A0D = this.A0F;
            this.A04 = 0L;
            this.A02 = 0;
            for (C1168Zv c1168Zv : this.A0K) {
                c1168Zv.A0J();
            }
            c1164Zp.A05(0L, 0L);
            return true;
        }
        this.A02 = i;
        return true;
    }

    public static boolean A0O(IOException iOException) {
        return iOException instanceof C1174a1;
    }

    public final int A0P(int skipCount, long j) {
        int A0E;
        if (A0K()) {
            return 0;
        }
        C1168Zv c1168Zv = this.A0K[skipCount];
        if (this.A0B && j > c1168Zv.A0G()) {
            A0E = c1168Zv.A0B();
        } else {
            A0E = c1168Zv.A0E(j, true, true);
            if (A0E == -1) {
                A0E = 0;
            }
        }
        if (A0E > 0) {
            A0D(skipCount);
        } else {
            A0E(skipCount);
        }
        return A0E;
    }

    public final int A0Q(int i, AH ah, C1121Xw c1121Xw, boolean z) {
        if (A0K()) {
            return -3;
        }
        C1168Zv c1168Zv = this.A0K[i];
        boolean z2 = this.A0B;
        long j = this.A04;
        if (A0d[6].length() != 18) {
            throw new RuntimeException();
        }
        String[] strArr = A0d;
        strArr[4] = "BZZhA5HnQ267vlJC28K7sY9wv6QGzHwf";
        strArr[4] = "BZZhA5HnQ267vlJC28K7sY9wv6QGzHwf";
        int A0F = c1168Zv.A0F(ah, c1121Xw, z, z2, j);
        if (A0F == -4) {
            A0D(i);
        } else if (A0F == -3) {
            A0E(i);
        }
        return A0F;
    }

    public final void A0R() throws IOException {
        this.A0X.A07(this.A00);
    }

    public final void A0S() {
        if (this.A0F) {
            for (C1168Zv c1168Zv : this.A0K) {
                c1168Zv.A0I();
            }
        }
        this.A0X.A08(this);
        this.A0R.removeCallbacksAndMessages(null);
        this.A08 = null;
        this.A0G = true;
        this.A0U.A05();
    }

    public final boolean A0T(int i) {
        return !A0K() && (this.A0B || this.A0K[i].A0N());
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1167Zu
    public final boolean A4A(long j) {
        if (this.A0B || this.A0E) {
            return false;
        }
        if (this.A0F) {
            int i = this.A01;
            if (A0d[4].charAt(6) == 'Y') {
                throw new RuntimeException();
            }
            String[] strArr = A0d;
            strArr[4] = "7rVHsGRdVZCry1KpVG9eopTEFKGRMHdR";
            strArr[4] = "7rVHsGRdVZCry1KpVG9eopTEFKGRMHdR";
            if (i == 0) {
                return false;
            }
        }
        boolean A03 = this.A0Y.A03();
        if (!this.A0X.A09()) {
            A0A();
            String[] strArr2 = A0d;
            if (strArr2[5].length() != strArr2[0].length()) {
                String[] strArr3 = A0d;
                strArr3[4] = "GZZ8Yg3MT0LKLUTCQO9quz1OXrB3914Q";
                strArr3[4] = "GZZ8Yg3MT0LKLUTCQO9quz1OXrB3914Q";
                return true;
            }
            String[] strArr4 = A0d;
            strArr4[4] = "KAHjzw5ailzTQNPlHwAo2zZrrjfyTj4F";
            strArr4[4] = "KAHjzw5ailzTQNPlHwAo2zZrrjfyTj4F";
            return false;
        }
        return A03;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1167Zu
    public final void A4m(long j, boolean z) {
        int length = this.A0K.length;
        for (int i = 0; i < length; i++) {
            this.A0K[i].A0L(j, z, this.A0L[i]);
        }
    }

    @Override // com.facebook.ads.redexgen.X.CM
    public final void A4w() {
        this.A0H = true;
        this.A0R.post(this.A0Z);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1167Zu
    public final long A5J(long j, C0533Af c0533Af) {
        if (!this.A07.A7m()) {
            return 0L;
        }
        CS A6s = this.A07.A6s(j);
        return C0726Ig.A0I(j, c0533Af, A6s.A00.A01, A6s.A01.A01);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1167Zu
    public final long A5Y() {
        long A02;
        if (this.A0B) {
            return Long.MIN_VALUE;
        }
        if (A0J()) {
            long j = this.A06;
            if (A0d[6].length() == 18) {
                String[] strArr = A0d;
                strArr[4] = "v1DtQTmxA3FTsqocwnKPSJWZapJDPMlv";
                strArr[4] = "v1DtQTmxA3FTsqocwnKPSJWZapJDPMlv";
                return j;
            }
        } else {
            if (this.A0A) {
                A02 = Long.MAX_VALUE;
                if (A0d[6].length() == 18) {
                    String[] strArr2 = A0d;
                    strArr2[7] = "vaKypmx8P8ApWe5d9yUSyn";
                    strArr2[7] = "vaKypmx8P8ApWe5d9yUSyn";
                    int length = this.A0K.length;
                    for (int i = 0; i < length; i++) {
                        if (this.A0N[i]) {
                            C1168Zv c1168Zv = this.A0K[i];
                            String[] strArr3 = A0d;
                            if (strArr3[5].length() == strArr3[0].length()) {
                                throw new RuntimeException();
                            }
                            String[] strArr4 = A0d;
                            strArr4[7] = "ClOx81htkGLxdwhy5PY2qE";
                            strArr4[7] = "ClOx81htkGLxdwhy5PY2qE";
                            A02 = Math.min(A02, c1168Zv.A0G());
                        }
                    }
                }
            } else {
                A02 = A02();
            }
            return A02 == Long.MIN_VALUE ? this.A04 : A02;
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1167Zu
    public final long A6Z() {
        if (this.A01 == 0) {
            return Long.MIN_VALUE;
        }
        return A5Y();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1167Zu
    public final TrackGroupArray A79() {
        return this.A09;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1167Zu
    public final void A8V() throws IOException {
        A0R();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0694Ha
    public final void AA4() {
        for (C1168Zv c1168Zv : this.A0K) {
            c1168Zv.A0J();
        }
        this.A0S.A04();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0646Fc
    public final void ABD(Format format) {
        this.A0R.post(this.A0Z);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1167Zu
    public final void ABi(InterfaceC1166Zt interfaceC1166Zt, long j) {
        this.A08 = interfaceC1166Zt;
        this.A0Y.A03();
        A0A();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1167Zu
    public final long AC1() {
        if (!this.A0C) {
            this.A0U.A06();
            this.A0C = true;
        }
        if (this.A0D) {
            if (this.A0B || A00() > this.A02) {
                this.A0D = false;
                return this.A04;
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1167Zu
    public final void AC9(long j) {
    }

    @Override // com.facebook.ads.redexgen.X.CM
    public final void ACk(CT ct) {
        this.A07 = ct;
        this.A0R.post(this.A0Z);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1167Zu
    public final long ACn(long j) {
        C1168Zv[] c1168ZvArr;
        if (!this.A07.A7m()) {
            j = 0;
        }
        this.A04 = j;
        this.A0D = false;
        if (!A0J() && A0L(j)) {
            return j;
        }
        this.A0E = false;
        this.A06 = j;
        this.A0B = false;
        if (this.A0X.A09()) {
            this.A0X.A06();
        } else {
            for (C1168Zv sampleQueue : this.A0K) {
                sampleQueue.A0J();
            }
        }
        return j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:157:0x010e, code lost:
        if (r8.A09() != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0110, code lost:
        r4 = r12.A0K;
        r3 = r4.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0113, code lost:
        if (r7 >= r3) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0115, code lost:
        r4[r7].A0I();
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x012d, code lost:
        if (r8.A09() != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0130, code lost:
        r4 = r12.A0K;
        r3 = r4.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0133, code lost:
        if (r7 >= r3) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0135, code lost:
        r4[r7].A0J();
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x016e, code lost:
        r12.A0X.A06();
     */
    @Override // com.facebook.ads.redexgen.X.InterfaceC1167Zu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long ACo(H8[] h8Arr, boolean[] zArr, InterfaceC0647Fd[] interfaceC0647FdArr, boolean[] zArr2, long j) {
        int i;
        long j2 = j;
        I1.A04(this.A0F);
        int i2 = this.A01;
        int i3 = 0;
        while (true) {
            int length = h8Arr.length;
            int i4 = 0;
            if (A0d[4].charAt(6) == 'Y') {
                throw new RuntimeException();
            }
            String[] strArr = A0d;
            strArr[3] = "SYrZ4V4BuS5f1iQivHtPvbJPBq8KYGcV";
            strArr[1] = "Qj6kIai7maHlsMhbAYZIdrm5vw8KbeiE";
            if (i3 < length) {
                if (interfaceC0647FdArr[i3] != null && (h8Arr[i3] == null || !zArr[i3])) {
                    i = ((Zq) interfaceC0647FdArr[i3]).A00;
                    I1.A04(this.A0L[i]);
                    this.A01--;
                    this.A0L[i] = false;
                    interfaceC0647FdArr[i3] = null;
                }
                i3++;
            } else {
                boolean z = !this.A0I ? j2 == 0 : i2 != 0;
                for (int i5 = 0; i5 < h8Arr.length; i5++) {
                    if (interfaceC0647FdArr[i5] == null && h8Arr[i5] != null) {
                        H8 h8 = h8Arr[i5];
                        I1.A04(h8.length() == 1);
                        I1.A04(h8.A6O(0) == 0);
                        int A01 = this.A09.A01(h8.A78());
                        I1.A04(!this.A0L[A01]);
                        this.A01++;
                        this.A0L[A01] = true;
                        interfaceC0647FdArr[i5] = new Zq(this, A01);
                        zArr2[i5] = true;
                        if (z) {
                            continue;
                        } else {
                            C1168Zv c1168Zv = this.A0K[A01];
                            c1168Zv.A0K();
                            int A0E = c1168Zv.A0E(j2, true, true);
                            if (A0d[7].length() != 22) {
                                throw new RuntimeException();
                            }
                            String[] strArr2 = A0d;
                            strArr2[6] = "lOsySJaFgyeJ3Ig8A3";
                            strArr2[6] = "lOsySJaFgyeJ3Ig8A3";
                            z = A0E == -1 && c1168Zv.A0C() != 0;
                        }
                    }
                }
                if (this.A01 == 0) {
                    this.A0E = false;
                    this.A0D = false;
                    C1220al c1220al = this.A0X;
                    String[] strArr3 = A0d;
                    if (strArr3[3].charAt(26) == strArr3[1].charAt(26)) {
                        String[] strArr4 = A0d;
                        strArr4[2] = "gg";
                        strArr4[2] = "gg";
                    }
                } else if (z) {
                    j2 = ACn(j2);
                    int i6 = 0;
                    while (true) {
                        int length2 = interfaceC0647FdArr.length;
                        if (A0d[2].length() != 2) {
                            throw new RuntimeException();
                        }
                        String[] strArr5 = A0d;
                        strArr5[6] = "D8RgEMde5uPIB6l0iM";
                        strArr5[6] = "D8RgEMde5uPIB6l0iM";
                        if (i6 >= length2) {
                            break;
                        }
                        if (interfaceC0647FdArr[i6] != null) {
                            zArr2[i6] = true;
                        }
                        i6++;
                    }
                }
                this.A0I = true;
                return j2;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.CM
    public final CW ADY(int i, int i2) {
        int length = this.A0K.length;
        for (int i3 = 0; i3 < length; i3++) {
            if (this.A0J[i3] == i) {
                return this.A0K[i3];
            }
        }
        C1168Zv c1168Zv = new C1168Zv(this.A0V);
        c1168Zv.A0M(this);
        this.A0J = Arrays.copyOf(this.A0J, length + 1);
        this.A0J[length] = i;
        this.A0K = (C1168Zv[]) Arrays.copyOf(this.A0K, length + 1);
        this.A0K[length] = c1168Zv;
        return c1168Zv;
    }
}