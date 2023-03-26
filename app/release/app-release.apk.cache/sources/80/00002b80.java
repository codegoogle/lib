package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfxg implements zzfxj {
    public final /* synthetic */ zzgas zza;

    public zzfxg(zzgas zzgasVar) {
        this.zza = zzgasVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfxj
    public final zzfwo zza(Class cls) throws GeneralSecurityException {
        try {
            return new zzfwq(this.zza, cls);
        } catch (IllegalArgumentException e) {
            throw new GeneralSecurityException("Primitive type not supported", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfxj
    public final zzfwo zzb() {
        zzgas zzgasVar = this.zza;
        return new zzfwq(zzgasVar, zzgasVar.zzi());
    }

    @Override // com.google.android.gms.internal.ads.zzfxj
    public final Class zzc() {
        return this.zza.getClass();
    }

    @Override // com.google.android.gms.internal.ads.zzfxj
    public final Class zzd() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfxj
    public final Set zze() {
        return this.zza.zzl();
    }
}