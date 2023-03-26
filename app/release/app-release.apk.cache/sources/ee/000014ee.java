package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Wc  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1075Wc extends AbstractRunnableC0770Kc {
    public static byte[] A02;
    public final /* synthetic */ C1076Wd A00;
    public final /* synthetic */ AtomicBoolean A01;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 31);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{117, 87, 85, 94, 83, 22, 80, 87, 95, 90, 24, 77, 111, 109, 102, 107, 46, 125, 123, 109, 109, 107, 125, 125, 32};
    }

    public C1075Wc(C1076Wd c1076Wd, AtomicBoolean atomicBoolean) {
        this.A00 = c1076Wd;
        this.A01 = atomicBoolean;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0770Kc
    public final void A07() {
        C8H c8h;
        long j;
        C8H c8h2;
        long j2;
        if (this.A00.A00 != null) {
            if (this.A01.get()) {
                this.A00.A02.A0G(JK.A0H);
                c8h2 = this.A00.A02.A04;
                C7A c7a = this.A00.A01;
                int i = C7K.A00;
                j2 = this.A00.A02.A00;
                C7K.A02(c8h2, c7a, i, A00(11, 14, 17), j2);
                this.A00.A02.A0N();
                this.A00.A00.A9E();
                return;
            }
            this.A00.A02.A0G(JK.A0G);
            c8h = this.A00.A02.A04;
            C7A c7a2 = this.A00.A01;
            int i2 = C7K.A04;
            j = this.A00.A02.A00;
            C7K.A02(c8h, c7a2, i2, A00(0, 11, 41), j);
            this.A00.A02.A0O();
            this.A00.A00.A97();
        }
    }
}