package com.facebook.ads.redexgen.X;

import android.content.ContentResolver;
import android.content.Context;
import android.util.DisplayMetrics;

/* loaded from: assets/audience_network.dex */
public final class V7 extends C6Z {
    public ContentResolver A00;
    public DisplayMetrics A01;

    public V7(Context context, C04325z c04325z) {
        super(context, c04325z);
        this.A01 = context.getResources().getDisplayMetrics();
        this.A00 = context.getContentResolver();
    }

    public final InterfaceC04416i A0H() {
        return new V6(this);
    }

    public final InterfaceC04416i A0I() {
        return new V3(this);
    }

    public final InterfaceC04416i A0J() {
        return new V4(this);
    }

    public final InterfaceC04416i A0K() {
        return new V2(this);
    }

    public final InterfaceC04416i A0L() {
        return new V5(this);
    }
}