package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@20.1.2 */
/* loaded from: classes2.dex */
public final class zzdy extends zzdt {
    public final /* synthetic */ Activity zza;
    public final /* synthetic */ zzed zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdy(zzed zzedVar, Activity activity) {
        super(zzedVar.zza, true);
        this.zzb = zzedVar;
        this.zza = activity;
    }

    @Override // com.google.android.gms.internal.measurement.zzdt
    public final void zza() throws RemoteException {
        zzcc zzccVar;
        zzccVar = this.zzb.zza.zzj;
        ((zzcc) Preconditions.checkNotNull(zzccVar)).onActivityResumed(ObjectWrapper.wrap(this.zza), this.zzi);
    }
}