package com.google.android.gms.ads;

import com.p7700g.p99005.pg1;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class LoadAdError extends AdError {
    @z1
    private final ResponseInfo zza;

    public LoadAdError(int i, @x1 String str, @x1 String str2, @z1 AdError adError, @z1 ResponseInfo responseInfo) {
        super(i, str, str2, adError);
        this.zza = responseInfo;
    }

    @z1
    public ResponseInfo getResponseInfo() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.AdError
    @x1
    public String toString() {
        try {
            return zzb().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }

    @Override // com.google.android.gms.ads.AdError
    @x1
    public final JSONObject zzb() throws JSONException {
        JSONObject zzb = super.zzb();
        ResponseInfo responseInfo = getResponseInfo();
        if (responseInfo == null) {
            zzb.put("Response Info", pg1.d);
        } else {
            zzb.put("Response Info", responseInfo.zzc());
        }
        return zzb;
    }
}