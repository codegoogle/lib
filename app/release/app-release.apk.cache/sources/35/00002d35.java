package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzgnk {
    public abstract int zza(Object obj);

    public abstract int zzb(Object obj);

    public abstract Object zzc(Object obj);

    public abstract Object zzd(Object obj);

    public abstract Object zze(Object obj, Object obj2);

    public abstract Object zzf();

    public abstract Object zzg(Object obj);

    public abstract void zzh(Object obj, int i, int i2);

    public abstract void zzi(Object obj, int i, long j);

    public abstract void zzj(Object obj, int i, Object obj2);

    public abstract void zzk(Object obj, int i, zzgji zzgjiVar);

    public abstract void zzl(Object obj, int i, long j);

    public abstract void zzm(Object obj);

    public abstract void zzn(Object obj, Object obj2);

    public abstract void zzo(Object obj, Object obj2);

    public final boolean zzp(Object obj, zzgml zzgmlVar) throws IOException {
        int zzd = zzgmlVar.zzd();
        int i = zzd >>> 3;
        int i2 = zzd & 7;
        if (i2 == 0) {
            zzl(obj, i, zzgmlVar.zzl());
            return true;
        } else if (i2 == 1) {
            zzi(obj, i, zzgmlVar.zzk());
            return true;
        } else if (i2 == 2) {
            zzk(obj, i, zzgmlVar.zzp());
            return true;
        } else if (i2 != 3) {
            if (i2 != 4) {
                if (i2 == 5) {
                    zzh(obj, i, zzgmlVar.zzf());
                    return true;
                }
                throw zzglc.zza();
            }
            return false;
        } else {
            Object zzf = zzf();
            int i3 = 4 | (i << 3);
            while (zzgmlVar.zzc() != Integer.MAX_VALUE && zzp(zzf, zzgmlVar)) {
            }
            if (i3 == zzgmlVar.zzd()) {
                zzg(zzf);
                zzj(obj, i, zzf);
                return true;
            }
            throw zzglc.zzb();
        }
    }

    public abstract boolean zzq(zzgml zzgmlVar);

    public abstract void zzr(Object obj, zzgjy zzgjyVar) throws IOException;
}