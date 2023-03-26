package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzeko implements com.google.android.gms.ads.internal.zzf {
    public final /* synthetic */ zzcga zza;
    public final /* synthetic */ zzfbx zzb;
    public final /* synthetic */ zzfbl zzc;
    public final /* synthetic */ zzeku zzd;
    public final /* synthetic */ zzekp zze;

    public zzeko(zzekp zzekpVar, zzcga zzcgaVar, zzfbx zzfbxVar, zzfbl zzfblVar, zzeku zzekuVar) {
        this.zze = zzekpVar;
        this.zza = zzcgaVar;
        this.zzb = zzfbxVar;
        this.zzc = zzfblVar;
        this.zzd = zzekuVar;
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zza(View view) {
        zzeky zzekyVar;
        zzcga zzcgaVar = this.zza;
        zzekyVar = this.zze.zzd;
        zzcgaVar.zzd(zzekyVar.zza(this.zzb, this.zzc, view, this.zzd));
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zzb() {
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zzc() {
    }
}