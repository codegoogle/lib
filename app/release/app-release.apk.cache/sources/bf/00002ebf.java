package com.google.android.gms.internal.ads;

import com.p7700g.p99005.z1;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzrh implements zzsk, zzpd {
    public final /* synthetic */ zzrj zza;
    private final Object zzb;
    private zzsj zzc;
    private zzpc zzd;

    public zzrh(zzrj zzrjVar, Object obj) {
        this.zza = zzrjVar;
        this.zzc = zzrjVar.zze(null);
        this.zzd = zzrjVar.zzc(null);
        this.zzb = obj;
    }

    private final boolean zzf(int i, @z1 zzsa zzsaVar) {
        zzsa zzsaVar2;
        if (zzsaVar != null) {
            zzsaVar2 = this.zza.zzv(this.zzb, zzsaVar);
            if (zzsaVar2 == null) {
                return false;
            }
        } else {
            zzsaVar2 = null;
        }
        zzsj zzsjVar = this.zzc;
        if (zzsjVar.zza != i || !zzeg.zzS(zzsjVar.zzb, zzsaVar2)) {
            this.zzc = this.zza.zzf(i, zzsaVar2, 0L);
        }
        zzpc zzpcVar = this.zzd;
        if (zzpcVar.zza == i && zzeg.zzS(zzpcVar.zzb, zzsaVar2)) {
            return true;
        }
        this.zzd = this.zza.zzd(i, zzsaVar2);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzsk
    public final void zzaf(int i, @z1 zzsa zzsaVar, zzrw zzrwVar) {
        if (zzf(i, zzsaVar)) {
            this.zzc.zzc(zzrwVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsk
    public final void zzag(int i, @z1 zzsa zzsaVar, zzrr zzrrVar, zzrw zzrwVar) {
        if (zzf(i, zzsaVar)) {
            this.zzc.zze(zzrrVar, zzrwVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsk
    public final void zzah(int i, @z1 zzsa zzsaVar, zzrr zzrrVar, zzrw zzrwVar) {
        if (zzf(i, zzsaVar)) {
            this.zzc.zzg(zzrrVar, zzrwVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsk
    public final void zzai(int i, @z1 zzsa zzsaVar, zzrr zzrrVar, zzrw zzrwVar, IOException iOException, boolean z) {
        if (zzf(i, zzsaVar)) {
            this.zzc.zzi(zzrrVar, zzrwVar, iOException, z);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsk
    public final void zzaj(int i, @z1 zzsa zzsaVar, zzrr zzrrVar, zzrw zzrwVar) {
        if (zzf(i, zzsaVar)) {
            this.zzc.zzk(zzrrVar, zzrwVar);
        }
    }
}