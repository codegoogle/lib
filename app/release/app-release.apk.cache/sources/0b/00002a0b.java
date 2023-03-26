package com.google.android.gms.internal.ads;

import com.p7700g.p99005.r2;
import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfjz {
    private JSONObject zza;
    private final zzfki zzb;

    public zzfjz(zzfki zzfkiVar) {
        this.zzb = zzfkiVar;
    }

    @r2
    public final JSONObject zza() {
        return this.zza;
    }

    public final void zzb() {
        this.zzb.zzb(new zzfkj(this, null));
    }

    public final void zzc(JSONObject jSONObject, HashSet hashSet, long j) {
        this.zzb.zzb(new zzfkk(this, hashSet, jSONObject, j, null));
    }

    public final void zzd(JSONObject jSONObject, HashSet hashSet, long j) {
        this.zzb.zzb(new zzfkl(this, hashSet, jSONObject, j, null));
    }

    @r2
    public final void zze(JSONObject jSONObject) {
        this.zza = jSONObject;
    }
}