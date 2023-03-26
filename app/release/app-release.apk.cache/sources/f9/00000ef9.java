package com.facebook.ads.redexgen.X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.DisplayMetrics;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.7B */
/* loaded from: assets/audience_network.dex */
public final class C7B extends K6 {
    public final Paint A00;
    public final C1080Wh A01;
    @Nullable
    public final JL A02;
    public final K4 A03;
    public final AbstractC0766Jy A04;
    public final AbstractC0754Jk A05;
    public final PC A06;

    public C7B(C1080Wh c1080Wh, boolean z, @Nullable JL jl) {
        super(c1080Wh);
        this.A04 = new AbstractC0766Jy() { // from class: com.facebook.ads.redexgen.X.7P
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C9K
            /* renamed from: A00 */
            public final void A04(C04747t c04747t) {
                C7B.A06(C7B.this).setChecked(true);
            }
        };
        this.A05 = new AbstractC0754Jk() { // from class: com.facebook.ads.redexgen.X.7O
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C9K
            /* renamed from: A00 */
            public final void A04(C0761Jt c0761Jt) {
                C7B.A06(C7B.this).setChecked(false);
            }
        };
        this.A03 = new K4() { // from class: com.facebook.ads.redexgen.X.7N
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C9K
            /* renamed from: A00 */
            public final void A04(C7v c7v) {
                C7B.A06(C7B.this).setChecked(true);
            }
        };
        this.A02 = jl;
        this.A01 = c1080Wh;
        this.A06 = new PC(c1080Wh, z);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) (displayMetrics.density * 23.76d), (int) (displayMetrics.density * 23.76d));
        layoutParams.addRule(13);
        this.A06.setLayoutParams(layoutParams);
        this.A06.setChecked(true);
        this.A06.setClickable(false);
        this.A00 = new Paint();
        this.A00.setStyle(Paint.Style.FILL);
        if (z) {
            this.A00.setColor(-1728053248);
        } else {
            this.A00.setColor(-1);
            this.A00.setAlpha(204);
        }
        C0795Le.A0P(this, 0);
        addView(this.A06);
        setGravity(17);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams((int) (displayMetrics.density * 72.0d), (int) (displayMetrics.density * 72.0d));
        layoutParams2.addRule(13);
        setLayoutParams(layoutParams2);
    }

    public static /* synthetic */ PC A06(C7B c7b) {
        return c7b.A06;
    }

    @Override // com.facebook.ads.redexgen.X.K6
    public final void A07() {
        super.A07();
        if (getVideoView() != null) {
            getVideoView().getEventBus().A04(this.A04, this.A05, this.A03);
        }
        setOnClickListener(new P9(this));
    }

    @Override // com.facebook.ads.redexgen.X.K6
    public final void A08() {
        setOnClickListener(null);
        if (getVideoView() != null) {
            getVideoView().getEventBus().A05(this.A03, this.A05, this.A04);
        }
        super.A08();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int centerX = Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        int i = centerX / 2;
        canvas.drawCircle(getPaddingLeft() + i, getPaddingTop() + (centerX / 2), i, this.A00);
        super.onDraw(canvas);
    }
}