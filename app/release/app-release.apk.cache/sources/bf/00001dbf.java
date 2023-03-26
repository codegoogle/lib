package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzaxo extends zzase {
    private static final Object zzb = new Object();
    private final long zzc;
    private final long zzd;

    public zzaxo(long j, boolean z) {
        this.zzc = j;
        this.zzd = j;
    }

    @Override // com.google.android.gms.internal.ads.zzase
    public final int zza(Object obj) {
        return zzb.equals(obj) ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.zzase
    public final int zzb() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzase
    public final int zzc() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzase
    public final zzasc zzd(int i, zzasc zzascVar, boolean z) {
        zzayz.zza(i, 0, 1);
        Object obj = z ? zzb : null;
        long j = this.zzc;
        zzascVar.zza = obj;
        zzascVar.zzb = obj;
        zzascVar.zzc = j;
        return zzascVar;
    }

    @Override // com.google.android.gms.internal.ads.zzase
    public final zzasd zze(int i, zzasd zzasdVar, boolean z, long j) {
        zzayz.zza(i, 0, 1);
        zzasdVar.zza = this.zzd;
        return zzasdVar;
    }
}