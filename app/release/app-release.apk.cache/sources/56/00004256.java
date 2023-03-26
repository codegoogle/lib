package com.p7700g.p99005;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.p7700g.p99005.hg0;

/* compiled from: IListenableWorkerImpl.java */
/* loaded from: classes.dex */
public interface fg0 extends IInterface {

    /* compiled from: IListenableWorkerImpl.java */
    /* loaded from: classes.dex */
    public static class a implements fg0 {
        @Override // com.p7700g.p99005.fg0
        public void O0(byte[] request, hg0 callback) throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.p7700g.p99005.fg0
        public void l0(byte[] request, hg0 callback) throws RemoteException {
        }
    }

    /* compiled from: IListenableWorkerImpl.java */
    /* loaded from: classes.dex */
    public static abstract class b extends Binder implements fg0 {
        private static final String s = "androidx.work.multiprocess.IListenableWorkerImpl";
        public static final int t = 1;
        public static final int u = 2;

        /* compiled from: IListenableWorkerImpl.java */
        /* loaded from: classes.dex */
        public static class a implements fg0 {
            public static fg0 s;
            private IBinder t;

            public a(IBinder remote) {
                this.t = remote;
            }

            public String N1() {
                return b.s;
            }

            @Override // com.p7700g.p99005.fg0
            public void O0(byte[] request, hg0 callback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.s);
                    obtain.writeByteArray(request);
                    obtain.writeStrongBinder(callback != null ? callback.asBinder() : null);
                    if (this.t.transact(2, obtain, null, 1) || b.O1() == null) {
                        return;
                    }
                    b.O1().O0(request, callback);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.t;
            }

            @Override // com.p7700g.p99005.fg0
            public void l0(byte[] request, hg0 callback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.s);
                    obtain.writeByteArray(request);
                    obtain.writeStrongBinder(callback != null ? callback.asBinder() : null);
                    if (this.t.transact(1, obtain, null, 1) || b.O1() == null) {
                        return;
                    }
                    b.O1().l0(request, callback);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public b() {
            attachInterface(this, s);
        }

        public static fg0 N1(IBinder obj) {
            if (obj == null) {
                return null;
            }
            IInterface queryLocalInterface = obj.queryLocalInterface(s);
            if (queryLocalInterface != null && (queryLocalInterface instanceof fg0)) {
                return (fg0) queryLocalInterface;
            }
            return new a(obj);
        }

        public static fg0 O1() {
            return a.s;
        }

        public static boolean P1(fg0 impl) {
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
            if (code == 1) {
                data.enforceInterface(s);
                l0(data.createByteArray(), hg0.b.N1(data.readStrongBinder()));
                return true;
            } else if (code == 2) {
                data.enforceInterface(s);
                O0(data.createByteArray(), hg0.b.N1(data.readStrongBinder()));
                return true;
            } else if (code != 1598968902) {
                return super.onTransact(code, data, reply, flags);
            } else {
                reply.writeString(s);
                return true;
            }
        }
    }

    void O0(byte[] request, hg0 callback) throws RemoteException;

    void l0(byte[] request, hg0 callback) throws RemoteException;
}