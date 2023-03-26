package com.google.android.gms.internal.appset;

import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.p7700g.p99005.z1;

/* compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
/* loaded from: classes2.dex */
public final class zzo extends zze {
    public final /* synthetic */ TaskCompletionSource zza;

    public zzo(zzp zzpVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.appset.zzf
    public final void zzb(Status status, @z1 com.google.android.gms.appset.zzc zzcVar) {
        TaskUtil.setResultOrApiException(status, zzcVar != null ? new AppSetIdInfo(zzcVar.zzb(), zzcVar.zza()) : null, this.zza);
    }
}