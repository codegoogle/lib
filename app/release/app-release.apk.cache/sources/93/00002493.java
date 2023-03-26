package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdke implements zzgqu {
    private final zzdkd zza;
    private final zzgrh zzb;

    public zzdke(zzdkd zzdkdVar, zzgrh zzgrhVar) {
        this.zza = zzdkdVar;
        this.zzb = zzgrhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgrh
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set singleton = Collections.singleton(new zzdiz((zzdat) this.zzb.zzb(), zzcfv.zzf));
        zzgrc.zzb(singleton);
        return singleton;
    }
}