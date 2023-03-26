package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.p7700g.p99005.z1;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public class zzbi {
    public final Object zza;
    public final int zzb;
    public final int zzc;
    public final long zzd;
    public final int zze;

    public zzbi(zzbi zzbiVar) {
        this.zza = zzbiVar.zza;
        this.zzb = zzbiVar.zzb;
        this.zzc = zzbiVar.zzc;
        this.zzd = zzbiVar.zzd;
        this.zze = zzbiVar.zze;
    }

    public zzbi(Object obj, int i, int i2, long j) {
        this(obj, i, i2, j, -1);
    }

    private zzbi(Object obj, int i, int i2, long j, int i3) {
        this.zza = obj;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = j;
        this.zze = i3;
    }

    public final boolean equals(@z1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzbi) {
            zzbi zzbiVar = (zzbi) obj;
            return this.zza.equals(zzbiVar.zza) && this.zzb == zzbiVar.zzb && this.zzc == zzbiVar.zzc && this.zzd == zzbiVar.zzd && this.zze == zzbiVar.zze;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.zza.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.zzb) * 31) + this.zzc) * 31) + ((int) this.zzd)) * 31) + this.zze;
    }

    public final zzbi zza(Object obj) {
        return this.zza.equals(obj) ? this : new zzbi(obj, this.zzb, this.zzc, this.zzd, this.zze);
    }

    public final boolean zzb() {
        return this.zzb != -1;
    }

    public zzbi(Object obj, long j) {
        this(obj, -1, -1, j, -1);
    }

    public zzbi(Object obj, long j, int i) {
        this(obj, -1, -1, j, i);
    }
}