package com.google.android.gms.internal.ads;

import com.p7700g.p99005.z1;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzzx {
    public final int zza;
    public final byte[] zzb;
    public final int zzc;
    public final int zzd;

    public zzzx(int i, byte[] bArr, int i2, int i3) {
        this.zza = i;
        this.zzb = bArr;
        this.zzc = i2;
        this.zzd = i3;
    }

    public final boolean equals(@z1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzzx.class == obj.getClass()) {
            zzzx zzzxVar = (zzzx) obj;
            if (this.zza == zzzxVar.zza && this.zzc == zzzxVar.zzc && this.zzd == zzzxVar.zzd && Arrays.equals(this.zzb, zzzxVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.zzb) + (this.zza * 31)) * 31) + this.zzc) * 31) + this.zzd;
    }
}