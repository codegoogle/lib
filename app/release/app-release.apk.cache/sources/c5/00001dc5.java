package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public class zzaxu {
    public final zzaxp zza;
    public final int[] zzb;
    private final zzart[] zzc;
    private int zzd;

    public zzaxu(zzaxp zzaxpVar, int... iArr) {
        Objects.requireNonNull(zzaxpVar);
        this.zza = zzaxpVar;
        this.zzc = new zzart[1];
        for (int i = 0; i <= 0; i++) {
            this.zzc[i] = zzaxpVar.zzb(iArr[i]);
        }
        Arrays.sort(this.zzc, new zzaxt(null));
        this.zzb = new int[1];
        for (int i2 = 0; i2 <= 0; i2++) {
            this.zzb[i2] = zzaxpVar.zza(this.zzc[i2]);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzaxu zzaxuVar = (zzaxu) obj;
            if (this.zza == zzaxuVar.zza && Arrays.equals(this.zzb, zzaxuVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzd;
        if (i == 0) {
            int hashCode = Arrays.hashCode(this.zzb) + (System.identityHashCode(this.zza) * 31);
            this.zzd = hashCode;
            return hashCode;
        }
        return i;
    }

    public final int zza(int i) {
        return this.zzb[0];
    }

    public final int zzb() {
        int length = this.zzb.length;
        return 1;
    }

    public final zzart zzc(int i) {
        return this.zzc[i];
    }

    public final zzaxp zzd() {
        return this.zza;
    }
}