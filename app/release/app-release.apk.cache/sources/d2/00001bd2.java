package com.google.android.gms.internal.ads;

import com.p7700g.p99005.ax5;
import java.util.Arrays;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzafh extends zzafl {
    private static final byte[] zza = {79, 112, 117, 115, 72, 101, 97, 100};
    private static final byte[] zzb = {79, 112, 117, 115, 84, 97, 103, 115};

    public static boolean zzd(zzdy zzdyVar) {
        return zzk(zzdyVar, zza);
    }

    private static boolean zzk(zzdy zzdyVar, byte[] bArr) {
        if (zzdyVar.zza() < 8) {
            return false;
        }
        int zzc = zzdyVar.zzc();
        byte[] bArr2 = new byte[8];
        zzdyVar.zzB(bArr2, 0, 8);
        zzdyVar.zzF(zzc);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzafl
    public final long zza(zzdy zzdyVar) {
        byte[] zzH = zzdyVar.zzH();
        int i = zzH[0] & 255;
        int i2 = i & 3;
        int i3 = 2;
        if (i2 == 0) {
            i3 = 1;
        } else if (i2 != 1 && i2 != 2) {
            i3 = zzH[1] & ax5.a;
        }
        int i4 = i >> 3;
        int i5 = i4 & 3;
        return zzg(i3 * (i4 >= 16 ? 2500 << i5 : i4 >= 12 ? 10000 << (i5 & 1) : i5 == 3 ? 60000 : 10000 << i5));
    }

    @Override // com.google.android.gms.internal.ads.zzafl
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public final boolean zzc(zzdy zzdyVar, long j, zzafi zzafiVar) throws zzbp {
        if (zzk(zzdyVar, zza)) {
            byte[] copyOf = Arrays.copyOf(zzdyVar.zzH(), zzdyVar.zzd());
            int i = copyOf[9] & 255;
            List zza2 = zzzp.zza(copyOf);
            zzcw.zzf(zzafiVar.zza == null);
            zzab zzabVar = new zzab();
            zzabVar.zzS("audio/opus");
            zzabVar.zzw(i);
            zzabVar.zzT(48000);
            zzabVar.zzI(zza2);
            zzafiVar.zza = zzabVar.zzY();
            return true;
        } else if (zzk(zzdyVar, zzb)) {
            zzcw.zzb(zzafiVar.zza);
            zzdyVar.zzG(8);
            zzbl zzb2 = zzaae.zzb(zzfrj.zzn(zzaae.zzc(zzdyVar, false, false).zzb));
            if (zzb2 == null) {
                return true;
            }
            zzab zzb3 = zzafiVar.zza.zzb();
            zzb3.zzM(zzb2.zzd(zzafiVar.zza.zzk));
            zzafiVar.zza = zzb3.zzY();
            return true;
        } else {
            zzcw.zzb(zzafiVar.zza);
            return false;
        }
    }
}