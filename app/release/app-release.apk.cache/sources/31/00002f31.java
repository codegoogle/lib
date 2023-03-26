package com.google.android.gms.internal.ads;

import com.p7700g.p99005.z1;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzvn {
    public final int zza;
    public final zzjv[] zzb;
    public final zzvg[] zzc;
    public final zzct zzd;
    @z1
    public final Object zze;

    public zzvn(zzjv[] zzjvVarArr, zzvg[] zzvgVarArr, zzct zzctVar, @z1 Object obj) {
        this.zzb = zzjvVarArr;
        this.zzc = (zzvg[]) zzvgVarArr.clone();
        this.zzd = zzctVar;
        this.zze = obj;
        this.zza = zzjvVarArr.length;
    }

    public final boolean zza(@z1 zzvn zzvnVar, int i) {
        return zzvnVar != null && zzeg.zzS(this.zzb[i], zzvnVar.zzb[i]) && zzeg.zzS(this.zzc[i], zzvnVar.zzc[i]);
    }

    public final boolean zzb(int i) {
        return this.zzb[i] != null;
    }
}