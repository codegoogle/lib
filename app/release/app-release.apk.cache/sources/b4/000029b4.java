package com.google.android.gms.internal.ads;

import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfgt {
    @x1
    public final String zza;
    @x1
    public final String zzb;

    public zzfgt(@x1 String str, @x1 String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(@z1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzfgt) {
            zzfgt zzfgtVar = (zzfgt) obj;
            return this.zza.equals(zzfgtVar.zza) && this.zzb.equals(zzfgtVar.zzb);
        }
        return false;
    }

    public final int hashCode() {
        return String.valueOf(this.zza).concat(String.valueOf(this.zzb)).hashCode();
    }
}