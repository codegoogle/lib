package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzarf extends Exception {
    private zzarf(int i, String str, Throwable th, int i2) {
        super(null, th);
    }

    public static zzarf zza(Exception exc, int i) {
        return new zzarf(1, null, exc, i);
    }

    public static zzarf zzb(IOException iOException) {
        return new zzarf(0, null, iOException, -1);
    }

    public static zzarf zzc(RuntimeException runtimeException) {
        return new zzarf(2, null, runtimeException, -1);
    }
}