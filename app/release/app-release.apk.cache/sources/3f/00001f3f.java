package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.p7700g.p99005.wo1;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzblt extends zzaqw implements zzblv {
    public zzblt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    @Override // com.google.android.gms.internal.ads.zzblv
    public final com.google.android.gms.ads.internal.client.zzdk zze() throws RemoteException {
        Parcel zzbk = zzbk(7, zza());
        com.google.android.gms.ads.internal.client.zzdk zzb = com.google.android.gms.ads.internal.client.zzdj.zzb(zzbk.readStrongBinder());
        zzbk.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzblv
    public final zzblb zzf(String str) throws RemoteException {
        zzblb zzbkzVar;
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzbk = zzbk(2, zza);
        IBinder readStrongBinder = zzbk.readStrongBinder();
        if (readStrongBinder == null) {
            zzbkzVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            zzbkzVar = queryLocalInterface instanceof zzblb ? (zzblb) queryLocalInterface : new zzbkz(readStrongBinder);
        }
        zzbk.recycle();
        return zzbkzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzblv
    public final IObjectWrapper zzg() throws RemoteException {
        return wo1.c(zzbk(9, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzblv
    public final String zzh() throws RemoteException {
        Parcel zzbk = zzbk(4, zza());
        String readString = zzbk.readString();
        zzbk.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzblv
    public final String zzi(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzbk = zzbk(1, zza);
        String readString = zzbk.readString();
        zzbk.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzblv
    public final List zzj() throws RemoteException {
        Parcel zzbk = zzbk(3, zza());
        ArrayList<String> createStringArrayList = zzbk.createStringArrayList();
        zzbk.recycle();
        return createStringArrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzblv
    public final void zzk() throws RemoteException {
        zzbl(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzblv
    public final void zzl() throws RemoteException {
        zzbl(15, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzblv
    public final void zzm(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzbl(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzblv
    public final void zzn() throws RemoteException {
        zzbl(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzblv
    public final void zzo(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, iObjectWrapper);
        zzbl(14, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzblv
    public final boolean zzp() throws RemoteException {
        Parcel zzbk = zzbk(12, zza());
        boolean zzh = zzaqy.zzh(zzbk);
        zzbk.recycle();
        return zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzblv
    public final boolean zzq(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, iObjectWrapper);
        Parcel zzbk = zzbk(10, zza);
        boolean zzh = zzaqy.zzh(zzbk);
        zzbk.recycle();
        return zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzblv
    public final boolean zzr() throws RemoteException {
        Parcel zzbk = zzbk(13, zza());
        boolean zzh = zzaqy.zzh(zzbk);
        zzbk.recycle();
        return zzh;
    }
}