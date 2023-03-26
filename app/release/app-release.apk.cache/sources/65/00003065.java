package com.google.android.gms.internal.firebase_messaging;

import com.p7700g.p99005.aq2;
import com.p7700g.p99005.av2;
import com.p7700g.p99005.bq2;
import com.p7700g.p99005.bv2;

/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzd implements aq2 {
    public static final aq2 zza = new zzd();

    private zzd() {
    }

    @Override // com.p7700g.p99005.aq2
    public final void configure(bq2<?> bq2Var) {
        bq2Var.registerEncoder(zze.class, zzc.zza);
        bq2Var.registerEncoder(bv2.class, zzb.zza);
        bq2Var.registerEncoder(av2.class, zza.zza);
    }
}