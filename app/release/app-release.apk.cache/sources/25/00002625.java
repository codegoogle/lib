package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdzb implements zzdzj, zzdym {
    private final zzdzi zza;
    private final zzdzk zzb;
    private final zzdyn zzc;
    private final zzdyw zzd;
    private final zzdyl zze;
    private final String zzf;
    private boolean zzl;
    private int zzm;
    private boolean zzn;
    private String zzh = "{}";
    private String zzi = "";
    private long zzj = Long.MAX_VALUE;
    private zzdyx zzk = zzdyx.NONE;
    private zzdza zzo = zzdza.UNKNOWN;
    private final Map zzg = new HashMap();

    public zzdzb(zzdzi zzdziVar, zzdzk zzdzkVar, zzdyn zzdynVar, Context context, zzcfo zzcfoVar, zzdyw zzdywVar) {
        this.zza = zzdziVar;
        this.zzb = zzdzkVar;
        this.zzc = zzdynVar;
        this.zze = new zzdyl(context);
        this.zzf = zzcfoVar.zza;
        this.zzd = zzdywVar;
        com.google.android.gms.ads.internal.zzt.zzs().zzg(this);
    }

    private final synchronized JSONObject zzo() throws JSONException {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        for (Map.Entry entry : this.zzg.entrySet()) {
            JSONArray jSONArray = new JSONArray();
            for (zzdyp zzdypVar : (List) entry.getValue()) {
                if (zzdypVar.zzd()) {
                    jSONArray.put(zzdypVar.zzc());
                }
            }
            if (jSONArray.length() > 0) {
                jSONObject.put((String) entry.getKey(), jSONArray);
            }
        }
        return jSONObject;
    }

    private final void zzp() {
        this.zzn = true;
        this.zzd.zzc();
        this.zza.zzg(this);
        this.zzb.zzc(this);
        this.zzc.zzc(this);
        zzv(com.google.android.gms.ads.internal.zzt.zzo().zzh().zzo());
    }

    private final void zzq() {
        com.google.android.gms.ads.internal.zzt.zzo().zzh().zzG(zzc());
    }

    private final synchronized void zzr(zzdyx zzdyxVar, boolean z) {
        if (this.zzk == zzdyxVar) {
            return;
        }
        if (zzm()) {
            zzt();
        }
        this.zzk = zzdyxVar;
        if (zzm()) {
            zzu();
        }
        if (z) {
            zzq();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0036 A[Catch: all -> 0x003d, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0007, B:9:0x000b, B:11:0x001d, B:13:0x0027, B:18:0x0036, B:14:0x002b, B:16:0x0031), top: B:26:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003b A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final synchronized void zzs(boolean z, boolean z2) {
        if (this.zzl == z) {
            return;
        }
        this.zzl = z;
        if (z) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzhK)).booleanValue() || !com.google.android.gms.ads.internal.zzt.zzs().zzl()) {
                zzu();
                if (z2) {
                    return;
                }
                zzq();
                return;
            }
        }
        if (!zzm()) {
            zzt();
        }
        if (z2) {
        }
    }

    private final synchronized void zzt() {
        zzdyx zzdyxVar = zzdyx.NONE;
        int ordinal = this.zzk.ordinal();
        if (ordinal == 1) {
            this.zzb.zza();
        } else if (ordinal != 2) {
        } else {
            this.zzc.zza();
        }
    }

    private final synchronized void zzu() {
        zzdyx zzdyxVar = zzdyx.NONE;
        int ordinal = this.zzk.ordinal();
        if (ordinal == 1) {
            this.zzb.zzb();
        } else if (ordinal != 2) {
        } else {
            this.zzc.zzb();
        }
    }

    private final synchronized void zzv(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            zzs(jSONObject.optBoolean("isTestMode", false), false);
            zzr(zzdyx.zza(jSONObject.optString("gesture", "NONE")), false);
            this.zzh = jSONObject.optString("networkExtras", "{}");
            this.zzj = jSONObject.optLong("networkExtrasExpirationSecs", Long.MAX_VALUE);
        } catch (JSONException unused) {
        }
    }

    public final zzdyx zza() {
        return this.zzk;
    }

    public final synchronized String zzb() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzhv)).booleanValue() && zzm()) {
            if (this.zzj < com.google.android.gms.ads.internal.zzt.zzA().currentTimeMillis() / 1000) {
                this.zzh = "{}";
                this.zzj = Long.MAX_VALUE;
                return "";
            } else if (this.zzh.equals("{}")) {
                return "";
            } else {
                return this.zzh;
            }
        }
        return "";
    }

    public final synchronized String zzc() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        try {
            jSONObject.put("isTestMode", this.zzl);
            jSONObject.put("gesture", this.zzk);
            if (this.zzj > com.google.android.gms.ads.internal.zzt.zzA().currentTimeMillis() / 1000) {
                jSONObject.put("networkExtras", this.zzh);
                jSONObject.put("networkExtrasExpirationSecs", this.zzj);
            }
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    public final synchronized JSONObject zzd() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        try {
            jSONObject.put("platform", "ANDROID");
            jSONObject.put("internalSdkVersion", this.zzf);
            jSONObject.put("adapters", this.zzd.zza());
            if (this.zzj < com.google.android.gms.ads.internal.zzt.zzA().currentTimeMillis() / 1000) {
                this.zzh = "{}";
            }
            jSONObject.put("networkExtras", this.zzh);
            jSONObject.put("adSlots", zzo());
            jSONObject.put("appInfo", this.zze.zza());
            String zzc = com.google.android.gms.ads.internal.zzt.zzo().zzh().zzh().zzc();
            if (!TextUtils.isEmpty(zzc)) {
                jSONObject.put("cld", new JSONObject(zzc));
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzhL)).booleanValue() && !TextUtils.isEmpty(this.zzi)) {
                String str = this.zzi;
                zzcfi.zze("Policy violation data: " + str);
                jSONObject.put("policyViolations", new JSONObject(this.zzi));
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzhK)).booleanValue()) {
                jSONObject.put("openAction", this.zzo);
                jSONObject.put("gesture", this.zzk);
            }
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.zzt.zzo().zzs(e, "Inspector.toJson");
            zzcfi.zzk("Ad inspector encountered an error", e);
        }
        return jSONObject;
    }

    public final synchronized void zze(String str, zzdyp zzdypVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzhv)).booleanValue() && zzm()) {
            if (this.zzm >= ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzhx)).intValue()) {
                zzcfi.zzj("Maximum number of ad requests stored reached. Dropping the current request.");
                return;
            }
            if (!this.zzg.containsKey(str)) {
                this.zzg.put(str, new ArrayList());
            }
            this.zzm++;
            ((List) this.zzg.get(str)).add(zzdypVar);
        }
    }

    public final void zzf() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzhv)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzhK)).booleanValue() && com.google.android.gms.ads.internal.zzt.zzo().zzh().zzO()) {
                zzp();
                return;
            }
            String zzo = com.google.android.gms.ads.internal.zzt.zzo().zzh().zzo();
            if (TextUtils.isEmpty(zzo)) {
                return;
            }
            try {
                if (new JSONObject(zzo).optBoolean("isTestMode", false)) {
                    zzp();
                }
            } catch (JSONException unused) {
            }
        }
    }

    public final synchronized void zzg(com.google.android.gms.ads.internal.client.zzcy zzcyVar, zzdza zzdzaVar) {
        if (!zzm()) {
            try {
                zzcyVar.zze(zzfdc.zzd(18, null, null));
                return;
            } catch (RemoteException unused) {
                zzcfi.zzj("Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.");
                return;
            }
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzhv)).booleanValue()) {
            try {
                zzcyVar.zze(zzfdc.zzd(1, null, null));
                return;
            } catch (RemoteException unused2) {
                zzcfi.zzj("Ad inspector had an internal error.");
                return;
            }
        }
        this.zzo = zzdzaVar;
        this.zza.zzi(zzcyVar, new zzbon(this));
        return;
    }

    public final synchronized void zzh(String str, long j) {
        this.zzh = str;
        this.zzj = j;
        zzq();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000a, code lost:
        if (r2 != false) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzi(boolean z) {
        if (!this.zzn) {
            if (z) {
                zzp();
                if (!this.zzl) {
                    zzu();
                    return;
                }
            }
            if (zzm()) {
                return;
            }
            zzt();
        }
    }

    public final void zzj(zzdyx zzdyxVar) {
        zzr(zzdyxVar, true);
    }

    public final synchronized void zzk(String str) {
        this.zzi = str;
    }

    public final void zzl(boolean z) {
        if (!this.zzn && z) {
            zzp();
        }
        zzs(z, true);
    }

    public final synchronized boolean zzm() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzhK)).booleanValue()) {
            return this.zzl || com.google.android.gms.ads.internal.zzt.zzs().zzl();
        }
        return this.zzl;
    }

    public final synchronized boolean zzn() {
        return this.zzl;
    }
}