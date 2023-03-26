package android.support.v4.os;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public interface IResultReceiver extends IInterface {

    /* loaded from: classes.dex */
    public static class Default implements IResultReceiver {
        @Override // android.support.v4.os.IResultReceiver
        public void K1(int i, Bundle bundle) throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class Stub extends Binder implements IResultReceiver {
        private static final String s = "android.support.v4.os.IResultReceiver";
        public static final int t = 1;

        /* loaded from: classes.dex */
        public static class a implements IResultReceiver {
            public static IResultReceiver s;
            private IBinder t;

            public a(IBinder iBinder) {
                this.t = iBinder;
            }

            @Override // android.support.v4.os.IResultReceiver
            public void K1(int i, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.s);
                    obtain.writeInt(i);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.t.transact(1, obtain, null, 1) || Stub.O1() == null) {
                        return;
                    }
                    Stub.O1().K1(i, bundle);
                } finally {
                    obtain.recycle();
                }
            }

            public String N1() {
                return Stub.s;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.t;
            }
        }

        public Stub() {
            attachInterface(this, s);
        }

        public static IResultReceiver N1(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(s);
            if (queryLocalInterface != null && (queryLocalInterface instanceof IResultReceiver)) {
                return (IResultReceiver) queryLocalInterface;
            }
            return new a(iBinder);
        }

        public static IResultReceiver O1() {
            return a.s;
        }

        public static boolean P1(IResultReceiver iResultReceiver) {
            if (a.s == null) {
                if (iResultReceiver != null) {
                    a.s = iResultReceiver;
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
                K1(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString(s);
                return true;
            }
        }
    }

    void K1(int i, Bundle bundle) throws RemoteException;
}