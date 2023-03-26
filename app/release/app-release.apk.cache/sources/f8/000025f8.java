package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.z1;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdxk {
    @z1
    private Long zza;
    private final String zzb;
    @z1
    private String zzc;
    @z1
    private Integer zzd;
    @z1
    private String zze;
    @z1
    private Integer zzf;

    public /* synthetic */ zzdxk(String str, zzdxj zzdxjVar) {
        this.zzb = str;
    }

    public static /* bridge */ /* synthetic */ String zza(zzdxk zzdxkVar) {
        String str = (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzhV);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("objectId", zzdxkVar.zza);
            jSONObject.put("eventCategory", zzdxkVar.zzb);
            jSONObject.putOpt("event", zzdxkVar.zzc);
            jSONObject.putOpt(IronSourceConstants.EVENTS_ERROR_CODE, zzdxkVar.zzd);
            jSONObject.putOpt("rewardType", zzdxkVar.zze);
            jSONObject.putOpt(IronSourceConstants.EVENTS_REWARD_AMOUNT, zzdxkVar.zzf);
        } catch (JSONException unused) {
            zzcfi.zzj("Could not convert parameters to JSON.");
        }
        return wo1.v(str, "(\"h5adsEvent\",", jSONObject.toString(), ");");
    }
}