package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.p7700g.p99005.gc0;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzepv implements zzgqu {
    private final zzgrh zza;
    private final zzgrh zzb;

    public zzepv(zzgrh zzgrhVar, zzgrh zzgrhVar2) {
        this.zza = zzgrhVar;
        this.zzb = zzgrhVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgrh
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzepq(((zzepl) this.zza).zzb(), gc0.c, (Clock) this.zzb.zzb());
    }
}