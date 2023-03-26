package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.z1;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgm {
    public final String zza;
    public final zzad zzb;
    public final zzad zzc;
    public final int zzd;
    public final int zze;

    public zzgm(String str, zzad zzadVar, zzad zzadVar2, int i, int i2) {
        boolean z = false;
        if (i != 0) {
            i2 = i2 == 0 ? 0 : i2;
            zzcw.zzd(z);
            zzcw.zzc(str);
            this.zza = str;
            Objects.requireNonNull(zzadVar);
            this.zzb = zzadVar;
            Objects.requireNonNull(zzadVar2);
            this.zzc = zzadVar2;
            this.zzd = i;
            this.zze = i2;
        }
        z = true;
        zzcw.zzd(z);
        zzcw.zzc(str);
        this.zza = str;
        Objects.requireNonNull(zzadVar);
        this.zzb = zzadVar;
        Objects.requireNonNull(zzadVar2);
        this.zzc = zzadVar2;
        this.zzd = i;
        this.zze = i2;
    }

    public final boolean equals(@z1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzgm.class == obj.getClass()) {
            zzgm zzgmVar = (zzgm) obj;
            if (this.zzd == zzgmVar.zzd && this.zze == zzgmVar.zze && this.zza.equals(zzgmVar.zza) && this.zzb.equals(zzgmVar.zzb) && this.zzc.equals(zzgmVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int x = wo1.x(this.zza, (((this.zzd + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.zze) * 31, 31);
        return this.zzc.hashCode() + ((this.zzb.hashCode() + x) * 31);
    }
}