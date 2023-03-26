package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbmg extends zzaqw implements zzbmi {
    public zzbmg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbmi
    public final void zze(zzblv zzblvVar) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, zzblvVar);
        zzbl(1, zza);
    }
}