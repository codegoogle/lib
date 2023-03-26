package com.google.android.gms.internal.ads;

import android.media.metrics.LogSessionId;
import com.p7700g.p99005.e1;
import com.p7700g.p99005.e2;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
@e2(31)
/* loaded from: classes2.dex */
public final class zzqg {
    @e1
    public static void zza(zzqb zzqbVar, zzmu zzmuVar) {
        LogSessionId zza = zzmuVar.zza();
        if (zza.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        zzqbVar.zzb.setString("log-session-id", zza.getStringId());
    }
}