package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzeml implements com.google.android.gms.ads.internal.client.zza, zzdjg {
    @GuardedBy("this")
    private com.google.android.gms.ads.internal.client.zzbc zza;

    @Override // com.google.android.gms.ads.internal.client.zza
    public final synchronized void onAdClicked() {
        com.google.android.gms.ads.internal.client.zzbc zzbcVar = this.zza;
        if (zzbcVar != null) {
            try {
                zzbcVar.zzb();
            } catch (RemoteException e) {
                zzcfi.zzk("Remote Exception at onAdClicked.", e);
            }
        }
    }

    public final synchronized void zza(com.google.android.gms.ads.internal.client.zzbc zzbcVar) {
        this.zza = zzbcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final synchronized void zzq() {
        com.google.android.gms.ads.internal.client.zzbc zzbcVar = this.zza;
        if (zzbcVar != null) {
            try {
                zzbcVar.zzb();
            } catch (RemoteException e) {
                zzcfi.zzk("Remote Exception at onPhysicalClick.", e);
            }
        }
    }
}