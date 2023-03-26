package com.google.android.gms.internal.ads;

import com.p7700g.p99005.z1;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzta {
    public final int zza;
    public final boolean zzb;

    public zzta(int i, boolean z) {
        this.zza = i;
        this.zzb = z;
    }

    public final boolean equals(@z1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzta.class == obj.getClass()) {
            zzta zztaVar = (zzta) obj;
            if (this.zza == zztaVar.zza && this.zzb == zztaVar.zzb) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.zza * 31) + (this.zzb ? 1 : 0);
    }
}