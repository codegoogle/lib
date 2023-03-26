package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
public final class zzbpa implements zzbom {
    private final Object zza = new Object();
    @GuardedBy("lock")
    private final Map zzb = new HashMap();

    @Override // com.google.android.gms.internal.ads.zzbom
    public final void zza(Object obj, Map map) {
        String str = (String) map.get("id");
        String str2 = (String) map.get("fail");
        String str3 = (String) map.get("fail_reason");
        String str4 = (String) map.get("fail_stack");
        String str5 = (String) map.get("result");
        if (true == TextUtils.isEmpty(str4)) {
            str3 = "Unknown Fail Reason.";
        }
        String concat = TextUtils.isEmpty(str4) ? "" : "\n".concat(String.valueOf(str4));
        synchronized (this.zza) {
            zzboz zzbozVar = (zzboz) this.zzb.remove(str);
            if (zzbozVar == null) {
                zzcfi.zzj("Received result for unexpected method invocation: " + str);
            } else if (!TextUtils.isEmpty(str2)) {
                zzbozVar.zza(str3 + concat);
            } else if (str5 == null) {
                zzbozVar.zzb(null);
            } else {
                try {
                    JSONObject jSONObject = new JSONObject(str5);
                    if (com.google.android.gms.ads.internal.util.zze.zzc()) {
                        String jSONObject2 = jSONObject.toString(2);
                        com.google.android.gms.ads.internal.util.zze.zza("Result GMSG: " + jSONObject2);
                    }
                    zzbozVar.zzb(jSONObject);
                } catch (JSONException e) {
                    zzbozVar.zza(e.getMessage());
                }
            }
        }
    }

    public final zzfvl zzb(zzbrq zzbrqVar, String str, JSONObject jSONObject) {
        zzcga zzcgaVar = new zzcga();
        com.google.android.gms.ads.internal.zzt.zzp();
        String uuid = UUID.randomUUID().toString();
        zzc(uuid, new zzboy(this, zzcgaVar));
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", uuid);
            jSONObject2.put("args", jSONObject);
            zzbrqVar.zzl(str, jSONObject2);
        } catch (Exception e) {
            zzcgaVar.zze(e);
        }
        return zzcgaVar;
    }

    public final void zzc(String str, zzboz zzbozVar) {
        synchronized (this.zza) {
            this.zzb.put(str, zzbozVar);
        }
    }
}