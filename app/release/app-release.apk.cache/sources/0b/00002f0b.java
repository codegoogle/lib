package com.google.android.gms.internal.ads;

import com.p7700g.p99005.z1;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzuc {
    public final long zza;
    public final long zzb;

    public zzuc(long j, long j2) {
        this.zza = j;
        this.zzb = j2;
    }

    public final boolean equals(@z1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzuc) {
            zzuc zzucVar = (zzuc) obj;
            return this.zza == zzucVar.zza && this.zzb == zzucVar.zzb;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.zza) * 31) + ((int) this.zzb);
    }
}