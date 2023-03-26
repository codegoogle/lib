package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.metrics.LogSessionId;
import com.p7700g.p99005.e1;
import com.p7700g.p99005.e2;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
@e2(31)
/* loaded from: classes2.dex */
public final class zzib {
    @e1
    public static zzmu zza(Context context, zzim zzimVar, boolean z) {
        zzmq zzb = zzmq.zzb(context);
        if (zzb == null) {
            return new zzmu(LogSessionId.LOG_SESSION_ID_NONE);
        }
        if (z) {
            zzimVar.zzR(zzb);
        }
        return new zzmu(zzb.zza());
    }
}