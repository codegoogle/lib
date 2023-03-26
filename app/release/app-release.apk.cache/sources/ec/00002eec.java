package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzsz implements zztq {
    public final /* synthetic */ zztc zza;
    private final int zzb;

    public zzsz(zztc zztcVar, int i) {
        this.zza = zztcVar;
        this.zzb = i;
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final int zza(zziz zzizVar, zzgb zzgbVar, int i) {
        return this.zza.zzg(this.zzb, zzizVar, zzgbVar, i);
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final int zzb(long j) {
        return this.zza.zzi(this.zzb, j);
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final void zzd() throws IOException {
        this.zza.zzF(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final boolean zze() {
        return this.zza.zzM(this.zzb);
    }
}