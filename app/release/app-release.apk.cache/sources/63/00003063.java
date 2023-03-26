package com.google.android.gms.internal.firebase_messaging;

import com.p7700g.p99005.bv2;
import com.p7700g.p99005.tp2;
import com.p7700g.p99005.up2;
import com.p7700g.p99005.vp2;
import java.io.IOException;

/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzb implements up2<bv2> {
    public static final zzb zza = new zzb();
    private static final tp2 zzb;

    static {
        tp2.b a = tp2.a("messagingClientEvent");
        zzv zzvVar = new zzv();
        zzvVar.zza(1);
        zzb = a.b(zzvVar.zzb()).a();
    }

    private zzb() {
    }

    @Override // com.p7700g.p99005.rp2
    public final /* bridge */ /* synthetic */ void encode(Object obj, vp2 vp2Var) throws IOException {
        vp2Var.add(zzb, ((bv2) obj).c());
    }
}