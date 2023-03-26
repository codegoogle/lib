package com.google.android.gms.internal.ads;

import com.p7700g.p99005.g1;
import com.p7700g.p99005.p1;
import com.p7700g.p99005.z1;
import com.p7700g.p99005.zg2;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzcv {
    public static final zzcv zza = new zzcv(0, 0, 0, 1.0f);
    public static final zzl zzb = zzcu.zza;
    @p1(from = 0)
    public final int zzc;
    @p1(from = 0)
    public final int zzd;
    @p1(from = 0, to = 359)
    public final int zze;
    @g1(from = zg2.s, fromInclusive = false)
    public final float zzf;

    public zzcv(@p1(from = 0) int i, @p1(from = 0) int i2, @p1(from = 0, to = 359) int i3, @g1(from = 0.0d, fromInclusive = false) float f) {
        this.zzc = i;
        this.zzd = i2;
        this.zze = i3;
        this.zzf = f;
    }

    public final boolean equals(@z1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzcv) {
            zzcv zzcvVar = (zzcv) obj;
            if (this.zzc == zzcvVar.zzc && this.zzd == zzcvVar.zzd && this.zze == zzcvVar.zze && this.zzf == zzcvVar.zzf) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.zzf) + ((((((this.zzc + 217) * 31) + this.zzd) * 31) + this.zze) * 31);
    }
}