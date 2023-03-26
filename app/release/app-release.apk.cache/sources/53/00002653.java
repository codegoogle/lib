package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.anythink.core.api.ATAdConst;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzeat {
    private final zzcnf zza;
    private final Context zzb;
    private final zzcfo zzc;
    private final zzfcd zzd;
    private final Executor zze;
    private final String zzf;
    private final zzfhs zzg;
    private final zzfcp zzh;
    private final zzdwc zzi;

    public zzeat(zzcnf zzcnfVar, Context context, zzcfo zzcfoVar, zzfcd zzfcdVar, Executor executor, String str, zzfhs zzfhsVar, zzdwc zzdwcVar) {
        this.zza = zzcnfVar;
        this.zzb = context;
        this.zzc = zzcfoVar;
        this.zzd = zzfcdVar;
        this.zze = executor;
        this.zzf = str;
        this.zzg = zzfhsVar;
        this.zzh = zzcnfVar.zzv();
        this.zzi = zzdwcVar;
    }

    private final zzfvl zzc(final String str, final String str2) {
        zzfhh zza = zzfhg.zza(this.zzb, 11);
        zza.zzf();
        zzbta zza2 = com.google.android.gms.ads.internal.zzt.zzf().zza(this.zzb, this.zzc, this.zza.zzy());
        zzbsu zzbsuVar = zzbsx.zza;
        final zzbsq zza3 = zza2.zza("google.afma.response.normalize", zzbsuVar, zzbsuVar);
        zzfvl zzn = zzfvc.zzn(zzfvc.zzn(zzfvc.zzn(zzfvc.zzi(""), new zzfuj() { // from class: com.google.android.gms.internal.ads.zzeaq
            @Override // com.google.android.gms.internal.ads.zzfuj
            public final zzfvl zza(Object obj) {
                String str3 = str;
                String str4 = str2;
                String str5 = (String) obj;
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("headers", new JSONObject());
                    jSONObject3.put("body", str3);
                    jSONObject2.put("base_url", "");
                    jSONObject2.put("signals", new JSONObject(str4));
                    jSONObject.put("request", jSONObject2);
                    jSONObject.put("response", jSONObject3);
                    jSONObject.put("flags", new JSONObject());
                    return zzfvc.zzi(jSONObject);
                } catch (JSONException e) {
                    throw new JSONException("Preloaded loader: ".concat(String.valueOf(e.getMessage())));
                }
            }
        }, this.zze), new zzfuj() { // from class: com.google.android.gms.internal.ads.zzear
            @Override // com.google.android.gms.internal.ads.zzfuj
            public final zzfvl zza(Object obj) {
                return zzbsq.this.zzb((JSONObject) obj);
            }
        }, this.zze), new zzfuj() { // from class: com.google.android.gms.internal.ads.zzeas
            @Override // com.google.android.gms.internal.ads.zzfuj
            public final zzfvl zza(Object obj) {
                return zzeat.this.zzb((JSONObject) obj);
            }
        }, this.zze);
        zzfhr.zza(zzn, this.zzg, zza);
        return zzn;
    }

    private final String zzd(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = jSONObject.getJSONArray("ad_types");
            if (jSONArray != null && "unknown".equals(jSONArray.getString(0))) {
                jSONObject.put("ad_types", new JSONArray().put(this.zzf));
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            zzcfi.zzj("Failed to update the ad types for rendering. ".concat(e.toString()));
            return str;
        }
    }

    private static final String zze(String str) {
        try {
            return new JSONObject(str).optString(ATAdConst.NETWORK_CUSTOM_KEY.NETWORK_REQUEST_ID, "");
        } catch (JSONException unused) {
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00a2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzfvl zza() {
        Boolean bool;
        String str = this.zzd.zzd.zzx;
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzfU)).booleanValue()) {
                String zze = zze(str);
                zzbhr zzbhrVar = zzbhz.zzgg;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhrVar)).booleanValue() && zze.isEmpty()) {
                    int lastIndexOf = str.lastIndexOf("&request_id=");
                    zze = lastIndexOf != -1 ? str.substring(lastIndexOf + 12) : "";
                }
                if (TextUtils.isEmpty(zze)) {
                    return zzfvc.zzh(new zzeit(15, "Invalid ad string."));
                }
                String zzb = this.zza.zzm().zzb(zze, this.zzi);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhrVar)).booleanValue()) {
                    zzdwc zzdwcVar = this.zzi;
                    if (!TextUtils.isEmpty(zzb)) {
                        if (new JSONObject(zzb).optString("is_gbid").equals("true")) {
                            bool = Boolean.TRUE;
                            if (bool.booleanValue()) {
                                try {
                                    int lastIndexOf2 = str.lastIndexOf("&");
                                    String str2 = null;
                                    byte[] decode = Base64.decode(lastIndexOf2 != -1 ? str.substring(0, lastIndexOf2) : null, 11);
                                    byte[] bytes = zze.getBytes("UTF-8");
                                    try {
                                        str2 = new JSONObject(zzb).getString("arek");
                                    } catch (JSONException e) {
                                        com.google.android.gms.ads.internal.util.zze.zza("Failed to get key from QueryJSONMap".concat(e.toString()));
                                        com.google.android.gms.ads.internal.zzt.zzo().zzt(e, "CryptoUtils.getKeyFromQueryJsonMap");
                                    }
                                    str = zzfcp.zzb(decode, bytes, str2, zzdwcVar);
                                } catch (UnsupportedEncodingException e2) {
                                    com.google.android.gms.ads.internal.util.zze.zza("Failed to decode the adResponse. ".concat(e2.toString()));
                                    com.google.android.gms.ads.internal.zzt.zzo().zzt(e2, "PreloadedLoader.decryptAdResponseIfNecessary");
                                }
                            }
                        }
                        bool = Boolean.FALSE;
                        if (bool.booleanValue()) {
                        }
                    }
                }
                if (!TextUtils.isEmpty(zzb)) {
                    return zzc(str, zzd(zzb));
                }
            }
        }
        com.google.android.gms.ads.internal.client.zzc zzcVar = this.zzd.zzd.zzs;
        if (zzcVar != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzfS)).booleanValue()) {
                String zze2 = zze(zzcVar.zza);
                String zze3 = zze(zzcVar.zzb);
                if (!TextUtils.isEmpty(zze3) && zze2.equals(zze3)) {
                    this.zza.zzm().zzf(zze2);
                    this.zzi.zza().put("rid", zze2);
                } else {
                    this.zzi.zza().put("ridmm", "true");
                }
            }
            return zzc(zzcVar.zza, zzd(zzcVar.zzb));
        }
        return zzfvc.zzh(new zzeit(14, "Mismatch request IDs."));
    }

    public final /* synthetic */ zzfvl zzb(JSONObject jSONObject) throws Exception {
        return zzfvc.zzi(new zzfbx(new zzfbu(this.zzd), zzfbw.zza(new StringReader(jSONObject.toString()))));
    }
}