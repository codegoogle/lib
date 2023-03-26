package com.p7700g.p99005;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: IRemoteVpnDataCallback.java */
/* loaded from: classes2.dex */
public interface rm1 extends IInterface {

    /* compiled from: IRemoteVpnDataCallback.java */
    /* loaded from: classes2.dex */
    public static class a implements rm1 {
        @Override // com.p7700g.p99005.rm1
        public void J1(Bundle bundle) throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }
    }

    /* compiled from: IRemoteVpnDataCallback.java */
    /* loaded from: classes2.dex */
    public static abstract class b extends Binder implements rm1 {
        private static final String s = "com.anchorfree.vpnsdk.vpnservice.IRemoteVpnDataCallback";
        public static final int t = 1;

        /* compiled from: IRemoteVpnDataCallback.java */
        /* loaded from: classes2.dex */
        public static class a implements rm1 {
            public static rm1 s;
            private IBinder t;

            public a(IBinder iBinder) {
                this.t = iBinder;
            }

            @Override // com.p7700g.p99005.rm1
            public void J1(Bundle bundle) throws RemoteException {
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
                    b.O1().J1(bundle);
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

        public static rm1 N1(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(s);
            if (queryLocalInterface != null && (queryLocalInterface instanceof rm1)) {
                return (rm1) queryLocalInterface;
            }
            return new a(iBinder);
        }

        public static rm1 O1() {
            return a.s;
        }

        public static boolean P1(rm1 rm1Var) {
            if (a.s == null) {
                if (rm1Var != null) {
                    a.s = rm1Var;
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
                J1(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString(s);
                return true;
            }
        }
    }

    void J1(Bundle bundle) throws RemoteException;
}