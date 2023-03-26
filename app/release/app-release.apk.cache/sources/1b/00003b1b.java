package com.p7700g.p99005;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: IRemoteCallback.java */
/* loaded from: classes3.dex */
public interface bi3 extends IInterface {

    /* compiled from: IRemoteCallback.java */
    /* loaded from: classes3.dex */
    public static class a implements bi3 {
        @Override // com.p7700g.p99005.bi3
        public void G(Bundle bundle) throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }
    }

    /* compiled from: IRemoteCallback.java */
    /* loaded from: classes3.dex */
    public static abstract class b extends Binder implements bi3 {
        private static final String s = "com.northghost.ucr.IRemoteCallback";
        public static final int t = 1;

        /* compiled from: IRemoteCallback.java */
        /* loaded from: classes3.dex */
        public static class a implements bi3 {
            public static bi3 s;
            private IBinder t;

            public a(IBinder iBinder) {
                this.t = iBinder;
            }

            @Override // com.p7700g.p99005.bi3
            public void G(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.s);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.t.transact(1, obtain, null, 1) || b.O1() == null) {
                        return;
                    }
                    b.O1().G(bundle);
                } finally {
                    obtain.recycle();
                }
            }

            public String N1() {
                return b.s;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.t;
            }
        }

        public b() {
            attachInterface(this, s);
        }

        public static bi3 N1(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(s);
            if (queryLocalInterface != null && (queryLocalInterface instanceof bi3)) {
                return (bi3) queryLocalInterface;
            }
            return new a(iBinder);
        }

        public static bi3 O1() {
            return a.s;
        }

        public static boolean P1(bi3 bi3Var) {
            if (a.s == null) {
                if (bi3Var != null) {
                    a.s = bi3Var;
                    return true;
                }
                return false;
            }
            throw new IllegalStateException("setDefaultImpl() called twice");
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface(s);
                G(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString(s);
                return true;
            }
        }
    }

    void G(Bundle bundle) throws RemoteException;
}