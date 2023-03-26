package com.p7700g.p99005;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: BaseProxy.java */
/* loaded from: classes2.dex */
public class v22 implements IInterface {
    private final IBinder s;
    private final String t = "com.google.android.finsky.externalreferrer.IGetInstallReferrerService";

    public v22(IBinder iBinder) {
        this.s = iBinder;
    }

    public final Parcel N1() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.t);
        return obtain;
    }

    public final Parcel O1(Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.s.transact(1, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e) {
                obtain.recycle();
                throw e;
            }
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.s;
    }
}