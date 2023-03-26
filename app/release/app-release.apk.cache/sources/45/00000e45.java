package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* renamed from: com.facebook.ads.redexgen.X.4G  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C4G extends ViewGroup.MarginLayoutParams {
    public C4X A00;
    public boolean A01;
    public boolean A02;
    public final Rect A03;

    public C4G(int i, int i2) {
        super(i, i2);
        this.A03 = new Rect();
        this.A01 = true;
        this.A02 = false;
    }

    public C4G(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A03 = new Rect();
        this.A01 = true;
        this.A02 = false;
    }

    public C4G(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.A03 = new Rect();
        this.A01 = true;
        this.A02 = false;
    }

    public C4G(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.A03 = new Rect();
        this.A01 = true;
        this.A02 = false;
    }

    public C4G(C4G c4g) {
        super((ViewGroup.LayoutParams) c4g);
        this.A03 = new Rect();
        this.A01 = true;
        this.A02 = false;
    }

    public final int A00() {
        return this.A00.A0J();
    }

    public final boolean A01() {
        return this.A00.A0g();
    }

    public final boolean A02() {
        return this.A00.A0d();
    }

    public final boolean A03() {
        return this.A00.A0c();
    }
}