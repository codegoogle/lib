package com.facebook.ads.redexgen.X;

import android.animation.AnimatorListenerAdapter;
import android.annotation.TargetApi;
import android.os.Handler;
import android.view.View;
import androidx.annotation.Nullable;

@TargetApi(12)
/* loaded from: assets/audience_network.dex */
public final class HU implements InterfaceC0887Ot {
    public static String[] A0B;
    public View A00;
    @Nullable
    public C0792Lb A01;
    @Nullable
    public P4 A02;
    public boolean A03;
    public final Handler A04;
    public final K4 A05;
    public final AbstractC0766Jy A06;
    public final AbstractC0754Jk A07;
    public final IC A08;
    public final boolean A09;
    public final boolean A0A;

    static {
        A06();
    }

    public static void A06() {
        A0B = new String[]{"82Zz8oCZg8zkkbzw8opl2Yz4CtrF2SDp", "9Qv", "sj5N5SmrmBRQmWue5o8rJw6ys3alFtJa", "lBA7odrZYL425", "CSSBUKaIJSWMhqfJuWGnuyX4cipoTk5I", "IDQP5gLMbSSnC18VVbdsGZXvkzghwpNg", "Yf1MSxzKxHs57zUlY7hI2xykX4pHUq1P", "T3bn0lMwtbok5v0PvXD6574OGDOrX6LS"};
    }

    public HU(View view, P4 p4, boolean z) {
        this(view, p4, z, false);
    }

    public HU(View view, @Nullable P4 p4, boolean z, boolean z2) {
        this.A06 = new AbstractC0766Jy() { // from class: com.facebook.ads.redexgen.X.7h
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C9K
            /* renamed from: A00 */
            public final void A04(C04747t c04747t) {
                HU.A0B(HU.this, 1, 0);
            }
        };
        this.A07 = new AbstractC0754Jk() { // from class: com.facebook.ads.redexgen.X.7e
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C9K
            /* renamed from: A00 */
            public final void A04(C0761Jt c0761Jt) {
                if (!HU.A0D(HU.this)) {
                    return;
                }
                if (HU.A03(HU.this) == P4.A03 || HU.A0E(HU.this)) {
                    HU.A04(HU.this, null);
                    HU.A0A(HU.this);
                    return;
                }
                HU.A0B(HU.this, 0, 8);
            }
        };
        this.A05 = new K4() { // from class: com.facebook.ads.redexgen.X.7d
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C9K
            /* renamed from: A00 */
            public final void A04(C7v c7v) {
                if (HU.A03(HU.this) != P4.A04) {
                    HU.A01(HU.this).setAlpha(1.0f);
                    HU.A01(HU.this).setVisibility(0);
                }
            }
        };
        this.A08 = new C04617c(this);
        this.A03 = true;
        this.A04 = new Handler();
        this.A09 = z;
        this.A0A = z2;
        A09(view, p4);
    }

    public static /* synthetic */ View A01(HU hu) {
        return hu.A00;
    }

    public static /* synthetic */ P4 A03(HU hu) {
        return hu.A02;
    }

    public static /* synthetic */ P4 A04(HU hu, P4 p4) {
        hu.A02 = p4;
        return p4;
    }

    public void A05() {
        this.A00.animate().alpha(0.0f).setDuration(500L).setListener(new P3(this));
    }

    public void A07(int i, int i2) {
        this.A04.removeCallbacksAndMessages(null);
        this.A00.clearAnimation();
        this.A00.setAlpha(i);
        this.A00.setVisibility(i2);
    }

    public void A08(AnimatorListenerAdapter animatorListenerAdapter) {
        this.A00.setVisibility(0);
        this.A00.animate().alpha(1.0f).setDuration(500L).setListener(animatorListenerAdapter);
    }

    private final void A09(View view, P4 p4) {
        this.A02 = p4;
        this.A00 = view;
        this.A00.clearAnimation();
        if (p4 == P4.A04) {
            this.A00.setAlpha(0.0f);
            String[] strArr = A0B;
            if (strArr[5].charAt(26) == strArr[0].charAt(26)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0B;
            strArr2[5] = "3OWa54Sl5zOXBo6RskK22JrE4LW5JWKj";
            strArr2[0] = "lt7hksMEFpJVhV2333OBcIopOVPW9bfy";
            this.A00.setVisibility(8);
            return;
        }
        this.A00.setAlpha(1.0f);
        this.A00.setVisibility(0);
    }

    public static /* synthetic */ void A0A(HU hu) {
        hu.A05();
    }

    public static /* synthetic */ void A0B(HU hu, int i, int i2) {
        hu.A07(i, i2);
    }

    public static /* synthetic */ boolean A0D(HU hu) {
        return hu.A03;
    }

    public static /* synthetic */ boolean A0E(HU hu) {
        return hu.A09;
    }

    public final void A0G() {
        this.A03 = false;
        A08(null);
    }

    public final boolean A0H() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0887Ot
    public final void A7s(C0792Lb c0792Lb) {
        this.A01 = c0792Lb;
        c0792Lb.getEventBus().A04(this.A06, this.A07, this.A08, this.A05);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0887Ot
    public final void ADa(C0792Lb c0792Lb) {
        A07(1, 0);
        c0792Lb.getEventBus().A05(this.A05, this.A08, this.A07, this.A06);
        this.A01 = null;
    }
}