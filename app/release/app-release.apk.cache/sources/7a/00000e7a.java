package com.facebook.ads.redexgen.X;

import android.app.Activity;
import android.content.Context;

/* renamed from: com.facebook.ads.redexgen.X.57  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass57 {
    public static C0S A00(Context context, C8J c8j) {
        C1081Wi sdkContext = A07(context);
        C0V A6K = c8j.A6K(sdkContext);
        if (A6K != null) {
            return A6K.A8R();
        }
        return new R4();
    }

    public static C1080Wh A01(Activity activity) {
        return new C1080Wh(activity, A08(), A00(activity, A08()));
    }

    public static C1080Wh A02(Context context) {
        return new C1080Wh(context, A08(), new R4());
    }

    public static C1080Wh A03(Context context) {
        return new C1080Wh(context, A08(), A00(context, A08()));
    }

    public static C1080Wh A04(Context context) {
        if (J8.A0l(context)) {
            return new C1080Wh(context, A08(), A00(context, A08()));
        }
        return A02(context);
    }

    public static C1080Wh A05(Context context) {
        return new C1080Wh(context, A08(), A00(context, A08()));
    }

    public static C0591Cv A06(Context context) {
        return new C0591Cv(context, A08(), A08().A6K(A07(context)));
    }

    public static C1081Wi A07(Context context) {
        return new C1081Wi(context, A08());
    }

    public static synchronized C8J A08() {
        XG A02;
        synchronized (AnonymousClass57.class) {
            A02 = XG.A02();
        }
        return A02;
    }
}