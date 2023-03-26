package com.google.android.gms.internal.ads;

import com.p7700g.p99005.z1;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzya {
    public final List zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final float zze;
    @z1
    public final String zzf;

    private zzya(List list, int i, int i2, int i3, float f, @z1 String str) {
        this.zza = list;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = i3;
        this.zze = f;
        this.zzf = str;
    }

    public static zzya zza(zzdy zzdyVar) throws zzbp {
        String str;
        int i;
        int i2;
        float f;
        try {
            zzdyVar.zzG(4);
            int zzk = (zzdyVar.zzk() & 3) + 1;
            if (zzk != 3) {
                ArrayList arrayList = new ArrayList();
                int zzk2 = zzdyVar.zzk() & 31;
                for (int i3 = 0; i3 < zzk2; i3++) {
                    arrayList.add(zzb(zzdyVar));
                }
                int zzk3 = zzdyVar.zzk();
                for (int i4 = 0; i4 < zzk3; i4++) {
                    arrayList.add(zzb(zzdyVar));
                }
                if (zzk2 > 0) {
                    zzzn zzd = zzzo.zzd((byte[]) arrayList.get(0), zzk + 1, ((byte[]) arrayList.get(0)).length);
                    int i5 = zzd.zze;
                    int i6 = zzd.zzf;
                    float f2 = zzd.zzg;
                    str = zzcy.zza(zzd.zza, zzd.zzb, zzd.zzc);
                    i = i5;
                    i2 = i6;
                    f = f2;
                } else {
                    str = null;
                    i = -1;
                    i2 = -1;
                    f = 1.0f;
                }
                return new zzya(arrayList, zzk, i, i2, f, str);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e) {
            throw zzbp.zza("Error parsing AVC config", e);
        }
    }

    private static byte[] zzb(zzdy zzdyVar) {
        int zzo = zzdyVar.zzo();
        int zzc = zzdyVar.zzc();
        zzdyVar.zzG(zzo);
        return zzcy.zzc(zzdyVar.zzH(), zzc, zzo);
    }
}