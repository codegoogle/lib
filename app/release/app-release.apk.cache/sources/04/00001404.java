package com.facebook.ads.redexgen.X;

import android.view.View;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.Sq  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0985Sq implements M6 {
    public static String[] A01;
    public final WeakReference<AnonymousClass51> A00;

    static {
        A01();
    }

    public static void A01() {
        A01 = new String[]{"JdxG2e87fiw1QxhKtyp6wy4hCZ34K54h", "5l6PiVFmWkFi4LSRmzN6ZIbVVY4PyA16", "qh41B7qjlQhNnOsbjTqj3JtjZfsrgLHf", "L6JKyztUTZrhaC2oSi2AGhNMneOalgfU", "mLvzPn8zSeH", "6Oneq6t5dYPlbDhRy7qxaYTJsizasisX", "J8", "lXMgpjBtmdYXVX4s4nwhe"};
    }

    public C0985Sq(AnonymousClass51 anonymousClass51) {
        this.A00 = new WeakReference<>(anonymousClass51);
    }

    private void A02(AnonymousClass51 anonymousClass51) {
        OV ov;
        RelativeLayout relativeLayout;
        ov = anonymousClass51.A0C;
        if (ov != null) {
            relativeLayout = anonymousClass51.A06;
            relativeLayout.bringChildToFront(ov);
        }
    }

    @Override // com.facebook.ads.redexgen.X.M6
    public final void A3K(View view, int i, RelativeLayout.LayoutParams layoutParams) {
        RelativeLayout relativeLayout;
        AnonymousClass51 anonymousClass51 = this.A00.get();
        if (anonymousClass51 != null) {
            relativeLayout = anonymousClass51.A06;
            relativeLayout.addView(view, i, layoutParams);
            A02(anonymousClass51);
        }
    }

    @Override // com.facebook.ads.redexgen.X.M6
    public final void A3L(View view, RelativeLayout.LayoutParams layoutParams) {
        RelativeLayout relativeLayout;
        AnonymousClass51 anonymousClass51 = this.A00.get();
        if (anonymousClass51 != null) {
            relativeLayout = anonymousClass51.A06;
            relativeLayout.addView(view, layoutParams);
            A02(anonymousClass51);
        }
    }

    @Override // com.facebook.ads.redexgen.X.M6
    public void A3s(String str) {
        if (this.A00.get() != null) {
            this.A00.get().A0E(str);
        }
    }

    @Override // com.facebook.ads.redexgen.X.M6
    public void A3t(String str, C9I c9i) {
        if (this.A00.get() != null) {
            this.A00.get().A0G(str, c9i);
        }
    }

    @Override // com.facebook.ads.redexgen.X.M6
    public final void A7n(String str, C1Q c1q) {
        if (this.A00.get() != null) {
            AnonymousClass51 anonymousClass51 = this.A00.get();
            String[] strArr = A01;
            if (strArr[0].charAt(19) != strArr[1].charAt(19)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[0] = "LaehfLm13EgRqqa58La6JsJDVjNkKsjm";
            strArr2[1] = "U7opStToMRhy5hKGwjx6Oh4Ofub1lgfJ";
            anonymousClass51.A0F(str, c1q);
        }
    }
}