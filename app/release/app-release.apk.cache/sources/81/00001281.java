package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeBannerAd;
import java.util.ArrayList;

/* loaded from: assets/audience_network.dex */
public final class MX extends LinearLayout implements InterfaceC0876Oi {
    public final NativeBannerAd A00;
    public final C1080Wh A01;
    public final ArrayList<View> A02;
    public static final int A04 = (int) (C0795Le.A01 * 42.0f);
    public static final int A03 = (int) (C0795Le.A01 * 48.0f);
    public static final int A05 = (int) (C0795Le.A01 * 54.0f);
    public static final int A07 = (int) (C0795Le.A01 * 4.0f);
    public static final int A06 = (int) (C0795Le.A01 * 8.0f);

    public MX(C1080Wh c1080Wh, NativeBannerAd nativeBannerAd, C0745Jb c0745Jb, EnumC0746Jc enumC0746Jc, MediaView mediaView, AdOptionsView adOptionsView) {
        super(c1080Wh);
        LinearLayout.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        this.A02 = new ArrayList<>();
        this.A00 = nativeBannerAd;
        this.A01 = c1080Wh;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        int A00 = A00(enumC0746Jc);
        C0848Ng c0848Ng = new C0848Ng(this.A01);
        c0848Ng.setFullCircleCorners(true);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(A00, A00);
        layoutParams3.gravity = 16;
        c0848Ng.addView(mediaView, new LinearLayout.LayoutParams(-1, -1));
        linearLayout.addView(c0848Ng, layoutParams3);
        C0873Of c0873Of = new C0873Of(c1080Wh, this.A00, enumC0746Jc, c0745Jb, adOptionsView);
        c0873Of.setPadding(A06, 0, 0, 0);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(0, -2);
        layoutParams4.weight = 1.0f;
        layoutParams4.gravity = 16;
        linearLayout.addView(c0873Of, layoutParams4);
        if (enumC0746Jc == EnumC0746Jc.A0A) {
            int i = A07;
            setPadding(i, i, i, i);
            setOrientation(0);
            layoutParams = new LinearLayout.LayoutParams(0, -1);
            layoutParams2 = new LinearLayout.LayoutParams(-2, -1);
            linearLayout.setPadding(0, 0, A07, 0);
        } else {
            int i2 = A06;
            setPadding(i2, i2, i2, i2);
            setOrientation(1);
            layoutParams = new LinearLayout.LayoutParams(-1, 0);
            layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
            linearLayout.setPadding(0, 0, 0, A06);
        }
        layoutParams.weight = 1.0f;
        addView(linearLayout, layoutParams);
        TextView textView = new TextView(getContext());
        int iconSize = A06;
        int i3 = A07;
        textView.setPadding(iconSize, i3, iconSize, i3);
        c0745Jb.A05(textView);
        textView.setText(this.A00.getAdCallToAction());
        addView(textView, layoutParams2);
        this.A02.add(mediaView);
        this.A02.add(textView);
    }

    public static int A00(EnumC0746Jc enumC0746Jc) {
        int i = C0874Og.A00[enumC0746Jc.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return A05;
            }
            return A03;
        }
        return A04;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0876Oi
    public View getView() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0876Oi
    public ArrayList<View> getViewsForInteraction() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0876Oi
    public final void unregisterView() {
        this.A00.unregisterView();
    }
}