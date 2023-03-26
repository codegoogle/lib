package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzsp implements zztq {
    private final zztq zza;
    private final long zzb;

    public zzsp(zztq zztqVar, long j) {
        this.zza = zztqVar;
        this.zzb = j;
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final int zza(zziz zzizVar, zzgb zzgbVar, int i) {
        int zza = this.zza.zza(zzizVar, zzgbVar, i);
        if (zza == -4) {
            zzgbVar.zzd = Math.max(0L, zzgbVar.zzd + this.zzb);
            return -4;
        }
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final int zzb(long j) {
        return this.zza.zzb(j - this.zzb);
    }

    public final zztq zzc() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final void zzd() throws IOException {
        this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final boolean zze() {
        return this.zza.zze();
    }
}