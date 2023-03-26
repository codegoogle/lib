package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.List;
import org.xbill.DNS.Flags;

/* renamed from: com.facebook.ads.redexgen.X.Io  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0732Io {
    public static byte[] A02;
    public static String[] A03;
    public final int A00;
    public final List<byte[]> A01;

    static {
        A03();
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 44);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-22, 23, 23, 20, 23, -59, 21, 6, 23, 24, 14, 19, 12, -59, -19, -22, -5, -24, -59, 8, 20, 19, Flags.CD, 14, 12};
    }

    public static void A03() {
        A03 = new String[]{"bNwv9DTrsFpr", "zbhYB7daSjPcuvBmkTZuqaAPzZ9zn8h", "FRkSQOtD666PiwdWpMANCzaC3fIlZstE", "hSncHK0YMcK7Os9UUgTo3Hp6GRz3gib", "Da8z6HvdaVwrG586sIxSQ6hlHOkGiutI", "7Q5nL4gzRbsCGic6ITFl05T54duLJG5D", "soaxh0FZrqdNmpGhlM75NEwupCBAn2wQ", "H3bjs2QdHQpI"};
    }

    public C0732Io(List<byte[]> initializationData, int i) {
        this.A01 = initializationData;
        this.A00 = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0056, code lost:
        r13.A0Z(r5);
        r7 = new byte[r9];
        r6 = 0;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005d, code lost:
        if (r5 >= r10) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005f, code lost:
        r13.A0a(1);
        r4 = r13.A0J();
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0067, code lost:
        if (r3 >= r4) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0069, code lost:
        r2 = r13.A0J();
        r11 = com.facebook.ads.redexgen.X.IM.A03;
        r0 = com.facebook.ads.redexgen.X.IM.A03.length;
        java.lang.System.arraycopy(r11, 0, r7, r6, r0);
        r0 = com.facebook.ads.redexgen.X.IM.A03.length;
        r6 = r6 + r0;
        r1 = r13.A00;
        r0 = r13.A07();
        java.lang.System.arraycopy(r1, r0, r7, r6, r2);
        r6 = r6 + r2;
        r13.A0a(r2);
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008a, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008d, code lost:
        if (r9 != 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008f, code lost:
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0091, code lost:
        r2 = java.util.Collections.singletonList(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009c, code lost:
        return new com.facebook.ads.redexgen.X.C0732Io(r2, r12 + 1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0732Io A00(IQ iq) throws AN {
        try {
            iq.A0a(21);
            int csdStartPosition = iq.A0F() & 3;
            int i = iq.A0F();
            int numberOfNalUnits = 0;
            int A07 = iq.A07();
            int i2 = 0;
            while (true) {
                String[] strArr = A03;
                String str = strArr[7];
                String str2 = strArr[0];
                int length = str.length();
                int csdLength = str2.length();
                if (length != csdLength) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A03;
                strArr2[7] = "tNmJvjDEnkcZ";
                strArr2[0] = "FarTxLmaqbLK";
                if (i2 >= i) {
                    break;
                }
                iq.A0a(1);
                int A0J = iq.A0J();
                for (int i3 = 0; i3 < A0J; i3++) {
                    int A0J2 = iq.A0J();
                    int csdLength2 = A0J2 + 4;
                    numberOfNalUnits += csdLength2;
                    iq.A0a(A0J2);
                }
                i2++;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new AN(A01(0, 25, 121), e);
        }
    }
}