package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.p7700g.p99005.x1;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbqe implements BaseGmsClient.BaseOnConnectionFailedListener {
    public final /* synthetic */ zzcga zza;

    public zzbqe(zzbqf zzbqfVar, zzcga zzcgaVar) {
        this.zza = zzcgaVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(@x1 ConnectionResult connectionResult) {
        this.zza.zze(new RuntimeException("Connection failed."));
    }
}