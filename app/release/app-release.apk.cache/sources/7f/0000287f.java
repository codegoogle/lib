package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.microsoft.appcenter.ingestion.models.AbstractLog;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzevi implements zzetf {
    private final Bundle zza;

    public zzevi(Bundle bundle) {
        this.zza = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzetf
    public final /* bridge */ /* synthetic */ void zzf(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        if (this.zza != null) {
            try {
                com.google.android.gms.ads.internal.util.zzbu.zzf(com.google.android.gms.ads.internal.util.zzbu.zzf(jSONObject, AbstractLog.DEVICE), "play_store").put("parental_controls", com.google.android.gms.ads.internal.client.zzaw.zzb().zzh(this.zza));
            } catch (JSONException unused) {
                com.google.android.gms.ads.internal.util.zze.zza("Failed putting parental controls bundle.");
            }
        }
    }
}