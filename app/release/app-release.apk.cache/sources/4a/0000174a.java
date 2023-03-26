package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzcfi;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzel implements Runnable {
    public final /* synthetic */ zzen zza;

    public zzel(zzen zzenVar) {
        this.zza = zzenVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzeo zzeoVar = this.zza.zza;
        if (zzeo.zzb(zzeoVar) != null) {
            try {
                zzeo.zzb(zzeoVar).zze(1);
            } catch (RemoteException e) {
                zzcfi.zzk("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}