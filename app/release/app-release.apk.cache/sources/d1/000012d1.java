package com.facebook.ads.redexgen.X;

import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.p7700g.p99005.zg2;
import java.util.HashMap;

/* renamed from: com.facebook.ads.redexgen.X.Np  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0857Np {
    public static String[] A00;

    static {
        A01();
    }

    public static void A01() {
        A00 = new String[]{"zHQaRI8Z04iZfuq60cOZ3MtOUQtnyLXk", "Py81lTfXTPvOohagzwztlFMwKgIeaa04", "ZBx", "ff4Sljy7OS0rEQC0yVPpTgSrr8dBXGgO", "WJ7E7dTZMlxiqC9ofw7stZL7dYzOgEyn", "lEp0yqe8iFuZgqtiF5MEL7dQIxoaDf7o", "1LQBU", "K3MGC9Pem9CSlPJADsZARPOkTW1wXgVW"};
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static AbstractC0856No A00(final C0860Ns c0860Ns, @Nullable Bundle bundle, boolean z) {
        AbstractC0856No su;
        AnonymousClass19 A0M = c0860Ns.A04().A0M();
        double A002 = C0855Nn.A00(A0M);
        boolean renderFullscreen = c0860Ns.A04().A0M().A0M();
        final boolean A05 = C0855Nn.A05(c0860Ns.A00(), c0860Ns.A01(), A002);
        AbstractC02860f A003 = C02870g.A00(c0860Ns.A05(), c0860Ns.A06(), "", Uri.parse(c0860Ns.A04().A0M().A0G().A04()), new HashMap());
        if (renderFullscreen) {
            boolean isWatchAndBrowse = A003 instanceof F1;
            if (isWatchAndBrowse) {
                su = new C0932Qm(c0860Ns);
                if (z) {
                    String A0Q = c0860Ns.A04().A0Q();
                    if (A00[2].length() != 3) {
                        throw new RuntimeException();
                    }
                    String[] strArr = A00;
                    strArr[5] = "IYiemLW0pAZJelR9U10I0UE8BphOsSCr";
                    strArr[3] = "HZnaFTaa8UnZev8t8IWfBJ4wHjAxjheL";
                    su.A0b(A0M, A0Q, A002, bundle);
                }
                return su;
            }
        }
        if (!TextUtils.isEmpty(A0M.A0E().A08())) {
            su = new C05029a(c0860Ns);
        } else if (TextUtils.isEmpty(A0M.A0E().A08()) && J8.A1T(c0860Ns.A05())) {
            su = new Si(c0860Ns, A05) { // from class: com.facebook.ads.redexgen.X.9h
                public static final int A02 = Resources.getSystem().getDisplayMetrics().widthPixels;
                public final View A00;
                public final boolean A01;

                {
                    super(c0860Ns, true);
                    this.A01 = A05;
                    this.A00 = c0860Ns.A02();
                    A0f();
                    if (this.A01) {
                        addView(c0860Ns.A02(), new RelativeLayout.LayoutParams(-1, -1));
                    } else {
                        FrameLayout frameLayout = new FrameLayout(c0860Ns.A05());
                        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                        layoutParams.addRule(2, getAdDetailsView().getId());
                        frameLayout.setLayoutParams(layoutParams);
                        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
                        layoutParams2.gravity = 17;
                        layoutParams2.setMargins(AbstractC0856No.A09, 0, AbstractC0856No.A09, 0);
                        frameLayout.addView(this.A00, layoutParams2);
                        addView(frameLayout);
                    }
                    getAdDetailsView().bringToFront();
                }

                @Override // com.facebook.ads.redexgen.X.AbstractC0856No
                public final boolean A0M() {
                    return this.A01 && super.A0P();
                }

                @Override // com.facebook.ads.redexgen.X.AbstractC0856No
                public final boolean A0P() {
                    return this.A01 && super.A0P();
                }

                @Override // com.facebook.ads.redexgen.X.Si, com.facebook.ads.redexgen.X.AbstractC0856No
                public final void A0b(AnonymousClass19 anonymousClass19, String str, double d, @Nullable Bundle bundle2) {
                    super.A0b(anonymousClass19, str, d, bundle2);
                    if (!this.A01 && d > zg2.s) {
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) ((A02 - (AbstractC0856No.A09 * 2)) / d));
                        layoutParams.gravity = 17;
                        layoutParams.setMargins(AbstractC0856No.A09, 0, AbstractC0856No.A09, 0);
                        this.A00.setLayoutParams(layoutParams);
                    }
                }

                @Override // com.facebook.ads.redexgen.X.AbstractC0856No
                public final boolean A0c() {
                    return this.A01;
                }
            };
        } else if (A05) {
            su = new SV(c0860Ns, c0860Ns.A00() == 2);
        } else {
            su = new SU(c0860Ns, C0855Nn.A03(A002));
        }
        if (z) {
        }
        return su;
    }
}