package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzeky {
    private final zzdky zza;

    public zzeky(Context context, zzdky zzdkyVar) {
        this.zza = zzdkyVar;
    }

    public final /* bridge */ /* synthetic */ Object zza(zzfbx zzfbxVar, zzfbl zzfblVar, View view, zzeku zzekuVar) {
        zzdka zze = this.zza.zze(new zzcym(zzfbxVar, zzfblVar, null), new zzekw(this, zzekv.zza));
        zzekuVar.zzd(new zzekx(this, zze));
        return zze.zzg();
    }
}