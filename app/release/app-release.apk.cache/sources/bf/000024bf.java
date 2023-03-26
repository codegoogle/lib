package com.google.android.gms.internal.ads;

import com.anythink.expressad.foundation.g.a.f;
import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdlv implements zzgqu {
    private final zzgrh zza;

    public zzdlv(zzgrh zzgrhVar) {
        this.zza = zzgrhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgrh
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set emptySet;
        if (((zzdls) this.zza).zza().zze() != null) {
            emptySet = Collections.singleton(f.e);
        } else {
            emptySet = Collections.emptySet();
        }
        zzgrc.zzb(emptySet);
        return emptySet;
    }
}