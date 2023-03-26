package com.p7700g.p99005;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.p7700g.p99005.b;

/* compiled from: IPostMessageService.java */
/* loaded from: classes.dex */
public interface d extends IInterface {

    /* compiled from: IPostMessageService.java */
    /* loaded from: classes.dex */
    public static class a implements d {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.p7700g.p99005.d
        public void o0(com.p7700g.p99005.b bVar, Bundle bundle) throws RemoteException {
        }

        @Override // com.p7700g.p99005.d
        public void y0(com.p7700g.p99005.b bVar, String str, Bundle bundle) throws RemoteException {
        }
    }

    /* compiled from: IPostMessageService.java */
    /* loaded from: classes.dex */
    public static abstract class b extends Binder implements d {
        private static final String s = "android.support.customtabs.IPostMessageService";
        public static final int t = 2;
        public static final int u = 3;

        /* compiled from: IPostMessageService.java */
        /* loaded from: classes.dex */
        public static class a implements d {
            public static d s;
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

            @Override // com.p7700g.p99005.d
            public void o0(com.p7700g.p99005.b bVar, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.s);
                    obtain.writeStrongBinder(bVar != null ? bVar.asBinder() : null);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.t.transact(2, obtain, obtain2, 0) && b.O1() != null) {
                        b.O1().o0(bVar, bundle);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p7700g.p99005.d
            public void y0(com.p7700g.p99005.b bVar, String str, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.s);
                    obtain.writeStrongBinder(bVar != null ? bVar.asBinder() : null);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.t.transact(3, obtain, obtain2, 0) && b.O1() != null) {
                        b.O1().y0(bVar, str, bundle);
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

        public static d N1(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(s);
            if (queryLocalInterface != null && (queryLocalInterface instanceof d)) {
                return (d) queryLocalInterface;
            }
            return new a(iBinder);
        }

        public static d O1() {
            return a.s;
        }

        public static boolean P1(d dVar) {
            if (a.s == null) {
                if (dVar != null) {
                    a.s = dVar;
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
            if (i == 2) {
                parcel.enforceInterface(s);
                o0(b.AbstractBinderC0147b.N1(parcel.readStrongBinder()), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            } else if (i != 3) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString(s);
                return true;
            } else {
                parcel.enforceInterface(s);
                y0(b.AbstractBinderC0147b.N1(parcel.readStrongBinder()), parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            }
        }
    }

    void o0(com.p7700g.p99005.b bVar, Bundle bundle) throws RemoteException;

    void y0(com.p7700g.p99005.b bVar, String str, Bundle bundle) throws RemoteException;
}