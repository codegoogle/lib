package com.google.android.gms.internal.ads;

import java.io.IOException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzafd implements zzyr {
    public static final zzyy zza = zzafc.zza;
    private zzyu zzb;
    private zzafl zzc;
    private boolean zzd;

    @EnsuresNonNullIf(expression = {"streamReader"}, result = true)
    private final boolean zze(zzys zzysVar) throws IOException {
        zzaff zzaffVar = new zzaff();
        if (zzaffVar.zzb(zzysVar, true) && (zzaffVar.zza & 2) == 2) {
            int min = Math.min(zzaffVar.zze, 8);
            zzdy zzdyVar = new zzdy(min);
            ((zzyl) zzysVar).zzm(zzdyVar.zzH(), 0, min, false);
            zzdyVar.zzF(0);
            if (zzdyVar.zza() >= 5 && zzdyVar.zzk() == 127 && zzdyVar.zzs() == 1179402563) {
                this.zzc = new zzafb();
            } else {
                zzdyVar.zzF(0);
                try {
                    if (zzaae.zzd(1, zzdyVar, true)) {
                        this.zzc = new zzafn();
                    }
                } catch (zzbp unused) {
                }
                zzdyVar.zzF(0);
                if (zzafh.zzd(zzdyVar)) {
                    this.zzc = new zzafh();
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzyr
    public final int zza(zzys zzysVar, zzzr zzzrVar) throws IOException {
        zzcw.zzb(this.zzb);
        if (this.zzc == null) {
            if (zze(zzysVar)) {
                zzysVar.zzj();
            } else {
                throw zzbp.zza("Failed to determine bitstream type", null);
            }
        }
        if (!this.zzd) {
            zzzy zzv = this.zzb.zzv(0, 1);
            this.zzb.zzB();
            this.zzc.zzh(this.zzb, zzv);
            this.zzd = true;
        }
        return this.zzc.zze(zzysVar, zzzrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzyr
    public final void zzb(zzyu zzyuVar) {
        this.zzb = zzyuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzyr
    public final void zzc(long j, long j2) {
        zzafl zzaflVar = this.zzc;
        if (zzaflVar != null) {
            zzaflVar.zzj(j, j2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzyr
    public final boolean zzd(zzys zzysVar) throws IOException {
        try {
            return zze(zzysVar);
        } catch (zzbp unused) {
            return false;
        }
    }
}