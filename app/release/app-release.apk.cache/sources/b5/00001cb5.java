package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzans implements zzflx {
    public final /* synthetic */ zzfku zza;

    public zzans(zzfku zzfkuVar) {
        this.zza = zzfkuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzflx
    public final void zza(int i, long j) {
        this.zza.zzd(i, System.currentTimeMillis() - j);
    }

    @Override // com.google.android.gms.internal.ads.zzflx
    public final void zzb(int i, long j, String str) {
        this.zza.zze(i, System.currentTimeMillis() - j, str);
    }
}