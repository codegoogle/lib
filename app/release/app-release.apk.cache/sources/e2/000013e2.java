package com.facebook.ads.redexgen.X;

import android.graphics.Rect;
import android.view.View;

/* loaded from: assets/audience_network.dex */
public class SG implements InterfaceC03372e {
    public final Rect A00 = new Rect();
    public final /* synthetic */ AnonymousClass38 A01;

    public SG(AnonymousClass38 anonymousClass38) {
        this.A01 = anonymousClass38;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03372e
    public final C3B A8s(View view, C3B c3b) {
        C3B A06 = C2u.A06(view, c3b);
        if (A06.A08()) {
            return A06;
        }
        Rect rect = this.A00;
        rect.left = A06.A04();
        rect.top = A06.A06();
        rect.right = A06.A05();
        rect.bottom = A06.A03();
        int childCount = this.A01.getChildCount();
        for (int i = 0; i < childCount; i++) {
            C3B A05 = C2u.A05(this.A01.getChildAt(i), A06);
            rect.left = Math.min(A05.A04(), rect.left);
            rect.top = Math.min(A05.A06(), rect.top);
            rect.right = Math.min(A05.A05(), rect.right);
            rect.bottom = Math.min(A05.A03(), rect.bottom);
        }
        return A06.A07(rect.left, rect.top, rect.right, rect.bottom);
    }
}