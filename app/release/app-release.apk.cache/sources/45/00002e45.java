package com.google.android.gms.internal.ads;

import android.media.metrics.LogSessionId;
import com.p7700g.p99005.e2;
import com.p7700g.p99005.z1;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzmu {
    public static final zzmu zza;
    @z1
    private final zzmt zzb;

    static {
        zza = zzeg.zza < 31 ? new zzmu() : new zzmu(zzmt.zza);
    }

    public zzmu() {
        this.zzb = null;
        zzcw.zzf(zzeg.zza < 31);
    }

    private zzmu(@z1 zzmt zzmtVar) {
        this.zzb = zzmtVar;
    }

    @e2(31)
    public final LogSessionId zza() {
        zzmt zzmtVar = this.zzb;
        Objects.requireNonNull(zzmtVar);
        return zzmtVar.zzb;
    }

    @e2(31)
    public zzmu(LogSessionId logSessionId) {
        this.zzb = new zzmt(logSessionId);
    }
}