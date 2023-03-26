package com.facebook.ads.redexgen.X;

import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.NativeAd;

/* renamed from: com.facebook.ads.redexgen.X.Oj  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0877Oj extends LinearLayout {
    public static final int A00 = (int) (C0795Le.A01 * 32.0f);
    public static final int A01 = (int) (C0795Le.A01 * 8.0f);

    public C0877Oj(C1080Wh c1080Wh, NativeAd nativeAd, C0745Jb c0745Jb, C0847Nf c0847Nf, AdOptionsView adOptionsView) {
        super(c1080Wh);
        setOrientation(0);
        c0847Nf.setFullCircleCorners(true);
        int i = A00;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
        layoutParams.gravity = 16;
        layoutParams.setMargins(0, 0, A01, 0);
        addView(c0847Nf, layoutParams);
        TextView textView = new TextView(c1080Wh);
        c0745Jb.A08(textView);
        textView.setMaxLines(1);
        textView.setText(nativeAd.getAdvertiserName());
        TextView textView2 = new TextView(c1080Wh);
        c0745Jb.A06(textView2);
        textView2.setMaxLines(1);
        textView2.setText(nativeAd.getSponsoredTranslation());
        LinearLayout linearLayout = new LinearLayout(c1080Wh);
        linearLayout.setOrientation(1);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2);
        layoutParams2.weight = 1.0f;
        layoutParams2.gravity = 16;
        linearLayout.addView(textView, new LinearLayout.LayoutParams(-1, -2));
        linearLayout.addView(textView2, new LinearLayout.LayoutParams(-1, -2));
        addView(linearLayout, layoutParams2);
        addView(adOptionsView, new LinearLayout.LayoutParams(-2, -2));
    }
}