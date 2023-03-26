package com.facebook.ads.redexgen.X;

import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.9z  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C05279z extends SX {
    public final /* synthetic */ C05259x A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05279z(C05259x c05259x, C1080Wh c1080Wh) {
        super(c1080Wh);
        this.A00 = c05259x;
    }

    @Override // com.facebook.ads.redexgen.X.SX
    public final float A0K(DisplayMetrics displayMetrics) {
        float f;
        f = this.A00.A00;
        return f / displayMetrics.densityDpi;
    }

    @Override // com.facebook.ads.redexgen.X.SX
    public final int A0L() {
        return -1;
    }

    @Override // com.facebook.ads.redexgen.X.SX
    public final int A0P(View view, int left) {
        int i;
        C4F A09 = A09();
        if (!A09.A25()) {
            return 0;
        }
        C4G c4g = (C4G) view.getLayoutParams();
        int start = A09.A0l(view) - c4g.leftMargin;
        int end = A09.A0o(view) + c4g.rightMargin;
        int A0O = A0O(start, end, A09.A0f(), A09.A0i() - A09.A0g(), left);
        i = this.A00.A02;
        return A0O + i;
    }

    @Override // com.facebook.ads.redexgen.X.SX
    public final PointF A0Q(int i) {
        return this.A00.A45(i);
    }
}