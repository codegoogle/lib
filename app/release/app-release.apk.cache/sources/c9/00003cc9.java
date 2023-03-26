package com.p7700g.p99005;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.p7700g.p99005.bi3;

/* compiled from: IUCRService.java */
/* loaded from: classes3.dex */
public interface ci3 extends IInterface {

    /* compiled from: IUCRService.java */
    /* loaded from: classes3.dex */
    public static class a implements ci3 {
        @Override // com.p7700g.p99005.ci3
        public void D0(String str, String str2) throws RemoteException {
        }

        @Override // com.p7700g.p99005.ci3
        public void U0(String str, Bundle bundle, String str2, String str3, int i, bi3 bi3Var) throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.p7700g.p99005.ci3
        public void i0(String str) throws RemoteException {
        }
    }

    /* compiled from: IUCRService.java */
    /* loaded from: classes3.dex */
    public static abstract class b extends Binder implements ci3 {
        private static final String s = "com.northghost.ucr.IUCRService";
        public static final int t = 1;
        public static final int u = 2;
        public static final int v = 3;

        /* compiled from: IUCRService.java */
        /* loaded from: classes3.dex */
        public static class a implements ci3 {
            public static ci3 s;
            private IBinder t;

            public a(IBinder iBinder) {
                this.t = iBinder;
            }

            @Override // com.p7700g.p99005.ci3
            public void D0(String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.s);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (!this.t.transact(1, obtain, obtain2, 0) && b.O1() != null) {
                        b.O1().D0(str, str2);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String N1() {
                return b.s;
            }

            @Override // com.p7700g.p99005.ci3
            public void U0(String str, Bundle bundle, String str2, String str3, int i, bi3 bi3Var) throws RemoteException {
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
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    obtain.writeInt(i);
                    obtain.writeStrongBinder(bi3Var != null ? bi3Var.asBinder() : null);
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    if (!this.t.transact(3, obtain, obtain2, 0) && b.O1() != null) {
                        b.O1().U0(str, bundle, str2, str3, i, bi3Var);
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th2) {
                    th = th2;
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.t;
            }

            @Override // com.p7700g.p99005.ci3
            public void i0(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.s);
                    obtain.writeString(str);
                    if (!this.t.transact(2, obtain, obtain2, 0) && b.O1() != null) {
                        b.O1().i0(str);
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

        public static ci3 N1(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(s);
            if (queryLocalInterface != null && (queryLocalInterface instanceof ci3)) {
                return (ci3) queryLocalInterface;
            }
            return new a(iBinder);
        }

        public static ci3 O1() {
            return a.s;
        }

        public static boolean P1(ci3 ci3Var) {
            if (a.s == null) {
                if (ci3Var != null) {
                    a.s = ci3Var;
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
                D0(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            } else if (i == 2) {
                parcel.enforceInterface(s);
                i0(parcel.readString());
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
                U0(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString(), parcel.readInt(), bi3.b.N1(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
        }
    }

    void D0(String str, String str2) throws RemoteException;

    void U0(String str, Bundle bundle, String str2, String str3, int i, bi3 bi3Var) throws RemoteException;

    void i0(String str) throws RemoteException;
}