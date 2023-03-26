package com.p7700g.p99005;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: IUnusedAppRestrictionsBackportCallback.java */
/* loaded from: classes.dex */
public interface ah extends IInterface {

    /* compiled from: IUnusedAppRestrictionsBackportCallback.java */
    /* loaded from: classes.dex */
    public static class a implements ah {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.p7700g.p99005.ah
        public void q1(boolean z, boolean z2) throws RemoteException {
        }
    }

    /* compiled from: IUnusedAppRestrictionsBackportCallback.java */
    /* loaded from: classes.dex */
    public static abstract class b extends Binder implements ah {
        private static final String s = "androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback";
        public static final int t = 1;

        /* compiled from: IUnusedAppRestrictionsBackportCallback.java */
        /* loaded from: classes.dex */
        public static class a implements ah {
            public static ah s;
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

            @Override // com.p7700g.p99005.ah
            public void q1(boolean z, boolean z2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.s);
                    obtain.writeInt(z ? 1 : 0);
                    obtain.writeInt(z2 ? 1 : 0);
                    if (this.t.transact(1, obtain, null, 1) || b.O1() == null) {
                        return;
                    }
                    b.O1().q1(z, z2);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public b() {
            attachInterface(this, s);
        }

        public static ah N1(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(s);
            if (queryLocalInterface != null && (queryLocalInterface instanceof ah)) {
                return (ah) queryLocalInterface;
            }
            return new a(iBinder);
        }

        public static ah O1() {
            return a.s;
        }

        public static boolean P1(ah ahVar) {
            if (a.s == null) {
                if (ahVar != null) {
                    a.s = ahVar;
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
                q1(parcel.readInt() != 0, parcel.readInt() != 0);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString(s);
                return true;
            }
        }
    }

    void q1(boolean z, boolean z2) throws RemoteException;
}