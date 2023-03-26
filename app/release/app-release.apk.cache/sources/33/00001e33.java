package com.google.android.gms.internal.ads;

import com.p7700g.p99005.z1;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbbv {
    public final long zza;
    public final String zzb;
    public final int zzc;

    public zzbbv(long j, String str, int i) {
        this.zza = j;
        this.zzb = str;
        this.zzc = i;
    }

    public final boolean equals(@z1 Object obj) {
        if (obj != null && (obj instanceof zzbbv)) {
            zzbbv zzbbvVar = (zzbbv) obj;
            if (zzbbvVar.zza == this.zza && zzbbvVar.zzc == this.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (int) this.zza;
    }
}