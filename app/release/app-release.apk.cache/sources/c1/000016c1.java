package com.google.android.gms.ads.h5;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbpo;
import com.p7700g.p99005.e2;
import com.p7700g.p99005.x1;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
@e2(api = 21)
/* loaded from: classes2.dex */
public final class H5AdsRequestHandler {
    private final zzbpo zza;

    public H5AdsRequestHandler(@x1 Context context, @x1 OnH5AdsEventListener onH5AdsEventListener) {
        this.zza = new zzbpo(context, onH5AdsEventListener);
    }

    public void clearAdObjects() {
        this.zza.zza();
    }

    public boolean handleH5AdsRequest(@x1 String str) {
        return this.zza.zzb(str);
    }

    public boolean shouldInterceptRequest(@x1 String str) {
        return zzbpo.zzc(str);
    }
}