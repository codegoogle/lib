package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.view.Display;
import android.view.View;
import androidx.annotation.NonNull;

/* renamed from: com.facebook.ads.redexgen.X.2u  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C2u {
    public static final C03522t A00;

    static {
        if (Build.VERSION.SDK_INT >= 26) {
            A00 = new C0P() { // from class: com.facebook.ads.redexgen.X.04
            };
        } else if (Build.VERSION.SDK_INT >= 24) {
            A00 = new C0P();
        } else if (Build.VERSION.SDK_INT >= 23) {
            A00 = new C0Z();
        } else if (Build.VERSION.SDK_INT >= 21) {
            A00 = new C02820b();
        } else if (Build.VERSION.SDK_INT >= 19) {
            A00 = new AnonymousClass18();
        } else if (Build.VERSION.SDK_INT >= 18) {
            A00 = new AnonymousClass29();
        } else if (Build.VERSION.SDK_INT >= 17) {
            A00 = new C3W();
        } else if (Build.VERSION.SDK_INT >= 16) {
            A00 = new C0631El();
        } else if (Build.VERSION.SDK_INT >= 15) {
            A00 = new SF();
        } else {
            A00 = new C03522t();
        }
    }

    public static int A00(View view) {
        return A00.A04(view);
    }

    public static int A01(View view) {
        return A00.A05(view);
    }

    public static int A02(View view) {
        return A00.A06(view);
    }

    public static int A03(View view) {
        return A00.A07(view);
    }

    public static Display A04(@NonNull View view) {
        return A00.A08(view);
    }

    public static C3B A05(View view, C3B c3b) {
        return A00.A09(view, c3b);
    }

    public static C3B A06(View view, C3B c3b) {
        return A00.A0A(view, c3b);
    }

    public static void A07(View view) {
        A00.A0B(view);
    }

    public static void A08(@NonNull View view) {
        A00.A0C(view);
    }

    public static void A09(View view, int i) {
        A00.A0D(view, i);
    }

    public static void A0A(View view, C2Y c2y) {
        A00.A0E(view, c2y);
    }

    public static void A0B(View view, InterfaceC03372e interfaceC03372e) {
        A00.A0F(view, interfaceC03372e);
    }

    public static void A0C(View view, Runnable runnable) {
        A00.A0G(view, runnable);
    }

    public static void A0D(View view, Runnable runnable, long j) {
        A00.A0H(view, runnable, j);
    }

    public static boolean A0E(View view) {
        return A00.A0K(view);
    }

    public static boolean A0F(View view) {
        return A00.A0I(view);
    }
}