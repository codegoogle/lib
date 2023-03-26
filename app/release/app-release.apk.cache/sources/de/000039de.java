package com.p7700g.p99005;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: ICustomTabsCallback.java */
/* loaded from: classes.dex */
public interface b extends IInterface {

    /* compiled from: ICustomTabsCallback.java */
    /* loaded from: classes.dex */
    public static class a implements b {
        @Override // com.p7700g.p99005.b
        public void A1(Bundle bundle) throws RemoteException {
        }

        @Override // com.p7700g.p99005.b
        public void D1(int i, Uri uri, boolean z, Bundle bundle) throws RemoteException {
        }

        @Override // com.p7700g.p99005.b
        public void X0(String str, Bundle bundle) throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.p7700g.p99005.b
        public Bundle b0(String str, Bundle bundle) throws RemoteException {
            return null;
        }

        @Override // com.p7700g.p99005.b
        public void k1(int i, Bundle bundle) throws RemoteException {
        }

        @Override // com.p7700g.p99005.b
        public void w(String str, Bundle bundle) throws RemoteException {
        }
    }

    /* compiled from: ICustomTabsCallback.java */
    /* renamed from: com.p7700g.p99005.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC0147b extends Binder implements b {
        private static final String s = "android.support.customtabs.ICustomTabsCallback";
        public static final int t = 2;
        public static final int u = 3;
        public static final int v = 4;
        public static final int w = 5;
        public static final int x = 6;
        public static final int y = 7;

        /* compiled from: ICustomTabsCallback.java */
        /* renamed from: com.p7700g.p99005.b$b$a */
        /* loaded from: classes.dex */
        public static class a implements b {
            public static b s;
            private IBinder t;

            public a(IBinder iBinder) {
                this.t = iBinder;
            }

            @Override // com.p7700g.p99005.b
            public void A1(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0147b.s);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.t.transact(4, obtain, obtain2, 0) && AbstractBinderC0147b.O1() != null) {
                        AbstractBinderC0147b.O1().A1(bundle);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p7700g.p99005.b
            public void D1(int i, Uri uri, boolean z, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0147b.s);
                    obtain.writeInt(i);
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(z ? 1 : 0);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.t.transact(6, obtain, obtain2, 0) && AbstractBinderC0147b.O1() != null) {
                        AbstractBinderC0147b.O1().D1(i, uri, z, bundle);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String N1() {
                return AbstractBinderC0147b.s;
            }

            @Override // com.p7700g.p99005.b
            public void X0(String str, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0147b.s);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.t.transact(3, obtain, obtain2, 0) && AbstractBinderC0147b.O1() != null) {
                        AbstractBinderC0147b.O1().X0(str, bundle);
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

            @Override // com.p7700g.p99005.b
            public Bundle b0(String str, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0147b.s);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.t.transact(7, obtain, obtain2, 0) && AbstractBinderC0147b.O1() != null) {
                        return AbstractBinderC0147b.O1().b0(str, bundle);
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p7700g.p99005.b
            public void k1(int i, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0147b.s);
                    obtain.writeInt(i);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.t.transact(2, obtain, obtain2, 0) && AbstractBinderC0147b.O1() != null) {
                        AbstractBinderC0147b.O1().k1(i, bundle);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p7700g.p99005.b
            public void w(String str, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0147b.s);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.t.transact(5, obtain, obtain2, 0) && AbstractBinderC0147b.O1() != null) {
                        AbstractBinderC0147b.O1().w(str, bundle);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC0147b() {
            attachInterface(this, s);
        }

        public static b N1(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(s);
            if (queryLocalInterface != null && (queryLocalInterface instanceof b)) {
                return (b) queryLocalInterface;
            }
            return new a(iBinder);
        }

        public static b O1() {
            return a.s;
        }

        public static boolean P1(b bVar) {
            if (a.s == null) {
                if (bVar != null) {
                    a.s = bVar;
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
                        k1(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                        parcel2.writeNoException();
                        return true;
                    case 3:
                        parcel.enforceInterface(s);
                        X0(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                        parcel2.writeNoException();
                        return true;
                    case 4:
                        parcel.enforceInterface(s);
                        A1(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                        parcel2.writeNoException();
                        return true;
                    case 5:
                        parcel.enforceInterface(s);
                        w(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                        parcel2.writeNoException();
                        return true;
                    case 6:
                        parcel.enforceInterface(s);
                        D1(parcel.readInt(), parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                        parcel2.writeNoException();
                        return true;
                    case 7:
                        parcel.enforceInterface(s);
                        Bundle b0 = b0(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                        parcel2.writeNoException();
                        if (b0 != null) {
                            parcel2.writeInt(1);
                            b0.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            }
            parcel2.writeString(s);
            return true;
        }
    }

    void A1(Bundle bundle) throws RemoteException;

    void D1(int i, Uri uri, boolean z, Bundle bundle) throws RemoteException;

    void X0(String str, Bundle bundle) throws RemoteException;

    Bundle b0(String str, Bundle bundle) throws RemoteException;

    void k1(int i, Bundle bundle) throws RemoteException;

    void w(String str, Bundle bundle) throws RemoteException;
}