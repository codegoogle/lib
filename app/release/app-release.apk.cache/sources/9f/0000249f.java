package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdkq implements zzgqu {
    private final zzgrh zza;

    public zzdkq(zzgrh zzgrhVar) {
        this.zza = zzgrhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgrh
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set singleton = Collections.singleton(new zzdiz((zzdlj) this.zza.zzb(), zzcfv.zzf));
        zzgrc.zzb(singleton);
        return singleton;
    }
}