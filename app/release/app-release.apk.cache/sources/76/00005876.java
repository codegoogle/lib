package com.p7700g.p99005;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: IRemoteTrafficListener.java */
/* loaded from: classes2.dex */
public interface qm1 extends IInterface {

    /* compiled from: IRemoteTrafficListener.java */
    /* loaded from: classes2.dex */
    public static class a implements qm1 {
        @Override // com.p7700g.p99005.qm1
        public void a(long j, long j2) throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }
    }

    /* compiled from: IRemoteTrafficListener.java */
    /* loaded from: classes2.dex */
    public static abstract class b extends Binder implements qm1 {
        private static final String s = "com.anchorfree.vpnsdk.vpnservice.IRemoteTrafficListener";
        public static final int t = 1;

        /* compiled from: IRemoteTrafficListener.java */
        /* loaded from: classes2.dex */
        public static class a implements qm1 {
            public static qm1 s;
            private IBinder t;

            public a(IBinder iBinder) {
                this.t = iBinder;
            }

            public String N1() {
                return b.s;
            }

            @Override // com.p7700g.p99005.qm1
            public void a(long j, long j2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.s);
                    obtain.writeLong(j);
                    obtain.writeLong(j2);
                    if (!this.t.transact(1, obtain, obtain2, 0) && b.O1() != null) {
                        b.O1().a(j, j2);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.t;
            }
        }

        public b() {
            attachInterface(this, s);
        }

        public static qm1 N1(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(s);
            if (queryLocalInterface != null && (queryLocalInterface instanceof qm1)) {
                return (qm1) queryLocalInterface;
            }
            return new a(iBinder);
        }

        public static qm1 O1() {
            return a.s;
        }

        public static boolean P1(qm1 qm1Var) {
            if (a.s == null) {
                if (qm1Var != null) {
                    a.s = qm1Var;
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
            a(parcel.readLong(), parcel.readLong());
            parcel2.writeNoException();
            return true;
        }
    }

    void a(long j, long j2) throws RemoteException;
}