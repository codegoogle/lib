package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.p7700g.p99005.x1;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbct implements BaseGmsClient.BaseOnConnectionFailedListener {
    public final /* synthetic */ zzbcu zza;

    public zzbct(zzbcu zzbcuVar) {
        this.zza = zzbcuVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(@x1 ConnectionResult connectionResult) {
        Object obj;
        zzbcx zzbcxVar;
        Object obj2;
        obj = this.zza.zzb;
        synchronized (obj) {
            this.zza.zze = null;
            zzbcu zzbcuVar = this.zza;
            zzbcxVar = zzbcuVar.zzc;
            if (zzbcxVar != null) {
                zzbcuVar.zzc = null;
            }
            obj2 = this.zza.zzb;
            obj2.notifyAll();
        }
    }
}