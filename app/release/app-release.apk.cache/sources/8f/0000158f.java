package com.facebook.ads.redexgen.X;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.p7700g.p99005.bx;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class ZD implements CK {
    public static byte[] A0C;
    public static String[] A0D;
    public static final CN A0E;
    public static final long A0F;
    public static final long A0G;
    public static final long A0H;
    public int A00;
    public int A01;
    public CM A02;
    public InterfaceC0601Df A03;
    public boolean A04;
    public final int A05;
    public final SparseArray<InterfaceC0601Df> A06;
    public final SparseBooleanArray A07;
    public final SparseIntArray A08;
    public final InterfaceC0599Dd A09;
    public final IQ A0A;
    public final List<C0722Ic> A0B;

    public static String A0D(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0C, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 75);
        }
        return new String(copyOfRange);
    }

    public static void A0G() {
        A0C = new byte[]{-90, -88, -110, -104, -12, 18, 31, 31, 32, 37, -47, 23, 26, 31, 21, -47, 36, bx.W5, 31, 20, -47, 19, bx.W5, 37, 22, -33, -47, -2, 32, 36, 37, -47, 29, 26, 28, 22, 29, bx.W5, -47, 31, 32, 37, -47, 18, -47, 5, 35, 18, 31, 36, 33, 32, 35, 37, -47, 4, 37, 35, 22, 18, 30, -33, -98, -102, -100, -116, -61, -64, -47, -66};
    }

    public static void A0H() {
        A0D = new String[]{"1wQJeguTcmzEzlcqQISF6uciTtBYCHEI", "1z5HoD8RnfRsH4NGqOJrgtDb3AvWKmRf", "OZb5z3fyn7DmUcX5PD2FSiUNDYO3SJGv", "xysXnf11fptxvGLEVlqKxNXP96VBbPb9", "B9gj7Y4phCIGiISa5KNqUW4wq7x20Uai", "0XWjmjuElj7dnGBGcTqheWJCaJtkSIxV", "xem2h", "3rpnxRNe64JCaC2IexlmS1y9p5GeiPOv"};
    }

    static {
        A0H();
        A0G();
        A0E = new ZA();
        A0F = C0726Ig.A08(A0D(0, 4, 26));
        A0G = C0726Ig.A08(A0D(62, 4, 14));
        A0H = C0726Ig.A08(A0D(66, 4, 48));
    }

    public ZD() {
        this(0);
    }

    public ZD(int i) {
        this(1, i);
    }

    public ZD(int i, int i2) {
        this(i, new C0722Ic(0L), new C1147Yw(i2));
    }

    public ZD(int i, C0722Ic c0722Ic, InterfaceC0599Dd interfaceC0599Dd) {
        this.A09 = (InterfaceC0599Dd) I1.A01(interfaceC0599Dd);
        this.A05 = i;
        if (i == 1 || i == 2) {
            this.A0B = Collections.singletonList(c0722Ic);
        } else {
            this.A0B = new ArrayList();
            this.A0B.add(c0722Ic);
        }
        this.A0A = new IQ(new byte[9400], 0);
        this.A07 = new SparseBooleanArray();
        this.A06 = new SparseArray<>();
        this.A08 = new SparseIntArray();
        A0F();
    }

    public static /* synthetic */ int A01(ZD zd) {
        int i = zd.A01;
        zd.A01 = i + 1;
        return i;
    }

    private void A0F() {
        this.A07.clear();
        this.A06.clear();
        SparseArray<InterfaceC0601Df> A4J = this.A09.A4J();
        int size = A4J.size();
        for (int i = 0; i < size; i++) {
            this.A06.put(A4J.keyAt(i), A4J.valueAt(i));
        }
        this.A06.put(0, new Z8(new ZB(this)));
        this.A03 = null;
    }

    @Override // com.facebook.ads.redexgen.X.CK
    public final void A7Q(CM cm) {
        this.A02 = cm;
        cm.ACk(new YH(-9223372036854775807L));
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0117, code lost:
        if (r8 == r9) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0119, code lost:
        r13.A0A.A0Z(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x011f, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0125, code lost:
        if (r8 == r9) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0128, code lost:
        r0 = r8 + 1;
        r8 = r0 & 15;
        r1 = com.facebook.ads.redexgen.X.ZD.A0D[1].charAt(3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0138, code lost:
        if (r1 == 72) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x013f, code lost:
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0140, code lost:
        r2 = com.facebook.ads.redexgen.X.ZD.A0D;
        r2[3] = "dSZ0cSzoMmmORQANAKDw4NsHeD3mI6Jb";
        r2[3] = "dSZ0cSzoMmmORQANAKDw4NsHeD3mI6Jb";
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x014c, code lost:
        if (r9 == r8) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x014e, code lost:
        r3.ACi();
     */
    @Override // com.facebook.ads.redexgen.X.CK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int ABx(CL cl, CR cr) throws IOException, InterruptedException {
        InterfaceC0601Df interfaceC0601Df;
        byte[] bArr = this.A0A.A00;
        if (9400 - this.A0A.A07() < 188) {
            int A05 = this.A0A.A05();
            if (A05 > 0) {
                System.arraycopy(bArr, this.A0A.A07(), bArr, 0, A05);
            }
            this.A0A.A0c(bArr, A05);
        }
        while (this.A0A.A05() < 188) {
            int A08 = this.A0A.A08();
            int read = cl.read(bArr, A08, 9400 - A08);
            if (read == -1) {
                return -1;
            }
            this.A0A.A0Y(A08 + read);
        }
        int A082 = this.A0A.A08();
        int A07 = this.A0A.A07();
        while (A07 < A082 && bArr[A07] != 71) {
            A07++;
        }
        this.A0A.A0Z(A07);
        int searchStart = A07 + 188;
        if (searchStart > A082) {
            int endOfPacket = this.A00;
            this.A00 = endOfPacket + (A07 - A07);
            int endOfPacket2 = this.A05;
            if (endOfPacket2 != 2 || this.A00 <= 376) {
                return 0;
            }
            throw new AN(A0D(4, 58, 102));
        }
        this.A00 = 0;
        int A09 = this.A0A.A09();
        int endOfPacket3 = 8388608 & A09;
        if (endOfPacket3 != 0) {
            this.A0A.A0Z(searchStart);
            return 0;
        }
        int endOfPacket4 = 4194304 & A09;
        boolean z = endOfPacket4 != 0;
        int endOfPacket5 = 2096896 & A09;
        int i = endOfPacket5 >> 8;
        int endOfPacket6 = A09 & 32;
        boolean z2 = endOfPacket6 != 0;
        int endOfPacket7 = A09 & 16;
        int pid = endOfPacket7 == 0 ? 0 : 1;
        if (pid != 0) {
            InterfaceC0601Df interfaceC0601Df2 = this.A06.get(i);
            int pid2 = A0D[6].length();
            if (pid2 != 5) {
                throw new RuntimeException();
            }
            String[] strArr = A0D;
            strArr[5] = "QLvP2fWr8scB6wxknOoMcrfxMusZtwX4";
            strArr[5] = "QLvP2fWr8scB6wxknOoMcrfxMusZtwX4";
            interfaceC0601Df = interfaceC0601Df2;
        } else {
            interfaceC0601Df = null;
        }
        if (interfaceC0601Df != null) {
            if (this.A05 != 2) {
                int i2 = A09 & 15;
                int continuityCounter = i2 - 1;
                int i3 = this.A08.get(i, continuityCounter);
                int pid3 = A0D[5].charAt(6);
                if (pid3 != 84) {
                    String[] strArr2 = A0D;
                    strArr2[5] = "Y8yWCMLbyGH6c7tX9y83KsZExSL4VZDQ";
                    strArr2[5] = "Y8yWCMLbyGH6c7tX9y83KsZExSL4VZDQ";
                    this.A08.put(i, i2);
                } else {
                    this.A08.put(i, i2);
                }
            }
            if (z2) {
                int pid4 = this.A0A.A0F();
                this.A0A.A0a(pid4);
            }
            this.A0A.A0Y(searchStart);
            interfaceC0601Df.A49(this.A0A, z);
            this.A0A.A0Y(A082);
            this.A0A.A0Z(searchStart);
            return 0;
        }
        this.A0A.A0Z(searchStart);
        return 0;
    }

    @Override // com.facebook.ads.redexgen.X.CK
    public final void ACj(long j, long j2) {
        int size = this.A0B.size();
        for (int i = 0; i < size; i++) {
            this.A0B.get(i).A09();
        }
        this.A0A.A0W();
        this.A08.clear();
        A0F();
        this.A00 = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
        r3 = r3 + 1;
     */
    @Override // com.facebook.ads.redexgen.X.CK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean ADH(CL cl) throws IOException, InterruptedException {
        byte[] bArr = this.A0A.A00;
        cl.ABZ(bArr, 0, 940);
        int i = 0;
        while (A0D[1].charAt(3) == 'H') {
            String[] strArr = A0D;
            strArr[1] = "vUfHgSsJvwNFwwToyev4j8iiTP0xmLzC";
            strArr[1] = "vUfHgSsJvwNFwwToyev4j8iiTP0xmLzC";
            if (i >= 188) {
                return false;
            }
            for (int i2 = 0; i2 != 5; i2++) {
                int j = i2 * 188;
                if (bArr[j + i] != 71) {
                    break;
                }
            }
            cl.ADG(i);
            return true;
        }
        throw new RuntimeException();
    }
}