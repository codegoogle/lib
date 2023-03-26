package com.p7700g.p99005;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.p7700g.p99005.b;
import java.util.List;

/* compiled from: ICustomTabsService.java */
/* loaded from: classes.dex */
public interface c extends IInterface {

    /* compiled from: ICustomTabsService.java */
    /* loaded from: classes.dex */
    public static class a implements c {
        @Override // com.p7700g.p99005.c
        public boolean F(com.p7700g.p99005.b bVar, Uri uri, Bundle bundle, List<Bundle> list) throws RemoteException {
            return false;
        }

        @Override // com.p7700g.p99005.c
        public boolean J(com.p7700g.p99005.b bVar, int i, Uri uri, Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // com.p7700g.p99005.c
        public int N0(com.p7700g.p99005.b bVar, String str, Bundle bundle) throws RemoteException {
            return 0;
        }

        @Override // com.p7700g.p99005.c
        public boolean Q0(com.p7700g.p99005.b bVar) throws RemoteException {
            return false;
        }

        @Override // com.p7700g.p99005.c
        public boolean S0(com.p7700g.p99005.b bVar, Uri uri, Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // com.p7700g.p99005.c
        public boolean U(com.p7700g.p99005.b bVar, Uri uri, int i, Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // com.p7700g.p99005.c
        public boolean V0(com.p7700g.p99005.b bVar, Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.p7700g.p99005.c
        public Bundle d0(String str, Bundle bundle) throws RemoteException {
            return null;
        }

        @Override // com.p7700g.p99005.c
        public boolean g1(com.p7700g.p99005.b bVar, Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // com.p7700g.p99005.c
        public boolean n1(com.p7700g.p99005.b bVar, Uri uri) throws RemoteException {
            return false;
        }

        @Override // com.p7700g.p99005.c
        public boolean v0(long j) throws RemoteException {
            return false;
        }
    }

    /* compiled from: ICustomTabsService.java */
    /* loaded from: classes.dex */
    public static abstract class b extends Binder implements c {
        public static final int A = 11;
        public static final int B = 8;
        public static final int C = 9;
        public static final int D = 12;
        private static final String s = "android.support.customtabs.ICustomTabsService";
        public static final int t = 2;
        public static final int u = 3;
        public static final int v = 10;
        public static final int w = 4;
        public static final int x = 5;
        public static final int y = 6;
        public static final int z = 7;

        /* compiled from: ICustomTabsService.java */
        /* loaded from: classes.dex */
        public static class a implements c {
            public static c s;
            private IBinder t;

            public a(IBinder iBinder) {
                this.t = iBinder;
            }

            @Override // com.p7700g.p99005.c
            public boolean F(com.p7700g.p99005.b bVar, Uri uri, Bundle bundle, List<Bundle> list) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.s);
                    obtain.writeStrongBinder(bVar != null ? bVar.asBinder() : null);
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeTypedList(list);
                    if (!this.t.transact(4, obtain, obtain2, 0) && b.O1() != null) {
                        return b.O1().F(bVar, uri, bundle, list);
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p7700g.p99005.c
            public boolean J(com.p7700g.p99005.b bVar, int i, Uri uri, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.s);
                    obtain.writeStrongBinder(bVar != null ? bVar.asBinder() : null);
                    obtain.writeInt(i);
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.t.transact(9, obtain, obtain2, 0) && b.O1() != null) {
                        return b.O1().J(bVar, i, uri, bundle);
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p7700g.p99005.c
            public int N0(com.p7700g.p99005.b bVar, String str, Bundle bundle) throws RemoteException {
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
                    if (!this.t.transact(8, obtain, obtain2, 0) && b.O1() != null) {
                        return b.O1().N0(bVar, str, bundle);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String N1() {
                return b.s;
            }

            @Override // com.p7700g.p99005.c
            public boolean Q0(com.p7700g.p99005.b bVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.s);
                    obtain.writeStrongBinder(bVar != null ? bVar.asBinder() : null);
                    if (!this.t.transact(3, obtain, obtain2, 0) && b.O1() != null) {
                        return b.O1().Q0(bVar);
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p7700g.p99005.c
            public boolean S0(com.p7700g.p99005.b bVar, Uri uri, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.s);
                    obtain.writeStrongBinder(bVar != null ? bVar.asBinder() : null);
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.t.transact(11, obtain, obtain2, 0) && b.O1() != null) {
                        return b.O1().S0(bVar, uri, bundle);
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p7700g.p99005.c
            public boolean U(com.p7700g.p99005.b bVar, Uri uri, int i, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.s);
                    obtain.writeStrongBinder(bVar != null ? bVar.asBinder() : null);
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.t.transact(12, obtain, obtain2, 0) && b.O1() != null) {
                        return b.O1().U(bVar, uri, i, bundle);
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p7700g.p99005.c
            public boolean V0(com.p7700g.p99005.b bVar, Bundle bundle) throws RemoteException {
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
                    if (!this.t.transact(10, obtain, obtain2, 0) && b.O1() != null) {
                        return b.O1().V0(bVar, bundle);
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.t;
            }

            @Override // com.p7700g.p99005.c
            public Bundle d0(String str, Bundle bundle) throws RemoteException {
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
                    if (!this.t.transact(5, obtain, obtain2, 0) && b.O1() != null) {
                        return b.O1().d0(str, bundle);
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p7700g.p99005.c
            public boolean g1(com.p7700g.p99005.b bVar, Bundle bundle) throws RemoteException {
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
                    if (!this.t.transact(6, obtain, obtain2, 0) && b.O1() != null) {
                        return b.O1().g1(bVar, bundle);
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p7700g.p99005.c
            public boolean n1(com.p7700g.p99005.b bVar, Uri uri) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.s);
                    obtain.writeStrongBinder(bVar != null ? bVar.asBinder() : null);
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.t.transact(7, obtain, obtain2, 0) && b.O1() != null) {
                        return b.O1().n1(bVar, uri);
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p7700g.p99005.c
            public boolean v0(long j) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.s);
                    obtain.writeLong(j);
                    if (!this.t.transact(2, obtain, obtain2, 0) && b.O1() != null) {
                        return b.O1().v0(j);
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public b() {
            attachInterface(this, s);
        }

        public static c N1(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(s);
            if (queryLocalInterface != null && (queryLocalInterface instanceof c)) {
                return (c) queryLocalInterface;
            }
            return new a(iBinder);
        }

        public static c O1() {
            return a.s;
        }

        public static boolean P1(c cVar) {
            if (a.s == null) {
                if (cVar != null) {
                    a.s = cVar;
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
            if (i != 1598968902) {
                switch (i) {
                    case 2:
                        parcel.enforceInterface(s);
                        boolean v0 = v0(parcel.readLong());
                        parcel2.writeNoException();
                        parcel2.writeInt(v0 ? 1 : 0);
                        return true;
                    case 3:
                        parcel.enforceInterface(s);
                        boolean Q0 = Q0(b.AbstractBinderC0147b.N1(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        parcel2.writeInt(Q0 ? 1 : 0);
                        return true;
                    case 4:
                        parcel.enforceInterface(s);
                        boolean F = F(b.AbstractBinderC0147b.N1(parcel.readStrongBinder()), parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, parcel.createTypedArrayList(Bundle.CREATOR));
                        parcel2.writeNoException();
                        parcel2.writeInt(F ? 1 : 0);
                        return true;
                    case 5:
                        parcel.enforceInterface(s);
                        Bundle d0 = d0(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                        parcel2.writeNoException();
                        if (d0 != null) {
                            parcel2.writeInt(1);
                            d0.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 6:
                        parcel.enforceInterface(s);
                        boolean g1 = g1(b.AbstractBinderC0147b.N1(parcel.readStrongBinder()), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                        parcel2.writeNoException();
                        parcel2.writeInt(g1 ? 1 : 0);
                        return true;
                    case 7:
                        parcel.enforceInterface(s);
                        boolean n1 = n1(b.AbstractBinderC0147b.N1(parcel.readStrongBinder()), parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null);
                        parcel2.writeNoException();
                        parcel2.writeInt(n1 ? 1 : 0);
                        return true;
                    case 8:
                        parcel.enforceInterface(s);
                        int N0 = N0(b.AbstractBinderC0147b.N1(parcel.readStrongBinder()), parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                        parcel2.writeNoException();
                        parcel2.writeInt(N0);
                        return true;
                    case 9:
                        parcel.enforceInterface(s);
                        boolean J = J(b.AbstractBinderC0147b.N1(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                        parcel2.writeNoException();
                        parcel2.writeInt(J ? 1 : 0);
                        return true;
                    case 10:
                        parcel.enforceInterface(s);
                        boolean V0 = V0(b.AbstractBinderC0147b.N1(parcel.readStrongBinder()), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                        parcel2.writeNoException();
                        parcel2.writeInt(V0 ? 1 : 0);
                        return true;
                    case 11:
                        parcel.enforceInterface(s);
                        boolean S0 = S0(b.AbstractBinderC0147b.N1(parcel.readStrongBinder()), parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                        parcel2.writeNoException();
                        parcel2.writeInt(S0 ? 1 : 0);
                        return true;
                    case 12:
                        parcel.enforceInterface(s);
                        boolean U = U(b.AbstractBinderC0147b.N1(parcel.readStrongBinder()), parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                        parcel2.writeNoException();
                        parcel2.writeInt(U ? 1 : 0);
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            }
            parcel2.writeString(s);
            return true;
        }
    }

    boolean F(com.p7700g.p99005.b bVar, Uri uri, Bundle bundle, List<Bundle> list) throws RemoteException;

    boolean J(com.p7700g.p99005.b bVar, int i, Uri uri, Bundle bundle) throws RemoteException;

    int N0(com.p7700g.p99005.b bVar, String str, Bundle bundle) throws RemoteException;

    boolean Q0(com.p7700g.p99005.b bVar) throws RemoteException;

    boolean S0(com.p7700g.p99005.b bVar, Uri uri, Bundle bundle) throws RemoteException;

    boolean U(com.p7700g.p99005.b bVar, Uri uri, int i, Bundle bundle) throws RemoteException;

    boolean V0(com.p7700g.p99005.b bVar, Bundle bundle) throws RemoteException;

    Bundle d0(String str, Bundle bundle) throws RemoteException;

    boolean g1(com.p7700g.p99005.b bVar, Bundle bundle) throws RemoteException;

    boolean n1(com.p7700g.p99005.b bVar, Uri uri) throws RemoteException;

    boolean v0(long j) throws RemoteException;
}