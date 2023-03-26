package android.support.v4.app;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public interface INotificationSideChannel extends IInterface {

    /* loaded from: classes.dex */
    public static class Default implements INotificationSideChannel {
        @Override // android.support.v4.app.INotificationSideChannel
        public void C1(String str, int i, String str2, Notification notification) throws RemoteException {
        }

        @Override // android.support.v4.app.INotificationSideChannel
        public void L0(String str, int i, String str2) throws RemoteException {
        }

        @Override // android.support.v4.app.INotificationSideChannel
        public void Y(String str) throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class Stub extends Binder implements INotificationSideChannel {
        private static final String s = "android.support.v4.app.INotificationSideChannel";
        public static final int t = 1;
        public static final int u = 2;
        public static final int v = 3;

        /* loaded from: classes.dex */
        public static class a implements INotificationSideChannel {
            public static INotificationSideChannel s;
            private IBinder t;

            public a(IBinder iBinder) {
                this.t = iBinder;
            }

            @Override // android.support.v4.app.INotificationSideChannel
            public void C1(String str, int i, String str2, Notification notification) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.s);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeString(str2);
                    if (notification != null) {
                        obtain.writeInt(1);
                        notification.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.t.transact(1, obtain, null, 1) || Stub.O1() == null) {
                        return;
                    }
                    Stub.O1().C1(str, i, str2, notification);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.app.INotificationSideChannel
            public void L0(String str, int i, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.s);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeString(str2);
                    if (this.t.transact(2, obtain, null, 1) || Stub.O1() == null) {
                        return;
                    }
                    Stub.O1().L0(str, i, str2);
                } finally {
                    obtain.recycle();
                }
            }

            public String N1() {
                return Stub.s;
            }

            @Override // android.support.v4.app.INotificationSideChannel
            public void Y(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.s);
                    obtain.writeString(str);
                    if (this.t.transact(3, obtain, null, 1) || Stub.O1() == null) {
                        return;
                    }
                    Stub.O1().Y(str);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.t;
            }
        }

        public Stub() {
            attachInterface(this, s);
        }

        public static INotificationSideChannel N1(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(s);
            if (queryLocalInterface != null && (queryLocalInterface instanceof INotificationSideChannel)) {
                return (INotificationSideChannel) queryLocalInterface;
            }
            return new a(iBinder);
        }

        public static INotificationSideChannel O1() {
            return a.s;
        }

        public static boolean P1(INotificationSideChannel iNotificationSideChannel) {
            if (a.s == null) {
                if (iNotificationSideChannel != null) {
                    a.s = iNotificationSideChannel;
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
                C1(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt() != 0 ? (Notification) Notification.CREATOR.createFromParcel(parcel) : null);
                return true;
            } else if (i == 2) {
                parcel.enforceInterface(s);
                L0(parcel.readString(), parcel.readInt(), parcel.readString());
                return true;
            } else if (i == 3) {
                parcel.enforceInterface(s);
                Y(parcel.readString());
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString(s);
                return true;
            }
        }
    }

    void C1(String str, int i, String str2, Notification notification) throws RemoteException;

    void L0(String str, int i, String str2) throws RemoteException;

    void Y(String str) throws RemoteException;
}