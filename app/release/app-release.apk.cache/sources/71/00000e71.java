package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.widget.RelativeLayout;
import com.p7700g.p99005.bx;
import com.p7700g.p99005.sr;
import java.util.Arrays;
import org.xbill.DNS.Flags;

/* renamed from: com.facebook.ads.redexgen.X.4y */
/* loaded from: assets/audience_network.dex */
public class C04064y {
    public static byte[] A04;
    public final Intent A00;
    public final AnonymousClass51 A01;
    public final C1080Wh A02;
    public final JE A03;

    static {
        A0N();
    }

    public static String A0M(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 79);
        }
        return new String(copyOfRange);
    }

    public static void A0N() {
        A04 = new byte[]{51, 54, 13, 54, 51, 38, 51, 13, 48, 39, 60, 54, 62, 55, 14, 25, Flags.CD, 29, 14, 24, 25, 24, bx.W5, 21, 24, 25, 19, 61, 24, 56, 29, 8, 29, 62, 9, 18, 24, 16, 25, 77, 82, 95, 94, 84, 100, 79, 82, 86, 94, 100, 75, 84, 87, 87, 82, 85, 92, 100, 82, 85, 79, 94, 73, 77, 90, 87};
    }

    public C04064y(AnonymousClass51 anonymousClass51, Intent intent, JE je, C1080Wh c1080Wh) {
        this.A01 = anonymousClass51;
        this.A00 = intent;
        this.A03 = je;
        this.A02 = c1080Wh;
    }

    private RQ A00() {
        return (RQ) this.A00.getSerializableExtra(A0M(0, 14, 29));
    }

    public M7 A02() {
        AnonymousClass51 anonymousClass51 = this.A01;
        return new C1158Zi(anonymousClass51, this.A02, this.A03, new C0985Sq(anonymousClass51));
    }

    public M7 A03() {
        return new C0924Qe(this.A02, this.A03, new C0985Sq(this.A01), A00(), new C1103Xe(), 1);
    }

    public M7 A04() {
        return new C0924Qe(this.A02, this.A03, new C0985Sq(this.A01), (RR) this.A00.getSerializableExtra(A0M(14, 25, 51)), new C1101Xc(), 0);
    }

    public M7 A05() {
        C1080Wh c1080Wh = this.A02;
        return new AnonymousClass83(c1080Wh, this.A03, new C7H(c1080Wh), new C0985Sq(this.A01), A00());
    }

    public M7 A06() {
        return new C04878l(this.A02, new C1103Xe(), this.A03, A00(), new C7H(this.A02), new C0985Sq(this.A01));
    }

    public M7 A07() {
        return new YA(this.A02, this.A03, new C0985Sq(this.A01), A00(), null, new C1103Xe());
    }

    public M7 A08() {
        return new AnonymousClass85(this.A02, new C1103Xe(), this.A03, A00(), new C7H(this.A02), new C0985Sq(this.A01));
    }

    public M7 A09() {
        RR rr = (RR) this.A00.getSerializableExtra(A0M(14, 25, 51));
        if (rr.A0f()) {
            return new AnonymousClass85(this.A02, new C1101Xc(), this.A03, rr, new C7H(this.A02), new C0609Dn(this.A01));
        }
        C1080Wh c1080Wh = this.A02;
        return new C1118Xt(c1080Wh, this.A03, new C0792Lb(c1080Wh), new C0609Dn(this.A01), rr);
    }

    public M7 A0A() {
        RR rr = (RR) this.A00.getSerializableExtra(A0M(14, 25, 51));
        return new YA(this.A02, this.A03, new C0609Dn(this.A01), rr, rr.A0V(), new C1101Xc());
    }

    public M7 A0B(RelativeLayout relativeLayout) {
        C1106Xh c1106Xh = new C1106Xh(this.A02, new C0986Sr(this), this.A03, new C0985Sq(this.A01));
        c1106Xh.A05(relativeLayout);
        c1106Xh.A04(this.A00.getIntExtra(A0M(39, 27, 116), 200));
        C0795Le.A0P(relativeLayout, sr.t);
        return c1106Xh;
    }
}