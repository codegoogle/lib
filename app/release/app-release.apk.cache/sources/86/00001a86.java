package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.p7700g.p99005.r0;
import com.p7700g.p99005.z1;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public final class zzg extends zza {
    public final /* synthetic */ BaseGmsClient zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @r0
    public zzg(BaseGmsClient baseGmsClient, @z1 int i, Bundle bundle) {
        super(baseGmsClient, i, null);
        this.zze = baseGmsClient;
    }

    @Override // com.google.android.gms.common.internal.zza
    public final void zzb(ConnectionResult connectionResult) {
        if (this.zze.enableLocalFallback() && BaseGmsClient.zzo(this.zze)) {
            BaseGmsClient.zzk(this.zze, 16);
            return;
        }
        this.zze.zzc.onReportServiceBinding(connectionResult);
        this.zze.onConnectionFailed(connectionResult);
    }

    @Override // com.google.android.gms.common.internal.zza
    public final boolean zzd() {
        this.zze.zzc.onReportServiceBinding(ConnectionResult.RESULT_SUCCESS);
        return true;
    }
}