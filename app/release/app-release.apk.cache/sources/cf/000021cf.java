package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.p7700g.p99005.u0;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.z1;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzck {
    public static final zzl zza = zzcj.zza;
    public final int zzb = 1;
    public final String zzc;
    public final int zzd;
    private final zzad[] zze;
    private int zzf;

    public zzck(String str, zzad... zzadVarArr) {
        this.zzc = str;
        this.zze = zzadVarArr;
        int zzb = zzbo.zzb(zzadVarArr[0].zzm);
        this.zzd = zzb == -1 ? zzbo.zzb(zzadVarArr[0].zzl) : zzb;
        zzd(zzadVarArr[0].zzd);
        int i = zzadVarArr[0].zzf;
    }

    private static String zzd(@z1 String str) {
        return (str == null || str.equals("und")) ? "" : str;
    }

    public final boolean equals(@z1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzck.class == obj.getClass()) {
            zzck zzckVar = (zzck) obj;
            if (this.zzc.equals(zzckVar.zzc) && Arrays.equals(this.zze, zzckVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzf;
        if (i == 0) {
            int hashCode = Arrays.hashCode(this.zze) + wo1.x(this.zzc, IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31);
            this.zzf = hashCode;
            return hashCode;
        }
        return i;
    }

    public final int zza(zzad zzadVar) {
        for (int i = 0; i <= 0; i++) {
            if (zzadVar == this.zze[i]) {
                return i;
            }
        }
        return -1;
    }

    public final zzad zzb(int i) {
        return this.zze[i];
    }

    @u0
    public final zzck zzc(String str) {
        return new zzck(str, this.zze);
    }
}