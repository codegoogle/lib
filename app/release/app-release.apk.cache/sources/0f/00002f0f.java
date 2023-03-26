package com.google.android.gms.internal.ads;

import com.p7700g.p99005.z1;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public class zzug implements zzvg {
    public final zzck zza;
    public final int zzb;
    public final int[] zzc;
    private final zzad[] zzd;
    private int zze;

    public zzug(zzck zzckVar, int[] iArr, int i) {
        int length = iArr.length;
        zzcw.zzf(length > 0);
        Objects.requireNonNull(zzckVar);
        this.zza = zzckVar;
        this.zzb = length;
        this.zzd = new zzad[length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.zzd[i2] = zzckVar.zzb(iArr[i2]);
        }
        Arrays.sort(this.zzd, zzuf.zza);
        this.zzc = new int[this.zzb];
        for (int i3 = 0; i3 < this.zzb; i3++) {
            this.zzc[i3] = zzckVar.zza(this.zzd[i3]);
        }
    }

    public final boolean equals(@z1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzug zzugVar = (zzug) obj;
            if (this.zza == zzugVar.zza && Arrays.equals(this.zzc, zzugVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zze;
        if (i == 0) {
            int hashCode = Arrays.hashCode(this.zzc) + (System.identityHashCode(this.zza) * 31);
            this.zze = hashCode;
            return hashCode;
        }
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzvk
    public final int zza(int i) {
        return this.zzc[0];
    }

    @Override // com.google.android.gms.internal.ads.zzvk
    public final int zzb(int i) {
        for (int i2 = 0; i2 < this.zzb; i2++) {
            if (this.zzc[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzvk
    public final int zzc() {
        return this.zzc.length;
    }

    @Override // com.google.android.gms.internal.ads.zzvk
    public final zzad zzd(int i) {
        return this.zzd[i];
    }

    @Override // com.google.android.gms.internal.ads.zzvk
    public final zzck zze() {
        return this.zza;
    }
}