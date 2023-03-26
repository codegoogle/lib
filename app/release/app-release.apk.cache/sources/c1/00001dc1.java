package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzaxq {
    public static final zzaxq zza = new zzaxq(new zzaxp[0]);
    public final int zzb;
    private final zzaxp[] zzc;
    private int zzd;

    public zzaxq(zzaxp... zzaxpVarArr) {
        this.zzc = zzaxpVarArr;
        this.zzb = zzaxpVarArr.length;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaxq.class == obj.getClass()) {
            zzaxq zzaxqVar = (zzaxq) obj;
            if (this.zzb == zzaxqVar.zzb && Arrays.equals(this.zzc, zzaxqVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzd;
        if (i == 0) {
            int hashCode = Arrays.hashCode(this.zzc);
            this.zzd = hashCode;
            return hashCode;
        }
        return i;
    }

    public final int zza(zzaxp zzaxpVar) {
        for (int i = 0; i < this.zzb; i++) {
            if (this.zzc[i] == zzaxpVar) {
                return i;
            }
        }
        return -1;
    }

    public final zzaxp zzb(int i) {
        return this.zzc[i];
    }
}