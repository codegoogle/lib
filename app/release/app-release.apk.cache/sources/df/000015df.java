package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.aZ  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1208aZ implements HH, InterfaceC0701Hh<Object> {
    public static String[] A0A;
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    @Nullable
    public final Handler A06;
    @Nullable
    public final HG A07;
    public final I4 A08;
    public final C0721Ib A09;

    static {
        A01();
    }

    public static void A01() {
        A0A = new String[]{"8v43OWLt8X4Ft8FSsUnUJEljk6O9jZtl", "gqJU9rJqtCXP9nVsCJhzhjWr3OTUONn5", "evi8lnvhIGFpGwxvrEQ2HxpF9HfAYNb4", "XM9iQGBoaLQIRrKYvs1BFwTGSVuWakLP", "oYKHkHYzGvwdV8VAJO5FvOndhShHo3uL", "GsOQXWL80Wqi8CBj4PFxcrgidstVbv5Z", "TfEJwESWFeUjyASkqvscuoRhiyKsiSGj", "R3GeLkF45fmp7DtCtFYf0NMS1ko1sZ3Y"};
    }

    public C1208aZ() {
        this(null, null, 1000000L, 2000, I4.A00);
    }

    public C1208aZ(@Nullable Handler handler, @Nullable HG hg, long j, int i, I4 i4) {
        this.A06 = handler;
        this.A07 = hg;
        this.A09 = new C0721Ib(i);
        this.A08 = i4;
        this.A01 = j;
    }

    private void A02(int i, long j, long j2) {
        Handler handler = this.A06;
        if (handler != null) {
            HG hg = this.A07;
            String[] strArr = A0A;
            if (strArr[3].charAt(14) == strArr[2].charAt(14)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[3] = "mcMhHiKL1Hs40ZODL70g4thjgDTU4mJQ";
            strArr2[2] = "gdrxxP25NVrEqdTm0xFGwMteDAr0ERpE";
            if (hg != null) {
                handler.post(new HR(this, i, j, j2));
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.HH
    public final synchronized long A5S() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0701Hh
    public final synchronized void A95(Object obj, int i) {
        this.A02 += i;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0701Hh
    public final synchronized void AB9(Object obj) {
        I1.A04(this.A00 > 0);
        long A4r = this.A08.A4r();
        long nowMs = A4r - this.A03;
        int i = (int) nowMs;
        long nowMs2 = i;
        this.A05 += nowMs2;
        long j = this.A04;
        long nowMs3 = this.A02;
        this.A04 = j + nowMs3;
        if (i > 0) {
            long nowMs4 = i;
            this.A09.A04((int) Math.sqrt(this.A02), (float) ((this.A02 * 8000) / nowMs4));
            int i2 = (this.A05 > 2000L ? 1 : (this.A05 == 2000L ? 0 : -1));
            String[] strArr = A0A;
            if (strArr[6].charAt(30) == strArr[5].charAt(30)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[3] = "ZGZYZVMOjrgZsL4omJYgF6CzP4kXRh7Y";
            strArr2[2] = "w8y5sfHjCRRFpoxn3MnbYbSKFexwF0nZ";
            if (i2 >= 0 || this.A04 >= PlaybackStateCompat.L) {
                float bitsPerSecond = this.A09.A03(0.5f);
                this.A01 = bitsPerSecond;
            }
        }
        A02(i, this.A02, this.A01);
        int i3 = this.A00 - 1;
        this.A00 = i3;
        if (i3 > 0) {
            this.A03 = A4r;
        }
        this.A02 = 0L;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0701Hh
    public final synchronized void ABA(Object obj, HQ hq) {
        if (this.A00 == 0) {
            this.A03 = this.A08.A4r();
        }
        this.A00++;
    }
}