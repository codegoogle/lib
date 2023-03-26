package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfmr extends Exception {
    private final int zza;

    public zzfmr(int i, String str) {
        super(str);
        this.zza = i;
    }

    public final int zza() {
        return this.zza;
    }

    public zzfmr(int i, Throwable th) {
        super(th);
        this.zza = i;
    }
}