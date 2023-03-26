package com.facebook.ads.redexgen.X;

import android.animation.ObjectAnimator;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.view.animation.LinearInterpolator;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.p7700g.p99005.nq;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class H2 extends RelativeLayout implements InterfaceC0887Ot {
    public static byte[] A08;
    public static final int A09;
    public int A00;
    public ObjectAnimator A01;
    public ProgressBar A02;
    public C9K A03;
    public C9K A04;
    public C9K A05;
    public C9K A06;
    @Nullable
    public C0792Lb A07;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 20);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A08 = new byte[]{-71, -69, -72, -80, -69, -82, -68, -68};
    }

    static {
        A05();
        A09 = (int) (C0795Le.A01 * 6.0f);
    }

    public H2(C1080Wh c1080Wh) {
        this(c1080Wh, A09, -12549889, 0);
    }

    public H2(C1080Wh c1080Wh, int i, int i2, int i3) {
        super(c1080Wh);
        this.A00 = -1;
        this.A06 = new AbstractC0724Ie() { // from class: com.facebook.ads.redexgen.X.6c
            public static String[] A01;

            static {
                A00();
            }

            public static void A00() {
                A01 = new String[]{"5cZwmFwOCvoIimHKJKs7c8Wrfuwl5", "kR6Rx7ETQGlVhfpD5OxJcFg21Ovz094i", "oaAjYFLN3m9AYmyloxlSIBJp6ETHW3KF", "dCQrNLE74jmKWuOaqJJ4Sbhiwuuv5ad", "onBgfHhqxGhqxLvpU2wfKqg3mDsyExyq", "SCROov7hAW1gh5oss5LLtyUv0yBfa", "SAPoZVZ00ZwZwmL71sxtzrpJli3hIy2X", "TEn6j3AzMnGgqeyMrOghHZKrMbMLSMuC"};
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C9K
            /* renamed from: A01 */
            public final void A04(C04737s c04737s) {
                C0792Lb c0792Lb;
                c0792Lb = H2.this.A07;
                if (c0792Lb != null) {
                    H2 h2 = H2.this;
                    String[] strArr = A01;
                    if (strArr[2].charAt(14) == strArr[4].charAt(14)) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A01;
                    strArr2[1] = "B8raFzKF2tgWcMrESvgtBPeFcOBIsHL1";
                    strArr2[1] = "B8raFzKF2tgWcMrESvgtBPeFcOBIsHL1";
                    h2.A04();
                }
            }
        };
        this.A04 = new AbstractC0766Jy() { // from class: com.facebook.ads.redexgen.X.5r
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C9K
            /* renamed from: A00 */
            public final void A04(C04747t c04747t) {
                H2.A07(H2.this);
            }
        };
        this.A05 = new AbstractC0754Jk() { // from class: com.facebook.ads.redexgen.X.4b
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C9K
            /* renamed from: A00 */
            public final void A04(C0761Jt c0761Jt) {
                C0792Lb c0792Lb;
                c0792Lb = H2.this.A07;
                if (c0792Lb == null) {
                    return;
                }
                H2.this.A04();
            }
        };
        this.A03 = new K4() { // from class: com.facebook.ads.redexgen.X.4T
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C9K
            /* renamed from: A00 */
            public final void A04(C7v c7v) {
                C0792Lb c0792Lb;
                c0792Lb = H2.this.A07;
                if (c0792Lb == null) {
                    return;
                }
                H2.this.A02();
            }
        };
        this.A02 = new ProgressBar(c1080Wh, null, 16842872);
        A0A(i2, i3);
        this.A02.setMax(10000);
        addView(this.A02, new RelativeLayout.LayoutParams(-1, i));
    }

    public void A02() {
        A03();
        this.A01 = ObjectAnimator.ofInt(this.A02, A01(0, 8, 53), 0, 0);
        this.A01.setDuration(0L);
        this.A01.setInterpolator(new LinearInterpolator());
        this.A01.start();
        this.A00 = -1;
    }

    public void A03() {
        ObjectAnimator objectAnimator = this.A01;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.A01.setTarget(null);
            this.A01 = null;
            this.A02.clearAnimation();
        }
    }

    public void A04() {
        if (this.A07 == null) {
            return;
        }
        A03();
        int progress = this.A07.getCurrentPositionInMillis();
        int duration = this.A07.getDuration();
        int i = duration > 0 ? (progress * 10000) / duration : 0;
        int i2 = this.A00;
        if (i2 >= i || duration <= progress) {
            return;
        }
        this.A01 = ObjectAnimator.ofInt(this.A02, A01(0, 8, 53), i2, i);
        ObjectAnimator objectAnimator = this.A01;
        int duration2 = Math.min(250, duration - progress);
        objectAnimator.setDuration(duration2);
        this.A01.setInterpolator(new LinearInterpolator());
        this.A01.start();
        this.A00 = i;
    }

    public static /* synthetic */ void A07(H2 h2) {
        h2.A03();
    }

    public final void A09() {
        A03();
        this.A02 = null;
        this.A07 = null;
    }

    public final void A0A(int i, int i2) {
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{new ColorDrawable(i2), new ColorDrawable(i2), new ScaleDrawable(new ColorDrawable(i), nq.b, 1.0f, -1.0f)});
        layerDrawable.setId(0, 16908288);
        layerDrawable.setId(1, 16908303);
        layerDrawable.setId(2, 16908301);
        this.A02.setProgressDrawable(layerDrawable);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0887Ot
    public final void A7s(C0792Lb c0792Lb) {
        this.A07 = c0792Lb;
        c0792Lb.getEventBus().A04(this.A04, this.A05, this.A06, this.A03);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0887Ot
    public final void ADa(C0792Lb c0792Lb) {
        c0792Lb.getEventBus().A05(this.A06, this.A05, this.A04, this.A03);
        this.A07 = null;
    }
}