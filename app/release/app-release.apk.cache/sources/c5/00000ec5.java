package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.os.SystemClock;
import android.view.OrientationEventListener;
import javax.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.6L  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C6L {
    @Nullable
    public static OrientationEventListener A02;
    public static String[] A03;
    public final C6J A00;
    public final EnumC04456m A01;

    static {
        A01();
    }

    public static void A01() {
        A03 = new String[]{"ciYSwpO57ig7", "AgXvWM7vBAP276b3F", "h3L2uX2266ICJ0F8mxeOzYeo", "sn1Bi96p4g3FJ3lBwfTgs4qOj566", "nEyUaJreiz", "9f6cxckTFidZYnVMHRSclm", "9nbfinSPxnf3N791gNAhDrqxfgbV", "EACetWGUN5dpVn0xkHaZeeKDOZ"};
    }

    public C6L(C6J c6j, EnumC04456m enumC04456m) {
        this.A00 = c6j;
        this.A01 = enumC04456m;
    }

    public final synchronized void A02() {
        if (A02 != null) {
            A02.disable();
            A02 = null;
        }
    }

    public final synchronized void A03(final Context context) {
        if (A02 == null) {
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            final C04546v c04546v = this.A01 == EnumC04456m.A0G ? null : new C04546v(context == null ? "" : context.getPackageName());
            A02 = new OrientationEventListener(context, 3) { // from class: com.facebook.ads.redexgen.X.6K
                @Override // android.view.OrientationEventListener
                public final void onOrientationChanged(int i) {
                    C6J c6j;
                    WV wv = new WV(elapsedRealtime, c04546v, i);
                    c6j = C6L.this.A00;
                    c6j.A02(wv, C6I.A0A);
                }
            };
            A02.enable();
            return;
        }
        String[] strArr = A03;
        if (strArr[7].length() == strArr[1].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A03;
        strArr2[7] = "WLHhaS1yyOUNNZKQvAoQ3Zw3xj";
        strArr2[1] = "prMYx6h4YCDadOhBb";
    }
}