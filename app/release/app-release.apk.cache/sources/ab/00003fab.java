package com.p7700g.p99005;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: ITrustedWebActivityCallback.java */
/* loaded from: classes.dex */
public interface e extends IInterface {

    /* compiled from: ITrustedWebActivityCallback.java */
    /* loaded from: classes.dex */
    public static class a implements e {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.p7700g.p99005.e
        public void z1(String str, Bundle bundle) throws RemoteException {
        }
    }

    /* compiled from: ITrustedWebActivityCallback.java */
    /* loaded from: classes.dex */
    public static abstract class b extends Binder implements e {
        private static final String s = "android.support.customtabs.trusted.ITrustedWebActivityCallback";
        public static final int t = 2;

        /* compiled from: ITrustedWebActivityCallback.java */
        /* loaded from: classes.dex */
        public static class a implements e {
            public static e s;
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

            @Override // com.p7700g.p99005.e
            public void z1(String str, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.s);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.t.transact(2, obtain, obtain2, 0) && b.O1() != null) {
                        b.O1().z1(str, bundle);
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

        public static e N1(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(s);
            if (queryLocalInterface != null && (queryLocalInterface instanceof e)) {
                return (e) queryLocalInterface;
            }
            return new a(iBinder);
        }

        public static e O1() {
            return a.s;
        }

        public static boolean P1(e eVar) {
            if (a.s == null) {
                if (eVar != null) {
                    a.s = eVar;
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
            if (i != 2) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString(s);
                return true;
            }
            parcel.enforceInterface(s);
            z1(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
            parcel2.writeNoException();
            return true;
        }
    }

    void z1(String str, Bundle bundle) throws RemoteException;
}