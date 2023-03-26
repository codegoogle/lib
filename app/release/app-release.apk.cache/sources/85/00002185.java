package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzchg {
    private final Context zza;
    private final zzchr zzb;
    private final ViewGroup zzc;
    private zzchf zzd;

    public zzchg(Context context, ViewGroup viewGroup, zzcli zzcliVar) {
        this.zza = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzc = viewGroup;
        this.zzb = zzcliVar;
        this.zzd = null;
    }

    public final zzchf zza() {
        return this.zzd;
    }

    public final void zzb(int i, int i2, int i3, int i4) {
        Preconditions.checkMainThread("The underlay may only be modified from the UI thread.");
        zzchf zzchfVar = this.zzd;
        if (zzchfVar != null) {
            zzchfVar.zzE(i, i2, i3, i4);
        }
    }

    public final void zzc(int i, int i2, int i3, int i4, int i5, boolean z, zzchq zzchqVar) {
        if (this.zzd != null) {
            return;
        }
        zzbig.zza(this.zzb.zzo().zza(), this.zzb.zzn(), "vpr2");
        Context context = this.zza;
        zzchr zzchrVar = this.zzb;
        zzchf zzchfVar = new zzchf(context, zzchrVar, i5, z, zzchrVar.zzo().zza(), zzchqVar);
        this.zzd = zzchfVar;
        this.zzc.addView(zzchfVar, 0, new ViewGroup.LayoutParams(-1, -1));
        this.zzd.zzE(i, i2, i3, i4);
        this.zzb.zzB(false);
    }

    public final void zzd() {
        Preconditions.checkMainThread("onDestroy must be called from the UI thread.");
        zzchf zzchfVar = this.zzd;
        if (zzchfVar != null) {
            zzchfVar.zzn();
            this.zzc.removeView(this.zzd);
            this.zzd = null;
        }
    }

    public final void zze() {
        Preconditions.checkMainThread("onPause must be called from the UI thread.");
        zzchf zzchfVar = this.zzd;
        if (zzchfVar != null) {
            zzchfVar.zzt();
        }
    }

    public final void zzf(int i) {
        zzchf zzchfVar = this.zzd;
        if (zzchfVar != null) {
            zzchfVar.zzB(i);
        }
    }
}