package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import androidx.annotation.Nullable;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: assets/audience_network.dex */
public abstract class KP implements Runnable {
    public static final AtomicReference<Throwable> A00 = new AtomicReference<>();

    public abstract void A04();

    @Nullable
    public static Throwable A00() {
        return A00.get();
    }

    @Override // java.lang.Runnable
    @SuppressLint({"CatchGeneralException"})
    public final void run() {
        try {
            A04();
        } catch (Throwable th) {
            A00.set(th);
            throw th;
        }
    }
}