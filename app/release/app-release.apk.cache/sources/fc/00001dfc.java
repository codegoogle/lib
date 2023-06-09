package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzazv {
    public final List zza;
    public final int zzb;

    private zzazv(List list, int i) {
        this.zza = list;
        this.zzb = i;
    }

    public static zzazv zza(zzazh zzazhVar) throws zzarw {
        try {
            zzazhVar.zzw(21);
            int zzg = zzazhVar.zzg() & 3;
            int zzg2 = zzazhVar.zzg();
            int zzc = zzazhVar.zzc();
            int i = 0;
            for (int i2 = 0; i2 < zzg2; i2++) {
                zzazhVar.zzw(1);
                int zzj = zzazhVar.zzj();
                for (int i3 = 0; i3 < zzj; i3++) {
                    int zzj2 = zzazhVar.zzj();
                    i += zzj2 + 4;
                    zzazhVar.zzw(zzj2);
                }
            }
            zzazhVar.zzv(zzc);
            byte[] bArr = new byte[i];
            int i4 = 0;
            for (int i5 = 0; i5 < zzg2; i5++) {
                zzazhVar.zzw(1);
                int zzj3 = zzazhVar.zzj();
                for (int i6 = 0; i6 < zzj3; i6++) {
                    int zzj4 = zzazhVar.zzj();
                    System.arraycopy(zzazf.zza, 0, bArr, i4, 4);
                    int i7 = i4 + 4;
                    System.arraycopy(zzazhVar.zza, zzazhVar.zzc(), bArr, i7, zzj4);
                    i4 = i7 + zzj4;
                    zzazhVar.zzw(zzj4);
                }
            }
            return new zzazv(i == 0 ? null : Collections.singletonList(bArr), zzg + 1);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new zzarw("Error parsing HEVC config", e);
        }
    }
}