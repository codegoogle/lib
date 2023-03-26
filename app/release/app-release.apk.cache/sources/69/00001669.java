package com.google.android.gms.ads;

import com.p7700g.p99005.pg1;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public class AdError {
    @x1
    public static final String UNDEFINED_DOMAIN = "undefined";
    private final int zza;
    @x1
    private final String zzb;
    @x1
    private final String zzc;
    @z1
    private final AdError zzd;

    public AdError(int i, @x1 String str, @x1 String str2) {
        this(i, str, str2, null);
    }

    public AdError(int i, @x1 String str, @x1 String str2, @z1 AdError adError) {
        this.zza = i;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = adError;
    }

    @z1
    public AdError getCause() {
        return this.zzd;
    }

    public int getCode() {
        return this.zza;
    }

    @x1
    public String getDomain() {
        return this.zzc;
    }

    @x1
    public String getMessage() {
        return this.zzb;
    }

    @x1
    public String toString() {
        try {
            return zzb().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }

    @x1
    public final com.google.android.gms.ads.internal.client.zze zza() {
        com.google.android.gms.ads.internal.client.zze zzeVar;
        if (this.zzd == null) {
            zzeVar = null;
        } else {
            AdError adError = this.zzd;
            zzeVar = new com.google.android.gms.ads.internal.client.zze(adError.zza, adError.zzb, adError.zzc, null, null);
        }
        return new com.google.android.gms.ads.internal.client.zze(this.zza, this.zzb, this.zzc, zzeVar, null);
    }

    @x1
    public JSONObject zzb() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("Code", this.zza);
        jSONObject.put("Message", this.zzb);
        jSONObject.put("Domain", this.zzc);
        AdError adError = this.zzd;
        if (adError == null) {
            jSONObject.put("Cause", pg1.d);
        } else {
            jSONObject.put("Cause", adError.zzb());
        }
        return jSONObject;
    }
}