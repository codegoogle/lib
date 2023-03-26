package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzgc extends zzci {
    private final int zzc;
    private final zztt zzd;

    public zzgc(boolean z, zztt zzttVar, byte[] bArr) {
        this.zzd = zzttVar;
        this.zzc = zzttVar.zzc();
    }

    private final int zzw(int i, boolean z) {
        if (z) {
            return this.zzd.zzd(i);
        }
        if (i >= this.zzc - 1) {
            return -1;
        }
        return i + 1;
    }

    private final int zzx(int i, boolean z) {
        if (z) {
            return this.zzd.zze(i);
        }
        if (i <= 0) {
            return -1;
        }
        return i - 1;
    }

    @Override // com.google.android.gms.internal.ads.zzci
    public final int zza(Object obj) {
        int zza;
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            Object obj2 = pair.first;
            Object obj3 = pair.second;
            int zzp = zzp(obj2);
            if (zzp == -1 || (zza = zzu(zzp).zza(obj3)) == -1) {
                return -1;
            }
            return zzs(zzp) + zza;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzci
    public final zzcf zzd(int i, zzcf zzcfVar, boolean z) {
        int zzq = zzq(i);
        int zzt = zzt(zzq);
        zzu(zzq).zzd(i - zzs(zzq), zzcfVar, z);
        zzcfVar.zzd += zzt;
        if (z) {
            Object zzv = zzv(zzq);
            Object obj = zzcfVar.zzc;
            Objects.requireNonNull(obj);
            zzcfVar.zzc = Pair.create(zzv, obj);
        }
        return zzcfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzci
    public final zzch zze(int i, zzch zzchVar, long j) {
        int zzr = zzr(i);
        int zzt = zzt(zzr);
        int zzs = zzs(zzr);
        zzu(zzr).zze(i - zzt, zzchVar, j);
        Object zzv = zzv(zzr);
        if (!zzch.zza.equals(zzchVar.zzc)) {
            zzv = Pair.create(zzv, zzchVar.zzc);
        }
        zzchVar.zzc = zzv;
        zzchVar.zzo += zzs;
        zzchVar.zzp += zzs;
        return zzchVar;
    }

    @Override // com.google.android.gms.internal.ads.zzci
    public final Object zzf(int i) {
        int zzq = zzq(i);
        return Pair.create(zzv(zzq), zzu(zzq).zzf(i - zzs(zzq)));
    }

    @Override // com.google.android.gms.internal.ads.zzci
    public final int zzg(boolean z) {
        if (this.zzc == 0) {
            return -1;
        }
        int zza = z ? this.zzd.zza() : 0;
        while (zzu(zza).zzo()) {
            zza = zzw(zza, z);
            if (zza == -1) {
                return -1;
            }
        }
        return zzu(zza).zzg(z) + zzt(zza);
    }

    @Override // com.google.android.gms.internal.ads.zzci
    public final int zzh(boolean z) {
        int i = this.zzc;
        if (i == 0) {
            return -1;
        }
        int zzb = z ? this.zzd.zzb() : i - 1;
        while (zzu(zzb).zzo()) {
            zzb = zzx(zzb, z);
            if (zzb == -1) {
                return -1;
            }
        }
        return zzu(zzb).zzh(z) + zzt(zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzci
    public final int zzj(int i, int i2, boolean z) {
        int zzr = zzr(i);
        int zzt = zzt(zzr);
        int zzj = zzu(zzr).zzj(i - zzt, i2 == 2 ? 0 : i2, z);
        if (zzj != -1) {
            return zzt + zzj;
        }
        int zzw = zzw(zzr, z);
        while (zzw != -1 && zzu(zzw).zzo()) {
            zzw = zzw(zzw, z);
        }
        if (zzw != -1) {
            return zzu(zzw).zzg(z) + zzt(zzw);
        } else if (i2 == 2) {
            return zzg(z);
        } else {
            return -1;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzci
    public final int zzk(int i, int i2, boolean z) {
        int zzr = zzr(i);
        int zzt = zzt(zzr);
        int zzk = zzu(zzr).zzk(i - zzt, 0, false);
        if (zzk != -1) {
            return zzt + zzk;
        }
        int zzx = zzx(zzr, false);
        while (zzx != -1 && zzu(zzx).zzo()) {
            zzx = zzx(zzx, false);
        }
        if (zzx != -1) {
            return zzu(zzx).zzh(false) + zzt(zzx);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzci
    public final zzcf zzn(Object obj, zzcf zzcfVar) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int zzp = zzp(obj2);
        int zzt = zzt(zzp);
        zzu(zzp).zzn(obj3, zzcfVar);
        zzcfVar.zzd += zzt;
        zzcfVar.zzc = obj;
        return zzcfVar;
    }

    public abstract int zzp(Object obj);

    public abstract int zzq(int i);

    public abstract int zzr(int i);

    public abstract int zzs(int i);

    public abstract int zzt(int i);

    public abstract zzci zzu(int i);

    public abstract Object zzv(int i);
}