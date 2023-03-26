package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.ViewGroup;
import com.p7700g.p99005.sr;

/* renamed from: com.facebook.ads.redexgen.X.Nm  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0854Nm {
    public static final int A01 = C2G.A01(sr.t, 115);
    public static final int A00 = C2G.A01(-1, 0);

    public static void A00(C1080Wh c1080Wh, ViewGroup viewGroup, String str) {
        new AsyncTaskC1091Ws(viewGroup, c1080Wh).A08(str);
        View view = new View(c1080Wh);
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        C0795Le.A0V(view, c1080Wh);
        viewGroup.addView(view, 0);
    }
}