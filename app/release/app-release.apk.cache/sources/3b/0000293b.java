package com.google.android.gms.internal.ads;

import com.p7700g.p99005.z1;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfcg {
    private final JSONObject zza;

    public zzfcg(JSONObject jSONObject) {
        this.zza = jSONObject;
    }

    @z1
    public final String zza() {
        if (zzb() - 1 != 1) {
            return "javascript";
        }
        return null;
    }

    public final int zzb() {
        int optInt = this.zza.optInt("media_type", -1);
        if (optInt != 0) {
            return optInt != 1 ? 3 : 1;
        }
        return 2;
    }
}