package com.google.android.gms.internal.ads;

import com.p7700g.p99005.z1;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbtl implements zzboz {
    public final /* synthetic */ zzbtm zza;
    private final zzcga zzb;

    public zzbtl(zzbtm zzbtmVar, zzcga zzcgaVar) {
        this.zza = zzbtmVar;
        this.zzb = zzcgaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzboz
    public final void zza(@z1 String str) {
        try {
            if (str == null) {
                this.zzb.zze(new zzbsp());
            } else {
                this.zzb.zze(new zzbsp(str));
            }
        } catch (IllegalStateException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzboz
    public final void zzb(JSONObject jSONObject) {
        try {
            this.zzb.zzd(jSONObject);
        } catch (IllegalStateException unused) {
        } catch (JSONException e) {
            this.zzb.zze(e);
        }
    }
}