package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.z1;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbqd implements BaseGmsClient.BaseConnectionCallbacks {
    public final /* synthetic */ zzcga zza;
    public final /* synthetic */ zzbqf zzb;

    public zzbqd(zzbqf zzbqfVar, zzcga zzcgaVar) {
        this.zzb = zzbqfVar;
        this.zza = zzcgaVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(@z1 Bundle bundle) {
        zzbps zzbpsVar;
        try {
            zzcga zzcgaVar = this.zza;
            zzbpsVar = this.zzb.zza;
            zzcgaVar.zzd(zzbpsVar.zzp());
        } catch (DeadObjectException e) {
            this.zza.zze(e);
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        this.zza.zze(new RuntimeException(wo1.l("onConnectionSuspended: ", i)));
    }
}