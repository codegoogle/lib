package com.google.android.gms.internal.ads;

import com.p7700g.p99005.p1;
import com.p7700g.p99005.z1;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzd {
    private final zzc[] zzf;
    public static final zzd zza = new zzd(null, new zzc[0], 0, -9223372036854775807L, 0);
    private static final zzc zze = new zzc(0).zzb(0);
    public static final zzl zzb = zza.zza;
    public final long zzd = 0;
    public final int zzc = 0;

    private zzd(@z1 Object obj, zzc[] zzcVarArr, long j, long j2, int i) {
        this.zzf = zzcVarArr;
    }

    public final boolean equals(@z1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzd.class == obj.getClass()) {
            zzd zzdVar = (zzd) obj;
            if (zzeg.zzS(null, null) && Arrays.equals(this.zzf, zzdVar.zzf)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zzf) + (((int) (-9223372036854775807L)) * 961);
    }

    public final String toString() {
        return "AdPlaybackState(adsId=" + ((Object) null) + ", adResumePositionUs=0, adGroups=[])";
    }

    public final zzc zza(@p1(from = 0) int i) {
        return i < 0 ? zze : this.zzf[i];
    }
}