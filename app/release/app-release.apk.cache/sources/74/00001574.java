package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;
import com.p7700g.p99005.ax5;
import com.p7700g.p99005.bx;
import com.p7700g.p99005.qi4;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Ym  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1137Ym extends DG {
    public static byte[] A01;
    public static String[] A02;
    public static final int A03;
    public static final byte[] A04;
    public boolean A00;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 7);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{119, -104, -99, -101, -59, bx.l7, -56, -51, -45, -109, -45, -44, bx.l7, -41};
    }

    public static void A03() {
        A02 = new String[]{"nsRNjMJCINzttEcy6gRH", "iLBhdjTg3OKb8ywbNnp8pgqKlG", "RImCZo78JGnCd", "MQCM5Bft3v5AKfjxIzCtQe6XKQuHj9cI", "eIxys3n1xHnYXLY6XFR5ULs5u2Lm7Uxd", "C5r06ne3nHFGIipq1ktKTjeYxK5IlnNR", "VUYnCtCcQXjB1sQxVfFNmblLRJpOLxas", "bjyChy1rj1vSDo4qa0ykMaouAr"};
    }

    static {
        A03();
        A02();
        A03 = C0726Ig.A08(A01(0, 4, 33));
        A04 = new byte[]{79, 112, 117, 115, 72, 101, 97, 100};
    }

    private long A00(byte[] bArr) {
        int i;
        int i2;
        int i3 = bArr[0] & 255;
        int i4 = i3 & 3;
        if (i4 == 0) {
            i = 1;
        } else if (i4 != 1 && i4 != 2) {
            i = bArr[1] & ax5.a;
        } else {
            i = 2;
        }
        int i5 = i3 >> 3;
        int i6 = i5 & 3;
        if (i5 >= 16) {
            i2 = 2500 << i6;
        } else if (i5 >= 12) {
            int length = i6 & 1;
            i2 = 10000 << length;
        } else {
            String[] strArr = A02;
            String str = strArr[0];
            String str2 = strArr[2];
            int length2 = str.length();
            int length3 = str2.length();
            if (length2 == length3) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[0] = "5xugLvQ3PcyvpmKVP2TF";
            strArr2[2] = "0gGe0pFYIsJYF";
            if (i6 == 3) {
                i2 = 60000;
            } else {
                i2 = 10000 << i6;
            }
        }
        return i * i2;
    }

    private void A04(List<byte[]> list, int i) {
        list.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong((i * 1000000000) / 48000).array());
    }

    public static boolean A05(IQ iq) {
        int A05 = iq.A05();
        byte[] bArr = A04;
        if (A05 < bArr.length) {
            return false;
        }
        byte[] bArr2 = new byte[bArr.length];
        iq.A0d(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, A04);
    }

    @Override // com.facebook.ads.redexgen.X.DG
    public final long A08(IQ iq) {
        return A05(A00(iq.A00));
    }

    @Override // com.facebook.ads.redexgen.X.DG
    public final void A0A(boolean z) {
        super.A0A(z);
        if (z) {
            this.A00 = false;
        }
    }

    @Override // com.facebook.ads.redexgen.X.DG
    public final boolean A0B(IQ iq, long j, DF df) throws IOException, InterruptedException {
        if (!this.A00) {
            byte[] copyOf = Arrays.copyOf(iq.A00, iq.A08());
            int i = copyOf[9] & 255;
            int channelCount = (copyOf[11] & 255) << 8;
            ArrayList arrayList = new ArrayList(3);
            arrayList.add(copyOf);
            A04(arrayList, channelCount | (copyOf[10] & 255));
            A04(arrayList, qi4.h.k);
            df.A00 = Format.A07(null, A01(4, 10, 93), null, -1, -1, i, 48000, arrayList, null, 0, null);
            this.A00 = true;
            return true;
        }
        boolean z = iq.A09() == A03;
        iq.A0Z(0);
        return z;
    }
}