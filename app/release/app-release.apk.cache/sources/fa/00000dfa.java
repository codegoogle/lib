package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.facebook.ads.internal.exoplayer2.Format;
import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.32  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass32 extends AbstractC0573Cd implements Handler.Callback {
    public static String[] A0D;
    public int A00;
    public int A01;
    public Format A02;
    public InterfaceC1183aA A03;
    public C0543Aq A04;
    public AbstractC0529Ab A05;
    public AbstractC0529Ab A06;
    public boolean A07;
    public boolean A08;
    public final Handler A09;
    public final AH A0A;
    public final GI A0B;
    public final GJ A0C;

    static {
        A05();
    }

    public static void A05() {
        A0D = new String[]{"fagSsoac43UJSJG", "PL0Df5XObPsMjoFT3sU6Lp83XbviyP8R", "k75ap2fxOZvkqr2FjEQ9d3Y", "qEZm9kPptvCV49j1bDgJYwonF92a", "8QH8MqTnW7KMzd9bL", "CjrIcpNXno9M2QOeMZvTD2WdktHrPs5P", "AfT76Pf2kDJi2th", "sZbuEqgSWLt9Albo4x4yfDH"};
    }

    public AnonymousClass32(GJ gj, Looper looper) {
        this(gj, looper, GI.A00);
    }

    public AnonymousClass32(GJ gj, Looper looper, GI gi) {
        super(3);
        this.A0C = (GJ) I1.A01(gj);
        this.A09 = looper == null ? null : new Handler(looper, this);
        this.A0B = gi;
        this.A0A = new AH();
    }

    private long A00() {
        int i = this.A01;
        if (i == -1 || i >= this.A06.A6F()) {
            return Long.MAX_VALUE;
        }
        return this.A06.A6E(this.A01);
    }

    private void A01() {
        A07(Collections.emptyList());
    }

    private void A02() {
        this.A04 = null;
        this.A01 = -1;
        AbstractC0529Ab abstractC0529Ab = this.A06;
        if (abstractC0529Ab != null) {
            abstractC0529Ab.A08();
            this.A06 = null;
        }
        AbstractC0529Ab abstractC0529Ab2 = this.A05;
        if (abstractC0529Ab2 != null) {
            abstractC0529Ab2.A08();
            this.A05 = null;
        }
    }

    private void A03() {
        A02();
        this.A03.ACD();
        this.A03 = null;
        this.A00 = 0;
    }

    private void A04() {
        A03();
        this.A03 = this.A0B.A4F(this.A02);
    }

    private void A06(List<GF> list) {
        this.A0C.A9I(list);
    }

    private void A07(List<GF> list) {
        Handler handler = this.A09;
        if (handler != null) {
            handler.obtainMessage(0, list).sendToTarget();
        } else {
            A06(list);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0573Cd
    public final void A14() {
        this.A02 = null;
        A01();
        A03();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0573Cd
    public final void A17(long j, boolean z) {
        A01();
        this.A07 = false;
        this.A08 = false;
        if (this.A00 != 0) {
            A04();
            return;
        }
        A02();
        InterfaceC1183aA interfaceC1183aA = this.A03;
        String[] strArr = A0D;
        if (strArr[2].length() != strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0D;
        strArr2[1] = "SIdEizz9oP1X0InrrFd2Zym6xF4ie8Hi";
        strArr2[1] = "SIdEizz9oP1X0InrrFd2Zym6xF4ie8Hi";
        interfaceC1183aA.flush();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0573Cd
    public final void A19(Format[] formatArr, long j) throws A4 {
        this.A02 = formatArr[0];
        if (this.A03 != null) {
            this.A00 = 1;
        } else {
            this.A03 = this.A0B.A4F(this.A02);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1104Xf
    public final boolean A7Z() {
        return this.A08;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1104Xf
    public final boolean A7i() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x009c, code lost:
        if (r6 == 2) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009e, code lost:
        A04();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00bd, code lost:
        if (r6 == 2) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c0, code lost:
        A02();
        r9.A08 = true;
     */
    @Override // com.facebook.ads.redexgen.X.InterfaceC1104Xf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void ACQ(long j, long j2) throws A4 {
        if (this.A08) {
            return;
        }
        if (this.A05 == null) {
            this.A03.AD4(j);
            try {
                this.A05 = this.A03.A4i();
            } catch (GH e) {
                throw A4.A01(e, A10());
            }
        }
        if (A70() != 2) {
            return;
        }
        boolean z = false;
        if (this.A06 != null) {
            long A00 = A00();
            while (A00 <= j) {
                this.A01++;
                A00 = A00();
                z = true;
            }
        }
        AbstractC0529Ab abstractC0529Ab = this.A05;
        String[] strArr = A0D;
        if (strArr[4].length() != strArr[3].length()) {
            String[] strArr2 = A0D;
            strArr2[1] = "XY0BtpFryTh5vJ9OnDecIRSpslOi5uhK";
            strArr2[1] = "XY0BtpFryTh5vJ9OnDecIRSpslOi5uhK";
            if (abstractC0529Ab != null) {
                if (abstractC0529Ab.A04()) {
                    if (!z && A00() == Long.MAX_VALUE) {
                        int i = this.A00;
                        String[] strArr3 = A0D;
                        if (strArr3[6].length() != strArr3[0].length()) {
                            String[] strArr4 = A0D;
                            strArr4[4] = "mbnDFqY2K95bUayMi";
                            strArr4[3] = "jZB4HApNBiduyvnow8cew7gbgOu4";
                        } else {
                            String[] strArr5 = A0D;
                            strArr5[4] = "MeHVLRPd9fQTHEeBi";
                            strArr5[3] = "YXb6olWsbop2pyVFpyT7RkPVUyda";
                        }
                    }
                } else if (((AbstractC1122Xx) this.A05).A01 <= j) {
                    AbstractC0529Ab abstractC0529Ab2 = this.A06;
                    if (abstractC0529Ab2 != null) {
                        abstractC0529Ab2.A08();
                    }
                    this.A06 = this.A05;
                    String[] strArr6 = A0D;
                    if (strArr6[4].length() != strArr6[3].length()) {
                        String[] strArr7 = A0D;
                        strArr7[5] = "X2bpaAWybcYqy3FAGHkwIjlm6aPwbX20";
                        strArr7[5] = "X2bpaAWybcYqy3FAGHkwIjlm6aPwbX20";
                        this.A05 = null;
                        this.A01 = this.A06.A6Y(j);
                        z = true;
                    }
                }
            }
            if (z) {
                A07(this.A06.A5p(j));
            }
            if (this.A00 == 2) {
                return;
            }
            while (!this.A07) {
                try {
                    if (this.A04 == null) {
                        this.A04 = this.A03.A4h();
                        if (this.A04 == null) {
                            return;
                        }
                    }
                    if (this.A00 == 1) {
                        this.A04.A02(4);
                        this.A03.ABw(this.A04);
                        this.A04 = null;
                        this.A00 = 2;
                        return;
                    }
                    int A12 = A12(this.A0A, this.A04, false);
                    if (A12 == -4) {
                        if (this.A04.A04()) {
                            this.A07 = true;
                        } else {
                            this.A04.A00 = this.A0A.A00.A0G;
                            this.A04.A08();
                        }
                        this.A03.ABw(this.A04);
                        this.A04 = null;
                    } else if (A12 == -3) {
                        return;
                    }
                } catch (GH e2) {
                    throw A4.A01(e2, A10());
                }
            }
            return;
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0530Ac
    public final int ADS(Format format) {
        if (this.A0B.ADT(format)) {
            return AbstractC0573Cd.A0z(null, format.A0H) ? 4 : 2;
        } else if (IJ.A0B(format.A0O)) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 0) {
            A06((List) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }
}