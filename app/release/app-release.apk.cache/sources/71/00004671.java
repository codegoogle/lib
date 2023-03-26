package com.p7700g.p99005;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: IWorkManagerImplCallback.java */
/* loaded from: classes.dex */
public interface hg0 extends IInterface {

    /* compiled from: IWorkManagerImplCallback.java */
    /* loaded from: classes.dex */
    public static class a implements hg0 {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.p7700g.p99005.hg0
        public void onFailure(String error) throws RemoteException {
        }

        @Override // com.p7700g.p99005.hg0
        public void p1(byte[] response) throws RemoteException {
        }
    }

    /* compiled from: IWorkManagerImplCallback.java */
    /* loaded from: classes.dex */
    public static abstract class b extends Binder implements hg0 {
        private static final String s = "androidx.work.multiprocess.IWorkManagerImplCallback";
        public static final int t = 1;
        public static final int u = 2;

        /* compiled from: IWorkManagerImplCallback.java */
        /* loaded from: classes.dex */
        public static class a implements hg0 {
            public static hg0 s;
            private IBinder t;

            public a(IBinder remote) {
                this.t = remote;
            }

            public String N1() {
                return b.s;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.t;
            }

            @Override // com.p7700g.p99005.hg0
            public void onFailure(String error) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.s);
                    obtain.writeString(error);
                    if (this.t.transact(2, obtain, null, 1) || b.O1() == null) {
                        return;
                    }
                    b.O1().onFailure(error);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.p7700g.p99005.hg0
            public void p1(byte[] response) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.s);
                    obtain.writeByteArray(response);
                    if (this.t.transact(1, obtain, null, 1) || b.O1() == null) {
                        return;
                    }
                    b.O1().p1(response);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public b() {
            attachInterface(this, s);
        }

        public static hg0 N1(IBinder obj) {
            if (obj == null) {
                return null;
            }
            IInterface queryLocalInterface = obj.queryLocalInterface(s);
            if (queryLocalInterface != null && (queryLocalInterface instanceof hg0)) {
                return (hg0) queryLocalInterface;
            }
            return new a(obj);
        }

        public static hg0 O1() {
            return a.s;
        }

        public static boolean P1(hg0 impl) {
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
                p1(data.createByteArray());
                return true;
            } else if (code == 2) {
                data.enforceInterface(s);
                onFailure(data.readString());
                return true;
            } else if (code != 1598968902) {
                return super.onTransact(code, data, reply, flags);
            } else {
                reply.writeString(s);
                return true;
            }
        }
    }

    void onFailure(String error) throws RemoteException;

    void p1(byte[] response) throws RemoteException;
}