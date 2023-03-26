package com.google.android.gms.internal.ads;

import com.p7700g.p99005.z1;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzzb {
    @z1
    public static zzbl zza(zzys zzysVar, boolean z) throws IOException {
        zzbl zza = new zzzi().zza(zzysVar, z ? null : zzaca.zza);
        if (zza == null || zza.zza() == 0) {
            return null;
        }
        return zza;
    }

    public static zzzd zzb(zzdy zzdyVar) {
        zzdyVar.zzG(1);
        int zzm = zzdyVar.zzm();
        long zzc = zzdyVar.zzc() + zzm;
        int i = zzm / 18;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long zzr = zzdyVar.zzr();
            if (zzr == -1) {
                jArr = Arrays.copyOf(jArr, i2);
                jArr2 = Arrays.copyOf(jArr2, i2);
                break;
            }
            jArr[i2] = zzr;
            jArr2[i2] = zzdyVar.zzr();
            zzdyVar.zzG(2);
            i2++;
        }
        zzdyVar.zzG((int) (zzc - zzdyVar.zzc()));
        return new zzzd(jArr, jArr2);
    }
}