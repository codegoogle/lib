package com.p7700g.p99005;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.p7700g.p99005.n40;

/* compiled from: IMultiInstanceInvalidationService.java */
/* loaded from: classes.dex */
public interface o40 extends IInterface {

    /* compiled from: IMultiInstanceInvalidationService.java */
    /* loaded from: classes.dex */
    public static abstract class a extends Binder implements o40 {
        private static final String s = "androidx.room.IMultiInstanceInvalidationService";
        public static final int t = 1;
        public static final int u = 2;
        public static final int v = 3;

        /* compiled from: IMultiInstanceInvalidationService.java */
        /* renamed from: com.p7700g.p99005.o40$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0223a implements o40 {
            private IBinder s;

            public C0223a(IBinder iBinder) {
                this.s = iBinder;
            }

            @Override // com.p7700g.p99005.o40
            public void E1(n40 n40Var, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.s);
                    obtain.writeStrongBinder(n40Var != null ? n40Var.asBinder() : null);
                    obtain.writeInt(i);
                    this.s.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String N1() {
                return a.s;
            }

            @Override // com.p7700g.p99005.o40
            public int Z(n40 n40Var, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.s);
                    obtain.writeStrongBinder(n40Var != null ? n40Var.asBinder() : null);
                    obtain.writeString(str);
                    this.s.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.s;
            }

            @Override // com.p7700g.p99005.o40
            public void y1(int i, String[] strArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.s);
                    obtain.writeInt(i);
                    obtain.writeStringArray(strArr);
                    this.s.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, s);
        }

        public static o40 N1(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(s);
            if (queryLocalInterface != null && (queryLocalInterface instanceof o40)) {
                return (o40) queryLocalInterface;
            }
            return new C0223a(iBinder);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface(s);
                int Z = Z(n40.a.N1(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(Z);
                return true;
            } else if (i == 2) {
                parcel.enforceInterface(s);
                E1(n40.a.N1(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                return true;
            } else if (i == 3) {
                parcel.enforceInterface(s);
                y1(parcel.readInt(), parcel.createStringArray());
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString(s);
                return true;
            }
        }
    }

    void E1(n40 n40Var, int i) throws RemoteException;

    int Z(n40 n40Var, String str) throws RemoteException;

    void y1(int i, String[] strArr) throws RemoteException;
}