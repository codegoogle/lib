package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: com.facebook.ads.redexgen.X.Sk  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0979Sk extends C2Y {
    public static String[] A02;
    public final C2Y A00 = new C0978Sj(this);
    public final ES A01;

    static {
        A00();
    }

    public static void A00() {
        A02 = new String[]{"kCJseLSqSIrXu4CFjUZgH7qP37OfZeHD", "xEAmwUG5TGVzyoKH1PTTnmgJSds6zi0t", "yfye5wiKddzXjwKpYSAHRZ10SdbOyGIS", "FmBYeFx3U0BhjOzbepjZtX", "pFd99JFbVQiCxR8NKRmLZvqZPwpJ8hMq", "9sA", "zOMSQIOQC2uzgyYA4i3GoXbtL5yC1N4Y", "6JUJmYz6"};
    }

    public C0979Sk(ES es) {
        this.A01 = es;
    }

    @Override // com.facebook.ads.redexgen.X.C2Y
    public final void A07(View view, AccessibilityEvent accessibilityEvent) {
        super.A07(view, accessibilityEvent);
        accessibilityEvent.setClassName(ES.class.getName());
        if ((view instanceof ES) && !A0B()) {
            ES es = (ES) view;
            if (es.getLayoutManager() != null) {
                es.getLayoutManager().A1y(accessibilityEvent);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C2Y
    public final void A08(View view, C3J c3j) {
        super.A08(view, c3j);
        c3j.A0P(ES.class.getName());
        if (!A0B() && this.A01.getLayoutManager() != null) {
            this.A01.getLayoutManager().A1G(c3j);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C2Y
    public final boolean A09(View view, int i, Bundle bundle) {
        if (super.A09(view, i, bundle)) {
            String[] strArr = A02;
            if (strArr[2].charAt(11) != strArr[0].charAt(11)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[4] = "nByhcE3HAON4xHhAaRL71J2smf2uyoDS";
            strArr2[4] = "nByhcE3HAON4xHhAaRL71J2smf2uyoDS";
            return true;
        } else if (!A0B() && this.A01.getLayoutManager() != null) {
            C4F layoutManager = this.A01.getLayoutManager();
            if (A02[5].length() != 3) {
                throw new RuntimeException();
            }
            String[] strArr3 = A02;
            strArr3[7] = "ZdbAAVtg";
            strArr3[3] = "rBKlzqXoYmUf6BYv0O8fT1";
            return layoutManager.A1a(i, bundle);
        } else {
            return false;
        }
    }

    public final C2Y A0A() {
        return this.A00;
    }

    public final boolean A0B() {
        return this.A01.A1u();
    }
}