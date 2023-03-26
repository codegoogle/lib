package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import com.anythink.expressad.foundation.d.c;
import com.p7700g.p99005.z1;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfbq {
    @z1
    public final String zza;
    @z1
    public final String zzb;
    public final JSONObject zzc;
    public final JSONObject zzd;

    public zzfbq(JsonReader jsonReader) throws IllegalStateException, IOException, JSONException, NumberFormatException {
        JSONObject zzh = com.google.android.gms.ads.internal.util.zzbu.zzh(jsonReader);
        this.zzd = zzh;
        this.zza = zzh.optString(c.c, null);
        this.zzb = zzh.optString("ad_base_url", null);
        this.zzc = zzh.optJSONObject("ad_json");
    }
}