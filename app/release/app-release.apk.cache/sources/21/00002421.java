package com.google.android.gms.internal.ads;

import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdfz extends zzfko implements zzdbt, com.google.android.gms.ads.internal.client.zza, zzarc, zzdee, zzdcn, zzdds, com.google.android.gms.ads.internal.overlay.zzo, zzdcj, zzdjg {
    private final zzdfx zza = new zzdfx(this, null);
    @Nullable
    private zzemh zzb;
    @Nullable
    private zzeml zzc;
    @Nullable
    private zzexh zzd;
    @Nullable
    private zzfao zze;

    public static /* bridge */ /* synthetic */ void zzn(zzdfz zzdfzVar, zzemh zzemhVar) {
        zzdfzVar.zzb = zzemhVar;
    }

    public static /* bridge */ /* synthetic */ void zzs(zzdfz zzdfzVar, zzexh zzexhVar) {
        zzdfzVar.zzd = zzexhVar;
    }

    public static /* bridge */ /* synthetic */ void zzt(zzdfz zzdfzVar, zzeml zzemlVar) {
        zzdfzVar.zzc = zzemlVar;
    }

    public static /* bridge */ /* synthetic */ void zzu(zzdfz zzdfzVar, zzfao zzfaoVar) {
        zzdfzVar.zze = zzfaoVar;
    }

    private static void zzw(Object obj, zzdfy zzdfyVar) {
        if (obj != null) {
            zzdfyVar.zza(obj);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzw(this.zzb, zzdfn.zza);
        zzw(this.zzc, zzdfo.zza);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzb() {
        zzw(this.zzd, zzdft.zza);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbC() {
        zzw(this.zzd, zzdew.zza);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbK() {
        zzw(this.zzd, zzdfm.zza);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbr() {
        zzw(this.zzd, zzdet.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzarc
    public final void zzbu(final String str, final String str2) {
        zzw(this.zzb, new zzdfy() { // from class: com.google.android.gms.internal.ads.zzdeq
            @Override // com.google.android.gms.internal.ads.zzdfy
            public final void zza(Object obj) {
                ((zzemh) obj).zzbu(str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    public final void zzbv() {
        zzw(this.zzb, zzder.zza);
        zzw(this.zze, zzdes.zza);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zze() {
        zzw(this.zzd, zzdep.zza);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzf(final int i) {
        zzw(this.zzd, new zzdfy() { // from class: com.google.android.gms.internal.ads.zzdfk
            @Override // com.google.android.gms.internal.ads.zzdfy
            public final void zza(Object obj) {
                ((zzexh) obj).zzf(i);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdee
    public final void zzg(final com.google.android.gms.ads.internal.client.zzs zzsVar) {
        zzw(this.zzb, new zzdfy() { // from class: com.google.android.gms.internal.ads.zzdfq
            @Override // com.google.android.gms.internal.ads.zzdfy
            public final void zza(Object obj) {
                ((zzemh) obj).zzg(com.google.android.gms.ads.internal.client.zzs.this);
            }
        });
        zzw(this.zze, new zzdfy() { // from class: com.google.android.gms.internal.ads.zzdfr
            @Override // com.google.android.gms.internal.ads.zzdfy
            public final void zza(Object obj) {
                ((zzfao) obj).zzg(com.google.android.gms.ads.internal.client.zzs.this);
            }
        });
        zzw(this.zzd, new zzdfy() { // from class: com.google.android.gms.internal.ads.zzdfs
            @Override // com.google.android.gms.internal.ads.zzdfy
            public final void zza(Object obj) {
                ((zzexh) obj).zzg(com.google.android.gms.ads.internal.client.zzs.this);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdds
    public final void zzh() {
        zzw(this.zzd, zzdfc.zza);
    }

    public final zzdfx zzi() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    public final void zzj() {
        zzw(this.zzb, zzdfi.zza);
        zzw(this.zze, zzdfj.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdcj
    public final void zzk(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzw(this.zze, new zzdfy() { // from class: com.google.android.gms.internal.ads.zzdex
            @Override // com.google.android.gms.internal.ads.zzdfy
            public final void zza(Object obj) {
                ((zzfao) obj).zzk(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
        zzw(this.zzb, new zzdfy() { // from class: com.google.android.gms.internal.ads.zzdey
            @Override // com.google.android.gms.internal.ads.zzdfy
            public final void zza(Object obj) {
                ((zzemh) obj).zzk(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdcn
    public final void zzl() {
        zzw(this.zzb, zzdfa.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    public final void zzm() {
        zzw(this.zzb, zzdfl.zza);
        zzw(this.zze, zzdfp.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    public final void zzo() {
        zzw(this.zzb, zzdfu.zza);
        zzw(this.zze, zzdfv.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    public final void zzp(final zzcal zzcalVar, final String str, final String str2) {
        zzw(this.zzb, new zzdfy() { // from class: com.google.android.gms.internal.ads.zzdez
            @Override // com.google.android.gms.internal.ads.zzdfy
            public final void zza(Object obj) {
                zzemh zzemhVar = (zzemh) obj;
            }
        });
        zzw(this.zze, new zzdfy() { // from class: com.google.android.gms.internal.ads.zzdfb
            @Override // com.google.android.gms.internal.ads.zzdfy
            public final void zza(Object obj) {
                ((zzfao) obj).zzp(zzcal.this, str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void zzq() {
        zzw(this.zzb, zzdfd.zza);
        zzw(this.zzc, zzdfe.zza);
        zzw(this.zze, zzdff.zza);
        zzw(this.zzd, zzdfg.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    public final void zzr() {
        zzw(this.zzb, zzdeu.zza);
        zzw(this.zze, zzdev.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfko
    public final void zzv() {
        zzw(this.zze, zzdfh.zza);
    }
}