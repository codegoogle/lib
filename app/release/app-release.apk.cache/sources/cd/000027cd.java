package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzeot implements zzetg {
    private final Executor zza;
    private final zzcer zzb;

    public zzeot(Executor executor, zzcer zzcerVar) {
        this.zza = executor;
        this.zzb = zzcerVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetg
    public final int zza() {
        return 10;
    }

    @Override // com.google.android.gms.internal.ads.zzetg
    public final zzfvl zzb() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzcj)).booleanValue()) {
            return zzfvc.zzi(null);
        }
        return zzfvc.zzm(this.zzb.zzj(), zzeor.zza, this.zza);
    }
}