package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.9C  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C9C {
    public static C9C A00 = new C9C();

    public static C9C A00() {
        return A00;
    }

    @SuppressLint({"InstanceMethodCanBeStatic"})
    public final C9B A01(C8H c8h, boolean z) {
        return new XJ(c8h, z, new C04265t());
    }

    @SuppressLint({"CatchGeneralException"})
    public final Map<String, String> A02(C8H c8h) {
        try {
            return A01(c8h, false).A69();
        } catch (Throwable th) {
            c8h.A04().A3S(th);
            return AnonymousClass98.A01(c8h);
        }
    }
}