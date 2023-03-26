package com.google.android.gms.internal.ads;

import com.p7700g.p99005.z1;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzmn {
    public final /* synthetic */ zzmo zza;
    private final String zzb;
    private int zzc;
    private long zzd;
    private zzsa zze;
    private boolean zzf;
    private boolean zzg;

    public zzmn(zzmo zzmoVar, String str, @z1 int i, zzsa zzsaVar) {
        this.zza = zzmoVar;
        this.zzb = str;
        this.zzc = i;
        this.zzd = zzsaVar == null ? -1L : zzsaVar.zzd;
        if (zzsaVar == null || !zzsaVar.zzb()) {
            return;
        }
        this.zze = zzsaVar;
    }

    public final void zzg(int i, @z1 zzsa zzsaVar) {
        if (this.zzd == -1 && i == this.zzc && zzsaVar != null) {
            this.zzd = zzsaVar.zzd;
        }
    }

    public final boolean zzj(int i, @z1 zzsa zzsaVar) {
        if (zzsaVar == null) {
            return i == this.zzc;
        }
        zzsa zzsaVar2 = this.zze;
        return zzsaVar2 == null ? !zzsaVar.zzb() && zzsaVar.zzd == this.zzd : zzsaVar.zzd == zzsaVar2.zzd && zzsaVar.zzb == zzsaVar2.zzb && zzsaVar.zzc == zzsaVar2.zzc;
    }

    public final boolean zzk(zzki zzkiVar) {
        long j = this.zzd;
        if (j == -1) {
            return false;
        }
        zzsa zzsaVar = zzkiVar.zzd;
        if (zzsaVar == null) {
            return this.zzc != zzkiVar.zzc;
        } else if (zzsaVar.zzd > j) {
            return true;
        } else {
            if (this.zze == null) {
                return false;
            }
            int zza = zzkiVar.zzb.zza(zzsaVar.zza);
            int zza2 = zzkiVar.zzb.zza(this.zze.zza);
            zzsa zzsaVar2 = zzkiVar.zzd;
            if (zzsaVar2.zzd < this.zze.zzd || zza < zza2) {
                return false;
            }
            if (zza > zza2) {
                return true;
            }
            if (zzsaVar2.zzb()) {
                zzsa zzsaVar3 = zzkiVar.zzd;
                int i = zzsaVar3.zzb;
                int i2 = zzsaVar3.zzc;
                zzsa zzsaVar4 = this.zze;
                int i3 = zzsaVar4.zzb;
                return i > i3 || (i == i3 && i2 > zzsaVar4.zzc);
            }
            int i4 = zzkiVar.zzd.zze;
            return i4 == -1 || i4 > this.zze.zzb;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x000e, code lost:
        if (r0 < r8.zzc()) goto L6;
     */
    /* JADX WARN: Incorrect condition in loop: B:37:0x002e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzl(zzci zzciVar, zzci zzciVar2) {
        zzch zzchVar;
        zzch zzchVar2;
        zzch zzchVar3;
        zzcf zzcfVar;
        int i = this.zzc;
        if (i < zzciVar.zzc()) {
            zzchVar = this.zza.zzc;
            zzciVar.zze(i, zzchVar, 0L);
            zzchVar2 = this.zza.zzc;
            for (int i2 = zzchVar2.zzo; i2 <= zzchVar3.zzp; i2++) {
                int zza = zzciVar2.zza(zzciVar.zzf(i2));
                if (zza != -1) {
                    zzcfVar = this.zza.zzd;
                    i = zzciVar2.zzd(zza, zzcfVar, false).zzd;
                    break;
                }
            }
            i = -1;
        }
        this.zzc = i;
        if (i == -1) {
            return false;
        }
        zzsa zzsaVar = this.zze;
        return zzsaVar == null || zzciVar2.zza(zzsaVar.zza) != -1;
    }
}