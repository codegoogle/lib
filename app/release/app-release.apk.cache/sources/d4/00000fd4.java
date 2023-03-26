package com.facebook.ads.redexgen.X;

import com.p7700g.p99005.ax5;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Ax  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0550Ax extends AbstractC1123Xy<C0543Aq, AbstractC0529Ab, GH> implements InterfaceC1183aA {
    public static byte[] A01;
    public final String A00;

    static {
        A0K();
    }

    public static String A0J(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 125);
        }
        return new String(copyOfRange);
    }

    public static void A0K() {
        A01 = new byte[]{ax5.a, 88, 79, 98, 90, 79, 77, 94, 79, 78, 10, 78, 79, 77, 89, 78, 79, 10, 79, 92, 92, 89, 92};
    }

    public abstract GG A0d(byte[] bArr, int i, boolean z) throws GH;

    public AbstractC0550Ax(String str) {
        super(new C0543Aq[2], new AbstractC0529Ab[2]);
        this.A00 = str;
        A0a(1024);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC1123Xy
    /* renamed from: A0F */
    public final GH A0Y(C0543Aq c0543Aq, AbstractC0529Ab abstractC0529Ab, boolean z) {
        try {
            ByteBuffer byteBuffer = c0543Aq.A01;
            abstractC0529Ab.A09(((C1121Xw) c0543Aq).A00, A0d(byteBuffer.array(), byteBuffer.limit(), z), c0543Aq.A00);
            abstractC0529Ab.A01(Integer.MIN_VALUE);
            return null;
        } catch (GH e) {
            return e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC1123Xy
    /* renamed from: A0G */
    public final GH A0Z(Throwable th) {
        return new GH(A0J(0, 23, 109), th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC1123Xy
    /* renamed from: A0H */
    public final C0543Aq A0V() {
        return new C0543Aq();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC1123Xy
    /* renamed from: A0I */
    public final AbstractC0529Ab A0X() {
        return new AbstractC0529Ab(this) { // from class: com.facebook.ads.redexgen.X.3E
            public final AbstractC0550Ax A00;

            {
                this.A00 = this;
            }

            @Override // com.facebook.ads.redexgen.X.AbstractC0529Ab
            public final void A08() {
                this.A00.A0c(this);
            }
        };
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1123Xy
    /* renamed from: A0e */
    public final void A0c(AbstractC0529Ab abstractC0529Ab) {
        super.A0c(abstractC0529Ab);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1183aA
    public final void AD4(long j) {
    }
}