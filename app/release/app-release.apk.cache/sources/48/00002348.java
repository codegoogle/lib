package com.google.android.gms.internal.ads;

import com.p7700g.p99005.z1;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzcxz implements zzcya {
    private final Map zza;

    public zzcxz(Map map) {
        this.zza = map;
    }

    @Override // com.google.android.gms.internal.ads.zzcya
    @z1
    public final zzefd zza(int i, String str) {
        return (zzefd) this.zza.get(str);
    }
}