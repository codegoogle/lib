package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzewg implements zzemw {
    public final /* synthetic */ zzewh zza;

    public zzewg(zzewh zzewhVar) {
        this.zza = zzewhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzemw
    public final void zza() {
        this.zza.zza = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0048, code lost:
        if (r0.zzc < ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(com.google.android.gms.internal.ads.zzbhz.zzej)).intValue()) goto L11;
     */
    @Override // com.google.android.gms.internal.ads.zzemw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        ViewGroup viewGroup4;
        com.google.android.gms.ads.internal.client.zzq zza;
        ViewGroup viewGroup5;
        com.google.android.gms.ads.internal.client.zzq zza2;
        zzexh zzexhVar;
        zzcfo zzcfoVar;
        zzcve zzcveVar = (zzcve) obj;
        zzcve zzcveVar2 = this.zza.zza;
        if (zzcveVar2 != null) {
            zzcveVar2.zzV();
        }
        zzewh zzewhVar = this.zza;
        zzewhVar.zza = zzcveVar;
        viewGroup = zzewhVar.zzd;
        viewGroup.removeAllViews();
        viewGroup2 = this.zza.zzd;
        View zzb = zzcveVar.zzb();
        com.google.android.gms.ads.internal.zzt.zzp();
        viewGroup2.addView(zzb, com.google.android.gms.ads.internal.util.zzs.zzn());
        if (!zzcveVar.zze()) {
            zzcfoVar = this.zza.zzi;
        }
        com.google.android.gms.ads.internal.overlay.zzr zze = zzewh.zze(this.zza, zzcveVar);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        boolean z = true;
        layoutParams.addRule(true != zzcveVar.zzh() ? 9 : 11);
        zze.zzb((!zzcveVar.zzg() || zzcveVar.zzf()) ? false : false);
        viewGroup3 = this.zza.zzd;
        viewGroup3.addView(zze, layoutParams);
        zzcveVar.zzd(this.zza);
        zzewh zzewhVar2 = this.zza;
        viewGroup4 = zzewhVar2.zzd;
        zza = zzfch.zza(zzewhVar2.zzc, Collections.singletonList(zzewhVar2.zza.zzc()));
        viewGroup4.setMinimumHeight(zza.zzc);
        zzewh zzewhVar3 = this.zza;
        viewGroup5 = zzewhVar3.zzd;
        zza2 = zzfch.zza(zzewhVar3.zzc, Collections.singletonList(zzewhVar3.zza.zzc()));
        viewGroup5.setMinimumWidth(zza2.zzf);
        zzewh zzewhVar4 = this.zza;
        zzexhVar = zzewhVar4.zzh;
        zzexhVar.zzl(new zzcvr(zzcveVar, zzewhVar4));
        zzcveVar.zzW();
    }
}