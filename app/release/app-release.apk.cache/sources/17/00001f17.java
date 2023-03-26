package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbkg {
    private static final AtomicReference zzb = new AtomicReference();
    private static final AtomicReference zzc = new AtomicReference();
    public static final AtomicBoolean zza = new AtomicBoolean();

    public static zzbke zza() {
        return (zzbke) zzb.get();
    }

    public static zzbkf zzb() {
        return (zzbkf) zzc.get();
    }

    public static void zzc(zzbke zzbkeVar) {
        zzb.set(zzbkeVar);
    }
}