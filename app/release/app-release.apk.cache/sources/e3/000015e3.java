package com.facebook.ads.redexgen.X;

import android.net.Uri;
import com.p7700g.p99005.ax5;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.ad  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1212ad implements HM {
    public static byte[] A00;
    public static final HL A01;
    public static final C1212ad A02;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 72);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{10, 59, 51, 51, ax5.a, -26, 57, 53, 59, 56, 41, 43};
    }

    static {
        A01();
        A02 = new C1212ad();
        A01 = new C1211ac();
    }

    public C1212ad() {
    }

    public /* synthetic */ C1212ad(C1211ac c1211ac) {
        this();
    }

    @Override // com.facebook.ads.redexgen.X.HM
    public final Uri A7C() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.HM
    public final long ABP(HQ hq) throws IOException {
        throw new IOException(A00(0, 12, 126));
    }

    @Override // com.facebook.ads.redexgen.X.HM
    public final void close() throws IOException {
    }

    @Override // com.facebook.ads.redexgen.X.HM
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        throw new UnsupportedOperationException();
    }
}