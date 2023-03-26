package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzsn implements zzvg {
    private final zzvg zza;
    private final zzck zzb;

    public zzsn(zzvg zzvgVar, zzck zzckVar) {
        this.zza = zzvgVar;
        this.zzb = zzckVar;
    }

    @Override // com.google.android.gms.internal.ads.zzvk
    public final int zza(int i) {
        return this.zza.zza(0);
    }

    @Override // com.google.android.gms.internal.ads.zzvk
    public final int zzb(int i) {
        return this.zza.zzb(i);
    }

    @Override // com.google.android.gms.internal.ads.zzvk
    public final int zzc() {
        return this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzvk
    public final zzad zzd(int i) {
        return this.zza.zzd(i);
    }

    @Override // com.google.android.gms.internal.ads.zzvk
    public final zzck zze() {
        return this.zzb;
    }
}