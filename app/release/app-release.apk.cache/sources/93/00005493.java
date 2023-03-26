package com.p7700g.p99005;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: IRemoteCompletableCallback.java */
/* loaded from: classes2.dex */
public interface om1 extends IInterface {

    /* compiled from: IRemoteCompletableCallback.java */
    /* loaded from: classes2.dex */
    public static class a implements om1 {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.p7700g.p99005.om1
        public void onComplete() throws RemoteException {
        }

        @Override // com.p7700g.p99005.om1
        public void r1(nm1 nm1Var) throws RemoteException {
        }
    }

    /* compiled from: IRemoteCompletableCallback.java */
    /* loaded from: classes2.dex */
    public static abstract class b extends Binder implements om1 {
        private static final String s = "com.anchorfree.vpnsdk.vpnservice.IRemoteCompletableCallback";
        public static final int t = 1;
        public static final int u = 2;

        /* compiled from: IRemoteCompletableCallback.java */
        /* loaded from: classes2.dex */
        public static class a implements om1 {
            public static om1 s;
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

            @Override // com.p7700g.p99005.om1
            public void onComplete() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.s);
                    if (this.t.transact(1, obtain, null, 1) || b.O1() == null) {
                        return;
                    }
                    b.O1().onComplete();
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.p7700g.p99005.om1
            public void r1(nm1 nm1Var) throws RemoteException {
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
                    b.O1().r1(nm1Var);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public b() {
            attachInterface(this, s);
        }

        public static om1 N1(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(s);
            if (queryLocalInterface != null && (queryLocalInterface instanceof om1)) {
                return (om1) queryLocalInterface;
            }
            return new a(iBinder);
        }

        public static om1 O1() {
            return a.s;
        }

        public static boolean P1(om1 om1Var) {
            if (a.s == null) {
                if (om1Var != null) {
                    a.s = om1Var;
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
                onComplete();
                return true;
            } else if (i == 2) {
                parcel.enforceInterface(s);
                r1(parcel.readInt() != 0 ? nm1.CREATOR.createFromParcel(parcel) : null);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString(s);
                return true;
            }
        }
    }

    void onComplete() throws RemoteException;

    void r1(nm1 nm1Var) throws RemoteException;
}