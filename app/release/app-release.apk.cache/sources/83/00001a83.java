package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.util.VisibleForTesting;
import com.p7700g.p99005.r0;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@VisibleForTesting
/* loaded from: classes2.dex */
public final class zzd extends zzab {
    @z1
    private BaseGmsClient zza;
    private final int zzb;

    public zzd(@x1 BaseGmsClient baseGmsClient, int i) {
        this.zza = baseGmsClient;
        this.zzb = i;
    }

    @Override // com.google.android.gms.common.internal.IGmsCallbacks
    @r0
    public final void onPostInitComplete(int i, @x1 IBinder iBinder, @z1 Bundle bundle) {
        Preconditions.checkNotNull(this.zza, "onPostInitComplete can be called only once per call to getRemoteService");
        this.zza.onPostInitHandler(i, iBinder, bundle, this.zzb);
        this.zza = null;
    }

    @Override // com.google.android.gms.common.internal.IGmsCallbacks
    @r0
    public final void zzb(int i, @z1 Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }

    @Override // com.google.android.gms.common.internal.IGmsCallbacks
    @r0
    public final void zzc(int i, @x1 IBinder iBinder, @x1 zzj zzjVar) {
        BaseGmsClient baseGmsClient = this.zza;
        Preconditions.checkNotNull(baseGmsClient, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        Preconditions.checkNotNull(zzjVar);
        BaseGmsClient.zzj(baseGmsClient, zzjVar);
        onPostInitComplete(i, iBinder, zzjVar.zza);
    }
}