package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.p7700g.p99005.z1;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzji implements zzsk, zzpd {
    public final /* synthetic */ zzjm zza;
    private final zzjk zzb;
    private zzsj zzc;
    private zzpc zzd;

    public zzji(zzjm zzjmVar, zzjk zzjkVar) {
        zzsj zzsjVar;
        zzpc zzpcVar;
        this.zza = zzjmVar;
        zzsjVar = zzjmVar.zzf;
        this.zzc = zzsjVar;
        zzpcVar = zzjmVar.zzg;
        this.zzd = zzpcVar;
        this.zzb = zzjkVar;
    }

    private final boolean zzf(int i, @z1 zzsa zzsaVar) {
        zzsj zzsjVar;
        zzpc zzpcVar;
        zzsa zzsaVar2 = null;
        if (zzsaVar != null) {
            zzjk zzjkVar = this.zzb;
            int i2 = 0;
            while (true) {
                if (i2 >= zzjkVar.zzc.size()) {
                    break;
                } else if (((zzsa) zzjkVar.zzc.get(i2)).zzd == zzsaVar.zzd) {
                    zzsaVar2 = zzsaVar.zzc(Pair.create(zzjkVar.zzb, zzsaVar.zza));
                    break;
                } else {
                    i2++;
                }
            }
            if (zzsaVar2 == null) {
                return false;
            }
        }
        int i3 = i + this.zzb.zzd;
        zzsj zzsjVar2 = this.zzc;
        if (zzsjVar2.zza != i3 || !zzeg.zzS(zzsjVar2.zzb, zzsaVar2)) {
            zzsjVar = this.zza.zzf;
            this.zzc = zzsjVar.zza(i3, zzsaVar2, 0L);
        }
        zzpc zzpcVar2 = this.zzd;
        if (zzpcVar2.zza == i3 && zzeg.zzS(zzpcVar2.zzb, zzsaVar2)) {
            return true;
        }
        zzpcVar = this.zza.zzg;
        this.zzd = zzpcVar.zza(i3, zzsaVar2);
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