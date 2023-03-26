package com.google.android.gms.internal.ads;

import android.os.Binder;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.p7700g.p99005.k1;
import com.p7700g.p99005.r2;
import com.p7700g.p99005.x1;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzeay implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    public final zzcga zza = new zzcga();
    public final Object zzb = new Object();
    public boolean zzc = false;
    public boolean zzd = false;
    public zzbzv zze;
    @r2(otherwise = 3)
    @k1("mLock")
    public zzbzg zzf;

    public void onConnectionFailed(@x1 ConnectionResult connectionResult) {
        zzcfi.zze("Disconnected from remote ad request service.");
        this.zza.zze(new zzebn(1));
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        zzcfi.zze("Cannot connect to remote service, fallback to local instance.");
    }

    public final void zza() {
        synchronized (this.zzb) {
            this.zzd = true;
            if (this.zzf.isConnected() || this.zzf.isConnecting()) {
                this.zzf.disconnect();
            }
            Binder.flushPendingCommands();
        }
    }
}