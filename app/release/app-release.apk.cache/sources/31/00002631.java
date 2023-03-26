package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zzdzn implements zzfuj {
    public static final /* synthetic */ zzdzn zza = new zzdzn();

    private /* synthetic */ zzdzn() {
    }

    @Override // com.google.android.gms.internal.ads.zzfuj
    public final zzfvl zza(Object obj) {
        return zzfvc.zzh(((ExecutionException) obj).getCause());
    }
}