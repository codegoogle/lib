package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzccp {
    private final Clock zza;
    private final zzccn zzb;

    public zzccp(Clock clock, zzccn zzccnVar) {
        this.zza = clock;
        this.zzb = zzccnVar;
    }

    public static zzccp zza(Context context) {
        return zzcdo.zzd(context).zzb();
    }

    public final void zzb(int i, long j) {
        this.zzb.zzb(i, j);
    }

    public final void zzc() {
        this.zzb.zza();
    }

    public final void zzd(com.google.android.gms.ads.internal.client.zzez zzezVar) {
        this.zzb.zzb(-1, this.zza.currentTimeMillis());
    }

    public final void zze() {
        this.zzb.zzb(-1, this.zza.currentTimeMillis());
    }
}