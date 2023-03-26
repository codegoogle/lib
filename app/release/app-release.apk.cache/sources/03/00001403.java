package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.internal.api.AdComponentViewApi;
import com.facebook.ads.internal.api.AdOptionsViewApi;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Sp  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0984Sp extends AnonymousClass56 implements AdOptionsViewApi {
    public static byte[] A03;
    public static final int A04;
    public static final int A05;
    public final ImageView A00;
    public final ImageView A01;
    public final AdOptionsView A02;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 125);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{91, 108, 121, 102, 123, 125, 41, 72, 109};
    }

    static {
        A02();
        A04 = (int) (C0795Le.A01 * 23.0f);
        A05 = (int) (C0795Le.A01 * 4.0f);
    }

    public C0984Sp(Context context, NativeAdBase nativeAdBase, @Nullable NativeAdLayout nativeAdLayout, AdOptionsView.Orientation orientation, int i, AdOptionsView adOptionsView) {
        this.A02 = adOptionsView;
        LinearLayout linearLayout = new LinearLayout(context);
        this.A02.addView(linearLayout);
        linearLayout.setOrientation(orientation == AdOptionsView.Orientation.HORIZONTAL ? 0 : 1);
        this.A01 = A00(EnumC0803Lm.DEFAULT_INFO_ICON);
        this.A00 = A00(EnumC0803Lm.AD_CHOICES_ICON);
        this.A00.setContentDescription(A01(0, 9, 116));
        linearLayout.addView(this.A01);
        linearLayout.addView(this.A00);
        setIconSizeDp(i);
        setIconColor(-10459280);
        final C1267bZ A0J = C1267bZ.A0J(nativeAdBase.getInternalNativeAd());
        A0J.A1L(nativeAdLayout);
        A0J.A1M(this);
        RG A0v = A0J.A0v();
        if (A0v != null && A0v.A0g() && !A0v.A0e()) {
            linearLayout.setVisibility(8);
            return;
        }
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.4u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (KU.A02(this)) {
                    return;
                }
                try {
                    A0J.A1D();
                } catch (Throwable th) {
                    KU.A00(th, this);
                }
            }
        });
        LC.A04(this.A02, LC.A0B);
    }

    public C0984Sp(Context context, NativeAdBase nativeAdBase, @Nullable NativeAdLayout nativeAdLayout, AdOptionsView adOptionsView) {
        this(context, nativeAdBase, nativeAdLayout, AdOptionsView.Orientation.HORIZONTAL, 23, adOptionsView);
    }

    private ImageView A00(EnumC0803Lm enumC0803Lm) {
        ImageView imageView = new ImageView(this.A02.getContext());
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        int i = A05;
        imageView.setPadding(i, i, i, i);
        imageView.setImageBitmap(C0804Ln.A00(enumC0803Lm));
        return imageView;
    }

    public final void A03(EnumC0803Lm enumC0803Lm) {
        this.A01.setImageBitmap(C0804Ln.A00(enumC0803Lm));
    }

    @Override // com.facebook.ads.internal.api.AdComponentViewApiProvider
    public final AdComponentViewApi getAdComponentViewApi() {
        return this;
    }

    @Override // com.facebook.ads.internal.api.AdOptionsViewApi
    public final void setIconColor(int i) {
        this.A01.setColorFilter(i);
        this.A00.setColorFilter(i);
    }

    @Override // com.facebook.ads.internal.api.AdOptionsViewApi
    public final void setIconSizeDp(int i) {
        int max = Math.max(A04, (int) (C0795Le.A01 * i));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(max, max);
        this.A01.setLayoutParams(layoutParams);
        this.A00.setLayoutParams(layoutParams);
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass56, com.facebook.ads.internal.api.AdComponentView
    public final void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        layoutParams.width = -2;
        layoutParams.height = -2;
        super.setLayoutParams(layoutParams);
    }

    @Override // com.facebook.ads.internal.api.AdOptionsViewApi
    public final void setSingleIcon(boolean z) {
        C0795Le.A0Q(this.A01, z ? 8 : 0);
    }
}