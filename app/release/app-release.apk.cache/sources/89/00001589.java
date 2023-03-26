package com.facebook.ads.redexgen.X;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseArray;
import com.p7700g.p99005.oq;
import java.io.IOException;

/* loaded from: assets/audience_network.dex */
public final class Z7 implements CK {
    public static String[] A08;
    public static final CN A09;
    public long A00;
    public CM A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final SparseArray<DX> A05;
    public final IQ A06;
    public final C0722Ic A07;

    public static void A00() {
        A08 = new String[]{"", "mExdGVP0maPlz", "mtU4GW9lJGPRgwi7WTtJ47xTDMOD9Jvz", "mnVK2jaR5CYO63Y95SEKprVffrLm5k0s", "WHnhbYArFQVibafDHBFVvoYN0aOa9WUH", "bzekXst0bt0AdcZvIiwJXkkJcIHRgIjU", "gyTL2jV1VgKAzlNybmW", "q"};
    }

    static {
        A00();
        A09 = new Z6();
    }

    public Z7() {
        this(new C0722Ic(0L));
    }

    public Z7(C0722Ic c0722Ic) {
        this.A07 = c0722Ic;
        this.A06 = new IQ(4096);
        this.A05 = new SparseArray<>();
    }

    @Override // com.facebook.ads.redexgen.X.CK
    public final void A7Q(CM cm) {
        this.A01 = cm;
        cm.ACk(new YH(-9223372036854775807L));
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0138, code lost:
        if (r4 == null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x013a, code lost:
        r10.ADG(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x013e, code lost:
        if (r4 == null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0141, code lost:
        r9.A06.A0X(r5);
        r10.readFully(r9.A06.A00, 0, r5);
        r9.A06.A0Z(6);
        r4.A03(r9.A06);
        r1 = r9.A06;
        r1.A0Y(r1.A06());
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0102  */
    @Override // com.facebook.ads.redexgen.X.CK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int ABx(CL cl, CR cr) throws IOException, InterruptedException {
        long j;
        if (cl.ABa(this.A06.A00, 0, 4, true)) {
            this.A06.A0Z(0);
            int A092 = this.A06.A09();
            if (A092 == 441) {
                return -1;
            }
            if (A092 == 442) {
                cl.ABZ(this.A06.A00, 0, 10);
                this.A06.A0Z(9);
                cl.ADG((this.A06.A0F() & 7) + 14);
                return 0;
            } else if (A092 == 443) {
                cl.ABZ(this.A06.A00, 0, 2);
                this.A06.A0Z(0);
                cl.ADG(this.A06.A0J() + 6);
                return 0;
            } else if (((A092 & oq.u) >> 8) != 1) {
                cl.ADG(1);
                return 0;
            } else {
                int i = A092 & 255;
                DX dx = this.A05.get(i);
                if (!this.A02) {
                    if (dx == null) {
                        DQ dq = null;
                        if (i == 189) {
                            dq = new C1143Ys();
                            this.A03 = true;
                            this.A00 = cl.A6m();
                        } else if ((i & 224) == 192) {
                            dq = new Z4();
                            this.A03 = true;
                            this.A00 = cl.A6m();
                        } else if ((i & 240) == 224) {
                            dq = new C1150Yz();
                            this.A04 = true;
                            this.A00 = cl.A6m();
                        }
                        if (dq != null) {
                            dq.A4U(this.A01, new C0600De(i, 256));
                            dx = new DX(dq, this.A07);
                            this.A05.put(i, dx);
                        }
                    }
                    if (this.A03) {
                        boolean z = this.A04;
                        if (A08[4].charAt(23) != 'N') {
                            throw new RuntimeException();
                        }
                        String[] strArr = A08;
                        strArr[5] = "GuNYv8iGB9fWJbOt3uu3Za7wMxPGJegg";
                        strArr[3] = "GUiTHbar7DdTUGk0lHWf4lwKJeXDLMXK";
                        if (z) {
                            j = this.A00 + PlaybackStateCompat.F;
                            if (cl.A6m() > j) {
                                this.A02 = true;
                                this.A01.A4w();
                            }
                        }
                    }
                    j = PlaybackStateCompat.M;
                    if (cl.A6m() > j) {
                    }
                }
                cl.ABZ(this.A06.A00, 0, 2);
                this.A06.A0Z(0);
                int A0J = this.A06.A0J() + 6;
                if (A08[2].charAt(13) != 'B') {
                    String[] strArr2 = A08;
                    strArr2[2] = "LU8WC4TuN3WXFvWf57u6WvD8Lscdw8Rq";
                    strArr2[2] = "LU8WC4TuN3WXFvWf57u6WvD8Lscdw8Rq";
                }
                return 0;
            }
        }
        return -1;
    }

    @Override // com.facebook.ads.redexgen.X.CK
    public final void ACj(long j, long j2) {
        this.A07.A09();
        for (int i = 0; i < this.A05.size(); i++) {
            this.A05.valueAt(i).A02();
        }
    }

    @Override // com.facebook.ads.redexgen.X.CK
    public final boolean ADH(CL cl) throws IOException, InterruptedException {
        byte[] bArr = new byte[14];
        cl.ABZ(bArr, 0, 14);
        if (442 == (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            if (A08[7].length() != 3) {
                String[] strArr = A08;
                strArr[4] = "dWjhqjXulz1hd3AtKzuGBSPNQhOMyT1H";
                strArr[4] = "dWjhqjXulz1hd3AtKzuGBSPNQhOMyT1H";
                cl.A3M(bArr[13] & 7);
                cl.ABZ(bArr, 0, 3);
                return 1 == ((bArr[2] & 255) | (((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)));
            }
            throw new RuntimeException();
        }
        return false;
    }
}