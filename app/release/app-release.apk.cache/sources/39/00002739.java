package com.google.android.gms.internal.ads;

import com.p7700g.p99005.z1;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzejg implements zzeff {
    @GuardedBy("this")
    private final Map zza = new HashMap();
    private final zzduc zzb;

    public zzejg(zzduc zzducVar) {
        this.zzb = zzducVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeff
    @z1
    public final zzefg zza(String str, JSONObject jSONObject) throws zzfci {
        zzefg zzefgVar;
        synchronized (this) {
            zzefgVar = (zzefg) this.zza.get(str);
            if (zzefgVar == null) {
                zzefgVar = new zzefg(this.zzb.zzc(str, jSONObject), new zzeha(), str);
                this.zza.put(str, zzefgVar);
            }
        }
        return zzefgVar;
    }
}