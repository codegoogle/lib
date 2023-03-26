package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdeh implements Runnable {
    private final WeakReference zza;

    public /* synthetic */ zzdeh(zzdei zzdeiVar, zzdeg zzdegVar) {
        this.zza = new WeakReference(zzdeiVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzdei zzdeiVar = (zzdei) this.zza.get();
        if (zzdeiVar != null) {
            zzdeiVar.zzo(zzdef.zza);
        }
    }
}