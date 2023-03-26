package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.p7700g.p99005.z1;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzems {
    private final zzemx zza;
    private final String zzb;
    @GuardedBy("this")
    @z1
    private com.google.android.gms.ads.internal.client.zzdh zzc;

    public zzems(zzemx zzemxVar, String str) {
        this.zza = zzemxVar;
        this.zzb = str;
    }

    @z1
    public final synchronized String zza() {
        com.google.android.gms.ads.internal.client.zzdh zzdhVar;
        try {
            zzdhVar = this.zzc;
        } catch (RemoteException e) {
            zzcfi.zzl("#007 Could not call remote method.", e);
            return null;
        }
        return zzdhVar != null ? zzdhVar.zzg() : null;
    }

    @z1
    public final synchronized String zzb() {
        com.google.android.gms.ads.internal.client.zzdh zzdhVar;
        try {
            zzdhVar = this.zzc;
        } catch (RemoteException e) {
            zzcfi.zzl("#007 Could not call remote method.", e);
            return null;
        }
        return zzdhVar != null ? zzdhVar.zzg() : null;
    }

    public final synchronized void zzd(com.google.android.gms.ads.internal.client.zzl zzlVar, int i) throws RemoteException {
        this.zzc = null;
        this.zza.zzb(zzlVar, this.zzb, new zzemy(i), new zzemr(this));
    }

    public final synchronized boolean zze() throws RemoteException {
        return this.zza.zza();
    }
}