package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzfok;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zzv implements zzfok {
    public static final /* synthetic */ zzv zza = new zzv();

    private /* synthetic */ zzv() {
    }

    @Override // com.google.android.gms.internal.ads.zzfok
    public final Object apply(Object obj) {
        int i = zzaa.zze;
        return ((JSONObject) obj).optString("nas");
    }
}