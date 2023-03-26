package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.6k  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C04436k {
    public final Map<Integer, AnonymousClass64<AbstractC04566x>> A00;
    @Nullable
    public static C04436k A02 = null;
    public static long A01 = 0;

    public C04436k(Map<Integer, AnonymousClass64<AbstractC04566x>> map) {
        this.A00 = map;
    }

    public static synchronized long A00() {
        long j;
        synchronized (C04436k.class) {
            j = A01;
        }
        return j;
    }

    @SuppressLint({"UseSparseArrays"})
    public static C04436k A01() {
        if (A02 == null) {
            A02 = new C04436k(Collections.synchronizedMap(new HashMap()));
        }
        return A02;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.64 != com.facebook.ads.internal.botdetection.interval.buffer.CircularBuffer<com.facebook.ads.internal.botdetection.signals.model.signal_value.SignalValueTypeDef> */
    private synchronized void A02(AnonymousClass64<AbstractC04566x> anonymousClass64, int i) {
        int i2 = 0;
        boolean z = false;
        if (anonymousClass64.A01() == 0) {
            z = true;
            i2 = anonymousClass64.A02().A06();
        }
        int updatedSize = i - i2;
        A01 += (z ? 0 : 4) + updatedSize;
    }

    @SuppressLint({"PublicMethodReturnMutableCollection"})
    public final Map<Integer, AnonymousClass64<AbstractC04566x>> A03() {
        return this.A00;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.64 != com.facebook.ads.internal.botdetection.interval.buffer.CircularBuffer<com.facebook.ads.internal.botdetection.signals.model.signal_value.SignalValueTypeDef> */
    public final synchronized void A04(int i, AnonymousClass64<AbstractC04566x> anonymousClass64, int i2) {
        this.A00.put(Integer.valueOf(i), anonymousClass64);
        A02(anonymousClass64, i2);
    }
}