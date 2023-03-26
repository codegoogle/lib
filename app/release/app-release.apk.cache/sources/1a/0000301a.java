package com.google.android.gms.internal.consent_sdk;

import com.p7700g.p99005.cn2;
import com.p7700g.p99005.dn2;
import com.p7700g.p99005.zm2;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
/* loaded from: classes2.dex */
public final class zzax implements dn2.b, dn2.a {
    private final dn2.b zza;
    private final dn2.a zzb;

    public /* synthetic */ zzax(dn2.b bVar, dn2.a aVar, zzav zzavVar) {
        this.zza = bVar;
        this.zzb = aVar;
    }

    @Override // com.p7700g.p99005.dn2.a
    public final void onConsentFormLoadFailure(cn2 cn2Var) {
        this.zzb.onConsentFormLoadFailure(cn2Var);
    }

    @Override // com.p7700g.p99005.dn2.b
    public final void onConsentFormLoadSuccess(zm2 zm2Var) {
        this.zza.onConsentFormLoadSuccess(zm2Var);
    }
}