package com.google.android.gms.internal.ads;

import com.p7700g.p99005.g15;
import com.p7700g.p99005.z1;
import java.util.Arrays;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzafb extends zzafl {
    @z1
    private zzze zza;
    @z1
    private zzafa zzb;

    private static boolean zzd(byte[] bArr) {
        return bArr[0] == -1;
    }

    @Override // com.google.android.gms.internal.ads.zzafl
    public final long zza(zzdy zzdyVar) {
        if (zzd(zzdyVar.zzH())) {
            int i = (zzdyVar.zzH()[2] & 255) >> 4;
            if (i != 6) {
                if (i == 7) {
                    i = 7;
                }
                int zza = zzza.zza(zzdyVar, i);
                zzdyVar.zzF(0);
                return zza;
            }
            zzdyVar.zzG(4);
            zzdyVar.zzu();
            int zza2 = zzza.zza(zzdyVar, i);
            zzdyVar.zzF(0);
            return zza2;
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzafl
    public final void zzb(boolean z) {
        super.zzb(z);
        if (z) {
            this.zza = null;
            this.zzb = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzafl
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public final boolean zzc(zzdy zzdyVar, long j, zzafi zzafiVar) {
        byte[] zzH = zzdyVar.zzH();
        zzze zzzeVar = this.zza;
        if (zzzeVar == null) {
            zzze zzzeVar2 = new zzze(zzH, 17);
            this.zza = zzzeVar2;
            zzafiVar.zza = zzzeVar2.zzc(Arrays.copyOfRange(zzH, 9, zzdyVar.zzd()), null);
            return true;
        } else if ((zzH[0] & g15.c) == 3) {
            zzzd zzb = zzzb.zzb(zzdyVar);
            zzze zzf = zzzeVar.zzf(zzb);
            this.zza = zzf;
            this.zzb = new zzafa(zzf, zzb);
            return true;
        } else if (zzd(zzH)) {
            zzafa zzafaVar = this.zzb;
            if (zzafaVar != null) {
                zzafaVar.zza(j);
                zzafiVar.zzb = this.zzb;
            }
            Objects.requireNonNull(zzafiVar.zza);
            return false;
        } else {
            return true;
        }
    }
}