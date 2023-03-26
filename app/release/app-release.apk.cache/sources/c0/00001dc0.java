package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzaxp {
    public final int zza = 1;
    private final zzart[] zzb;
    private int zzc;

    public zzaxp(zzart... zzartVarArr) {
        this.zzb = zzartVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && zzaxp.class == obj.getClass() && Arrays.equals(this.zzb, ((zzaxp) obj).zzb);
    }

    public final int hashCode() {
        int i = this.zzc;
        if (i == 0) {
            int hashCode = Arrays.hashCode(this.zzb) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
            this.zzc = hashCode;
            return hashCode;
        }
        return i;
    }

    public final int zza(zzart zzartVar) {
        for (int i = 0; i <= 0; i++) {
            if (zzartVar == this.zzb[i]) {
                return i;
            }
        }
        return -1;
    }

    public final zzart zzb(int i) {
        return this.zzb[i];
    }
}