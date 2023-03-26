package com.p7700g.p99005;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: ITrustedWebActivityService.java */
/* loaded from: classes.dex */
public interface f extends IInterface {

    /* compiled from: ITrustedWebActivityService.java */
    /* loaded from: classes.dex */
    public static class a implements f {
        @Override // com.p7700g.p99005.f
        public int F0() throws RemoteException {
            return 0;
        }

        @Override // com.p7700g.p99005.f
        public Bundle I0() throws RemoteException {
            return null;
        }

        @Override // com.p7700g.p99005.f
        public Bundle M0(Bundle bundle) throws RemoteException {
            return null;
        }

        @Override // com.p7700g.p99005.f
        public Bundle N() throws RemoteException {
            return null;
        }

        @Override // com.p7700g.p99005.f
        public void a1(Bundle bundle) throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.p7700g.p99005.f
        public Bundle c1(Bundle bundle) throws RemoteException {
            return null;
        }

        @Override // com.p7700g.p99005.f
        public Bundle k0(String str, Bundle bundle, IBinder iBinder) throws RemoteException {
            return null;
        }
    }

    /* compiled from: ITrustedWebActivityService.java */
    /* loaded from: classes.dex */
    public static abstract class b extends Binder implements f {
        private static final String s = "android.support.customtabs.trusted.ITrustedWebActivityService";
        public static final int t = 6;
        public static final int u = 2;
        public static final int v = 3;
        public static final int w = 5;
        public static final int x = 4;
        public static final int y = 7;
        public static final int z = 9;

        /* compiled from: ITrustedWebActivityService.java */
        /* loaded from: classes.dex */
        public static class a implements f {
            public static f s;
            private IBinder t;

            public a(IBinder iBinder) {
                this.t = iBinder;
            }

            @Override // com.p7700g.p99005.f
            public int F0() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.s);
                    if (!this.t.transact(4, obtain, obtain2, 0) && b.O1() != null) {
                        return b.O1().F0();
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p7700g.p99005.f
            public Bundle I0() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.s);
                    if (!this.t.transact(7, obtain, obtain2, 0) && b.O1() != null) {
                        return b.O1().I0();
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p7700g.p99005.f
            public Bundle M0(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.s);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.t.transact(6, obtain, obtain2, 0) && b.O1() != null) {
                        return b.O1().M0(bundle);
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p7700g.p99005.f
            public Bundle N() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.s);
                    if (!this.t.transact(5, obtain, obtain2, 0) && b.O1() != null) {
                        return b.O1().N();
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String N1() {
                return b.s;
            }

            @Override // com.p7700g.p99005.f
            public void a1(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.s);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.t.transact(3, obtain, obtain2, 0) && b.O1() != null) {
                        b.O1().a1(bundle);
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

            @Override // com.p7700g.p99005.f
            public Bundle c1(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.s);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.t.transact(2, obtain, obtain2, 0) && b.O1() != null) {
                        return b.O1().c1(bundle);
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p7700g.p99005.f
            public Bundle k0(String str, Bundle bundle, IBinder iBinder) throws RemoteException {
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
                    obtain.writeStrongBinder(iBinder);
                    if (!this.t.transact(9, obtain, obtain2, 0) && b.O1() != null) {
                        return b.O1().k0(str, bundle, iBinder);
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public b() {
            attachInterface(this, s);
        }

        public static f N1(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(s);
            if (queryLocalInterface != null && (queryLocalInterface instanceof f)) {
                return (f) queryLocalInterface;
            }
            return new a(iBinder);
        }

        public static f O1() {
            return a.s;
        }

        public static boolean P1(f fVar) {
            if (a.s == null) {
                if (fVar != null) {
                    a.s = fVar;
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
            if (i == 9) {
                parcel.enforceInterface(s);
                Bundle k0 = k0(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, parcel.readStrongBinder());
                parcel2.writeNoException();
                if (k0 != null) {
                    parcel2.writeInt(1);
                    k0.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            } else if (i != 1598968902) {
                switch (i) {
                    case 2:
                        parcel.enforceInterface(s);
                        Bundle c1 = c1(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                        parcel2.writeNoException();
                        if (c1 != null) {
                            parcel2.writeInt(1);
                            c1.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 3:
                        parcel.enforceInterface(s);
                        a1(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                        parcel2.writeNoException();
                        return true;
                    case 4:
                        parcel.enforceInterface(s);
                        int F0 = F0();
                        parcel2.writeNoException();
                        parcel2.writeInt(F0);
                        return true;
                    case 5:
                        parcel.enforceInterface(s);
                        Bundle N = N();
                        parcel2.writeNoException();
                        if (N != null) {
                            parcel2.writeInt(1);
                            N.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 6:
                        parcel.enforceInterface(s);
                        Bundle M0 = M0(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                        parcel2.writeNoException();
                        if (M0 != null) {
                            parcel2.writeInt(1);
                            M0.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 7:
                        parcel.enforceInterface(s);
                        Bundle I0 = I0();
                        parcel2.writeNoException();
                        if (I0 != null) {
                            parcel2.writeInt(1);
                            I0.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                parcel2.writeString(s);
                return true;
            }
        }
    }

    int F0() throws RemoteException;

    Bundle I0() throws RemoteException;

    Bundle M0(Bundle bundle) throws RemoteException;

    Bundle N() throws RemoteException;

    void a1(Bundle bundle) throws RemoteException;

    Bundle c1(Bundle bundle) throws RemoteException;

    Bundle k0(String str, Bundle bundle, IBinder iBinder) throws RemoteException;
}