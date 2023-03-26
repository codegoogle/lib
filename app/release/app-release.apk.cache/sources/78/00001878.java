package com.google.android.gms.ads.query;

import com.anythink.core.api.ATAdConst;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzcfi;
import com.p7700g.p99005.x1;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
@KeepForSdk
@Deprecated
/* loaded from: classes2.dex */
public class AdInfo {
    private final QueryInfo zza;
    private final String zzb;

    @KeepForSdk
    public AdInfo(@x1 QueryInfo queryInfo, @x1 String str) {
        this.zza = queryInfo;
        this.zzb = str;
    }

    @x1
    @KeepForSdk
    public static String getRequestId(@x1 String str) {
        if (str == null) {
            zzcfi.zzj("adString passed to AdInfo.getRequestId() cannot be null. Returning empty string.");
            return "";
        }
        try {
            return new JSONObject(str).optString(ATAdConst.NETWORK_CUSTOM_KEY.NETWORK_REQUEST_ID, "");
        } catch (JSONException unused) {
            zzcfi.zzj("Invalid adString passed to AdInfo.getRequestId(). Returning empty string.");
            return "";
        }
    }

    @x1
    @KeepForSdk
    public String getAdString() {
        return this.zzb;
    }

    @x1
    @KeepForSdk
    public QueryInfo getQueryInfo() {
        return this.zza;
    }
}