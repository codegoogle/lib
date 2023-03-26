package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.p7700g.p99005.g1;
import com.p7700g.p99005.z1;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbt {
    public static final zzbt zza = new zzbt(1.0f, 1.0f);
    public static final zzl zzb = zzbs.zza;
    public final float zzc;
    public final float zzd;
    private final int zze;

    public zzbt(@g1(from = 0.0d, fromInclusive = false) float f, @g1(from = 0.0d, fromInclusive = false) float f2) {
        zzcw.zzd(f > 0.0f);
        zzcw.zzd(f2 > 0.0f);
        this.zzc = f;
        this.zzd = f2;
        this.zze = Math.round(f * 1000.0f);
    }

    public final boolean equals(@z1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzbt.class == obj.getClass()) {
            zzbt zzbtVar = (zzbt) obj;
            if (this.zzc == zzbtVar.zzc && this.zzd == zzbtVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.zzd) + ((Float.floatToRawIntBits(this.zzc) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31);
    }

    public final String toString() {
        return zzeg.zzH("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.zzc), Float.valueOf(this.zzd));
    }

    public final long zza(long j) {
        return j * this.zze;
    }
}