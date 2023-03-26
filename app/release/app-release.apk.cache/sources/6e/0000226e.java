package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzcpx implements zzdxh {
    private final zzcop zza;
    private final zzcqd zzb;
    private Long zzc;
    private String zzd;

    public /* synthetic */ zzcpx(zzcop zzcopVar, zzcqd zzcqdVar, zzcpw zzcpwVar) {
        this.zza = zzcopVar;
        this.zzb = zzcqdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdxh
    public final /* synthetic */ zzdxh zza(String str) {
        Objects.requireNonNull(str);
        this.zzd = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdxh
    public final /* bridge */ /* synthetic */ zzdxh zzb(long j) {
        this.zzc = Long.valueOf(j);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdxh
    public final zzdxi zzc() {
        zzgrc.zzc(this.zzc, Long.class);
        zzgrc.zzc(this.zzd, String.class);
        return new zzcpz(this.zza, this.zzb, this.zzc, this.zzd, null);
    }
}