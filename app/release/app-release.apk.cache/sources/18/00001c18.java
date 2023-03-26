package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;
import org.xbill.DNS.TTL;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzahx {
    public static Pair zza(zzys zzysVar) throws IOException {
        zzysVar.zzj();
        zzahw zzd = zzd(1684108385, zzysVar, new zzdy(8));
        ((zzyl) zzysVar).zzo(8, false);
        return Pair.create(Long.valueOf(zzysVar.zzf()), Long.valueOf(zzd.zzb));
    }

    public static zzahv zzb(zzys zzysVar) throws IOException {
        byte[] bArr;
        zzdy zzdyVar = new zzdy(16);
        zzahw zzd = zzd(1718449184, zzysVar, zzdyVar);
        zzcw.zzf(zzd.zzb >= 16);
        zzyl zzylVar = (zzyl) zzysVar;
        zzylVar.zzm(zzdyVar.zzH(), 0, 16, false);
        zzdyVar.zzF(0);
        int zzi = zzdyVar.zzi();
        int zzi2 = zzdyVar.zzi();
        int zzh = zzdyVar.zzh();
        int zzh2 = zzdyVar.zzh();
        int zzi3 = zzdyVar.zzi();
        int zzi4 = zzdyVar.zzi();
        int i = ((int) zzd.zzb) - 16;
        if (i > 0) {
            bArr = new byte[i];
            zzylVar.zzm(bArr, 0, i, false);
        } else {
            bArr = zzeg.zzf;
        }
        byte[] bArr2 = bArr;
        ((zzyl) zzysVar).zzo((int) (zzysVar.zze() - zzysVar.zzf()), false);
        return new zzahv(zzi, zzi2, zzh, zzh2, zzi3, zzi4, bArr2);
    }

    public static boolean zzc(zzys zzysVar) throws IOException {
        zzdy zzdyVar = new zzdy(8);
        int i = zzahw.zza(zzysVar, zzdyVar).zza;
        if (i == 1380533830 || i == 1380333108) {
            ((zzyl) zzysVar).zzm(zzdyVar.zzH(), 0, 4, false);
            zzdyVar.zzF(0);
            return zzdyVar.zze() == 1463899717;
        }
        return false;
    }

    private static zzahw zzd(int i, zzys zzysVar, zzdy zzdyVar) throws IOException {
        zzahw zza = zzahw.zza(zzysVar, zzdyVar);
        while (zza.zza != i) {
            long j = zza.zzb + 8;
            if (j <= TTL.MAX_VALUE) {
                ((zzyl) zzysVar).zzo((int) j, false);
                zza = zzahw.zza(zzysVar, zzdyVar);
            } else {
                int i2 = zza.zza;
                throw zzbp.zzc("Chunk is too large (~2GB+) to skip; id: " + i2);
            }
        }
        return zza;
    }
}