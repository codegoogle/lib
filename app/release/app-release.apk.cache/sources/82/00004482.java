package com.p7700g.p99005;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.p7700g.p99005.hg0;

/* compiled from: IWorkManagerImpl.java */
/* loaded from: classes.dex */
public interface gg0 extends IInterface {

    /* compiled from: IWorkManagerImpl.java */
    /* loaded from: classes.dex */
    public static class a implements gg0 {
        @Override // com.p7700g.p99005.gg0
        public void H1(byte[] request, hg0 callback) throws RemoteException {
        }

        @Override // com.p7700g.p99005.gg0
        public void I(String name, hg0 callback) throws RemoteException {
        }

        @Override // com.p7700g.p99005.gg0
        public void M1(byte[] request, hg0 callback) throws RemoteException {
        }

        @Override // com.p7700g.p99005.gg0
        public void P(byte[] request, hg0 callback) throws RemoteException {
        }

        @Override // com.p7700g.p99005.gg0
        public void T(hg0 callback) throws RemoteException {
        }

        @Override // com.p7700g.p99005.gg0
        public void W0(String id, hg0 callback) throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.p7700g.p99005.gg0
        public void x0(byte[] request, hg0 callback) throws RemoteException {
        }

        @Override // com.p7700g.p99005.gg0
        public void x1(String tag, hg0 callback) throws RemoteException {
        }
    }

    /* compiled from: IWorkManagerImpl.java */
    /* loaded from: classes.dex */
    public static abstract class b extends Binder implements gg0 {
        public static final int A = 8;
        private static final String s = "androidx.work.multiprocess.IWorkManagerImpl";
        public static final int t = 1;
        public static final int u = 2;
        public static final int v = 3;
        public static final int w = 4;
        public static final int x = 5;
        public static final int y = 6;
        public static final int z = 7;

        /* compiled from: IWorkManagerImpl.java */
        /* loaded from: classes.dex */
        public static class a implements gg0 {
            public static gg0 s;
            private IBinder t;

            public a(IBinder remote) {
                this.t = remote;
            }

            @Override // com.p7700g.p99005.gg0
            public void H1(byte[] request, hg0 callback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.s);
                    obtain.writeByteArray(request);
                    obtain.writeStrongBinder(callback != null ? callback.asBinder() : null);
                    if (this.t.transact(8, obtain, null, 1) || b.O1() == null) {
                        return;
                    }
                    b.O1().H1(request, callback);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.p7700g.p99005.gg0
            public void I(String name, hg0 callback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.s);
                    obtain.writeString(name);
                    obtain.writeStrongBinder(callback != null ? callback.asBinder() : null);
                    if (this.t.transact(5, obtain, null, 1) || b.O1() == null) {
                        return;
                    }
                    b.O1().I(name, callback);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.p7700g.p99005.gg0
            public void M1(byte[] request, hg0 callback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.s);
                    obtain.writeByteArray(request);
                    obtain.writeStrongBinder(callback != null ? callback.asBinder() : null);
                    if (this.t.transact(2, obtain, null, 1) || b.O1() == null) {
                        return;
                    }
                    b.O1().M1(request, callback);
                } finally {
                    obtain.recycle();
                }
            }

            public String N1() {
                return b.s;
            }

            @Override // com.p7700g.p99005.gg0
            public void P(byte[] request, hg0 callback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.s);
                    obtain.writeByteArray(request);
                    obtain.writeStrongBinder(callback != null ? callback.asBinder() : null);
                    if (this.t.transact(1, obtain, null, 1) || b.O1() == null) {
                        return;
                    }
                    b.O1().P(request, callback);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.p7700g.p99005.gg0
            public void T(hg0 callback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.s);
                    obtain.writeStrongBinder(callback != null ? callback.asBinder() : null);
                    if (this.t.transact(6, obtain, null, 1) || b.O1() == null) {
                        return;
                    }
                    b.O1().T(callback);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.p7700g.p99005.gg0
            public void W0(String id, hg0 callback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.s);
                    obtain.writeString(id);
                    obtain.writeStrongBinder(callback != null ? callback.asBinder() : null);
                    if (this.t.transact(3, obtain, null, 1) || b.O1() == null) {
                        return;
                    }
                    b.O1().W0(id, callback);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.t;
            }

            @Override // com.p7700g.p99005.gg0
            public void x0(byte[] request, hg0 callback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.s);
                    obtain.writeByteArray(request);
                    obtain.writeStrongBinder(callback != null ? callback.asBinder() : null);
                    if (this.t.transact(7, obtain, null, 1) || b.O1() == null) {
                        return;
                    }
                    b.O1().x0(request, callback);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.p7700g.p99005.gg0
            public void x1(String tag, hg0 callback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.s);
                    obtain.writeString(tag);
                    obtain.writeStrongBinder(callback != null ? callback.asBinder() : null);
                    if (this.t.transact(4, obtain, null, 1) || b.O1() == null) {
                        return;
                    }
                    b.O1().x1(tag, callback);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public b() {
            attachInterface(this, s);
        }

        public static gg0 N1(IBinder obj) {
            if (obj == null) {
                return null;
            }
            IInterface queryLocalInterface = obj.queryLocalInterface(s);
            if (queryLocalInterface != null && (queryLocalInterface instanceof gg0)) {
                return (gg0) queryLocalInterface;
            }
            return new a(obj);
        }

        public static gg0 O1() {
            return a.s;
        }

        public static boolean P1(gg0 impl) {
            if (a.s == null) {
                if (impl != null) {
                    a.s = impl;
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
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            if (code != 1598968902) {
                switch (code) {
                    case 1:
                        data.enforceInterface(s);
                        P(data.createByteArray(), hg0.b.N1(data.readStrongBinder()));
                        return true;
                    case 2:
                        data.enforceInterface(s);
                        M1(data.createByteArray(), hg0.b.N1(data.readStrongBinder()));
                        return true;
                    case 3:
                        data.enforceInterface(s);
                        W0(data.readString(), hg0.b.N1(data.readStrongBinder()));
                        return true;
                    case 4:
                        data.enforceInterface(s);
                        x1(data.readString(), hg0.b.N1(data.readStrongBinder()));
                        return true;
                    case 5:
                        data.enforceInterface(s);
                        I(data.readString(), hg0.b.N1(data.readStrongBinder()));
                        return true;
                    case 6:
                        data.enforceInterface(s);
                        T(hg0.b.N1(data.readStrongBinder()));
                        return true;
                    case 7:
                        data.enforceInterface(s);
                        x0(data.createByteArray(), hg0.b.N1(data.readStrongBinder()));
                        return true;
                    case 8:
                        data.enforceInterface(s);
                        H1(data.createByteArray(), hg0.b.N1(data.readStrongBinder()));
                        return true;
                    default:
                        return super.onTransact(code, data, reply, flags);
                }
            }
            reply.writeString(s);
            return true;
        }
    }

    void H1(byte[] request, hg0 callback) throws RemoteException;

    void I(String name, hg0 callback) throws RemoteException;

    void M1(byte[] request, hg0 callback) throws RemoteException;

    void P(byte[] request, hg0 callback) throws RemoteException;

    void T(hg0 callback) throws RemoteException;

    void W0(String id, hg0 callback) throws RemoteException;

    void x0(byte[] request, hg0 callback) throws RemoteException;

    void x1(String tag, hg0 callback) throws RemoteException;
}