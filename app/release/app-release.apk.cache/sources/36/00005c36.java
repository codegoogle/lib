package com.p7700g.p99005;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: IRemoteVpnStateListener.java */
/* loaded from: classes2.dex */
public interface sm1 extends IInterface {

    /* compiled from: IRemoteVpnStateListener.java */
    /* loaded from: classes2.dex */
    public static class a implements sm1 {
        @Override // com.p7700g.p99005.sm1
        public void X(nm1 nm1Var) throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.p7700g.p99005.sm1
        public void m(en1 en1Var) throws RemoteException {
        }
    }

    /* compiled from: IRemoteVpnStateListener.java */
    /* loaded from: classes2.dex */
    public static abstract class b extends Binder implements sm1 {
        private static final String s = "com.anchorfree.vpnsdk.vpnservice.IRemoteVpnStateListener";
        public static final int t = 1;
        public static final int u = 2;

        /* compiled from: IRemoteVpnStateListener.java */
        /* loaded from: classes2.dex */
        public static class a implements sm1 {
            public static sm1 s;
            private IBinder t;

            public a(IBinder iBinder) {
                this.t = iBinder;
            }

            public String N1() {
                return b.s;
            }

            @Override // com.p7700g.p99005.sm1
            public void X(nm1 nm1Var) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.s);
                    if (nm1Var != null) {
                        obtain.writeInt(1);
                        nm1Var.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.t.transact(2, obtain, null, 1) || b.O1() == null) {
                        return;
                    }
                    b.O1().X(nm1Var);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.t;
            }

            @Override // com.p7700g.p99005.sm1
            public void m(en1 en1Var) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.s);
                    if (en1Var != null) {
                        obtain.writeInt(1);
                        en1Var.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.t.transact(1, obtain, null, 1) || b.O1() == null) {
                        return;
                    }
                    b.O1().m(en1Var);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public b() {
            attachInterface(this, s);
        }

        public static sm1 N1(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(s);
            if (queryLocalInterface != null && (queryLocalInterface instanceof sm1)) {
                return (sm1) queryLocalInterface;
            }
            return new a(iBinder);
        }

        public static sm1 O1() {
            return a.s;
        }

        public static boolean P1(sm1 sm1Var) {
            if (a.s == null) {
                if (sm1Var != null) {
                    a.s = sm1Var;
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
                m(parcel.readInt() != 0 ? en1.CREATOR.createFromParcel(parcel) : null);
                return true;
            } else if (i == 2) {
                parcel.enforceInterface(s);
                X(parcel.readInt() != 0 ? nm1.CREATOR.createFromParcel(parcel) : null);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString(s);
                return true;
            }
        }
    }

    void X(nm1 nm1Var) throws RemoteException;

    void m(en1 en1Var) throws RemoteException;
}