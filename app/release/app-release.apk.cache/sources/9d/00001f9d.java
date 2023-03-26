package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbpf extends zzaqw implements zzbph {
    public zzbpf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final void zzb(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzbl(1, zza);
    }
}