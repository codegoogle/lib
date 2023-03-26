package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.z1;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzqp {
    public final String zza;
    public final boolean zzb;
    public final boolean zzc;

    public zzqp(String str, boolean z, boolean z2) {
        this.zza = str;
        this.zzb = z;
        this.zzc = z2;
    }

    public final boolean equals(@z1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == zzqp.class) {
            zzqp zzqpVar = (zzqp) obj;
            if (TextUtils.equals(this.zza, zzqpVar.zza) && this.zzb == zzqpVar.zzb && this.zzc == zzqpVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((wo1.x(this.zza, 31, 31) + (true != this.zzb ? 1237 : 1231)) * 31) + (true == this.zzc ? 1231 : 1237);
    }
}