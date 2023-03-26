package com.google.android.gms.internal.firebase_messaging;

import com.p7700g.p99005.tp2;
import com.p7700g.p99005.up2;
import com.p7700g.p99005.vp2;
import java.io.IOException;

/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzc implements up2<zze> {
    public static final zzc zza = new zzc();
    private static final tp2 zzb = tp2.d("messagingClientEventExtension");

    private zzc() {
    }

    @Override // com.p7700g.p99005.rp2
    public final /* bridge */ /* synthetic */ void encode(Object obj, vp2 vp2Var) throws IOException {
        vp2Var.add(zzb, ((zze) obj).zzc());
    }
}