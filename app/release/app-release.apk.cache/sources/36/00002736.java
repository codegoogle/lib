package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzejd implements zzgqu {
    private final zzgrh zza;
    private final zzgrh zzb;

    public zzejd(zzgrh zzgrhVar, zzgrh zzgrhVar2) {
        this.zza = zzgrhVar;
        this.zzb = zzgrhVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgrh
    /* renamed from: zza */
    public final zzejc zzb() {
        return new zzejc((Context) this.zza.zzb(), (zzdsy) this.zzb.zzb());
    }
}