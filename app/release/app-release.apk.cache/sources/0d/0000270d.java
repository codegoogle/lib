package com.google.android.gms.internal.ads;

import com.p7700g.p99005.z1;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzehq implements zzeff {
    private final zzduc zza;

    public zzehq(zzduc zzducVar) {
        this.zza = zzducVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeff
    @z1
    public final zzefg zza(String str, JSONObject jSONObject) throws zzfci {
        return new zzefg(this.zza.zzc(str, jSONObject), new zzegz(), str);
    }
}