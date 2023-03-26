package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.p7700g.p99005.g15;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.a7  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1180a7 implements LL {
    public static byte[] A03;
    public static String[] A04;
    public int A00;
    @Nullable
    public String A01;
    public final LL A02;

    static {
        A03();
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            byte b = copyOfRange[i4];
            String[] strArr = A04;
            if (strArr[5].charAt(25) == strArr[3].charAt(25)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[5] = "Ai5XpAh7M4hRkPfPQf54GYnUnAkHicBv";
            strArr2[3] = "aIcIWiLMc3Hy2WApHOm5eO35KvTaoUWD";
            copyOfRange[i4] = (byte) ((b - i3) - 83);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{-117, -117, 125, g15.b};
    }

    public static void A03() {
        A04 = new String[]{"3JpGgMVfhEKs4h1tr8RMzDA7DOHokops", "dXqQ9QAcXKU8whF3kmnzOWjNbVMrrIOv", "otwaAvusvekoag06qMT5pISHPHVrRcMV", "WpvUEDFnYdSXMC7RGaJnlQQN5lPpeUoV", "uIVwlH6eBNHvEYk4kE6nlnhEt8muXj04", "pYVE6LchgLxW1usH7NIdAbU6pOe1Iyyx", "cgHZB3wyyqxQlT2ShG9pTXiCyg", "w9qB75SnMFWvoXL9CpdnGLUKrWLPOybN"};
    }

    public C1180a7(LL ll) {
        this.A02 = ll;
    }

    private void A01() {
        if (this.A01 != null) {
            LL ll = this.A02;
            ll.ABm(this.A01 + A00(0, 4, 10) + this.A00);
            this.A01 = null;
            this.A00 = 0;
        }
    }

    @Override // com.facebook.ads.redexgen.X.LL
    public final void ABm(String str) {
        boolean A0A;
        String A042;
        A0A = LN.A0A(str);
        if (!A0A) {
            A042 = LN.A04(str);
            if (A042.equals(this.A01)) {
                this.A00++;
                return;
            }
            A01();
            this.A01 = A042;
            this.A00 = 1;
            return;
        }
        A01();
        this.A02.ABm(str);
    }

    @Override // com.facebook.ads.redexgen.X.LL
    public final void flush() {
        A01();
        this.A02.flush();
    }
}