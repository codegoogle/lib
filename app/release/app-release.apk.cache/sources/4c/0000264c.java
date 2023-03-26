package com.google.android.gms.internal.ads;

import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zzeam implements zzfuj {
    public static final /* synthetic */ zzeam zza = new zzeam();

    private /* synthetic */ zzeam() {
    }

    @Override // com.google.android.gms.internal.ads.zzfuj
    public final zzfvl zza(Object obj) {
        TimeoutException timeoutException = (TimeoutException) obj;
        return zzfvc.zzh(new zzdzl(5));
    }
}