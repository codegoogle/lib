package com.google.android.gms.internal.ads;

import android.view.View;
import com.p7700g.p99005.z1;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzcve extends zzcxx {
    private final View zzc;
    @z1
    private final zzcli zzd;
    private final zzfbm zze;
    private final int zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final zzcuw zzi;
    @z1
    private zzbck zzj;

    public zzcve(zzcxw zzcxwVar, View view, @z1 zzcli zzcliVar, zzfbm zzfbmVar, int i, boolean z, boolean z2, zzcuw zzcuwVar) {
        super(zzcxwVar);
        this.zzc = view;
        this.zzd = zzcliVar;
        this.zze = zzfbmVar;
        this.zzf = i;
        this.zzg = z;
        this.zzh = z2;
        this.zzi = zzcuwVar;
    }

    public final int zza() {
        return this.zzf;
    }

    public final View zzb() {
        return this.zzc;
    }

    public final zzfbm zzc() {
        return zzfch.zzb(this.zzb.zzs, this.zze);
    }

    public final void zzd(zzbca zzbcaVar) {
        this.zzd.zzaj(zzbcaVar);
    }

    public final boolean zze() {
        return this.zzg;
    }

    public final boolean zzf() {
        return this.zzh;
    }

    public final boolean zzg() {
        return this.zzd.zzay();
    }

    public final boolean zzh() {
        return this.zzd.zzP() != null && this.zzd.zzP().zzJ();
    }

    public final void zzi(long j, int i) {
        this.zzi.zza(j, i);
    }

    @z1
    public final zzbck zzj() {
        return this.zzj;
    }

    public final void zzk(zzbck zzbckVar) {
        this.zzj = zzbckVar;
    }
}