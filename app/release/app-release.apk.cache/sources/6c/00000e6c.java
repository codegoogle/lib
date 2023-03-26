package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.graphics.Paint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.facebook.ads.AdChoicesView;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.internal.api.AdChoicesViewApi;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.4t */
/* loaded from: assets/audience_network.dex */
public final class C04014t implements AdChoicesViewApi {
    public static byte[] A07;
    public static String[] A08;
    public TextView A00;
    public String A01;
    public boolean A02 = false;
    public final float A03 = C0795Le.A01;
    public final AdChoicesView A04;
    public final NativeAdBase A05;
    public final C1080Wh A06;

    static {
        A08();
        A07();
    }

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 108);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A07 = new byte[]{56, 29, 58, 17, 22, 16, 26, 28, 10};
    }

    public static void A08() {
        A08 = new String[]{"gvO42MF", "iIdUVCS", "4ayqEVday587OvHv9KTxdb7b7wSBomyU", "oCu", "csOI", "U1PTH9OJfN", "wm8DLeb0fzTxf", "N58zr1rga3p3lU4dt8STYYI"};
    }

    public C04014t(AdChoicesView adChoicesView, Context context, NativeAdBase nativeAdBase) {
        this.A04 = adChoicesView;
        this.A06 = AnonymousClass57.A02(context);
        this.A05 = nativeAdBase;
    }

    private ImageView A00(JZ jz) {
        ImageView imageView = new ImageView(this.A04.getContext());
        this.A04.addView(imageView);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(Math.round(jz.getWidth() * this.A03), Math.round(jz.getHeight() * this.A03));
        layoutParams.addRule(9);
        layoutParams.addRule(15, -1);
        layoutParams.setMargins(Math.round(this.A03 * 4.0f), Math.round(this.A03 * 2.0f), Math.round(this.A03 * 2.0f), Math.round(this.A03 * 2.0f));
        imageView.setLayoutParams(layoutParams);
        C1267bZ.A0f(jz, imageView, this.A06);
        return imageView;
    }

    public static /* synthetic */ TextView A01(C04014t c04014t) {
        return c04014t.A00;
    }

    public static /* synthetic */ AdChoicesView A02(C04014t c04014t) {
        return c04014t.A04;
    }

    public void A05() {
        Paint paint = new Paint();
        paint.setTextSize(this.A00.getTextSize());
        int round = Math.round(paint.measureText(this.A01) + (this.A03 * 4.0f));
        final int textWidth = this.A04.getWidth();
        final int targetWidth = textWidth - round;
        Animation animation = new Animation() { // from class: com.facebook.ads.redexgen.X.4r
            @Override // android.view.animation.Animation
            public final void applyTransformation(float f, Transformation transformation) {
                int i = textWidth;
                int i2 = (int) (i + ((targetWidth - i) * f));
                C04014t.A02(C04014t.this).getLayoutParams().width = i2;
                C04014t.A02(C04014t.this).requestLayout();
                C04014t.A01(C04014t.this).getLayoutParams().width = i2 - targetWidth;
                C04014t.A01(C04014t.this).requestLayout();
            }

            @Override // android.view.animation.Animation
            public final boolean willChangeBounds() {
                return true;
            }
        };
        animation.setAnimationListener(new Animation.AnimationListener() { // from class: com.facebook.ads.redexgen.X.4s
            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationEnd(Animation animation2) {
                C04014t.A0C(C04014t.this, false);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationRepeat(Animation animation2) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationStart(Animation animation2) {
            }
        });
        animation.setDuration(300L);
        animation.setFillAfter(true);
        this.A04.startAnimation(animation);
    }

    public void A06() {
        Paint paint = new Paint();
        paint.setTextSize(this.A00.getTextSize());
        int round = Math.round(paint.measureText(this.A01) + (this.A03 * 4.0f));
        final int textWidth = this.A04.getWidth();
        final int startWidth = textWidth + round;
        this.A02 = true;
        Animation expandAnimation = new Animation() { // from class: com.facebook.ads.redexgen.X.4p
            @Override // android.view.animation.Animation
            public final void applyTransformation(float f, Transformation transformation) {
                int i = textWidth;
                int i2 = (int) (i + ((startWidth - i) * f));
                C04014t.A02(C04014t.this).getLayoutParams().width = i2;
                C04014t.A02(C04014t.this).requestLayout();
                C04014t.A01(C04014t.this).getLayoutParams().width = i2 - textWidth;
                C04014t.A01(C04014t.this).requestLayout();
            }

            @Override // android.view.animation.Animation
            public final boolean willChangeBounds() {
                return true;
            }
        };
        expandAnimation.setAnimationListener(new animation.Animation$AnimationListenerC03984q(this));
        expandAnimation.setDuration(300L);
        expandAnimation.setFillAfter(true);
        this.A04.startAnimation(expandAnimation);
    }

    public static /* synthetic */ boolean A0C(C04014t c04014t, boolean z) {
        c04014t.A02 = z;
        return z;
    }

    @Override // com.facebook.ads.internal.api.AdChoicesViewApi
    public final void initialize(boolean z, @Nullable NativeAdLayout nativeAdLayout) {
        C1267bZ.A0J(this.A05.getInternalNativeAd()).A1L(nativeAdLayout);
        RG A0v = C1267bZ.A0J(this.A05.getInternalNativeAd()).A0v();
        if (A0v != null && A0v.A0g() && !A0v.A0e()) {
            this.A04.setVisibility(8);
            return;
        }
        this.A01 = this.A05.getAdChoicesText();
        if (TextUtils.isEmpty(this.A01)) {
            String[] strArr = A08;
            if (strArr[7].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[4] = "ttxb";
            strArr2[3] = "x8K";
            this.A01 = A04(0, 9, 21);
        }
        JZ adChoicesIcon = C1267bZ.A0J(this.A05.getInternalNativeAd()).getAdChoicesIcon();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        this.A04.setOnTouchListener(new View.OnTouchListener() { // from class: com.facebook.ads.redexgen.X.4o
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean z2;
                NativeAdBase nativeAdBase;
                if (motionEvent.getAction() != 0) {
                    return false;
                }
                z2 = C04014t.this.A02;
                if (z2) {
                    nativeAdBase = C04014t.this.A05;
                    C1267bZ.A0J(nativeAdBase.getInternalNativeAd()).A1D();
                    return true;
                }
                C04014t.this.A06();
                return true;
            }
        });
        this.A00 = new TextView(this.A04.getContext());
        this.A04.addView(this.A00);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        if (z && adChoicesIcon != null) {
            ImageView adChoicesImageView = A00(adChoicesIcon);
            layoutParams2.addRule(11, adChoicesImageView.getId());
            if (A08[2].charAt(8) == 'Y') {
                throw new RuntimeException();
            }
            String[] strArr3 = A08;
            strArr3[5] = "acVQqvBAW9";
            strArr3[5] = "acVQqvBAW9";
            layoutParams2.width = 0;
            layoutParams.width = Math.round((adChoicesIcon.getWidth() + 4) * this.A03);
            layoutParams.height = Math.round((adChoicesIcon.getHeight() + 2) * this.A03);
            this.A02 = false;
        } else {
            this.A02 = true;
        }
        this.A04.setLayoutParams(layoutParams);
        layoutParams2.addRule(15, -1);
        this.A00.setLayoutParams(layoutParams2);
        this.A00.setSingleLine();
        this.A00.setText(this.A01);
        this.A00.setTextSize(10.0f);
        this.A00.setTextColor(-4341303);
        LC.A04(this.A04, LC.A07);
        LC.A04(this.A00, LC.A07);
    }
}