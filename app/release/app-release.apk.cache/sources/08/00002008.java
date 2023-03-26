package com.google.android.gms.internal.ads;

import com.p7700g.p99005.z1;
import java.util.UUID;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
public final class zzbte implements zzbsq {
    private final zzbss zza;
    private final zzbst zzb;
    private final zzbsm zzc;
    private final String zzd;

    public zzbte(zzbsm zzbsmVar, String str, zzbst zzbstVar, zzbss zzbssVar) {
        this.zzc = zzbsmVar;
        this.zzd = str;
        this.zzb = zzbstVar;
        this.zza = zzbssVar;
    }

    public static /* bridge */ /* synthetic */ void zzd(zzbte zzbteVar, zzbsg zzbsgVar, zzbsn zzbsnVar, Object obj, zzcga zzcgaVar) {
        try {
            com.google.android.gms.ads.internal.zzt.zzp();
            String uuid = UUID.randomUUID().toString();
            zzbol.zzo.zzc(uuid, new zzbtd(zzbteVar, zzbsgVar, zzcgaVar));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", uuid);
            jSONObject.put("args", zzbteVar.zzb.zzb(obj));
            zzbsnVar.zzl(zzbteVar.zzd, jSONObject);
        } catch (Exception e) {
            try {
                zzcgaVar.zze(e);
                zzcfi.zzh("Unable to invokeJavascript", e);
            } finally {
                zzbsgVar.zzb();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfuj
    public final zzfvl zza(@z1 Object obj) throws Exception {
        return zzb(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzbsq
    public final zzfvl zzb(Object obj) {
        zzcga zzcgaVar = new zzcga();
        zzbsg zzb = this.zzc.zzb(null);
        zzb.zzi(new zzbtb(this, zzb, obj, zzcgaVar), new zzbtc(this, zzcgaVar, zzb));
        return zzcgaVar;
    }
}