package com.google.android.gms.internal.firebase_messaging;

import com.p7700g.p99005.sp2;
import com.p7700g.p99005.up2;
import com.p7700g.p99005.vp2;

/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zzac implements up2 {
    public static final up2 zza = new zzac();

    private zzac() {
    }

    @Override // com.p7700g.p99005.rp2
    public final void encode(Object obj, vp2 vp2Var) {
        int i = zzad.zza;
        String valueOf = String.valueOf(obj.getClass().getCanonicalName());
        throw new sp2(valueOf.length() != 0 ? "Couldn't find encoder for type ".concat(valueOf) : new String("Couldn't find encoder for type "));
    }
}