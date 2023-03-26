package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.p7700g.p99005.wo1;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbuh extends zzaqw implements zzbuj {
    public zzbuh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbuj
    public final IObjectWrapper zze() throws RemoteException {
        return wo1.c(zzbk(1, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbuj
    public final boolean zzf() throws RemoteException {
        Parcel zzbk = zzbk(2, zza());
        boolean zzh = zzaqy.zzh(zzbk);
        zzbk.recycle();
        return zzh;
    }
}