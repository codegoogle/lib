package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.p7700g.p99005.z1;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdbf {
    private final Context zza;
    private final zzfcd zzb;
    private final Bundle zzc;
    @z1
    private final zzfby zzd;

    public /* synthetic */ zzdbf(zzdbd zzdbdVar, zzdbe zzdbeVar) {
        this.zza = zzdbd.zza(zzdbdVar);
        this.zzb = zzdbd.zzi(zzdbdVar);
        this.zzc = zzdbd.zzb(zzdbdVar);
        this.zzd = zzdbd.zzh(zzdbdVar);
    }

    public final Context zza(Context context) {
        return this.zza;
    }

    @z1
    public final Bundle zzb() {
        return this.zzc;
    }

    public final zzdbd zzc() {
        zzdbd zzdbdVar = new zzdbd();
        zzdbdVar.zzc(this.zza);
        zzdbdVar.zzf(this.zzb);
        zzdbdVar.zzd(this.zzc);
        return zzdbdVar;
    }

    @z1
    public final zzfby zzd() {
        return this.zzd;
    }

    public final zzfcd zze() {
        return this.zzb;
    }
}