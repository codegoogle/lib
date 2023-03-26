package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzkj {
    private final zzy zza;
    private final SparseArray zzb;

    public zzkj(zzy zzyVar, SparseArray sparseArray) {
        this.zza = zzyVar;
        SparseArray sparseArray2 = new SparseArray(zzyVar.zzb());
        for (int i = 0; i < zzyVar.zzb(); i++) {
            int zza = zzyVar.zza(i);
            zzki zzkiVar = (zzki) sparseArray.get(zza);
            Objects.requireNonNull(zzkiVar);
            sparseArray2.append(zza, zzkiVar);
        }
        this.zzb = sparseArray2;
    }

    public final int zza(int i) {
        return this.zza.zza(i);
    }

    public final int zzb() {
        return this.zza.zzb();
    }

    public final zzki zzc(int i) {
        zzki zzkiVar = (zzki) this.zzb.get(i);
        Objects.requireNonNull(zzkiVar);
        return zzkiVar;
    }

    public final boolean zzd(int i) {
        return this.zza.zzc(i);
    }
}