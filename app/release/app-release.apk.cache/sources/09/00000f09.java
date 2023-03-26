package com.facebook.ads.redexgen.X;

import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.7S */
/* loaded from: assets/audience_network.dex */
public final class C7S extends K6 implements View.OnClickListener {
    public static String[] A05;
    public final K4 A00;
    public final AbstractC0766Jy A01;
    public final AbstractC0754Jk A02;
    public final JH A03;
    public final PC A04;

    static {
        A01();
    }

    public static void A01() {
        A05 = new String[]{"dj2bca5KMhic7lU7SNdjndSTQwmssf52", "TPlcacN2BRfqpmqqou3eGj4ypEirHC", "lK1i5T", "LDnNwGMA5Xj1Rc4RK", "9vPtQslMJEvaRYxyY6ZiMi1q6kn3NQTo", "pbwCeIFhJ07zfEQSECI2TdcOW", "Wj7W52", "ztBFgo3EeJBil6N8wes8zN"};
    }

    public C7S(C1080Wh c1080Wh) {
        this(c1080Wh, null);
    }

    public C7S(C1080Wh c1080Wh, AttributeSet attributeSet) {
        this(c1080Wh, attributeSet, 0);
    }

    public C7S(C1080Wh c1080Wh, AttributeSet attributeSet, int i) {
        super(c1080Wh, attributeSet, i);
        this.A03 = new JH() { // from class: com.facebook.ads.redexgen.X.7Z
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C9K
            /* renamed from: A00 */
            public final void A04(JJ jj) {
                C7S.this.setVisibility(0);
            }
        };
        this.A01 = new AbstractC0766Jy() { // from class: com.facebook.ads.redexgen.X.7Y
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C9K
            /* renamed from: A00 */
            public final void A04(C04747t c04747t) {
                C7S.A00(C7S.this).setChecked(true);
            }
        };
        this.A02 = new AbstractC0754Jk() { // from class: com.facebook.ads.redexgen.X.7X
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C9K
            /* renamed from: A00 */
            public final void A04(C0761Jt c0761Jt) {
                C7S.A00(C7S.this).setChecked(false);
            }
        };
        this.A00 = new K4() { // from class: com.facebook.ads.redexgen.X.7T
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C9K
            /* renamed from: A00 */
            public final void A04(C7v c7v) {
                C7S.A00(C7S.this).setChecked(true);
            }
        };
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.A04 = new PC(c1080Wh);
        this.A04.setChecked(true);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) (displayMetrics.density * 25.0f), (int) (displayMetrics.density * 25.0f));
        setVisibility(8);
        addView(this.A04, layoutParams);
        setClickable(true);
        setFocusable(true);
    }

    public static /* synthetic */ PC A00(C7S c7s) {
        return c7s.A04;
    }

    @Override // com.facebook.ads.redexgen.X.K6
    public final void A07() {
        super.A07();
        setOnClickListener(this);
        this.A04.setOnClickListener(this);
        if (getVideoView() != null) {
            getVideoView().getEventBus().A04(this.A03, this.A00, this.A01, this.A02);
        }
    }

    @Override // com.facebook.ads.redexgen.X.K6
    public final void A08() {
        if (getVideoView() != null) {
            getVideoView().getEventBus().A05(this.A02, this.A01, this.A00, this.A03);
        }
        setOnClickListener(null);
        this.A04.setOnClickListener(null);
        super.A08();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (KU.A02(this)) {
            return;
        }
        try {
            C0792Lb videoView = getVideoView();
            if (videoView == null) {
                return;
            }
            if (videoView.getState() == EnumC0898Pe.A07 || videoView.getState() == EnumC0898Pe.A05 || videoView.getState() == EnumC0898Pe.A06) {
                videoView.A0Y(EnumC0886Os.A05, 11);
            } else if (videoView.getState() == EnumC0898Pe.A0A) {
                videoView.A0b(true, 7);
            }
        } catch (Throwable th) {
            if (A05[5].length() != 25) {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[7] = "YsoDkb8mAWGLBYzRGBa3i8";
            strArr[7] = "YsoDkb8mAWGLBYzRGBa3i8";
            KU.A00(th, this);
        }
    }

    public void setPauseAccessibilityLabel(@Nullable String str) {
        this.A04.setPauseAccessibilityLabel(str);
    }

    public void setPlayAccessibilityLabel(@Nullable String str) {
        this.A04.setPlayAccessibilityLabel(str);
    }
}