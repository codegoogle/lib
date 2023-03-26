package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import com.p7700g.p99005.an2;
import com.p7700g.p99005.bn2;
import com.p7700g.p99005.z1;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
/* loaded from: classes2.dex */
public final class zzk implements an2 {
    private final zzam zza;
    private final zzv zzb;
    private final zzba zzc;

    public zzk(zzam zzamVar, zzv zzvVar, zzba zzbaVar) {
        this.zza = zzamVar;
        this.zzb = zzvVar;
        this.zzc = zzbaVar;
    }

    @Override // com.p7700g.p99005.an2
    public final int getConsentStatus() {
        return this.zza.zza();
    }

    @Override // com.p7700g.p99005.an2
    public final boolean isConsentFormAvailable() {
        return this.zzc.zzc();
    }

    @Override // com.p7700g.p99005.an2
    public final void requestConsentInfoUpdate(@z1 Activity activity, bn2 bn2Var, an2.c cVar, an2.b bVar) {
        this.zzb.zzc(activity, bn2Var, cVar, bVar);
    }

    @Override // com.p7700g.p99005.an2
    public final void reset() {
        this.zzc.zzb(null);
        this.zza.zzd();
    }
}