package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzcdv extends zzaqx implements zzcdw {
    public zzcdv() {
        super("com.google.android.gms.ads.internal.signals.ISignalCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzaqx
    public final boolean zzbI(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            parcel.readString();
            parcel.readString();
            zzaqy.zzc(parcel);
        } else if (i == 2) {
            String readString = parcel.readString();
            zzaqy.zzc(parcel);
            zzb(readString);
        } else if (i != 3) {
            return false;
        } else {
            zzaqy.zzc(parcel);
            zzc(parcel.readString(), parcel.readString(), (Bundle) zzaqy.zza(parcel, Bundle.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}