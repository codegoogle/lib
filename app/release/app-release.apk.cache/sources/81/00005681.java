package com.p7700g.p99005;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: IRemoteServerMessageListener.java */
/* loaded from: classes2.dex */
public interface pm1 extends IInterface {

    /* compiled from: IRemoteServerMessageListener.java */
    /* loaded from: classes2.dex */
    public static class a implements pm1 {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.p7700g.p99005.pm1
        public void f(String str) throws RemoteException {
        }
    }

    /* compiled from: IRemoteServerMessageListener.java */
    /* loaded from: classes2.dex */
    public static abstract class b extends Binder implements pm1 {
        private static final String s = "com.anchorfree.vpnsdk.vpnservice.IRemoteServerMessageListener";
        public static final int t = 1;

        /* compiled from: IRemoteServerMessageListener.java */
        /* loaded from: classes2.dex */
        public static class a implements pm1 {
            public static pm1 s;
            private IBinder t;

            public a(IBinder iBinder) {
                this.t = iBinder;
            }

            public String N1() {
                return b.s;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.t;
            }

            @Override // com.p7700g.p99005.pm1
            public void f(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.s);
                    obtain.writeString(str);
                    if (!this.t.transact(1, obtain, obtain2, 0) && b.O1() != null) {
                        b.O1().f(str);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public b() {
            attachInterface(this, s);
        }

        public static pm1 N1(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(s);
            if (queryLocalInterface != null && (queryLocalInterface instanceof pm1)) {
                return (pm1) queryLocalInterface;
            }
            return new a(iBinder);
        }

        public static pm1 O1() {
            return a.s;
        }

        public static boolean P1(pm1 pm1Var) {
            if (a.s == null) {
                if (pm1Var != null) {
                    a.s = pm1Var;
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
            if (i != 1) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString(s);
                return true;
            }
            parcel.enforceInterface(s);
            f(parcel.readString());
            parcel2.writeNoException();
            return true;
        }
    }

    void f(String str) throws RemoteException;
}