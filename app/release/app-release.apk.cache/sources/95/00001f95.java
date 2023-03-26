package com.google.android.gms.internal.ads;

import com.p7700g.p99005.z1;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzboy implements zzboz {
    public final /* synthetic */ zzcga zza;

    public zzboy(zzbpa zzbpaVar, zzcga zzcgaVar) {
        this.zza = zzcgaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzboz
    public final void zza(@z1 String str) {
        this.zza.zze(new zzbsp(str));
    }

    @Override // com.google.android.gms.internal.ads.zzboz
    public final void zzb(JSONObject jSONObject) {
        this.zza.zzd(jSONObject);
    }
}