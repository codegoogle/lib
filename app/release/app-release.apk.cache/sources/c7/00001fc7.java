package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzbqu extends zzaqx implements zzbqv {
    public zzbqu() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAd");
    }

    @Override // com.google.android.gms.internal.ads.zzaqx
    public final boolean zzbI(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbqy zzbqwVar;
        if (i == 3) {
            com.google.android.gms.ads.internal.client.zzdk zzb = zzb();
            parcel2.writeNoException();
            zzaqy.zzg(parcel2, zzb);
            return true;
        } else if (i == 4) {
            zzd();
            parcel2.writeNoException();
            return true;
        } else if (i == 5) {
            IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                zzbqwVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
                zzbqwVar = queryLocalInterface instanceof zzbqy ? (zzbqy) queryLocalInterface : new zzbqw(readStrongBinder);
            }
            zzaqy.zzc(parcel);
            zzf(asInterface, zzbqwVar);
            parcel2.writeNoException();
            return true;
        } else if (i == 6) {
            IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            zzaqy.zzc(parcel);
            zze(asInterface2);
            parcel2.writeNoException();
            return true;
        } else if (i != 7) {
            return false;
        } else {
            zzbky zzc = zzc();
            parcel2.writeNoException();
            zzaqy.zzg(parcel2, zzc);
            return true;
        }
    }
}