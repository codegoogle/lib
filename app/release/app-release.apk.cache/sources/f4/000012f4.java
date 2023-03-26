package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/* loaded from: assets/audience_network.dex */
public final class OP extends LinearLayout {
    public static final int A04 = (int) (C0795Le.A01 * 32.0f);
    public static final int A05 = (int) (C0795Le.A01 * 8.0f);
    public TextView A00;
    public TextView A01;
    public C0847Nf A02;
    public final C1080Wh A03;

    public OP(C1080Wh c1080Wh) {
        super(c1080Wh);
        this.A03 = c1080Wh;
        A00(c1080Wh);
    }

    private final void A00(C1080Wh c1080Wh) {
        setGravity(16);
        this.A02 = new C0847Nf(c1080Wh);
        this.A02.setFullCircleCorners(true);
        int i = A04;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
        layoutParams.setMargins(0, 0, A05, 0);
        addView(this.A02, layoutParams);
        LinearLayout linearLayout = new LinearLayout(c1080Wh);
        linearLayout.setOrientation(1);
        this.A00 = new TextView(c1080Wh);
        ViewGroup.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        C0795Le.A0b(this.A00, true, 16);
        this.A00.setEllipsize(TextUtils.TruncateAt.END);
        this.A00.setSingleLine(true);
        this.A01 = new TextView(c1080Wh);
        C0795Le.A0b(this.A01, false, 14);
        linearLayout.addView(this.A00);
        linearLayout.addView(this.A01);
        addView(linearLayout, layoutParams2);
    }

    public final void A01(int i, int i2) {
        this.A00.setTextColor(i);
        this.A01.setTextColor(i2);
    }

    public void setPageDetails(C1Q c1q) {
        AsyncTaskC1091Ws asyncTaskC1091Ws = new AsyncTaskC1091Ws(this.A02, this.A03);
        int i = A04;
        asyncTaskC1091Ws.A06(i, i);
        asyncTaskC1091Ws.A08(c1q.A01());
        this.A00.setText(c1q.A02());
        this.A01.setText(c1q.A03());
    }
}